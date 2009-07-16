
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class PriceTableDataModel extends AbstractTableModel{

    private Vector<JCheckBox> CheckCol;
    private Vector<String> Nazv;
    private Vector<Double> Cost;
    private Vector<Double> PriceCost;
    private Vector<JCheckBox> Akcia;
    private Vector<Integer> Discount;

    public PriceTableDataModel() {
        CheckCol=new Vector<JCheckBox>(0);
        Nazv=new Vector<String>(0);
        Cost=new Vector<Double>(0);
        PriceCost=new Vector<Double>(0);
        Akcia=new Vector<JCheckBox>(0);
        Discount=new Vector<Integer>(0);
    }

    private JCheckBox getCheckCol(int pos) {
        return CheckCol.get(pos);
    }
    private void setCheckCol(JCheckBox CheckBox, int pos) {
        CheckCol.setElementAt(CheckBox, pos);
    }
    private void addCheckCol(JCheckBox CheckBox){
        CheckCol.add(CheckBox);
    }
    private void removeCheckCol(int pos){
        CheckCol.removeElementAt(pos);
    }

    private String getNazv(int pos) {
        return Nazv.get(pos);
    }
    private void setNazv(String aNazv, int pos) {
        Nazv.setElementAt(aNazv, pos);
    }
    private void addNazv(String aNazv){
        Nazv.add(aNazv);
    }
    private void removeNazv(int pos){
        Nazv.removeElementAt(pos);
    }

    private Double getCost(int pos) {
        return Cost.get(pos);
    }
    private void setCost(Double aCost, int pos) {
        Cost.setElementAt(aCost, pos);
    }
    private void addCost(Double aCost){
        Cost.add(aCost);
    }
    private void removeCost(int pos){
        Cost.removeElementAt(pos);
    }

    private Double getPriceCost(int pos) {
        return PriceCost.get(pos);
    }
    private void setPriceCost(Double aCost, int pos) {
        PriceCost.setElementAt(aCost, pos);
    }
    private void addPriceCost(Double aCost){
        PriceCost.add(aCost);
    }
    private void removePriceCost(int pos){
        PriceCost.removeElementAt(pos);
    }

    private JCheckBox getAkcia(int pos) {
        return Akcia.get(pos);
    }
    private void setAkcia(JCheckBox CheckBox, int pos) {
        Akcia.setElementAt(CheckBox, pos);
    }
    private void addAkcia(JCheckBox CheckBox){
        Akcia.add(CheckBox);
    }
    private void removeAkcia(int pos){
        Akcia.removeElementAt(pos);
    }

    private Integer getDiscount(int pos) {
        return Discount.get(pos);
    }
    private void setDiscount(Integer aCost, int pos) {
        Discount.setElementAt(aCost, pos);
    }
    private void addDiscount(Integer aCost){
        Discount.add(aCost);
    }
    private void removeDiscount(int pos){
        Discount.removeElementAt(pos);
    }

    public void add(String aNazv, double aCost, double aPriceCost, boolean isAkcia, int aDisc){
        addCheckCol(new JCheckBox("",false));
        addNazv(aNazv);
        addCost(new Double(aCost));
        addPriceCost(new Double(aPriceCost));
        addAkcia(new JCheckBox("",isAkcia));
        addDiscount(new Integer(aDisc));
        fireTableDataChanged();
    }
    public void remove(int row){
        removeCheckCol(row);
        removeCost(row);
        removeNazv(row);
        removePriceCost(row);
        removeAkcia(row);
        removeDiscount(row);
        fireTableDataChanged();
    }
    public void removeAll(){
        CheckCol.removeAllElements();
        Cost.removeAllElements();
        Nazv.removeAllElements();
        PriceCost.removeAllElements();
        Akcia.removeAllElements();
        Discount.removeAllElements();
        fireTableDataChanged();
    }
    public Object getValueAt(int row, int col){
        switch (col){
            case 0: return getCheckCol(row);
            case 1: return getNazv(row);
            case 2: return getCost(row);
            case 3: return getPriceCost(row);
            case 4: return getAkcia(row);
            case 5: return getDiscount(row);
            default: return null;
        }
    }
    public int getColumnCount(){
        return 6;
    }
    public int getRowCount(){
        return Nazv.size();
    }
    public String getColumnName(int col){
	switch (col){
            case 0:
		return "Учитывать";
            case 1:
		return "Наименование";
            case 2:
		return "Цена";
            case 3:
		return "Цена прайса";
            case 4:
                return "Акция";
            case 5:
                return "Скидка";
            default:
		return "";
	}
    }
    public boolean isCellEditable(int row, int col){
        if (col==1 || col==2)
            return false;
        else
            return true;
    }
    public void setValueAt(Object Value, int row, int col){
	switch (col){
            case 0:
                setCheckCol((JCheckBox)Value, row);
		return;
            case 1:
                setNazv((String)Value, row);
		return;
            case 2:
                setCost((Double)Value, row);
		return;
            case 3:
                setPriceCost((Double)Value, row);
		return;
            case 4:
                setAkcia((JCheckBox)Value, row);
		return;
            case 5:
                setDiscount((Integer)Value, row);
		return;
	}
    }
    public int size(){
        return Nazv.size();
    }

}
