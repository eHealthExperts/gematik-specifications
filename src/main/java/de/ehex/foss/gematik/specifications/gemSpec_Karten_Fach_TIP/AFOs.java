package de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Karten_Fach_TIP]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3479("Card-G2-A_3479", "Kodierung von Versionskennungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3480("Card-G2-A_3480", "Kodierung von Produktidentifikatoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3481("Card-G2-A_3481", "Ausschluss für die Kodierung von Produktidentifikatoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3482("Card-G2-A_3482", "K_Initialisierung: Speicherstruktur für EF.Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3483("Card-G2-A_3483", "K_Initialisierung: Inhalt body von EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3484("Card-G2-A_3484", "K_Initialisierung: Reihenfolge der Datenobjekte in body von EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3485("Card-G2-A_3485", "K_Initialisierung: Datenobjekte in EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3486("Card-G2-A_3486", "K_Initialisierung: DO_BufferSize in EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3487("Card-G2-A_3487", "K_Initialisierung und K_Personalisierung: DO_HistoricalBytes in EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3488("Card-G2-A_3488", "K_Initialisierung: DO_PT_COS in EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3489("Card-G2-A_3489", "K_Initialisierung: DO_PI_CHIP in EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3490("Card-G2-A_3490", "K_Initialisierung: DO_PI_COS in EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3491("Card-G2-A_3491", "K_Initialisierung: DO_PI_InitialisiertesObjSys in EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3492("Card-G2-A_3492", "K_Personalisierung: DO_PT_Pers in EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3493("Card-G2-A_3493", "K_Initialisierung DO_PI_Kartenkörper in EF.ATR-Initialisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3494("Card-G2-A_3494", "K_Personalisierung: DO_PI_Kartenkörper in EF.ATR-Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3495("Card-G2-A_3495", "K_Personalisierung: DO_PI_Personalisierung in EF.ATR-Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3496("Card-G2-A_3496", "K_Initialisierung: Weitere Datenobjekte in DO_HistoricalBytes in EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3497("Card-G2-A_3497", "K_Personalisierung: Vollständige Befüllung von EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3498("Card-G2-A_3498", "K_Personalisierung: DO_ICCSN in EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3499("Card-G2-A_3499", "K_Initialisierung: Speicherstruktur für EF.KeyInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3501("Card-G2-A_3501", "K_Initialisierung: Kodierung der Kryptosysteme in EF.KeyInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3502("Card-G2-A_3502", "K_Initialisierung: Initiale Belegung von EF.KeyInfo für die gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3503("Card-G2-A_3503", "K_ Initialisierung: Kennungen von EF.KeyInfo für die gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3504("Card-G2-A_3504", "K_Initialisierung: Initiale Belegung von EF.KeyInfo für die gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3505("Card-G2-A_3505", "K_ Initialisierung: Kennungen von EF.KeyInfo für die gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3507("Card-G2-A_3507", "K_Personalisierung Versionierung Inhalte von EF.EnvironmentSettings"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3509("Card-G2-A_3509", "K_Personalisierung Inhalt von EF.EnvironmentSettings"),

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