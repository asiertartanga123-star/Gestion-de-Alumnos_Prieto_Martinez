package clases;

public class OpcionMostrar {
	public class OpcionMostrarAlumnos implements IOpcionMenu {
	    @Override
	    public void ejecutar(GestorAlumnos gestorAlumnos) {
	        // Mostrar la lista de alumnos utilizando GestorAlumnos
	        gestorAlumnos.listarAlumnos();
	    }
	}

}
