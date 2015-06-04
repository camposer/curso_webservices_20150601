package dao;

import java.util.ArrayList;
import java.util.List;

import model.Persona;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaDaoDummy implements PersonaDao {
	private List<Persona> personas;
	private int contador;
	
	public PersonaDaoDummy() {
		personas = new ArrayList<Persona>();
		contador = 1;
	}

	@Override
	public void agregar(Persona p) {
		p.setId(contador++);
		personas.add(p);
	}

	@Override
	public void modificar(Persona persona) {
		Persona p = obtener(persona.getId());
		if (p != null)
			personas.set(personas.indexOf(p), persona);
	}

	@Override
	public void eliminar(Integer id) {
		Persona p = obtener(id);
		if (p != null)
			personas.remove(p);
	}

	@Override
	public Persona obtener(Integer id) {
		for (Persona p : personas)
			if (p.getId().equals(id))
				return p;
		return null;
	}

	@Override
	public List<Persona> obtenerTodos() {
		return personas;
	}

}
