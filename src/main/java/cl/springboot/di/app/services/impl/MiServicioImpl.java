package cl.springboot.di.app.services.impl;

import org.springframework.stereotype.Component;

import cl.springboot.di.app.services.IMiServicio;



@Component
public class MiServicioImpl implements IMiServicio {

	@Override
	public String operacion(){
		
		return "retornando la prueba";
	}

}
