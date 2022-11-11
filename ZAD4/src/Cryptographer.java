public class Cryptographer {

    public static void cryptFile(String pathToFileIn, String pathToFileOut, Algorithm algorithm) {
        String decrypted = ROT11.crypt("a");
        System.out.println(decrypted);
    }

    public static void decryptFile(String pathToFileIn, String pathToFileOut, Algorithm algorithm) {
    }
}
