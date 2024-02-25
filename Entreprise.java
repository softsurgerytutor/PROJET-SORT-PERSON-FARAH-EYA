import java.util.Scanner;

public class Entreprise {
    String nom = "";
    Personne T[];

    public Entreprise(String nom,int n) {
        this.nom = nom;
        T = new Personne[n];
    }

    public void populate() {
        Scanner scanner = new Scanner(System.in);
        int id;
        String nom, prenom, email, date;
        for (int i = 0; i < T.length; i++) {

            System.out.println("Peronne Numero " + (i + 1));

            System.out.println("ID ?");
            id = scanner.nextInt();

            System.out.println("NOM ?");
            nom = scanner.next();

            System.out.println("PRENOM ?");
            prenom = scanner.next();

            System.out.println("Email ?");
            email = scanner.next();

            System.out.println("Date ?");
            date = scanner.next();

            T[i] = new Personne(id, nom, prenom, email, date);
        }
        scanner.close();
    }

    @Override
    public String toString() {
        String all = "";
        for (int i = 0; i < T.length; i++) {
            all = all + "Peronne Numero " + (i + 1) + " : ";
            all = all + T[i] + "\n";
        }
        return "Entreprise [nom=" + nom + ", T=\n" + all +"]";
    }

}
