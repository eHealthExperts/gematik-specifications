package de.ehex.foss.gematik.specifications.gemSpec_OM;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public final class ErrorTypeClassTest implements ErrorTypeClassTests<ErrorType> {

    @Override
    public final Class<ErrorType> createNewSUT() {
        return ErrorType.class;
    }

}
