package de.ehex.foss.gematik.specifications;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SpecificationsClassTest {

    @Test
    public void testUniquenessOfAfoIds() throws Exception {
        final Map<String, AFO> collector = new HashMap<>();
        for (final Specification specification : Specifications.values()) {
            assertNotNull(specification);
            for (final AFO aFO : specification.getAFOs()) {
                assertNotNull(aFO);
                assertFalse("Duplette of an AFO ID: " + aFO.getAfoId(), collector.containsKey(aFO.getAfoId()));
                collector.put(aFO.getAfoId(), aFO);
            }
        }
        System.out.println(collector.size());
    }

}
