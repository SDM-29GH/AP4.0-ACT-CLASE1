package main;

import java.util.ArrayList;
import java.util.List;

import clases.Alumno;
import clases.Materia;
import clases.Persona;

public class mainCorrelativas {

	public static void main(String[] args) {
		
		List<Materia> listaMaterias = new ArrayList<>();
		
		Persona persona = new Persona(22333444, "Marian", "Marnez");
		Alumno alumno = new Alumno();
		Materia materia = new Materia(1, "Programación", "Algoritmo y Estructuras de Datos");
		
		alumno.setPersona(persona);
		
		
		System.out.println("***** Información de Persona con setter y getter *****");
		System.out.println("DNI: "+persona.getDni()+" | "+"NOMBRE: "+persona.getNombre()+" | "+"APELLIDO: "+persona.getApellido());
		System.out.println("***** Información de Persona con toString() *****");
		System.out.println(persona.toString());
		
		System.out.println("Persona Alumno: "+alumno.getPersona());

	}

}
