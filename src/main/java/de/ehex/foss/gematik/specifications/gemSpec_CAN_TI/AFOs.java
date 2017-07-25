package de.ehex.foss.gematik.specifications.gemSpec_CAN_TI;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_CAN_TI]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5115("GS-A_5115", "Schutzbedarf der CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5116("GS-A_5116", "Zufällige CAN-Erzeugung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5117("GS-A_5117", "Anforderungen an Zufallsgenerator für CAN-Erzeugung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5118("GS-A_5118", "CAN-Speicherung nur für die Personalisierung der Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5119("GS-A_5119", "Sicherer Transport und Speicherung der CAN beim Kartenherausgeber bzw. Kartenpersonalisierer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5120("GS-A_5120", "Verteilung der CAN auf das erforderliche Maß beschränken"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5121("GS-A_5121", "Karteninhaber über Umgang mit CAN informieren"),

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