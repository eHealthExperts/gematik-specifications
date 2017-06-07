package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of flags of a certificate holder authorization template (CHAT) (see Tab.77: Tab_PKI_911 - CMS-PKI,
 * Bedeutung der Bits innerhalb der Flagliste eines CHAT, Übergreifende Spezifikation Spezifikation PKI [gemSpec_PKI],
 * version 1.12.0, released Apr. 21st 2017)
 *
 * @author Sascha Zak
 * @since May 16th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "Tab_PKI_911 - CMS-PKI, Bedeutung der Bits innerhalb der Flagliste eines CHAT")
public enum CMSFlags {

    /** Administrative Tätigkeiten CMS */
    ADMIN_CMS(8),

    /** Administrative Tätigkeiten VSD */
    ADMIN_VSD(9),

    /** Administrative Tätigkeiten zum Schreiben von CV-Zertifikaten */
    ADMIN_CVC_WRITE(10),

    /** Administrative Tätigkeiten eines TSP zur Laufzeitverlängerung der QES-Anwendung */
    ADMIN_TSP_EXTEND_RETENTION_QES(11),

    ;

    private final int bitIndex;

    private CMSFlags(final int bitIndex) {
        this.bitIndex = bitIndex;
    }

    /**
     * Returns the index of related bit in a flag list of a CHAT.
     *
     * @return bit index
     */
    public int getBitIndex() {
        return this.bitIndex;
    }
}
