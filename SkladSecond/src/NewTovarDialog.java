
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;

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

        barcodeList.setModel(new DataListModel1());
        barcodeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(barcodeList);

        generateButton.setText("Генерировать");

        okButton.setText("Добавить");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancellButton.setText("Отмена");

        deleteButton.setText("Удалить");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addComponent(jSeparator1, GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(countTextField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(okButton)
                        .addGap(79, 79, 79)
                        .addComponent(cancellButton))
                    .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                        .addGroup(Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(barcodeTextField, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(182, 182, 182)
                            .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(generateButton)
                    .addComponent(deleteButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(countTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
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
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                            .addComponent(okButton)
                            .addComponent(cancellButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(deleteButton)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ((DataListModel1)barcodeList.getModel()).removeAll();
        nameTextField.setText("");
        countTextField.setText("1");
        barcodeTextField.setText("");
        setOk(false);
    }//GEN-LAST:event_formComponentShown

    private void nameTextFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        if (checkTovar())
            countTextField.requestFocus();
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void barcodeTextFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_barcodeTextFieldActionPerformed
        ResultSet rs=DataSet.QueryExec("Select count(*) from bar_code where bar_code='"+barcodeTextField.getText().trim()+"' and id_skl=(select id_skl from sklad where name='"+getSklad()+"')", false);
        try
        {
            rs.next();
            if (rs.getInt(1)>0)
                if (JOptionPane.showConfirmDialog(this, "Такой штрих-код имееться в базе для этого склада, ввести повторный?", "Повторный штрих-код", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION)
                    return;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if (((DataListModel1)barcodeList.getModel()).pos(barcodeTextField.getText())==-1){
            ((DataListModel1)barcodeList.getModel()).add(barcodeTextField.getText());
        }
        barcodeTextField.setText("");
    }//GEN-LAST:event_barcodeTextFieldActionPerformed

    private void deleteButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        ((DataListModel1)barcodeList.getModel()).remove(barcodeList.getSelectedIndex());
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void nameTextFieldFocusLost(FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        if (!checkTovar())
            nameTextField.requestFocus();
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void okButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        ResultSet rs=DataSet.QueryExec("Select max(id_tovar) from tovar", false);
        try{
            //установить точку отката
            rs.next();
            int id=rs.getInt(1)+1;
            DataSet.UpdateQuery("insert into tovar (id_tovar,name,kol) values ("+id+", '"+nameTextField.getText()+"', "+countTextField.getText()+")");
            DataSet.QueryExec("Select id_skl from sklad where name='"+getSklad()+"'", false);
            rs.next();
            int skl=rs.getInt(1);
            for (int i=0;i<((DataListModel1)barcodeList.getModel()).getSize();i++)
                DataSet.UpdateQuery("insert into bar_code (id_tovar,id_skl,bar_code) values ("+id+", "+skl+", '"+((DataListModel1)barcodeList.getModel()).getElementAt(i)+"')");
            setOk(true);
            setVisible(false);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Запись не удалась. Повторите попытку.", "Ошибка записи", JOptionPane.ERROR_MESSAGE);
            //Откат к точке
            e.printStackTrace();
        }

    }//GEN-LAST:event_okButtonActionPerformed

    private void countTextFieldKeyTyped(KeyEvent evt) {//GEN-FIRST:event_countTextFieldKeyTyped
        char[] symb = null;
        symb[0]=evt.getKeyChar();
        String str=new String(symb);
        if (evt.getKeyCode()==evt.VK_ENTER)
            return;

        if (!(new String(symb)).contains("0..9"))
            evt.setKeyCode(evt.VK_UNDEFINED);
    }//GEN-LAST:event_countTextFieldKeyTyped

    private void countTextFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_countTextFieldActionPerformed
        countTextField.requestFocus();
    }//GEN-LAST:event_countTextFieldActionPerformed

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
    private JList barcodeList;
    private JTextField barcodeTextField;
    private JButton cancellButton;
    private JTextField countTextField;
    private JButton deleteButton;
    private JButton generateButton;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JTextField nameTextField;
    private JButton okButton;
    // End of variables declaration//GEN-END:variables
    private String Sklad;
    private boolean ok = false;

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
        ResultSet rs=DataSet.QueryExec("Select count(*) from tovar where upper(trim(name))='"+nameTextField.getText().trim().toUpperCase()+"'", false);
        try {
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
}
