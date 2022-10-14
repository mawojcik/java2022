public class Main {
    public static void main(String[] args) {

        PESEL pesel_input = new PESEL(args[0]);
        PESEL pesel_to_compare = new PESEL("02211307879");

        PESEL.check(args[0]);
        PESEL.compare(pesel_to_compare, pesel_input);

        System.out.println("Pesel input:      " + pesel_input.pesel);
        System.out.println("Pesel to compare: " + pesel_to_compare.pesel);

    }
}