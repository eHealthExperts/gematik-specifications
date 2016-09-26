package de.ehex.foss.gematik.specifications;

import static java.util.Objects.nonNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.j8unit.J8UnitTest;
import org.junit.Test;

import de.ehex.foss.rfcs.rfc2119.RequirementLevel;

public abstract interface AFOTypeTests<SUT extends AFOType> extends /* EnumTests<SUT> */ J8UnitTest<SUT> {

    @Test
    public default void testDeclarationAsEnumConstant() throws Exception {
        final SUT sut = createNewSUT();
        assert nonNull(sut);
        assertTrue(sut.getDeclaringClass().isEnum());
    }

    @Test
    public default void testValidRequirementLevel() throws Exception {
        final SUT sut = createNewSUT();
        assert nonNull(sut);
        assertNotNull(sut.getLevel());
    }

    @Test
    public default void testNonAliasingRequirementLevel() throws Exception {
        final SUT sut = createNewSUT();
        assert nonNull(sut);
        final RequirementLevel level = sut.getLevel();
        assert nonNull(level);
        assertFalse(level.isAlias());
    }

}
