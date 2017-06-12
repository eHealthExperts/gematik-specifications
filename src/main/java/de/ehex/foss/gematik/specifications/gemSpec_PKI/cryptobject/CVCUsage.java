package de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CryptographicObject.Usage;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of the domain of CV certificate {@link Usage} (see 2.7 Usage (Objektverwendung), Übergreifende
 * Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "2.7 Usage (Objektverwendung)")
public enum CVCUsage implements Usage {

    /** certsign CVC */
    CS("CS"),

    /** authentication CVC */
    AUT_CVC("AUT_CVC"),

    /** authentication role CVC */
    AUTR_CVC("AUTR_CVC"),

    /** authentication device CVC */
    AUTD_CVC("AUTD_CVC"),

    /** authentication device CVC AKS (Auslösung Komfortsignatur) */
    AUTD_AKS_CVC("AUTD_AKS_CVC"),

    /** authentication device CVC RPE (Remote-PIN-Empfänger) */
    AUTD_RPE_CVC("AUTD_RPE_CVC"),

    /** authentication device CVC RPS (Remote-PIN-Sender) */
    AUTD_RPS_CVC("AUTD_RPS_CVC"),

    /** authentication device CVC SUK (Stapel- und komfortfähige SSEE) */
    AUTD_SUK_CVC("AUTD_SUK_CVC");

    private final String value;

    private CVCUsage(final String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
