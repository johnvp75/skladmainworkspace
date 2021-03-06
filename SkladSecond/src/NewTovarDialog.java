
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewTovarDialog.java
 *
 * Created on 13.07.2009, 15:40:37
 */

/**
 *
 * @author Admin
 */
public class NewTovarDialog extends javax.swing.JDialog {

    /** Creates new form NewTovarDialog */
    public NewTovarDialog(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new JLabel();
        nameTextField = new JTextField();
        jLabel2 = new JLabel();
        countTextField = new JTextField();
        jSeparator1 = new JSeparator();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        barcodeTextField = new JTextField();
        jScrollPane1 = new JScrollPane();
        barcodeList = new JList();
        generateButton = new JButton();
        okButton = new JButton();
        cancellButton = new JButton();
        deleteButton = new JButton();
        jLabel5 = new JLabel();
        CodeCountTextField = new JTextField();
        jLabel6 = new JLabel();
        colorComboBox = new JComboBox();
        jButton1 = new JButton();

        setTitle("Ввод нового товара");
        setModal(true);
        addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Наименование:");

        nameTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        nameTextField.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });

        jLabel2.setText("Кол-во в упаковке:");

        countTextField.setText("1");
        countTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                countTextFieldActionPerformed(evt);
            }
        });
        countTextField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                countTextFieldFocusGained(evt);
            }
        });
        countTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                countTextFieldKeyTyped(evt);
            }
        });

        jLabel3.setFont(new Font("Times New Roman", 1, 12));
        jLabel3.setText("Редактирование штрих-кодов");

        jLabel4.setText("Штрих-код:");

        barcodeTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                barcodeTextFieldActionPerformed(evt);
            }
        });

        barcodeList.setModel(new DataListModel());
        barcodeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        barcodeList.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                barcodeListKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(barcodeList);

        generateButton.setText("Генерировать");
        generateButton.setFocusable(false);
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        okButton.setText("Добавить");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancellButton.setText("Отмена");
        cancellButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancellButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Удалить");
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Кол-во в упаковке упаковок");

        CodeCountTextField.setText("1");
        CodeCountTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CodeCountTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Цвет:");

        colorComboBox.setModel(new DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Новый цвет");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addComponent(jSeparator1, GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(countTextField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                    .addGroup(Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(barcodeTextField, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(generateButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(okButton)
                .addGap(79, 79, 79)
                .addComponent(cancellButton)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(CodeCountTextField, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(nameTextField, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(colorComboBox, 0, 251, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(colorComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(countTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(barcodeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateButton))
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodeCountTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                            .addComponent(okButton)
                            .addComponent(cancellButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ((DataListModel)barcodeList.getModel()).removeAll();
        colorComboBox.removeAllItems();
        CodeCountTextField.setText("1");
        try{
            ResultSet rs=DataSet.QueryExec("select distinct trim(name) from color order by trim(name)", false);
            colorComboBox.addItem("Нет цвета!");
            while (rs.next()){
                colorComboBox.addItem(rs.getString(1));
            }
            
            if (isNewTovar() && nameTextField.getText().trim().equals("")){
                nameTextField.setText("");
                countTextField.setText("1");
                barcodeTextField.setText("");
                colorComboBox.setSelectedIndex(0);
            }
            if (!isNewTovar()){
                rs=DataSet.QueryExec("select kol from tovar where id_tovar="+getId(), false);
                if (rs.next())
                    countTextField.setText(rs.getString(1));
                rs=DataSet.QueryExec("select bar_code,count from bar_code where id_tovar="+getId()+" and id_skl=(select id_skl from sklad where name='"+getSklad()+"')", false);
                while (rs.next())
                    ((DataListModel)barcodeList.getModel()).add(new BarCodeData(rs.getString(1),rs.getInt(2)));
                rs=DataSet.QueryExec(String.format("select trim(name) from color where id_color=(select id_color from tovar where id_tovar=%s)",getId()),false);
                if (rs.next()){
                    colorComboBox.setSelectedItem(rs.getString(1));
                }else{
                    colorComboBox.setSelectedIndex(0);
                }
            }
            if (isNewTovar() && !nameTextField.getText().trim().equals("")){
                rs=DataSet.QueryExec("select kol from tovar where id_tovar="+getId(), false);
                if (rs.next())
                    countTextField.setText(rs.getString(1));
                rs=DataSet.QueryExec(String.format("select trim(name) from color where id_color=(select id_color from tovar where id_tovar=%s)",getId()),false);
                if (rs.next()){
                    colorComboBox.setSelectedItem(rs.getString(1));
                }else{
                    colorComboBox.setSelectedIndex(0);
                }
            }
        }
        catch(Exception e){
                e.printStackTrace();
        }
        setOk(false);
        nameTextField.requestFocus();
    }//GEN-LAST:event_formComponentShown

    private void nameTextFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        nameTextField.setText(nameTextField.getText().trim());
        if (checkTovar())
            countTextField.requestFocus();
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void barcodeTextFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_barcodeTextFieldActionPerformed
        if (barcodeTextField.getText().trim().length()==0){
            generate();
        }
        else{
            CodeCountTextField.selectAll();
            CodeCountTextField.requestFocus();
        }
/*        try
        {
            ResultSet rs=DataSet.QueryExec("Select count(*) from bar_code where bar_code='"+barcodeTextField.getText().trim()+"' and id_skl=(select id_skl from sklad where name='"+getSklad()+"')", false);
            rs.next();
            if (rs.getInt(1)>0)
                if (JOptionPane.showConfirmDialog(this, "Такой штрих-код имееться в базе для этого склада, ввести повторный?", "Повторный штрих-код", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION)
                    return;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if (((DataListModel)barcodeList.getModel()).pos(barcodeTextField.getText())==-1){
            ((DataListModel)barcodeList.getModel()).add(new BarCodeData(barcodeTextField.getText(),new Integer(CodeCountTextField.getText())));
        }
        barcodeTextField.setText("");
 *
 */
    }//GEN-LAST:event_barcodeTextFieldActionPerformed

    private void deleteButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        ((DataListModel)barcodeList.getModel()).remove(barcodeList.getSelectedIndex());
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void nameTextFieldFocusLost(FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        if (!checkTovar())
            nameTextField.requestFocus();
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void okButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        if (isNewTovar())
            try{
                ResultSet rs=DataSet.QueryExec("Select max(id_tovar) from tovar", false);
                rs.next();
                int id=rs.getInt(1)+1;
                DataSet.UpdateQuery("savepoint point1");
                DataSet.UpdateQuery(String.format("insert into tovar (id_tovar,name,kol,id_color) select %s as id_tovar, '%s' as name, %s as kol, " +
                        "(with t as (select id_color from color where name='%s') select * from t union all (select null from t having count(*)=0)) as id_color from dual",
                        id,nameTextField.getText(),countTextField.getText(),colorComboBox.getSelectedItem()));
//                DataSet.UpdateQuery("insert into tovar (id_tovar,name,kol) values ("+id+", '"+nameTextField.getText()+"', "+countTextField.getText()+")");
                rs=DataSet.QueryExec("Select id_skl from sklad where name='"+getSklad()+"'", false);
                rs.next();
                int skl=rs.getInt(1);
                for (int i=0;i<((DataListModel)barcodeList.getModel()).getSize();i++)
                    DataSet.UpdateQuery("insert into bar_code (id_tovar,id_skl,bar_code,count) values ("+id+", "+skl+", '"+((BarCodeData)((DataListModel)barcodeList.getModel()).getDataAt(i)).Name+"', '"+((BarCodeData)((DataListModel)barcodeList.getModel()).getDataAt(i)).Count+"')");
                setOk(true);
                setVisible(false);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Запись не удалась. Повторите попытку.", "Ошибка записи", JOptionPane.ERROR_MESSAGE);
                try {
                    DataSet.UpdateQuery("rollback to point1");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                e.printStackTrace();
            }
        else{
            try{
                DataSet.UpdateQuery("savepoint point1");
                ResultSet rs=DataSet.QueryExec("Select id_skl from sklad where name='"+getSklad()+"'", false);
                rs.next();
                int skl=rs.getInt(1);
                DataSet.UpdateQuery("delete from bar_code where id_tovar="+getId()+" and id_skl="+skl);
                DataSet.UpdateQuery(String.format("update tovar set name='%s',kol=%s,id_color=(with t as (select id_color from color where name='%s') select * from t union all (select null from t having count(*)=0))" +
                        " where id_tovar=%s",nameTextField.getText().trim(),countTextField.getText(),colorComboBox.getSelectedItem(),getId()));
//                DataSet.UpdateQuery("update tovar set name='"+nameTextField.getText().trim()+"', kol="+countTextField.getText()+" where id_tovar="+getId());
                for (int i=0;i<((DataListModel)barcodeList.getModel()).getSize();i++)
                    DataSet.UpdateQuery("insert into bar_code (id_tovar,id_skl,bar_code,count) values ("+getId()+", "+skl+", '"+((DataListModel)barcodeList.getModel()).getDataAt(i).Name+"', '"+((DataListModel)barcodeList.getModel()).getDataAt(i).Count+"')");
                setOk(true);
                setVisible(false);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Запись не удалась. Повторите попытку.", "Ошибка записи", JOptionPane.ERROR_MESSAGE);
                try {
                    DataSet.UpdateQuery("rollback to point1");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_okButtonActionPerformed

    private void countTextFieldKeyTyped(KeyEvent evt) {//GEN-FIRST:event_countTextFieldKeyTyped
        char[] symb = new char[1];
        symb[0]=evt.getKeyChar();
//        String str=new String(symb);
        if (evt.getKeyCode()==evt.VK_ENTER)
            return;

        if (!(new String(symb)).matches("[0-9]"))
            evt.setKeyChar(evt.CHAR_UNDEFINED);
    }//GEN-LAST:event_countTextFieldKeyTyped

    private void countTextFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_countTextFieldActionPerformed
        barcodeTextField.requestFocus();
    }//GEN-LAST:event_countTextFieldActionPerformed

    private void cancellButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cancellButtonActionPerformed
        setOk(false);
        setVisible(false);
    }//GEN-LAST:event_cancellButtonActionPerformed

    private void CodeCountTextFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CodeCountTextFieldActionPerformed
        if (barcodeTextField.getText().trim().equals(""))
            return;
        try
        {
            ResultSet rs=DataSet.QueryExec("Select count(*) from bar_code where bar_code='"+barcodeTextField.getText().trim()+"' and id_skl=(select id_skl from sklad where name='"+getSklad()+"')", false);
            rs.next();
            if (rs.getInt(1)>0)
                if (JOptionPane.showConfirmDialog(this, "Такой штрих-код имееться в базе для этого склада, ввести повторный?", "Повторный штрих-код", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION)
                    return;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if (((DataListModel)barcodeList.getModel()).pos(barcodeTextField.getText())==-1){
            ((DataListModel)barcodeList.getModel()).add(new BarCodeData(barcodeTextField.getText(),new Integer(CodeCountTextField.getText())));
        }
        barcodeTextField.setText("");
        barcodeTextField.requestFocus();
    }//GEN-LAST:event_CodeCountTextFieldActionPerformed

    private void generate(){
        try{
            String SQL=String.format("select max(substr(bar_code,%s,5)) from bar_code where bar_code like '%s%s'", (new Integer(getGroup())).toString().length()+1,getGroup(),"%");
            ResultSet rs=DataSet.QueryExec(SQL, false);
            int num=1;
            if (rs.next())
                num=rs.getInt(1);
            String code=String.format("%s%05d", getGroup(),num+1);
            String code_sum=String.format("%07d%05d", getGroup(),num+1);
            Integer sum=new Integer(0);
            for (int i=2;i<13;i=i+2)
                sum=sum+(Integer.valueOf(code_sum.substring(i-1, i)));
            sum=sum*3;
            for (int i=1;i<12;i=i+2)
                sum=sum+(Integer.valueOf(code_sum.substring(i-1, i)));
            sum=10-((Double)((((sum.doubleValue()/10)-sum/10)*10)+0.1)).intValue();
            code=code+sum.toString().substring(sum.toString().length()-1);
            barcodeTextField.setText(code);
        }catch(Exception e){
            e.printStackTrace();
        }
        barcodeTextField.requestFocus();        
    }
    
    private void generateButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        generate();
    }//GEN-LAST:event_generateButtonActionPerformed

    private void barcodeListKeyPressed(KeyEvent evt) {//GEN-FIRST:event_barcodeListKeyPressed
//        if (evt.getKeyCode()==evt.VK_COPY){
        if (evt.isControlDown()&&evt.getKeyCode()==evt.VK_C){
            setClipboardContents(((BarCodeData)barcodeList.getSelectedValue()).Name.trim());
            evt.setKeyCode(evt.VK_UNDEFINED);
        }
    }//GEN-LAST:event_barcodeListKeyPressed

    private void countTextFieldFocusGained(FocusEvent evt) {//GEN-FIRST:event_countTextFieldFocusGained
        countTextField.selectAll();
    }//GEN-LAST:event_countTextFieldFocusGained

    /**
    * @param args the command line arguments
    */
/*    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewTovarDialog dialog = new NewTovarDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
//        setVisible(true);
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField CodeCountTextField;
    private JList barcodeList;
    private JTextField barcodeTextField;
    private JButton cancellButton;
    private JComboBox colorComboBox;
    private JTextField countTextField;
    private JButton deleteButton;
    private JButton generateButton;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JTextField nameTextField;
    private JButton okButton;
    // End of variables declaration//GEN-END:variables
    private String Sklad;
    private boolean ok = false;
    protected boolean NewTovar = true;
    private String nameTovar;
    private int group;

    public void setGroup(int Group){
        group=Group;
    }

    private int getGroup(){
        return group;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }
    protected int Id;

    private int getId() {
        return Id;
    }

    private void setId(int Id) {
        this.Id = Id;
    }

    private boolean isNewTovar() {
        return NewTovar;
    }

    public void setNewTovar(boolean NewTovar, String name) {
        this.NewTovar = NewTovar;
        nameTextField.setText(name);
        setNameTovar("");
        if (!NewTovar){
            setNameTovar(name);
            try{
                ResultSet rs=DataSet.QueryExec("select id_tovar from tovar where name='"+name+"'", false);
                if (rs.next())
                    setId(rs.getInt(1));
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        if(NewTovar && !name.equals("")){
            try{
                ResultSet rs=DataSet.QueryExec("select id_tovar from tovar where name='"+name+"'", false);
                if (rs.next())
                    setId(rs.getInt(1));
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getSklad() {
        return Sklad;
    }

    public void setSklad(String Sklad) {
        this.Sklad = Sklad;
    }
    private boolean checkTovar(){
        if ((!isNewTovar()) && nameTextField.getText().trim().toUpperCase().equals(getNameTovar().trim().toUpperCase()))
            return true;
        try {
            ResultSet rs=DataSet.QueryExec(String.format("select count(*) from tovar where upper(trim(name))='%s' and nvl(id_color,0)=(with t as (select id_color from color where name='%s') select * from t union all (select 0 from t having count(*)=0))", nameTextField.getText().trim().toUpperCase(),colorComboBox.getSelectedItem()), false);
            rs.next();
            if (rs.getInt(1)>0){
                JOptionPane.showMessageDialog(this, "Такое наименование в базе существует! \n Будьте внимательней!", "Ошибка!", JOptionPane.ERROR_MESSAGE);
                return false;
            }else
                return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public String getTovar(){
        return nameTextField.getText();
    }
    public void setClipboardContents( String aString ){
        StringSelection stringSelection = new StringSelection( aString );
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents( stringSelection, null );
  }

}
