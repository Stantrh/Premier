public class Stan{

    private String nomTrain;
    private final String BUS = "Stan est nul à minecraft";

    public Stan(String nom){
        this.nomTrain = nom;
    }

    public void changerNom(String nouveauNom){
        this.nomTrain = nouveauNom;
    }

    public String getNom(){
        return this.nomTrain;
    }

}