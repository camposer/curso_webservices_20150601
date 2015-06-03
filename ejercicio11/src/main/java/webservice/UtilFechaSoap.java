package webservice;

import java.util.Date;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import service.UtilFechaService;

@WebService
public class UtilFechaSoap {
	@Autowired
	private UtilFechaService utilFechaService;
	
	public Boolean esBisiesto(Date fecha) {
		return utilFechaService.esBisiesto(fecha);
	}
	
	public String getDia(Date fecha) {
		return utilFechaService.getDia(fecha);
	}
}
