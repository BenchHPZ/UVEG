
package rivera_benjamin_r5_u3;

/**
 * @author Benjamin Rivera Covarrubias
 * Fecha de elaboracion: 27 de noviembre de 2020
 * Nombre de modulo: Programación orientada a objetos v2
 * Nombre del Asesor: Miguel Pérez
 */

public class Rivera_Benjamin_R5_U3 {

    public static void main(String[] args) {

    	// Declaramos e instanciamos a entes que se usaran
    	// como ejemplo
        Profesor profe = new Profesor(10, 
    					"Miguel", "Perez",
    					"miguel(at)perez.mx");
        Alumno alumno1 = new Alumno(11,
        				"Benjamin", "Rivera",
        				"benjamin(at)rivera.mx");
        Alumno alumno2 = new Alumno(15,
        				"Fulanito", "de Tal",
        				"fulanito(at)detal.mx");
        Tutor tutor1 = new Tutor(12,
        				"Vianney", "Contreras",
        				"vianney(at)contreras.mx",
        				alumno1);
        Tutor tutor2 = new Tutor(16,
        				"Tutor", "2",
        				"tutor(at)2.mx",
        				alumno2);

        // Imprimimos todos los perfiles instanciados
        open_str("Perfiles");
        profe.imprimir_perfil();
        alumno1.imprimir_perfil();
        alumno2.imprimir_perfil();
        tutor1.imprimir_perfil();
        tutor2.imprimir_perfil();
		close_str("Perfiles");

		// Asignamos calificacion a los alumnos
        alumno1.guardar_calificacion(10.0);
        alumno2.guardar_calificacion(8.5);

        // Imprimimos las calificaciones de los alumnos
        open_str("Calificaiones");
        tutor1.mostrar_calificacion();
        tutor2.mostrar_calificacion();
        close_str("Calificaiones");
    }


    // Funciones para que se vea mas agradable el string de salida
    private static void open_str(String str){
    	System.out.println("\n||---------- " + str + " ---------->>\n");
    }
    private static void close_str(String str){
    	System.out.println("\n<<---------- " + str + " ----------||\n");	
    }
    
    
	// << ------------------------- Clases ------------------------- >>

    private static class Persona{
    	/**
		 * Clase general de persona que guarda los atributos y metodos 
		 * que todos los integrantes de la "Escuela de Informática Río
		 * Grande" comparten
		 *
		 * Todos los atributos son privados para que se tenga que accedare
		 * mediante setters y getters a ellos.
		 * 
		 * La funcion nombre_completo no fue solicitada pero me aprecio
		 * util e informativa en el programa.
		 *
    	 */
    	private int id;
    	private String nombre;
    	private String apellido;
    	private String correoElectronico;


    	public Persona(int id, String nombre, String apellido, String correoElectronico){
    		/**
    		 * Constructor general de personas, asigna directamente cada uno
    		 * de los parametros a sus atributos correspondientes.
    		 */
    		this.id = id;
    		this.nombre = nombre;
    		this.apellido = apellido;
    		this.correoElectronico = correoElectronico;
    	}

    	public void imprimir_perfil(){
    		/**
    		 * Funcion que imprime en consola los datos generales que esten
    		 * almacenados de cada una de las personas.
    		 */
    		System.out.println("---------- Integrante ----------");

    		System.out.print("ID: ");
        	System.out.println(this.id);
        	System.out.print("Nombre: ");
        	System.out.println(this.nombre);
        	System.out.print("Apellido: ");
        	System.out.println(this.apellido);
        	System.out.print("Email: ");
        	System.out.println(this.correoElectronico);

        	System.out.println("--------------------------------");
    	} 

    	protected String nombre_completo(){
    		/**
    		 * Funcion que concatena y regresa un string con el nombre 
    		 * completo de la personas.
    		 */
    		return nombre + " " + apellido;
    	}
    }


    //  Clases solicitadas
    
    public static class Profesor extends Persona{
    	/**
    	 * Clase Profesor (porque me rehuso a decirle maestro a alguien
  		 * que no tenga una maestria). 
  		 *
  		 * Extiende de la clase Persona y no soobrescribe metodo alguno.
  		 *
  		 * La funcion poner_calificacion no fue solicitada, pero me parecio
  		 * que respetaba el paradigma orientado a objetos, y que aumentaba
  		 * la legibilidad del codigo; ademas de que representa mejor la
  		 * manera en que estos objetos interaccionan en la vida real. (el 
  		 * alumno no se pone su calificacion, el profesor la da) [Esta 
  		 * funcion, por indicacion del profesor, no se usa; pero funciona]
    	 */

    	public Profesor(int id, String nombre, String apellido, String correoElectronico){
    		/**
    		 * Constructor de profesor. Se usa super para acceder al 
    		 * constructor de Persona.
    		 */
    		super(id, nombre, apellido, correoElectronico);
    	}

    	public void poner_calificacion(Alumno alumno, double calificacion){
    		/**
    		 * Funcion que, dada la instancia de un alumno, le pone la 
    		 * calificacion que es recibida por la funcion.
    		 */
    		alumno.guardar_calificacion(calificacion);
    	}
    }

    public static class Alumno extends Persona{
    	/**
    	 * Clase Alumno
    	 *
    	 * Extiende de la clase Persona. No soobrescribe metodo alguno.
    	 *
    	 * Se agrega el atributo "double calificacion"
    	 */

    	private double calificacion;

    	public Alumno(int id, String nombre, String apellido, String correoElectronico){
    		/**
    		 * Constructor de Alumno. Se usa super para acceder al 
    		 * constructor de Persona.
    		 */
    		super(id, nombre, apellido, correoElectronico);
    	}

    	public void mostrar_calificacion(){
    		/**
    		 * Funcion que imprime en pantalla el nombre de el alumno
    		 * y la calificacion que tenga registrada.
    		 *
    		 * Se deberia de verificar que este asignada alguna calificacion
    		 * antes de llamar a este metodo. Pero me confunde la maenra en 
    		 * que java maneja sus NULLS y espero se explique bien en algun
    		 * futuro curso para poder corregirlo.
    		 */
    		System.out.println("----- Calificacion -----");
    		System.out.println(this.nombre_completo());
        	System.out.println(this.calificacion);
        	System.out.println("------------------------");
    	}

    	public void guardar_calificacion( double calificacion){
    		/**
    		 * Funcion que funciona como setter para el atributo calificacion 
    		 */
    		this.calificacion = calificacion;
    	}
    }

    public static class Tutor extends Persona{
    	/**
    	 * Clase Tutor
    	 *
    	 * Extiende de la clase Persona. Se soobrescribe el constructor.
    	 *
    	 * Se agrega el atributo "Alumno alumno"
    	 */

    	private Alumno alumno;

    	public Tutor(int id, String nombre, String apellido, String correoElectronico, Alumno alumno){
    		/**
    		 * Constructor de Tutor. Se usa super para acceder al 
    		 * constructor de Persona. Ademas asigna una instancia 
    		 * correspondiente a alumno 
    		 */
    		super(id, nombre, apellido, correoElectronico);
    		this.alumno = alumno;
    	}

    	public void mostrar_calificacion(){
    		/**
    		 * Funcion que muestra la calificacion del alumno asignado
    		 * al tutor
    		 */
    		alumno.mostrar_calificacion();
    	}
    }
}
