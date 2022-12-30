package notepad;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Insets;
import static java.awt.SystemColor.menu;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Frontpage extends javax.swing.JFrame {
    JFrame frame; 
    static String copypaste;

    public Frontpage() {
     
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NewMenu = new javax.swing.JMenuItem();
        OpenMenu = new javax.swing.JMenuItem();
        SaveMenu = new javax.swing.JMenuItem();
        ExitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        copymanu = new javax.swing.JMenuItem();
        pastemenu = new javax.swing.JMenuItem();
        SelectAllManu = new javax.swing.JMenuItem();
        CutMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        FrontMenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        ColourMenu = new javax.swing.JMenuItem();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setAlignmentY(5.0F);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuBar1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuBar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMenuBar1PropertyChange(evt);
            }
        });

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        NewMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        NewMenu.setText("New");
        NewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMenuActionPerformed(evt);
            }
        });
        jMenu1.add(NewMenu);

        OpenMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        OpenMenu.setText("Open");
        OpenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuActionPerformed(evt);
            }
        });
        jMenu1.add(OpenMenu);

        SaveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SaveMenu.setText("Save");
        SaveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(SaveMenu);

        ExitMenu.setText("Exit");
        ExitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(ExitMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), null));
        jMenu2.setText("Edit");
        jMenu2.setToolTipText("");
        jMenu2.setAlignmentX(100.0F);
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenu2.setIconTextGap(20);
        jMenu2.setMargin(new java.awt.Insets(3, 12, 3, 12));

        copymanu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copymanu.setText("Copy");
        copymanu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copymanuActionPerformed(evt);
            }
        });
        jMenu2.add(copymanu);

        pastemenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pastemenu.setText("Paste");
        pastemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastemenuActionPerformed(evt);
            }
        });
        jMenu2.add(pastemenu);

        SelectAllManu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SelectAllManu.setText("Select All");
        SelectAllManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAllManuActionPerformed(evt);
            }
        });
        jMenu2.add(SelectAllManu);

        CutMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CutMenu.setText("Cut");
        CutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutMenuActionPerformed(evt);
            }
        });
        jMenu2.add(CutMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("Design");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        FrontMenu.setText("Front");
        FrontMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrontMenuActionPerformed(evt);
            }
        });
        jMenu3.add(FrontMenu);

        jMenuItem1.setText("Size");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        ColourMenu.setText("Colour");
        ColourMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColourMenuActionPerformed(evt);
            }
        });
        jMenu3.add(ColourMenu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copymanuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copymanuActionPerformed
        // TODO add your handling code here:
        //String s=jTextArea1.getSelectedText();
        //copypaste=s;
        jTextArea1.copy();
    }//GEN-LAST:event_copymanuActionPerformed

    private void pastemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastemenuActionPerformed
        // TODO add your handling code here:
        // jTextArea1.append(copypaste);
        jTextArea1.paste();
    }//GEN-LAST:event_pastemenuActionPerformed

    private void SelectAllManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectAllManuActionPerformed
        // TODO add your handling code here:
        //String s1=jTextArea1.getText();
        jTextArea1.selectAll();
        SelectAllManu.transferFocusBackward();
    }//GEN-LAST:event_SelectAllManuActionPerformed

    private void CutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutMenuActionPerformed
        // TODO add your handling code here:
        String s1 = jTextArea1.getSelectedText();
        jTextArea1.cut();

    }//GEN-LAST:event_CutMenuActionPerformed

    private void ColourMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColourMenuActionPerformed
        // TODO add your handling code here:
        Font font = new Font("Arial", Font.BOLD, 24);
        jTextArea1.setFont(font);
        jTextArea1.setForeground(Color.BLUE);
    }//GEN-LAST:event_ColourMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
     
        Font font = new Font("Arial", Font.BOLD, 36);
        jTextArea1.setFont(font);
        jTextArea1.setForeground(Color.black);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void FrontMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrontMenuActionPerformed
        // TODO add your handling code here:
        Font font = new Font("Segoe Script", Font.BOLD, 24);
        jTextArea1.setFont(font);
         jTextArea1.setForeground(Color.black);
       // JScrollPane scrollPane = new JScrollPane( jTextArea1);
    }//GEN-LAST:event_FrontMenuActionPerformed

    private void NewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMenuActionPerformed
        // TODO add your handling code here:
        jTextArea1.selectAll();
        jTextArea1.cut();
    }//GEN-LAST:event_NewMenuActionPerformed

    private void jMenuBar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMenuBar1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1PropertyChange

    private void jMenuBar1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuBar1AncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuBar1AncestorAdded

    private void OpenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        Component modalToComponent = null;
        if (fileChooser.showOpenDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
  // load from file
}
    }//GEN-LAST:event_OpenMenuActionPerformed

    private void SaveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        Component modalToComponent = null;
if (fileChooser.showSaveDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
  File file = fileChooser.getSelectedFile();
  // save to file
}
    }//GEN-LAST:event_SaveMenuActionPerformed

    private void ExitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMenuActionPerformed

    
        
   
    
    public static void main(String args[]) {
       
   
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new Frontpage().setVisible(true);
            }
        });
      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ColourMenu;
    private javax.swing.JMenuItem CutMenu;
    private javax.swing.JMenuItem ExitMenu;
    private javax.swing.JMenuItem FrontMenu;
    private javax.swing.JMenuItem NewMenu;
    private javax.swing.JMenuItem OpenMenu;
    private javax.swing.JMenuItem SaveMenu;
    private javax.swing.JMenuItem SelectAllManu;
    private javax.swing.JMenuItem copymanu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    private javax.swing.JMenuItem pastemenu;
    // End of variables declaration//GEN-END:variables
}
    
   
