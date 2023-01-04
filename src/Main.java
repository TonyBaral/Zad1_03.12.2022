import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj!");
        List<String> listaMiast = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String miasto;
        boolean czyPrawda = true;

        while (czyPrawda) {
            System.out.println("Podaj nazwe miasta ");
            miasto = scanner.nextLine();
            listaMiast.add(miasto);
            if (miasto.equals("/")) {
                czyPrawda = false;
                System.out.println("Blędny znak\n");
                listaMiast.remove("/");
                System.out.println(listaMiast);
                }
            }
        }
    }


