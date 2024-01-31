/**
 * 
 */
import org.junit.Assert;
import org.junit.Test;

import fr.diginamic.utils.StringUtils;

public class StringUtilsUT {

    @Test
    public void testLevenshteinDistanceCasNominaux() {
        // Teste les cas nominaux
        Assert.assertEquals(1, StringUtils.levenshteinDistance("chat", "chats"));
        Assert.assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));
        Assert.assertEquals(1, StringUtils.levenshteinDistance("aviron", "avion"));
        Assert.assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));
        Assert.assertEquals(2, StringUtils.levenshteinDistance("Chien", "Chine"));
    }

    @Test
    public void testLevenshteinDistanceParametresNull() {
        // Teste le cas où un paramètre est null
        Assert.assertEquals(5, StringUtils.levenshteinDistance("chien", null));
        Assert.assertEquals(5, StringUtils.levenshteinDistance(null, "chien"));
        Assert.assertEquals(0, StringUtils.levenshteinDistance(null, null));
    }
}