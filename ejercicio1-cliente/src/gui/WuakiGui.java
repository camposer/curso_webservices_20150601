package gui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import webservice.WuakiRest;

public class WuakiGui {
	private WuakiRest wuakiRest;
	
	public WuakiGui() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		calculadoraSoap = ctx.getBean(CalculadoraSoap.class);
		wuakiRest = ctx.getBean(WuakiRest.class);
	}
	
	public void iniciar() {
		try {
			System.out.println(wuakiRest.movies());
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	public static void main(String[] args) {
		new WuakiGui().iniciar();
	}
}
