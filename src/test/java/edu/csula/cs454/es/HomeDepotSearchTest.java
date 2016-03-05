package edu.csula.cs454.es;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.file.Paths;

import static org.junit.Assert.*;

/**
 * Simply test parse data and if reading data correctly
 */
public class HomeDepotSearchTest {
    private HomeDepotSearch homeDepotSearch;
    @Before
    public void setup() {
        homeDepotSearch = new HomeDepotSearch(true);
    }

    @Test
    public void testParseData() throws Exception {
        File productDescriptionFile = Paths.get(
            ClassLoader.getSystemResource("product_descriptions.csv")
                .toURI()
        ).toFile();
        File productAttributeFile = Paths.get(
            ClassLoader.getSystemResource("attributes.csv")
                .toURI()
        ).toFile();
        homeDepotSearch.parseData(productDescriptionFile, productAttributeFile);

        Assert.assertEquals(
            "Restore 4X Deck Coat is a water based problem solving coating, formulated to make light repairs and is 4X thicker than ordinary paint. It beautifies and protects old previously coated wood, bare wood, broom swept concrete and most synthetic decking with proper surface preparation. 4X is ideal for wood and composite decking, concrete docks and more.Superior coverageLong lasting protectionConceals hairline cracksOutlasts typical deck stainsBarefoot friendlyFor horizontal and vertical surfacesCovers 80 sq. ft., two coats requiredOnline Price includes Paint Care fee in the following states: CA, CO, CT, MN, OR, RI, VT",
            homeDepotSearch.search(100092).getDescription()
        );
        Assert.assertEquals(
            "Get the House of Fara 3/4 in. x 3 in. x 8 ft. MDF Fluted Casing to add an elegant look to a room. Its pre-primed surface is free of knots, ready to be painted to match your decor. It cuts and installs easily for a quality look when finished. Its unique detail will add an architectural touch to any room or project.California residents: see&nbsp;Proposition 65 informationMade of primed MDFCan be painted to match your decorResistant to moistureFor interior use96 in. Length",
            homeDepotSearch.search(100009).getDescription()
        );
        Assert.assertEquals(
            "Versatile connector for various 90° connections and home repair projects",
            homeDepotSearch.search(100001).getAttributes().get("Bullet01")
        );
        Assert.assertEquals(
            "Gas",
            homeDepotSearch.search(100011).getAttributes().get("Fuel Type")
        );
    }
}