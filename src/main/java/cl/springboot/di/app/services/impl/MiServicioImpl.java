package cl.springboot.di.app.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import cl.springboot.di.app.services.IMiServicio;


//@Primary
//@Component("miServicioSimple")
public class MiServicioImpl implements IMiServicio {

	@Override
	public String operacion(){
		
		return "retornando la prueba";
	}

}
