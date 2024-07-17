package edu.ecu.ec.ProyectoEmprendimiento.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class VentanaPrincipal extends javax.swing.JFrame {
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
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        titulo.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Aneta");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("LOGO");
        logo.setToolTipText("");

        ventaButton.setText("Venta");

        ventaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaButtonActionPerformed(evt);
            }
        });


        inventarioButton.setText("Inventario");
        inventarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioButtonActionPerformed(evt);
            }
        });

        gasolinaButton.setText("Inventario Gasolina");

        jButton5.setText("Facturas");

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
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(208, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gasolinaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                        .addComponent(ventaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inventarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ventaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(inventarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(gasolinaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addGap(126, 126, 126))
        );

        titulo.getAccessibleContext().setAccessibleDescription("");

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


    private javax.swing.JButton gasolinaButton;
    private javax.swing.JButton inventarioButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton ventaButton;
}
