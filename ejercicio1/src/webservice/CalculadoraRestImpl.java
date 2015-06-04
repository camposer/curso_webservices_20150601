package webservice;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.CalculadoraService;
import webservice.request.CalculadoraRequest;
import webservice.request.CalculadoraRequest.Operacion;
import webservice.response.JsonResponse;

@Component
public class CalculadoraRestImpl implements CalculadoraRest {
	@Autowired
	private CalculadoraService calculadoraService;
	
	public JsonResponse calcular(CalculadoraRequest calculadoraRequest) {
		try {			
			Float resultado = null;
			
			String operacion = calculadoraRequest.getOperacion();
			Float op1 = calculadoraRequest.getOp1();
			Float op2 = calculadoraRequest.getOp2();
			
			if (operacion.equals(Operacion.SUMA.name()))
				resultado = calculadoraService.sumar(op1, op2);
			else if (operacion.equals(Operacion.RESTA.name()))
				resultado = calculadoraService.restar(op1, op2);
			else if (operacion.equals(Operacion.MULTIPLICACION.name()))
				resultado = calculadoraService.multiplicar(op1, op2);
			else if (operacion.equals(Operacion.DIVISION.name()))
				resultado = calculadoraService.dividir(op1, op2);
			
			if (resultado == null)
				throw new Exception("Operación inválida. El resultado no pudo calcularse");
			
			return JsonResponse.success(resultado);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.error(e.getMessage());
		} 
	}

	@Override
	public JsonResponse sumar(Float a, Float b) {
		return JsonResponse.success(calculadoraService.sumar(a, b));
	}

	@Override
	public JsonResponse restar(Float a, Float b) {
		return JsonResponse.success(calculadoraService.restar(a, b));
	}

	@Override
	public JsonResponse multiplicar(Float a, Float b) {
		return JsonResponse.success(calculadoraService.multiplicar(a, b));
	}

	@Override
	public JsonResponse dividir(Float a, Float b) {
		return JsonResponse.success(calculadoraService.dividir(a, b));
	}
}
