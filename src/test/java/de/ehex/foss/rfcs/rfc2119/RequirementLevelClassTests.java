package de.ehex.foss.rfcs.rfc2119;

import static java.util.Objects.nonNull;
import static org.junit.Assert.assertTrue;

import org.j8unit.J8UnitTest;
import org.junit.Test;

public abstract interface RequirementLevelClassTests<SUT extends RequirementLevel> extends /* EnumClassTests<SUT> */ J8UnitTest<Class<SUT>> {

    @Test
    public default void testIsEnum() throws Exception {
        final Class<SUT> sut = createNewSUT();
        assert nonNull(sut);
        assertTrue(sut.isEnum());
    }

}
