package de.ehex.foss.gematik.specifications;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.j8unit.J8UnitTest;
import org.junit.Test;

import de.ehex.foss.gematik.specifications.AFO;

// TODO: extends EnumTests<SUT>
public abstract interface AFOTests<SUT extends AFO> extends J8UnitTest<SUT> {

    @Test
    public default void testValidAfoId() {
        final SUT sut = createNewSUT();
        assert sut != null;
        final String id = sut.getAfoId();
        assertNotNull(id);
        assertNotEquals("", id);
    }

    @Test
    public default void testValidAfoLabel() {
        final SUT sut = createNewSUT();
        assert sut != null;
        final String label = sut.getLabel();
        assertNotNull(label);
        assertNotEquals("", label);
    }

    @Test
    public default void testValidRequirementType() {
        final SUT sut = createNewSUT();
        assert sut != null;
        assertNotNull(sut.getType());
    }

}
