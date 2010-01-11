/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Vector;
import javax.swing.AbstractListModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Р–РµРєР°
 */

public class DataListModel extends AbstractListModel{
    private Vector<BarCodeData> data;
    public DataListModel(){
        data = new Vector<BarCodeData>(0);
    }
    public Object getElementAt(int pos){
        if (pos<0 && pos==getSize())
            return -1;
        else
            return data.get(pos).Name;
    }
    public BarCodeData getDataAt(int pos){
        if (pos<0 && pos==getSize())
            return null;
        else
            return data.get(pos);
    }
    public int getSize(){
        return data.size();
    }
    public void add(BarCodeData aValue){
        data.add(aValue);
        fireContentsChanged(this, 0, getSize()-1);

    }
    public void remove(int pos){
        data.remove(pos);
        fireContentsChanged(this, 0, getSize()-1);
    }
    public int pos(String aValue){
        int ret=-1;
        for (int i=0;i<getSize();i++){
            if (data.get(i).Name.equals(aValue))
                ret=i;
        }
        return ret;
    }
    public void removeAll(){
        data.clear();
        fireContentsChanged(this, 0, getSize()-1);
    }

}



