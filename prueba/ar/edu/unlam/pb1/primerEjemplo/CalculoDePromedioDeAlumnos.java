package ar.edu.unlam.pb1.primerEjemplo;

public class CalculoDePromedioDeAlumnos {

	public static void main(String[] args) {
		float promedioGeneral; // variables de tipo primitivo
		promedioGeneral = 0.0F;
		float promedioAlumno = 0.0F;
		
		Alumno florencia; // Declaraci贸n de una variable tipo objeto
		// La inicializaci贸n de una variable tipo objeto se llama instanciaci贸n (Instance = Ejemplo)
		florencia = new Alumno(30546513); // Instanciaci贸n de una variable tipo objeto
		
		Alumno dario = new Alumno(45451216);
		
		Alumno federico, esteban, lautaro, virginia, sebastian, tomas, angeles, cristian;
		
		florencia.setNota1(10.0F);
		florencia.setNota2(4.0F);
	
		System.out.println("El promedio del dni " + florencia.getDni() + " es " + florencia.calcularElPromedio());
		
		florencia.setNota2(7.0F);
		
		System.out.println("El promedio del dni " + florencia.getDni() + " es " + florencia.calcularElPromedio());
		
		dario.setNota1(9.0F);
		dario.setNota2(7.0F);
		
		System.out.println("El promedio del dni " + dario.getDni() + " es " + dario.calcularElPromedio());
		
		promedioGeneral = (florencia.calcularElPromedio() + dario.calcularElPromedio()) / 2;
		
		System.out.println("El promedio de la clase es :" + promedioGeneral);

	}

}
