
import com.sun.star.awt.Selection;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.TreeSelectionModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GroupAndSectionWire.java
 *
 * Created on 31 серп 2011, 13:04:39
 */

/**
 *
 * @author жд
 */
public class GroupAndSectionWire extends javax.swing.JDialog {

    /** Creates new form GroupAndSectionWire */
    public GroupAndSectionWire(java.awt.Frame parent, boolean modal) {
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

        treePopup = new javax.swing.JPopupMenu();
        listTovar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        section = new javax.swing.JList();
        sectionCaption = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        groupTree = new javax.swing.JTree(new GroupTreeModel());

        listTovar.setText("Содержимое группы");
        treePopup.add(listTovar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        section.setModel(new DefaultListModel());
        section.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        section.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                sectionValueChanged(evt);
            }
        });
        section.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sectionPropertyChange(evt);
            }
        });
        section.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                sectionVetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(section);

        sectionCaption.setText("Отдел");

        jButton1.setText("Сохранить и закрыть");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Группы");

        groupTree.setRootVisible(false);
        groupTree.setShowsRootHandles(true);
        groupTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        groupTree.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        groupTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                groupTreeValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(groupTree);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(sectionCaption))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionCaption)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_groupTreeValueChanged
        Integer index=null;
        if (evt.getOldLeadSelectionPath()!=null)
            index=((DataNode)evt.getOldLeadSelectionPath().getLastPathComponent()).getIndex();
        String SQL="";
        if (index!=null && isChange()){
            try{
                if (section.getSelectedIndex()==0)
                    SQL=String.format("update groupid set id_section=null where id_group=%s ", index);
                else
                    SQL=String.format("update groupid set id_section=(select id_section from groupsection where description='%s') where id_group=%s ", (String)section.getSelectedValue(),index);
                if (section.getSelectedIndex()!=-1)
                    DataSet.UpdateQuery(SQL);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, String.format("Ошибка обновления Section\nSQL=%s",SQL), "Ошибка!", JOptionPane.ERROR_MESSAGE);
            }
        }
        setChange(false);
        index=((DataNode)evt.getPath().getLastPathComponent()).getIndex();
        selectList(index);
}//GEN-LAST:event_groupTreeValueChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        initList();
    }//GEN-LAST:event_formComponentShown

    private void sectionValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_sectionValueChanged
        if (getValue()!=section.getSelectedIndex())
            setChange(true);
    }//GEN-LAST:event_sectionValueChanged

    private void sectionVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_sectionVetoableChange
    }//GEN-LAST:event_sectionVetoableChange

    private void sectionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sectionPropertyChange

    }//GEN-LAST:event_sectionPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Integer index=null;
            if (groupTree.getSelectionPath()!=null)
            index=((DataNode)groupTree.getSelectionPath().getLastPathComponent()).getIndex();
            String SQL="";
            if (index!=null && isChange()){
            try{
                if (section.getSelectedIndex()==0)
                    SQL=String.format("update groupid set id_section=null where id_group=%s ", index);
                else
                    SQL=String.format("update groupid set id_section=(select id_section from groupsection where description='%s') where id_group=%s ", (String)section.getSelectedValue(),index);
                if (section.getSelectedIndex()!=-1)
                    DataSet.UpdateQuery(SQL);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, String.format("Ошибка обновления Section\nSQL=%s",SQL), "Ошибка!", JOptionPane.ERROR_MESSAGE);
            }
        }
        setChange(false);
        DataSet.commit();
        setVisible(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ошибка 'commit'-а изменений ", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden

    }//GEN-LAST:event_formComponentHidden

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try{
            DataSet.rollback();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ошибка 'rollback'-а изменений ", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void initList(){
        try{
            String SQL="Select trim(description) from groupsection order by description";
            ResultSet rs=DataSet.QueryExec(SQL, false);
            DefaultListModel model=(DefaultListModel)section.getModel();
            model.clear();
            model.addElement("Без отдела");
            while (rs.next()){
                model.addElement(rs.getString(1));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ошибка инициализации JList", "Ошибка!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void selectList(int index){
        try{
            String SQL=String.format("select nvl(trim(gi.description),'Без отдела') from groupid g left join groupsection gi on gi.id_section = g.id_section where g.id_group=%s", index);
            ResultSet rs=DataSet.QueryExec(SQL, false);
            if (rs.next())
                section.setSelectedValue(rs.getString(1), true);
            else
                section.setSelectedValue("Без отдела", true);
            setValue(section.getSelectedIndex());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ошибка выбора Section", "Ошибка!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GroupAndSectionWire dialog = new GroupAndSectionWire(new javax.swing.JFrame(), true);
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
    private javax.swing.JTree groupTree;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem listTovar;
    private javax.swing.JList section;
    private javax.swing.JLabel sectionCaption;
    private javax.swing.JPopupMenu treePopup;
    // End of variables declaration//GEN-END:variables
    private boolean change = false;
    protected int value = -1;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }

}
