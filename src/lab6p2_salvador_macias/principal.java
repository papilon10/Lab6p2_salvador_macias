/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab6p2_salvador_macias;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Apple
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        DefaultComboBoxModel modelo_mochila = new DefaultComboBoxModel();

        cb_tienda.setModel(modelo);
        cb_comprados.setModel(modelo_mochila);
        //  cb_comprados.setModel(modelo);

        DefaultComboBoxModel modeoCasteado = (DefaultComboBoxModel) cb_tienda.getModel();
        modeoCasteado.addElement(Pocion.getNombre());
        modeoCasteado.addElement(MaxRevive.getNombre());
        modeoCasteado.addElement(Xattack.getNombre());
        modeoCasteado.addElement(Xspeed.getNombre());
        modeoCasteado.addElement(RareCandy.getNombre());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Psyduck_boton = new javax.swing.JButton();
        Gengar_boton = new javax.swing.JButton();
        Rayquaza_boton = new javax.swing.JButton();
        Gardevoir_boton = new javax.swing.JButton();
        Blaziken_boton = new javax.swing.JButton();
        Jigglypuff_boton = new javax.swing.JButton();
        boton_batalla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cb_tienda = new javax.swing.JComboBox<>();
        Comprar_boton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cb_comprados = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setText("Equipo disponible");

        Psyduck_boton.setText("Psyduck");
        Psyduck_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Psyduck_botonMouseClicked(evt);
            }
        });

        Gengar_boton.setText("Gengar");
        Gengar_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gengar_botonMouseClicked(evt);
            }
        });

        Rayquaza_boton.setText("Rayquaza");
        Rayquaza_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rayquaza_botonMouseClicked(evt);
            }
        });

        Gardevoir_boton.setText("Gardevoir");
        Gardevoir_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gardevoir_botonMouseClicked(evt);
            }
        });

        Blaziken_boton.setText("Blaziken");
        Blaziken_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Blaziken_botonMouseClicked(evt);
            }
        });

        Jigglypuff_boton.setText("Jigglypuff");
        Jigglypuff_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jigglypuff_botonMouseClicked(evt);
            }
        });
        Jigglypuff_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jigglypuff_botonActionPerformed(evt);
            }
        });

        boton_batalla.setText("batalla");
        boton_batalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_batallaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Gardevoir_boton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                        .addComponent(Jigglypuff_boton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Psyduck_boton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Gengar_boton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Rayquaza_boton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Blaziken_boton)))
                .addGap(134, 134, 134))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(boton_batalla))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Psyduck_boton)
                    .addComponent(Gengar_boton))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rayquaza_boton)
                    .addComponent(Blaziken_boton))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gardevoir_boton)
                    .addComponent(Jigglypuff_boton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(boton_batalla)
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Pokemon", jPanel1);

        cb_tienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tiendaActionPerformed(evt);
            }
        });

        Comprar_boton.setText("Comprar");
        Comprar_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Comprar_botonMouseClicked(evt);
            }
        });
        Comprar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprar_botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(cb_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(Comprar_boton)
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comprar_boton)
                    .addComponent(cb_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tienda", jPanel2);

        cb_comprados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(cb_comprados, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(cb_comprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mochila", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jigglypuff_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jigglypuff_botonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jigglypuff_botonActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        /* if (SwingUtilities.isRightMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "el azul");
        } else if (SwingUtilities.isLeftMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "el negro");

        }*/

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void Comprar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprar_botonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Comprar_botonActionPerformed

    private void cb_tiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tiendaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tiendaActionPerformed

    private void Psyduck_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Psyduck_botonMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "Estadisticas\n\n" + Psyduck.toString());//lista_pokemons.get(0).toString());
        } else if (SwingUtilities.isLeftMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "se actualizaron las estadisticas");

            if (cb_comprados.getSelectedItem().equals(Pocion)) {
                int i = Psyduck.getVida();
                Psyduck.setVida(i + 20);
                cb_comprados.removeItem(Pocion);

            } else if (cb_comprados.getSelectedItem().equals(MaxRevive)) {
                Psyduck.setVida(100);
                cb_comprados.removeItem(MaxRevive);

            } else if (cb_comprados.getSelectedItem().equals(Xspeed)) {
                int i = Psyduck.getVelocida();
                Psyduck.setVelocida(i + 15);
                cb_comprados.removeItem(Xspeed);

            } else if (cb_comprados.getSelectedItem().equals(Xattack)) {
                int i = Psyduck.getAtaque();
                Psyduck.setAtaque(i + 10);
                cb_comprados.removeItem(Xattack);

            } else if (cb_comprados.getSelectedItem().equals(RareCandy)) {
                int i = Psyduck.getNivel();
                Psyduck.setNivel(i + 3);
                cb_comprados.removeItem(RareCandy);

            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Psyduck_botonMouseClicked

    private void Rayquaza_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rayquaza_botonMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "Estadisticas\n\n" + Rayquaza.toString());
        } else if (SwingUtilities.isLeftMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "se actualizaron las estadisticas");
            if (cb_comprados.getSelectedItem().equals(Pocion)) {
                int i = Rayquaza.getVida();
                Rayquaza.setVida(i + 20);
                cb_comprados.removeItem(Pocion);

            } else if (cb_comprados.getSelectedItem().equals(MaxRevive)) {
                Rayquaza.setVida(100);
                cb_comprados.removeItem(MaxRevive);

            } else if (cb_comprados.getSelectedItem().equals(Xspeed)) {
                int i = Rayquaza.getVelocida();
                Rayquaza.setVelocida(i + 15);
                cb_comprados.removeItem(Xspeed);

            } else if (cb_comprados.getSelectedItem().equals(Xattack)) {
                int i = Rayquaza.getAtaque();
                Rayquaza.setAtaque(i + 10);
                cb_comprados.removeItem(Xattack);

            } else if (cb_comprados.getSelectedItem().equals(RareCandy)) {
                int i = Rayquaza.getNivel();
                Rayquaza.setNivel(i + 3);
                cb_comprados.removeItem(RareCandy);

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Rayquaza_botonMouseClicked

    private void Gardevoir_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gardevoir_botonMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "Estadisticas\n\n" + Gardevoir.toString());
        } else if (SwingUtilities.isLeftMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "se actualizaron las estadisticas");
            if (cb_comprados.getSelectedItem().equals(Pocion)) {
                int i = Gardevoir.getVida();
                Gardevoir.setVida(i + 20);
                cb_comprados.removeItem(Pocion);

            } else if (cb_comprados.getSelectedItem().equals(MaxRevive)) {
                Gardevoir.setVida(100);
                cb_comprados.removeItem(MaxRevive);

            } else if (cb_comprados.getSelectedItem().equals(Xspeed)) {
                int i = Gardevoir.getVelocida();
                Gardevoir.setVelocida(i + 15);
                cb_comprados.removeItem(Xspeed);

            } else if (cb_comprados.getSelectedItem().equals(Xattack)) {
                int i = Gardevoir.getAtaque();
                Gardevoir.setAtaque(i + 10);
                cb_comprados.removeItem(Xattack);

            } else if (cb_comprados.getSelectedItem().equals(RareCandy)) {
                int i = Gardevoir.getNivel();
                Gardevoir.setNivel(i + 3);
                cb_comprados.removeItem(RareCandy);

            }

        }
