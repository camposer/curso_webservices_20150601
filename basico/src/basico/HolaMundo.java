package basico;

public class HolaMundo  implements IHolaMundo {
	private Envoltorio envoltorio;
	
	@Override
	public Envoltorio saludar(String nombre) {
		envoltorio.setNombre("Hola " + nombre);
		return envoltorio;
	}

	public void setEnvoltorio(Envoltorio envoltorio) {
		this.envoltorio = envoltorio;
	}

	public Envoltorio getEnvoltorio() {
		return envoltorio;
	}
	
	
}
