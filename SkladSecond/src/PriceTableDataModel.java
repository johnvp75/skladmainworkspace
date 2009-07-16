
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

    public JCheckBox getCheckCol(int pos) {
        return CheckCol.get(pos);
    }
    public void setCheckCol(JCheckBox CheckBox, int pos) {
        CheckCol.setElementAt(CheckBox, pos);
    }
    public void addCheckCol(JCheckBox CheckBox){
        CheckCol.add(CheckBox);
    }
    public void removeCheckCol(int pos){
        CheckCol.remove(pos);
    }

    public String getNazv(int pos) {
        return Nazv.get(pos);
    }
    public void setNazv(String aNazv, int pos) {
        Nazv.setElementAt(aNazv, pos);
    }
    public void addNazv(String aNazv){
        Nazv.add(aNazv);
    }
    public void removeNazv(int pos){
        Nazv.remove(pos);
    }

    public Double getCost(int pos) {
        return Cost.get(pos);
    }
    public void setCost(Double aCost, int pos) {
        Cost.setElementAt(aCost, pos);
    }
    public void addCost(Double aCost){
        Cost.add(aCost);
    }
    public void removeCost(int pos){
        Cost.remove(pos);
    }

    public Double getPriceCost(int pos) {
        return PriceCost.get(pos);
    }
    public void setPriceCost(Double aCost, int pos) {
        PriceCost.setElementAt(aCost, pos);
    }
    public void addPriceCost(Double aCost){
        PriceCost.add(aCost);
    }
    public void removePriceCost(int pos){
        PriceCost.remove(pos);
    }


    public PriceTableDataModel() {
        CheckCol=new Vector<JCheckBox>(0);
        Nazv=new Vector<String>(0);
        Cost=new Vector<Double>(0);
        PriceCost=new Vector<Double>(0);
    }
    public Object getValueAt(int row, int col){
        switch (col){
            case 0: return getCheckCol(row);
            case 1: return getNazv(row);
            case 2: return getCost(row);
            case 3: return getPriceCost(row);
            default: return null;
        }
    }
    public int getColumnCount(){
        return 4;
    }
    public int getRowCount(){
        return Nazv.size();
    }
    public String getColumnName(int column){
	switch (column){
            case 0:
		return "Учитывать";
            case 1:
		return "Наименование";
            case 2:
		return "Цена";
            case 3:
		return "Цена прайса";
            default:
		return "";
	}
    }
    public boolean isCellEditable(int row, int col){
        if (col==0 || col==3)
            return true;
        else
            return false;
    }

}
