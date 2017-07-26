package de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_gSMC_KT_ObjSys]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 *
 * @deprecated WTF! Gematik publishes AFOs multiple times within the same release! This AFO source should be removed in
 *             favor of {@link de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs};
 */
@Deprecated
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2469("Card-G2-A_2469_DOUBLET", "K_Initialisierung: Änderung von Zugriffsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2470("Card-G2-A_2470_DOUBLET", "K_Initialisierung: Verwendung von SE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2472("Card-G2-A_2472_DOUBLET", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2473("Card-G2-A_2473_DOUBLET", "K_Initialisierung: SFID nicht vorhanden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2474("Card-G2-A_2474_DOUBLET", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2475("Card-G2-A_2475_DOUBLET", "K_Initialisierung: Anzahl logischer Kanäle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2476("Card-G2-A_2476_DOUBLET", "K_Terminal: Ausschluss kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2477("Card-G2-A_2477_DOUBLET", "K_Personalisierung: weitere Applikationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2478("Card-G2-A_2478_DOUBLET", "K_Personalisierung: Zusätzliche Objekte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2479("Card-G2-A_2479_DOUBLET", "K_Personalisierung. Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2481("Card-G2-A_2481_DOUBLET", "K_Personalisierung und K_Initialisierung: ATR-Kodierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2482("Card-G2-A_2482_DOUBLET", "K_Personalisierung und K_Initialisierung: TC1-Byte in ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2483("Card-G2-A_2483_DOUBLET", "K_Personalisierung und K_Initialisierung: Vorgaben für Historical Bytes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2487("Card-G2-A_2487_DOUBLET", "Initialisierung: Initialisierte von MF"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2488("Card-G2-A_2488_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2496("Card-G2-A_2496_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_SMC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2497("Card-G2-A_2497_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_SMC.CS.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2500("Card-G2-A_2500_DOUBLET", "K_Personalisierung: Festlegung von CHR für EF.C.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2501("Card-G2-A_2501_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2502("Card-G2-A_2502_DOUBLET", "K_Personalisierung: Festlegung von CHR für EF.C.SMC.AUTD_RPS_CVC.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2503("Card-G2-A_2503_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTD_RPS_CVC.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2504("Card-G2-A_2504_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2506("Card-G2-A_2506_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2507("Card-G2-A_2507_DOUBLET", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2509("Card-G2-A_2509_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2511("Card-G2-A_2511_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2512("Card-G2-A_2512_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTD_RPS_CVC.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2514("Card-G2-A_2514_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2518("Card-G2-A_2518_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2519("Card-G2-A_2519_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2522("Card-G2-A_2522_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2523("Card-G2-A_2523_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / EF.C.SMKT.CA.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2524("Card-G2-A_2524_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / EF.C.SMKT.CA.XXXX (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2526("Card-G2-A_2526_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / EF.C.SMKT.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2527("Card-G2-A_2527_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / EF.C.SMKT.AUT.XXXX (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2529("Card-G2-A_2529_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2530("Card-G2-A_2530_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.R3072 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2531("Card-G2-A_2531_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2849("Card-G2-A_2849_DOUBLET", "K_Personalisierung und K_Initialisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2876("Card-G2-A_2876_DOUBLET", "K_gSMC-KT: Kryptobox"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2877("Card-G2-A_2877_DOUBLET", "K_gSMC-KT: Vorhandensein einer USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3019("Card-G2-A_3019_DOUBLET", "Vorgaben für die Option_lange_Lebensdauer_im_Feld"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3026("Card-G2-A_3026_DOUBLET", "K_gSMC-KT: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3027("Card-G2-A_3027_DOUBLET", "K_Personalisierung und K_Initialisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3028("Card-G2-A_3028_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3194("Card-G2-A_3194_DOUBLET", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3195("Card-G2-A_3195_DOUBLET", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3196("Card-G2-A_3196_DOUBLET", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3197("Card-G2-A_3197_DOUBLET", "K_Initialisierung: Größe persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3269("Card-G2-A_3269_DOUBLET", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3273("Card-G2-A_3273_DOUBLET", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3274("Card-G2-A_3274_DOUBLET", "K_Personalisierung und K_Initialisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3275("Card-G2-A_3275_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3276("Card-G2-A_3276_DOUBLET", "K_Initialisierung und K_Personalisierung: Abweichung von Festlegungen zum Zwecke der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3453("Card-G2-A_3453_DOUBLET", "K_Initialisierung: Attribute von MF / EF.KeyInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3455("Card-G2-A_3455_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_SMC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3456("Card-G2-A_3456_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3457("Card-G2-A_3457_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3458("Card-G2-A_3458_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3459("Card-G2-A_3459_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3460("Card-G2-A_3460_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3461("Card-G2-A_3461_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3462("Card-G2-A_3462_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3463("Card-G2-A_3463_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3464("Card-G2-A_3464_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3465("Card-G2-A_3465_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.KT / EF.C.SMKT.CA.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3466("Card-G2-A_3466_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.KT / EF.C.SMKT.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3467("Card-G2-A_3467_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3468("Card-G2-A_3468_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT2.R2048 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3469("Card-G2-A_3469_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.E256 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3471("Card-G2-A_3471_DOUBLET", "K_Initialisierung: Initialisiertes Attribut numberOfOctet von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3473("Card-G2-A_3473_DOUBLET", "K_gSMC-KT: Option_PACE_PCD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3515("Card-G2-A_3515_DOUBLET", "K_Personalisierung: personalisierter Wert von pointInTime"),

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