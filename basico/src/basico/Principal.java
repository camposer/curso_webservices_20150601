package basico;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		IHolaMundo hm = ctx.getBean("holaMundo", IHolaMundo.class);
		System.out.println(hm.saludar("Juan")); // => Hola [ nombre =  Juan]
		
		hm = ctx.getBean("holaMundo", IHolaMundo.class);
		System.out.println(((HolaMundo) hm).getEnvoltorio()); // => ???
		
		Envoltorio envoltorio = ctx.getBean("mienvoltorio", Envoltorio.class);
		System.out.println(envoltorio); // => nombre = null
		envoltorio.setNombre("Adiós");
		System.out.println(envoltorio); // => nombre = Adiós
		
		envoltorio = ctx.getBean("mienvoltorio", Envoltorio.class);
		System.out.println(envoltorio); // => nombre = null
		
		hm = ctx.getBean("helloWorld", IHolaMundo.class);
		System.out.println(hm.saludar("Juan"));
	}
}
