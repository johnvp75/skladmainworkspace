
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
public class PrepareInventForm extends javax.swing.JDialog {

    /** Creates new form PriceChange */
    public PrepareInventForm(java.awt.Frame parent, boolean modal) {
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
        String[] nameColumn = new String[4];
        nameColumn[0]="Наименование";
        nameColumn[1]="Цена";
        nameColumn[2]="Скидка %";
        nameColumn[3]="";
        priceTable = new javax.swing.JTable(new DefaultTableModel(nameColumn,0));
        printButton = new javax.swing.JButton();
        addCheckBox = new javax.swing.JCheckBox();
        realrestRadioButton = new javax.swing.JRadioButton();
        dateRadioButton = new javax.swing.JRadioButton();
        dateTextField = new javax.swing.JTextField();
        allRadioButton = new javax.swing.JRadioButton();

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

        priceTable.getColumnModel().getColumn(0).setMaxWidth(350);
        priceTable.getColumnModel().getColumn(1).setMaxWidth(60);
        priceTable.getColumnModel().getColumn(2).setMaxWidth(70);
        priceTable.getColumnModel().getColumn(3).setMaxWidth(60);
        jScrollPane2.setViewportView(priceTable);

        printButton.setText("Печать");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        addCheckBox.setText("Добавить к имеющемуся");
        addCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCheckBoxActionPerformed(evt);
            }
        });

        realrestRadioButton.setSelected(true);
        realrestRadioButton.setText("Текущие остатки");
        realrestRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realrestRadioButtonActionPerformed(evt);
            }
        });

        dateRadioButton.setText("Приход после");
        dateRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateRadioButtonActionPerformed(evt);
            }
        });

        dateTextField.setText("01.01.2001");
        dateTextField.setEnabled(false);
        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });

        allRadioButton.setText("Полный прайс");
        allRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRadioButtonActionPerformed(evt);
            }
        });

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
                        .addComponent(priceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(printButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(realrestRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(allRadioButton))))))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(skladCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(priceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(realrestRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateRadioButton)
                            .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addComponent(printButton)
                        .addGap(139, 139, 139))))
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

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            priceTable.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void addCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCheckBoxActionPerformed

    private void realrestRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realrestRadioButtonActionPerformed
        realrestRadioButton.setSelected(true);
        dateRadioButton.setSelected(false);
        allRadioButton.setSelected(false);
        dateTextField.setEnabled(false);
        change();
    }//GEN-LAST:event_realrestRadioButtonActionPerformed

    private void dateRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateRadioButtonActionPerformed
        dateRadioButton.setSelected(true);
        realrestRadioButton.setSelected(false);
        allRadioButton.setSelected(false);
        dateTextField.setEnabled(true);
    }//GEN-LAST:event_dateRadioButtonActionPerformed

    private void allRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRadioButtonActionPerformed
        realrestRadioButton.setSelected(false);
        dateRadioButton.setSelected(false);
        allRadioButton.setSelected(true);
        dateTextField.setEnabled(false);
        change();
    }//GEN-LAST:event_allRadioButtonActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        change();
    }//GEN-LAST:event_dateTextFieldActionPerformed

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
    private javax.swing.JCheckBox addCheckBox;
    private javax.swing.JRadioButton allRadioButton;
    private javax.swing.JRadioButton dateRadioButton;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTree groupTree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox priceCombo;
    private javax.swing.JTable priceTable;
    private javax.swing.JButton printButton;
    private javax.swing.JRadioButton realrestRadioButton;
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
//            priceTable.removeAll();
            if (!addCheckBox.isSelected())
                ((DefaultTableModel)priceTable.getModel()).setRowCount(0);
            ResultSet rs;
            String SQL="";
            if (getGroup()==-2)
                SQL="SELECT distinct i.name, i.cost, p1.cost, p1.akciya, p1.isakcia from " +
                    "((select distinct trim(name) as name, p.cost, t.id_tovar from (tovar t inner join kart k on t.id_tovar=k.id_tovar) " +
