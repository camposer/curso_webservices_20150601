package test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Persona;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.PersonaService;
import service.PersonaServiceImpl;
import dao.PersonaDao;
import dao.PersonaDaoDummy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class PersonaServiceTest {
	@Autowired
	private PersonaService personaService;
	
	@Test
	public void test() throws ParseException {
		Persona p1 = new Persona("Juan", "Pérez");
		Persona p2 = new Persona("María", "García");
		Persona p3 = new Persona("Pedro", "Rodríguez");
		
		// Agregar
		personaService.agregarPersona(p1);
		personaService.agregarPersona(p2);
		personaService.agregarPersona(p3);
		
		assertTrue(personaService.obtenerPersonas().size() == 3);
		assertEquals(p3, personaService.obtenerPersona(3)); // Datos de persona
		
		// Modificar
		Date fechaNacimiento = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
		p2.setNombre("modificado");
		p2.setApellido("modificado");
		p2.setFechaNacimiento(fechaNacimiento);
		
		personaService.modificarPersona(p2);
		
		assertTrue(personaService.obtenerPersonas().size() == 3);
		assertEquals(p2, personaService.obtenerPersona(2));
		
		// Eliminar
		personaService.eliminarPersona(1);

		assertTrue(personaService.obtenerPersonas().size() == 2);
		assertNull(personaService.obtenerPersona(1));
	}

	@Configuration
	public static class Config {
		@Bean
		public PersonaDao personaDao() {
			return new PersonaDaoDummy();
		}

		@Bean
		public PersonaService personaService() {
			return new PersonaServiceImpl();
		}
	}
}
