
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Евгений
 */
public class ImportFromXLSToInvoice extends javax.swing.JDialog {

    private HSSFWorkbook xlsBook;
    
    
    public HSSFWorkbook getXlsBook() {
        return xlsBook;
    }

    public void setXlsBook(HSSFWorkbook xlsBook) {
        this.xlsBook = xlsBook;
    }

    /**
     * Creates new form ImportFromXLSToInvoice
     */
    public ImportFromXLSToInvoice(java.awt.Frame parent, boolean modal,HSSFWorkbook wb) {
        super(parent, modal);
        setXlsBook(wb);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sheetsPane = new javax.swing.JScrollPane();
        sheetsPanel = new javax.swing.JPanel();
        nameL = new javax.swing.JLabel();
        nameField = new javax.swing.JComboBox();
        barcodeField = new javax.swing.JComboBox();
        barcodeL = new javax.swing.JLabel();
        countField = new javax.swing.JComboBox();
        countL = new javax.swing.JLabel();
        costField = new javax.swing.JComboBox();
        costL = new javax.swing.JLabel();
        createNew = new javax.swing.JCheckBox();
        ignoreNew = new javax.swing.JCheckBox();
        addBarcode = new javax.swing.JCheckBox();
        packL = new javax.swing.JLabel();
        packField = new javax.swing.JComboBox();
        startImport = new javax.swing.JButton();
        cancelImport = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        javax.swing.GroupLayout sheetsPanelLayout = new javax.swing.GroupLayout(sheetsPanel);
        sheetsPanel.setLayout(sheetsPanelLayout);
        sheetsPanelLayout.setHorizontalGroup(
            sheetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        sheetsPanelLayout.setVerticalGroup(
            sheetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        sheetsPane.setViewportView(sheetsPanel);

        nameL.setText("Наименование (часть)");

        nameField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Не учитывать", "Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4", "Столбец 5", "Столбец 6", "Столбец 7", "Столбец 8", "Столбец 9", "Столбец 10", "Столбец 11", "Столбец 12", "Столбец 13", "Столбец 14", "Столбец 15", " ", " " }));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        barcodeField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Не учитывать", "Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4", "Столбец 5", "Столбец 6", "Столбец 7", "Столбец 8", "Столбец 9", "Столбец 10", "Столбец 11", "Столбец 12", "Столбец 13", "Столбец 14", "Столбец 15" }));

        barcodeL.setText("Штрих-код");

        countField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4", "Столбец 5", "Столбец 6", "Столбец 7", "Столбец 8", "Столбец 9", "Столбец 10", "Столбец 11", "Столбец 12", "Столбец 13", "Столбец 14", "Столбец 15" }));

        countL.setText("Кол-во упаковок");

        costField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0,00", "Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4", "Столбец 5", "Столбец 6", "Столбец 7", "Столбец 8", "Столбец 9", "Столбец 10", "Столбец 11", "Столбец 12", "Столбец 13", "Столбец 14", "Столбец 15" }));

        costL.setText("Цена");

        createNew.setText("Создавать новые без запроса (группа: Новый товар)");

        ignoreNew.setText("Игнорировать новые");
        ignoreNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ignoreNewActionPerformed(evt);
            }
        });

        addBarcode.setText("Добавлять штрих-коды");

        packL.setText("Кол-во шт. в уп.");

        packField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4", "Столбец 5", "Столбец 6", "Столбец 7", "Столбец 8", "Столбец 9", "Столбец 10", "Столбец 11", "Столбец 12", "Столбец 13", "Столбец 14", "Столбец 15" }));
        packField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packFieldActionPerformed(evt);
            }
        });

        startImport.setText("Начать импорт");
        startImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startImportActionPerformed(evt);
            }
        });

        cancelImport.setText("Отмена");
        cancelImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelImportActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel6.setText("Выберите данные для импорта");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sheetsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createNew)
                                    .addComponent(ignoreNew)
                                    .addComponent(addBarcode)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameL)
                                            .addComponent(barcodeL)
                                            .addComponent(countL)
                                            .addComponent(packL)
                                            .addComponent(costL))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(packField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(barcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(167, 167, 167))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(startImport)
                        .addGap(56, 56, 56)
                        .addComponent(cancelImport)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameL)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barcodeL)
                            .addComponent(barcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countL)
                            .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(packL)
                            .addComponent(packField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costL)
                            .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(createNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ignoreNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBarcode))
                    .addComponent(sheetsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startImport)
                    .addComponent(cancelImport))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    for (int i=0;i<getXlsBook().getNumberOfSheets();i++){
        sheetsPanel.add(new JCheckBox(getXlsBook().getSheetName(i)));
    }
    sheetsPanel.setLayout(new GridLayout(getXlsBook().getNumberOfSheets()<9?9:getXlsBook().getNumberOfSheets(), 1));
    
    }//GEN-LAST:event_formComponentShown

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void ignoreNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ignoreNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ignoreNewActionPerformed

    private void packFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packFieldActionPerformed

    private void cancelImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelImportActionPerformed

    private void startImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startImportActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addBarcode;
    private javax.swing.JComboBox barcodeField;
    private javax.swing.JLabel barcodeL;
    private javax.swing.JButton cancelImport;
    private javax.swing.JComboBox costField;
    private javax.swing.JLabel costL;
    private javax.swing.JComboBox countField;
    private javax.swing.JLabel countL;
    private javax.swing.JCheckBox createNew;
    private javax.swing.JCheckBox ignoreNew;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox nameField;
    private javax.swing.JLabel nameL;
    private javax.swing.JComboBox packField;
    private javax.swing.JLabel packL;
    private javax.swing.JScrollPane sheetsPane;
    private javax.swing.JPanel sheetsPanel;
    private javax.swing.JButton startImport;
    // End of variables declaration//GEN-END:variables
}
