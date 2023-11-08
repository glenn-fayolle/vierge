package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexteDocument() {
        return texteDocument;
    }

    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String midPart = texteDocument.substring(start, end).toUpperCase();
        this.remplacer(start, end, midPart);
    }

    public void minuscules(int start, int end) {
        String midPart = texteDocument.substring(start, end).toLowerCase();
        this.remplacer(start, end, midPart);
    }


    public void effacer(int start, int end){
        this.remplacer(start, end, "");
    }

    public void clear(){
        setTexteDocument(" ");
    }

    public void inserer(int start, String texte){
        remplacer(start,start, texte);
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }
}
