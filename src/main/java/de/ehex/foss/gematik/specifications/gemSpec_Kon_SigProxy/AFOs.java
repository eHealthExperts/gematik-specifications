package de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Kon_SigProxy]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4631("TIP1-A_4631", "SigProxy: Bereitstellung der Anzeige"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4634("TIP1-A_4634", "SigProxy: Verbindung zwischen Konnektor und Signaturproxy"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4650("TIP1-A_4650", "SigProxy: TUC_SIG_153 “Dokumentenliste im Signaturproxy anzeigen”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4656("TIP1-A_4656", "SigProxy: Anzeige der Parameter bei QES-Signaturerstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4657("TIP1-A_4657", "SigProxy: Anzeige der Vertrauenswürdigkeit von Signaturalgorithmen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4658("TIP1-A_4658", "SigProxy: Anzeige und Deselektion von Daten bei Stapelsignatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4659("TIP1-A_4659", "SigProxy: Fortschrittsanzeige bei Stapelsignatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4660("TIP1-A_4660", "SigProxy: Reihenfolge der Dokumente bei Stapelsignatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4661("TIP1-A_4661", "SigProxy: Kennzeichnung unterschiedlicher Dokumententypen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4662("TIP1-A_4662", "SigProxy: Bestätigungsmodus: Warten auf Freigabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4663("TIP1-A_4663", "SigProxy: Bestätigungsmodus: Möglichkeit zum Abbruch geben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4664("TIP1-A_4664", "SigProxy: Ansichtsmodus: Allein die PIN-Eingabe am Kartenterminal ist maßgeblich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4665("TIP1-A_4665", "SigProxy: Ansichtsmodus: Muss darin verbleiben wenn alles anzeigbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4666("TIP1-A_4666", "SigProxy: Ansichtsmodus: Muss in Bestätigungsmodus umschalten wenn nicht alles anzeigbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4668("TIP1-A_4668", "SigProxy: Bestätigung von Fehlern durch die Benutzer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4673("TIP1-A_4673", "SigProxy: Anzeige der Parameter bei Signaturprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5150("TIP1-A_5150", "SigProxy: Anzeige definierter Dokumentenformate im Signaturproxy"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5404("TIP1-A_5404", "SigProxy: Anzeige Kurztext bei Signaturerstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5405("TIP1-A_5405", "SigProxy: Anzeige Kurztext bei Signaturprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5531("TIP1-A_5531", "SigProxy: PDF-Anzeige von XML-Dokumenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5532("TIP1-A_5532", "SigProxy: HTML/CSS-Anzeige von XML-Dokumenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5668("TIP1-A_5668", "SigProxy: Durchreichen von Contextparametern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5669("TIP1-A_5669", "SigProxy: Interface für Operationen des Signaturproxy"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5670("TIP1-A_5670", "SigProxy: Information zur Anbindung Signaturproxy"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5671("TIP1-A_5671", "SigProxy: Abbruchmöglichkeit bei Stapelsignaturverarbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5672("TIP1-A_5672", "SigProxy: Basisdienst Dienstverzeichnisdienst (nonQES und QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5673("TIP1-A_5673", "SigProxy: TUC_SIG_192 'Dokumentenvalidierung'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5674("TIP1-A_5674", "SigProxy: Operation SignDocument (nonQES und QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5675("TIP1-A_5675", "SigProxy: Operation VerifyDocument (nonQES und QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5676("TIP1-A_5676", "SigProxy: Bereitstellen des Dienstverzeichnisdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5677("TIP1-A_5677", "SigProxy: Protokollierung personenbezogener und medizinischer Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5678("TIP1-A_5678", "SigProxy: Keine Protokollierung vertraulicher Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5679("TIP1-A_5679", "SigProxy: Starten des Signaturproxy in einer Terminal-Server-Umgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5680("TIP1-A_5680", "SigProxy: Löschen von Anzeigen nach Zeitablauf"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5681("TIP1-A_5681", "SigProxy: Löschen von Anzeigen durch Benutzerinteraktion"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5683("TIP1-A_5683", "SigProxy: Anzeige der Jobnummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5684("TIP1-A_5684", "SigProxy: SOAP-Faults melden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5685("TIP1-A_5685", "SigProxy: Softwareergonomie"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5686("TIP1-A_5686", "SigProxy: Keine Transportsicherung am Signaturproxyinterface"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5687("TIP1-A_5687", "SigProxy: Unterstützte Versionen bei PDF-Anzeige von XML-Dokumenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5688("TIP1-A_5688", "SigProxy: XSL-FO bei PDF-Anzeige von XML-Dokumenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5689("TIP1-A_5689", "SigProxy: Stylesheets bei HTML/CSS-Anzeige von XML-Dokumenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5690("TIP1-A_5690", "SigProxy: Basisdienst Signaturdienst (nonQES und QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5691("TIP1-A_5691", "SigProxy: Protokollierung spezifizierter Fehler"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5692("TIP1-A_5692", "SigProxy: Installation des Signaturproxy"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5693("TIP1-A_5693", "SigProxy: Vertrauensankerwechsel für TLS-Verbindungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5695("TIP1-A_5695", "SigProxy: SOAP Message Transmission Optimization Mechanism"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5699("TIP1-A_5699", "SigProxy: TUC_SIG_193 “Anzeigbarkeit des Dokuments prüfen und herstellen”"),

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