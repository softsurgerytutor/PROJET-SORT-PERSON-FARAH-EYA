public class Personne {
    //attribut - champs
    int id;
    String nom;
    String prenom;
    String email;
    String date; //jj-mm-aaaa

    //méthodes
    
    @Override
    public String toString() {
        return "Nom = " + nom + " Prenom = " + prenom + " Email = " + email + " Date = " + date;
    }


}
