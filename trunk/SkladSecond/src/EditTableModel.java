
import java.sql.Date;
import java.sql.ResultSet;
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
    private Vector<String> Client=new Vector<String>(0) ;
    private Vector<String> Sklad=new Vector<String>(0);
    private Vector<String> Sum=new Vector<String>(0);
    private Vector<Integer> id_Doc=new Vector<Integer>(0);
    private Vector<String> note=new Vector<String>(0);
    private Vector<String> val=new Vector<String>(0);
    private Vector<Date> date=new Vector<Date>(0);
    private Vector<String> type_doc=new Vector<String>(0);
    private Vector<Integer> numb=new Vector<Integer>(0);
    private Vector<String> manager=new Vector<String>(0);


    public EditTableModel(String Where){
/*
        Client=new Vector<String>(0);
        Client=aClient;
        Sklad=new Vector<String>(0);
        Sklad=aSklad;
        Sum=new Vector<String>(0);
        Sum=aSum;
        id_Doc=new Vector<Integer>(0);
        id_Doc=aid_Doc;
 *
 */
        update(Where+" and 1=2 ");
    }
    public void update(String Where){
                Client.clear();
                Sklad.clear();
                Sum.clear();
                id_Doc.clear();
                note.clear();
                val.clear();
                date.clear();
                type_doc.clear();
                numb.clear();
                manager.clear();
        try {
            String SQL="select trim(c.name), trim(s.name), d.sum, d.id_doc, trim(d.note), trim(v.name)," +
                    " d.day, trim(t.name), d.numb, trim(m.name) from document d, client c, sklad s, val v, type_doc t, manager m where " +
                    " d.id_client=c.id_client and d.id_skl=s.id_skl and d.id_val=v.id_val and d.id_type_doc=t.id_type_doc and " +
                    "d.id_manager=m.id_manager "+Where+" order by d.day";
            ResultSet rs=DataSet.QueryExec1(SQL, false);
            while (rs.next()){
                Client.add(rs.getString(1));
                Sklad.add(rs.getString(2));
                Sum.add(rs.getString(3));
                id_Doc.add(rs.getInt(4));
                note.add(rs.getString(5));
                val.add(rs.getString(6));
                date.add(rs.getDate(7));
                type_doc.add(rs.getString(8));
                numb.add(rs.getInt(9));
                manager.add(rs.getString(10));

            }
            fireTableDataChanged();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public Object getValueAt(int row, int col){
        switch(col){
            case 0:return type_doc.elementAt(row);
            case 1:return numb.elementAt(row);
            case 2:return Client.elementAt(row);
            case 3:return Sklad.elementAt(row);
            case 4:return Sum.elementAt(row);
            case 5:return val.elementAt(row);
            case 6:return date.elementAt(row);
            case 7:return manager.elementAt(row);
            case 8:return note.elementAt(row);
            default: return null;
        }
    }
    public int getColumnCount(){
        return 9;
    }
    public int getRowCount(){
        return Sum.size();
    }
    public String getColumnName(int col){
	switch (col){
            case 0:
		return "Вид документа";
            case 1:
		return "Номер";
            case 2:
		return "Контрагент";
            case 3:
		return "Склад";
            case 4:
		return "Сумма";
            case 5:
		return "Валюта";
            case 6:
		return "Дата";
            case 7:
		return "Менеджер";
            case 8:
		return "Примечание";
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

    public void deleteRowFromModel(int row){
        type_doc.removeElementAt(row);
        numb.removeElementAt(row);
        Client.removeElementAt(row);
        Sklad.removeElementAt(row);
        Sum.removeElementAt(row);
        val.removeElementAt(row);
        date.removeElementAt(row);
        manager.removeElementAt(row);
        note.removeElementAt(row);
        id_Doc.removeElementAt(row);
        fireTableStructureChanged();
    }

    public void removeAll(){
        Client.clear();
        Sklad.clear();
        Sum.clear();
        id_Doc.clear();
        note.clear();
        val.clear();
        date.clear();
        type_doc.clear();
        numb.clear();
        manager.clear();
        fireTableDataChanged();

    }
}
