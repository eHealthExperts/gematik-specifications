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
                final String afoId = aFO.getAfoId();
                if (collector.containsKey(afoId)) {
                    final Class<?> c1 = aFO.getClass();
                    final Class<?> c2 = collector.get(afoId).getClass();
                    assertFalse("Duplette of an AFO ID: " + afoId + "(via " + c1 + " and " + c2 + ")", collector.containsKey(afoId));
                }
                collector.put(afoId, aFO);
            }
        }
        System.out.println(collector.size());
    }

}
