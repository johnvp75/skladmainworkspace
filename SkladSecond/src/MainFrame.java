
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on 06.07.2009, 12:28:47
 */

/**
 *
 * @author Admin
 */
public class MainFrame extends javax.swing.JFrame {


    /** Creates new form MainFrame */
    public MainFrame() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception e) {
                e.printStackTrace();
        }
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

        inputPanel1 = new InputPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jMenu1.setText("Приход");

        jMenuItem1.setText("Новый");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenu5.setText("Редактирование");

        jMenuItem2.setText("Непроведенных");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenu1.add(jMenu5);

        jMenuItem3.setText("Удаление");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Реализация");

        jMenuItem4.setText("Ввод нового");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Просмотр и редактирование");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Удаление");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Клиенты");

        jMenuItem9.setText("Редактирование данных");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Прайс");

        jMenuItem8.setText("Редактирование");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem11.setText("Просмотр и печать");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Работа с остатками");

        jMenuItem10.setText("Обнуление");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuBar1.add(jMenu7);

        jMenu11.setText("Инвентаризация");

        jMenuItem14.setText("Подгодовка документов");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem14);

        jMenuBar1.add(jMenu11);

        jMenu8.setText("Документы");

        jMenu9.setText("Просмотр, печать проведенных");

        jMenuItem12.setText("По номеру");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        jMenu8.add(jMenu9);

        jMenu10.setText("Просмотр, печать непроведенных");

        jMenuItem13.setText("Расходные накл. по ID");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem13);

        jMenu8.add(jMenu10);

        jMenuBar1.add(jMenu8);

        jMenu3.setText("Окно");

        jMenuItem7.setText("Закрыть текущее окно");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   

   

   

   

   

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (dialog==null)
            dialog= new ManagerChooser();
        dialog.setRul(";1;");
        if (dialog.showDialog(null, "Вход в систему")){
            setTitle("Программа автоматизации склада. Пользователь: "+dialog.GetManager());
            MainFrame.setEditDocId(0);
            inputPanel1.setManager(dialog.GetManager());
            inputPanel1.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (inputPanel1.isVisible()){
            inputPanel1.setVisible(false);
            setTitle("Программа автоматизации склада.");
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        if (dialog==null)
            dialog= new ManagerChooser();
        dialog.setRul(";6;");
        if (dialog.showDialog(null, "Вход в систему")){
            PriceChange price=new PriceChange(null,true);
            price.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        inputPanel1.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (dialog==null)
            dialog= new ManagerChooser();
        dialog.setRul(";1;");
        if (dialog.showDialog(null, "Вход в систему")){
            if (editDoc==null)
                editDoc=new EditDoc(this, true);
            editDoc.setType_doc(1);
            editDoc.setVisible(true);
            inputPanel1.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        (new EditClient()).setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if (dialog==null)
            dialog= new ManagerChooser();
        dialog.setRul(";5;");
        if (dialog.showDialog(null, "Вход в систему")){
            setTitle("Программа автоматизации склада. Пользователь: "+dialog.GetManager());
            RestChange rest=new RestChange(null,true);
            rest.setManager(dialog.GetManager());
            rest.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
            PriceView price=new PriceView(null,true);
            price.setVisible(true);

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        int numb=new Integer(JOptionPane.showInputDialog("Введите номер накладной"));
        Vector<Vector<String>> OutData = new Vector<Vector<String>>(0);
        NumberFormat formatter = new DecimalFormat ( "0.00" ) ;
        int id=0;
        ResultSet rs;
        try{
            rs=DataSet.QueryExec("Select id_doc from document where id_type_doc=2 and to_char(day,'YYYY')=to_char(sysdate,'YYYY') and numb="+numb, false);
            if (rs.next())
                id=rs.getInt(1);
            else
                return;
            rs=DataSet.QueryExec("select trim(tovar.name), lines.kol, cost, disc, sum(lines.kol*cost*(1-disc/100)) from lines inner join tovar on lines.id_tovar=tovar.id_tovar where id_doc="+id+" group by tovar.name, cost, lines.kol, disc order by tovar.name", false);
            for (int i=0; i<OutData.size();i++)
            OutData.get(i).clear();
            OutData.clear();
            int j=0;
            while (rs.next()){
                Vector<String> Row=new Vector<String>(0);
                j++;
		Row.add(j+"");
		Row.add(rs.getString(1));
		Row.add(rs.getString(2));
		Row.add(formatter.format(rs.getDouble(3)));
		Row.add(rs.getString(4));
		Row.add(formatter.format(rs.getDouble(5)));
		OutData.add(Row);
            }
            rs=DataSet.QueryExec("select sum, trim(note), disc, trim(val.name), trim(manager.name), trim(sklad.name), numb, trim(client.name) from (((document inner join val on document.id_val=val.id_val) inner join manager on document.id_manager=manager.id_manager) inner join " +
                "sklad on document.id_skl=sklad.id_skl) inner join client on document.id_client=client.id_client where id_doc="+id, false);
            rs.next();
            GregorianCalendar now=new GregorianCalendar();
            int size=OutData.size();
            OutputOO.OpenDoc("nakl_pr.ots",false);
            OutputOO.InsertOne("\""+now.get(Calendar.DAY_OF_MONTH)+"\" "+Month(now.get(Calendar.MONTH))+" "+now.get(Calendar.YEAR)+"г.", 10, true, 4,1);
            OutputOO.InsertOne("Накладная №"+numb, 16, true, 1, 2);
            OutputOO.InsertOne("Поставщик: "+rs.getString(8),11, true, 1,4);
            OutputOO.InsertOne(rs.getString(2),8,false,1,6);
            OutputOO.InsertOne("Склад: "+rs.getString(6),7,false,6,7);
            OutputOO.InsertOne("Валюта: "+rs.getString(4),7,false,1,7);
            OutputOO.InsertOne("ИТОГО:",10,false,4,9+size);
            OutputOO.InsertOne(formatter.format(rs.getDouble(1)/(1-rs.getDouble(3)/100)),10,false,6,9+size);
            OutputOO.InsertOne("Скидка",10,false,2,9+size+1);
            OutputOO.InsertOne(formatter.format(rs.getDouble(3))+"%",10,false,4,9+size+1);
            OutputOO.InsertOne(formatter.format(rs.getDouble(1)*(1/(1-rs.getDouble(3)/100)-1)),10,false,6,9+size+1);
            OutputOO.InsertOne("Итого со скидкой",10,false,2,9+size+2);
            OutputOO.InsertOne(formatter.format(rs.getDouble(1)),10,true,6,9+size+2);
            OutputOO.InsertOne("Документ оформил: "+rs.getString(5),8,false,2,9+size+4);
            OutputOO.Insert(1, 9, OutData);
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        int id=new Integer(JOptionPane.showInputDialog("Введите ID накладной"));
        Vector<Vector<String>> OutData = new Vector<Vector<String>>(0);
        NumberFormat formatter = new DecimalFormat ( "0.00" ) ;
        int numb=0;
        ResultSet rs;
        try{
            rs=DataSet.QueryExec("select trim(tovar.name), lines.kol, cost, disc, sum(lines.kol*cost*(1-disc/100)) from lines inner join tovar on lines.id_tovar=tovar.id_tovar where id_doc="+id+" group by tovar.name, cost, lines.kol, disc order by tovar.name", false);
            for (int i=0; i<OutData.size();i++)
            OutData.get(i).clear();
            OutData.clear();
            int j=0;
            while (rs.next()){
                Vector<String> Row=new Vector<String>(0);
                j++;
		Row.add(j+"");
		Row.add(rs.getString(1));
		Row.add(rs.getString(2));
		Row.add(formatter.format(rs.getDouble(3)));
		Row.add(rs.getString(4));
		Row.add(formatter.format(rs.getDouble(5)));
		OutData.add(Row);
            }
            rs=DataSet.QueryExec("select sum, trim(note), disc, trim(val.name), trim(manager.name), trim(sklad.name), numb, trim(client.name) from (((document inner join val on document.id_val=val.id_val) inner join manager on document.id_manager=manager.id_manager) inner join " +
                "sklad on document.id_skl=sklad.id_skl) inner join client on document.id_client=client.id_client where id_doc="+id, false);
            rs.next();
            GregorianCalendar now=new GregorianCalendar();
            int size=OutData.size();
            OutputOO.OpenDoc("nakl_pr.ots",false);
            OutputOO.InsertOne("\""+now.get(Calendar.DAY_OF_MONTH)+"\" "+Month(now.get(Calendar.MONTH))+" "+now.get(Calendar.YEAR)+"г.", 10, true, 4,1);
            OutputOO.InsertOne("Накладная №"+numb, 16, true, 1, 2);
            OutputOO.InsertOne("Поставщик: "+rs.getString(8),11, true, 1,4);
            OutputOO.InsertOne(rs.getString(2),8,false,1,6);
            OutputOO.InsertOne("Склад: "+rs.getString(6),7,false,6,7);
            OutputOO.InsertOne("Валюта: "+rs.getString(4),7,false,1,7);
            OutputOO.InsertOne("ИТОГО:",10,false,4,9+size);
            OutputOO.InsertOne(formatter.format(rs.getDouble(1)/(1-rs.getDouble(3)/100)),10,false,6,9+size);
            OutputOO.InsertOne("Скидка",10,false,2,9+size+1);
            OutputOO.InsertOne(formatter.format(rs.getDouble(3))+"%",10,false,4,9+size+1);
            OutputOO.InsertOne(formatter.format(rs.getDouble(1)*(1/(1-rs.getDouble(3)/100)-1)),10,false,6,9+size+1);
            OutputOO.InsertOne("Итого со скидкой",10,false,2,9+size+2);
            OutputOO.InsertOne(formatter.format(rs.getDouble(1)),10,true,6,9+size+2);
            OutputOO.InsertOne("Документ оформил: "+rs.getString(5),8,false,2,9+size+4);
            OutputOO.Insert(1, 9, OutData);
        }catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        if (dialog==null)
            dialog= new ManagerChooser();
        dialog.setRul(";5;");
        if (dialog.showDialog(null, "Вход в систему")){
            setTitle("Программа автоматизации склада. Пользователь: "+dialog.GetManager());
            PrepareInventForm invent=new PrepareInventForm(null,true);
            invent.setManager(dialog.GetManager());
            invent.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private InputPanel inputPanel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
    private static int EditDocId = 0;
    private EditDoc editDoc=null;

    public static int getEditDocId() {
        return EditDocId;
    }

    public static void setEditDocId(int EditDocId) {
        MainFrame.EditDocId = EditDocId;
    }

    private static ManagerChooser dialog;

    private String Month(int get) {
	switch (get+1){
	case 1:return "января";
	case 2:return "февраля";
	case 3:return "марта";
	case 4:return "апреля";
	case 5:return "мая";
	case 6:return "июня";
	case 7:return "июля";
	case 8:return "августа";
	case 9:return "сентября";
	case 10:return "октября";
	case 11:return "ноября";
	case 12:return "декабря";
	default: return "";
	}
    }





}
