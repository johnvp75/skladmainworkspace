
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PriceChange.java
 *
 * Created on 13 серп 2009, 12:19:54
 */

/**
 *
 * @author Admin
 */
public class RestChange extends javax.swing.JDialog {

    /** Creates new form PriceChange */
    public RestChange(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        skladCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        groupTree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        restTable = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        selectAllButton = new javax.swing.JButton();
        unselectButton = new javax.swing.JButton();
        selectNullButton = new javax.swing.JButton();
        invertButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        endDay = new javax.swing.JTextField();
        endNumb = new javax.swing.JTextField();
        dayCheck = new javax.swing.JRadioButton();
        numbCheck = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Склад:");

        skladCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        groupTree.setModel(new GroupTreeModel());
        groupTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                groupTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(groupTree);

        restTable.setModel(new RestTableDataModel());
        jScrollPane2.setViewportView(restTable);

        saveButton.setText("Сохранить");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Закрыть");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        selectAllButton.setText("Отметить все");
        selectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllButtonActionPerformed(evt);
            }
        });

        unselectButton.setText("Убрать все");
        unselectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unselectButtonActionPerformed(evt);
            }
        });

        selectNullButton.setText("Отметить нулевые");
        selectNullButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNullButtonActionPerformed(evt);
            }
        });

        invertButton.setText("Инвертировать");
        invertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Фильтр");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        endDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDayActionPerformed(evt);
            }
        });
        endDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                endDayFocusLost(evt);
            }
        });

        endNumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endNumbActionPerformed(evt);
            }
        });
        endNumb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                endNumbFocusLost(evt);
            }
        });

        dayCheck.setText("На дату (на начало дня):");
        dayCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayCheckActionPerformed(evt);
            }
        });

        numbCheck.setText("По расх. накладную (не включ.)");
        numbCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbCheckActionPerformed(evt);
            }
        });

        jLabel2.setText("Год:");

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });
        yearComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearComboBoxFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(skladCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(selectAllButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                            .addComponent(unselectButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(selectNullButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(invertButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(11, 11, 11))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(closeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dayCheck)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numbCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(endDay, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endNumb)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(skladCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayCheck)
                    .addComponent(endDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numbCheck)
                    .addComponent(endNumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(saveButton)
                        .addGap(42, 42, 42)
                        .addComponent(closeButton)
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectAllButton)
                        .addGap(18, 18, 18)
                        .addComponent(unselectButton)
                        .addGap(18, 18, 18)
                        .addComponent(selectNullButton)
                        .addGap(18, 18, 18)
                        .addComponent(invertButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try{
            DataSet.UpdateQuery("lock table document in exclusive mode");
            int numb=1;
            ResultSet rs=DataSet.QueryExec("select max(numb) from document where id_type_doc=5", false);
            if (rs.next())
                numb=rs.getInt(1)+1;
            rs=DataSet.QueryExec("select id_client from client where name='Корректировка остатков' and type=3", false);
            int id_client=0;
            if (rs.next())
                id_client = rs.getInt(1);
            else{
                DataSet.UpdateQuery("insert into client (name, type) values ('Корректировка остатков', 3)");
                rs=DataSet.QueryExec("select id_client from client where name='Корректировка остатков' and type=3", false);
                rs.next();
                id_client = rs.getInt(1);
            }
            rs=DataSet.QueryExec("select id_val from curs_now where curs=1", false);
            rs.next();
            int id_val=rs.getInt(1);
            GregorianCalendar now=new GregorianCalendar();
            rs= DataSet.QueryExec("select max(id_doc)+1 from document", false);
            rs.next();
            int id_doc=rs.getInt(1);

            String SQL="insert into document (id_doc, id_type_doc, id_client, id_skl, id_manager, id_val, numb, day, sum, note, disc) " +
                    "select "+id_doc+" as id_doc, 5 as id_type_doc, "+id_client+" as id_client, " +
                    "id_skl, " +
                    "(select id_manager from manager where name = '"+getManager()+"') as id_manager, " +id_val+
                    " as id_val, "+numb+" as numb, ";
            if (dayCheck.isSelected())
                SQL=SQL+"to_date('"+endDay.getText()+"','DD/MM/YYYY') as day,";
            if (numbCheck.isSelected())
                SQL=SQL+"(select day from document where numb="+endNumb.getText()+" and id_type_doc=2 and to_char(day,'YYYY')='"+(String)yearComboBox.getSelectedItem()+"') as day, ";
            SQL=SQL+"0.00 as sum, 'Обнуление остатков "+now.getTime().toString()+"' as note, 0 as disc from sklad where name='"+skladCombo.getSelectedItem()+"'";
            DataSet.UpdateQuery(SQL);
            boolean roll=true;
                for (int i=0; i<restTable.getModel().getRowCount();i++)
                    if ((Boolean)restTable.getModel().getValueAt(i, 0)){
                        roll=false;
                        double kol=(Double)restTable.getModel().getValueAt(i, 2)-(Double)restTable.getModel().getValueAt(i, 3);
                        DataSet.UpdateQuery("insert into lines (id_doc, kol, cost, disc, id_tovar) select "+id_doc+" as id_doc, "+kol+" as kol, 0 as cost, 0 as disc, id_tovar " +
                            "from tovar where name='"+restTable.getModel().getValueAt(i, 1)+"'");
                    }
            if (roll)
                DataSet.rollback();
            else
                DataSet.commit();
        }catch(Exception e){
            try{
                DataSet.rollback();
            }catch(Exception exp){
                exp.printStackTrace();
            }
            e.printStackTrace();
        }

}//GEN-LAST:event_saveButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        ((RestTableDataModel)restTable.getModel()).removeAll();
        setVisible(false);
}//GEN-LAST:event_closeButtonActionPerformed

    private void groupTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_groupTreeValueChanged
        setGroup(((DataNode)evt.getPath().getLastPathComponent()).getIndex());
        change();
    }//GEN-LAST:event_groupTreeValueChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
            ResultSet rs=DataSet.QueryExec("Select trim(name) from sklad order by UPPER(trim(name))", false);
            skladCombo.removeAllItems();
            while (rs.next()){
                skladCombo.addItem(rs.getString(1));
            }
            if (skladCombo.getItemCount()==0)
                return;
            skladCombo.setSelectedIndex(0);
            rs=DataSet.QueryExec("Select distinct to_char(day,'YYYY') from document where not(day is null)", false);
            yearComboBox.removeAllItems();
            while (rs.next()){
                yearComboBox.addItem(rs.getString(1));
            }
            if (yearComboBox.getItemCount()==0)
                return;
            yearComboBox.setSelectedIndex(yearComboBox.getItemCount()-1);

        }catch(Exception e){
            e.printStackTrace();
        }
        ActionListener actionCombo= new ActionListener(){
            public void actionPerformed(ActionEvent event){
                change();
            }
        };
        skladCombo.addActionListener(actionCombo);
    }//GEN-LAST:event_formComponentShown

    private void selectAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllButtonActionPerformed
        for (int i=0;i<((RestTableDataModel)restTable.getModel()).size();i++){
            restTable.setValueAt(true, i, 0);
        }
    }//GEN-LAST:event_selectAllButtonActionPerformed

    private void unselectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unselectButtonActionPerformed
        for (int i=0;i<((RestTableDataModel)restTable.getModel()).size();i++){
            restTable.setValueAt(false, i, 0);
        }

    }//GEN-LAST:event_unselectButtonActionPerformed

    private void selectNullButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNullButtonActionPerformed
        for (int i=0;i<((RestTableDataModel)restTable.getModel()).size();i++){
            if (((Double)restTable.getValueAt(i, 3))==0)
                restTable.setValueAt(true, i, 0);
        }
    }//GEN-LAST:event_selectNullButtonActionPerformed

    private void invertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertButtonActionPerformed
        for (int i=0;i<((RestTableDataModel)restTable.getModel()).size();i++){
            if ((Boolean)restTable.getValueAt(i, 0))
                restTable.setValueAt(false, i, 0);
            else
                restTable.setValueAt(true, i, 0);
        }

    }//GEN-LAST:event_invertButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String str=JOptionPane.showInputDialog("Введите часть названия для фильтра");
        for (int i=0;i<((RestTableDataModel)restTable.getModel()).size();i++){
            if (((String)restTable.getValueAt(i, 1)).toUpperCase().indexOf(str.toUpperCase())>-1)
                restTable.setValueAt(true, i, 0);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void dayCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayCheckActionPerformed
        dayCheck.setSelected(true);
        numbCheck.setSelected(false);
        if (endDay.getText().length()>0)
            change();
    }//GEN-LAST:event_dayCheckActionPerformed

    private void numbCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numbCheckActionPerformed
        dayCheck.setSelected(false);
        numbCheck.setSelected(true);
        if (endNumb.getText().length()>0)
            change();
    }//GEN-LAST:event_numbCheckActionPerformed

    private void endDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDayActionPerformed
        if (dayCheck.isSelected())
            change();
    }//GEN-LAST:event_endDayActionPerformed

    private void endDayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_endDayFocusLost
        if (dayCheck.isSelected())
            change();
    }//GEN-LAST:event_endDayFocusLost

    private void endNumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endNumbActionPerformed
        if (numbCheck.isSelected())
            change();
    }//GEN-LAST:event_endNumbActionPerformed

    private void endNumbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_endNumbFocusLost
        if (numbCheck.isSelected())
            change();
    }//GEN-LAST:event_endNumbFocusLost

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        if (numbCheck.isSelected())
            change();
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void yearComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearComboBoxFocusLost
         if (numbCheck.isSelected())
            change();
    }//GEN-LAST:event_yearComboBoxFocusLost

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PriceChange dialog = new PriceChange(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JRadioButton dayCheck;
    private javax.swing.JTextField endDay;
    private javax.swing.JTextField endNumb;
    private javax.swing.JTree groupTree;
    private javax.swing.JButton invertButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton numbCheck;
    private javax.swing.JTable restTable;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton selectAllButton;
    private javax.swing.JButton selectNullButton;
    private javax.swing.JComboBox skladCombo;
    private javax.swing.JButton unselectButton;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables
    private int Group = 0;
    protected String Manager;

    public String getManager() {
        return Manager;
    }

    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int Group) {
        this.Group = Group;
    }
    private void change(){
        try{
            ((RestTableDataModel)restTable.getModel()).removeAll();
            String SQL="";
            if (!(dayCheck.isSelected() || numbCheck.isSelected()))
                return;
            if (dayCheck.isSelected())
//                SQL="d.day<'"+endDay.getText()+"'";
                SQL="d.day<to_date('"+endDay.getText()+"','DD.MM.YYYY')";
            if (numbCheck.isSelected())
                SQL="d.day<(select day from document where numb="+endNumb.getText()+" and id_type_doc=2 and to_char(day,'YYYY')='"+(String)yearComboBox.getSelectedItem()+"')";
            SQL="Select * from (" +
                    "select nvl(ot.prihod,0) - nvl(ot.real,0),  trim(t.name) as name from tovar t, " +
                    " (select t1.prihod , t2.real,  greatest(nvl(t1.id,0), nvl(t2.id,0)) as id from " +
                    " (select sum(l.kol) as prihod, l.id_tovar as id from lines l, document d, " +
                    " (select DISTINCT id_tovar from tovar WHERE id_tovar in (select id_tovar FROM kart WHERE id_group in (select id_group FROM groupid start with " +
                    " id_group="+getGroup()+" CONNECT BY prior id_group=parent_group) and id_skl=(select id_skl from sklad where name='"+skladCombo.getSelectedItem()+"'))) id where "+SQL+
                    " and d.id_type_doc in (select id_type_doc from type_doc where type_doc.operacia=1) and not (d.numb is null) and d.id_doc= l.id_doc and l.id_tovar=id.id_tovar GROUP BY l.id_tovar) t1" +
                    " right join (select sum(l.kol) as real, l.id_tovar as id from lines l, document d, " +
                    " (select DISTINCT id_tovar from tovar WHERE id_tovar in (select id_tovar FROM kart WHERE id_group in (select id_group FROM groupid start with " +
                    " id_group="+getGroup()+" CONNECT BY prior id_group=parent_group) and id_skl=(select id_skl from sklad where name='"+skladCombo.getSelectedItem()+"'))) id where "+SQL+
                    " and d.id_type_doc in (select id_type_doc from type_doc where type_doc.operacia=2) and not (d.numb is null) and d.id_doc= l.id_doc and l.id_tovar=id.id_tovar GROUP BY l.id_tovar) t2 on t2.id=t1.id) ot " +
                    " where ot.id=t.id_tovar" +
                    " union" +
                    " select nvl(ot.prihod,0) - nvl(ot.real,0),  trim(t.name) as name from tovar t, " +
                    " (select t1.prihod , t2.real, greatest(nvl(t1.id,0), nvl(t2.id,0)) as id from " +
                    " (select sum(l.kol) as prihod, l.id_tovar as id from lines l, document d, " +
                    " (select DISTINCT id_tovar from tovar WHERE id_tovar in (select id_tovar FROM kart WHERE id_group in (select id_group FROM groupid start with " +
                    " id_group="+getGroup()+" CONNECT BY prior id_group=parent_group) and id_skl=(select id_skl from sklad where name='"+skladCombo.getSelectedItem()+"'))) id where " +SQL+
                    " and d.id_type_doc in (select id_type_doc from type_doc where type_doc.operacia=1) and not (d.numb is null)  and d.id_doc= l.id_doc and l.id_tovar=id.id_tovar GROUP BY l.id_tovar) t1" +
                    " left join (select sum(l.kol) as real, l.id_tovar as id from lines l, document d, " +
                    " (select DISTINCT id_tovar from tovar WHERE id_tovar in (select id_tovar FROM kart WHERE id_group in (select id_group FROM groupid start with " +
                    " id_group="+getGroup()+" CONNECT BY prior id_group=parent_group) and id_skl=(select id_skl from sklad where name='"+skladCombo.getSelectedItem()+"'))) id where "+SQL+
                    " and d.id_type_doc in (select id_type_doc from type_doc where type_doc.operacia=2) and not (d.numb is null)  and d.id_doc= l.id_doc and l.id_tovar=id.id_tovar GROUP BY l.id_tovar) t2 on t2.id=t1.id) ot " +
                    " where ot.id=t.id_tovar) order by name";
            ResultSet rs=DataSet.QueryExec(SQL, false);
            while (rs.next())
                ((RestTableDataModel)restTable.getModel()).add(rs.getString(2), rs.getDouble(1), 0.00);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
