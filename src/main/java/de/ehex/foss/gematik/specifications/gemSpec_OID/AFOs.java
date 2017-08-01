package de.ehex.foss.gematik.specifications.gemSpec_OID;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_OID]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4442("GS-A_4442", "OID-Festlegung Rolle für Berufsgruppen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4443("GS-A_4443", "OID-Festlegung für Institutionen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4444("GS-A_4444", "OID-Festlegung für Certificate Policies"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4445("GS-A_4445", "OID-Festlegung für Zertifikatstypen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4446("GS-A_4446", "OID-Festlegung für technische Rollen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4447("GS-A_4447", "OID-Festlegung für Feldbezeichnungen in der TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5082("GS-A_5082", "OID-Festlegung für Flaglisten bei CV-Zertifikaten der Kartengeneration 2"),

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
