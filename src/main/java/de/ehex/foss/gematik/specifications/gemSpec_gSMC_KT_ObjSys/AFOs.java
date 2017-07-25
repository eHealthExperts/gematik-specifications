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
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2469("Card-G2-A_2469", "K_Initialisierung: Änderung von Zugriffsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2470("Card-G2-A_2470", "K_Initialisierung: Verwendung von SE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2472("Card-G2-A_2472", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2473("Card-G2-A_2473", "K_Initialisierung: SFID nicht vorhanden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2474("Card-G2-A_2474", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2475("Card-G2-A_2475", "K_Initialisierung: Anzahl logischer Kanäle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2476("Card-G2-A_2476", "K_Terminal: Ausschluss kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2477("Card-G2-A_2477", "K_Personalisierung: weitere Applikationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2478("Card-G2-A_2478", "K_Personalisierung: Zusätzliche Objekte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2479("Card-G2-A_2479", "K_Personalisierung. Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2481("Card-G2-A_2481", "K_Personalisierung und K_Initialisierung: ATR-Kodierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2482("Card-G2-A_2482", "K_Personalisierung und K_Initialisierung: TC1-Byte in ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2483("Card-G2-A_2483", "K_Personalisierung und K_Initialisierung: Vorgaben für Historical Bytes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2487("Card-G2-A_2487", "Initialisierung: Initialisierte von MF"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2488("Card-G2-A_2488", "K_Initialisierung: Initialisierte Attribute von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2496("Card-G2-A_2496", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_SMC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2497("Card-G2-A_2497", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_SMC.CS.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2500("Card-G2-A_2500", "K_Personalisierung: Festlegung von CHR für EF.C.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2501("Card-G2-A_2501", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2502("Card-G2-A_2502", "K_Personalisierung: Festlegung von CHR für EF.C.SMC.AUTD_RPS_CVC.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2503("Card-G2-A_2503", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTD_RPS_CVC.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2504("Card-G2-A_2504", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2506("Card-G2-A_2506", "K_Initialisierung: Initialisierte Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2507("Card-G2-A_2507", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2509("Card-G2-A_2509", "K_Initialisierung: Initialisierte Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2511("Card-G2-A_2511", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2512("Card-G2-A_2512", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTD_RPS_CVC.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2514("Card-G2-A_2514", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2518("Card-G2-A_2518", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2519("Card-G2-A_2519", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2522("Card-G2-A_2522", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2523("Card-G2-A_2523", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / EF.C.SMKT.CA.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2524("Card-G2-A_2524", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / EF.C.SMKT.CA.XXXX (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2526("Card-G2-A_2526", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / EF.C.SMKT.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2527("Card-G2-A_2527", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / EF.C.SMKT.AUT.XXXX (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2529("Card-G2-A_2529", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2530("Card-G2-A_2530", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.R3072 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2531("Card-G2-A_2531", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.E384 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2849("Card-G2-A_2849", "K_Personalisierung und K_Initialisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2876("Card-G2-A_2876", "K_gSMC-KT: Kryptobox"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2877("Card-G2-A_2877", "K_gSMC-KT: Vorhandensein einer USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3019("Card-G2-A_3019", "Vorgaben für die Option_lange_Lebensdauer_im_Feld"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3026("Card-G2-A_3026", "K_gSMC-KT: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3027("Card-G2-A_3027", "K_Personalisierung und K_Initialisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3028("Card-G2-A_3028", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3194("Card-G2-A_3194", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3195("Card-G2-A_3195", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3196("Card-G2-A_3196", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3197("Card-G2-A_3197", "K_Initialisierung: Größe persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3269("Card-G2-A_3269", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3273("Card-G2-A_3273", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3274("Card-G2-A_3274", "K_Personalisierung und K_Initialisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3275("Card-G2-A_3275", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3276("Card-G2-A_3276", "K_Initialisierung und K_Personalisierung: Abweichung von Festlegungen zum Zwecke der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3453("Card-G2-A_3453", "K_Initialisierung: Attribute von MF / EF.KeyInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3455("Card-G2-A_3455", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_SMC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3456("Card-G2-A_3456", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3457("Card-G2-A_3457", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SMC.AUTD_RPS_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3458("Card-G2-A_3458", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3459("Card-G2-A_3459", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3460("Card-G2-A_3460", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3461("Card-G2-A_3461", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3462("Card-G2-A_3462", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3463("Card-G2-A_3463", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3464("Card-G2-A_3464", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3465("Card-G2-A_3465", "K_Personalisierung: Personalisierte Attribute von MF / DF.KT / EF.C.SMKT.CA.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3466("Card-G2-A_3466", "K_Personalisierung: Personalisierte Attribute von MF / DF.KT / EF.C.SMKT.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3467("Card-G2-A_3467", "K_Personalisierung: Personalisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3468("Card-G2-A_3468", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT2.R2048 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3469("Card-G2-A_3469", "K_Initialisierung: Initialisierte Attribute von MF / DF.KT / PrK.SMKT.AUT.E256 (Option_lange_Lebensdauer_im_Feld)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3471("Card-G2-A_3471", "K_Initialisierung: Initialisiertes Attribut numberOfOctet von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3473("Card-G2-A_3473", "K_gSMC-KT: Option_PACE_PCD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3515("Card-G2-A_3515", "K_Personalisierung: personalisierter Wert von pointInTime"),

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