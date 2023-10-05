package org.bedu.java.jse.basico7;
import org.bedu.java.jse.basico7.ListasTareas;

public class ListaTareasMain {

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lista = new ListasTareas();
        byte opcionSeleccionada = 0;
        String mensaje = null;
        
        
        System.out.println("\nMenú:");
        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas");
        System.out.println("5. Eliminar lista de tareas");
        System.out.println("6. Guardar y Salir");
        
        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leeOpcion();
            System.out.printf("%n%nLa opción seleccionada es: %d%n", opcionSeleccionada);

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
                    lista.guardarTareas();
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción desconocida.");
            }

        }while(opcionSeleccionada != 6);

     //   System.out.println("\n\nLa opción seleccionada es: " + opcionSeleccionada + " " + mensaje);
     //   System.out.println("En construcción.");
    }
}