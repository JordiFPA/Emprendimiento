package edu.ecu.ec.ProyectoEmprendimiento;

import edu.ecu.ec.ProyectoEmprendimiento.Controlador.Container;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Client;
import edu.ecu.ec.ProyectoEmprendimiento.View.PrincipalWindow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProyectoEmprendimientoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProyectoEmprendimientoApplication.class, args);
		Container c = context.getBean(Container.class);

	c.createC("DPS3175","JORDI", "jordifpa@gmail.com", "095869316","Machachi");
			String placa = "PPP3125";
				 Client client = c.getClientByPlaca(placa);
				 if(client != null){
					 System.out.println(client.getName_client());
                 } else {
					 c.createC(placa,"JORDI", "jordifpa@gmail.com", "095869316","Machachi");
				 }


	}

}
