public class ROT11 implements Algorithm {

    static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static final int rotation = 11;


    public static String crypt(String inputWord) {
        String crypted = "";
        for (int i = 0; i < inputWord.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if(inputWord.charAt(i) == alphabet.charAt(j)) {
//                    crypted += alphabet.charAt(j+rotation);
                    crypted += alphabet.charAt(j + rotation);
                }
            }
        }
        System.out.println("Crypting");
        return crypted;
    }

    public static String decrypt(String inputWord) {
        String encrypted = "";
//        for (int i = 0; i < inputWord.length(); i++) {
//            for (int j = 0; j < alphabet.length(); j++) {
//                if(inputWord.charAt(i) == alphabet.charAt(j)) {
//                    encrypted.append = alphabet.charAt(j+rotation);
//                }
//            }
//        }
        return encrypted;
    }
}
