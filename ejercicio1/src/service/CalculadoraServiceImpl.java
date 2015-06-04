package service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public float sumar(float a, float b) {
		return a + b;
	}

	@Override
	public float restar(float a, float b) {
		return a - b;
	}

	@Override
	public float multiplicar(float a, float b) {
		return a * b;
	}

	@Override
	public float dividir(float a, float b) {
		return a / b;
	}

}