//                  "left join (select cost, id_tovar from price where id_price=(select id_price from type_price where name='"+MainCombo.getSelectedItem()+"' )) p on t.id_tovar=p.id_tovar where " +
                    "id_skl=(select id_skl from sklad where name='"+skladCombo.getSelectedItem()+"') " +
                    ") i) left join (select cost, id_tovar, akciya, isakcia from price where id_price=(select id_price from type_price where name='"+priceCombo.getSelectedItem()+"' )) p1 on i.id_tovar=p1.id_tovar" +
                    " order by upper(name)";
            else{
                if (realrestRadioButton.isSelected())
                    SQL=String.format("select distinct trim(t.name), p.cost, p.isakcia, p.akciya from tovar t, price p where p.id_tovar in (select id from (select t1.pr, t2.real, t1.id from " +
                            "(select sum(l.kol) as pr, l.id_tovar as id from lines l, document d WHERE d.id_doc= l.id_doc AND l.id_tovar in (select id_tovar from kart "+
                            "where kart.id_group in (select id_group from groupid start with id_group=%1$s CONNECT BY PRIOR id_group= groupid.parent_group) and " +
                            "kart.id_skl in (select id_skl from sklad where sklad.name='%2$s')) and d.id_type_doc in (select id_type_doc from type_doc where " +
                            "type_doc.operacia=1) and not(d.numb is null) group BY l.id_tovar) t1 left join (select sum(l.kol) as real, l.id_tovar as id from " +
                            "lines l, document d  WHERE d.id_type_doc in (select id_type_doc from type_doc where type_doc.operacia=2) and not(d.numb is null) and " +
                            "d.id_doc= l.id_doc AND l.id_tovar in (select id_tovar from kart where kart.id_group in (select id_group from groupid start with " +
                            "id_group=%1$s CONNECT BY PRIOR id_group= groupid.parent_group) and kart.id_skl in (select id_skl from sklad where sklad.name='%2$s')) "+
                            "group by l.id_tovar) t2 on t1.id=t2.id) where pr-nvl(real,0)>0) AND p.id_price=(select id_price from type_price where name='%3$s') "+
                            "and p.id_tovar= t.id_tovar order by isakcia, trim(t.name)", getGroup(),skladCombo.getSelectedItem(), priceCombo.getSelectedItem());
                if (dateRadioButton.isSelected())
                    SQL=String.format("select distinct trim(t.name) , p.cost, p.isakcia, p.akciya from tovar t, price p where p.id_tovar= t.id_tovar and p.id_price=(select id_price from type_price where name='%s') and p.id_tovar in "+
                        "(select l.id_tovar from lines l, document d where l.id_doc=d.id_doc and d.id_type_doc in (select id_type_doc from type_doc where operacia=1) and d.id_skl=(select id_skl from sklad where name='%s') "+
                        "and d.day>to_date('%s','DD.MM.YYYY')) and p.id_tovar in (select kart.id_tovar from kart where kart.id_group in (select id_group from groupid start with id_group=%s CONNECT BY PRIOR id_group= groupid.parent_group)) order by isakcia, trim(t.name)",
                        priceCombo.getSelectedItem(), skladCombo.getSelectedItem(),dateTextField.getText(),getGroup());
                if (allRadioButton.isSelected())
                    SQL=String.format("select distinct trim(t.name) as name, p.cost, p.isakcia, p.akciya from tovar t, price p where p.id_tovar= t.id_tovar and p.id_price=(select id_price from type_price where name='%s') and p.id_tovar in "+
                        " (select kart.id_tovar from kart where kart.id_group in (select id_group from groupid start with id_group=%s CONNECT BY PRIOR id_group= groupid.parent_group) and kart.id_skl=(select id_skl from sklad where name='%s')) order by  isakcia, name", priceCombo.getSelectedItem(),getGroup(), skladCombo.getSelectedItem());
                }
            rs=DataSet.QueryExec(SQL, false);
            while (rs.next()){
                String[] rowData=new String[4];
                rowData[0]=rs.getString(1);
//              Number form =new Number();
                rowData[1]=((new DecimalFormat("0.00")).format(rs.getDouble(2))).replace('.', ',') ;
                rowData[2]=rs.getString(4);
                rowData[3]=(rs.getInt(3)==1?"Акция":"");
                int RowCount=((DefaultTableModel)priceTable.getModel()).getRowCount();
                ((DefaultTableModel)priceTable.getModel()).insertRow(RowCount, rowData);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
