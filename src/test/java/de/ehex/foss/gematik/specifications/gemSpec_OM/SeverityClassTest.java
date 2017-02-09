package de.ehex.foss.gematik.specifications.gemSpec_OM;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public final class SeverityClassTest implements SeverityClassTests<Severity> {

    @Override
    public final Class<Severity> createNewSUT() {
        return Severity.class;
    }

}
