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
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4257("GS-A_4257", "Hauptsitz und Betriebsstätte"),

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
    GS_A_4578("GS-A_4578", "eGK hs-ZW Bildungsregel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4579("GS-A_4579", "eGK hs-ZW Verwendung/Wechsel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4580("GS-A_4580", "eGK hs-ZW Archivierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4583("GS-A_4583", "Berufsgruppenkennzeichen für HBA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4584("GS-A_4584", "Verwendung von Berufsgruppenkennzeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4585("GS-A_4585", "Typ der Organisation/Einrichtung des Gesundheitswesens für SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4586("GS-A_4586", "Verwendung von Institutionskennzeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4587("GS-A_4587", "Gesamtlänge der Telematik-ID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4588("GS-A_4588", "CA-Namen für Test-PKI der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4589("GS-A_4589", "EE-Namen für Test-PKI der TI"),

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

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4600("GS-A_4600", "Umsetzung Zertifikatsprofil C.HCI.AUT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4601("GS-A_4601", "Umsetzung Zertifikatsprofil C.HCI.ENC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4602("GS-A_4602", "Umsetzung Zertifikatsprofil C.HCI.OSIG"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4603("GS-A_4603", "Statusprüfung von Zertifikaten der gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4604("GS-A_4604", "Umsetzung Zertifikatsprofil C.SMKT.AUT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4605("GS-A_4605", "Verwendung registrierter Daten für gSMC-K-Zertifikatsbeantragung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4606("GS-A_4606", "Identischer ICCSN in allen Zertifikaten einer gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4607("GS-A_4607", "Zuordnung Konnektorinstanz zu verbauter gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4608("GS-A_4608", "Statusprüfung von Konnektorzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4609("GS-A_4609", "Umsetzung Zertifikatsprofil C.NK.VPN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4610("GS-A_4610", "Umsetzung Zertifikatsprofil C.AK.AUT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4611("GS-A_4611", "Umsetzung Zertifikatsprofil C.SAK.AUT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4613("GS-A_4613", "Umsetzung Zertifikatsprofil C.VPNK.VPN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4615("GS-A_4615", "Umsetzung Zertifikatsprofil C.ZD.TLS-S"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4617("GS-A_4617", "Umsetzung Zertifikatsprofil C.FD.TLS-C"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4618("GS-A_4618", "Umsetzung Zertifikatsprofil C.FD.TLS-S"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4620("GS-A_4620", "Zugriffsprofil einer eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4621("GS-A_4621", "Zugriffsprofil von HBA und SM-B (SMC-B, HSM-B)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4622("GS-A_4622", "Zugriffsprofil einer gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4623("GS-A_4623", "Zugriffsprofil eines HBA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4624("GS-A_4624", "Zugriffsprofil einer SM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4626("GS-A_4626", "CPI für CV-Zertifikate einer Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4627("GS-A_4627", "Verwendung des Feldes Certificate Authority Reference"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4628("GS-A_4628", "Zuordnung zwischen CAR und Schlüsselpaar des Herausgebers für Gen1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4630("GS-A_4630", "CHR des CV-Zertifikats einer Chipkarte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4631("GS-A_4631", "CHA des CV-Zertifikats einer Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4633("GS-A_4633", "OID für CV-Zertifikate einer Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4634("GS-A_4634", "Öffentlicher Schlüssel eines CV-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4636("GS-A_4636", "Aufbau eines CV-Zertifikats zur Authentisierung"),

    GS_A_4637("GS-A_4637", "TUCs, Durchführung Fehlerüberprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4640("GS-A_4640", "Identifizierung/Validierung des TI-Vertrauensankers bei der initialen Einbringung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4641("GS-A_4641", "Initiale Einbringung TI-Vertrauensanker"),

    GS_A_4642("GS-A_4642", "TUC_PKI_001: Periodische Aktualisierung TI-Vertrauensraum"),

    GS_A_4643("GS-A_4643", "TUC_PKI_013: Import TI-Vertrauensanker aus TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4644("GS-A_4644", "TSL-Vertrauensankerwechsel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4645("GS-A_4645", "TSL-Signatur ab Aktivierungsdatum neuer TI-Vertrauensanker"),

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

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4658("GS-A_4658", "Zertifikatsprüfung in spezifizierten Offline-Szenarien"),

    GS_A_4660("GS-A_4660", "TUC_PKI_009: Rollenermittlung"),

    GS_A_4661("GS-A_4661", "kritische Erweiterungen in Zertifikaten"),

    GS_A_4662("GS-A_4662", "Bedingungen für TLS-Handshake"),

    GS_A_4663("GS-A_4663", "Zertifikats-Prüfparameter für den TLS-Handshake"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4668("GS-A_4668", "Prüfung der mathematischen Korrektheit bei CV-Zertifikaten der Generation G1"),

    GS_A_4669("GS-A_4669", "Umsetzung Statusprüfdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4670("GS-A_4670", "Statusprüfdienst über Gültigkeitszeitraum des X.509-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4672("GS-A_4672", "Statusprüfdienst QES gemäß den Vorgaben von eIDAS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4674("GS-A_4674", "OCSP-Requests gemäß [RFC2560] und [Common-PKI]"),

    GS_A_4675("GS-A_4675", "OCSP-Responses gemäß [RFC2560]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4676("GS-A_4676", "OCSP-Responses gemäß [Common-PKI]"),

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

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4693("GS-A_4693", "Statusprüfdienst - Positive Statement"),

    GS_A_4694("GS-A_4694", "Betrieb von OCSP-Responder für Test-PKI-CAs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4695("GS-A_4695", "Zentrale Root-CA für Test- und Referenzumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4696("GS-A_4696", "OCSP-Responder für gematik TeRe-Root-CA im Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4697("GS-A_4697", "PKI für Test- und Referenzumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4698("GS-A_4698", "Pseudo-QES PKI für PKI-TeRe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4702("GS-A_4702", "Zentrale Aussteller-CA für nonQES-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4703("GS-A_4703", "CA-Zertifikatsprofil für nonQES-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4704("GS-A_4704", "Nutzung von CA mit spezifischem Verwendungszweck"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4705("GS-A_4705", "Verarbeitung von Sonderzeichen in PKI-Komponenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4706("GS-A_4706", "Vorgaben zu SubjectDN von CA- und OCSP-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4707("GS-A_4707", "Kennzeichen für Technische Rolle für Komponenten und Dienste"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4708("GS-A_4708", "Verwendung von Kennzeichen für Technische Rolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4709("GS-A_4709", "Abbildung der Telematik-ID in Admission-Struktur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4710("GS-A_4710", "Präfix der Telematik-ID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4711("GS-A_4711", "Separator der Telematik-ID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4712("GS-A_4712", "Definition und Eindeutigkeit der Telematik-ID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4713("GS-A_4713", "Zeichensatz für den Fortsatz der Telematik-ID"),

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
    GS_A_4724("GS-A_4724", "Komplettsperrung aller Zertifikate einer Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4725("GS-A_4725", "Eindeutiger SubjectDN durch serialNumber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4726("GS-A_4726", "Verwendung von serialNumber zur Schaffung eindeutiger SubjectDNs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4727("GS-A_4727", "PKI-Separierung von Test- und Produktivumgebung in der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4728("GS-A_4728", "Verwendung von zwei Schlüsselpaaren im VPN-Zugangsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4729("GS-A_4729", "Vorgaben bei Verwendung von zwei Schlüsselpaaren im VPN-Zugangsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4730("GS-A_4730", "Eindeutige Identifizierung der CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4731("GS-A_4731", "Attribute der CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4732("GS-A_4732", "Extension der CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4735("GS-A_4735", "Namenskonvention für CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4736("GS-A_4736", "Umsetzung Zentrale nonQES-Root-CA-Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4737("GS-A_4737", "Umsetzung nonQES-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4738("GS-A_4738", "Eindeutige Identifizierung der OCSP-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4739("GS-A_4739", "Attribute der OCSP-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4740("GS-A_4740", "Zentrale OCSP-Signer-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4741("GS-A_4741", "Umsetzung Zertifikatsprofil C.GEM.OCSP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4742("GS-A_4742", "Eindeutige Identifizierung der TSL-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4743("GS-A_4743", "Attribute der TSL-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4744("GS-A_4744", "Zentrale TSL-Signer-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4745("GS-A_4745", "Umsetzung Zertifikatsprofil C.TSL.SIG für TSL-Dienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4746("GS-A_4746", "Belegung organizationName im Zertifikatsprofil C.TSL.SIG für TSL-Dienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4747("GS-A_4747", "Umsetzung Zertifikatsprofil C.GEM.OCSP für TSL-Dienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4748("GS-A_4748", "Initiale Einbringung TSL-Datei"),

    GS_A_4749("GS-A_4749", "TUC_PKI_007: Prüfung Zertifikatstyp"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4750("GS-A_4750", "TUC_PKI_030 „QES-Zertifikatsprüfung“"),

    GS_A_4751("GS-A_4751", "Fehlercodes bei TSL- und Zertifikatsprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4828("GS-A_4828", "Vorgaben zur Bildung von nonQES-CA-Namen"),

    GS_A_4829("GS-A_4829", "TUCs, Fehlerbehandlung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4830("GS-A_4830", "Umsetzung Zertifikatsprofil C.VPNK.VPN-SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4897("GS-A_4897", "Gültigkeitsdauer einer TSL"),

    GS_A_4898("GS-A_4898", "TSL-Grace-Period einer TSL"),

    GS_A_4899("GS-A_4899", "TSL Update-Prüfintervall"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4900("GS-A_4900", "TUC_PKI_021 'CRL-Prüfung'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4901("GS-A_4901", "Einheitliche Admission in Zertifikaten einer Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4902("GS-A_4902", "Umsetzung nonQES-CA-Zertifikate."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4918("GS-A_4918", "Ableitung des OCSP-Signer-Zertifikates für TSL-Dienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4921("GS-A_4921", "Ableitung des OCSP-Signer-Zertifikates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4935("GS-A_4935", "Eindeutige Identifizierung der CRL-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4936("GS-A_4936", "Attribute der CRL-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4937("GS-A_4937", "Ableitung des CRL-Signer-Zertifikates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4938("GS-A_4938", "Zentrale CRL-Signer-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4939("GS-A_4939", "Umsetzung Zertifikatsprofil C.GEM.CRL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4943("GS-A_4943", "Alter der OCSP-Responses für eGK-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4948("GS-A_4948", "Umsetzung QES-CA-Zertifikate"),

    GS_A_4957("GS-A_4957", "Beschränkungen OCSP-Request", MUST_NOT),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4958("GS-A_4958", "Neue Telematik-ID bei Folgekarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4961("GS-A_4961", "Verwendung zugewiesener Berufs- und Rollenattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4962("GS-A_4962", "Verhalten bei Kartenverlust und Änderung persönlicher Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4963("GS-A_4963", "Deaktivierung von Chipkarten nach Gültigkeitsende"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4965("GS-A_4965", "Suspendierung von X.509-Zertifikaten (außer für eGK)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4971("GS-A_4971", "Zuordnung von SMC-B zur Institution"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4972("GS-A_4972", "Bezug des CV-Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4973("GS-A_4973", "Ausstellung aller CV-Zertifikate einer Karte durch gleiche CVC-Sub-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4974("GS-A_4974", "CV-Ausstattung von Smartcards der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4986("GS-A_4986", "Datenobjekt für das Feld Card Profile Identifier in G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4987("GS-A_4987", "Wert des Card Profile Identifier in G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4988("GS-A_4988", "Datenobjekt für das Feld Certificate Authority Reference in G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4989("GS-A_4989", "Länge der Certificate Authority Reference in G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4990("GS-A_4990", "Verwendung des Feldes Certificate Authority Reference in G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4991("GS-A_4991", "Zuordnung von CAR zu Schlüsselpaar des Herausgebers für G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4992("GS-A_4992", "Datenobjekt für den öffentlichen Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4993("GS-A_4993", "Aufbau eines öffentlichen Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4994("GS-A_4994", "Datenobjekt für die Certificate Holder Reference"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4995("GS-A_4995", "Wertfeld der Certificate Holder Reference"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4996("GS-A_4996", "Wertfeld des Certificate Holder Authorization Templates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4997("GS-A_4997", "Aufbau der Certificate Holder Authorization Templates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4998("GS-A_4998", "Datenobjekt des Certificate Effective Date"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4999("GS-A_4999", "Länge des Certificate Effective Date"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5000("GS-A_5000", "Format des Certificate Effective Date"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5001("GS-A_5001", "Datenobjekt des Certificate Expiration Date"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5002("GS-A_5002", "Länge des Certificate Expiration Date"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5003("GS-A_5003", "Format des Certificate Expiration Date"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5004("GS-A_5004", "Tag der zu signierenden Nachricht M eines CV-Zertifikates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5005("GS-A_5005", "Datenstruktur der zu signierenden Nachricht M eines CV-Zertifikates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5006("GS-A_5006", "Signatur des Zertifikatsdatenobjekts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5007("GS-A_5007", "Tag eines Zertifikatsdatenobjekts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5008("GS-A_5008", "Aufbau eines Zertifikatsdatenobjekts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5009("GS-A_5009", "Prüfung der mathematischen Korrektheit von CV-Zertifikate der Generation 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5010("GS-A_5010", "Prüfung der Signatur eines CV-Zertifikats der Generation 2 mit Hilfe des CV-Zertifikats des Herausgebers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5011("GS-A_5011", "Prüfung der Gültigkeit von CV-Zertifikaten der Generation G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5012("GS-A_5012", "Prüfung von CV-Zertifikaten der Generation 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5042("GS-A_5042", "Kodierung der X.509-Zertifikate für HBA und SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5043("GS-A_5043", "Auflösung von OCSP-Adressen im Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5050("GS-A_5050", "gematik-Root-CA Statusprüfdienst im Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5051("GS-A_5051", "TSP-X.509 nonQES Zertifikatsstatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5052("GS-A_5052", "gematik Root-CA Zertifikatsstatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5053("GS-A_5053", "TI-Zertifikatstypen im Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5066("GS-A_5066", "Indirekte CRL gemäß [Common-PKI]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5074("GS-A_5074", "Bereitstellung CRL für Zertifikate des VPN-Zugangsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5077("GS-A_5077", "FQDN-Prüfung beim TLS-Handshake"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5078("GS-A_5078", "FQDN-Prüfung beim IPsec-Aufbau"),

    GS_A_5090("GS-A_5090", "Statusprüfdienst - Keine Angabe von Sperrgründen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5124("GS-A_5124", "OCSP-Responses mit Parameter Nonce [Common-PKI]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5126("GS-A_5126", "Zugriffsprofil einer gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5212("GS-A_5212", "Zentrale Aussteller-CA für VPN-Zugangsdienst-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5213("GS-A_5213", "CA-Flaglist für CVC-CA eines Profiltyps"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5214("GS-A_5214", "TSL Neuausstellung"),

    GS_A_5215("GS-A_5215", "Festlegung der zeitlichen Toleranzen in einer OCSP-Response"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5280("GS-A_5280", "Umsetzung Zertifikatsprofil C.CM.TLS-CS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5323("GS-A_5323", "Gültigkeitszeitraum der X.509-Zertifikate auf einer Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5335("GS-A_5335", "Zugriffsprofil einer gSMC-K für Administrationszwecke"),

    @AfoHistory(documentVersion = "gemSpec_PKI_V1.8.0", description = "Aus OPB1-Paket - Stand 10.05.2016")
    GS_A_5336("GS-A_5336", "Zertifikatsprüfung nach Ablauf TSL-Graceperiod"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5337("GS-A_5337", "Größenbeschränkung von X.509 Zertifikaten auf Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5483("GS-A_5483", "Aufnahme der Pseudo-QES CA in die Pseudo-BNetzA-VL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5484("GS-A_5484", "TUC_PKI_036 „BNetzA-VL-Aktualisierung“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5511("GS-A_5511", "Unterstützung der Schlüsselgeneration RSA durch TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5512("GS-A_5512", "Unterstützung der Schlüsselgeneration RSA durchTSP-X.509 QES"),

    GS_A_5513("GS-A_5513", "Wahl des Signaturalgorithmus für Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5514("GS-A_5514", "Verwendung separater OCSP-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5515("GS-A_5515", "Bezug separater CRL-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5516("GS-A_5516", "Schlüsselgenerationen der CRL für Zertifikate des VPN-Zugangsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5517("GS-A_5517", "Schlüsselgenerationen der OCSP-Signer-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5528("GS-A_5528", "Unterstützung der Schlüsselgeneration ECDSA durch TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5529("GS-A_5529", "Unterstützung der Schlüsselgeneration ECDSA durch TSP-X.509 QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5531("GS-A_5531", "Umsetzung Zertifikatsprofil C.HP.AUT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5532("GS-A_5532", "Umsetzung Zertifikatsprofil C.HP.ENC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5533("GS-A_5533", "Umsetzung Zertifikatsprofil C.HP.QES"),

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
