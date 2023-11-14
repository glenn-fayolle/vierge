package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Description de la méthode
     * @param start debut ou rermplacer
     * @param end fin a remplcaer
     * @param remplacement par quoi remlplacer
     * @return rien
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String midPart = texte.substring(start, end).toUpperCase();
        this.remplacer(start, end, midPart);
    }

    public void effacer(int start, int end){
        this.remplacer(start, end, "");
    }

    public void clear(){
        setTexte(" ");
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
