package guia7ej4extra.entidad;

import java.util.Set;

public class Receta {

    private final String nombre;
    private final Set<String> ingredientes;

    public Receta(String nombre, Set<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getIngredientes() {
        return ingredientes;
    }
}
