package de.ehex.foss.gematik.specifications.gemSpec_Kon;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Kon]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4514("TIP1-A_4514", "Verfügbarkeit einer TLS Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4515("TIP1-A_4515", "Verpflichtung zur Nutzung der TLS-Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4518("TIP1-A_4518", "Konfiguration der Anbindung Clientsysteme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4689("TIP1-A_4689", "Caching von OCSP-Antworten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4693("TIP1-A_4693", "TUC_KON_032 \"TSL aktualisieren\""),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4696("TIP1-A_4696", "TUC_KON_037 \"Zertifikat prüfen\""),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4812("TIP1-A_4812", "Anzeige der Versionsinformationen (Selbstauskunft)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5401("TIP1-A_5401", "Parallele Nutzbarkeit Clientsystemschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5516("TIP1-A_5516", "LDAP-Proxy reagiert auf Veränderung LU_ONLINE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5517("TIP1-A_5517", "Konnektor, TUC_KON_290 \"LDAP-Verbindung aufbauen\""),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5518("TIP1-A_5518", "Konnektor, TUC_KON_290 \"Verzeichnis abfragen\""),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5519("TIP1-A_5519", "Konnektor, TUC_KON_292 \"LDAP-Verbindung trennen\""),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5520("TIP1-A_5520", "Konnektor, TUC_KON_293 \"Verzeichnisabfrage abbrechen\""),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5521("TIP1-A_5521", "Konnektor, LDAPv3 Operationen"),

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
