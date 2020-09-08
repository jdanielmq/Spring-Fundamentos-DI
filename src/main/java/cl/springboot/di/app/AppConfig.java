package cl.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import cl.springboot.di.app.models.domain.ItemFactura;
import cl.springboot.di.app.models.domain.Producto;
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
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		return Arrays.asList(
				new ItemFactura(new Producto("Guitarra", 10000), 20),
				new ItemFactura(new Producto("Tambor", 2000), 35),
				new ItemFactura(new Producto("pandero", 54780), 5),
				new ItemFactura(new Producto("microfono", 54780), 5)
				);
		
	}

	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){
		return Arrays.asList(
				new ItemFactura(new Producto("Mouse", 10000), 20),
				new ItemFactura(new Producto("Pc de Escritorio", 530000), 2),
				new ItemFactura(new Producto("Monitores LCD 24 pulgadas", 54780), 5),
				new ItemFactura(new Producto("Teclado Tech", 54780), 5)
				);
		
	}
	
}
