
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new BarPrintModel(getId_doc()));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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
    public BarCodeData BarCode;

    public BarCodePrintElement(String aname, int acount, BarCodeData aBarCode){
        name=aname;
        count=acount;
        BarCode= new BarCodeData(aBarCode.Name,aBarCode.Count);
    }

    public BarCodePrintElement(){
        name="";
        count=0;
        BarCode=new BarCodeData("",0);
    }
}
