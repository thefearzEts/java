
/**
 * Write a description of class UtilisationListePosCourante here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UtilisationListePosCourante
{
    public static boolean contientElement( ListePosCouranteTableau liste, Object o){
    boolean contient = false;
    Object element;
    return contient;
    }
    public static void main (String arg[]){
    ListePosCouranteTableau liste = new ListePosCouranteTableau();
    try{
        liste.ajouterFin(5);
        liste.ajouterFin(3);
        liste.ajouterFin(10);
        liste.ajouterFin(7);
        liste.ajouterFin(null);
        liste.ajouterFin(23);
        liste.ajouterFin(9);
        liste.ajouterFin(4);
        liste.ajouterFin(12);
    }
    catch (ListePleineException e){
        e.printStackTrace();
    }
    }
}
