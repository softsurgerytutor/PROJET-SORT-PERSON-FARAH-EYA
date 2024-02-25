public class Application {
    public static void main(String[] args) {
        Personne p = new Personne();
        p.id = 12345678;
        p.nom = "John";
        p.prenom = "Doe";
        p.email = "john@example.com";
        p.date = "01-01-2000";
        System.out.println(p);
        p.afficher();
    }
}
