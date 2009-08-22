
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Жека
 */
public class EditTableModel extends AbstractTableModel{
    private Vector<String> Client;
    private Vector<String> Sklad;
    private Vector<String> Sum;
    private Vector<Integer> id_Doc;

    public EditTableModel(Vector<String> aClient, Vector<String> aSklad, Vector<String> aSum, Vector<Integer> aid_Doc){
        Client=new Vector<String>(0);
        Client=aClient;
        Sklad=new Vector<String>(0);
        Sklad=aSklad;
        Sum=new Vector<String>(0);
        Sum=aSum;
        id_Doc=new Vector<Integer>(0);
        id_Doc=aid_Doc;
    }
    public Object getValueAt(int row, int col){
        switch(col){
            case 0:return Client.elementAt(row);
            case 1:return Sklad.elementAt(row);
            case 2:return Sum.elementAt(row);
            default: return null;
        }
    }
    public int getColumnCount(){
        return 3;
    }
    public int getRowCount(){
        return Sum.size();
    }
    public String getColumnName(int col){
	switch (col){
            case 0:
		return "Клиент";
            case 1:
		return "Склад";
            case 2:
		return "Сумма";
            default:
		return "";
	}
    }
    public boolean isCellEditable(int row, int col){
        return false;
    }
    public int getId(int row){
        return id_Doc.elementAt(row);
    }


}
