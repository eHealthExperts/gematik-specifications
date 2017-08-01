package de.ehex.foss.gematik.specifications.gemKPT_Test;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemKPT_Test]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */

public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2781("TIP1-A_2781", "Dauerhafte Verfügbarkeit in der Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2805("TIP1-A_2805", "Zeitnahe Anpassung von Produktkonfigurationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4929("TIP1-A_4929", "Nachweis über Qualität der Zufallszahlen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6083("TIP1-A_6083", "Anzahl der Fachdienste als Referenzobjekte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6086("TIP1-A_6086", "Unterstützung bei Anbindung eines Produktes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6087("TIP1-A_6087", "Zugang zur Adminschnittstelle bei dezentralen Produkten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6516("TIP1-A_6516", "Eigenverantwortlicher Test: Test & Transitionmanager"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6517("TIP1-A_6517", "Eigenverantwortlicher Test: TBV"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6518("TIP1-A_6518", "Eigenverantwortlicher Test: TDI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6519("TIP1-A_6519", "Eigenverantwortlicher Test: Hersteller und Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6523("TIP1-A_6523", "Zulassungstest: Hersteller und Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6524("TIP1-A_6524", "Testdokumentation gemäß Vorlagen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6525("TIP1-A_6525", "Produkttypen: Testziele"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6526("TIP1-A_6526", "Produkttypen: Bereitstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6527("TIP1-A_6527", "Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6529("TIP1-A_6529", "Produkttypen: Mindestumfang der Interoperabilitätsprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6531("TIP1-A_6531", "Zulassung eines neuen Produkts: Aufgaben des TBV"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6532("TIP1-A_6532", "Zulassung eines neuen Produkts: Aufgaben der TDI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6533("TIP1-A_6533", "Zulassung eines neuen Produkts: Aufgaben der Hersteller und Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6535("TIP1-A_6535", "Zulassung eines geänderten Produkts: Aufgaben des TBV"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6536("TIP1-A_6536", "Zulassung eines geänderten Produkts: Aufgaben der TDI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6537("TIP1-A_6537", "Zulassung eines geänderten Produkts: Aufgaben der Hersteller und Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6538("TIP1-A_6538", "Durchführung von Produkttests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6539("TIP1-A_6539", "Durchführung von Produktübergreifenden Tests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6772("TIP1-A_6772", "Partnerprodukte bei Interoperabilitätstests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2812("VSDM-A_2812", "Bereitstellung Testkartensätze"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2814("VSDM-A_2814", "Eindeutigkeit der Testkartenschlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2815("VSDM-A_2815", "Berücksichtigung von Vorgaben zur Schlüsselerzeugung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2825("VSDM-A_2825", "Bereitstellen von VSD-Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2826("VSDM-A_2826", "Bereitstellen datumsbasierter VSD-Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2830("VSDM-A_2830", "Integration multipler Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2831("VSDM-A_2831", "Verwendung von Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2832("VSDM-A_2832", "Umsetzung des Flip/Flop-Verfahrens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3029("VSDM-A_3029", "Bereitstellung von Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3030("VSDM-A_3030", "Bereitstellung von spezifikationsabweichende Testkarten"),

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
