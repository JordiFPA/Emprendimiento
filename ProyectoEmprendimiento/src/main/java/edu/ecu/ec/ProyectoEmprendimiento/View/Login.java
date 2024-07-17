package edu.ecu.ec.ProyectoEmprendimiento.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class Login extends JFrame {
    @Autowired
    private ApplicationContext applicationContext;

    public Login() throws Exception {
        try {
            initComponents();
            centerFrame();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginImage = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField = new JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (loginButtonActionPerformed(e)) {
                    VentanaPrincipal ventana = applicationContext.getBean(VentanaPrincipal.class);
                    ventana.setVisible(true);
                    dispose(); // Cerrar la ventana de login
                }
            }
        });


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 202, 155));

        loginImage.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        loginImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginImage.setIcon(new ImageIcon(getClass().getResource("/login.png")));


        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
                jPasswordField.requestFocus();
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        jLabel3.setText("Contraseña:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Ingresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(jPasswordField))
                                .addGap(84, 84, 84))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(loginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(120, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private boolean loginButtonActionPerformed(ActionEvent evt) {
        String usuario = jTextField1.getText();
        String password = String.valueOf(jPasswordField.getPassword());

        if (usuario.toUpperCase().equals("USER") && password.equals("123")) {
            // Login successful
            return true;
        } else {
            // Login failed
            jPasswordField.setText("");
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            jPasswordField.requestFocus();
            return false;
        }
    }
    private void centerFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel loginImage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private JPasswordField jPasswordField;
}

