package de.ehex.foss.gematik.specifications.gemKPT_Test;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;
import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemKPT_Test_ORS1]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs
implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2769("TIP1-A_2769", "Kompatibilität und Interoperabilität der Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2781("TIP1-A_2781", "Dauerhafte Verfügbarkeit in der Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6083("TIP1-A_6083", "Anzahl der Fachdienste als Referenzobjekte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6519("TIP1-A_6519", "Eigenverantwortlicher Test: Hersteller und Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6523("TIP1-A_6523", "Zulassungstest: Hersteller und Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6526("TIP1-A_6526", "Produkttypen: Bereitstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6527("TIP1-A_6527", "Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2812("VSDM-A_2812", "Bereitstellung Testkartensätze"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2814("VSDM-A_2814", "Eindeutigkeit der Testkartenschlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2815("VSDM-A_2815", "Berücksichtigung von Vorgaben zur Schlüsselerzeugung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2826("VSDM-A_2826", "Bereitstellen datumsbasierter VSD-Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2825("VSDM-A_2825", "Bereitstellen von VSD-Updates"),

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

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6532("TIP1-A_6532", "Zulassung eines neuen Produkts: Aufgaben der TDI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6533("TIP1-A_6533", "Zulassung eines neuen Produkts: Aufgaben der Hersteller und Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6536("TIP1-A_6536", "Zulassung eines geänderten Produkts: Aufgaben der TDI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6537("TIP1-A_6537", "Zulassung eines geänderten Produkts: Aufgaben der Hersteller"),

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
