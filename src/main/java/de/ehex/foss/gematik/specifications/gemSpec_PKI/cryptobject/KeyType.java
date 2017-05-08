package de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CryptographicObject.Type;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of the domain of key {@link Type} (see 2.5 Type (Objekttyp), Übergreifende Spezifikation Spezifikation PKI
 * [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "2.5 Type (Objekttyp)")
public enum KeyType implements Type {

    /** private key (asym.) */
    PRK("PrK"),

    /** public key (asym.) */
    PUK("PuK"),

    /** secret key (sym.) */
    SK("SK"),

    /** individual key (sym.) */
    IK("IK"),

    /** shared secret (sym.) (Pairing Geheimnis) */
    SHS("ShS");

    private final String value;

    private KeyType(final String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
