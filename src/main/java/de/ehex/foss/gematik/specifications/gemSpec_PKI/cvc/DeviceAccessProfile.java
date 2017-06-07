package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of device profiles of generation 2 CV certificates (see Tab. 48: Tab_PKI_255 Tab_PKI_255 Zugriffsprofile
 * G2 für eine Authentisierung einer Funktionseinheit, Übergreifende Spezifikation PKI [gemSpec_PKI], version 1.12.0,
 * released Apr. 21st 2017)
 *
 * @author Sascha Zak
 * @since June 07th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "Tab_PKI_255 Zugriffsprofile G2 für eine Authentisierung einer Funktionseinheit")
public enum DeviceAccessProfile implements AccessProfile {

    G_SMC_K(51), //
    HBA(53), //
    G_SMC_KT(54), //
    G_SM_B(55), //
    ;

    private final byte profile;

    private DeviceAccessProfile(final int profile) {
        this.profile = (byte) profile;
    }

    /**
     * Returns the profile number.
     *
     * @return profile number
     */
    @Override
    public byte getProfile() {
        return this.profile;
    }
}
