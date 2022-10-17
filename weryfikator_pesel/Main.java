public class Main {
    public static void main(String[] args) {
        if (args[0].length() != 11) {
            System.out.println("Run with correct pesel number!");
            System.exit(0);
        }
        PESEL pesel_input = new PESEL(args[0]);
        PESEL pesel_to_compare = new PESEL("78040241369");

        PESEL.check();
        PESEL.compare(pesel_to_compare, pesel_input);

        System.out.println("\nPesel input:      " + pesel_input.pesel);
        System.out.println("Pesel to compare: " + pesel_to_compare.pesel);
    }
}


