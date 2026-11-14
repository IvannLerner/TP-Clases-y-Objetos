
public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Harry Potter", "J.K. Rowling", 1997);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        System.out.println("Título: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("Año: " + libro1.año);

        System.out.println("Título: " + libro2.titulo);
        System.out.println("Autor: " + libro2.autor);
        System.out.println("Año: " + libro2.año);
    }
}