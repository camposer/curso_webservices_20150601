package gui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;

import webservice.UtilFechaSoap;
import webservice.UtilFechaSoapService;

public class UtilFechaGui {
	public static final String PATTERN = "yyyy-MM-dd";
	private UtilFechaSoap utilFechaSoap;
	
	public UtilFechaGui() {
		utilFechaSoap = new UtilFechaSoapService().getUtilFechaSoapPort();
	}
	
	public void iniciar() throws Exception {
		GregorianCalendar calendar = new GregorianCalendar();

		DatatypeFactory dataTypeFactory = DatatypeFactory
				.newInstance();
		
		Date fecha1 = new SimpleDateFormat(PATTERN).parse("2016-01-01");
		Date fecha2 = new SimpleDateFormat(PATTERN).parse("2015-01-01");
		
		calendar.setTime(fecha1);
		System.out.println(utilFechaSoap.esBisiesto(
				dataTypeFactory.newXMLGregorianCalendar(calendar)));

		calendar.setTime(fecha2);
		System.out.println((utilFechaSoap.esBisiesto(
				dataTypeFactory.newXMLGregorianCalendar(calendar))));

		fecha1 = new SimpleDateFormat(PATTERN).parse("2016-01-01");
		fecha2 = new SimpleDateFormat(PATTERN).parse("2015-06-03");
		
		calendar.setTime(fecha1);
		System.out.println((utilFechaSoap.getDia(
				dataTypeFactory.newXMLGregorianCalendar(calendar))));

		calendar.setTime(fecha2);
		System.out.println((utilFechaSoap.getDia(
				dataTypeFactory.newXMLGregorianCalendar(calendar))));
	}
	
	public static void main(String[] args) throws Exception {
		new UtilFechaGui().iniciar();
	}
}
