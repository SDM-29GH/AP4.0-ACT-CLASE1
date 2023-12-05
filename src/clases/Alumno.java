package clases;

import java.util.List;

public class Alumno {
	
	private Persona persona;
	private int legajo;
	private List<Materia> listamaterias;
	
	
	public Alumno() {
		
	}

	public Alumno(Persona persona, int legajo, List<Materia> listamaterias) {
		super();
		this.persona = persona;
		this.legajo = legajo;
		this.listamaterias = listamaterias;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public List<Materia> getListamaterias() {
		return listamaterias;
	}

	public void setListamaterias(List<Materia> listamaterias) {
		this.listamaterias = listamaterias;
	}

	
	

}
