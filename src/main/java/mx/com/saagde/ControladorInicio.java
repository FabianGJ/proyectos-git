package mx.com.saagde;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/mostrar")
    public String mostrar(){
        log.info("Ejecutando el controlador rest");
        log.debug("Entro a debug para mas detalle");
    return "Hola mundo con Spring Boot";
    }
	
	public void VerMensaje(){
		log.info("Este es un mensaje de prueba para versionamiento de Git");
	}
    
}
