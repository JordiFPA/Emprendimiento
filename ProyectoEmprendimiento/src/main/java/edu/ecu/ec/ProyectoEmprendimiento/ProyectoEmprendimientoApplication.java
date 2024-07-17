package edu.ecu.ec.ProyectoEmprendimiento;

import edu.ecu.ec.ProyectoEmprendimiento.View.NewJFrame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "edu.ecu.ec.ProyectoEmprendimiento")
public class ProyectoEmprendimientoApplication {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        ApplicationContext context = SpringApplication.run(ProyectoEmprendimientoApplication.class, args);
        NewJFrame frame = context.getBean(NewJFrame.class);
        frame.setVisible(true);


    }

}
