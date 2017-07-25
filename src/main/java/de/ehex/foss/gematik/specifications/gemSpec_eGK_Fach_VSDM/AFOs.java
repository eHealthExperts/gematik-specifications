package de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_eGK_Fach_VSDM]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2965("VSDM-A_2965", "Container EF.PD auf eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2966("VSDM-A_2966", "Container EF.VD auf eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2967("VSDM-A_2967", "Container EF.GVD auf eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2968("VSDM-A_2968", "Container EF.Prüfungsnachweis auf eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2970("VSDM-A_2970", "Container EF.StatusVD auf der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2971("VSDM-A_2971", "Nicht zugriffsgeschützte Container VSDM auf der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2972("VSDM-A_2972", "Zugriffsgeschützter Container EF.GVD auf der eGK"),

    VSDM_A_2973("VSDM-A_2973", "Speicherstruktur des Containers EF.PD auf eGK"),

    VSDM_A_2974("VSDM-A_2974", "Speicherstruktur des Containers EF.VD auf eGK"),

    VSDM_A_2975("VSDM-A_2975", "Speicherstruktur des Containers EF.GVD auf eGK"),

    VSDM_A_2976("VSDM-A_2976", "Speicherstruktur des Containers EF.StatusVD auf der eGK"),

    VSDM_A_2994("VSDM-A_2994", "Sichere Übertragung zwischen VSDD und eGK"),

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
