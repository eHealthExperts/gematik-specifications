package de.ehex.foss.gematik.specifications.gemSpec_X_509_TSP;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_X_509_TSP]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3547("TIP1-A_3547", "Erstellung einer Ausgabepolicy"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3548("TIP1-A_3548", "Schützenswerte Objekte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3549("TIP1-A_3549", "Vorgaben zum Schutzbedarf durch die gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3550("TIP1-A_3550", "Spezifische Erhöhung des Schutzbedarfs ist zulässig"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3554("TIP1-A_3554", "Gesicherte interne Schnittstellen des TSP-X.509 QES und TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3555("TIP1-A_3555", "Datenaustausch zwischen gematik und TSP-X.509 nonQES und gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3557("TIP1-A_3557", "Gesicherte externe Schnittstellen des TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3558("TIP1-A_3558", "Schnittstellen TSP-X.509 nonQES für Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3559("TIP1-A_3559", "Schnittstellen TSP-X.509 nonQES für Komponenten-, Signer-, nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3560("TIP1-A_3560", "Obligatorische Schnittstellen TSP-X.509 QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3562("TIP1-A_3562", "Schnittstellen gematik-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3564("TIP1-A_3564", "Bereitstellung eines Registrierungsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3565("TIP1-A_3565", "Certificate Policy des TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3567("TIP1-A_3567", "Abgestimmtes Antragsverfahren zwischen TSP-X.509 nonQES und Kartenherausgeber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3569("TIP1-A_3569", "Weiterleitung von Zertifikatsanträgen an Registrierungsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3570("TIP1-A_3570", "Eingangsdaten Leistungserbringerzertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3571("TIP1-A_3571", "professionItem und professionOID für LE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3572("TIP1-A_3572", "Eingangsdaten Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3573("TIP1-A_3573", "professionOID für LEO- und KTR-Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3574("TIP1-A_3574", "Eingangsdaten Versichertenzertifikate ohne Pseudonym"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3575("TIP1-A_3575", "Eingangsdaten Versichertenzertifikate AUTN und ENCV"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3576("TIP1-A_3576", "professionItem und professionOID für Versichertenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3577("TIP1-A_3577", "Optionale Eingangsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3580("TIP1-A_3580", "Übermittlung der Antragsdaten an Erstellungsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3581("TIP1-A_3581", "Ausgangsdaten für Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3582("TIP1-A_3582", "Umsetzung Registrierungsdienst TSP-X.509 nonQES für Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3583("TIP1-A_3583", "Erstellung QES-Zertifikat nach eIDAS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3584("TIP1-A_3584", "Prozessgestaltung für QES-Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3585("TIP1-A_3585", "Eingangsdaten Leistungserbringerzertifikat (QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3586("TIP1-A_3586", "professionItem und der professionOID für LE (QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3588("TIP1-A_3588", "Abstimmung des Antragsverfahrens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3589("TIP1-A_3589", "Umsetzung Registrierungsdienst TSP-X.509 QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3590("TIP1-A_3590", "Eindeutige Verbindung Personen- und Organisationszertifikatsnehmer und privater Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3591("TIP1-A_3591", "Eindeutigkeit von X.509-Personen- und Organisationszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3592("TIP1-A_3592", "Erstellung von X.509-Personen- und Organisationszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3594("TIP1-A_3594", "Bereitstellungszeitpunkt der Zertifikatsstatusinformation für Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3595("TIP1-A_3595", "Anforderungen von LEO- und KTR-Institutionen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3596("TIP1-A_3596", "Umsetzung Erstellungsdienst TSP-X.509 QES und TSP-X.509 nonQES für Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3597("TIP1-A_3597", "Eingangsprüfung Berechtigungsinformationen für Komponenten- und Signerzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3598("TIP1-A_3598", "Verbindliche Nutzung der Berechtigungsinformationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3599("TIP1-A_3599", "Registrierungsverfahren Antragsberechtigter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3601("TIP1-A_3601", "Regelung des Registrierungsverfahrens für Hersteller , Anbieter und TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3603("TIP1-A_3603", "Überprüfung bei Registrierung der Antragsteller für Komponenten- und Signerzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3605("TIP1-A_3605", "Registrierungsdienst für Komponenten- und Signer-, nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3606("TIP1-A_3606", "Automatisierter Registrierungsdienst für Komponentenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3607("TIP1-A_3607", "Request-Inhalte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3608("TIP1-A_3608", "Überprüfung Zertifikatsantrag für Komponentenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3609("TIP1-A_3609", "Überprüfung Hersteller, Anbieter und TSP-X.509 nonQES zu Produktangaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3611("TIP1-A_3611", "Eindeutige Zuordnung Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3612("TIP1-A_3612", "Erstellung von Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3613("TIP1-A_3613", "Widerruf der Registrierung von Antragsberechtigten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3614("TIP1-A_3614", "Widerrufsverfahren der Zertifikatsantragsberechtigung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3615("TIP1-A_3615", "Ausstellung von Zertifikaten nach Widerruf eines Hersteller oder Anbieters"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3616("TIP1-A_3616", "Weiterleitung der Daten an den Registrierungsdienst des TSP-X.509"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3618("TIP1-A_3618", "Umsetzung Registrierungsdienst für Komponenten-, Signer-, nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3619("TIP1-A_3619", "Voraussetzungen zur Umsetzung Registrierungsdienst TSP-X.509 nonQES für Komponenten-, Signer, nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3620("TIP1-A_3620", "Technische Umsetzung Registrierungsdienst TSP-X.509 nonQES für Komponenten-, Signer-, nonQES-HBA- und Organisationszertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3621("TIP1-A_3621", "Zertifikatsmanagementprotokolle des Registrierungsdienstes für Komponenten-, Signer, nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3622("TIP1-A_3622", "Eindeutige Verbindung Zertifikatsnehmer und privater Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3623("TIP1-A_3623", "Eindeutigkeit des Zertifikats für den Produkttyp gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3624("TIP1-A_3624", "Verwendung des Host- und Domänenname"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3626("TIP1-A_3626", "Erstellung von X.509-Komponten-, Signer-, nonQES-HBA- oder Organisationszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3627("TIP1-A_3627", "Bereitstellung der Zertifikatsstatusinformationen der Komponenten- und Signerzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3629("TIP1-A_3629", "Umsetzung Erstellungsdienst für Komponenten-, Signer-, nonQES-HBA- und Organisationszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3630("TIP1-A_3630", "Implementierung eines Sperrdienstes für nonQES-Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3631("TIP1-A_3631", "Prüfung der Berechtigung des Antragstellers für nonQES-Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3632("TIP1-A_3632", "Angaben des Sperrantrags für nonQES-Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3633("TIP1-A_3633", "Identifizierung des zu sperrenden nonQES-Personen- und Organisationszertifikates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3634("TIP1-A_3634", "Eingangsdaten zur Identifizierung des nonQES-Personen- und Organisationszertifikates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3635("TIP1-A_3635", "Regelungen zum Sperrprozess für nonQES-Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3637("TIP1-A_3637", "Regelungen zur Suspendierung und Desuspendierung von Versichertenzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3638("TIP1-A_3638", "Unmittelbare Ausführung der Sperrung von nonQES-Personen- und Organisationszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3639("TIP1-A_3639", "Weitergabe der Zertifikatsstatusinformationen von Personen-und Organisationszertifikaten an den OCSP-Responder"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3640("TIP1-A_3640", "Information an den Sperrantragsteller für nonQES-Personen-und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3641("TIP1-A_3641", "Sperrdienst gemäß den Vorgaben von eIDAS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3642("TIP1-A_3642", "Umsetzung der Schnittstelle des Sperrdienstes für Personen-und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3643("TIP1-A_3643", "Implementierung eines Sperrdienstes für Komponenten-, Signer-, nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3644("TIP1-A_3644", "Abgleich der Registrierungsdaten mit vorhandenen Daten aus der Berechtigungsinformation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3645("TIP1-A_3645", "Prüfung der Sperrberechtigung für Komponenten- und Signerzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3646("TIP1-A_3646", "Automatisierte Anlieferung und Bearbeitung von Sperranträgen für Komponenten- und Signerzertifikate "),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3647("TIP1-A_3647", "Rückmeldung zur Sperrung an den Antragsteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3648("TIP1-A_3648", "Angaben zur Identifizierung des zu sperrenden Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3649("TIP1-A_3649", "Prüfungen bei Eingang eines Sperrantrags"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3650("TIP1-A_3650", "Prüfung der Sperrantragsangaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3651("TIP1-A_3651", "Eingangsdaten zur Identifizierung des zu sperrenden Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3652("TIP1-A_3652", "Regelungen zum Sperrprozess"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3653("TIP1-A_3653", "Keine Bearbeitung von Sperranträgen bei nicht berechtigter Beantragung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3654("TIP1-A_3654", "Umsetzung der Schnittstelle zur Sperrung von Komponenten-, Signer-, nonQES-HBA- und Organisationszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3655("TIP1-A_3655", "Certificate Policy des gematik-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3656("TIP1-A_3656", "abgestimmtes Antrags- und Sperrverfahren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3657("TIP1-A_3657", "Gesicherte Zertifikatserstellung der X-509-Sub-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3658("TIP1-A_3658", "Antragsdaten X.509-Sub-CA-Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3660("TIP1-A_3660", "Trennung der TSP-X.509-Betriebsumgebungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3662("TIP1-A_3662", "Registrierung einer Test-TSP-X.509-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3663("TIP1-A_3663", "Dokumentation von Sperrungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3664("TIP1-A_3664", "Sperrinformationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3877("TIP1-A_3877", "Darstellung der Zusammenarbeit von Kartenherausgeber, Kartenhersteller und TSP-X.509 im Sicherheitskonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3879("TIP1-A_3879", "Ausstellung von X.509-Zertifikate für zugelassene TSP-X.509"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3880("TIP1-A_3880", "Bestätigung Auflagen bei Widerruf der Zulassung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3881("TIP1-A_3881", "Schutzbedarf darf nicht verringert werden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3883("TIP1-A_3883", "Sicherstellung TSP-X.509 OCSP-Responder und Sperrdienst bei nicht-sicherheitskritischen Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3884("TIP1-A_3884", "Umgang mit nicht-sicherheitskritischen Incidents für nonQES-Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3885("TIP1-A_3885", "Umgang mit nicht-sicherheitskritischen Incidents für QES-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3886("TIP1-A_3886", "OCSP-Adresse im X.509-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3887("TIP1-A_3887", "Verarbeitung von Anträgen bei einem nicht-sicherheitskritischen Incidents von X.509-Personen- und Organisationszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3888("TIP1-A_3888", "Zertifikatsstatusinformationen der Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3889("TIP1-A_3889", "Festlegung des Registrierungsverfahrens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3890("TIP1-A_3890", "Umgang mit nicht-sicherheitskritischen Incidents für Komponentenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3891("TIP1-A_3891", "Verarbeitung von Anträgen bei nicht-sicherheitskritischen Incidents von Komponenten-, Signer-, nonQES-HBA- und Organisationszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3894("TIP1-A_3894", "Obligatorisch abzuleitende Sub-CAs unterhalb der gematikRoot-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4015("TIP1-A_4015", "Maximale Gültigkeitsdauer des TSL-Signer-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4230("TIP1-A_4230", "Datenschutzgerechte Antrags- und Sperrprozesse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4231("TIP1-A_4231", "Löschung gespeicherter X.509-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4232("TIP1-A_4232", "Löschung von TSP-X.509 nonQES- Zertifikatstatusinformationen, Zertifikats- und Sperranträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4233("TIP1-A_4233", "Löschung von gematik-Root-CA Zertifikats- und Sperraufträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4234("TIP1-A_4234", "Protokollierung von OCSP-Anfragen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4235("TIP1-A_4235", "Fehlerprotokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4240("TIP1-A_4240", "professionItem und professionOID für Komponenten- und Signerzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4242("TIP1-A_4242", "Signierung des Test-nonQES-X.509-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4243("TIP1-A_4243", "Prüfung der Berechtigung des Antragstellers für QES-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4244("TIP1-A_4244", "Unmittelbare Ausführung der Sperrung für Komponenten, Signer-, nonQES-HBA- oder Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4246("TIP1-A_4246", "Erzeugung einer CRL für Zertifikate von VPN-Zugangsdiensten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4247("TIP1-A_4247", "Bereitstellung der Sperrinformationen per CRL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4248("TIP1-A_4248", "CRL im Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4250("TIP1-A_4250", "Betriebskonzept gematik-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4251("TIP1-A_4251", "Auditierverfahren gematik-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4252("TIP1-A_4252", "Antragsverfahren Sub-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4253("TIP1-A_4253", "Signierung des Sub-CA-Zertifikats für Produktivumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4254("TIP1-A_4254", "Signierung des Sub-CA-Zertifikats für Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4255("TIP1-A_4255", "Ausgabe des Sub-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4427("TIP1-A_4427", "Betrieb einer Test-TSP-X.509"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4428("TIP1-A_4428", "Registrierung eines Test-TSP-X.509"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4429("TIP1-A_4429", "I_Cert_Provisoning::provide_Certificate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4430("TIP1-A_4430", "I_Cert_Provisoning::provide_Certificate:SEND_REQUEST"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4431("TIP1-A_4431", "Cert_Provisoning::provide_Certificate: GET_CERTIFICATE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4432("TIP1-A_4432", "I_Cert_Revocation::revoke_Certificate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4433("TIP1-A_4433", "I_Cert_Revocation::revoke_Certificate:SEND_REVOCATE_DATA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4434("TIP1-A_4434", "Verfahren zur Zeitsynchronisierung gematik-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4464("TIP1-A_4464", "Eingangsprüfung Berechtigungsinformationen für nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4465("TIP1-A_4465", "Überprüfung bei Registrierung der Antragsteller für nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4466("TIP1-A_4466", "I_Cert_Provisoning::provide_Certificate: AUTHENTICATE_REQUESTOR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4467("TIP1-A_4467", "Prüfung der Sperrberechtigung für nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4468("TIP1-A_4468", "Aktualisierung der CRL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4469("TIP1-A_4469", "Technische Umsetzung Sperrdienst TSP-X.509 nonQES für Komponenten-, Signer-, nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4470("TIP1-A_4470", "Zertifikatsmanagementprotokolle des Sperrdienstes für Komponenten-, Signer-, nonQES-HBA- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5086("TIP1-A_5086", "Eingangsdaten der Bestätigungsprüfende Stelle für Produktion von nonQES-Zertifikaten für Leistungserbringer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5087("TIP1-A_5087", "Berücksichtigung und Umsetzung übergeordneter Herausgeberpolicies"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5088("TIP1-A_5088", "Sektorzulassung für zugelassene TSP-X.509"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5089("TIP1-A_5089", "Negative Prüfung von nonQES-Zertifikatsanträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5090("TIP1-A_5090", "Rückmeldung Zertifikatsinformationen (nonQES) an Bestätigende Stelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5092("TIP1-A_5092", "Negative Prüfung von QES-Zertifikatsanträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5093("TIP1-A_5093", "Eingangsdaten der Bestätigungsprüfende Stelle für Produktion von QES-Zertifikaten für Leistungserbringer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5094("TIP1-A_5094", "Rückmeldung Zertifikatsinformationen (QES) an Bestätigende Stelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5097("TIP1-A_5097", "Zertifikatsbeantragung über SOAP-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5098("TIP1-A_5098", "Zertifikatsbeantragung über Web-Portal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5099("TIP1-A_5099", "I_Cert_Revocation::revoke_Certificate: AUTHENTICATE_REQUESTOR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5100("TIP1-A_5100", "I_Cert_Revocation::revoke_Certificate: GET_CERTIFICATE_STATUS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5101("TIP1-A_5101", "Zertifikatssperrung über Web-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5102("TIP1-A_5102", "Zertifikatssperrung über Web-Portal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5164("TIP1-A_5164", "Statusinformation erstellter X.509-Sub-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5165("TIP1-A_5165", "Statusinformation gesperrter X.509-Sub-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5166("TIP1-A_5166", "Rückmeldung Sperrungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5167("TIP1-A_5167", "Crosszertifizierung gematik Root-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5168("TIP1-A_5168", "Bereitstellung gematik Root-CA- und Sub-Ca-Zertifikate und Fingerprints im Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5371("TIP1-A_5371", "Systemtechnische Trennung bei Aufbau und Betrieb der gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5376("TIP1-A_5376", "Erreichbarkeit des Sperrdienstes von TSP-X.509 nonQES und gematik Root-CA"),

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
