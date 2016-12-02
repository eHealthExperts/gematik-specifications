package de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public final class AFOsClassTest implements AFOsClassTests<AFOs> {

    @Override
    public final Class<AFOs> createNewSUT() {
        return AFOs.class;
    }

}
