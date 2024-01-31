import org.junit.Assert;
import org.junit.Test;

import fr.diginamic.enumerations.Saison;

public class SaisonUT {

    @Test
    public void testSaisonNominal() {
        // Teste les cas nominaux
        Assert.assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        Assert.assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
        Assert.assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
        Assert.assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
    }

    @Test
    public void testSaisonInexistant() {
        // Teste le cas où la saison n'existe pas
        Assert.assertNull(Saison.valueOfLibelle("SaisonInexistante"));
    }

    @Test
    public void testSaisonNull() {
        // Teste le cas où la saison est null
        Assert.assertNull(Saison.valueOfLibelle(null));
    }
}