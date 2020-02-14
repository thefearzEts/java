
/**
 * CLASSE A COMPLETER...
 * 
 * Cette classe implemente le TDA Liste avec position courante.
 * 
 * - Les operations se font par rapport a une position courante maintenue par la
 *   liste. Les services offerts permettent de deplacer cette position courante
 *   ou consulter l'element a cette position courante.
 * 
 * - L'insertion et la suppression se font toujours a la position courante.
 * 
 * - ELEMENT COURANT
 *   Lorsque cette liste n'est pas vide, la position courante refere toujours 
 *   a un element dans cette liste nomme element courant.
 *
 * DECISIONS D'IMPLEMENTATION :
 * 
 * - La structure de donnees sous-jacente pour l'implementation de cette liste
 *   est un tableau statique.
 * 
 * - La capacite refere au nombre maximum d'elements que peut contenir cette 
 *   liste
 * 
 * - IMPLEMENTATION STATIQUE : 
 *   Cette liste a une capacite fixe qui une fois atteinte, ne permet plus
 *   l'ajout d'autres elements. 
 * 
 * - Tous les services requerant une liste non vide levent une exception 
 *   explicite ListeVideException lorsqu'on les appelle sur une liste vide.
 * 
 * - Le service d'insertion leve une exception explicite ListePleineException 
 *   lorsque la liste est pleine, et que l'ajout ne peut donc pas etre effectue.
 * 
 * NOTE :
 *   Le choix d'utiliser des exceptions explicites (plutot qu'implicites) est 
 *   simplement pour vous donner la chance de pratiquer la gestion des exceptions
 *   lorsque vous utiliserez des variables de ce type (dans vos tests, par exemple).
 *
 * @author Melanie Lord
 * @version A2018
 */
public class ListePosCouranteTableau {

   //----------------------------------
   // CONSTANTE DE CLASSE
   //----------------------------------
   //capacite par defaut de cette liste
   public static final int CAPACITE_PAR_DEFAUT = 100;

   //----------------------------------
   // ATTRIBUTS D'INSTANCE
   //----------------------------------
   
   /*
      Definissez ici les 3 attributs d'instance suivants :
         - elements : tableau d'Object contenant les elements de la liste
         - posCourante : entier pour retenir la position courante de cette liste
         - nbrElements : entier pour retenir le nombre d'elements dans cette liste
   
      Respectez le principe d'encapsulation !
   */
  private Object elements[];
  private int posCourante;
  private int nbrElements;
   

   //----------------------------------
   // CONSTRUCTEURS
   //----------------------------------
   
   /*
      Completez les 2 constructeurs suivants. Lisez bien la Javadoc
      pour comprendre ce qu'ils doivente faire.
   */
   
   /**
    * Construit une liste vide, de la capacite donnee en parametre.
    *
    * @param capacite le maximum d'elements pouvant etre ajoutes a cette liste
    *        NOTE : on suppose que capacite est >= 0.
    */
   // initialiser les attributs d'instance
   public ListePosCouranteTableau(int capacite) {
      elements = new Object[capacite];
      posCourante = 0;
      nbrElements = 0;
      //A FAIRE
   }

   /**
    * Construit une liste vide, d'une capacite = CAPACITE_PAR_DEFAUT.
    */
   // this pour appeler le constructeur en haut mais on mais la capacite par defaut
   public ListePosCouranteTableau() {
      this(CAPACITE_PAR_DEFAUT);
      //A FAIRE
   }

   //----------------------------------
   // METHODES D'INSTANCE PUBLIQUES
   //----------------------------------
   
   /*
      Completez les methodes d'instance publiques suivantes.
      Lisez bien la Javadoc pour comprendre ce qu'elles doivent faire.
   
      Si vous le jugez pertinent, faites des methodes privees pour bien
      modulariser votre code (bonne separation fonctionnelle). Ajoutez
      cet methodes dans la derniere section reservee a cet effet.
   */
   
   //-- SERVICES DE CONSULTATION --
      
