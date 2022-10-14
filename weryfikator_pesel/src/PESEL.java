public class PESEL {
    String pesel = "";
    PESEL(String pesel) {
        this.pesel = pesel;
    }
    public static boolean check (String pesel) {
        if (pesel.length() != 11) {
            System.out.println("Pesel jest nie poprawny!");
            return false;
        }

        int sum = 0;
        int[] weight = {1, 3, 7, 9};

        for (int i = 0; i < 10; i++) {
            sum += (Character.getNumericValue(pesel.charAt(i)) * weight[i % 4]);
        }

        if ((10 - (sum % 10)) == Character.getNumericValue(pesel.charAt(10))) {
            System.out.println("Pesel jest poprawny!");
            return true;
        }

        System.out.println("Pesel jest nie poprawny!");
        return false;
    }

    static boolean compare(PESEL pesel_to_compare, PESEL pesel_input) {


        if (pesel_input.pesel.equals(pesel_to_compare.pesel)) {
            System.out.println("Pesele sa takie same");
            return true;
        }
        System.out.println("Pesele sa inne!");
        return false;
    }

}
