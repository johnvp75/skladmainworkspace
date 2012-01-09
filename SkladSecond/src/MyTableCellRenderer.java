
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class MyTableCellRenderer extends DefaultTableCellRenderer {
    final private int oldValueColumn;
    final private int newValueColumn;
    
    public MyTableCellRenderer(int oldValueColumn, int newValueColumn){
        this.oldValueColumn=oldValueColumn;
        this.newValueColumn=newValueColumn;
    }
    
    @Override    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
    boolean hasFocus, int row, int col){
     Component comp = super.getTableCellRendererComponent(
             table,  value, isSelected, hasFocus, row, col);
     double oldValue=Double.parseDouble(table.getValueAt(row, oldValueColumn).toString());
     double newValue=Double.parseDouble(table.getValueAt(row, newValueColumn).toString());
     if(oldValue>newValue) 
     {     
         comp.setBackground(Color.green); 
     } else {
         if (oldValue<newValue){
             comp.setBackground(Color.red);
         }else{
             comp.setBackground(null);
         }
         
     }     
     return( comp );
    }
}
