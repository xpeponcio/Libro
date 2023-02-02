package biblioteca;

public class Libro {
    
    String titulo;
    String autor;
    private int ejemplaresLibro;
    private int ejemplaresPrestados;
    
    Libro(){
        this.titulo = "Prueba";
        this.autor = "Pepe";
        this.ejemplaresLibro = 3;
        this.ejemplaresPrestados = 6;
    }
    
    Libro(String titulo, String autor, int ejemplaresLibro, int ejemplaresPrestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresLibro = ejemplaresLibro;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
    
    public void setPrestamo(int prestamo){
        if(ejemplaresLibro>=prestamo){
            this.ejemplaresPrestados+=prestamo;
            this.ejemplaresLibro-=prestamo;
            System.out.println(true);
        }else{
            System.out.println("No hay libros suficientes a prestar.");
            System.out.println(false);
        }
    }
    
    public void setDevolucion(int devolucion){
        if(ejemplaresPrestados>=devolucion){
            this.ejemplaresLibro+=devolucion;
            this.ejemplaresPrestados-=devolucion;
            System.out.println(true);
        }else{
            System.out.println("Has indicado mas libro del que se ha prestado.");
            System.out.println(false);
        }
    }
    
    public String toString(){
        return "El titulo es: " + this.titulo + " y el autor es: " + this.autor + " en la biblioteca hay " + this.ejemplaresLibro + " libros y libros prestados hay: " + this.ejemplaresPrestados;
    }
            
}
