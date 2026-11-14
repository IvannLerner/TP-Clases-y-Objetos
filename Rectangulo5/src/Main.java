public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();

        rectangulo1.setBase(5);
        rectangulo1.setAltura(10);

        System.out.println("Area: " + rectangulo1.calcularArea());
    }
}