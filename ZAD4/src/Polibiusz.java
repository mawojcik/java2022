public class Polibiusz implements Algorithm {

    static final String[][] szachownica = {{"A", "B", "C", "D", "E", "J"},
                                           {"F", "G", "H", "I", "K"},
                                           {"L", "M", "N", "O", "P"},
                                           {"Q", "R", "S", "T", "U"},
                                           {"V", "W", "X", "Y", "Z"}
    };
    public static String crypt(String inputWord) {
        inputWord = inputWord.toLowerCase();
        int row = 0;
        int col = 0;
        String encrypted = "";
        for(int i = 0; i < inputWord.length(); i++) {
            if (inputWord.charAt(i) == ' ') {
                encrypted += " ";
                continue;
            }
            if (inputWord.charAt(i) == '\n') {
                encrypted += '\n';
                continue;
            }
            row = (int)Math.ceil((inputWord.charAt(i) - 'a') / 5) + 1;
            col = ((inputWord.charAt(i) - 'a') % 5) + 1;
            if (inputWord.charAt(i) == 'k') {
                row = 2;
                col = 5;
            }
            if (inputWord.charAt(i) > 'k') {
                if (col == 1) {
                    col = 5;
                    row = row - 1;
                } else {
                    col = col - 1;
                }
            }
            encrypted += "" + row + col;
        }
        return encrypted;
    }

    public static String decrypt(String inputWord) {
        String decrypted = inputWord;

//        for(int i = 0; i < inputWord.length(); i+=2) {
//
//
//
//
//
//        }



        return decrypted;
    }
}

// read from file
