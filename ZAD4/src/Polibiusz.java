public class Polibiusz implements Algorithm {

    static final String[][] szachownica = {{"A", "B", "C", "D", "E"},
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
//            encrypted += Integer.toString(col);
        }
//        System.out.println(row + "" + col);
//        encrypted = szachownica[4][3];


        return encrypted;
    }

    public String decrypt(String inputWord) {
        String decrypted = "";
        return decrypted;
    }
}







/*

// Java Program to implement polybius cipher

class GFG
{
    // Function to display polybius
    // cipher text
    static void polybiusCipher(String s)
    {
        int row, col;

        // convert each character
        // to its encrypted code
        for (int i = 0;i < s.length(); i++)
        {

            // finding row of the table
            row = (int)Math.ceil((s.charAt(i) - 'a') / 5) + 1;

            // finding column of the table
            col = ((s.charAt(i) - 'a') % 5) + 1;

            // if character is 'k'
            if (s.charAt(i) == 'k')
            {
                row = row - 1;
                col = 5 - col + 1;
            }

            // if character is greater than 'j'
            else if (s.charAt(i) >= 'j')
            {
                if (col == 1)
                {
                    col = 6;
                    row = row - 1;
                }
                col = col - 1;
            }
            System.out.print(row +""+ col);
        }

        System.out.println();
    }

    // Driver code
    public static void main (String[] args)
    {
        String s = "geeksforgeeks";
        polybiusCipher(s);
    }
}

// This code is contributed by Anant Agarwal.

*/