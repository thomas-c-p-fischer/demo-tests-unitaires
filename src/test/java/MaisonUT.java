/**
 * 
 */
import fr.diginamic.immobilier.entites.Chambre;
import fr.diginamic.immobilier.entites.Maison;
import fr.diginamic.immobilier.entites.Salon;

import org.junit.Assert;
import org.junit.Test;

public class MaisonUT {

    @Test
    public void testAjouterPiece() {
        Maison maison = new Maison();

        // Création de pièces pour le test
        Chambre chambre = new Chambre(1, 15.0);
        Salon salon = new Salon(1, 20.0);

        maison.ajouterPiece(chambre);
        maison.ajouterPiece(salon);

        // Vérification du nombre de pièces après l'ajout
        Assert.assertEquals(2, maison.nbPieces());

        // Vérification de la superficie totale
        Assert.assertEquals(35.0, maison.calculerSurface(), 0.001);
    }

    @Test
    public void testSuperficieEtage() {
        Maison maison = new Maison();

        // Création de pièces pour le test
        Chambre chambre1 = new Chambre(1, 15.0);
        Chambre chambre2 = new Chambre(2, 20.0);

        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(chambre2);

        // Vérification de la superficie de l'étage 1
        Assert.assertEquals(15.0, maison.superficieEtage(1), 0.001);
        
        // Vérification de la superficie de l'étage 2
        Assert.assertEquals(20.0, maison.superficieEtage(2), 0.001);
        
        // Vérification de la superficie d'un étage inexistant
        Assert.assertEquals(0.0, maison.superficieEtage(3), 0.001);
    }

    @Test
    public void testSuperficieTypePiece() {
        Maison maison = new Maison();

        // Création de pièces pour le test
        Chambre chambre1 = new Chambre(1, 15.0);
        Salon salon = new Salon(1, 20.0);

        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(salon);

        // Vérification de la superficie totale des chambres
        Assert.assertEquals(15.0, maison.superficieTypePiece("Chambre"), 0.001);
        
        // Vérification de la superficie totale des salons
        Assert.assertEquals(20.0, maison.superficieTypePiece("Salon"), 0.001);
        
        // Vérification de la superficie d'un type de pièce inexistant
        Assert.assertEquals(0.0, maison.superficieTypePiece("Cuisine"), 0.001);
    }

    @Test
    public void testCalculerSurface() {
        Maison maison = new Maison();

        // Création de pièces pour le test
        Chambre chambre1 = new Chambre(1, 15.0);
        Salon salon = new Salon(1, 20.0);

        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(salon);

        // Vérification de la superficie totale
        Assert.assertEquals(35.0, maison.calculerSurface(), 0.001);
    }

    @Test
    public void testRobustesseAvecNull() {
        Maison maison = new Maison();

        Chambre chambreNull = new Chambre(1, 10.0);
        maison.ajouterPiece(chambreNull);

        // Vérification que la superficie du type null est correcte
        Assert.assertEquals(10.0, maison.superficieTypePiece(null), 0.001);
    }
}