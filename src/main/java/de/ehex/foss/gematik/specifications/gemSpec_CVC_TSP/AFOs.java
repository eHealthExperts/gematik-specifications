package de.ehex.foss.gematik.specifications.gemSpec_CVC_TSP;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemRL_TSL_SP_CP]}.
 *
 * @author Anastasiya Zuyeva
 * @since October 18th, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2575("TIP1-A_2575", "Zugelassenes Zugriffsprofil im CV-Rollen-Zertifikat"),
    TIP1_A_2576("TIP1-A_2576", "Zugelassenes Zugriffsprofil im CV-Geräte-Zertifikat"),
    TIP1_A_2578("TIP1-A_2578", "Korrekte ICCSN der Chipkarte"),
    TIP1_A_2579("TIP1-A_2579", "Korrekter privater Schlüssel in der Chipkarte"),
    TIP1_A_2586("TIP1-A_2586", "Personalisierung von CV-Zertifikaten für ein Sicherheitsmodul vom Typ B"),
    TIP1_A_2588("TIP1-A_2588", "Personalisierung des öffentlichen Root-Schlüssels"),
    TIP1_A_2589("TIP1-A_2589", "Personalisierung des CVC-CA-Zertifikats"),


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
