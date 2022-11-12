import java.sql.SQLOutput;
import java.util.Objects;

public class Cryptographer {

    public static void cryptFile(String pathToFileIn, String pathToFileOut, String algorithm) {
        if (Objects.equals(algorithm, "rot")) {
            System.out.println(ROT11.crypt(pathToFileIn));
        } else if (Objects.equals(algorithm, "polibiusz")) {
            System.out.println(Polibiusz.crypt(pathToFileIn));
        }
    }

    public static void decryptFile(String pathToFileIn, String pathToFileOut, String algorithm) {
        if (Objects.equals(algorithm, "rot")) {
            System.out.println(ROT11.decrypt(pathToFileIn));
        }
    }
}
