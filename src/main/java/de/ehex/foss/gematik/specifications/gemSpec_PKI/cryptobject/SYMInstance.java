package de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CryptographicObject.Instance;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of the domain of symmetric object {@link Instance} (see 2.9 Instance (Ausprägung), Übergreifende
 * Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "2.9 Instance (Ausprägung)")
public enum SYMInstance implements Instance {

    ;

    private final String value;

    private SYMInstance(final String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

}
