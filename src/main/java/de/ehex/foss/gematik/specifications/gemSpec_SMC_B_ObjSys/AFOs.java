package de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_SMC_B_ObjSys]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2134("Card-G2-A_2134", "K_Initialisierung: Änderung von Zugriffsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2135("Card-G2-A_2135", "K_Initialisierung: Verwendung von SE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2136("Card-G2-A_2136", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2137("Card-G2-A_2137", "K_Initialisierung: Dateiattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2138("Card-G2-A_2138", "K_Terminal: Ausschluss kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2139("Card-G2-A_2139", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2140("Card-G2-A_2140", "K_Initialisierung und K_Personalisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2141("Card-G2-A_2141", "K_Personalisierung: Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2142("Card-G2-A_2142", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2143("Card-G2-A_2143", "K_Initialisierung und K_Personalisierung: Kompatibilität zu G1-Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2146("Card-G2-A_2146", "K_Initialisierung: Initialisierte: Attribute von MF"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2147("Card-G2-A_2147", "K_Initialisierung: Initialisierte Attribute von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2154("Card-G2-A_2154", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2156("Card-G2-A_2156", "K_Initialisierung: Initialisierte Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2157("Card-G2-A_2157", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2158("Card-G2-A_2158", "K_Initialisierung: Initialisierte Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2159("Card-G2-A_2159", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_SMC.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2160("Card-G2-A_2160", "K_Initialisierung: Initialisierte Attribute MF / EF.C.CA_SMC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2162("Card-G2-A_2162", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2163("Card-G2-A_2163", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2169("Card-G2-A_2169", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2171("Card-G2-A_2171", "K_Initialisierung: Initialisierte Attribute von MF / PIN.SMC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2172("Card-G2-A_2172", "K_Personalisierung: Länge der PUK für der SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2173("Card-G2-A_2173", "K_Initialisierung: Freischaltung der SMC-B einer Institution (PrK.SMC.AUTR_CVC.R2048)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2176("Card-G2-A_2176", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2177("Card-G2-A_2177", "K_Initialisierung: Freischaltung der SMC-B einer Institution (PrK.SMC.AUTR_CVC.E256)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2180("Card-G2-A_2180", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2189("Card-G2-A_2189", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2191("Card-G2-A_2191", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2192("Card-G2-A_2192", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2194("Card-G2-A_2194", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2195("Card-G2-A_2195", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2196("Card-G2-A_2196", "K_Initialisierung: Anzahl logischer Kanäle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2197("Card-G2-A_2197", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2198("Card-G2-A_2198", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA / EF.SMD @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2199("Card-G2-A_2199", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA / EF.CONF @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2200("Card-G2-A_2200", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA / EF.NET @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2201("Card-G2-A_2201", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA / PIN.CONF @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2203("Card-G2-A_2203", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2204("Card-G2-A_2204", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HCI.OSIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2207("Card-G2-A_2207", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HCI.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2210("Card-G2-A_2210", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HCI.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2217("Card-G2-A_2217", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HCI.OSIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2220("Card-G2-A_2220", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HCI.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2223("Card-G2-A_2223", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HCI.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2668("Card-G2-A_2668", "K_Initialisierung und K_Personalisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2669("Card-G2-A_2669", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3035("Card-G2-A_3035", "Absicherung der Kartenadministration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3036("Card-G2-A_3036", "K_SMC-B: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3037("Card-G2-A_3037", "K_SMC-B: Vorhandensein einer USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3039("Card-G2-A_3039", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3187("Card-G2-A_3187", "K_Initialisierung: Größe persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3188("Card-G2-A_3188", "K_SMC-B: Vorhandensein Option_Kryptobox"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3189("Card-G2-A_3189", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3190("Card-G2-A_3190", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3267("Card-G2-A_3267", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3340("Card-G2-A_3340", "K_Initialisierung und K_Personalisierung: ATR-Kodierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3341("Card-G2-A_3341", "K_Initialisierung und K_Personalisierung: TC1 Byte im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3342("Card-G2-A_3342", "K_Initialisierung und K_Personalisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3343("Card-G2-A_3343", "K_Initialisierung und K_Personalisierung: Vorgaben für Historical Bytes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3344("Card-G2-A_3344", "K_Initialisierung: Initialisiertes Attribut numberOfOctet von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3346("Card-G2-A_3346", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_SMC.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3347("Card-G2-A_3347", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_SMC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3348("Card-G2-A_3348", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3349("Card-G2-A_3349", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3350("Card-G2-A_3350", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3351("Card-G2-A_3351", "K_Personalisierung: Personalisierte Attribute von MF / PIN.SMC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3352("Card-G2-A_3352", "K_Initialisierung: Freischaltung für PrK.SMC.AUTR_CVC.R2048 der SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3353("Card-G2-A_3353", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3354("Card-G2-A_3354", "K_Initialisierung: Freischaltung für PrK.SMC.AUTR_CVC.E256 der SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3355("Card-G2-A_3355", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3356("Card-G2-A_3356", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3357("Card-G2-A_3357", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3358("Card-G2-A_3358", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3359("Card-G2-A_3359", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3360("Card-G2-A_3360", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3361("Card-G2-A_3361", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3362("Card-G2-A_3362", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3363("Card-G2-A_3363", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3365("Card-G2-A_3365", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HCI.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3366("Card-G2-A_3366", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HCI.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3367("Card-G2-A_3367", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HCI.OSIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3368("Card-G2-A_3368", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HCI.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3369("Card-G2-A_3369", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HCI.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3371("Card-G2-A_3371", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HCI.OSIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3373("Card-G2-A_3373", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.R2048 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3374("Card-G2-A_3374", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3375("Card-G2-A_3375", "K_Initialisierung und K_Personalisierung: Abweichung von Festlegungen zum Zwecke der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3388("Card-G2-A_3388", "K_Personalisierung: Festlegung von CHR in MF / EF.C.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3389("Card-G2-A_3389", "K_Personalisierung: Festlegung von CHR in MF / EF.C.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3390("Card-G2-A_3390", "K_Personalisierung: Festlegung von CHR in MF / EF.C.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3472("Card-G2-A_3472", "K_Personalisierung: personalisierter Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3524("Card-G2-A_3524", "K_Personalisierung: Schlüsselgenerierung auf der Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3587("Card-G2-A_3587", "K_Personalisierung: Keine Personalisierung der PIN.Conf @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3588("Card-G2-A_3588", "Symmetrische Kartenadministration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3589("Card-G2-A_3589", "Schlüsselspeicherung"),

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
