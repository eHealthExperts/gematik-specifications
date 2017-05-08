package de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CryptographicObject.Type;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of the domain of ID {@link Type} (see 2.5 Type (Objekttyp), Übergreifende Spezifikation Spezifikation PKI
 * [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "2.5 Type (Objekttyp)")
public enum IDType implements Type {

    /** X.509v3 ID */
    X509v3_ID("ID"),

    /** card verifiable ID */
    CV_ID("ID");

    private final String value;

    private IDType(final String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
