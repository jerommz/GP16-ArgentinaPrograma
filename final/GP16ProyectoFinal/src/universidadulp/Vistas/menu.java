package universidadulp.Vistas;

//imports de paquetes y clases necesarios
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicButtonUI;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
        mostrarPanel(new Home());
        sacarLabels();

        JButton btns[] = {jbBotonAlumno, jbBotonMateria, jbBotonAdmin, jbBotonCosulta, jbBotonHome, jbBotonSalir};
        for (JButton btn : btns) {
            btn.setBackground(new Color(21, 25, 28));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(80, 41, 179));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(21, 25, 28));
                }
            });
        }

        JLabel lab[] = {linkdinGiorgina, gitGiorgina, linkdinHernan, gitHernan, linkdinJero, gitJero};
        for (JLabel labl : lab) {
            labl.setForeground(Color.white);
            labl.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    String link = null;
                    switch (labl.getText()) {
                        case "Linkedin/Giorgina":
                            link = "https://www.linkedin.com/in/giorgina-corvalan-83b167281/";
                            agregarLink(link);
                            break;
                        case "GitHub/York-Andy":
                            link = "https://github.com/York-Andy";
                            agregarLink(link);
                            break;
                        case "Linkedin/Hernan":
                            link = "https://www.linkedin.com/in/hernanl/";
                            agregarLink(link);
                            break;
                        case "GitHub/HernanL22":
                            link = "https://github.com/hernanl22";
                            agregarLink(link);
                            break;
                        case "Linkedin/Jeronimo":
                            link = "https://www.linkedin.com/in/jeronimo-manabella/";
                            agregarLink(link);
                            break;
                        case "GitHub/Jerommz":
                            link = "https://github.com/Jerommz";
                            agregarLink(link);
                            break;
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    labl.setForeground(new Color (80, 41, 179));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    labl.setForeground(Color.white);
                }
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelRoot = new javax.swing.JPanel();
        panelSide = new javax.swing.JPanel();
        panelVacio = new javax.swing.JPanel();
        jbBotonHome = new javax.swing.JButton();
        jbBotonAlumno = new javax.swing.JButton();
        jbBotonMateria = new javax.swing.JButton();
        jbBotonAdmin = new javax.swing.JButton();
        jbBotonCosulta = new javax.swing.JButton();
        panelMenu1 = new javax.swing.JPanel();
        jbBotonSalir = new javax.swing.JButton();
        panelCenter = new javax.swing.JPanel();
        panelCTop = new javax.swing.JPanel();
        panelCMid = new javax.swing.JPanel();
        panelCBottom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agregarEstePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        linkdinGiorgina = new javax.swing.JLabel();
        gitGiorgina = new javax.swing.JLabel();
        linkdinHernan = new javax.swing.JLabel();
        gitHernan = new javax.swing.JLabel();
        linkdinJero = new javax.swing.JLabel();
        gitJero = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nombreG = new javax.swing.JLabel();
        nombreH = new javax.swing.JLabel();
        nombreJ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRoot.setLayout(new java.awt.BorderLayout());

        panelSide.setBackground(new java.awt.Color(21, 25, 28));
        panelSide.setPreferredSize(new java.awt.Dimension(100, 0));
        panelSide.setLayout(new java.awt.GridBagLayout());

        panelVacio.setBackground(new java.awt.Color(21, 25, 28));
        panelVacio.setMinimumSize(new java.awt.Dimension(100, 300));
        panelVacio.setPreferredSize(new java.awt.Dimension(80, 100));

        javax.swing.GroupLayout panelVacioLayout = new javax.swing.GroupLayout(panelVacio);
        panelVacio.setLayout(panelVacioLayout);
        panelVacioLayout.setHorizontalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelVacioLayout.setVerticalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        panelSide.add(panelVacio, new java.awt.GridBagConstraints());

        jbBotonHome.setForeground(java.awt.Color.white);
        jbBotonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-home-32.png"))); // NOI18N
        jbBotonHome.setText("Home");
        jbBotonHome.setBorder(null);
        jbBotonHome.setBorderPainted(false);
        jbBotonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBotonHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBotonHome.setPreferredSize(new java.awt.Dimension(80, 80));
        jbBotonHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbBotonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonHomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        panelSide.add(jbBotonHome, gridBagConstraints);

        jbBotonAlumno.setForeground(java.awt.Color.white);
        jbBotonAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-student-32.png"))); // NOI18N
        jbBotonAlumno.setText("Alumnos");
        jbBotonAlumno.setBorder(null);
        jbBotonAlumno.setBorderPainted(false);
        jbBotonAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBotonAlumno.setPreferredSize(new java.awt.Dimension(80, 80));
        jbBotonAlumno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbBotonAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonAlumnoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        panelSide.add(jbBotonAlumno, gridBagConstraints);

        jbBotonMateria.setForeground(java.awt.Color.white);
        jbBotonMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-book-32.png"))); // NOI18N
        jbBotonMateria.setText("Materias");
        jbBotonMateria.setBorder(null);
        jbBotonMateria.setBorderPainted(false);
        jbBotonMateria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBotonMateria.setPreferredSize(new java.awt.Dimension(80, 80));
        jbBotonMateria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbBotonMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonMateriaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        panelSide.add(jbBotonMateria, gridBagConstraints);

        jbBotonAdmin.setForeground(java.awt.Color.white);
        jbBotonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-management-32.png"))); // NOI18N
        jbBotonAdmin.setText("Admin");
        jbBotonAdmin.setBorder(null);
        jbBotonAdmin.setBorderPainted(false);
        jbBotonAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBotonAdmin.setPreferredSize(new java.awt.Dimension(80, 80));
        jbBotonAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbBotonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonAdminActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        panelSide.add(jbBotonAdmin, gridBagConstraints);

        jbBotonCosulta.setForeground(java.awt.Color.white);
        jbBotonCosulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-queries-32.png"))); // NOI18N
        jbBotonCosulta.setText("Listado");
        jbBotonCosulta.setBorder(null);
        jbBotonCosulta.setBorderPainted(false);
        jbBotonCosulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBotonCosulta.setPreferredSize(new java.awt.Dimension(80, 80));
        jbBotonCosulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbBotonCosulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonCosultaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panelSide.add(jbBotonCosulta, gridBagConstraints);

        panelMenu1.setBackground(new java.awt.Color(21, 25, 28));
        panelMenu1.setMinimumSize(new java.awt.Dimension(100, 350));
        panelMenu1.setPreferredSize(new java.awt.Dimension(90, 340));

        jbBotonSalir.setForeground(java.awt.Color.white);
        jbBotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-exit-32.png"))); // NOI18N
        jbBotonSalir.setText("Salir");
        jbBotonSalir.setBorder(null);
        jbBotonSalir.setBorderPainted(false);
        jbBotonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBotonSalir.setPreferredSize(new java.awt.Dimension(80, 80));
        jbBotonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenu1Layout = new javax.swing.GroupLayout(panelMenu1);
        panelMenu1.setLayout(panelMenu1Layout);
        panelMenu1Layout.setHorizontalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelMenu1Layout.setVerticalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenu1Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jbBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        panelSide.add(panelMenu1, gridBagConstraints);

        panelRoot.add(panelSide, java.awt.BorderLayout.WEST);

        panelCenter.setBackground(new java.awt.Color(34, 40, 44));
        panelCenter.setLayout(new java.awt.BorderLayout());

        panelCTop.setBackground(new java.awt.Color(21, 39, 43));
        panelCTop.setPreferredSize(new java.awt.Dimension(0, 120));

        javax.swing.GroupLayout panelCTopLayout = new javax.swing.GroupLayout(panelCTop);
        panelCTop.setLayout(panelCTopLayout);
        panelCTopLayout.setHorizontalGroup(
            panelCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelCTopLayout.setVerticalGroup(
            panelCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        panelCenter.add(panelCTop, java.awt.BorderLayout.PAGE_START);

        panelCMid.setBackground(new java.awt.Color(34, 40, 44));
        panelCMid.setPreferredSize(new java.awt.Dimension(1280, 720));
        panelCMid.setLayout(new java.awt.BorderLayout());
        panelCenter.add(panelCMid, java.awt.BorderLayout.CENTER);

        panelCBottom.setBackground(new java.awt.Color(21, 39, 43));
        panelCBottom.setPreferredSize(new java.awt.Dimension(0, 120));
        panelCBottom.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo.png"))); // NOI18N
        panelCBottom.add(jLabel1);
        jLabel1.setBounds(1060, 20, 112, 78);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo2.png"))); // NOI18N
        panelCBottom.add(jLabel2);
        jLabel2.setBounds(950, 10, 100, 77);

        agregarEstePanel.setBackground(new java.awt.Color(21, 39, 43));
        agregarEstePanel.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(21, 39, 43));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 50));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        linkdinGiorgina.setForeground(java.awt.Color.white);
        linkdinGiorgina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linkdinGiorgina.setText("Linkedin/Giorgina");
        linkdinGiorgina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
        jPanel2.add(linkdinGiorgina, gridBagConstraints);

        gitGiorgina.setForeground(java.awt.Color.white);
        gitGiorgina.setText("GitHub/York-Andy");
        gitGiorgina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
        jPanel2.add(gitGiorgina, gridBagConstraints);

        linkdinHernan.setForeground(java.awt.Color.white);
        linkdinHernan.setText("Linkedin/Hernan");
        linkdinHernan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
        jPanel2.add(linkdinHernan, gridBagConstraints);

        gitHernan.setForeground(java.awt.Color.white);
        gitHernan.setText("GitHub/HernanL22");
        gitHernan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
        jPanel2.add(gitHernan, gridBagConstraints);

        linkdinJero.setForeground(java.awt.Color.white);
        linkdinJero.setText("Linkedin/Jeronimo");
        linkdinJero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
        jPanel2.add(linkdinJero, gridBagConstraints);

        gitJero.setForeground(java.awt.Color.white);
        gitJero.setText("GitHub/Jerommz");
        gitJero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
        jPanel2.add(gitJero, gridBagConstraints);

        agregarEstePanel.add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel3.setBackground(new java.awt.Color(21, 39, 43));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 50));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        nombreG.setFont(new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        nombreG.setForeground(java.awt.Color.white);
        nombreG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreG.setText("Giorgina Corvalan");
        nombreG.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 80);
        jPanel3.add(nombreG, gridBagConstraints);

        nombreH.setForeground(java.awt.Color.white);
        nombreH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreH.setText("Hernan Lopez");
        nombreH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 80);
        jPanel3.add(nombreH, gridBagConstraints);

        nombreJ.setForeground(java.awt.Color.white);
        nombreJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJ.setText("Jeronimo Manabella");
        nombreJ.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 80);
        jPanel3.add(nombreJ, gridBagConstraints);

        agregarEstePanel.add(jPanel3, java.awt.BorderLayout.NORTH);

        panelCBottom.add(agregarEstePanel);
        agregarEstePanel.setBounds(30, 0, 900, 110);

        panelCenter.add(panelCBottom, java.awt.BorderLayout.SOUTH);

        panelRoot.add(panelCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelRoot, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1396, 999));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBotonCosultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonCosultaActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new AlumnosPorMateria());
        mostrarLabels();
    }//GEN-LAST:event_jbBotonCosultaActionPerformed

    private void jbBotonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonAdminActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new Administracion());
        mostrarLabels();
    }//GEN-LAST:event_jbBotonAdminActionPerformed

    private void jbBotonMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonMateriaActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new Materias());
        mostrarLabels();
    }//GEN-LAST:event_jbBotonMateriaActionPerformed

    private void jbBotonAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonAlumnoActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new Alumnos());
        mostrarLabels();
    }//GEN-LAST:event_jbBotonAlumnoActionPerformed

    private void jbBotonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonHomeActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new Home());
        sacarLabels();
    }//GEN-LAST:event_jbBotonHomeActionPerformed

    private void jbBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbBotonSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        FlatMacDarkLaf.install();
        Font customFont = new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13);
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("universidadulp.Vistas");
        UIManager.put("defaultFont", customFont);
        UIManager.put("Label.font", customFont);
        UIManager.put("TextField.font", customFont);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarEstePanel;
    private javax.swing.JLabel gitGiorgina;
    private javax.swing.JLabel gitHernan;
    private javax.swing.JLabel gitJero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbBotonAdmin;
    private javax.swing.JButton jbBotonAlumno;
    private javax.swing.JButton jbBotonCosulta;
    private javax.swing.JButton jbBotonHome;
    private javax.swing.JButton jbBotonMateria;
    private javax.swing.JButton jbBotonSalir;
    private javax.swing.JLabel linkdinGiorgina;
    private javax.swing.JLabel linkdinHernan;
    private javax.swing.JLabel linkdinJero;
    private javax.swing.JLabel nombreG;
    private javax.swing.JLabel nombreH;
    private javax.swing.JLabel nombreJ;
    private javax.swing.JPanel panelCBottom;
    private javax.swing.JPanel panelCMid;
    private javax.swing.JPanel panelCTop;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelMenu1;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JPanel panelSide;
    private javax.swing.JPanel panelVacio;
    // End of variables declaration//GEN-END:variables

    public void mostrarPanel(Component com) {
        panelCMid.removeAll();
        panelCMid.add(com);
        panelCMid.repaint();
        panelCMid.revalidate();
    }

    public void sacarLabels() {
        panelCBottom.remove(agregarEstePanel);
        panelCBottom.revalidate();
        panelCBottom.repaint();
    }

    public void mostrarLabels() {
        panelCBottom.add(agregarEstePanel);
        panelCBottom.revalidate();
        panelCBottom.repaint();
    }

    public void agregarLink(String link) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI(link));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
