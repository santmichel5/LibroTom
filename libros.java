package VentaDeLibros;

public class libros{
    public static void main(String[] args) {
        Libro libro1 = new Libro("La cabaña del tio tom", "Harriet Beecher Stowe.", 59.99);
        libro1.mostrarDetalles();
    
        libro1.actualizarPrecio(60.00);
        libro1.mostrarDetalles();
    }
}