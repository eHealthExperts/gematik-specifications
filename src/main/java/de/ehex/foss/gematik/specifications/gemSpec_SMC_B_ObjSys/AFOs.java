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
 *
 * @deprecated WTF! Gematik publishes AFOs multiple times within the same release! This AFO source should be removed in
 *             favor of {@link de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs};
 */
@Deprecated
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2134("Card-G2-A_2134_DOUBLET", "K_Initialisierung: Änderung von Zugriffsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2135("Card-G2-A_2135_DOUBLET", "K_Initialisierung: Verwendung von SE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2136("Card-G2-A_2136_DOUBLET", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2137("Card-G2-A_2137_DOUBLET", "K_Initialisierung: Dateiattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2138("Card-G2-A_2138_DOUBLET", "K_Terminal: Ausschluss kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2139("Card-G2-A_2139_DOUBLET", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2140("Card-G2-A_2140_DOUBLET", "K_Initialisierung und K_Personalisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2141("Card-G2-A_2141_DOUBLET", "K_Personalisierung: Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2142("Card-G2-A_2142_DOUBLET", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2143("Card-G2-A_2143_DOUBLET", "K_Initialisierung und K_Personalisierung: Kompatibilität zu G1-Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2146("Card-G2-A_2146_DOUBLET", "K_Initialisierung: Initialisierte: Attribute von MF"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2147("Card-G2-A_2147_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2154("Card-G2-A_2154_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2156("Card-G2-A_2156_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2157("Card-G2-A_2157_DOUBLET", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2158("Card-G2-A_2158_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2159("Card-G2-A_2159_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_SMC.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2160("Card-G2-A_2160_DOUBLET", "K_Initialisierung: Initialisierte Attribute MF / EF.C.CA_SMC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2162("Card-G2-A_2162_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2163("Card-G2-A_2163_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2169("Card-G2-A_2169_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2171("Card-G2-A_2171_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PIN.SMC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2172("Card-G2-A_2172_DOUBLET", "K_Personalisierung: Länge der PUK für der SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2173("Card-G2-A_2173_DOUBLET", "K_Initialisierung: Freischaltung der SMC-B einer Institution (PrK.SMC.AUTR_CVC.R2048)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2176("Card-G2-A_2176_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2177("Card-G2-A_2177_DOUBLET", "K_Initialisierung: Freischaltung der SMC-B einer Institution (PrK.SMC.AUTR_CVC.E256)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2180("Card-G2-A_2180_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2189("Card-G2-A_2189_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2191("Card-G2-A_2191_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2192("Card-G2-A_2192_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2194("Card-G2-A_2194_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2195("Card-G2-A_2195_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2196("Card-G2-A_2196_DOUBLET", "K_Initialisierung: Anzahl logischer Kanäle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2197("Card-G2-A_2197_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2198("Card-G2-A_2198_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA / EF.SMD @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2199("Card-G2-A_2199_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA / EF.CONF @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2200("Card-G2-A_2200_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA / EF.NET @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2201("Card-G2-A_2201_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.SMA / PIN.CONF @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2203("Card-G2-A_2203_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2204("Card-G2-A_2204_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HCI.OSIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2207("Card-G2-A_2207_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HCI.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2210("Card-G2-A_2210_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HCI.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2217("Card-G2-A_2217_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HCI.OSIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2220("Card-G2-A_2220_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HCI.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2223("Card-G2-A_2223_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HCI.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2668("Card-G2-A_2668_DOUBLET", "K_Initialisierung und K_Personalisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2669("Card-G2-A_2669_DOUBLET", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3035("Card-G2-A_3035_DOUBLET", "Absicherung der Kartenadministration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3036("Card-G2-A_3036_DOUBLET", "K_SMC-B: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3037("Card-G2-A_3037_DOUBLET", "K_SMC-B: Vorhandensein einer USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3039("Card-G2-A_3039_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3187("Card-G2-A_3187_DOUBLET", "K_Initialisierung: Größe persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3188("Card-G2-A_3188_DOUBLET", "K_SMC-B: Vorhandensein Option_Kryptobox"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3189("Card-G2-A_3189_DOUBLET", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3190("Card-G2-A_3190_DOUBLET", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3267("Card-G2-A_3267_DOUBLET", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3340("Card-G2-A_3340_DOUBLET", "K_Initialisierung und K_Personalisierung: ATR-Kodierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3341("Card-G2-A_3341_DOUBLET", "K_Initialisierung und K_Personalisierung: TC1 Byte im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3342("Card-G2-A_3342_DOUBLET", "K_Initialisierung und K_Personalisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3343("Card-G2-A_3343_DOUBLET", "K_Initialisierung und K_Personalisierung: Vorgaben für Historical Bytes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3344("Card-G2-A_3344_DOUBLET", "K_Initialisierung: Initialisiertes Attribut numberOfOctet von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3346("Card-G2-A_3346_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_SMC.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3347("Card-G2-A_3347_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_SMC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3348("Card-G2-A_3348_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3349("Card-G2-A_3349_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3350("Card-G2-A_3350_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3351("Card-G2-A_3351_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PIN.SMC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3352("Card-G2-A_3352_DOUBLET", "K_Initialisierung: Freischaltung für PrK.SMC.AUTR_CVC.R2048 der SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3353("Card-G2-A_3353_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3354("Card-G2-A_3354_DOUBLET", "K_Initialisierung: Freischaltung für PrK.SMC.AUTR_CVC.E256 der SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3355("Card-G2-A_3355_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3356("Card-G2-A_3356_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3357("Card-G2-A_3357_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3358("Card-G2-A_3358_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3359("Card-G2-A_3359_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3360("Card-G2-A_3360_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3361("Card-G2-A_3361_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3362("Card-G2-A_3362_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3363("Card-G2-A_3363_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3365("Card-G2-A_3365_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HCI.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3366("Card-G2-A_3366_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HCI.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3367("Card-G2-A_3367_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HCI.OSIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3368("Card-G2-A_3368_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HCI.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3369("Card-G2-A_3369_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HCI.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3371("Card-G2-A_3371_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HCI.OSIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3373("Card-G2-A_3373_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.R2048 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3374("Card-G2-A_3374_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3375("Card-G2-A_3375_DOUBLET", "K_Initialisierung und K_Personalisierung: Abweichung von Festlegungen zum Zwecke der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3388("Card-G2-A_3388_DOUBLET", "K_Personalisierung: Festlegung von CHR in MF / EF.C.SMC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3389("Card-G2-A_3389_DOUBLET", "K_Personalisierung: Festlegung von CHR in MF / EF.C.SMC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3390("Card-G2-A_3390_DOUBLET", "K_Personalisierung: Festlegung von CHR in MF / EF.C.SMC.AUTD_RPE_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3472("Card-G2-A_3472_DOUBLET", "K_Personalisierung: personalisierter Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3524("Card-G2-A_3524_DOUBLET", "K_Personalisierung: Schlüsselgenerierung auf der Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3587("Card-G2-A_3587_DOUBLET", "K_Personalisierung: Keine Personalisierung der PIN.Conf @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3588("Card-G2-A_3588_DOUBLET", "Symmetrische Kartenadministration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3589("Card-G2-A_3589_DOUBLET", "Schlüsselspeicherung"),

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
