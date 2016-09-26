package de.ehex.foss.gematik.specifications;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public final class AFOTypeClassTest implements AFOTypeClassTests<AFOType> {

    @Override
    public final Class<AFOType> createNewSUT() {
        return AFOType.class;
    }

}
