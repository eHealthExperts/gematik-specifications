package de.ehex.foss.gematik.specifications.gemSpec_TSL;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_TSL]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3949("TIP1-A_3949", "Veröffentlichungspflicht und kritische Informationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3950("TIP1-A_3950", "Mitteilungspflicht bei Änderungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3951("TIP1-A_3951", "Vorlage der technischen Dokumentation und des Betriebskonzepts bei der gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3953("TIP1-A_3953", "Anzeige von Änderung an der Gesellschafterstruktur des Betreibers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3954("TIP1-A_3954", "Obligatorische Vorgaben für das Rollenkonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3955("TIP1-A_3955", "Revisionssicherheit der Protokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3956("TIP1-A_3956", "Bereitstellung der Protokollierungsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3957("TIP1-A_3957", "Standort für Backup-HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3958("TIP1-A_3958", "Verwendung des HSM gemäß Vier-Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3959("TIP1-A_3959", "Backup-Konzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3960("TIP1-A_3960", "Besetzung von Rollen und Informationspflichten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3961("TIP1-A_3961", "Durchgängige Verfügbarkeit spezifischer Rollen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3962("TIP1-A_3962", "Rollenzuordnung unter Wahrung der Vier-Augen-Prinzips"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3963("TIP1-A_3963", "Nutzung des HSM im kontrollierten Bereich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3964("TIP1-A_3964", "Zugang zu Systemen für die TSL-Erzeugung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3965("TIP1-A_3965", "Niederlassungsregelung für Betriebsstätten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3967("TIP1-A_3967", "Vorgaben für die informationstechnische Trennung sicherheitskritischer Bestandteile der Systemumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3968("TIP1-A_3968", "Manipulationsschutz veröffentlichter Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3969("TIP1-A_3969", "Vorgaben zur Betriebsumgebung für sicherheitskritische Bestandteile des Systems"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3970("TIP1-A_3970", "Gewährleistung des Zugangs zur Betriebsstätte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3971("TIP1-A_3971", "Organisatorische Trennung von anderen Rollen in TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3972("TIP1-A_3972", "Rollenunterscheidung im organisatorischen Konzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3973("TIP1-A_3973", "Mitteilungspflicht für Zuordnung der Rollen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3974("TIP1-A_3974", "Obligatorisches 4-Augen-Prinzip für sicherheitsrelevante Tätigkeiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3975("TIP1-A_3975", "Ausschluss von Rollenzuordnungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3976("TIP1-A_3976", "Anforderungen an den Einsatz freier Mitarbeiter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3977("TIP1-A_3977", "Einsicht in Dokumente für Mitarbeiter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3978("TIP1-A_3978", "Aufzeichnung von technischen Ereignissen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3979("TIP1-A_3979", "Aufzeichnung von organisatorischen Ereignissen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3980("TIP1-A_3980", "Protokollierung wichtiger TSL-spezifischer Ereignisse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3981("TIP1-A_3981", "Protokollierung wichtiger TSL-spezifischer Ereignisse: Angaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3982("TIP1-A_3982", "Aufbewahrungsfrist für Protokolldaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3983("TIP1-A_3983", "Schutz vor Zugriff, Löschung und Manipulation elektronischer Protokolldaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3984("TIP1-A_3984", "Archivierung: Relevante Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3985("TIP1-A_3985", "Dokumentationspflicht für Prozesse zum Schlüsselwechsel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3986("TIP1-A_3986", "Aktionen und Verantwortlichkeit im Rahmen der Notfallplanung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3987("TIP1-A_3987", "Herausgabe des Schlüsselmaterials"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3988("TIP1-A_3988", "Bewilligung der Herausgabe der Schlüsselmaterials"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3989("TIP1-A_3989", "Anzeigepflicht bei Beendigung der Dienstleistungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3990("TIP1-A_3990", "Fortbestand von Archiven und die Abrufmöglichkeit aller TSL-Dateien und Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3991("TIP1-A_3991", "Fristen bei Einstellung des Betriebs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3992("TIP1-A_3992", "Erforderliche Form bei Einstellung des Betriebs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3993("TIP1-A_3993", "TSL-Signer-CA offline"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3994("TIP1-A_3994", "Schlüsselverwaltung: zwingend unterschiedliche Schlüssel für unterschiedliche Entitäten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3995("TIP1-A_3995", "Beachtung des betreiberspezifischen Sicherheitskonzepts bei der Erzeugung von Schlüsselpaaren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3996("TIP1-A_3996", "Sicherheitsniveau bei der Generierung von Signaturschlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3997("TIP1-A_3997", "Verwendung eines Backup-HSM zum Im-/Export von privaten Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3998("TIP1-A_3998", "Unterstützung des sicheren Löschen von Schlüsseln durch HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3999("TIP1-A_3999", "Generieren und Löschen von Schlüsselpaaren gemäß Vier- Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4000("TIP1-A_4000", "Berechnungen mit dem privaten Schlüssel gemäß Vier-Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4001("TIP1-A_4001", "Protokollierung der HSM-Nutzung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4002("TIP1-A_4002", "Berücksichtigung des aktuellen Erkenntnisstands bei der Generierung von Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4003("TIP1-A_4003", "Anlass für den Wechsel von Schlüsselpaaren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4005("TIP1-A_4005", "Sicherung des privaten Schlüssels"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4006("TIP1-A_4006", "Verwendung von privaten Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4007("TIP1-A_4007", "Vorgaben an HSM-Funktionalität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4008("TIP1-A_4008", "Speicherung und Auswahl von Schlüsselpaaren im HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4010("TIP1-A_4010", "Vorgaben an die Prüftiefe der Evaluierung eines HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4011("TIP1-A_4011", "PKCS#11"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4012("TIP1-A_4012", "Hinterlegung des privaten Schlüssels"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4016("TIP1-A_4016", "Maximale Gültigkeitsdauer des TSL-Signer-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4017("TIP1-A_4017", "Sichere Übermittlung von Aktivierungsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4018("TIP1-A_4018", "Konformität zum betreiberspezifischen Sicherheitskonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4019("TIP1-A_4019", "Härtung von Betriebssystemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4026("TIP1-A_4026", "Service Level"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4027("TIP1-A_4027", "Bereitstellung Schnittstelle I_TSL-Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4028("TIP1-A_4028", "I_TSL-Management, Bestätigung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4030("TIP1-A_4030", "Bereitstellung I_TSL-Management:Client"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4031("TIP1-A_4031", "I_TSL-Management:Client, TSL-Eintragsanträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4032("TIP1-A_4032", "I_TSL-Management:Client, XML-Format"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4034("TIP1-A_4034", "I_TSL-Management:Client, Qualifizierte Signatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4035("TIP1-A_4035", "TSL-Signer-CA-Zertifikat als TSL-Eintrag"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4036("TIP1-A_4036", "Syntaktische und semantische Prüfung der TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4037("TIP1-A_4037", "Aktualisierungen: Standard und adhoc"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4038("TIP1-A_4038", "Standardaktualisierung: periodisch"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4039("TIP1-A_4039", "Standardaktualisierung: Berücksichtigung TSL-Eintragsanträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4042("TIP1-A_4042", "Prüfung von TSL-Eintragsanträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4043("TIP1-A_4043", "Prüfung von Änderungsanträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4044("TIP1-A_4044", "Prüfung auf ungültige Einträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4045("TIP1-A_4045", "Übermittlung zur Freigabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4046("TIP1-A_4046", "Freigabe vor Veröffentlichung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4049("TIP1-A_4049", "Prozess für Schlüsselpaargenerierung und Zertifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4050("TIP1-A_4050", "Zertifikatswechsel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4051("TIP1-A_4051", "Auftrag für Schlüsselerzeugung TSL-Signer-CA und OCSP-Responder"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4052("TIP1-A_4052", "Auftrag für Schlüsselerzeugung, 2 Mitarbeiter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4053("TIP1-A_4053", "Auftrag für Erzeugung, Inhalt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4054("TIP1-A_4054", "TI-Vertrauensankerwechsel, Prozess"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4055("TIP1-A_4055", "Web-Server"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4056("TIP1-A_4056", "I_TSL_Download: HTTP für TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4057("TIP1-A_4057", "I_TSL_Download: HTTPS für Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4058("TIP1-A_4058", "X.509-Zertifikat für HTTPSfür Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4059("TIP1-A_4059", "EV-SSL-Zertifikat für HTTPS für Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4060("TIP1-A_4060", "TSL-Dienst: URIs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4062("TIP1-A_4062", "I_TSL_Download::download_TSL: GET-Befehl"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4063("TIP1-A_4063", "I_TSL_Download::download_TSL: Header"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4064("TIP1-A_4064", "I_TSL_Download::download_TSL: Content-Type"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4065("TIP1-A_4065", "I_TSL_Download::download_TSL: Body"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4066("TIP1-A_4066", "Web-Server I_Cert_Download"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4067("TIP1-A_4067", "I_Cert_Download: HTTPS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4068("TIP1-A_4068", "X.509-Zertifikat für HTTPS-Verbindung I_Cert_Download"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4069("TIP1-A_4069", "EV-SSL-Zertifikat für HTTPS-Schnittstelle I_Cert_Download"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4070("TIP1-A_4070", "feste URIs I_Cert_Download"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4072("TIP1-A_4072", "I_Cert_Download::download_Cert: GET-Befehl"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4073("TIP1-A_4073", "I_Cert_Download::download_Cert: Body"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4074("TIP1-A_4074", "TSL-Signer-CA-, TSL-Signer-, Komponenten-CA-Zertifikat: Angaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4075("TIP1-A_4075", "Fingerprint TSL-Signer-CA-Zertifikat per Post"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4076("TIP1-A_4076", "Erreichbarkeit OCSP-Responder"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4077("TIP1-A_4077", "Organisatorische Trennung für OCSP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4078("TIP1-A_4078", "Sperrantrag"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4079("TIP1-A_4079", "Verfahren für Sperrung TSL-Signer-Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4081("TIP1-A_4081", "ETSI_TS_102_231"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4082("TIP1-A_4082", "ETSI_TS_102_231 Annex B und XML-Schema"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4083("TIP1-A_4083", "XML-Signatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4084("TIP1-A_4084", "X.509-Zertifikate, Element X509Certificate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4085("TIP1-A_4085", "ETSI_TS_102_231 Annex B: nur erforderliche Elemente"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4086("TIP1-A_4086", "TSL ID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4087("TIP1-A_4087", "TSL Datumsformat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4088("TIP1-A_4088", "TSLType"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4089("TIP1-A_4089", "TSL SchemeOperatorName"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4090("TIP1-A_4090", "TSL SchemeName"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4091("TIP1-A_4091", "TSL SchemeInformationURI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4092("TIP1-A_4092", "TSL StatusDeterminationApproach"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4093("TIP1-A_4093", "TSL Postalische Adresse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4094("TIP1-A_4094", "TSL Policy-Angaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4095("TIP1-A_4095", "TSL HistoricalInformationPeriod"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4096("TIP1-A_4096", "TSL Lokalisierungspunkte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4097("TIP1-A_4097", "TSL TSPTradeName"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4098("TIP1-A_4098", "TSL TSPTradeName identisch mit TSPName"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4099("TIP1-A_4099", "TSL ServiceTypeIdentifier"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4100("TIP1-A_4100", "TSL ServiceName: ein Name-Element"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4102("TIP1-A_4102", "TSL ServiceName aus Subject-Feld"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4103("TIP1-A_4103", "TSL DigitalId"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4104("TIP1-A_4104", "TSL DigitalId: X.509-Zertifikat / Other-Element"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4105("TIP1-A_4105", "TSL ServiceStatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4106("TIP1-A_4106", "TSL ServiceSupplyPoints"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4107("TIP1-A_4107", "TSL ServiceInformationExtensions"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4108("TIP1-A_4108", "TSL ServiceInformationExtensions: Extension"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4109("TIP1-A_4109", "TSL Extension: Attribut „Critical“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4110("TIP1-A_4110", "TSL Extension: ExtensionOID & ExtensionValue"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4111("TIP1-A_4111", "TSL Test SchemeOperatorName"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4112("TIP1-A_4112", "TSL Test SchemeName"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4113("TIP1-A_4113", "TSL Test Policy-Angaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4114("TIP1-A_4114", "TSL Test Lokalisierungspunkte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4435("TIP1-A_4435", "I_TSL-Management, Zeitstempel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4438("TIP1-A_4438", "TSL-Datei für Testzwecke"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4439("TIP1-A_4439", "Schnittstelle I_TSL-Management für Test"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4440("TIP1-A_4440", "Konzept Prozess für Schlüsselpaargenerierung und Zertifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4441("TIP1-A_4441", "Konzept Zertifikatswechsel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4442("TIP1-A_4442", "Auftrag für Schlüsselerzeugung TSL-Signer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4443("TIP1-A_4443", "TSL-Zertifikate für Testzwecke"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4444("TIP1-A_4444", "Namen für TSL-Zertifikate für Testzwecke"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4445("TIP1-A_4445", "Profile TSL-Zertifikate für Testzwecke"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4446("TIP1-A_4446", "Trennung von Komponenten PU und Test-PKI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4447("TIP1-A_4447", "Publikation von Test-TSL und -Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4448("TIP1-A_4448", "Eigene Dienstinstanz für Test-Dateien in der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4449("TIP1-A_4449", "OCSP-Responder für Test-TSL-Signerzertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4851("TIP1-A_4851", "Beibehalten von abgelaufenen QES-CA-Zertifikaten in der TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4852("TIP1-A_4852", "TI-Vertrauensankerwechsel, Konzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5119("TIP1-A_5119", "TSL-Dienst: HTTP-Komprimierung unterstützen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5120("TIP1-A_5120", "Clients des TSL-Dienstes: HTTP-Komprimierung unterstützen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5121("TIP1-A_5121", "TI-spezifische Vorgaben an die Syntax der TSL-Datei"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5122("TIP1-A_5122", "TSL DNSSEC Trust Anchor ServiceTypeIdentifier"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5123("TIP1-A_5123", "TSL DNSSEC Trust Anchor Name"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5124("TIP1-A_5124", "TSL DNSSEC Trust Anchor DigitalId"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5125("TIP1-A_5125", "TSL DNSSEC Trust Anchor ServiceStatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5126("TIP1-A_5126", "TSL DNSSEC Trust Anchor StatusStartingTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5128("TIP1-A_5128", "TSL DNSSEC Trust Anchor Extension"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5382("TIP1-A_5382", "Zugang zu HSM-Systemen im Vier-Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5782("TIP1-A_5782", "Schlüsselbackup bei der gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5963("TIP1-A_5963", "TSL CV-Zertifikate der CVC-Root-CAs ServiceTypeIdentifier"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5964("TIP1-A_5964", "TSL CV-Zertifikate der CVC-Root-CAs Name"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5965("TIP1-A_5965", "TSL CV-Zertifikate der CVC-Root-CAs DigitalId"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5966("TIP1-A_5966", "TSL CV-Zertifikate der CVC-Root-CAs ServiceStatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5967("TIP1-A_5967", "TSL CV-Zertifikate der CVC-Root-CA Extension"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5990("TIP1-A_5990", "Bezug und Nutzung bereitgestellter CVC-Root- und Cross-CV-Zertifikate sowie Prüfung des Fingerprints zum öffentlichen CVC-Root-Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6750("TIP1-A_6750", "I_BNetzA_VL_Download: GET-Befehl"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6751("TIP1-A_6751", "I_BNetzA_VL_Download: Header"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6752("TIP1-A_6752", "I_BNetzA_VL_Download::download_VL: Content-Type"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6753("TIP1-A_6753", "I_BNetzA_VL_Download::download_VL: Body"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6754("TIP1-A_6754", "I_BNetzA_VL_Download::get_Hash"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6755("TIP1-A_6755", "I_BNetzA_VL_Download::get_Hash: URI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6756("TIP1-A_6756", "BNetzA-VL-Signer-Zertifikate in TSL aufnehmen und entfernen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6757("TIP1-A_6757", "Periodisches Aktualisieren der BNetzA-VL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6758("TIP1-A_6758", "Prüfen und Bereitstellen der BNetzA-VL auf dem TSL-Dienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6759("TIP1-A_6759", "Bezug einer Pseudo-BNetzA-VL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6760("TIP1-A_6760", "Pseudo-BNetzA-VL bereitstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6761("TIP1-A_6761", "BNetzA-VL Element TrustServiceProvider"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6762("TIP1-A_6762", "BNetzA-VL Element TSPService"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6763("TIP1-A_6763", "BNetzA-VL ServiceTypeIdentifier"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6764("TIP1-A_6764", "BNetzA-VL Service Name"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6765("TIP1-A_6765", "BNetzA-VL ServiceDigitalIdentity, DigitalId und X509Certificate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6766("TIP1-A_6766", "BNetzA-VL ServiceSupplyPoints"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6767("TIP1-A_6767", "BNetzA-VL ServiceInformationExtensions"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6768("TIP1-A_6768", "I_BNetzA_VL_Download: HTTPS für TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6769("TIP1-A_6769", "Gesichertes Herunterladen von Dateien der BNetzA"),

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
