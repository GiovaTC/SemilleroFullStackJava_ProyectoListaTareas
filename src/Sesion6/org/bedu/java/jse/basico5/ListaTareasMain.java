package org.bedu.java.jse.basico5;

import org.bedu.java.jse.basico5.Lector;
import org.bedu.java.jse.basico5.ListasTareas;
import org.bedu.java.jse.basico5.Menu;

public class ListaTareasMain {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lista = new ListasTareas();
        byte opcionSeleccionada = 0;
        String mensaje = null;
        
        
 /*     System.out.println("\nMenú:");
        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas");
        System.out.println("5. Eliminar lista de tareas");*/
        
        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leeOpcion();
            System.out.println("\n\nLa opción seleccionada es: " + opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaLista();
                    break;
                case 2:
                    lista.verListaTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaDeTareas();
                    break;
                case 5:
                    lista.eliminarListaDeTareas();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción desconocida.");
            }

        }while(opcionSeleccionada != 6);

        System.out.println("\n\nLa opción seleccionada es: " + opcionSeleccionada + " " + mensaje);
        System.out.println("En construcción.");
    }
}