package Parameteruebergabe;

public class Parameter {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Eingabe [" + i + "] >" + args[i] + "<");
        }

        try {
            int b = 5;
            int a = b / 0;

            System.out.println("Resultat: " + a);
        } catch (ArithmeticException ex) {
            System.out.println("Reihenfolge der Exceptions beachten");
        } catch (Exception ex) {
            System.out.println("Division durch null");
        } finally {
            int b = 5;
            double a = b / 2;

            System.out.println("Resultat: " + a);
            System.out.println("Done");
        }
    }

}
