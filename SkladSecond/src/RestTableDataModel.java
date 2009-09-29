
import java.lang.Class;
import java.lang.Object;
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
public class RestTableDataModel extends AbstractTableModel{

    private Vector<Boolean> CheckCol;
    private Vector<String> Nazv;
    private Vector<Double> Rest;
    private Vector<Double> NewRest;

    public RestTableDataModel() {
        CheckCol=new Vector<Boolean>(0);
        Nazv=new Vector<String>(0);
        Rest=new Vector<Double>(0);
        NewRest=new Vector<Double>(0);
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

    private Double getRest(int pos) {
        return Rest.get(pos);
    }
    private void setRest(Double aCost, int pos) {
        Rest.setElementAt(aCost, pos);
    }
    private void addRest(Double aCost){
        Rest.add(aCost);
    }
    private void removeRest(int pos){
        Rest.removeElementAt(pos);
    }

    private Double getNewRest(int pos) {
        return NewRest.get(pos);
    }
    private void setNewRest(Double aCost, int pos) {
        NewRest.setElementAt(aCost, pos);
    }
    private void addNewRest(Double aCost){
        NewRest.add(aCost);
    }
    private void removeNewRest(int pos){
        NewRest.removeElementAt(pos);
    }


    public void add(String aNazv, double aRest, double aNewRest){
        addCheckCol(false);
        addNazv(aNazv);
        addRest(new Double(aRest));
        addNewRest(new Double(aNewRest));
        fireTableDataChanged();
    }
    public void remove(int row){
        removeCheckCol(row);
        removeRest(row);
        removeNazv(row);
        removeNewRest(row);
        fireTableDataChanged();
    }
    public void removeAll(){
        CheckCol.removeAllElements();
        Rest.removeAllElements();
        Nazv.removeAllElements();
        NewRest.removeAllElements();
        fireTableDataChanged();
    }
    public Object getValueAt(int row, int col){
        switch (col){
            case 0: return (Boolean)getCheckCol(row);
            case 1: return getNazv(row);
            case 2: return getRest(row);
            case 3: return getNewRest(row);
            default: return null;
        }
    }
    public int getColumnCount(){
        return 7;
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
		return "Остаток";
            case 3:
        	return "Новій остаток";
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
                setCheckCol((Boolean)Value, row);
                fireTableDataChanged();
		return;
            case 1:
                setNazv((String)Value, row);
                fireTableDataChanged();
                return;
            case 2:
                setRest((Double)Value, row);
                fireTableDataChanged();
                return;
            case 3:
                setNewRest(new Double((String)Value), row);
                fireTableDataChanged();
                return;
	}
    }
    public int size(){
        return Nazv.size();
    }
    public Class getColumnClass(int col){
/*        switch (col){
            case 0:
		return (Object)java.lang.Boolean ;
            case 1:
                return Class.forName("Object");
            case 2:
                return Class.forName("Object");
            case 3:
                return Class.forName("Object");
            case 4:
		return Class.forName("Boolean");
            case 5:
                return Class.forName("Object");
        }
*/
        return (col == 0) ? Boolean.class : super.getColumnClass(col);
    }

}
