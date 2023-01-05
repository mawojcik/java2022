import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
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
                        System.out.println("\nWpisz po czym wyszukać: isbn, imie, nazwisko, tytul\nAby przestac przeszukiwanie database napisz:\nstop");
                        input = reader.readLine();
                        switch (input) {
                            case "isbn":
                                System.out.println("Podaj isbn do wyszukania");
                                input = reader.readLine();
                                DB.list("select * FROM books where isbn='"+input+"'");
                                break;
                            case "imie":
                                System.out.println("Podaj imie do wyszukania");
                                input = reader.readLine();
                                DB.list("select * FROM books where name='"+input+"'");
                                break;
                            case "nazwisko":
                                System.out.println("Podaj nazwisko do wyszukania");
                                input = reader.readLine();
                                DB.list("select * FROM books where surname='"+input+"'");
                                break;
                            case "tytul":
                                System.out.println("Podaj tytul do wyszukania");
                                input = reader.readLine();
                                DB.list("select * FROM books where title='"+input+"'");
                                break;
                            case "stop":
                                flag = false;
                                break;
                        }
                    }
                    break;
                case 3:
                        System.out.println("Podaj numer isbn (13 cyfr): ");
                        String isbn = reader.readLine();
                        System.out.println("Podaj tytuł: ");
                        String title = reader.readLine();
                        System.out.println("Podaj imie: ");
                        String name = reader.readLine();
                        System.out.println("Podaj nazwisko: ");
                        String surname = reader.readLine();
                        System.out.println("Podaj rok: ");
                        String year = reader.readLine();
                        DB.addEntry(isbn, title, name, surname, year);
                    System.out.println("dodano");
                    break;
                case 4:
                    System.exit(1);
                    break;
            }
        }
    }
}