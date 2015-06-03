package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class UtilFechaServiceTest {
	public static final String PATTERN = "yyyy-MM-dd";
	@Autowired
	private UtilFechaService utilFechaService;

	@Test
	public void testEsBisiesto() throws ParseException {
		Date fecha1 = new SimpleDateFormat(PATTERN).parse("2016-01-01");
		Date fecha2 = new SimpleDateFormat(PATTERN).parse("2015-01-01");
		
		Assert.assertTrue(utilFechaService.esBisiesto(fecha1));
		Assert.assertFalse(utilFechaService.esBisiesto(fecha2));
		
	}
	
	@Test
	public void testGetDia() throws ParseException {
		Date fecha1 = new SimpleDateFormat(PATTERN).parse("2016-01-01");
		Date fecha2 = new SimpleDateFormat(PATTERN).parse("2015-06-03");
		
		Assert.assertEquals("vie", utilFechaService.getDia(fecha1));
		Assert.assertEquals("mié", utilFechaService.getDia(fecha2));
	}
	
	@Configuration
	public static class Config {
		@Bean
		public UtilFechaService utilFechaService() {
			return new UtilFechaServiceImpl();
		}
	}
}
