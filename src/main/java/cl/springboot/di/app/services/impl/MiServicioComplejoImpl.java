package cl.springboot.di.app.services.impl;

import org.springframework.stereotype.Component;

import cl.springboot.di.app.services.IMiServicio;

//@Component("MiServicioComplejo")
public class MiServicioComplejoImpl implements IMiServicio{

	@Override
	public String operacion() {
		
		return "esta es una interfaces compleja";
	}

}
