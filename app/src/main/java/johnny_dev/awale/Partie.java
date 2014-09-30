package johnny_dev.awale;

/**
 * Created by Mr-Auguste on 23/09/2014.
 */
public class Partie {
    //les joueurs + var pour stocker le joueur dont c'est le tour

    public static Joueur joueur1;
    public int graines_joueur_1;

    public static Joueur joueur2;
    public int graines_joueur_2;

    private Joueur joueurActif;

    //un table [2][6] ou [2][7]
    public int[][] plateau;
    private String statusParite;

    public Partie(){
        init();
    }

    public Joueur getJoueur_actif() {
        return joueurActif;
    }

    public int[] getPlateaux() {
        return new int[0];
    }

    public String getStatus_partie() {
        return statusParite;
    }

    public int getGraines_joueur_1() {
        return graines_joueur_1;
    }

    public int getGraines_joueur_2() {
        return graines_joueur_2;
    }

    public void a_joue(int casecliquee) {

    }

    public void init(){

    }
}

