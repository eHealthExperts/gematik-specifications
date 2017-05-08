package de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CryptographicObject.Holder;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of the domain of CV certificate {@link Holder} (see 2.6 Holder (Objektbesitzer), Übergreifende
 * Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "2.6 Holder (Objektbesitzer)")
public enum CVCHolder implements Holder {

    /** root certification authority */
    RCA("RCA"),

    /** certification authority */
    CA("CA"),

    /** certification authority eGK */
    CA_EGK("CA_eGK"),

    /** certification authority HPC */
    CA_HPC("CA_HPC"),

    /** certification authority SMC */
    CA_SMC("CA_SMC"),

    /** certification authority SAK */
    CA_SAK("CA_SAK"),

    /** certification authority for CAMS of HPC */
    CA_CAMS_HPC("CA_CAMS_HPC"),

    /** certification authority for CAMS of SMC */
    CA_CAMS_SMC("CA_CAMS_SMC"),

    /** CAMS of HPC */
    CAMS_HPC("CAMS_HPC"),

    /** CAMS of SMC */
    CAMS_SMC("CAMS_SMC"),

    /** health professional card */
    HPC("HPC"),

    /** health professional card role */
    HPC_ROLE("HPC_Role"),

    /** health professional card device */
    HPC_DEVICE("HPC_Device"),

    /** electronic health card */
    EGK("eGK"),

    /** security module card */
    SMC("SMC"),

    /** security module card role */
    SMC_ROLE("SMC_role"),

    /** security module card device */
    SMC_DEVICE("SMC_device"),

    /** Signatur Anwendungs Kom */
    SAK("SAK"),

    /** Komfort-Merkmal */
    KM("KM");

    private final String value;

    private CVCHolder(final String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
