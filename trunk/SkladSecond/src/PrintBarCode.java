
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrintBarCode.java
 *
 * Created on 11 лип 2010, 17:08:45
 */

/**
 *
 * @author евгений
 */
public class PrintBarCode extends javax.swing.JDialog {

    /** Creates new form PrintBarCode */
    public PrintBarCode(java.awt.Frame parent, boolean modal,int id_doc) {
        super(parent, modal);
        setId_doc(id_doc);
        initComponents();
    }

    public void Show(){
        setVisible(true);
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        type1 = new javax.swing.JRadioButton();
        type2 = new javax.swing.JRadioButton();
        type3 = new javax.swing.JRadioButton();
        type4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new BarPrintModel(getId_doc()));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Поля для печати:");

        type1.setText("Цена");
        type1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type1ActionPerformed(evt);
            }
        });

        type2.setText("Цена за упаковку + цена за штуку");
        type2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type2ActionPerformed(evt);
            }
        });

        type3.setSelected(true);
        type3.setText("Цена + кол-во в упаковке");
        type3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type3ActionPerformed(evt);
            }
        });

        type4.setText("Без цены");
        type4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type4ActionPerformed(evt);
            }
        });

        jButton1.setText("Подготовить для печати");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type1)
                            .addComponent(type2))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type4)
                            .addComponent(type3))
                        .addGap(90, 90, 90)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(type1)
                            .addComponent(type3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(type2)
                            .addComponent(type4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void type2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type2ActionPerformed
        type1.setSelected(false);
        type2.setSelected(true);
        type3.setSelected(false);
        type4.setSelected(false);
    }//GEN-LAST:event_type2ActionPerformed

    private void type1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type1ActionPerformed
        type1.setSelected(true);
        type2.setSelected(false);
        type3.setSelected(false);
        type4.setSelected(false);
    }//GEN-LAST:event_type1ActionPerformed

    private void type3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type3ActionPerformed
        type1.setSelected(false);
        type2.setSelected(false);
        type3.setSelected(true);
        type4.setSelected(false);
    }//GEN-LAST:event_type3ActionPerformed

    private void type4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type4ActionPerformed
        type1.setSelected(false);
        type2.setSelected(false);
        type3.setSelected(false);
        type4.setSelected(true);
    }//GEN-LAST:event_type4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            DataSet.UpdateQuery("delete from barprint");
            for(int i=0;i<((BarPrintModel)(jTable1.getModel())).getRowCount();i++){
                if((Boolean)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 0)){
                    String name;
                    name=((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 1));
                    if (name.indexOf("(")>-1)
                        name=name.substring(0, name.indexOf("("));
                    String bar_code=((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 2));
                    bar_code=bar_code.substring(0, bar_code.trim().length()-1);
                    String field1=" ";
                    String field2=" ";
                    if (type1.isSelected()){
                        field1="Цена за ";
                        if (((Integer)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 3))==1 &&!(((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 4)).equals(((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 5))))){
                            field1=field1+"уп.:"+((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 4))+" грн.";
                        }else{
                            field1=field1+"шт.:"+((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 4))+" грн.";
                        }
                    }
                    if (type2.isSelected()){
                        field1="Цена за уп.:"+((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 4))+" грн.";
                        field2="Цена за шт.:"+((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 5))+" грн.";
                    }
                    if (type3.isSelected()){
                        field1="Цена за ";
                        if (((Integer)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 3))==1 &&!(((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 4)).equals(((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 5))))){
                            field1=field1+"уп.:"+((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 4))+" грн.";
                        }else{
                            field1=field1+"шт.:"+((String)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 4))+" грн.";
                        }
                        if (((Integer)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 3))==1){
                            field2="Упаковка: "+((BarPrintModel)(jTable1.getModel())).getInbox(i)+" шт.";
                        }else{
                            field2="Упаковка: "+((Integer)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 3))+" шт.";
                        }
                    }
                    int count=((Integer)((BarPrintModel)(jTable1.getModel())).getValueAt(i, 6));
                    DataSet.UpdateQuery(String.format("insert into barprint (name,bar_code,field1,field2,count) values ('%s','%s','%s','%s',%s)", name,bar_code,field1,field2,count));
                }
            }
            DataSet.commit();

        }
        catch(Exception e){
            try{
                DataSet.rollback();
            }
            catch(Exception ex){
                ex.printStackTrace();
                }
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton type1;
    private javax.swing.JRadioButton type2;
    private javax.swing.JRadioButton type3;
    private javax.swing.JRadioButton type4;
    // End of variables declaration//GEN-END:variables
    private int id_doc;

    public int getId_doc() {
        return id_doc;
    }

    public void setId_doc(int id_skl) {
        this.id_doc = id_skl;
    }

}

