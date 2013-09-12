
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Main
 */
public class MyTable extends JTable {
    
    public MyTable(){
        super();
    }
    
    @Override
    public void tableChanged(TableModelEvent e) {
        int columnCount=getColumnCount();
        int columnSize[]=new int[columnCount];
        for(int i=0;i<columnCount;i++){
            columnSize[i]=getColumnModel().getColumn(i).getWidth();
        }
        super.tableChanged(e);
        for(int i=1;i<columnCount;i++){
            getColumnModel().getColumn(i).setWidth(columnSize[i]);
        }
     
        //super.tableChanged(null);
    }
    
}
