package de.ehex.foss.gematik.specifications.gemSpec_OM;

import static de.ehex.foss.gematik.specifications.AFOType.MAY;
import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static de.ehex.foss.gematik.specifications.AFOType.SHOULD;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_OM]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    GS_A_3695("GS-A_3695", "Grundlegender Aufbau Versionsnummern"),

    GS_A_3696("GS-A_3696", "Zeitpunkt der Erzeugung neuer Versionsnummern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3697("GS-A_3697", "Anlass der Erhöhung von Versionsnummern"),

    GS_A_3702("GS-A_3702", "Inhalt der Selbstauskunft von Produkten außer Karten"),

    GS_A_3796("GS-A_3796", "Transport Fehlermeldungen als gematik-SOAP-Fault"),

    GS_A_3801("GS-A_3801", "Abbildung von Fehlern auf Transportprotokollebene", SHOULD),

    GS_A_3804("GS-A_3804", "Eigenschaften eines FehlerLog-Eintrags"),

    GS_A_3805("GS-A_3805", "Loglevel zur Bezeichnung der Granularität FehlerLog", SHOULD),

    GS_A_3806("GS-A_3806", "Loglevel in der Referenz- und Testumgebung", MAY),

    GS_A_3807("GS-A_3807", "Fehlerspeicherung ereignisgesteuerter Nachrichtenverarbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3813("GS-A_3813", "Datenschutzvorgaben Fehlermeldungen"),

    GS_A_3816("GS-A_3816", "Festlegung sicherheitsrelevanter Fehler"),

    GS_A_3856("GS-A_3856", "Struktur der Fehlermeldungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4541("GS-A_4541", "Nutzung der Produkttypversion zur Kompatibilitätsprüfung"),

    GS_A_4543("GS-A_4543", "Rückgabe der Selbstauskunft von zentralen Produkttypen der TI-Plattform und fachanwendungsspezifischen Diensten"),

    GS_A_4545("GS-A_4545", "Kurzform der Selbstauskunft für zentrale Produkttypen der TIPlattform und fachanwendungsspezifische Dienste an die Störungsampel"),

    GS_A_4547("GS-A_4547", "Generische Fehlermeldungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4864("GS-A_4864", "Logging-Vorgaben nach dem Übergang zum Wirkbetrieb"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5018("GS-A_5018", "Sicherheitsrelevanter Fehler an organisatorischen Schnittstellen"),

    GS_A_5025("GS-A_5025", "Versionierung von Produkten auf Basis von zentralen Produkttypen der TI-Plattform und fachanwendungsspezifischen Diensten durch die Produktidentifikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5033("GS-A_5033", "Betriebsdokumentation der zentralen Produkte der TI-Plattform und anwendungsspezifischen Diensten"),

    GS_A_5038("GS-A_5038", "Festlegungen zur Vergabe einer Produktversion"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5039("GS-A_5039", "Änderung der Produktversion bei Änderungen der Produkttypversion"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5040("GS-A_5040", "Änderung der Produktversion bei Produktänderungen außerhalb von Produkttypänderungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5054("GS-A_5054", "Versionierung von Produkten durch die Produktidentifikation erweitert um Klartextnamen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5252("GS-A_5252", "Generische Fehlermeldungen außerhalb von WebServices"),

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
