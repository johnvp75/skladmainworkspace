
import java.lang.Exception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Stack;
import javax.swing.JOptionPane;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ArchiveDialog.java
 *
 * Created on Apr 3, 2012, 9:23:08 AM
 */
/**
 *
 * @author Main
 */
public class ArchiveDialog extends javax.swing.JDialog {

    /** Creates new form ArchiveDialog */
    public ArchiveDialog(java.awt.Frame parent, boolean modal, String manager) {
        super(parent, modal);
        this.manager=manager;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dayForArc = new com.toedter.calendar.JDateChooser();
        startArc = new javax.swing.JButton();
        closeDlg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Архивирование данных на дату");

        jLabel2.setText("Дата архивирование (не включая):");

        dayForArc.setDateFormatString("dd.MM.yyyy");
        dayForArc.setMaxSelectableDate(new java.util.Date(4102441302000L));
        dayForArc.setMinSelectableDate(new java.util.Date(1230764502000L));
        dayForArc.setDate((new java.util.GregorianCalendar()).getTime());

        startArc.setText("Начать");
        startArc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startArcActionPerformed(evt);
            }
        });

        closeDlg.setText("Отмена");
        closeDlg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeDlgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(dayForArc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(startArc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(closeDlg)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dayForArc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeDlg)
                    .addComponent(startArc))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDlgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeDlgActionPerformed

    private void startArcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startArcActionPerformed
        if (!initDate() || !lockTable()){
            return;
        }

        try{
            boolean sucssesCommit=true;
            prepareAndSaveRest();
            copyAndDeleteLines();
            copyAndDeleteDocuments();
            try{
                pgDataSet.commit();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ошибка commit для архива!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                sucssesCommit=false;
                e.printStackTrace();
                pgDataSet.rollback();
                DataSet.rollback();
            }
            if (sucssesCommit){
            try{
                pgDataSet.commit();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ошибка commit для основной базы!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                pgDataSet.UpdateQuery("delete from lines_arc");
                pgDataSet.UpdateQuery("delete from doc_arc");
                pgDataSet.commit();
                DataSet.rollback();
                }
            }
            pgDataSet.close();
            JOptionPane.showMessageDialog(null, "Архивирование завершено удачно", "Ok!", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ошибка архивирования!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            try{
                DataSet.rollback();
                pgDataSet.rollback();
            }catch(Exception e1){
                e1.printStackTrace();
            }
        }
    }//GEN-LAST:event_startArcActionPerformed

    private boolean initDate(){
        setDayArc(new GregorianCalendar(1970, 0, 1));
        try{
            int addDayArc=(new Long(dayForArc.getDate().getTime()/1000/60/60/24)).intValue()+1;

            dayArc.add(java.util.Calendar.DAY_OF_YEAR, addDayArc);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Введите корректную дату!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
        if (JOptionPane.showConfirmDialog(null, String.format("Архивировать всю информацию до %1$td.%1$tm.%1$tY? ", getDayArc()), "Подтверждение", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return false;
        };
        if (JOptionPane.showConfirmDialog(null, String.format("Внимание! После архивирования вся информация до %1$td.%1$tm.%1$tY будет не доступна. \n Продолжить? ", getDayArc()), "Подтверждение", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return false;
        };
        if (JOptionPane.showConfirmDialog(null, "Внимание! Во время архивации доступ к базе будет заблокирован!. \n Продолжить? ", "Подтверждение", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return false;
        };

        return true;
        
    }
    
    private Boolean lockTable(){
        try{
            DataSet.UpdateQuery("lock table document in exclusive mode nowait");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "База занята!", "Ошибка блокировки!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    private void prepareAndSaveRest() throws Exception{
        int id_doc;
        ResultSet rs=DataSet.QueryExec("select max(id_doc)+1 from document", false);
        rs.next();
        id_doc=rs.getInt(1);
        Stack<Integer> allId_skl = new Stack<Integer>();
        rs=DataSet.QueryExec("select id_skl from sklad", false);
        while (rs.next()){
            allId_skl.push(rs.getInt(1));
        }
        int id_skl=0;
        int id_manager;
        String SQL=String.format("select id_manager from manager where name = '%s'", getManager());
        rs=DataSet.QueryExec(SQL, false);
        if (rs.next()){
            id_manager=rs.getInt(1);
        }else{
            throw new Exception("Manager absent");
        }
        int id_client;
        rs=DataSet.QueryExec("Select id_client from client where name='Ввод остатков'", false);
        if (rs.next()){
            id_client=rs.getInt(1);
        }else{
            throw new Exception("Client absent");
        }
        while (!allId_skl.empty()){
            id_skl=allId_skl.pop();
            SQL=String.format("Insert into document (id_doc,id_type_doc,id_client,id_skl,id_manager,id_val,numb,day,disc) values (%s,11,%s,%s,%s,21,0,to_date('%5$td.%5$tm.%5$tY','DD.MM.YYYY'),0)", id_doc,id_client,id_skl,id_manager,getDayArc());
            DataSet.UpdateQuery(SQL);
            SQL=String.format("Insert into lines (id_tovar,id_doc,kol,cost,disc) select * from (select l.id_tovar, %s as id_doc, sum(l.kol*decode(t.operacia,1,1,2,-1)) as kol, 0 as cost,0 as disc  from lines l, document d, type_doc t where l.id_doc=d.id_doc and d.id_skl=%s and d.day<to_date('%3$td.%3$tm.%3$tY','DD.MM.YYYY') and d.id_type_doc=t.id_type_doc group by l.id_tovar, d.id_skl) where kol!=0", id_doc,id_skl,getDayArc());
            DataSet.UpdateQuery(SQL);
            id_doc++;
        }
        
    }
    
    private void copyAndDeleteLines() throws Exception{
        String SQL=String.format("select id_tovar, id_doc, kol, cost, disc from lines where id_doc in (select id_doc from document where day<to_date('%1$td.%1$tm.%1$tY','DD.MM.YYYY'))", getDayArc());
        ResultSet rsOracle=DataSet.QueryExec(SQL, false);
        while (rsOracle.next()){
            SQL=String.format("insert into lines_arc (id_tovar, id_doc, kol, cost, disc) values (%s, %s, %s, %s, %s)", rsOracle.getString(1), rsOracle.getString(2), rsOracle.getString(3), rsOracle.getString(4), rsOracle.getString(5));
            pgDataSet.UpdateQuery(SQL);
        }
        SQL=String.format("delete from lines where id_doc in (select id_doc from document where day<to_date('%1$td.%1$tm.%1$tY','DD.MM.YYYY'))", getDayArc());
        DataSet.UpdateQuery(SQL);
    }
    
    private void copyAndDeleteDocuments() throws Exception{
        String SQL=String.format("select id_doc, id_type_doc, id_client, id_skl, id_manager, id_val, numb, day, sum, note, disc, id_price, numb1 from document where day<to_date('%1$td.%1$tm.%1$tY','DD.MM.YYYY')", getDayArc());
        ResultSet rsOracle=DataSet.QueryExec(SQL, false);
        while (rsOracle.next()){
            SQL=String.format("insert into doc_arc (id_doc, id_type_doc, id_client, id_skl, id_manager, id_val, numb, day, sum, note, disc, id_price, numb1) values (%s, %s, %s, %s, %s, %s, %s, '%s', %s, '%s', %s, %s, %s)"
                    , rsOracle.getString(1), rsOracle.getString(2), rsOracle.getString(3), rsOracle.getString(4), rsOracle.getString(5)
                    , rsOracle.getString(6), rsOracle.getString(7), rsOracle.getString(8), rsOracle.getString(9), rsOracle.getString(10)
                    , rsOracle.getString(11), rsOracle.getString(12), rsOracle.getString(13));
            pgDataSet.UpdateQuery(SQL);
        }
        SQL=String.format("delete from from document where day<to_date('%1$td.%1$tm.%1$tY','DD.MM.YYYY')", getDayArc());
        DataSet.UpdateQuery(SQL);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeDlg;
    private com.toedter.calendar.JDateChooser dayForArc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton startArc;
    // End of variables declaration//GEN-END:variables
    private GregorianCalendar dayArc;
    private String manager;

    public String getManager() {
        return manager;
    }


    public GregorianCalendar getDayArc() {
        return dayArc;
    }

    public void setDayArc(GregorianCalendar dayArc) {
        this.dayArc = dayArc;
    }

}
class pgDataSet{
	private static Connection cn=null;
	private static Statement st = null;
	private static int retstr=0;
        private static String driver = "org.postgresql.Driver";
        private static String url = "jdbc:postgresql://192.168.1.2:5432/SkladArc";
        private static String username = "remote";
        private static String password = "lkjfsd1sadAS46sdaSAS65dldjdandsadcvh";

	public static int UpdateQuery(String aValue) throws SQLException{
		retstr=0;
		if (cn==null)
			try {
				Locale.setDefault(Locale.ENGLISH);
				Class.forName(driver);
				cn = DriverManager.getConnection(url,username,password);
				cn.setAutoCommit(false);
			}
			catch (Exception e) { e.printStackTrace();}
			if (st==null){

			try {
				st = cn.createStatement();
			} catch (SQLException e) {
				throw e;
			}
		}

		try { 
			retstr=st.executeUpdate(aValue);
			
		}
		catch (SQLException e) { throw e;}
		return retstr;
	}
	public static void commit() throws SQLException{
		if (!(cn==null)){
			try {
				cn.commit();
			} catch (SQLException e) {
				throw e;
			}
		}
	}
	public static void rollback() throws SQLException{
		if (!(cn==null)){
			try {
				cn.rollback();
			} catch (SQLException e) {
				throw e;
			}
		}
		
	}
        public static void close() throws SQLException{
		if (!(cn==null)){
			try {
				cn.close();
			} catch (SQLException e) {
				throw e;
			}
		}
            
        }
    
}