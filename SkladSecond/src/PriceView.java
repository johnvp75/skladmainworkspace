
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PriceChange.java
 *
 * Created on 13 серп 2009, 12:19:54
 */

/**
 *
 * @author Admin
 */
public class PriceView extends javax.swing.JDialog {

    /** Creates new form PriceChange */
    public PriceView(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        skladCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        groupTree = new javax.swing.JTree();
        jLabel2 = new javax.swing.JLabel();
        priceCombo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        priceTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Склад:");

        skladCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        groupTree.setModel(new GroupTreeModel());
        groupTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                groupTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(groupTree);

        jLabel2.setText("Прайс");

        jScrollPane2.setViewportView(priceTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(skladCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(priceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(430, 430, 430))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(skladCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(priceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_groupTreeValueChanged
        setGroup(((DataNode)evt.getPath().getLastPathComponent()).getIndex());
        change();
    }//GEN-LAST:event_groupTreeValueChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
            ResultSet rs=DataSet.QueryExec("Select trim(name) from sklad order by UPPER(trim(name))", false);
            skladCombo.removeAllItems();
            while (rs.next()){
                skladCombo.addItem(rs.getString(1));
            }
            if (skladCombo.getItemCount()==0)
                return;
            skladCombo.setSelectedIndex(0);
            rs=DataSet.QueryExec("select trim(name) from type_price order by upper(trim(name))", false);
            priceCombo.removeAllItems();
            while (rs.next()){
                priceCombo.addItem(rs.getString(1));
            }
            if (priceCombo.getItemCount()==0)
                return;
            priceCombo.setSelectedIndex(0);
        }catch(Exception e){
            e.printStackTrace();
        }
        ActionListener actionCombo= new ActionListener(){
            public void actionPerformed(ActionEvent event){
                change();
            }
        };
        skladCombo.addActionListener(actionCombo);
        priceCombo.addActionListener(actionCombo);
    }//GEN-LAST:event_formComponentShown

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PriceChange dialog = new PriceChange(new javax.swing.JFrame(), true);
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
    private javax.swing.JTree groupTree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox priceCombo;
    private javax.swing.JTable priceTable;
    private javax.swing.JComboBox skladCombo;
    // End of variables declaration//GEN-END:variables
    private int Group = 0;

    public int getGroup() {
        return Group;
    }

    public void setGroup(int Group) {
        this.Group = Group;
    }

    private void change(){
        try{
            ((PriceTableDataModel)priceTable.getModel()).removeAll();
            ResultSet rs;
                if (getGroup()==-2)
                    rs=DataSet.QueryExec("SELECT distinct i.name, i.cost, p1.cost, p1.akciya, p1.isakcia from " +
                            "((select distinct trim(name) as name, p.cost, t.id_tovar from (tovar t inner join kart k on t.id_tovar=k.id_tovar) " +
//                            "left join (select cost, id_tovar from price where id_price=(select id_price from type_price where name='"+MainCombo.getSelectedItem()+"' )) p on t.id_tovar=p.id_tovar where " +
                            "id_skl=(select id_skl from sklad where name='"+skladCombo.getSelectedItem()+"') " +
                            ") i) left join (select cost, id_tovar, akciya, isakcia from price where id_price=(select id_price from type_price where name='"+priceCombo.getSelectedItem()+"' )) p1 on i.id_tovar=p1.id_tovar" +
                            " order by upper(name)", false);
                else
                    rs=DataSet.QueryExec("SELECT distinct i.name, i.cost, p1.cost, p1.akciya, p1.isakcia from " +
                            "((select distinct trim(name) as name, p.cost, t.id_tovar from (tovar t inner join kart k on t.id_tovar=k.id_tovar) " +
//                            "left join (select cost, id_tovar from price where id_price=(select id_price from type_price where name='"+MainCombo.getSelectedItem()+"' )) p on t.id_tovar=p.id_tovar where k.id_group in " +
                            "(SELECT id_group from groupid start with id_group="+getGroup()+" connect BY prior id_group= parent_group) " +
                            "and id_skl=(select id_skl from sklad where name='"+skladCombo.getSelectedItem()+"') " +
                            ") i) left join (select cost, id_tovar, akciya, isakcia from price where id_price=(select id_price from type_price where name='"+priceCombo.getSelectedItem()+"' )) p1 on i.id_tovar=p1.id_tovar" +
                            " order by upper(name)", false);
                while (rs.next()){
                    ((PriceTableDataModel)priceTable.getModel()).add(rs.getString(1), rs.getDouble(2), rs.getDouble(3), 0.0, (rs.getInt(5)==1), rs.getInt(4));
                }

            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}