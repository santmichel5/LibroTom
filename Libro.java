package VentaDeLibros;

public class Libro {
    String encabezado;
    String escritor ;
    double precio; // Changed to double for better precision

    public Libro(String encabezado, String escritor, double precio){
        this.encabezado = encabezado;
        this.escritor= escritor ;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("El titulo del libro es " + encabezado+ " y el autor del libro es " + escritor+ " con un precio de " + precio);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}