package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of certificate profile identifier (CPI) of CV certificates (see Tab.49: Tab_PKI_256 - Mögliche Werte für
 * CPI, Übergreifende Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "Tab_PKI_256 - Mögliche Werte für CPI")
public enum CPI {

    CVC_CA((byte) 21), //
    CHIPKARTE((byte) 22), //
    ;

    private final byte value;

    private CPI(final int value) {
        this.value = (byte) value;
    }

    /**
     * Returns the CPI byte value.
     * 
     * @return CPI byte value
     */
    public byte getValue() {
        return this.value;
    }
}
