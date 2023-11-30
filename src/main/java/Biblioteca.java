import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (!libroExiste(libro)) {
            libros.add(libro);
        }
    }

    public Libro buscarLibro(String nombre) {
        for (Libro libro : libros) {
            if (libro.getNombre().equals(nombre)) {
                return libro;
            }
        }
        return null;
    }

    public List<Libro> obtenerLibroPorAutor(String autor) {
        List<Libro> librosPorAutor = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                librosPorAutor.add(libro);
            }
        }
        return librosPorAutor;
    }

    private boolean libroExiste(Libro libro) {
        return libros.contains(libro);
    }
}
