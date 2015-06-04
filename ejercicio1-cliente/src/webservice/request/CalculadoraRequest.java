package webservice.request;

public class CalculadoraRequest {
	private String operacion;
	private Float op1;
	private Float op2;
	
	public static enum Operacion {
		SUMA, RESTA, MULTIPLICACION, DIVISION;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public Float getOp1() {
		return op1;
	}

	public void setOp1(Float op1) {
		this.op1 = op1;
	}

	public Float getOp2() {
		return op2;
	}

	public void setOp2(Float op2) {
		this.op2 = op2;
	}
}
