package edu.ecu.ec.ProyectoEmprendimiento;

import edu.ecu.ec.ProyectoEmprendimiento.View.NewJFrame;
import edu.ecu.ec.ProyectoEmprendimiento.View.NewJFrame2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import javax.swing.*;

@SpringBootApplication
public class ProyectoEmprendimientoApplication {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false"); // Deshabilita el modo headless
        ApplicationContext context = SpringApplication.run(ProyectoEmprendimientoApplication.class, args);
        NewJFrame frame = context.getBean(NewJFrame.class);
        frame.setVisible(true);


    }

}
