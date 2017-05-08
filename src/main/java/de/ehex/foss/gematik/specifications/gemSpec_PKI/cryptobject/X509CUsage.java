package de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CryptographicObject.Usage;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of the domain of X509 certificate {@link Usage} (see 2.7 Usage (Objektverwendung), Übergreifende
 * Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "2.7 Usage (Objektverwendung)")
public enum X509CUsage implements Usage {

    /** qualified electronic signature */
    QES("QES"),

    /** electronic signature */
    SIG("SIG"),

    /** electronic signature of an organization */
    OSIG("OSIG"),

    /** encipherment */
    ENC("ENC"),

    /** encipherment prescription */
    ENCV("ENCV"),

    /** authentication X509 */
    AUT("AUT"),

    /** authentication X509 organisation */
    AUTO("AUTO"),

    /** authentication message X509 */
    AUTN("AUTN"),

    /** certsign X509 */
    CA("CA"),

    /** VPN-Tunnel */
    VPN("VPN"),

    /** VPN-Tunnel secure internet service */
    VPN_SIS("VPN-SIS"),

    /** TLS */
    TLS("TLS"),

    /** TLS-Client */
    TLS_C("TLS-C"),

    /** TLS-Server */
    TLS_S("TLS-S"),

    /** TLS-Clientmodul */
    TLS_CS("TLS-CS"),

    /** OCSP */
    OCSP("OCSP"),

    /** calculation message auth. code */
    MAC("MAC"),

    /** key generation */
    KG("KG"),

    /** CRL */
    CRL("CRL"),

    /** certification authority component */
    KOMP("KOMP"),

    /** certification authority VPNservice */
    VPNK("VPNK"),

    /** certification authority SMC-B */
    SMCB("SMCB"),

    /** certification authority HBA */
    HBA("HBA");

    private final String value;

    private X509CUsage(final String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
