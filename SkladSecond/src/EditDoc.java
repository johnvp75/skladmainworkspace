
import java.sql.ResultSet;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditDoc.java
 *
 * Created on 21 серп 2009, 22:56:18
 */

/**
 *
 * @author Жека
 */
public class EditDoc extends javax.swing.JDialog {

    /** Creates new form EditDoc */
    public EditDoc(java.awt.Frame parent, boolean modal) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        EditTableModel model=new EditTableModel(getSQL());
        naklTable = new javax.swing.JTable();
        clientCheck = new javax.swing.JCheckBox();
        dateCheck = new javax.swing.JCheckBox();
        numbCheck = new javax.swing.JCheckBox();
        clientCombo = new javax.swing.JComboBox();
        dateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        startnumbText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        endnumbText = new javax.swing.JTextField();
        noteCheck = new javax.swing.JCheckBox();
        noteText = new javax.swing.JTextField();
        regCheck = new javax.swing.JCheckBox();
        nonregCheck = new javax.swing.JCheckBox();
        managerCheck = new javax.swing.JCheckBox();
        managerCombo = new javax.swing.JComboBox();
        skladCheck = new javax.swing.JCheckBox();
        skladCombo = new javax.swing.JComboBox();
        curCheck = new javax.swing.JCheckBox();
        curCombo = new javax.swing.JComboBox();
        typeCheck = new javax.swing.JCheckBox();
        typeCombo = new javax.swing.JComboBox();
        sumCheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        startsumText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        endsumText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        naklTable.setModel(model);
        naklTable.setColumnSelectionAllowed(true);
        naklTable.getTableHeader().setReorderingAllowed(false);
        naklTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naklTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(naklTable);
        naklTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        clientCheck.setText("Контрагент");
        clientCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCheckActionPerformed(evt);
            }
        });

        dateCheck.setText("По дате");
        dateCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateCheckActionPerformed(evt);
            }
        });

        numbCheck.setText("По номеру");
        numbCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbCheckActionPerformed(evt);
            }
        });

        clientCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientComboActionPerformed(evt);
            }
        });

        dateButton.setText("-");

        jLabel1.setText("с");

        startnumbText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                startnumbTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                startnumbTextFocusLost(evt);
            }
        });
        startnumbText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startnumbTextKeyPressed(evt);
            }
        });

        jLabel2.setText("по");

        endnumbText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endnumbTextActionPerformed(evt);
            }
        });
        endnumbText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                startnumbTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                startnumbTextFocusLost(evt);
            }
        });
        endnumbText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startnumbTextKeyPressed(evt);
            }
        });

        noteCheck.setText("По части примечания");
        noteCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteCheckActionPerformed(evt);
            }
        });

        noteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteTextActionPerformed(evt);
            }
        });

        regCheck.setText("Проведенные");
        regCheck.setEnabled(false);

        nonregCheck.setSelected(true);
        nonregCheck.setText("Не проведенные");
        nonregCheck.setEnabled(false);

        managerCheck.setText("Менеджер");
        managerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerCheckActionPerformed(evt);
            }
        });

        managerCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerComboActionPerformed(evt);
            }
        });

        skladCheck.setText("Склад");
        skladCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skladCheckActionPerformed(evt);
            }
        });

        skladCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skladComboActionPerformed(evt);
            }
        });

        curCheck.setText("Валюта");
        curCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curCheckActionPerformed(evt);
            }
        });

        curCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curComboActionPerformed(evt);
            }
        });

        typeCheck.setText("Тип документа");
        typeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeCheckActionPerformed(evt);
            }
        });

        typeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboActionPerformed(evt);
            }
        });

        sumCheck.setText("Сумма");
        sumCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumCheckActionPerformed(evt);
            }
        });

        jLabel3.setText("с");

        startsumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startsumTextActionPerformed(evt);
            }
        });
        startsumText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                startnumbTextFocusGained(evt);
            }
        });
        startsumText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startsumTextKeyPressed(evt);
            }
        });

        jLabel4.setText("по");

        endsumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startsumTextActionPerformed(evt);
            }
        });
        endsumText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                startnumbTextFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1219, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numbCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startnumbText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endnumbText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(dateCheck)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(clientCheck)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(clientCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(managerCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(managerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(nonregCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(regCheck)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(skladCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(skladCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(curCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(curCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(typeCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addComponent(sumCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(startsumText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(endsumText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(noteCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(noteText, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientCheck)
                            .addComponent(clientCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noteCheck)
                            .addComponent(noteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dateCheck)
                                .addComponent(dateButton)
                                .addComponent(nonregCheck))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sumCheck)
                                .addComponent(jLabel3)
                                .addComponent(startsumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(endsumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regCheck)
                        .addComponent(typeCheck)
                        .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numbCheck)
                    .addComponent(jLabel1)
                    .addComponent(startnumbText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(endnumbText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managerCheck)
                    .addComponent(managerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skladCheck)
                    .addComponent(skladCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(curCheck)
                    .addComponent(curCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setSQL(String.format("and d.id_type_doc in (select id_type_doc from type_doc where operacia=%s)", getType_doc()));
        initelements();
        SQL();

    }//GEN-LAST:event_formComponentShown

    private void naklTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naklTableMouseClicked
        if (evt.getClickCount()==2){
            MainFrame.setEditDocId(((EditTableModel)naklTable.getModel()).getId(naklTable.getSelectedRow()));
            setVisible(false);
        }
    }//GEN-LAST:event_naklTableMouseClicked

    private void numbCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numbCheckActionPerformed
        numbChange();
    }//GEN-LAST:event_numbCheckActionPerformed

    private void numbChange(){
        if (numbCheck.isSelected()){
            if (((new Integer(startnumbText.getText()))*(new Integer(endnumbText.getText())))>0&&((new Integer(startnumbText.getText()))>(new Integer(endnumbText.getText())))){
                JOptionPane.showMessageDialog(null, "Неверный интервал номеров", "Ошибка номера!", JOptionPane.ERROR_MESSAGE);
                numbCheck.setSelected(false);
                return;
            }
            String partSQL="";
            if ((new Integer(startnumbText.getText()))>0){
                partSQL=String.format("and d.numb>%s ", startnumbText.getText());
            }
            if ((new Integer(endnumbText.getText()))>0){
                partSQL=partSQL+String.format("and d.numb<%s", endnumbText.getText());
            }
            setNumbSQL(partSQL);
        }else{
            setNumbSQL("");
        }
        SQL();
    }
    private void skladCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skladCheckActionPerformed
        skladChange();
    }//GEN-LAST:event_skladCheckActionPerformed

    private void skladChange(){
        if (skladCheck.isSelected()){
            setSkladSQL(String.format("and s.name='%s'", skladCombo.getSelectedItem()));
        }else{
            setSkladSQL("");
        }
        SQL();
    }

    public int getType_doc() {
        return type_doc;
    }

    public void setType_doc(int type_doc) {
        this.type_doc = type_doc;
    }

    private void curCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curCheckActionPerformed
        curChange();
    }//GEN-LAST:event_curCheckActionPerformed

    private void curChange(){
        if (curCheck.isSelected()){
            setCurrSQL(String.format("and v.name='%s'", curCombo.getSelectedItem()));
        }else{
            setCurrSQL("");
        }
        SQL();
    }

    private void sumCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumCheckActionPerformed
        sumChange();
    }//GEN-LAST:event_sumCheckActionPerformed

    private void sumChange(){
        if (sumCheck.isSelected()){
            if (((new Double(startsumText.getText()))*(new Double(endsumText.getText())))>0&&((new Double(startsumText.getText()))>(new Double(endsumText.getText())))){
                JOptionPane.showMessageDialog(null, "Неверный интервал сумм", "Ошибка суммы!", JOptionPane.ERROR_MESSAGE);
                sumCheck.setSelected(false);
                return;
            }
            String partSQL="";
            if ((new Double(startsumText.getText()))>0){
                partSQL=String.format("and d.sum>%s ", startsumText.getText());
            }
            if ((new Double(endsumText.getText()))>0){
                partSQL=partSQL+String.format("and d.sum<%s", endsumText.getText());
            }
            setSumSQL(partSQL);
        }else{
            setSumSQL("");
        }
        SQL();
    }

    private void endnumbTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endnumbTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endnumbTextActionPerformed

    private void clientCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCheckActionPerformed
        clientChange();
    }//GEN-LAST:event_clientCheckActionPerformed

    private void clientChange(){
        if (clientCheck.isSelected()){
            setClientSQL(String.format("and c.name='%s'", clientCombo.getSelectedItem()));
        }else{
            setClientSQL("");
        }
        SQL();
    }

    private void startnumbTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startnumbTextKeyPressed
        if (evt.getKeyCode()<evt.VK_0 || evt.getKeyCode()>evt.VK_9){
            evt.setKeyCode(evt.VK_UNDEFINED);
        }
    }//GEN-LAST:event_startnumbTextKeyPressed

    private void startnumbTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startnumbTextFocusGained
        ((JTextField)evt.getSource()).selectAll();
    }//GEN-LAST:event_startnumbTextFocusGained

    private void noteCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteCheckActionPerformed
        noteChange();
    }//GEN-LAST:event_noteCheckActionPerformed

    private void noteChange(){
        if (noteCheck.isSelected()){
            if (noteText.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Нельзя искать по пустой строке!", "Пустая строка", JOptionPane.ERROR_MESSAGE);
                noteCheck.setSelected(false);
                return;
            }
            setNoteSQL(String.format("and upper(d.note) like '%s%s%s'", "%",noteText.getText().trim().toUpperCase(),"%"));
        }else{
            setNoteSQL("");
        }
        SQL();
    }

    private void startnumbTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startnumbTextFocusLost
        numbChange();
    }//GEN-LAST:event_startnumbTextFocusLost

    private void managerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerCheckActionPerformed
        managerChange();
    }//GEN-LAST:event_managerCheckActionPerformed

    private void managerComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerComboActionPerformed
        managerChange();
    }//GEN-LAST:event_managerComboActionPerformed

    private void skladComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skladComboActionPerformed
        skladChange();
    }//GEN-LAST:event_skladComboActionPerformed

    private void typeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeCheckActionPerformed
        typeChange();
    }//GEN-LAST:event_typeCheckActionPerformed

    private void typeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboActionPerformed
        typeChange();
    }//GEN-LAST:event_typeComboActionPerformed

    private void curComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curComboActionPerformed
        curChange();
    }//GEN-LAST:event_curComboActionPerformed

    private void startsumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startsumTextActionPerformed
        sumChange();
    }//GEN-LAST:event_startsumTextActionPerformed

    private void startsumTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startsumTextKeyPressed
        if ((evt.getKeyCode()<evt.VK_0 || evt.getKeyCode()>evt.VK_9 || evt.getKeyCode()!=evt.VK_COMMA || evt.getKeyCode()!=evt.VK_MINUS || evt.getKeyChar()!='.')){
            evt.setKeyCode(evt.VK_UNDEFINED);
        }

    }//GEN-LAST:event_startsumTextKeyPressed

    private void noteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteTextActionPerformed
        noteChange();
    }//GEN-LAST:event_noteTextActionPerformed

    private void clientComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientComboActionPerformed
        clientChange();
    }//GEN-LAST:event_clientComboActionPerformed

    private void dateCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateCheckActionPerformed
        if (dateCheck.isSelected()&&nonregCheck.isSelected()){
            JOptionPane.showMessageDialog(null, "Дату имеют только зарегистрированные документы!", "Ошибка!", JOptionPane.ERROR_MESSAGE);
            dateCheck.setSelected(false);
        }
        dateChange();
    }//GEN-LAST:event_dateCheckActionPerformed

    private void dateChange(){
        if (dateCheck.isSelected()){
            GregorianCalendar end=getEndDate();
            end.add(GregorianCalendar.DATE, 1);
            setDateSQL(String.format("and d.day between to_date('%1$td.%1$tm.%1$tY','DD.MM.YYYY') and to_date('%2$td.%2$tm.%2$tY','DD.MM.YYYY')", getStartDate(),end));
        }else{
            setDateSQL("");
        }

    }

    private void typeChange(){
        if (typeCheck.isSelected()){
            setTypeSQL(String.format("and t.name='%s'", typeCombo.getSelectedItem()));
        }else{
            setTypeSQL("");
        }
        SQL();
    }

    private void managerChange(){
        if (managerCheck.isSelected()){
            setManagerSQL(String.format("and m.name='%s'", managerCombo.getSelectedItem()));
        }else{
            setManagerSQL("");
        }
        SQL();
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditDoc dialog = new EditDoc(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox clientCheck;
    private javax.swing.JComboBox clientCombo;
    private javax.swing.JCheckBox curCheck;
    private javax.swing.JComboBox curCombo;
    private javax.swing.JButton dateButton;
    private javax.swing.JCheckBox dateCheck;
    private javax.swing.JTextField endnumbText;
    private javax.swing.JTextField endsumText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox managerCheck;
    private javax.swing.JComboBox managerCombo;
    private javax.swing.JTable naklTable;
    private javax.swing.JCheckBox nonregCheck;
    private javax.swing.JCheckBox noteCheck;
    private javax.swing.JTextField noteText;
    private javax.swing.JCheckBox numbCheck;
    private javax.swing.JCheckBox regCheck;
    private javax.swing.JCheckBox skladCheck;
    private javax.swing.JComboBox skladCombo;
    private javax.swing.JTextField startnumbText;
    private javax.swing.JTextField startsumText;
    private javax.swing.JCheckBox sumCheck;
    private javax.swing.JCheckBox typeCheck;
    private javax.swing.JComboBox typeCombo;
    // End of variables declaration//GEN-END:variables
    private String SQL=" and d.id_type_doc in (select id_type_doc from type_doc where operacia=1) ";
    private GregorianCalendar startDate = new GregorianCalendar();
    private GregorianCalendar endDate = new GregorianCalendar();
    private String clientSQL = " ";
    private String dateSQL = " ";
    private String numbSQL = " ";
    private String noteSQL = " ";
    private String regSQL = " ";
    private String managerSQL = " ";
    private String skladSQL = " ";
    private String currSQL = " ";
    private String typeSQL = " ";
    private String sumSQL = " ";
    public int type_doc;

    public String getSumSQL() {
        return sumSQL;
    }

    public void setSumSQL(String sumSQL) {
        this.sumSQL = sumSQL;
    }

    public String getTypeSQL() {
        return typeSQL;
    }

    public void setTypeSQL(String typeSQL) {
        this.typeSQL = typeSQL;
    }

    public String getCurrSQL() {
        return currSQL;
    }

    public void setCurrSQL(String currSQL) {
        this.currSQL = currSQL;
    }

    public String getSkladSQL() {
        return skladSQL;
    }

    public void setSkladSQL(String skladSQL) {
        this.skladSQL = skladSQL;
    }

    public String getManagerSQL() {
        return managerSQL;
    }

    public void setManagerSQL(String managerSQL) {
        this.managerSQL = managerSQL;
    }

    public String getRegSQL() {
        return regSQL;
    }

    public void setRegSQL(String regSQL) {
        this.regSQL = regSQL;
    }

    public String getNoteSQL() {
        return noteSQL;
    }

    public void setNoteSQL(String noteSQL) {
        this.noteSQL = noteSQL;
    }

    public String getNumbSQL() {
        return numbSQL;
    }

    public void setNumbSQL(String numbSQL) {
        this.numbSQL = numbSQL;
    }

    /**
     * Get the value of dateSQL
     *
     * @return the value of dateSQL
     */
    public String getDateSQL() {
        return dateSQL;
    }

    /**
     * Set the value of dateSQL
     *
     * @param dateSQL new value of dateSQL
     */
    public void setDateSQL(String dateSQL) {
        this.dateSQL = dateSQL;
    }

    public String getClientSQL() {
        return clientSQL;
    }

    public void setClientSQL(String clientSQL) {
        this.clientSQL = clientSQL;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar EndDate) {
        this.endDate = EndDate;
    }

    private GregorianCalendar getStartDate() {
        return startDate;
    }

    private void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    private String getSQL() {
        return SQL;
    }

    private void setSQL(String SQL) {
        this.SQL = SQL;
    }
    private void initelements(){
        try{
            ResultSet rs=DataSet.QueryExec("select trim(name) from client order by upper(trim(name))", false);
            String item=null;
            if (clientCombo.getItemCount()>0){
                item=(String)clientCombo.getSelectedItem();
            }
            clientCombo.removeAllItems();
            while (rs.next()){
                clientCombo.addItem(rs.getString(1));
            }
            if (item!=null){
                clientCombo.setSelectedItem(item);
            }else{
                clientCombo.setSelectedIndex(0);
            }
            if (dateButton.getText().equals("-")){
                startDate.add(GregorianCalendar.DATE, -7);
                dateButton.setText(String.format("%1$td.%1$tm.%1$tY - %2$td.%2$tm.%2$tY", getStartDate(),getEndDate()));
/*
                setDateSQL(String.format("and d.day between '%s.%s.%s' and '%s.%s.%s'",  getStartDate().get(GregorianCalendar.DAY_OF_MONTH),getStartDate().get(GregorianCalendar.MONTH)+1,
                        getStartDate().get(GregorianCalendar.YEAR),getEndDate().get(GregorianCalendar.DAY_OF_MONTH),getEndDate().get(GregorianCalendar.MONTH)+1,
                        getEndDate().get(GregorianCalendar.YEAR)));
 *
 
                GregorianCalendar end=getEndDate();
                end.add(GregorianCalendar.DATE, 1);
                setDateSQL(String.format("and d.day between to_date('%1$td.%1$tm.%1$tY','DD.MM.YYYY') and to_date('%2$td.%2$tm.%2$tY','DD.MM.YYYY')", getStartDate(),end));
 */           }
            rs=DataSet.QueryExec("select trim(name) from manager order by upper(trim(name))", false);
            item=null;
            if (managerCombo.getItemCount()>0){
                item=(String)managerCombo.getSelectedItem();
            }
            managerCombo.removeAllItems();
            while (rs.next()){
                managerCombo.addItem(rs.getString(1));
            }
            if (item!=null){
                managerCombo.setSelectedItem(item);
            }else{
                managerCombo.setSelectedIndex(0);
            }
            rs=DataSet.QueryExec("select trim(name) from type_doc order by upper(trim(name))", false);
            item=null;
            if (typeCombo.getItemCount()>0){
                item=(String)typeCombo.getSelectedItem();
            }
            typeCombo.removeAllItems();
            while (rs.next()){
                typeCombo.addItem(rs.getString(1));
            }
            if (item!=null){
                typeCombo.setSelectedItem(item);
            }else{
                typeCombo.setSelectedIndex(0);
            }
            rs=DataSet.QueryExec("select trim(name) from val order by upper(trim(name))", false);
            item=null;
            if (curCombo.getItemCount()>0){
                item=(String)curCombo.getSelectedItem();
            }
            curCombo.removeAllItems();
            while (rs.next()){
                curCombo.addItem(rs.getString(1));
            }
            if (item!=null){
                curCombo.setSelectedItem(item);
            }else{
                curCombo.setSelectedIndex(0);
            }
            rs=DataSet.QueryExec("select trim(name) from sklad order by upper(trim(name))", false);
            item=null;
            if (skladCombo.getItemCount()>0){
                item=(String)skladCombo.getSelectedItem();
            }
            skladCombo.removeAllItems();
            while (rs.next()){
                skladCombo.addItem(rs.getString(1));
            }
            if (item!=null){
                skladCombo.setSelectedItem(item);
            }else{
                skladCombo.setSelectedIndex(0);
            }
            setRegSQL("and d.numb is null");

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    private void SQL(){
        String sql=(String.format("%s %s %s %s %s %s %s %s %s %s %s", getSQL(),getClientSQL(),getDateSQL(),
                getNoteSQL(),getNumbSQL(),getRegSQL(),getManagerSQL(),getSkladSQL(),getCurrSQL(),getTypeSQL(),getSumSQL()));
        ((EditTableModel)naklTable.getModel()).update(sql);
    }

}
