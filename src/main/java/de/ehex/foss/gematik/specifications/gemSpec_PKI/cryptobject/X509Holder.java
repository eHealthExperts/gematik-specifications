package de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CryptographicObject.Holder;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of the domain of X509 certificate {@link Holder} (see 2.6 Holder (Objektbesitzer), Übergreifende
 * Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "2.6 Holder (Objektbesitzer)")
public enum X509Holder implements Holder {

    /** root certification authority */
    RCA("RCA"),

    /** health professional */
    HP("HP"),

    /** card holder */
    CH("CH"),

    /** Clientmodul */
    CM("CM"),

    /** health care institution */
    HCI("HCI"),

    /** security module Kartenterminal */
    SMKT("SMKT"),

    /** Anwendungskonnektor */
    AK("AK"),

    /** Netzkonnektor */
    NK("NK"),

    /** VPN Zugangsdienst */
    VPNK("VPNK"),

    /** gematik Trust-service Status List */
    TSL("TSL"),

    /** Signatur Anwendungs Komponente */
    SAK("SAK"),

    /** TLS */
    TLS("TLS"),

    /** Fachdienst VSD */
    VSD("VSD"),

    /** Zentraler Dienst */
    ZD("ZD"),

    /** Generischer Holder */
    GEM("GEM");

    private final String value;

    private X509Holder(final String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
