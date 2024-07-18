package edu.ecu.ec.ProyectoEmprendimiento.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

@Component
public class VentanaPrincipal extends JFrame {
    @Autowired
    private ApplicationContext applicationContext;

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        ventaButton = new javax.swing.JButton();
        inventarioButton = new javax.swing.JButton();
        gasolinaButton = new javax.swing.JButton();
        facturasButton = new javax.swing.JButton();

        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/logo.png"))).getImage()); //poner icono a la ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);

        getContentPane().setBackground(new java.awt.Color(221, 202, 155));

        ImageIcon logoIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/logo.png")));
        Image scaledLogo = logoIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(scaledLogo));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setPreferredSize(new Dimension(500, 500));

        ventaButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18NjButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ventaButton.setText("Venta");

        ventaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaButtonActionPerformed(evt);
            }
        });

        inventarioButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18NjButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inventarioButton.setText("Inventario");
        inventarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioButtonActionPerformed(evt);
            }
        });

        gasolinaButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18NjButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gasolinaButton.setText("Inventario Gasolina");

        facturasButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18NjButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        facturasButton.setText("Facturas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(208, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gasolinaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                        .addComponent(ventaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inventarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                        .addComponent(facturasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ventaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(inventarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(gasolinaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(facturasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addGap(126, 126, 126))
        );

        pack();
    }

    private void inventarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioButtonActionPerformed

        Inventario inventario = applicationContext.getBean(Inventario.class);
        inventario.setVisible(true);
    }

    private void ventaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioButtonActionPerformed

        NewJFrame2 venta = applicationContext.getBean(NewJFrame2.class);
        venta.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipal frame;
                try {
                    frame = new VentanaPrincipal();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                frame.setVisible(true);
            }
        });
    }

    private javax.swing.JButton gasolinaButton;
    private javax.swing.JButton inventarioButton;
    private javax.swing.JButton facturasButton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton ventaButton;
}
