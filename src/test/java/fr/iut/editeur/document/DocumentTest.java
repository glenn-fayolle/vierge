package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;

public class DocumentTest extends TestCase {


    @Test
    public void test_remplacer(){
        Document d = new Document();
        d.setTexteDocument("coucou");
        d.remplacer(2, 3, "a");
        assertEquals("coacou", d.getTexteDocument());
    }

    @Test
    public void test_majuscules(){
        Document d = new Document();
        d.setTexteDocument("coucou");
        d.majuscules(2, 4);
        assertEquals("coUCou", d.getTexteDocument());
    }
}
