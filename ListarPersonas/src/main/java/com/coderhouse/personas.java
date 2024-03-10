package com.coderhouse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Crear lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Pérez"));
        personas.add(new Persona("María", "González"));
        personas.add(new Persona("Carlos", "Martínez"));
        personas.add(new Persona("Ana", "López"));
        personas.add(new Persona("Pedro", "Sánchez"));

        // Ordenar la lista de personas
        ordenarPersonasPorNombre(personas);
        

        // Mostrar información de las personas ordenadas
        System.out.println("Personas ordenadas alfabéticamente por nombre:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
        }
     // Ordenar la lista de personas
        
        ordenarPersonasPorApellido(personas);
     // Mostrar información de las personas ordenadas
        System.out.println("Personas ordenadas alfabéticamente por apellido:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
        }
     // Ordenar la lista de personas inversamente por apellido
        ordenarPersonasInversamentePorApellido(personas);

        // Mostrar información de las personas ordenadas
        System.out.println("Personas ordenadas inversamente por apellido:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
        }
    }

    // Método para ordenar la lista de personas por nombre
    public static void ordenarPersonasPorNombre(List<Persona> personas) {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getNombre().compareTo(persona2.getNombre());
            }
        });

	}
    public static void ordenarPersonasPorApellido(List<Persona> personas) {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getApellido().compareTo(persona2.getApellido());
            }
        });
    }
    public static void ordenarPersonasInversamentePorApellido(List<Persona> personas) {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona2.getApellido().compareTo(persona1.getApellido());
            }
        });
    }

}