class BarPrintModel extends AbstractTableModel{
    private Vector<BarCodePrintElement> element = new Vector<BarCodePrintElement>(0);
    private int id_skl;
    private Vector<Boolean> print = new Vector<Boolean>(0);
    private Vector<Double> price= new Vector<Double>(0);
    private Vector<Integer> StickCount= new Vector<Integer>(0);

    public BarPrintModel(int id_doc){
        try{
            ResultSet rs=DataSet.QueryExec(String.format("select id_skl from document where id_doc=%s", id_doc), false);
            if (rs.next()){
                id_skl=rs.getInt(1);
            }
            rs=DataSet.QueryExec(String.format("select id_tovar, kol from lines where id_doc=%s", id_doc), false);
            while (rs.next()){
                int rowcount=getRowCount();
                add(rs.getInt(1),rs.getInt(2));
                if (rowcount==getRowCount()){
                    ResultSet rs1=DataSet.QueryExec1(String.format("select trim(name) from tovar where id_tovar=%s", rs.getInt(1)), false);
                    if (rs1.next()){
                        element.add(new BarCodePrintElement(rs1.getString(1),rs.getInt(2),new BarCodeData("",0)));
                        print.add(Boolean.FALSE);
                        price.add(0.00);
                        StickCount.add(0);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Object getValueAt(int row, int col){
        NumberFormat formatter= new DecimalFormat("0.00");
        switch(col){
            case 0:return (Boolean)print.get(row);
            case 1:return element.get(row).name;
            case 2:return element.get(row).BarCode.Name;
            case 3:return element.get(row).BarCode.Count;
            case 4:return formatter.format(price.get(row)).replace('.', ',');
            case 5:return formatter.format(price.get(row)/element.get(row).count).replace('.', ',');
            case 6:return StickCount.get(row);
            default: return null;
        }
    }

    public int getInbox(int row){
        return element.get(row).count;
    }

    @Override
    public int getColumnCount(){
        return 7;
    }

    @Override
    public int getRowCount() {
        return element.size();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return (columnIndex==0?Boolean.class:super.getColumnClass(columnIndex));
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:return "Печатать";
            case 1:return "Наименование";
            case 2:return "Штрих-код";
            case 3:return "Кол-во ед. на код";
            case 4:return "Цена упаковки";
            case 5:return "Цена за ед.";
            case 6:return "Кол-во этикеток";
            default: return "";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return (columnIndex==0||columnIndex==6?true:false);
    }

    public void setElement(BarCodePrintElement element,int row) {
        this.element.setElementAt(element, row);
    }

    public void setId_skl(int id_skl) {
        this.id_skl = id_skl;
    }

    public void setPrice(Double price,int row) {
        this.price.setElementAt(price, row);
    }

    public void setPrint(Boolean print,int row) {
        this.print.setElementAt(print, row);
    }

    public void setStickCount(Integer StickCount,int row) {
        this.StickCount.setElementAt(StickCount, row);
    }
    private int getId_skl(){
        return id_skl;
    }



    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                setPrint((Boolean)aValue, rowIndex);
                return;
            case 6:
                setStickCount(new Integer((String)aValue), rowIndex);
                return;
        }
    }

    public void add(int id_tovar, int count){
        ResultSet rs=null;
        try{
            rs=DataSet.QueryExec1(String.format("select distinct t.kol,trim(b.bar_code),b.count,p.cost,trim(t.name) from tovar t, bar_code b, sklad s, price p " +
                    "where t.id_tovar = b.id_tovar and t.id_tovar = p.id_tovar and t.id_tovar=%s and s.id_price = p.id_price and s.id_skl=%s and length(trim(b.bar_code))>10",
                    id_tovar,getId_skl()), false);
            while (rs.next()){
                element.add(new BarCodePrintElement(rs.getString(5),rs.getInt(1),new BarCodeData(rs.getString(2),rs.getInt(3))));
                print.add(Boolean.FALSE);
                price.add(rs.getDouble(4));
                StickCount.add(count/rs.getInt(3));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        fireTableDataChanged();
    }



}

class BarCodePrintElement{
    public String name;
    public int count;
//    public int inbox;
    public BarCodeData BarCode;

    public BarCodePrintElement(String aname, int acount, BarCodeData aBarCode){
        name=aname;
        count=acount;
  //      inbox=ainbox;
        BarCode= new BarCodeData(aBarCode.Name,aBarCode.Count);
    }

    public BarCodePrintElement(){
        name="";
        count=0;
        BarCode=new BarCodeData("",0);
    }
}