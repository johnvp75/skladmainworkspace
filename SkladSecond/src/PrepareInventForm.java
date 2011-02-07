
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
public class PrepareInventForm extends javax.swing.JDialog {

    /** Creates new form PriceChange */
    public PrepareInventForm(java.awt.Frame parent, boolean modal) {
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
        String[] nameColumn = new String[4];
        nameColumn[0]="Наименование";
        nameColumn[1]="Кол-во по учету";
        nameColumn[2]="Кол-во по факту";
        nameColumn[3]="Разница";
        priceTable = new javax.swing.JTable(new DefaultTableModel(nameColumn,0));
        printButton = new javax.swing.JButton();
        forNow = new javax.swing.JRadioButton();
        forDate = new javax.swing.JRadioButton();
        forNumb = new javax.swing.JRadioButton();
        Numbrest = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        DateRest = new com.toedter.calendar.JDateChooser();
        NumbYear = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ImpList = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
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

        priceTable.getColumnModel().getColumn(0).setMaxWidth(350);
        priceTable.getColumnModel().getColumn(1).setMaxWidth(60);
        priceTable.getColumnModel().getColumn(2).setMaxWidth(70);
        priceTable.getColumnModel().getColumn(3).setMaxWidth(60);
        jScrollPane2.setViewportView(priceTable);

        printButton.setText("Печать инвентаризационной ведомости");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        forNow.setSelected(true);
        forNow.setText("Текущие остатки");
        forNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forNowActionPerformed(evt);
            }
        });

        forDate.setText("Остатки на дату (начало дня)");
        forDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forDateActionPerformed(evt);
            }
        });

        forNumb.setText("По накладную (не включая)");
        forNumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forNumbActionPerformed(evt);
            }
        });

        Numbrest.setEnabled(false);
        Numbrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumbrestActionPerformed(evt);
            }
        });

        jButton1.setText("Поиск по части названия");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Сохранить документ");
        jButton2.setEnabled(false);

        jButton3.setText("Зарегистрировать документ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        DateRest.setDateFormatString("dd.MM.yyyy");
        DateRest.setEnabled(false);
        DateRest.setMaxSelectableDate(new java.util.Date(253370761300000L));
        DateRest.setMinSelectableDate(new java.util.Date(1230764500000L));
        DateRest.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateRestPropertyChange(evt);
            }
        });

        NumbYear.setEnabled(false);
        NumbYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NumbYearItemStateChanged(evt);
            }
        });
        NumbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumbYearActionPerformed(evt);
            }
        });

        jLabel2.setText("года");

        jButton4.setText("Импорт из накладных");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(ImpList);

        jButton5.setText("Найти следующее");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(forNow, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(forDate)
                                .addComponent(forNumb))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Numbrest, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DateRest, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                                    .addComponent(NumbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)))
                            .addGap(15, 15, 15)))
                    .addComponent(printButton)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(skladCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(forNow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forDate))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(forNumb)
                            .addComponent(Numbrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NumbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jButton1)
                        .addGap(7, 7, 7)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            rs=DataSet.QueryExec1("select distinct to_char(day,'YYYY') from document where not(day is null) order by to_char(day,'YYYY')", false);
            NumbYear.removeAllItems();
            while (rs.next()){
                NumbYear.addItem(rs.getString(1));
            }
            if (NumbYear.getItemCount()==0)
                return;
            NumbYear.setSelectedIndex(0);
            rs=DataSet.QueryExec("select d.id_doc, trim(d.note), trim(s.name) from document d, sklad s where id_client=(select id_client from client where name='Инвентаризация') and s.id_skl=d.id_skl", false);
            AbstractListModel model;
            final Vector<String> strings=new Vector<String>();
            int i=0;
            while (rs.next()){
                strings.add(rs.getString(2).substring(1) +"; "+rs.getString(1)+"; "+rs.getString(3));
            }
            model=new AbstractListModel() {
            public int getSize() { return strings.size(); }
            public Object getElementAt(int i) { return strings.elementAt(i); }
            };
            ImpList.setModel(model);
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

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            priceTable.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void forNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forNowActionPerformed
        forNow.setSelected(true);
        forDate.setSelected(false);
        forNumb.setSelected(false);
        DateRest.setEnabled(false);
        Numbrest.setEnabled(false);
        NumbYear.setEnabled(false);
        change();
    }//GEN-LAST:event_forNowActionPerformed

    private void forDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forDateActionPerformed
        forDate.setSelected(true);
        forNow.setSelected(false);
        forNumb.setSelected(false);
        DateRest.setEnabled(true);
        Numbrest.setEnabled(false);
        NumbYear.setEnabled(false);

    }//GEN-LAST:event_forDateActionPerformed

    private void forNumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forNumbActionPerformed
        forNow.setSelected(false);
        forDate.setSelected(false);
        forNumb.setSelected(true);
        DateRest.setEnabled(false);
        Numbrest.setEnabled(true);
        NumbYear.setEnabled(true);

        change();
    }//GEN-LAST:event_forNumbActionPerformed

    private void NumbrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumbrestActionPerformed
        change();
}//GEN-LAST:event_NumbrestActionPerformed

    private void NumbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumbYearActionPerformed
        change();
    }//GEN-LAST:event_NumbYearActionPerformed

    private void DateRestPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateRestPropertyChange
        change();
    }//GEN-LAST:event_DateRestPropertyChange

    private void NumbYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NumbYearItemStateChanged
        change();
    }//GEN-LAST:event_NumbYearItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        find(false,true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        find(true,true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object[] chooseO=ImpList.getSelectedValues();
        String[] choose=new String[chooseO.length];
        for (int i=0; i<chooseO.length;i++){
            choose[i]=(String)chooseO[i];
        }
        try{

            ResultSet rs;
            String SQL;
            for (int i=0; i<choose.length; i++){
                int start=choose[i].indexOf(";")+1;
                int finish=choose[i].indexOf(";", start);
                SQL=String.format("select trim(t.name), l.kol, l.rowid from tovar t, lines l where t.id_tovar=l.id_tovar and l.id_doc=%s", choose[i].substring(start,finish));
                rs=DataSet.QueryExec(SQL, false);
                while (rs.next()){
                    setFindStr(rs.getString(1));
                    int row=find(true,false);
                    if (row>-1){
                        Integer count=(new Integer((String)((DefaultTableModel)priceTable.getModel()).getValueAt(row, 2)))+rs.getInt(2);
                        ((DefaultTableModel)priceTable.getModel()).setValueAt(count.toString(), row, 2);
                        DataSet.UpdateQuery1(String.format("delete from lines where rowid='%s'", rs.getString(3)));
                    }
                }
            }
            SQL="select d.id_doc from document d, lines l where id_client=(select id_client from client where name='Инвентаризация') and l.id_doc(+)=d.id_doc and l.rowid is null";
            rs=DataSet.QueryExec(SQL, false);
            while (rs.next()){
                SQL=String.format("Delete from document where id_doc=%s", rs.getString(1));
                DataSet.UpdateQuery1(SQL);
            }
            rs=DataSet.QueryExec1("select d.id_doc, trim(d.note), trim(s.name) from document d, sklad s where id_client=(select id_client from client where name='Инвентаризация') and s.id_skl=d.id_skl", false);
            AbstractListModel model;
            final Vector<String> strings=new Vector<String>();
            int i=0;
            while (rs.next()){
                strings.add(rs.getString(2).substring(1) +"; "+rs.getString(1)+"; "+rs.getString(3));
            }
            model=new AbstractListModel() {
            public int getSize() { return strings.size(); }
            public Object getElementAt(int i) { return strings.elementAt(i); }
            };
            ImpList.setModel(model);
            
            JOptionPane.showMessageDialog(null, "Импорт завершен!");

        }catch(Exception e){
            try{
                JOptionPane.showMessageDialog(null, "Ошибка работы с базой данных.\n Данные в таблице не действительны!!!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                DataSet.rollback1();
            }catch(Exception e1){
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int rowcount=((DefaultTableModel)priceTable.getModel()).getRowCount();
        try{
            String day="";
            if (forNow.isSelected())
                day="sysdate";
            if (forDate.isSelected())
                day=String.format("to_date('%1$td.%1$tm.%1$tY','dd.mm.yyyy')", DateRest.getDate());
            if (forNumb.isSelected())
                day=String.format("(select day from document where numb=%2$s and id_type_doc=2 and to_char(day,'YYYY')='%1$s')",NumbYear.getSelectedItem(),Numbrest.getText());
            int numb=1;
            int id=1;
            String SQL="Select max(id_doc)+1 from document";
            ResultSet rs=DataSet.QueryExec(SQL, false);
            if (rs.next())
                id=rs.getInt(1);
            SQL="Select max(numb)+1 from document where id_type_doc=5";
            if (rs.next())
                numb=rs.getInt(1);
            rs=DataSet.QueryExec("select id_client from client where name='Корректировка остатков' and type=3", false);
            int id_client=0;
            if (rs.next())
                id_client = rs.getInt(1);
            else{
                DataSet.UpdateQuery1("insert into client (name, type) values ('Корректировка остатков', 3)");
                rs=DataSet.QueryExec("select id_client from client where name='Корректировка остатков' and type=3", false);
                rs.next();
                id_client = rs.getInt(1);
            }
            rs=DataSet.QueryExec("select id_val from curs_now where curs=1", false);
            rs.next();
            int id_val=rs.getInt(1);
            GregorianCalendar now=new GregorianCalendar();
            SQL=String.format("Insert into document (id_doc, id_type_doc, id_client, id_skl, id_manager, id_val, numb, day, sum, note, disc) select " +
                    "%1$s, 5, %2$s, id_skl, (select id_manager from manager where name = '%3$s'), %4$s, %5$s, %6$s, 0.00, 'Обнуление остатков %7$s', " +
                    "0 as disc from sklad where name='%8$s'", id, id_client, getManager(), id_val, numb, day, now.getTime().toString(),skladCombo.getSelectedItem());
            DataSet.UpdateQuery1(SQL);
            for (int i=0;i<rowcount;i++){
                Double in=(new Double((String)((DefaultTableModel)priceTable.getModel()).getValueAt(i, 1)));
                Double out=(new Double((String)((DefaultTableModel)priceTable.getModel()).getValueAt(i, 2)));
                Double result=in-out;
                
                String name=((String)((DefaultTableModel)priceTable.getModel()).getValueAt(i, 0));
                ((DefaultTableModel)priceTable.getModel()).setValueAt(result.toString(), i, 3);
                SQL=String.format("insert into lines (id_doc, kol, cost, disc, id_tovar) select %1$s, %2$s, 0, 0, id_tovar " +
                        "from tovar where name='%3$s'", id, result,name);
                DataSet.UpdateQuery1(SQL);

            }
            DataSet.commit1();
//            DataSet.rollback1();
            JOptionPane.showMessageDialog(null, "Данные записаны");

        }catch(Exception e){
           try{
                JOptionPane.showMessageDialog(null, "Ошибка работы с базой данных.\n Данные в таблице не действительны!!!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                DataSet.rollback1();
            }catch(Exception e1){
                e1.printStackTrace();
            }
            e.printStackTrace();

        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        try{
            DataSet.rollback1();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_formComponentHidden

    private int find (boolean next, boolean select){
        if (!next || getFindStr()==null)
            setFindStr(JOptionPane.showInputDialog("Введите часть строки:"));
        int rowcount=((DefaultTableModel)priceTable.getModel()).getRowCount();
        int row=priceTable.getSelectedRow();
        boolean present=false;
        int i=-1;
        for (i=row+1;i<rowcount;i++){
            int index=((DefaultTableModel)priceTable.getModel()).getValueAt(i, 0).toString().toUpperCase().indexOf(getFindStr().toUpperCase());
            if (index>-1){
                present=true;
//                priceTable.setEditingRow(index);
//                priceTable.setEditingColumn(2);
                if (select) {
                    priceTable.requestFocus();
                    priceTable.changeSelection(i, 2, false, false);
                    priceTable.editCellAt(i, 2);
                    ((JTextField)priceTable.getEditorComponent()).selectAll();
                }
                break;
            }
        }
        if (!present){
            for (i=0;i<row;i++){
                int index=((DefaultTableModel)priceTable.getModel()).getValueAt(i, 0).toString().toUpperCase().indexOf(getFindStr().toUpperCase());
                if (index>-1){
                    present=true;
//                    priceTable.setEditingRow(index);
//                    priceTable.setEditingColumn(2);
//                    priceTable.editCellAt(i, 2);
                    if (select){
                        priceTable.requestFocus();
                        priceTable.changeSelection(i, 2, false, false);
                        priceTable.editCellAt(i, 2);
                        ((JTextField)priceTable.getEditorComponent()).selectAll();
                    }
                    break;
                }
            }
        }
        if(!present){
            if (select)
                JOptionPane.showMessageDialog(null, "Ничего нет!", "Ненайдено", JOptionPane.INFORMATION_MESSAGE);
            i=-1;
        }
        return i;
    }
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
    private com.toedter.calendar.JDateChooser DateRest;
    private javax.swing.JList ImpList;
    private javax.swing.JComboBox NumbYear;
    private javax.swing.JTextField Numbrest;
    private javax.swing.JRadioButton forDate;
    private javax.swing.JRadioButton forNow;
    private javax.swing.JRadioButton forNumb;
    private javax.swing.JTree groupTree;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable priceTable;
    private javax.swing.JButton printButton;
    private javax.swing.JComboBox skladCombo;
    // End of variables declaration//GEN-END:variables
    private int Group = 0;
    private String findStr;
    protected String Manager;

    public String getManager() {
        return Manager;
    }

    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    public String getFindStr() {
        return findStr;
    }

    public void setFindStr(String findStr) {
        this.findStr = findStr;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int Group) {
        this.Group = Group;
    }

    private void change(){
        try{
//            priceTable.removeAll();
            ((DefaultTableModel)priceTable.getModel()).setRowCount(0);
            ResultSet rs;
            String SQL="";
            if (getGroup()==-2)
                SQL=String.format("select distinct trim(t.name) as name, nvl(tab.kol,0) from tovar t, kart k, (select trim(tv.name) as name, sum(l.kol*nvl2(nullif(2,t.operacia),1,(-1)) ) as kol from tovar tv ,lines l, document d, type_doc t  where " +
                            "l.id_doc = d.id_doc and d.id_type_doc=t.id_type_doc and t.operacia in (1,2) and tv.id_tovar=l.id_tovar and d.id_skl=(select id_skl from sklad where name = '%1$s')  group by trim(tv.name)) tab where t.id_tovar = k.id_tovar "+
                            "and k.id_skl=(select id_skl from sklad where name = '%1$s') and t.name=tab.name(+) order by name", skladCombo.getSelectedItem());
            else{
                if (forNow.isSelected())
                    SQL=String.format("select distinct trim(t.name) as name, nvl(tab.kol,0) from tovar t, kart k, (select id_group from groupid start with id_group=%1$s connect by prior id_group=parent_group) g, (select tv.name as name, "+
                        "sum(l.kol*nvl2(nullif(2,t.operacia),1,(-1)) ) as kol from tovar tv ,lines l, document d, type_doc t, (select distinct k.id_tovar from kart k, (select id_group from groupid start with id_group=%1$s connect by prior "+
                        "id_group=parent_group) g where k.id_group=g.id_group) g where l.id_doc = d.id_doc and d.id_type_doc=t.id_type_doc and t.operacia in (1,2) and l.id_tovar in g.id_tovar and tv.id_tovar=l.id_tovar and d.id_skl=(select "+
                        "id_skl from sklad where name = '%2$s')  group by tv.name) tab where t.id_tovar = k.id_tovar and k.id_group=g.id_group and t.name=tab.name(+) and k.id_skl=(select id_skl from sklad where name = '%2$s') order by name",
                        getGroup(),skladCombo.getSelectedItem());
                if (forDate.isSelected())
                    SQL=String.format("select distinct trim(t.name) as name, nvl(tab.kol,0) from tovar t, kart k, (select id_group from groupid start with id_group=%2$s connect by prior id_group=parent_group) g, (select tv.name as name, "+
                        "sum(l.kol*nvl2(nullif(2,t.operacia),1,(-1)) ) as kol from tovar tv ,lines l, document d, type_doc t, (select distinct k.id_tovar from kart k, (select id_group from groupid start with id_group=%2$s connect by prior "+
                        "id_group=parent_group) g where k.id_group=g.id_group) g where l.id_doc = d.id_doc and d.id_type_doc=t.id_type_doc and t.operacia in (1,2) and l.id_tovar in g.id_tovar and tv.id_tovar=l.id_tovar and d.id_skl=(select "+
                        "id_skl from sklad where name = '%1$s') and d.day<to_date('%3$td.%3$tm.%3$tY','dd.mm.yyyy')  group by tv.name) tab where t.id_tovar = k.id_tovar and k.id_group=g.id_group and t.name=tab.name(+) and k.id_skl=(select "+
                        "id_skl from sklad where name = '%1$s') order by name",skladCombo.getSelectedItem(),getGroup(),DateRest.getDate());
                if (forNumb.isSelected())
                    SQL=String.format("select distinct trim(t.name) as name, nvl(tab.kol,0) from tovar t, kart k, (select id_group from groupid start with id_group=%2$s connect by prior id_group=parent_group) g, (select tv.name as name, "+
                        "sum(l.kol*nvl2(nullif(2,t.operacia),1,(-1)) ) as kol from tovar tv ,lines l, document d, type_doc t, (select distinct k.id_tovar from kart k, (select id_group from groupid start with id_group=%2$s connect by prior "+
                        "id_group=parent_group) g where k.id_group=g.id_group) g where l.id_doc = d.id_doc and d.id_type_doc=t.id_type_doc and t.operacia in (1,2) and l.id_tovar in g.id_tovar and tv.id_tovar=l.id_tovar and d.id_skl=(select "+
                        "id_skl from sklad where name = '%3$s') and (d.day<(select day from document where numb=%4$s and id_type_doc=2 and to_char(day,'YYYY')='%1$s'))  group by tv.name) tab where t.id_tovar = k.id_tovar and k.id_group=g.id_group "+
                        "and t.name=tab.name(+) and k.id_skl=(select id_skl from sklad where name = '%3$s') order by name", NumbYear.getSelectedItem(),getGroup(), skladCombo.getSelectedItem(),Numbrest.getText());
                }
            rs=DataSet.QueryExec(SQL, false);
            while (rs.next()){
                String[] rowData=new String[4];
                rowData[0]=rs.getString(1);
//              Number form =new Number();
                rowData[1]=((new DecimalFormat("0.0")).format(rs.getDouble(2)));
                rowData[2]="0";
                rowData[3]="0";
                int RowCount=((DefaultTableModel)priceTable.getModel()).getRowCount();
                ((DefaultTableModel)priceTable.getModel()).insertRow(RowCount, rowData);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
