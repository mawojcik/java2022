public class ROT11 implements Algorithm {

    static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static final int rotation = 11;


    public static String crypt(String inputWord) {
        String encrypted = "";
        for (int i = 0; i < inputWord.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if(inputWord.charAt(i) == alphabet.charAt(j)) {
                    encrypted += alphabet.charAt((j + rotation) % alphabet.length());
                }
            }
        }
        return encrypted;
    }

    public static String decrypt(String inputWord) {
        String decrypted = "";
        for (int i = 0; i < inputWord.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if(inputWord.charAt(i) == alphabet.charAt(j)) {
                    //TODO: make this nicer, like in crypt
                    if ((j - rotation) < 0) {
                        decrypted += alphabet.charAt(alphabet.length() + j - rotation);
                    } else {
                        decrypted += alphabet.charAt((j - rotation) % alphabet.length());
                    }
                }
            }
        }
        return decrypted;
    }
}
