package basico;

public class HelloWorld implements IHolaMundo {
	@Override
	public Envoltorio saludar(String nombre) {
		return new Envoltorio("Hello " + nombre);
	}
}
