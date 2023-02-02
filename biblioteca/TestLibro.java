package biblioteca;

public class TestLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        
        Libro l2 = new Libro("El mago de OZ", "L. Frank Baum", 8, 2);
        
        l1.setPrestamo(2);
        
        l2.setDevolucion(2);
        
        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }
}
