package ar.edu.unlam.pb1.primerEjemplo;

public class Alumno {



	    //Atributos o caracteristicas que va a tener todo alumno
	    
	    private int dni = 0; //4para lograr el encapsulamiento, java me permite poner private a los datos que no quiero modificar desde el exterior.
	    private float nota1 = 0.0F;
	    private float nota2 = 0.0F;
	    /*3float promedio = 0.0F;*/

	    /*Constructor de la clase */ /*Encargado de la instanciacion */

	    //4tiene que ir con el mismo nombre de la clase y SIEMPRE van a ser publicos
	    public Alumno (int valorInicialDelDni) { /*El public dice que se pueda acceder desde afuera del .class al constructor de la clase. Dentro de los parentesis se pone el valor que vamos a recibir en este metodo cuando estemos fuera de esta class Alumno */
	        dni = valorInicialDelDni;
	    }

	    //Operaciones / Comportamiento / Métodos

	    //esto es un metodo. (El metodo tambien forma parte del objeto)
	        //Se declara con parentesis y llaves. Dentro de las llaves se hace el proceso.
	    public float calcularElPromedio () { //declaro que es float por que el resultado que va a devolver es float y SIEMPRE van a ser publicos

	        float promedio = 0.0F;
	        
	        promedio = (nota1 + nota2) / 2;

	        return promedio; //return es lo que retorna.

	        //2da forma de hacerlo:

	        /*return((nota1 + nota2) / 2);*/

	    }

	    /*2void calcularElPromedio () { 

	        promedio = (nota1 + nota2) / 2;

	    }*/


	    //4Por convencion cuando queremos obtener el valor de un atributo lo hacemos de la forma getNombreDelAtributo.
	    //4Por que siempre los atributos tenemos que ponerlos como privados.

	    public int getDni () {
	        return dni;
	    }

	    public float getNota1 () {
	        return nota1;
	    }

	    public float getNota2 () { 
	        return nota2;
	    }

	    /*Si quiero dejar modificar los atributos de afuera, tengo que crear un set */
	    //void se pone cuando el metodo no me devuelve nada

	    public void setNota1 (float nuevoValor) { 
	        nota1 = nuevoValor;
	    }

	    public void setNota2 (float nuevoValor) { 
	        nota2 = nuevoValor;
	    }	
	
	
}
