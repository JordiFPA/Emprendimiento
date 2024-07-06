package edu.ecu.ec.ProyectoEmprendimiento.View;

import org.hibernate.boot.jaxb.mapping.JaxbFieldResult;

import javax.swing.*;
import java.awt.*;

public class PrincipalWindow extends JFrame {

    public PrincipalWindow() {
        // Configurar la ventana
        setTitle("Interfaz de Usuario");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Crear panel para el logo
        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(800, 100));
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/propuestaLogo.png"));
        JLabel logoLabel = new JLabel(imgIcon, JLabel.CENTER);

        // Aquí puedes agregar tu imagen
        logoLabel.setFont(new Font("Arial", Font.BOLD, 24));
        logoPanel.add(logoLabel);

        // Crear panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2, 10, 10));
        buttonPanel.setPreferredSize(new Dimension(800, 500));

        // Agregar botones con imágenes
        for (int i = 1; i <= 4; i++) {
            JButton button = new JButton("Botón " + i); // Aquí puedes agregar imágenes en lugar de texto
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            buttonPanel.add(button);
        }

        // Agregar paneles a la ventana principal
        add(logoPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }
}