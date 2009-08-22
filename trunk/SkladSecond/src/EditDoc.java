
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditDoc.java
 *
 * Created on 21 серп 2009, 22:56:18
 */

/**
 *
 * @author Жека
 */
public class EditDoc extends javax.swing.JDialog {

    /** Creates new form EditDoc */
    public EditDoc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Vector<String> Client =new Vector<String>(0);
        Vector<String> Sklad =new Vector<String>(0);
        Vector<String> Sum =new Vector<String>(0);
        Vector<Integer> id =new Vector<Integer>(0);
        try{
            ResultSet rs=DataSet.QueryExec("select trim(c.name), trim(s.name), d.sum, d.id_doc from client c, sklad s, document d where d.id_client=c.id_client and " +
                "d.id_skl=s.id_skl and d.numb is null order by upper(trim(c.name)), upper(trim(s.name))", false);
            while (rs.next()){
                Client.add(rs.getString(1));
                Sklad.add(rs.getString(2));
                Sum.add(rs.getString(3));
                id.add(rs.getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        EditTableModel model=new EditTableModel(Client,Sklad,Sum,id);
        naklTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        naklTable.setModel(model);
        naklTable.setColumnSelectionAllowed(true);
        naklTable.getTableHeader().setReorderingAllowed(false);
        naklTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naklTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(naklTable);
        naklTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void naklTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naklTableMouseClicked
        if (evt.getClickCount()==2){
            MainFrame.setEditDocId(((EditTableModel)naklTable.getModel()).getId(naklTable.getSelectedRow()));
            setVisible(false);
        }
    }//GEN-LAST:event_naklTableMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditDoc dialog = new EditDoc(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable naklTable;
    // End of variables declaration//GEN-END:variables

}
