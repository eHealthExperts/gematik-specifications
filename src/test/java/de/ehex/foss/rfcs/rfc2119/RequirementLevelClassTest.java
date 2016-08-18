package de.ehex.foss.rfcs.rfc2119;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public final class RequirementLevelClassTest implements RequirementLevelClassTests<RequirementLevel> {

    @Override
    public final Class<RequirementLevel> createNewSUT() {
        return RequirementLevel.class;
    }

}
