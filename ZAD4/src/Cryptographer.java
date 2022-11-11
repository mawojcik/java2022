import java.util.Objects;

public class Cryptographer {

    public static void cryptFile(String pathToFileIn, String pathToFileOut, String algorithm) {
        if (Objects.equals(algorithm, "rot")) {
            System.out.println(ROT11.crypt("9a"));
        }
    }

    public static void decryptFile(String pathToFileIn, String pathToFileOut, String algorithm) {
    }
}
