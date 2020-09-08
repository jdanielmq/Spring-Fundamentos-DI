package cl.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import cl.springboot.di.app.services.IMiServicio;
import cl.springboot.di.app.services.impl.MiServicioComplejoImpl;
import cl.springboot.di.app.services.impl.MiServicioImpl;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	public IMiServicio registrarMiServicio() {
		return new MiServicioImpl();
	}

	@Bean("MiServicioComplejo")
	public IMiServicio registrarMiServicioComplejo() {
		return new MiServicioComplejoImpl();
	}

}
