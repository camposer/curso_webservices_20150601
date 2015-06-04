package gui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import webservice.CalculadoraRest;
import calculator.webservice.CalculadoraSoap;
import calculator.webservice.CalculadoraSoap_Service;

public class CalculadoraGui {
	private Scanner scanner;
	private CalculadoraSoap calculadoraSoap;
	private CalculadoraRest calculadoraRest;
	
	public CalculadoraGui() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		calculadoraSoap = ctx.getBean(CalculadoraSoap.class);
		calculadoraSoap = new CalculadoraSoap_Service().getCalculadoraSoapPort();
		scanner = new Scanner(System.in);
		calculadoraRest = ctx.getBean(CalculadoraRest.class);
	}
	
	public void iniciar() {
		while (true) {
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			
			String opcion = scanner.nextLine();
			
			if (opcion.equals("5"))
				break;
			
			System.out.print("a? ");
			Float a = Float.parseFloat(scanner.nextLine());
			System.out.print("b? ");
			Float b = Float.parseFloat(scanner.nextLine());
			
			if (opcion.equals("1"))
//				System.out.println(a + " + " + b + " = " + 
//						calculadoraSoap.sum(a, b));
				System.out.println(a + " + " + b + " = " + 
						calculadoraRest.sumar(a, b).getResult());
			else if (opcion.equals("2"))
				System.out.println(a + " - " + b + " = " + 
						calculadoraSoap.substract(a, b));
			else if (opcion.equals("3"))
				System.out.println(a + " * " + b + " = " + 
						calculadoraSoap.multiply(a, b));
			else if (opcion.equals("1"))
				System.out.println(a + " / " + b + " = " + 
						calculadoraSoap.divide(a, b));
		}
	}
	
	public static void main(String[] args) {
		new CalculadoraGui().iniciar();
	}
}
