package de.ehex.foss.gematik.specifications.gemSpec_X_509_TSP;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_X.509_TSP]}.
 *
 * @author Stefan Gasterst&auml;dt
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
    TIP1_A_3554("TIP1-A_3554", "Gesicherte interne Schnittstellen des TSP-X.509 QES und TSPX.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3555("TIP1-A_3555", "Datenaustausch zwischen gematik und TSP-X.509 nonQES und gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3557("TIP1-A_3557", "Gesicherte externe Schnittstellen des TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3558("TIP1-A_3558", "Schnittstellen TSP-X.509 nonQES für Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3564("TIP1-A_3564", "Bereitstellung eines Registrierungsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3565("TIP1-A_3565", "Certificate Policy des TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3567("TIP1-A_3567", "Abgestimmtes Antragsverfahren zwischen TSP-X.509 nonQES und Kartenherausgeber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3569("TIP1-A_3569", "Weiterleitung von Zertifikatsanträgen an Registrierungsdienst"),

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
    TIP1_A_3630("TIP1-A_3630", "Implementierung eines Sperrdienstes für nonQES-Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3631("TIP1-A_3631", "Prüfung der Berechtigung des Antragstellers für nonQESPersonen- und Organisationszertifikate"),

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
    TIP1_A_3639("TIP1-A_3639", "Weitergabe der Zertifikatsstatusinformationen von Personen- und Organisationszertifikaten an den OCSP-Responder"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3640("TIP1-A_3640", "Information an den Sperrantragsteller für nonQES-Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3642("TIP1-A_3642", "Umsetzung der Schnittstelle des Sperrdienstes für Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3660("TIP1-A_3660", "Trennung der TSP-X.509-Betriebsumgebungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3877("TIP1-A_3877", "Darstellung der Zusammenarbeit von Kartenherausgeber, Kartenhersteller und TSP-X.509 im Sicherheitskonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3880("TIP1-A_3880", "Bestätigung Auflagen bei Widerruf der Zulassung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3881("TIP1-A_3881", "Schutzbedarf darf nicht verringert werden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3883("TIP1-A_3883", "Sicherstellung TSP-X.509 OCSP-Responder und Sperrdienst bei nicht-sicherheitskritischen Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3884("TIP1-A_3884", "Umgang mit nicht-sicherheitskritischen Incidents für nonQESPersonen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3886("TIP1-A_3886", "OCSP-Adresse im X.509-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3887("TIP1-A_3887", "Verarbeitung von Anträgen bei einem nicht-sicherheitskritischen Incidents von X.509-Personen- und Organisationszertifikaten"),

    TIP1_A_3888("TIP1-A_3888", "Zertifikatsstatusinformationen der Personen- und Organisationszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4230("TIP1-A_4230", "Datenschutzgerechte Antrags- und Sperrprozesse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4231("TIP1-A_4231", "Löschung gespeicherter X.509-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4232("TIP1-A_4232", "Löschung von TSP-X.509 nonQESZertifikatstatusinformationen, Zertifikats- und Sperranträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4234("TIP1-A_4234", "Protokollierung von OCSP-Anfragen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4235("TIP1-A_4235", "Fehlerprotokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4427("TIP1-A_4427", "Betrieb einer Test-TSP-X.509"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4428("TIP1-A_4428", "Registrierung eines Test-TSP-X.509"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5087("TIP1-A_5087", "Berücksichtigung und Umsetzung übergeordneter Herausgeberpolicies"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5376("TIP1-A_5376", "Erreichbarkeit des Sperrdienstes von TSP-X.509 nonQES und gematik Root-CA"),

    ;

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

    private final String afoID;

    @Override
    public String getAfoId() {
        assert nonNull(this.afoID) : "Class invariant violation!";
        assert !this.afoID.isEmpty() : "Class invariant violation!";

        return this.afoID;
    }

    private final String title;

    @Override
    public String getLabel() {
        assert nonNull(this.title) : "Class invariant violation!";
        assert !this.title.isEmpty() : "Class invariant violation!";

        return this.title;
    }

    private final AFOType level;

    @Override
    public AFOType getType() {
        assert nonNull(this.level) : "Class invariant violation!";

        return this.level;
    }

}
