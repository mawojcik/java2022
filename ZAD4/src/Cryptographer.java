import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
public class Cryptographer {
    public static void writeToFile(String pathToFileOut, String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFileOut));
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFromFile(String pathToFileIn) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(pathToFileIn)));
        }  catch (IOException e) {
            System.out.println("Error with reading from file");
            throw new RuntimeException(e);
        }
        return data;
    }

    public static void cryptFile(String pathToFileIn, String pathToFileOut, String algorithm) {
        if (Objects.equals(algorithm, "rot")) {
//            System.out.println(ROT11.crypt(readFromFile(pathToFileIn)));
            writeToFile(pathToFileOut, ROT11.crypt(readFromFile(pathToFileIn)));
        } else if (Objects.equals(algorithm, "polibiusz")) {
//            System.out.println(Polibiusz.crypt(readFromFile(pathToFileIn)));
            writeToFile(pathToFileOut, Polibiusz.crypt(readFromFile(pathToFileIn)));
        }
    }

    public static void decryptFile(String pathToFileIn, String pathToFileOut, String algorithm) {
        if (Objects.equals(algorithm, "rot")) {
//            System.out.println(ROT11.decrypt(readFromFile(pathToFileIn)));
            writeToFile(pathToFileOut, ROT11.decrypt(readFromFile(pathToFileIn)));
        } else if (Objects.equals(algorithm, "polibiusz")) {
//            System.out.println(Polibiusz.decrypt(readFromFile(pathToFileIn)));
            writeToFile(pathToFileOut, Polibiusz.decrypt(readFromFile(pathToFileIn)));
        }
    }
}