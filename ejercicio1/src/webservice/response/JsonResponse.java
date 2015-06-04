package webservice.response;

public class JsonResponse {
	private Boolean success;
	private Object result; 
	
	
	public JsonResponse() {
	
	}
	
	private JsonResponse(Boolean success, Object resultado) {
		this.success = success;
		this.result = resultado;
	}
	
	public static JsonResponse success(Object resultado) {
		return new JsonResponse(true, resultado);
	}

	public static JsonResponse error(String mensaje) {
		return new JsonResponse(false, mensaje);
	}

	public Boolean getSuccess() {
		return success;
	}

	public Object getResult() {
		return result;
	}
}
