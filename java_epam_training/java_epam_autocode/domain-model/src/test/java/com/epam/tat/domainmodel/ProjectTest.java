package com.epam.tat.domainmodel;

import com.epam.tat.domainmodel.candies.Candy;
import com.epam.tat.domainmodel.candies.CandyBase;
import com.epam.tat.domainmodel.giftbox.GiftBox;
import com.epam.tat.domainmodel.util.Finding;
import com.epam.tat.domainmodel.util.Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProjectTest {

    @Test
    void shouldClassesAreInProperPackages() {
        assertEquals("package com.epam.tat.domainmodel.candies", CandyBase.class.getPackage().toString(), "Class CandyBase is not in package 'com.epam.tat.domainmodel.candies'");
        assertEquals("package com.epam.tat.domainmodel.candies", Candy.class.getPackage().toString(), "Class Candy is not in package 'com.epam.tat.domainmodel.candies'");
        assertEquals("package com.epam.tat.domainmodel.giftbox", GiftBox.class.getPackage().toString(), "Class GiftBox is not in package 'com.epam.tat.domainmodel.giftbox'");
        assertEquals("package com.epam.tat.domainmodel.util", Finding.class.getPackage().toString(), "Interface Finding is not in package 'com.epam.tat.domainmodel.util'");
        assertEquals("package com.epam.tat.domainmodel.util", Sorting.class.getPackage().toString(), "Interface Sorting is not in package 'com.epam.tat.domainmodel.util'");
    }

    @Test
    void shouldCandyGetWeightReturnWeight() {
        Candy testCandy = new Candy("Bounty", 18);
        assertEquals(18, testCandy.getWeight(), "Method of 'getWeight' of Candy return wrong value");
    }

    @Test
    void shouldCandySetWeightChangeWeightValue() {
        Candy testCandy = new Candy("Bounty", 18);
        testCandy.setWeight(5);
        assertEquals(5, testCandy.getWeight(), "Candy has wrong weight after set using 'setWeight' call");
    }
}
