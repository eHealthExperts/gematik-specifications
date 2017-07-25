package de.ehex.foss.gematik.specifications.gemSpec_VZD;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_VZD]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5566("TIP1-A_5566", "LDAP Client, StartTLS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5568("TIP1-A_5568", "VZD und LDAP Client, Implementierung der LDAPv3 search Operation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5570("TIP1-A_5570", "LDAP Client, TUC_VZD_0001 \"search_Directory\""),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5588("TIP1-A_5588", "FAD, I_Directory_Application_Maintenance, Nutzung LDAP v3 oder Webservice"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5589("TIP1-A_5589", "FAD, Implementierung der LDAPv3 Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5591("TIP1-A_5591", "FAD,  TUC_VZD_0006 “add_Directory_FA-Attributes (SOAP)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5592("TIP1-A_5592", "FAD, KOM-LE_FA_Add_Attributes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5594("TIP1-A_5594", "FAD, TUC_VZD_0007 “add_Directory_FA-Attributes (LDAPv3)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5596("TIP1-A_5596", "FAD,  TUC_VZD_0008 “delete_Directory_FA-Attributes (SOAP)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5598("TIP1-A_5598", "FAD, TUC_VZD_0009 “delete_Directory_FA-Attributes (LDAPv3)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5600("TIP1-A_5600", "FAD,  TUC_VZD_0010 “modify_Directory_FA-Attributes (SOAP)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5601("TIP1-A_5601", "FAD, KOM-LE_FA_Modify_Attributes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5603("TIP1-A_5603", "FAD, TUC_VZD_0011 “modify_Directory_FA-Attributes (LDAPv3)”"),

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
