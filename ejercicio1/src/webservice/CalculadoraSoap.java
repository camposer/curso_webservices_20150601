package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;

import service.CalculadoraService;

@WebService(
		serviceName = "CalculadoraSoap",
		targetNamespace = "webservice.calculator")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class CalculadoraSoap  {
	@Autowired
	private CalculadoraService calculadoraService;

	@WebMethod(operationName = "sum")
	@RequestWrapper
	public float sumar(
			@WebParam(name = "op1") float a, 
			@WebParam(name = "op2") float b) {
		return calculadoraService.sumar(a, b);
	}

	@WebMethod(operationName = "substract")
	public float restar(
			@WebParam(name = "op1") float a, 
			@WebParam(name = "op2") float b) {
		return calculadoraService.restar(a, b);
	}

	@WebMethod(operationName = "multiply")
	public float multiplicar(
			@WebParam(name = "op1") float a, 
			@WebParam(name = "op2") float b) {
		return calculadoraService.multiplicar(a, b);
	}

	@WebMethod(operationName = "divide")
	public float dividir(
			@WebParam(name = "op1") float a, 
			@WebParam(name = "op2") float b) {
		
		return calculadoraService.dividir(a, b);
	}

}
