public class Polibiusz implements Algorithm {
    static final String[][] board = {{"a", "b", "c", "d", "e", "j"},
                                     {"f", "g", "h", "i", "k"},
                                     {"l", "m", "n", "o", "p"},
                                     {"q", "r", "s", "t", "u"},
                                     {"v", "w", "x", "y", "z"}
    };

    public static String crypt(String inputWord) {
        inputWord = inputWord.toLowerCase();
        int row, col;
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
            if (inputWord.charAt(i) == 'j') {
                row = 1;
                col = 6;
            }
            if (inputWord.charAt(i) >= 'k') {
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
        String decrypted = "";
        for(int i = 0; i < inputWord.length(); i++) {
//            Character.getNumericValue(inputWord.charAt(i))
            if (inputWord.charAt(i) == ' ') {
                decrypted += " ";
                continue;
            }
            if (inputWord.charAt(i) == '\n') {
                decrypted += '\n';
                continue;
            }

            int x = Character.getNumericValue(inputWord.charAt(i));
            if (x >= 0 && x <= 9) {
                decrypted += board[Character.getNumericValue(inputWord.charAt(i)) - 1][Character.getNumericValue(inputWord.charAt(i + 1)) - 1];
                i++;
            }
        }
        return decrypted;
    }
}
