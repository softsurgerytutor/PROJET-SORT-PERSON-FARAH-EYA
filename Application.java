import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Nombre de Personne?");
        n = scanner.nextInt();

        String nom;
        System.out.println("Quelle est le nom de l'entreprise ?");
        nom = scanner.next();

        Entreprise e = new Entreprise(nom,n);
        e.populate();
        System.out.println(e);

        scanner.close();
    }
}
