import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Run with correct arguments!");
            System.exit(0);
        }

        if(Objects.equals(args[2], "crypt")) {
                Cryptographer.cryptFile(args[0], args[1], args[3]);
        } else if (Objects.equals(args[2], "decrypt")) {
                Cryptographer.decryptFile(args[0], args[1], args[3]);
        }

    }
}