package de.ehex.foss.gematik.specifications.gemSpec_OID;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_OID;
import static java.util.Arrays.stream;
import static java.util.Optional.ofNullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.ietf.jgss.Oid;

import de.ehex.foss.gematik.specifications.OID;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of profession object identifier (OID) mostly used in X.509 certificates (see Tab.2: Tab_PKI_402
 * OID-Festlegung Rolle im X.509-Zertifikat für Berufsgruppen, Tab. 3: Tab_PKI_403 OID-Festlegung Institutionen im
 * X.509-Zertifikat der SMC-B, Tab. 6: Tab_PKI_406 OID-Festlegung technische Rolle in X.509-ZertifikatenSpezifikation
 * Festlegung von OIDs [gemSpec_OID], version 2.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_OID, note = "Tab_PKI_402 OID-Festlegung Rolle im X.509-Zertifikat")
@SPEC(value = gemSpec_OID, note = "Tab_PKI_403 OID-Festlegung Institutionen im X.509-Zertifikat der SMC-B")
@SPEC(value = gemSpec_OID, note = "Tab_PKI_406 OID-Festlegung technische Rolle in X.509-Zertifikaten")
public enum ProfessionOIDs implements OID {

    ARZT("oid_arzt", "Ärztin/Arzt", "1.2.276.0.76.4.30"), //
    ZAHNARZT("oid_zahnarzt", "Zahnärztin/Zahnarzt", "1.2.276.0.76.4.31"), //
    APOTHEKER("oid_apotheker", "Apotheker/-in", "1.2.276.0.76.4.32"), //
    APOTHEKERASSISTENT("oid_apothekerassistent", "Apothekerassistent/-in", "1.2.276.0.76.4.33"), //
    PHARMAZIEINGENIEUR("oid_pharmazieingenieur", "Pharmazieingenieur/-in", "1.2.276.0.76.4.34"), //
    PHARM_TECHN_ASSISTENT("oid_pharm_techn_assistent", "pharmazeutisch-technische/-r Assistent/-in", "1.2.276.0.76.4.35"), //
    PHARM_KAUFM_ANGESTELLTER("oid_pharm_kaufm_angestellter", "pharmazeutisch-kaufmännische/-r Angestellte", "1.2.276.0.76.4.36"), //
    APOTHEKENHELFER("oid_apothekenhelfer", "Apothekenhelfer/-in", "1.2.276.0.76.4.37"), //
    APOTHEKENASSISTENT("oid_apothekenassistent", "Apothekenassistent/-in", "1.2.276.0.76.4.38"), //
    PHARM_ASSISTENT("oid_pharm_assistent", "Pharmazeutische/-r Assistent/-in", "1.2.276.0.76.4.39"), //
    APOTHEKENFACHARBEITER("oid_apothekenfacharbeiter", "Apothekenfacharbeiter/-in", "1.2.276.0.76.4.40"), //
    PHARMAZIEPRAKTIKANT("oid_pharmaziepraktikant", "Pharmaziepraktikant/-in", "1.2.276.0.76.4.41"), //
    FAMULANT("oid_famulant", "Stud.pharm. oder Famulant/-in", "1.2.276.0.76.4.42"), //
    PTA_PRAKTIKANT("oid_pta_praktikant", "PTA-Praktikant/-in", "1.2.276.0.76.4.43"), //
    PKA_AUSZUBILDENDER("oid_pka_auszubildender", "PKA Auszubildende/-r", "1.2.276.0.76.4.44"), //
    PSYCHOTHERAPEUT("oid_psychotherapeut", "Psychotherapeut/-in", "1.2.276.0.76.4.45"), //
    PS_PSYCHOTHERAPEUT("oid_ps_psychotherapeut", "Psychologische/-r Psychotherapeut/-in", "1.2.276.0.76.4.46"), //
    KUJ_PSYCHOTHERAPEUT("oid_kuj_psychotherapeut", "Kinder- und JugendlichenPsychotherapeut/-in", "1.2.276.0.76.4.47"), //
    RETTUNGSASSISTENT("oid_rettungsassistent", "Rettungsassistent/-in", "1.2.276.0.76.4.48"), //
    VERSICHERTER("oid_versicherter", "Versicherte/-r", "1.2.276.0.76.4.49"), //
    NOTFALLSANITAETER("oid_notfallsanitaeter", "Notfallsanitäter/-in", "1.2.276.0.76.4.178"), //

