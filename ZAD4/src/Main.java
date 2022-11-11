import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Run with correct arguments!");
            System.exit(0);
        }
//        ROT11 rot = new ROT11();
//        Polibiusz pol = new Polibiusz();

        if(Objects.equals(args[2], "crypt")) {
                Cryptographer.cryptFile("a", "aa", args[3]);
        } else if (Objects.equals(args[2], "decrypt")) {
                Cryptographer.decryptFile("a", "aa", args[3]);
        }

    }
}