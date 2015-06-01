package basico;

public abstract class HolaMundoFactory {
	public static IHolaMundo createHolaMundo() {
		return new HelloWorld();
	}
}