// TODO add your handling code here:
    }//GEN-LAST:event_Gardevoir_botonMouseClicked

    private void Gengar_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gengar_botonMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "Estadisticas\n\n" + Gengar.toString());
        } else if (SwingUtilities.isLeftMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "se actualizaron las estadisticas");
            if (cb_comprados.getSelectedItem().equals(Pocion)) {
                int i = Gengar.getVida();
                Gengar.setVida(i + 20);
                cb_comprados.removeItem(Pocion);

            } else if (cb_comprados.getSelectedItem().equals(MaxRevive)) {
                Gengar.setVida(100);
                cb_comprados.removeItem(MaxRevive);

            } else if (cb_comprados.getSelectedItem().equals(Xspeed)) {
                int i = Gengar.getVelocida();
                Gengar.setVelocida(i + 15);
                cb_comprados.removeItem(Xspeed);

            } else if (cb_comprados.getSelectedItem().equals(Xattack)) {
                int i = Gengar.getAtaque();
                Gengar.setAtaque(i + 10);
                cb_comprados.removeItem(Xattack);

            } else if (cb_comprados.getSelectedItem().equals(RareCandy)) {
                int i = Gengar.getNivel();
                Gengar.setNivel(i + 3);
                cb_comprados.removeItem(RareCandy);

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Gengar_botonMouseClicked

    private void Blaziken_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blaziken_botonMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "Estadisticas\n\n" + Blaziken.toString());
        } else if (SwingUtilities.isLeftMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "se actualizaron las estadisticas");
            if (cb_comprados.getSelectedItem().equals(Pocion)) {
                int i = Blaziken.getVida();
                Blaziken.setVida(i + 20);
                cb_comprados.removeItem(Pocion);

            } else if (cb_comprados.getSelectedItem().equals(MaxRevive)) {
                Blaziken.setVida(100);
                cb_comprados.removeItem(MaxRevive);

            } else if (cb_comprados.getSelectedItem().equals(Xspeed)) {
                int i = Blaziken.getVelocida();
                Blaziken.setVelocida(i + 15);
                cb_comprados.removeItem(Xspeed);

            } else if (cb_comprados.getSelectedItem().equals(Xattack)) {
                int i = Blaziken.getAtaque();
                Blaziken.setAtaque(i + 10);
                cb_comprados.removeItem(Xattack);

            } else if (cb_comprados.getSelectedItem().equals(RareCandy)) {
                int i = Blaziken.getNivel();
                Blaziken.setNivel(i + 3);
                cb_comprados.removeItem(RareCandy);

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Blaziken_botonMouseClicked

    private void Jigglypuff_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jigglypuff_botonMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "Estadisticas\n\n" + Jigglypuff.toString());
        } else if (SwingUtilities.isLeftMouseButton(evt)) {
            JOptionPane.showMessageDialog(this, "se actualizaron las estadisticas");
            if (cb_comprados.getSelectedItem().equals(Pocion)) {
                int i = Jigglypuff.getVida();
                Jigglypuff.setVida(i + 20);
                cb_comprados.removeItem(Pocion);

            } else if (cb_comprados.getSelectedItem().equals(MaxRevive)) {
                Jigglypuff.setVida(100);
                cb_comprados.removeItem(MaxRevive);

            } else if (cb_comprados.getSelectedItem().equals(Xspeed)) {
                int i = Jigglypuff.getVelocida();
                Jigglypuff.setVelocida(i + 15);
                cb_comprados.removeItem(Xspeed);

            } else if (cb_comprados.getSelectedItem().equals(Xattack)) {
                int i = Jigglypuff.getAtaque();
                Jigglypuff.setAtaque(i + 10);
                cb_comprados.removeItem(Xattack);

            } else if (cb_comprados.getSelectedItem().equals(RareCandy)) {
                int i = Jigglypuff.getNivel();
                Jigglypuff.setNivel(i + 3);
                cb_comprados.removeItem(RareCandy);

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Jigglypuff_botonMouseClicked

    private void Comprar_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comprar_botonMouseClicked
        cb_tienda.getSelectedItem();
        Object objeto = cb_tienda.getSelectedItem();
        DefaultComboBoxModel casteado_comprados = (DefaultComboBoxModel) cb_comprados.getModel();
        lista_items.add(objeto);
        casteado_comprados.addElement(objeto);

        // TODO add your handling code here:
    }//GEN-LAST:event_Comprar_botonMouseClicked

    private void boton_batallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_batallaActionPerformed
        Random aleatorio = new Random();
        int digito = aleatorio.nextInt(11);
        //  System.out.println(digito);
        int vida_psy = Psyduck.getVida();
        Psyduck.setVida(vida_psy - digito);
        int vida_ray = Rayquaza.getVida();
        Rayquaza.setVida(vida_ray - digito);
        int vidaGardevoir = Gardevoir.getVida();
        Gardevoir.setVida(vidaGardevoir - digito);
        int vidaGengar = Gengar.getVida();
        Gengar.setVida(vidaGengar - digito);
        int vidaBlaziken = Blaziken.getVida();
        Blaziken.setVida(vidaBlaziken - digito);
        int vidaJigly = Jigglypuff.getVida();
        Jigglypuff.setVida(vidaJigly - digito);

        // TODO add your handling code here:
    }//GEN-LAST:event_boton_batallaActionPerformed

    public static void Pocion_psy() {

        int vida_psy = Psyduck.getVida();
        Psyduck.setVida(vida_psy + 20);
    }

    public static void pocion_ray() {
        int vida_ray = Rayquaza.getVida();
        Rayquaza.setVida(vida_ray + 20);
    }

    public static void pocion_garde() {
        int vidaGardevoir = Gardevoir.getVida();
        Gardevoir.setVida(vidaGardevoir + 20);

    }

    public static void pocion_gengar() {
        int vidaGengar = Gengar.getVida();
        Gengar.setVida(vidaGengar + 20);
    }

    public static void pocion_blaziquen() {
        int vidaBlaziken = Blaziken.getVida();
        Blaziken.setVida(vidaBlaziken + 20);
    }

    public static void pocion_jiggly() {
        int vidaJigly = Jigglypuff.getVida();
        Jigglypuff.setVida(vidaJigly + 20);
    }

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blaziken_boton;
    private javax.swing.JButton Comprar_boton;
    private javax.swing.JButton Gardevoir_boton;
    private javax.swing.JButton Gengar_boton;
    private javax.swing.JButton Jigglypuff_boton;
    private javax.swing.JButton Psyduck_boton;
    private javax.swing.JButton Rayquaza_boton;
    private javax.swing.JButton boton_batalla;
    private javax.swing.JComboBox<String> cb_comprados;
    private javax.swing.JComboBox<String> cb_tienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    public static ArrayList<Pokemon> lista_pokemons = new ArrayList<>();
    public static ArrayList lista_items = new ArrayList<>();

    // public static Pokemon Psyduck = new Pokemon(40, 50, 50, 50,
    //       "60", "30", "30", "50", "Psyduck");
    // public static Pokemon Psyduck = new Pokemon(40, 50, 50, 60, 30, 40, 100, "Psyduck");
    public static Pokemon Psyduck = new Pokemon(40, 50, 50, 60, 70, 100, "Psyduck", 5);

    public static Pokemon Rayquaza = new Pokemon(30, 60, 30, 80, 20, 100, "Rayquaza", 5);

    public static Pokemon Gardevoir = new Pokemon(50, 70, 30, 90, 30, 200, "Gardevoir", 5);

    public static Pokemon Gengar = new Pokemon(45, 90, 35, 70, 80, 200, "Gengar", 5);

    public static Pokemon Blaziken = new Pokemon(50, 100, 10, 20, 45, 100, "Blaziken", 5);

    public static Pokemon Jigglypuff = new Pokemon(80, 90, 20, 45, 100, 100, "Jigglypuff", 5);

    public static Items Pocion = new Items("Pocion");
    public static Items MaxRevive = new Items("MaxRevive");
    public static Items Xspeed = new Items("Xspeed");
    public static Items Xattack = new Items("Xattack");
    public static Items RareCandy = new Items("Rare candy");

}