   /**
    * Permet d'obtenir la taille de cette liste (son nombre d'elements).
    *
    * @return la taille de cette liste
    */
   public int taille() {
      
      //A FAIRE
      
      return nbrElements; //pour compilation seulement... à modifier
   }

   /**
    * Teste si cette liste est vide.
    *
    * @return true si cette liste est vide, false sinon.
    */
   public boolean estVide() {
      
      //A FAIRE
      
      return taille()== 0; //pour compilation seulement... à modifier
   }
   
   /**
    * Teste si cette liste est pleine. 
    *
    * @return true si cette liste est pleine, false sinon.
    */
   public boolean estPleine() {
      
      //A FAIRE
      
      return taille() == elements.length;  //pour compilation seulement... à modifier
   }
   
   /**
    * Permet de consulter l'element courant (celui qui est se trouve a la 
    * position courante).
    * 
    * ANTECEDENT : cette liste ne doit pas etre vide
    * CONSEQUENT : cette liste et sa position courante demeurent inchangees.
    * 
    * @return l'element courant
    * @throws ListeVideException si cette liste est vide avant l'appel
    */
   public Object getElement() throws ListeVideException {
      
      //A FAIRE
      if (estVide()){
          throw new ListeVideException();
        }
      
      return elements[posCourante]; //pour compilation seulement... à modifier
   }
   
   //-- FIN SERVICES DE CONSULTATION --
   
   //SERVICES DE DEPLACEMENT DE LA POSITION COURANTE

   /**
    * Met la position courante sur l'element au debut de cette liste.
    *
    * ANTECEDENT : cette liste ne doit pas etre vide
    * 
    * @throws ListeVideException si cette liste est vide avant l'appel
    */
   public void setPosDebut() throws ListeVideException {
      if (estVide()){
          throw new ListeVideException();
        }
        posCourante = 0;
      //A FAIRE
   }
   
   /**
    * Met la position courante sur l'element a la fin de cette liste.
    * 
    * ANTECEDENT : cette liste ne doit pas etre vide
    * 
    * @throws ListeVideException si cette liste est vide avant l'appel
    */
   public void setPosFin() throws ListeVideException {
      if (estVide()){
          throw new ListeVideException();
        }
        posCourante = nbrElements -1;
      //A FAIRE
   }
   
   /**
    * Met la position courante sur l'element qui precede l'element courant.
    * Si la position courante est au debut avant l'appel, elle demeure 
    * inchangee.
    * 
    * ANTECEDENT : cette liste ne doit pas etre vide
    * 
    * @return true si la position courante a ete deplacee sur le precedent, 
    *         false sinon (elle etait deja au debut)
    * @throws ListeVideException si cette liste est vide avant l'appel
    */
   public boolean setPosPrecedent() throws ListeVideException {
       boolean reussi;
      if (estVide()){
          throw new ListeVideException();
        }
        posCourante = posCourante -1;
        if (posCourante < 0){
            posCourante = posCourante + 1;
            reussi = false;
        }else{
            reussi = true;
      //A FAIRE
      
       //pour compilation seulement... à modifier
   }
   return reussi ;
}
   
   /**
    * Met la position courante sur l'element qui suit l'element courant.
    * Si la position courante est a la fin de cette liste avant l'appel, 
    * elle demeure inchangee.
    * 
    * ANTECEDENT : cette liste ne doit pas etre vide
    * 
    * @return true si la position courante a ete deplacee sur le suivant, 
    *         false sinon
    * @throws ListeVideException si cette liste est vide avant l'appel
    */
   public boolean setPosSuivant() throws ListeVideException {
      boolean reussi2;
      if ( estVide()){
          throw new ListeVideException();
          }
          reussi2 = posCourante != nbrElements -1;
          if ( reussi2){
              posCourante++;
            }
            return reussi2;
          
      //A FAIRE
      
       //pour compilation seulement... à modifier
   }
   
   //-- FIN SERVICES DE DEPLACEMENT DE LA POSITION COURANTE --
   
   
   //-- SERVICES D'INSERTION ET DE SUPPRESSION --
   
