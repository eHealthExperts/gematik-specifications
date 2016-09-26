package de.ehex.foss.rfcs.rfc2119;

import static java.util.Objects.nonNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.j8unit.J8UnitTest;
import org.junit.Test;

public abstract interface RequirementLevelTests<SUT extends RequirementLevel> extends /* EnumTests<SUT> */ J8UnitTest<SUT> {

    @Test
    public default void testDeclarationAsEnumConstant() throws Exception {
        final SUT sut = createNewSUT();
        assert nonNull(sut);
        assertTrue(sut.getDeclaringClass().isEnum());
    }

    @Test
    public default void testValidDefinition() throws Exception {
        final SUT sut = createNewSUT();
        assert nonNull(sut);
        assertNotNull(sut.getDefinition());
    }

    @Test
    public default void testValidProperRequirementLevel() throws Exception {
        final SUT sut = createNewSUT();
        assert nonNull(sut);
        assertNotNull(sut.getProperRequirementLevel());
    }

    @Test
    public default void testNonAliasingRequirementLevel() throws Exception {
        final SUT sut = createNewSUT();
        assert nonNull(sut);
        assumeFalse("Test is not suitable for aliasing requirement levels.", sut.isAlias());
        final RequirementLevel proper = sut.getProperRequirementLevel();
        assertEquals(sut, proper);
    }

    @Test
    public default void testAliasingRequirementLevel() throws Exception {
        final SUT sut = createNewSUT();
        assert nonNull(sut);
        assumeTrue("Test is not suitable for non-aliasing requirement levels.", sut.isAlias());
        final RequirementLevel proper = sut.getProperRequirementLevel();
        assertFalse(proper.isAlias());
        assertNotEquals(sut, proper);
        assertNotEquals(sut.toString(), proper.toString());
        assertEquals(sut.getDefinition(), proper.getDefinition());
    }

}