    PRAXIS_ARZT("oid_praxis_arzt", "Betriebsstätte Arzt", "1.2.276.0.76.4.50"), //
    ZAHNARZTPRAXIS("oid_zahnarztpraxis", "Zahnarztpraxis", "1.2.276.0.76.4.51"), //
    PRAXIS_PSYCHOTHERAPEUT("oid_praxis_psychotherapeut", "Betriebsstätte Psychotherapeut", "1.2.276.0.76.4.52"), //
    KRANKENHAUS("oid_krankenhaus", "Krankenhaus", "1.2.276.0.76.4.53"), //
    OEFFENTLICHE_APOTHEKE("oid_oeffentliche_apotheke", "Öffentliche Apotheke", "1.2.276.0.76.4.54"), //
    KRANKENHAUSAPOTHEKE("oid_krankenhausapotheke", "Krankenhausapotheke", "1.2.276.0.76.4.55"), //
    BUNDESWEHRAPOTHEKE("oid_bundeswehrapotheke", "Bundeswehrapotheke", "1.2.276.0.76.4.56"), //
    MOBILE_EINRICHTUNG_RETTUNGSDIENST("oid_mobile_einrichtung_rettungsdienst", "Betriebsstätte Mobile Einrichtung Rettungsdienst", "1.2.276.0.76.4.57"), //
    BS_GEMATIK("oid_bs_gematik", "Betriebsstätte gematik", "1.2.276.0.76.4.58"), //
    KOSTENTRAEGER("oid_kostentraeger", "Betriebsstätte Kostenträger", "1.2.276.0.76.4.59"), //
    LEO_ZAHNAERZTE("oid_leo_zahnaerzte", "Betriebsstätte Leistungserbringerorganisation Vertragszahnärzte", "1.2.276.0.76.4.187"), //

    VSDD("oid_vsdd", "Versichertenstammdatendienst", "1.2.276.0.76.4.97"), //
    OCSP("oid_ocsp", "Online Certificate Status Protocol", "1.2.276.0.76.4.99"), //
    CMS("oid_cms", "Card Management System", "1.2.276.0.76.4.100"), //
    UFS("oid_ufs", "Update Flag Service", "1.2.276.0.76.4.101"), //
    AK("oid_ak", "Anwendungskonnektor", "1.2.276.0.76.4.103"), //
    NK("oid_nk", "Netzkonnektor", "1.2.276.0.76.4.104"), //
    KT("oid_kt", "Kartenterminal", "1.2.276.0.76.4.105"), //
    SAK("oid_sak", "Signaturanwendungskomponente", "1.2.276.0.76.4.119"), //
    INT_VSDM("oid_int_vsdm", "Intermediär VSDM", "1.2.276.0.76.4.159"), //
    KONFIGDIENST("oid_konfigdienst", "Konfigurationsdienst", "1.2.276.0.76.4.160"), //
    VPNZ_TI("oid_vpnz_ti", "VPN-Zugangsdienst-TI", "1.2.276.0.76.4.161"), //
    VPNZ_SIS("oid_vpnz_sis", "VPN-Zugangsdienst-SIS", "1.2.276.0.76.4.166"), //
    CLIENT_MODUL("oid_cmfd", "Clientmodul", "1.2.276.0.76.4.174"), //
    VZD_TI("oid_vzd_ti", "Verzeichnisdienst-TI", "1.2.276.0.76.4.171"), //
    KOMLE("oid_komle", "KOM-LE Fachdienst", "1.2.276.0.76.4.172"), //
    KOMLE_RECIPIENT_EMAILS("oid_komle-recipientemails", "KOM-LE S/MIME Attribut recipient-emails", "1.2.276.0.76.4.173"), //
    STAMPEL("oid_stampel", "Status Ampel", "1.2.276.0.76.4.184"), //
    TSL_TI("oid_tsl_ti", "TSL-Dienst-TI", "1.2.276.0.76.4.189"), //
    ;

    private static final Map<String, ProfessionOIDs> refMap = new HashMap<>();
    private static final Map<String, ProfessionOIDs> oidMap = new HashMap<>();

    static {
        stream(ProfessionOIDs.values()).forEach(p -> {
            refMap.put(p.getRef(), p);
            oidMap.put(p.getOid(), p);
        });
    }

    private final String ref;
    private final String item;
    private final String oidString;
    private final Oid oid;

    private ProfessionOIDs(final String ref, final String item, final String oid) {
        this.ref = ref;
        this.item = item;
        this.oidString = oid;
        this.oid = OID.super.toOid();
    }

    @Override
    public Oid toOid() throws IllegalStateException {
        return this.oid;
    }

    /**
     * Returns the profession OID reference.
     *
     * @return profession OID reference
     */
    @Override
    public String getRef() {
        return this.ref;
    }

    /**
     * Returns the profession item.
     *
     * @return profession item
     */
    @Override
    public String getItem() {
        return this.item;
    }

    /**
     * Returns the profession OID.
     *
     * @return profession oid
     */
    @Override
    public String getOid() {
        return this.oidString;
    }

    /**
     * Returns the (first found) {@link ProfessionOIDs} with the given OID value.
     *
     * @param oid
     *            OID value to search for
     * @return {@link Optional} containing the (first found) {@link ProfessionOIDs} with the given OID value or an empty
     *         {@link Optional}, if no such {@link ProfessionOIDs} exists
     */
    public static Optional<ProfessionOIDs> ofOid(final String oid) {
        return ofNullable(oidMap.get(oid));
    }

    /**
     * Returns the (first found) {@link ProfessionOIDs} with the given OID reference.
     *
     * @param ref
     *            document reference to search for
     * @return {@link Optional} containing the (first found) {@link ProfessionOIDs} with the given document refenrence
     *         or an empty {@link Optional}, if no such {@link ProfessionOIDs} exists
     */
    public static Optional<ProfessionOIDs> ofRef(final String ref) {
        return ofNullable(refMap.get(ref));
    }
}
