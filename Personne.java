public class Personne {
    //attribut - champs
    int id = -1;
    String nom = "";
    String prenom = "";
    String email = "@";
    String date = "jj/mm/aaaa"; //jj-mm-aaaa

    //méthodes
    public Personne(int id, String nom, String prenom, String email, String date) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date = date;
    }
    
    @Override
    public String toString() {
        return "Nom = " + nom + " Prenom = " + prenom + " Email = " + email + " Date = " + date;
    }

  


}
