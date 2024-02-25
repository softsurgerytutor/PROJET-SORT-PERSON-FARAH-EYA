import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Nombre de Personne?");
        n = scanner.nextInt();

        Personne T[] = new Personne[n];

        for(int i=0 ; i<n ; i++) {
            T[i] = new Personne();

            System.out.println("Peronne Numero " + (i+1));

            System.out.println("ID ?");
            T[i].id = scanner.nextInt();
    
            System.out.println("NOM ?");
            T[i].nom = scanner.next();
    
            System.out.println("PRENOM ?");
            T[i].prenom = scanner.next();
    
            System.out.println("Email ?");
            T[i].email = scanner.next();
    
            System.out.println("Date ?");
            T[i].date = scanner.next();
        }      

        for(int i=0; i<n ; i++){
            System.out.println("Peronne Numero " + (i+1));
            System.out.println(T[i]);
        }

        scanner.close();
    }
}
