package clases;

import java.util.List;

public class Materia {
	
	private int idMaterias;
	private String carrera;
	private String nombreMateria;
	
	public Materia() {
		
	}

	public Materia(int idMaterias, String carrera, String nombreMateria) {
		super();
		this.idMaterias = idMaterias;
		this.carrera = carrera;
		this.nombreMateria = nombreMateria;
	}

	public int getIdMaterias() {
		return idMaterias;
	}

	public void setIdMaterias(int idMaterias) {
		this.idMaterias = idMaterias;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombreMateria;
	}

	public void setNombre(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	@Override
	public String toString() {
		return "Materia [idMaterias=" + idMaterias + ", carrera=" + carrera + ", nombreMateria=" + nombreMateria + "]";
	}
	
	

}