   /**
    * Insere l'element donne dans cette liste, a la position courante, apres
    * avoir deplace d'une position vers la droite l'element courant et tous 
    * les elements qui le suivent.
    * 
    * ANTECEDENT : cette liste ne doit pas etre pleine.
    * 
    * CONSEQUENTS : 
    *    - La position courante demeure inchangee, et l'element ajoute se 
    *      trouve a la position courante (il devient l'element courant).
    *    - Il y a un element de plus dans cette liste.
    * 
    * @param element l'element a inserer a la position courante
    * @throws ListePleineException si cette liste est pleine avant l'appel
    */
   public void inserer (Object element) throws ListePleineException {
       
      if( estPleine()){
          throw new ListePleineException();
        }
        decalerDroite ( elements, posCourante, nbrElements - 1);
        
        elements[posCourante] = element;
      nbrElements++;
      //À FAIRE... N'oubliez pas d'ajuster le nombre d'elements
   }
   
   /**
    * Ajoute l'element donne a la suite du dernier element (a la fin de cette
    * liste). L'element ajoute devient l'element courant.
    * 
    * ANTECEDENT : cette liste ne doit pas etre pleine.
    * 
    * CONSEQUENTS : 
    *    - La position courante est sur le dernier element de cette liste
    *      (celui qu'on vient d'ajouter)
    *    - Il y a un element de plus dans cette liste.
    * 
    * @param element l'element a inserer a la position courante
    * @throws ListePleineException si cette liste est pleine avant l'appel
    */
   public void ajouterFin (Object element) throws ListePleineException {
      if( estPleine()){
          throw new ListePleineException();
        }
        posCourante = nbrElements;
        
        elements[posCourante] = element;
        
        nbrElements++;
      //À FAIRE... N'oubliez pas d'ajuster le nombre d'elements

   }
   
   /**
    * Supprime de cette liste l'element courant (celui qui se trouve a 
    * la position courante), en decalant d'une position vers la gauche
    * tous les elements qui venaient apres l'element courant.
    * 
    * ANTECEDENT : cette liste ne doit pas etre vide.
    * 
    * CONSEQUENTS : 
    *    - Il y a un element de moins dans cette liste
    *    - La position courante se trouve sur l'element qui venait juste 
    *      apres l'element courant avant l'appel ou se trouve sur le dernier
    *      element si l'element a supprimer etait le dernier.
    * 
    * @return l'element supprime de cette liste.
    * @throws ListeVideException si cette liste est vide avant l'appel
    */
   public Object supprimer () throws ListeVideException {
       Object eltSupprime; // retourner l'element supprimer
       if(estPleine()){
           throw new ListeVideException();
        }
        eltSupprime = getElement(); // afin de pouvoir retourner lelement supprimer
        
        decalerGauche(elements, posCourante + 1 , nbrElements -1); //poscourante+1 cuz la posCourante cest lelement a enlever
        
      //À FAIRE... N'oubliez pas d'ajuster le nombre d'elements
      nbrElements--;
      
      if (estVide()){
          posCourante = -1;
        }
      return eltSupprime; //pour compilation seulement... à modifier
   }
   
   /**
    * Retire tous les elements de cette liste.
    * 
    * CONSEQUENT : la liste ne contient aucun element, estVide() retourne true.
    */
   public void vider() {
      nbrElements = 0;
      posCourante = 0;
      //A FAIRE
   }
   
   //-- FIN SERVICES D'INSERTION ET DE SUPPRESSION --
   
   
   //----------------------------------
   // METHODES D'INSTANCE PRIVEES
   //----------------------------------
   
   //A COMPLETER...
   private void decalerGauche(Object[] tab, int debut, int fin){
       for( int i = debut ; i <= fin; i++){
           tab[i-1] = tab[i];
        }
    }
   private void decalerDroite (Object[] tab, int debut, int fin){
       for ( int i = fin; i>= debut; i--){
           tab[i+1] = tab[i];
        }
}
}
