package org.bedu.java.jse.basico5;
import org.bedu.java.jse.basico5.Modelo.ListaTareas;
import org.bedu.java.jse.basico5.Lector;
import org.bedu.java.jse.basico5.Modelo.Tarea;

import java.util.ArrayList;
import java.util.List;


public class ListasTareas {
    private Lector lector = new Lector();
    private List<ListaTareas> listasTareas = new ArrayList<>();
    public void crearNuevaLista() {
        System.out.println("Crear nueva lista de tareas.");

        String nombre = lector.leeCadena();

        ListaTareas lista = new ListaTareas(nombre);
        listasTareas.add(lista);
    }

    public void verListaTareas() {
        System.out.println("Ver listas de tareas.");
        if (!validaExistenciaLista()) {
            return;
        }
        for (int i = 0; i < listasTareas.size(); i++) {
            System.out.println((i + 1) + " - " + listasTareas.get(i).getNombre());
        }
    }

    private boolean validaExistenciaLista() {
        if (listasTareas == null || listasTareas.isEmpty()) {
            System.out.println("Aún no se ha creado ninguna lista de tareas.");
            return false;
        }
        return true;
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");
        byte lista = lector.leeOpcion();
        byte indice = validaIndice();

        if(indice == 0){
            return;
        }
        ListaTareas lista1 = listasTareas.get(indice - 1);
        if (lista1.numeroTareas() == 0) {
            System.out.println("Aún no hay tareas en la lista.");
        }

        lista1.muestraTareas();
    }

    private byte validaIndice() {
        byte indice = 0;

        if (!validaExistenciaLista()) {
            return indice;
        }

        System.out.println("Indique el índice de la lista de tareas.");
        indice = lector.leeOpcion();

        if (indice > listasTareas.size() || indice < 0) {
            System.out.println("No existen listas de tareas en el índice seleccionado.");
            indice = 0;
        }

        return indice;
    }

    public void actualizarListaDeTareas() {
        System.out.println("Actualizar lista de tareas.");

        byte indice = validaIndice();

        if (indice == 0) {
            return;
        }
    }
    public void eliminarListaDeTareas() {
        System.out.println("Eliminar lista de tareas.");
        byte lista = lector.leeOpcion();
        byte indice = validaIndice();
        ListaTareas listaEliminada = listasTareas.remove((indice - 1));

        System.out.println("Se eliminó la lista de tareas: " + listaEliminada.getNombre());
    }

}