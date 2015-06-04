package dao;

import java.util.List;

import model.Persona;

public interface PersonaDao {
	void agregar(Persona p);
	void modificar(Persona p);
	void eliminar(Integer id);
	Persona obtener(Integer id);
	List<Persona> obtenerTodos();
}
