public class Personne {
    //attribut - champs
    int id;
    String nom;
    String prenom;
    String email;
    String date; //jj-mm-aaaa

    //méthodes
    public void afficher() {
        System.out.println("Nom = " + nom + " Prenom = " + prenom + " Email = " + email + " Date = " + date );
    }
}
