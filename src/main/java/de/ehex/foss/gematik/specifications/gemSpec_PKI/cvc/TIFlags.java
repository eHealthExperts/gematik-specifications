package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;

import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of flags of a certificate holder authorization template (CHAT) (see Tab.74: Tab_PKI_910 - TI-PKI,
 * Bedeutung der Bits innerhalb der Flagliste eines CHAT, Übergreifende Spezifikation PKI [gemSpec_PKI], version 1.12.0,
 * released Apr. 21st 2017)
 *
 * @author Sascha Zak
 * @since May 16th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "Tab_PKI_910 - TI-PKI, Bedeutung der Bits innerhalb der Flagliste eines CHAT")
public enum TIFlags {

    /** eGK: Verwendung der ESIGN-AUTN-Funktionalität mit PIN.CH */
    EGK_ESIGN_AUTN_WITH_PIN_CH(8),

    /** eGK: Verwendung der ESIGN-AUTN Funktionalität ohne PIN */
    EGK_ESIGN_AUTN_WITHOUT_PIN(9),

    /** eGK: Verwendung der ESIGN-ENCV Funktionalität mit PIN.CH */
    EGK_ESIGN_ENCV_WITH_PIN_CH(10),

    /** eGK: Verwendung der ESIGN-ENCV Funktionalität ohne PIN */
    EGK_ESIGN_ENCV_WITHOUT_PIN(11),

    /** eGK: Verwendung der ESIGN-AUT Funktionalität */
    EGK_ESIGN_AUT(12),

    /** eGK: Verwendung der ESIGN-ENC Funktionalität */
    EGK_ESIGN_ENC(13),

    /** eGK: Notfalldatensatz verbergen und sichtbar machen */
    EGK_NFD_VISIBILITY(14),

    /** eGK: Notfalldatensatz schreiben, löschen (hier „erase“, nicht „delete“) mit PIN.NFD */
    EGK_NFD_WRITE_ERASE_WITH_PIN_NFD(15),

    /** eGK: Notfalldatensatz lesen mit MRPIN.NFD */
    EGK_NFD_READ_WITH_MRPIN_NFD(17),

    /** eGK: Notfalldatensatz lesen ohne PIN */
    EGK_NFD_READ_WITHOUT_PIN(18),

    /** eGK: Persönliche Erklärungen (DPE) verbergen und sichtbar machen */
    EGK_DPE_VISIBILITY(19),

    /** eGK: DPE schreiben, löschen (hier „erase“, nicht „delete“) mit MRPIN.DPE */
    EGK_DPE_WRITE_ERASE_WITH_MRPIN_DPE(20),

    /** eGK: DPE lesen mit MRPIN.DPE_READ */
    EGK_DPE_READ_WITH_MRPIN_DPE_READ(22),

    /** eGK: DPE lesen ohne PIN */
    EGK_DPE_READ_WITHOUT_PIN(23),

    /** eGK: Einwilligungen und Verweise im DF.HCA verbergen und sichtbar machen */
    EGK_HCA_AGREEMENT_REFERENCES_VISIBILIY(24),

    /** eGK: Einwilligungen im DF.HCA lesen und löschen (hier „erase“, nicht „delete“) */
    EGK_HCA_AGREEMENT_READ_ERASE(25),

    /** eGK: Einwilligungen im DF.HCA schreiben */
    EGK_HCA_AGREEMENT_WRITE_ERASE(27),

    /** eGK: Verweise im DF.HCA lesen und schreiben */
    EGK_HCA_REFERENCES_READ_WRITE(28),

    /** eGK: Geschützte Versichertendaten lesen mit PIN.CH */
    EGK_GVD_READ_WITH_PIN_CH(29),

    /** eGK: Geschützte Versichertendaten lesen ohne PIN */
    EGK_GVD_READ_WITHOUT_PIN(30),

    /** eGK: Loggingdaten schreiben mit PIN.CH */
    EGK_LOG_WRITE_WITH_PIN_CH(31),

    /** eGK: Loggingdaten schreiben ohne PIN */
    EGK_LOG_WRITE_WITHOUT_PIN(32),

    /** eGK: Loggingdaten lesen */
    EGK_LOG_READ(33),

    /** eGK: Prüfungsnachweis lesen und schreiben */
    EGK_RECEIPT_READ_WRITE(34),

    /** eGK: Testkennzeichen lesen mit PIN.CH */
    EGK_TEST_INDICATOR_READ_WITH_PIN_CH(35),

    /** eGK: Testkennzeichen lesen ohne PIN */
    EGK_TEST_INDICATOR_READ_WITHOUT_PIN(36),

    /** eGK: Gesundheitsdatendienste verbergen und sichtbar machen */
    EGK_HEALTH_DATA_SERVICE_VISIBILITY(39),

    /** eGK: Gesundheitsdatendienste lesen, schreiben und löschen (hier „erase“) */
    EGK_HEALTH_DATA_SERVICE_READ_WRITE_ERASE(40),

    /** eGK: Organspendedatensatz lesen mit MRPIN.OSE */
    EGK_ORGAN_DONATION_DATA_READ_WITH_MRPIN_OSE(41),

    /** eGK: Organspendedatensatz lesen ohne PIN */
    EGK_ORGAN_DONATION_READ_WITHOUT_PIN(42),

    /** eGK: Organspendedatensatz schreiben, löschen (hier „erase“, nicht „delete“) mit MRPIN.OSE */
    EGK_ORGAN_DONATION_WRITE_ERASE_WITH_MRPIN_OSE(43),

    /** eGK: Organspendedatensatz aktivieren/deaktivieren mit MRPIN.OSE */
    EGK_ORGAN_DONATION_ACTIVATION_WITH_MRPIN_OSE(44),

    /** eGK: AMTS-Datensatz verbergen und sichtbar machen */
    EGK_AMTS_VISIBILITY(45),

    /** eGK: AMTS-Datensatz lesen */
    EGK_AMTS_READ(46),

    /** eGK: AMTS-Datensatz schreiben, löschen (hier „erase“, nicht „delete“) */
    EGK_AMTS_WRITE_ERASE(47),

    /** Fingerprint des COS erstellen */
    COS_FINGERPRINT_CREATE(49),

    /** Auslöser Komfortsignatur */
    ISSUER_COMFORT_SIGNATURE(51),

    /** Sichere Signaturerstellungseinheit (SSEE) */
    SSEE(52),

    /** Remote-PIN Empfänger */
    REMOTE_PIN_RECEIVER(53),

    /** Remote-PIN Sender */
    REMOTE_PIN_SENDER(54),

    /** SAK für Stapel- oder Komfortsignatur */
    SAK_STACK_COMFORT_SIGNATURE(55),

    ;

    private final int bitIndex;

    private TIFlags(final int bitIndex) {
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
