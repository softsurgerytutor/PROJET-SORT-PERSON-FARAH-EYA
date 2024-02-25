import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personne p = new Personne();

        System.out.println("ID ?");
        p.id = scanner.nextInt();

        System.out.println("NOM ?");
        p.nom = scanner.next();

        System.out.println("PRENOM ?");
        p.prenom = scanner.next();

        System.out.println("Email ?");
        p.email = scanner.next();

        System.out.println("Date ?");
        p.date = scanner.next();

        System.out.println(p);
        
        scanner.close();
    }
}
