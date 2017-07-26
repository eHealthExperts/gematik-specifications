package de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_HBA_ObjSys]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 *
 * @deprecated WTF! Gematik publishes AFOs multiple times within the same release! This AFO source should be removed in
 *             favor of {@link de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys_G2_1.AFOs};
 */
@Deprecated
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2032("Card-G2-A_2032_DOUBLET", "K_Initialisierung: Änderung von Zugriffsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2033("Card-G2-A_2033_DOUBLET", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2034("Card-G2-A_2034_DOUBLET", "K_Initialisierung: Dateiattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2035("Card-G2-A_2035_DOUBLET", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2036("Card-G2-A_2036_DOUBLET", "K_Initialisierung Anzahl logischer Kanäle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2038("Card-G2-A_2038_DOUBLET", "K_Personalisierung: Druck der CAN auf den HBA bei Verwendung der optionalen kontaktlosen Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2039("Card-G2-A_2039_DOUBLET", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2040("Card-G2-A_2040_DOUBLET", "K_Personalisierung und K_Initialisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2041("Card-G2-A_2041_DOUBLET", "K_Personalisierung: Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2042("Card-G2-A_2042_DOUBLET", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2043("Card-G2-A_2043_DOUBLET", "K_Personalisierung und K_Initialisierung: ATR-Kodierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2044("Card-G2-A_2044_DOUBLET", "K_Personalisierung und K_Initialisierung: TC1 Byte im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2045("Card-G2-A_2045_DOUBLET", "K_Personalisierung und K_Initialisierung: Vorgaben für Historical Bytes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2046("Card-G2-A_2046_DOUBLET", "K_Personalisierung: Kompatibilität zu G1-Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2047("Card-G2-A_2047_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2048("Card-G2-A_2048_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2055("Card-G2-A_2055_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2057("Card-G2-A_2057_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2058("Card-G2-A_2058_DOUBLET", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2059("Card-G2-A_2059_DOUBLET", "K_Initialisierung: Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2060("Card-G2-A_2060_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_HPC.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2061("Card-G2-A_2061_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_HPC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2063("Card-G2-A_2063_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2064("Card-G2-A_2064_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2067("Card-G2-A_2067_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2069("Card-G2-A_2069_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PIN.CH"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2070("Card-G2-A_2070_DOUBLET", "K_Personalisierung: Länge der PUK für den HBA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2071("Card-G2-A_2071_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PrK.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2072("Card-G2-A_2072_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PrK.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2075("Card-G2-A_2075_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PrK.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2077("Card-G2-A_2077_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2078("Card-G2-A_2078_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2080("Card-G2-A_2080_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2081("Card-G2-A_2081_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2082("Card-G2-A_2082_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HPA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2083("Card-G2-A_2083_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HPA / EF.HPD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2084("Card-G2-A_2084_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2085("Card-G2-A_2085_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PrK.HP.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2088("Card-G2-A_2088_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PIN.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2089("Card-G2-A_2089_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.SSEC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2090("Card-G2-A_2090_DOUBLET", "K_Initialisierung: Inhalt von EF.SSEC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2091("Card-G2-A_2091_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.HP.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2094("Card-G2-A_2094_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2095("Card-G2-A_2095_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2096("Card-G2-A_2096_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC3"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2097("Card-G2-A_2097_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2098("Card-G2-A_2098_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HP.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2101("Card-G2-A_2101_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HP.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2107("Card-G2-A_2107_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HP.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2110("Card-G2-A_2110_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HP.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2117("Card-G2-A_2117_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2118("Card-G2-A_2118_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2119("Card-G2-A_2119_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.CIA.CIAInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2120("Card-G2-A_2120_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.OD (Object Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2121("Card-G2-A_2121_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.AOD (Authentication Object Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2122("Card-G2-A_2122_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.PrKD (Private Key Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2123("Card-G2-A_2123_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.CD(Certificate Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2124("Card-G2-A_2124_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2125("Card-G2-A_2125_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.AUTO / PrK.HP.AUTO.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2128("Card-G2-A_2128_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.AUTO / PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2129("Card-G2-A_2129_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF:ATUO / PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2130("Card-G2-A_2130_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.AUTO / EF.C.HP.AUTO1.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2131("Card-G2-A_2131_DOUBLET", "K_Initialisierung: Initialisierte : MF / DF.AUTO / EF.C.HP.AUTO2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2673("Card-G2-A_2673_DOUBLET", "K_Personalisierung und K_Initialisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2675("Card-G2-A_2675_DOUBLET", "K_Initialisierung: Initialisierte : Wert von PrK.AUTO.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2676("Card-G2-A_2676_DOUBLET", "K_Personalisierung: Wert von PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2677("Card-G2-A_2677_DOUBLET", "K_Personalisierung: Wert von PUK für PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2678("Card-G2-A_2678_DOUBLET", "K_Personalisierung: Wert von PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2679("Card-G2-A_2679_DOUBLET", "K_Personalisierung: Wert von PUK für PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2680("Card-G2-A_2680_DOUBLET", "K_Personalisierung: Inhalt von EF.C.HP.AUTO1.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2681("Card-G2-A_2681_DOUBLET", "K_Personalisierung: Inhalt von EF.C.HP.AUTO2. R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2682("Card-G2-A_2682_DOUBLET", "K_Personalisierung: Unterbindung der Nutzung von DF.AUTO - PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2856("Card-G2-A_2856_DOUBLET", "K_Personalisierung: Unterbindung der Nutzung von DF.AUTO - PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2867("Card-G2-A_2867_DOUBLET", "K_HBA: Vorhandensein einer USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2868("Card-G2-A_2868_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2869("Card-G2-A_2869_DOUBLET", "K_Personalisierung: Generierung der CAN bei Verwendung der optionalen kontaktlosen Schnittstelle des HBA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3005("Card-G2-A_3005_DOUBLET", "Absicherung der Kartenadministration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3006("Card-G2-A_3006_DOUBLET", "K_HBA: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3007("Card-G2-A_3007_DOUBLET", "K_HBA: Kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3009("Card-G2-A_3009_DOUBLET", "K_HBA: Zusatzanforderungen für kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3010("Card-G2-A_3010_DOUBLET", "K_Initialisierung und K_Personalisierung: Kontaktlose Schnittstelle wird nicht genutzt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3011("Card-G2-A_3011_DOUBLET", "K_Initialisierung: Kontaktlose Schnittstelle im COS nicht vorhanden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3014("Card-G2-A_3014_DOUBLET", "K_HBA: Vorhandensein Kryptobox"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3015("Card-G2-A_3015_DOUBLET", "K_Personalisierung und K_Initialisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3016("Card-G2-A_3016_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3181("Card-G2-A_3181_DOUBLET", "K_Initialisierung: Größe persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3182("Card-G2-A_3182_DOUBLET", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs, kein konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3183("Card-G2-A_3183_DOUBLET", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs, kein konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3184("Card-G2-A_3184_DOUBLET", "K_Initialisierung: Verhalten der Objekte, konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3185("Card-G2-A_3185_DOUBLET", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs, konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3186("Card-G2-A_3186_DOUBLET", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs, konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3199("Card-G2-A_3199_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.CardAccess"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3266("Card-G2-A_3266_DOUBLET", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3270("Card-G2-A_3270_DOUBLET", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3271("Card-G2-A_3271_DOUBLET", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3277("Card-G2-A_3277_DOUBLET", "K_Personalisierung und K_Initialisierung: Konformität kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3278("Card-G2-A_3278_DOUBLET", "K_Initialisierung: Initialisiertes Attribut numberOfOctet von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3281("Card-G2-A_3281_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_HPC.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3282("Card-G2-A_3282_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_HPC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3283("Card-G2-A_3283_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3284("Card-G2-A_3284_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3285("Card-G2-A_3285_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3286("Card-G2-A_3286_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PIN.CH"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3287("Card-G2-A_3287_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PrK.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3288("Card-G2-A_3288_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PrK.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3289("Card-G2-A_3289_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PrK.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3290("Card-G2-A_3290_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3291("Card-G2-A_3291_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3292("Card-G2-A_3292_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3293("Card-G2-A_3293_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3294("Card-G2-A_3294_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3295("Card-G2-A_3295_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3296("Card-G2-A_3296_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3297("Card-G2-A_3297_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3298("Card-G2-A_3298_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / PrK.HP.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3299("Card-G2-A_3299_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / PIN.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3301("Card-G2-A_3301_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / EF.C.HP.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3302("Card-G2-A_3302_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3303("Card-G2-A_3303_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3304("Card-G2-A_3304_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC3"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3305("Card-G2-A_3305_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HP.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3306("Card-G2-A_3306_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HP.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3307("Card-G2-A_3307_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HP.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3308("Card-G2-A_3308_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HP.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3314("Card-G2-A_3314_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / PrK.HP.AUTO.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3315("Card-G2-A_3315_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3316("Card-G2-A_3316_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3317("Card-G2-A_3317_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / EF.C.HP.AUTO1.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3318("Card-G2-A_3318_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / EF.C.HP.AUTO2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3320("Card-G2-A_3320_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.CIA.CIAInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3321("Card-G2-A_3321_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.OD (Object Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3322("Card-G2-A_3322_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.AOD (Authentication Object Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3323("Card-G2-A_3323_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.PrKD (Private Key Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3324("Card-G2-A_3324_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.CD (Certificate Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3325("Card-G2-A_3325_DOUBLET", "K_Initialisierung und K_Personalisierung: Abweichung von Festlegungen zum Zwecke der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3326("Card-G2-A_3326_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.R2048 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3327("Card-G2-A_3327_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3385("Card-G2-A_3385_DOUBLET", "K_Personalisierung: Festlegung von CHR in MF / EF.C.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3386("Card-G2-A_3386_DOUBLET", "K_Personalisierung: Festlegung von CHR in MF / EF.C.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3387("Card-G2-A_3387_DOUBLET", "K_Personalisierung: Festlegung von CHR in MF / EF.C.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3395("Card-G2-A_3395_DOUBLET", "K_Personalisierung: personalisierter Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3523("Card-G2-A_3523_DOUBLET", "K_Personalisierung: Schlüsselgenerierung auf der Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3590("Card-G2-A_3590_DOUBLET", "Symmetrische Kartenadministration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3591("Card-G2-A_3591_DOUBLET", "Schlüsselspeicherung"),

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