package de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CryptographicObject.Instance;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of the domain of X509 certificate {@link Instance} (see 2.9 Instance (Ausprägung), Übergreifende
 * Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "2.9 Instance (Ausprägung)")
public enum X509Instance implements Instance {

    /** X.509 RSA 2048 */
    R2048("R2048"),

    /** X.509 RSA 3072 */
    R3072("R3072"),

    /** X.509 ECC 256 */
    E256("E256"),

    /** X.509 ECC 384 */
    E384("E384");

    private final String value;

    private X509Instance(final String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
