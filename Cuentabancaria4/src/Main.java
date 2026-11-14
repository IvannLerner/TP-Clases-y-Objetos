
public class Main {
    public static void main(String[] args) {

        Cuentabancaria cuenta1 = new Cuentabancaria();

        cuenta1.setSaldo(1500);

        System.out.println("Saldo actual: " + cuenta1.getSaldo());
    }
}