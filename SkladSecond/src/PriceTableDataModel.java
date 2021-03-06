
import java.util.Vector;
//import javax.swing.Boolean;
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

    private Vector<Boolean> CheckCol;
    private Vector<String> Nazv;
    private Vector<Double> Cost;
    private Vector<Double> PriceCost;
    private Vector<Double> NewCost;
    private Vector<Boolean> Akcia;
    private Vector<Integer> Discount;

    public PriceTableDataModel() {
        CheckCol=new Vector<Boolean>(0);
        Nazv=new Vector<String>(0);
        Cost=new Vector<Double>(0);
        PriceCost=new Vector<Double>(0);
        NewCost=new Vector<Double>(0);
        Akcia=new Vector<Boolean>(0);
        Discount=new Vector<Integer>(0);
    }

    private Boolean getCheckCol(int pos) {
        return CheckCol.get(pos);
    }
    private void setCheckCol(Boolean CheckBox, int pos) {
        CheckCol.setElementAt(CheckBox, pos);
    }
    private void addCheckCol(Boolean CheckBox){
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
    private Double getNewCost(int pos) {
        return NewCost.get(pos);
    }
    private void setNewCost(Double aCost, int pos) {
        NewCost.setElementAt(aCost, pos);
    }
    private void addNewCost(Double aCost){
        NewCost.add(aCost);
    }
    private void removeNewCost(int pos){
        NewCost.removeElementAt(pos);
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

    private Boolean getAkcia(int pos) {
        return Akcia.get(pos);
    }
    private void setAkcia(Boolean CheckBox, int pos) {
        Akcia.setElementAt(CheckBox, pos);
    }
    private void addAkcia(Boolean CheckBox){
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

    public void add(String aNazv, double aCost, double aPriceCost, double aNewCost,boolean isAkcia, int aDisc){
        addCheckCol(false);
        addNazv(aNazv);
        addCost(new Double(aCost));
        addPriceCost(new Double(aPriceCost));
        addNewCost(new Double(aNewCost));
        addAkcia(isAkcia);
        addDiscount(new Integer(aDisc));
        fireTableDataChanged();
    }
    public void remove(int row){
        removeCheckCol(row);
        removeCost(row);
        removeNazv(row);
        removePriceCost(row);
        removeNewCost(row);
        removeAkcia(row);
        removeDiscount(row);
        fireTableDataChanged();
    }
    public void removeAll(){
        CheckCol.removeAllElements();
        Cost.removeAllElements();
        Nazv.removeAllElements();
        PriceCost.removeAllElements();
        NewCost.removeAllElements();
        Akcia.removeAllElements();
        Discount.removeAllElements();
        fireTableDataChanged();
    }
    @Override
    public Object getValueAt(int row, int col){
        switch (col){
            case 0: return (Boolean)getCheckCol(row);
            case 1: return getNazv(row);
            case 2: return getCost(row);
            case 3: return getPriceCost(row);
            case 4: return getNewCost(row);
            case 5: return (getAkcia(row)).booleanValue();
            case 6: return getDiscount(row);
            default: return null;
        }
    }
    @Override
    public int getColumnCount(){
        return 7;
    }
    @Override
    public int getRowCount(){
        return Nazv.size();
    }
    @Override
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
                return "Новая цена";
            case 5:
                return "Акция";
            case 6:
                return "Скидка";
            default:
		return "";
	}
    }
    @Override
    public boolean isCellEditable(int row, int col){
        if (col==1 || col==2 || col==3)
            return false;
        else
            return true;
    }
    @Override
    public void setValueAt(Object Value, int row, int col){
	switch (col){
            case 0:
                setCheckCol((Boolean)Value, row);
                fireTableDataChanged();
		return;
            case 1:
                setNazv((String)Value, row);
                fireTableDataChanged();
                return;
            case 2:
                setCost((Double)Value, row);
                fireTableDataChanged();
                return;
            case 3:
                setPriceCost(new Double((String)Value), row);
                fireTableDataChanged();
                return;
            case 4:
                setNewCost(new Double((String)Value), row);
                fireTableDataChanged();
                return;
            case 5:
                setAkcia((Boolean)Value, row);
                fireTableDataChanged();
                return;
            case 6:
                setDiscount(new Integer((String)Value), row);
                fireTableDataChanged();
                return;
	}
    }
    public int size(){
        return Nazv.size();
    }
    @Override
    public Class getColumnClass(int col){
        return (col == 0 || col==5) ? Boolean.class : super.getColumnClass(col);
    }

    public String getCommaSeparatedNames(){
        String CommaSeparatedNames="";
        if (getRowCount()>0)
            CommaSeparatedNames=String.format("'%s'", getNazv(0));
        for (int i=1; i<getRowCount(); i++)
            if (CommaSeparatedNames.indexOf(String.format("'%s'", getNazv(i)))==-1)
                CommaSeparatedNames=CommaSeparatedNames+String.format(", '%s'", getNazv(i));
        return CommaSeparatedNames;
    }

    public void setPriceCostAndAkciaByName(String name,double priceCost, boolean akcia, int discount){
        int pos=Nazv.indexOf(name);
        int startPos=pos+1;
        while (pos>-1){
            setPriceCost(priceCost, pos);
            setAkcia(akcia, pos);
            setDiscount(discount, pos);
            pos=Nazv.indexOf(name,startPos);
            startPos=pos+1;
        }
        fireTableDataChanged();
    }

}
