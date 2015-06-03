package service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.stereotype.Service;

import service.UtilFechaService;

@Service
public class UtilFechaServiceImpl implements UtilFechaService {

	@Override
	public Boolean esBisiesto(Date fecha) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(fecha);
		
		return calendar.isLeapYear(calendar.get(Calendar.YEAR));
	}

	@Override
	public String getDia(Date fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE", new Locale("ES"));
		
		return sdf.format(fecha);
	}

}
