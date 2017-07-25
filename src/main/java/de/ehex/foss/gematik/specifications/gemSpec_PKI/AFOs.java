package de.ehex.foss.gematik.specifications.gemSpec_PKI;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static de.ehex.foss.gematik.specifications.AFOType.MUST_NOT;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;
import de.ehex.foss.gematik.specifications.AfoHistory;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_PKI]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4572("GS-A_4572", "Abbildung Pseudonym in X.509-Zertifikaten der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4573("GS-A_4573", "Eindeutigkeit des Pseudonyms innerhalb Herausgeber-Domäne"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4574("GS-A_4574", "Pseudonym-Erstellungsregel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4575("GS-A_4575", "Prüfung auf Eindeutigkeit des Pseudonyms"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4576("GS-A_4576", "Pseudonym auf eGK-Ersatzkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4577("GS-A_4577", "Pseudonym auf eGK-Folgekarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4588("GS-A_4588", "CA-Namen für Test-PKI der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4590("GS-A_4590", "Zertifikatsprofile für Test-PKI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4595("GS-A_4595", "Umsetzung Zertifikatsprofil C.CH.AUT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4596("GS-A_4596", "Umsetzung Zertifikatsprofil C.CH.ENC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4598("GS-A_4598", "Umsetzung Zertifikatsprofil C.CH.AUTN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4599("GS-A_4599", "Umsetzung Zertifikatsprofil C.CH.ENCV"),

    GS_A_4637("GS-A_4637", "TUCs, Durchführung Fehlerüberprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4640("GS-A_4640", "Identifizierung/Validierung des TI-Vertrauensankers bei der initialen Einbringung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4641("GS-A_4641", "Initiale Einbringung TI-Vertrauensanker"),

    GS_A_4642("GS-A_4642", "TUC_PKI_001: Periodische Aktualisierung TI-Vertrauensraum"),

    GS_A_4643("GS-A_4643", "TUC_PKI_013: Import TI-Vertrauensanker aus TSL"),

    GS_A_4646("GS-A_4646", "TUC_PKI_017: Lokalisierung TSL Download-Adressen"),

    GS_A_4647("GS-A_4647", "TUC_PKI_016: Download der TSL-Datei"),

    GS_A_4648("GS-A_4648", "TUC_PKI_019: Prüfung der Aktualität der TSL"),

    GS_A_4649("GS-A_4649", "TUC_PKI_020: XML-Dokument validieren"),

    GS_A_4650("GS-A_4650", "TUC_PKI_011: Prüfung des TSL-Signer-Zertifikates"),

    GS_A_4651("GS-A_4651", "TUC_PKI_012: XML-Signatur-Prüfung"),

    GS_A_4652("GS-A_4652", "TUC_PKI_018: Zertifikatsprüfung in der TI"),

    GS_A_4653("GS-A_4653", "TUC_PKI_002: Gültigkeitsprüfung des Zertifikats"),

    GS_A_4654("GS-A_4654", "TUC_PKI_003: CA-Zertifikat finden"),

    GS_A_4655("GS-A_4655", "TUC_PKI_004: Mathematische Prüfung der Zertifikatssignatur"),

    GS_A_4656("GS-A_4656", "TUC_PKI_005: Adresse für Status- und Sperrprüfung ermitteln"),

    GS_A_4657("GS-A_4657", "TUC_PKI_006: OCSP-Abfrage"),

    GS_A_4660("GS-A_4660", "TUC_PKI_009: Rollenermittlung"),

    GS_A_4661("GS-A_4661", "kritische Erweiterungen in Zertifikaten"),

    GS_A_4662("GS-A_4662", "Bedingungen für TLS-Handshake"),

    GS_A_4663("GS-A_4663", "Zertifikats-Prüfparameter für den TLS-Aufbau"),

    GS_A_4669("GS-A_4669", "Umsetzung Statusprüfdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4670("GS-A_4670", "Statusprüfdienst über Gültigkeitszeitraum des X.509-Zertifikats"),

    GS_A_4673("GS-A_4673", "OCSP-Requests gemäß [RFC2560]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4674("GS-A_4674", "OCSP-Requests gemäß [RFC2560] und [Common-PKI]"),

    GS_A_4675("GS-A_4675", "OCSP-Responses gemäß [RFC2560]"),

    GS_A_4677("GS-A_4677", "Spezifikationskonforme OCSP-Responses"),

    GS_A_4678("GS-A_4678", "Signierte OCSP-Responses"),

    GS_A_4679("GS-A_4679", "Signatur zu Statusauskünften von nonQES-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4680("GS-A_4680", "Verwendung eines HSMs zur Erzeugung von Signaturen zu OCSP-Responses"),

    GS_A_4684("GS-A_4684", "Auslassung der Signaturprüfung bei OCSP-Requests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4685("GS-A_4685", "Statusprüfdienst - Steigerung der Performance"),

    GS_A_4686("GS-A_4686", "Statusprüfdienst - Response Status"),

    GS_A_4687("GS-A_4687", "Statusprüfdienst - Response Status sigRequired"),

    GS_A_4688("GS-A_4688", "Statusprüfdienst - Angabe von Zeitpunkten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4689("GS-A_4689", "Statusprüfdienst - Zeitquelle von producedAt"),

    GS_A_4690("GS-A_4690", "Statusprüfdienst - Status des X.509-Zertifikats"),

    GS_A_4691("GS-A_4691", "Statusprüfdienst - X.509-Zertifikat mit Status „unknown“"),

    GS_A_4692("GS-A_4692", "Statusprüfdienst - Angabe Sperrzeitpunkt"),

    GS_A_4694("GS-A_4694", "Betrieb von OCSP-Responder für Test-PKI-CAs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4697("GS-A_4697", "PKI für Test- und Referenzumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4704("GS-A_4704", "Nutzung von CA mit spezifischem Verwendungszweck"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4705("GS-A_4705", "Verarbeitung von Sonderzeichen in PKI-Komponenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4706("GS-A_4706", "Vorgaben zu SubjectDN von CA- und OCSP-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4714("GS-A_4714", "Kodierung der Attribute in X.509-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4715("GS-A_4715", "Maximale Stringlänge der Attribute im SubjectDN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4716("GS-A_4716", "Umgang mit überlangen Organisationsnamen im SubjectDN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4717("GS-A_4717", "TI-spezifische Vorgabe zur Nutzung der Extension Admission"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4718("GS-A_4718", "TI-spezifische Vorgabe zur Nutzung der Extension CertificatePolicies"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4719("GS-A_4719", "TI-spezifische Vorgabe zur Nutzung der Extension SubjectAltNames"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4720("GS-A_4720", "Verwendung registrierter Werte für subjectDN"),

    GS_A_4721("GS-A_4721", "Beantragung Rollenattribute im X.509-Zertifikatsrequest"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4722("GS-A_4722", "Belegung der Felder professionInfos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4723("GS-A_4723", "Einzelsperrbarkeit von Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4724("GS-A_4724", "Komplettsperrung aller Zertifikate einer Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4727("GS-A_4727", "PKI-Separierung von Test- und Produktivumgebung in der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4730("GS-A_4730", "Eindeutige Identifizierung der CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4731("GS-A_4731", "Attribute der CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4732("GS-A_4732", "Extension der CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4735("GS-A_4735", "Namenskonvention für CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4737("GS-A_4737", "Umsetzung Zentrale nonQES-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4738("GS-A_4738", "Eindeutige Identifizierung der OCSP-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4739("GS-A_4739", "Attribute der OCSP-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4740("GS-A_4740", "Zentrale OCSP-Signer-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4741("GS-A_4741", "Umsetzung Zertifikatsprofil C.GEM.OCSP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4748("GS-A_4748", "Initiale Einbringung TSL-Datei"),

    GS_A_4749("GS-A_4749", "TUC_PKI_007: Prüfung Zertifikatstyp"),

    GS_A_4751("GS-A_4751", "Fehlercodes bei TSL- und Zertifikatsprüfung"),

    GS_A_4829("GS-A_4829", "TUCs, Fehlerbehandlung"),

    GS_A_4898("GS-A_4898", "TSL-Grace-Period einer TSL"),

    GS_A_4899("GS-A_4899", "TSL Update-Prüfintervall"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4902("GS-A_4902", "Umsetzung nonQES-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4935("GS-A_4935", "Eindeutige Identifizierung der CRL-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4936("GS-A_4936", "Attribute der CRL-Signer-Zertifikate"),

    GS_A_4957("GS-A_4957", "Beschränkung Anzahl Zertifikate je OCSP-Request", MUST_NOT),

    GS_A_5077("GS-A_5077", "FQDN-Prüfung beim TLS-Aufbau"),

    GS_A_5090("GS-A_5090", "Statusprüfdienst - Keine Angabe von Sperrgründen"),

    GS_A_5215("GS-A_5215", "Festlegung der zeitlichen Toleranzen in einer OCSP-Response"),

    @AfoHistory(documentVersion = "gemSpec_PKI_V1.8.0", description = "Aus OPB1-Paket - Stand 10.05.2016")
    GS_A_5336("GS-A_5336", "Zertifikatsprüfung nach Ablauf TSL-Graceperiod"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5511("GS-A_5511", "Unterstützung der Schlüsselgeneration RSA durch TSP-X.509 nonQES"),

    GS_A_5513("GS-A_5513", "Wahl des Signaturalgorithmus für Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5514("GS-A_5514", "Verwendung separater OCSP-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5517("GS-A_5517", "Schlüsselgenerationen der OCSP-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5528("GS-A_5528", "Unterstützung der Schlüsselgeneration ECDSA durch TSP-X.509 nonQES"),

    ;

    private final String afoID;

    private final AFOType level;

    private final String title;

    private AFOs(final String afoID, final String title) {
        this(afoID, title, MUST);
    }

    private AFOs(final String afoID, final String title, final AFOType level) {
        assert nonNull(afoID) : "There must be a non-null AFO id!";
        assert !afoID.isEmpty() : "There must be a non-empty AFO id!";
        assert nonNull(title) : "There must be a non-null AFO title!";
        assert !title.isEmpty() : "There must be a non-empty AFO title!";
        assert nonNull(level) : "There must be a non-null AFO type!";

        this.afoID = afoID;
        this.title = title;
        this.level = level;
    }

    @Override
    public String getAfoId() {
        assert nonNull(this.afoID) : "Class invariant violation!";
        assert !this.afoID.isEmpty() : "Class invariant violation!";

        return this.afoID;
    }

    @Override
    public String getLabel() {
        assert nonNull(this.title) : "Class invariant violation!";
        assert !this.title.isEmpty() : "Class invariant violation!";

        return this.title;
    }

    @Override
    public AFOType getType() {
        assert nonNull(this.level) : "Class invariant violation!";

        return this.level;
    }

}
