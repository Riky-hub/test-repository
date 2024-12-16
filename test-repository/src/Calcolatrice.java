
public class Calcolatrice {

    // Metodo per sommare due numeri
    public double somma(double a, double b) {
        return a + b;
    }

    // Metodo per sottrarre due numeri
    public double sottrai(double a, double b) {
        return a - b;
    }

    // Metodo per moltiplicare due numeri
    public double moltiplica(double a, double b) {
        return a * b;
    }

    // Metodo per dividere due numeri
    public double dividi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisione per zero non consentita.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice();

        System.out.println("Somma: " + calcolatrice.somma(5, 3));
        System.out.println("Sottrazione: " + calcolatrice.sottrai(5, 3));
        System.out.println("Moltiplicazione: " + calcolatrice.moltiplica(5, 3));
        System.out.println("Divisione: " + calcolatrice.dividi(5, 3));
    }
}