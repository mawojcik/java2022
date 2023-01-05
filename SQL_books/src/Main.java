import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        DB.connect();

        while(true) {
            System.out.println("""
                    
                    Wybierz odpowiedni numer:
                    1. Wyswietl wszystkie dane z tabeli
                    2. Wyszukaj dane (numer ISBN, imie, nazwisko, tytul)
                    3. Dodawanie do bazy
                    4. Zakończ""");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            switch (Integer.parseInt(input)) {
                case 1:
                    DB.list("SELECT * FROM books");
                    break;
                case 2:
                    boolean flag = true;
                    while(flag) {
                        input = reader.readLine();
                        switch (input) {
                            case "isbn":
                                DB.list("SELECT isbn FROM books");
                                break;
                            case "imie":
                                DB.list("SELECT name FROM books");
                                break;
                            case "nazwisko":
                                DB.list("SELECT surname FROM books");
                                break;
                            case "tytul":
                                DB.list("SELECT title FROM books");
                                break;
                            case "stop":
                                flag = false;
                                break;
                        }
                    }
                    break;
                case 3:
                    flag = true;
                    while(flag) {
                        System.out.println("Podaj numer isbn (13 cyfr): ");
                        int isbn = Integer.parseInt(reader.readLine());
                        System.out.println("Podaj tytuł: ");
                        String tytul = reader.readLine();
                        System.out.println("Podaj imie: ");
                        String imie = reader.readLine();
                        System.out.println("Podaj nazwisko: ");
                        String nazwisko = reader.readLine();
                        System.out.println("Podaj rok: ");
                        int rok = Integer.parseInt(reader.readLine());
//                        book_entry =
                    }
                    break;
                case 4:
                    System.exit(1);
                    break;
            }


        }



    }
}