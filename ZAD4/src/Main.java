import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Run with correct arguments!");
            System.exit(0);
        }
        ROT11 x = new ROT11();
        Polibiusz y = new Polibiusz();

        if(Objects.equals(args[2], "crypt")) {
            if (Objects.equals(args[3], "rot")) {
                Cryptographer.cryptFile("a", "aa", x);
            } else if (Objects.equals(args[3], "polibiusz")) {
                Cryptographer.cryptFile("a", "aa", y);
            }
        } else if (Objects.equals(args[2], "decrypt")) {
            if (Objects.equals(args[3], "rot")) {
                Cryptographer.decryptFile("a", "aa", x);
            } else if (Objects.equals(args[3], "polibiusz")) {
                Cryptographer.decryptFile("a", "aa", y);
            }
        }

    }
}