
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PriceForm.java
 *
 * Created on 16.07.2009, 13:23:20
 */

/**
 *
 * @author Admin
 */
public class PriceForm extends javax.swing.JDialog {

    /** Creates new form PriceForm */
    public PriceForm(java.awt.Frame parent, boolean modal) {
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
        priceCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        okrCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        priceTable = new javax.swing.JTable();
        nacTextField = new javax.swing.JTextField();
        koefTextField = new javax.swing.JTextField();
        runButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        inkCheckBox = new javax.swing.JCheckBox();
        nacCheckBox = new javax.swing.JCheckBox();
        koefCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Прайс");

        jLabel2.setText("Округление");

        okrCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "До 1", "До 0,1", "До 0,01" }));
        okrCombo.setSelectedIndex(1);
        okrCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okrComboActionPerformed(evt);
            }
        });

        priceTable.setModel(new PriceTableDataModel());
        priceTable.setCellSelectionEnabled(true);
        priceTable.getTableHeader().setResizingAllowed(false);
        priceTable.getTableHeader().setReorderingAllowed(false);
        //priceTable.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(new JCheckBox()));
        priceTable.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        jScrollPane1.setViewportView(priceTable);

        nacTextField.setText("0");

        koefTextField.setText("1");

        runButton.setText("Расчитать");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Сохранить");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Закрыть");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        inkCheckBox.setText("В большую сторону");

        nacCheckBox.setText("Наценка %");

        koefCheckBox.setText("Коеффициент");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(runButton, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(priceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(okrCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inkCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nacCheckBox)
                                    .addComponent(koefCheckBox))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(koefTextField)
                                    .addComponent(nacTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(priceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(okrCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inkCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nacCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(koefTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(koefCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(runButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(closeButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        for (int i=0;i<priceTable.getModel().getRowCount();i++){
            if ((Boolean)priceTable.getModel().getValueAt(i, 0)){
                priceTable.getModel().setValueAt(cen(i), i, 3);
            }
        }
    }//GEN-LAST:event_runButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ActionListener listener = new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try{
                    for (int i=0;i<((PriceTableDataModel)priceTable.getModel()).size();i++){
                        ResultSet rs=DataSet.QueryExec("select cost, akciya, isakcia from price where (id_tovar=(select id_tovar from tovar where name='"+((PriceTableDataModel)priceTable.getModel()).getValueAt(i, 1)+"')) and (id_price=(select id_price from type_price where name='"+priceCombo.getSelectedItem()+"')) and (id_skl=(select id_skl from sklad where name='"+getSklad()+"'))", false);
                        if (rs.next()){
                            ((PriceTableDataModel)priceTable.getModel()).setValueAt(rs.getString(1), i, 3);
                            boolean b=false;
                            if (rs.getInt(3)==1)
                                b=true;
                            ((PriceTableDataModel)priceTable.getModel()).setValueAt(b, i, 4);
                            ((PriceTableDataModel)priceTable.getModel()).setValueAt(rs.getString(2), i, 5);
                        }
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }
                
            }
        };
        priceCombo.removeActionListener(listener);
        priceCombo.removeAllItems();
        try{

            ResultSet rs=DataSet.QueryExec("Select trim(name) from type_price order by name",false);
            while (rs.next())
                priceCombo.addItem(rs.getString(1));
            rs=DataSet.QueryExec("select trim(name) from type_price where id_price=(select id_price from sklad where name='"+getSklad()+"')", false);
            rs.next();
            priceCombo.setSelectedItem(rs.getString(1));
            for (int i=0;i<((PriceTableDataModel)priceTable.getModel()).size();i++){
                rs=DataSet.QueryExec("select cost, akciya, isakcia from price where (id_tovar=(select id_tovar from tovar where name='"+((PriceTableDataModel)priceTable.getModel()).getValueAt(i, 1)+"')) and (id_price=(select id_price from type_price where name='"+priceCombo.getSelectedItem()+"')) and (id_skl=(select id_skl from sklad where name='"+getSklad()+"'))", false);
                if (rs.next()){
                    ((PriceTableDataModel)priceTable.getModel()).setValueAt(rs.getString(1), i, 3);
                    boolean b=false;
                    if (rs.getInt(3)==1)
                        b=true;
                    ((PriceTableDataModel)priceTable.getModel()).setValueAt(b, i, 4);
                    ((PriceTableDataModel)priceTable.getModel()).setValueAt(rs.getString(2), i, 5);
                }
            }
            inkCheckBox.setSelected(false);
            koefCheckBox.setSelected(false);
            koefTextField.setText("1");
            nacCheckBox.setSelected(false);
            nacTextField.setText("0");
            okrCombo.setSelectedIndex(1);
        }catch(Exception e){
            e.printStackTrace();
        }
        priceCombo.addActionListener(listener);
    }//GEN-LAST:event_formComponentShown

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        ((PriceTableDataModel)priceTable.getModel()).removeAll();
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void okrComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okrComboActionPerformed
        
    }//GEN-LAST:event_okrComboActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
//        ((PriceTableDataModel)priceTable.getModel()).removeAll();
    }//GEN-LAST:event_formComponentHidden

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try{
            ResultSet rs=DataSet.QueryExec("Select id_skl from sklad where name='"+getSklad()+"'", false);
            rs.next();
            int skl=rs.getInt(1);
            rs=DataSet.QueryExec("Select id_price from type_price where name='"+priceCombo.getSelectedItem()+"'", false);
            rs.next();
            int price=rs.getInt(1);
            for (int i=0; i<priceTable.getModel().getRowCount();i++){
                if ((Boolean)priceTable.getModel().getValueAt(i, 0)){
                        if (DataSet.UpdateQuery("update price set cost="+priceTable.getModel().getValueAt(i, 3)+", akciya="+priceTable.getModel().getValueAt(i, 5)+", isakcia="+(((Boolean)priceTable.getModel().getValueAt(i, 4)).booleanValue()?"1":"0")+
                                " where id_tovar=(select id_tovar from tovar where name='"+priceTable.getModel().getValueAt(i, 1)+"') and id_skl="+skl+" and id_price="+price)==0)
                            DataSet.UpdateQuery("insert into price (cost, akciya, isakcia, id_skl, id_price, id_tovar) select " +
                                ""+priceTable.getModel().getValueAt(i, 3)+
                                ", "+priceTable.getModel().getValueAt(i, 5)+", " +
                                ""+((Boolean)priceTable.getModel().getValueAt(i, 4)?"1":"0")+", " +skl+", "+price+", "+
                                "id_tovar from tovar where name='"+priceTable.getModel().getValueAt(i, 1)+"'");
                }
            }
            DataSet.commit();
        }catch(Exception e){
            try {
                DataSet.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed
    public void dialogShown(Vector<String> nazv, Vector<Double> cost){
        ((PriceTableDataModel)priceTable.getModel()).removeAll();
        for (int i=0; i<nazv.size();i++)
            ((PriceTableDataModel)priceTable.getModel()).add(nazv.get(i), cost.get(i), 0.0, false, 0);
        setVisible(true);
    }
    /**
    * @param args the command line arguments
    */
/*    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PriceForm dialog = new PriceForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox inkCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox koefCheckBox;
    private javax.swing.JTextField koefTextField;
    private javax.swing.JCheckBox nacCheckBox;
    private javax.swing.JTextField nacTextField;
    private javax.swing.JComboBox okrCombo;
    private javax.swing.JComboBox priceCombo;
    private javax.swing.JTable priceTable;
    private javax.swing.JButton runButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
    private String Sklad;

    public String getSklad() {
        return Sklad;
    }

    public void setSklad(String Sklad) {
        this.Sklad = Sklad;
    }
    private String cen(int row){
        double ret=(Double)priceTable.getModel().getValueAt(row, 2)*(nacCheckBox.isSelected()?(1+(new Double(nacTextField.getText())).doubleValue()/100) : 1)*(koefCheckBox.isSelected()?(new Double(koefTextField.getText())).doubleValue():1);
        String str="0.";
        for (int i=0;i<okrCombo.getSelectedIndex();i++)
            str=str+"0";
        NumberFormat formatter = new DecimalFormat ( str ) ;
        //ret=(ret*Math.pow(10, 2-okrCombo.getSelectedIndex())+0.5)/Math.pow(10, 2-okrCombo.getSelectedIndex());
        if (inkCheckBox.isSelected())
            ret=ret+(0.5/Math.pow(10, okrCombo.getSelectedIndex())-0.1/Math.pow(10, okrCombo.getSelectedIndex()+1));
        return formatter.format(ret);
    }
}
