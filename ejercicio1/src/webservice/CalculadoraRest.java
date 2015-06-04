package webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import webservice.request.CalculadoraRequest;
import webservice.response.JsonResponse;

@Produces("application/json")
@Consumes("application/json")
public interface CalculadoraRest {
	@POST
	@Path("")
	public JsonResponse calcular(CalculadoraRequest calculadoraRequest);
	
	@GET
	@Path("/sumar/{a}/{b}")
	public JsonResponse sumar(
			@PathParam("a") Float a,
			@PathParam("b") Float b);

	@GET
	@Path("/restar/{a}/{b}")
	public JsonResponse restar(
			@PathParam("a") Float a,
			@PathParam("b") Float b);

	@GET
	@Path("/multiplicar/{a}/{b}")
	public JsonResponse multiplicar(
			@PathParam("a") Float a,
			@PathParam("b") Float b);

	@GET
	@Path("/dividir/{a}/{b}")
	public JsonResponse dividir(
			@PathParam("a") Float a,
			@PathParam("b") Float b);

}

