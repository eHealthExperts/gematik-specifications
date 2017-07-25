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
 */

public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2032("Card-G2-A_2032", "K_Initialisierung: Änderung von Zugriffsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2033("Card-G2-A_2033", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2034("Card-G2-A_2034", "K_Initialisierung: Dateiattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2035("Card-G2-A_2035", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2036("Card-G2-A_2036", "K_Initialisierung Anzahl logischer Kanäle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2038("Card-G2-A_2038", "K_Personalisierung: Druck der CAN auf den HBA bei Verwendung der optionalen kontaktlosen Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2039("Card-G2-A_2039", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2040("Card-G2-A_2040", "K_Personalisierung und K_Initialisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2041("Card-G2-A_2041", "K_Personalisierung: Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2042("Card-G2-A_2042", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2043("Card-G2-A_2043", "K_Personalisierung und K_Initialisierung: ATR-Kodierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2044("Card-G2-A_2044", "K_Personalisierung und K_Initialisierung: TC1 Byte im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2045("Card-G2-A_2045", "K_Personalisierung und K_Initialisierung: Vorgaben für Historical Bytes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2046("Card-G2-A_2046", "K_Personalisierung: Kompatibilität zu G1-Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2047("Card-G2-A_2047", "K_Initialisierung: Initialisierte Attribute von MF"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2048("Card-G2-A_2048", "K_Initialisierung: Initialisierte Attribute von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2055("Card-G2-A_2055", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2057("Card-G2-A_2057", "K_Initialisierung: Initialisierte Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2058("Card-G2-A_2058", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2059("Card-G2-A_2059", "K_Initialisierung: Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2060("Card-G2-A_2060", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_HPC.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2061("Card-G2-A_2061", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_HPC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2063("Card-G2-A_2063", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2064("Card-G2-A_2064", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2067("Card-G2-A_2067", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2069("Card-G2-A_2069", "K_Initialisierung: Initialisierte Attribute von MF / PIN.CH"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2070("Card-G2-A_2070", "K_Personalisierung: Länge der PUK für den HBA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2071("Card-G2-A_2071", "K_Initialisierung: Initialisierte Attribute von MF / PrK.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2072("Card-G2-A_2072", "K_Initialisierung: Initialisierte Attribute von MF / PrK.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2075("Card-G2-A_2075", "K_Initialisierung: Initialisierte Attribute von MF / PrK.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2077("Card-G2-A_2077", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2078("Card-G2-A_2078", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2080("Card-G2-A_2080", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2081("Card-G2-A_2081", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2082("Card-G2-A_2082", "K_Initialisierung: Initialisierte Attribute von MF / DF.HPA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2083("Card-G2-A_2083", "K_Initialisierung: Initialisierte Attribute von MF / DF.HPA / EF.HPD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2084("Card-G2-A_2084", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2085("Card-G2-A_2085", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PrK.HP.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2088("Card-G2-A_2088", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PIN.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2089("Card-G2-A_2089", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.SSEC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2090("Card-G2-A_2090", "K_Initialisierung: Inhalt von EF.SSEC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2091("Card-G2-A_2091", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.HP.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2094("Card-G2-A_2094", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2095("Card-G2-A_2095", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2096("Card-G2-A_2096", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC3"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2097("Card-G2-A_2097", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2098("Card-G2-A_2098", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HP.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2101("Card-G2-A_2101", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.HP.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2107("Card-G2-A_2107", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HP.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2110("Card-G2-A_2110", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.HP.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2117("Card-G2-A_2117", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2118("Card-G2-A_2118", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2119("Card-G2-A_2119", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.CIA.CIAInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2120("Card-G2-A_2120", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.OD (Object Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2121("Card-G2-A_2121", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.AOD (Authentication Object Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2122("Card-G2-A_2122", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.PrKD (Private Key Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2123("Card-G2-A_2123", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.QES / EF.CD(Certificate Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2124("Card-G2-A_2124", "K_Initialisierung: Initialisierte Attribute von MF / DF.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2125("Card-G2-A_2125", "K_Initialisierung: Initialisierte Attribute von MF / DF.AUTO / PrK.HP.AUTO.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2128("Card-G2-A_2128", "K_Initialisierung: Initialisierte Attribute von MF / DF.AUTO / PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2129("Card-G2-A_2129", "K_Initialisierung: Initialisierte Attribute von MF / DF:ATUO / PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2130("Card-G2-A_2130", "K_Initialisierung: Initialisierte Attribute von MF / DF.AUTO / EF.C.HP.AUTO1.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2131("Card-G2-A_2131", "K_Initialisierung: Initialisierte : MF / DF.AUTO / EF.C.HP.AUTO2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2673("Card-G2-A_2673", "K_Personalisierung und K_Initialisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2675("Card-G2-A_2675", "K_Initialisierung: Initialisierte : Wert von PrK.AUTO.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2676("Card-G2-A_2676", "K_Personalisierung: Wert von PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2677("Card-G2-A_2677", "K_Personalisierung: Wert von PUK für PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2678("Card-G2-A_2678", "K_Personalisierung: Wert von PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2679("Card-G2-A_2679", "K_Personalisierung: Wert von PUK für PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2680("Card-G2-A_2680", "K_Personalisierung: Inhalt von EF.C.HP.AUTO1.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2681("Card-G2-A_2681", "K_Personalisierung: Inhalt von EF.C.HP.AUTO2. R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2682("Card-G2-A_2682", "K_Personalisierung: Unterbindung der Nutzung von DF.AUTO - PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2856("Card-G2-A_2856", "K_Personalisierung: Unterbindung der Nutzung von DF.AUTO - PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2867("Card-G2-A_2867", "K_HBA: Vorhandensein einer USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2868("Card-G2-A_2868", "K_Initialisierung: Initialisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2869("Card-G2-A_2869", "K_Personalisierung: Generierung der CAN bei Verwendung der optionalen kontaktlosen Schnittstelle des HBA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3005("Card-G2-A_3005", "Absicherung der Kartenadministration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3006("Card-G2-A_3006", "K_HBA: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3007("Card-G2-A_3007", "K_HBA: Kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3009("Card-G2-A_3009", "K_HBA: Zusatzanforderungen für kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3010("Card-G2-A_3010", "K_Initialisierung und K_Personalisierung: Kontaktlose Schnittstelle wird nicht genutzt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3011("Card-G2-A_3011", "K_Initialisierung: Kontaktlose Schnittstelle im COS nicht vorhanden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3014("Card-G2-A_3014", "K_HBA: Vorhandensein Kryptobox"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3015("Card-G2-A_3015", "K_Personalisierung und K_Initialisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3016("Card-G2-A_3016", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3181("Card-G2-A_3181", "K_Initialisierung: Größe persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3182("Card-G2-A_3182", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs, kein konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3183("Card-G2-A_3183", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs, kein konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3184("Card-G2-A_3184", "K_Initialisierung: Verhalten der Objekte, konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3185("Card-G2-A_3185", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs, konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3186("Card-G2-A_3186", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs, konkretes SE genannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3199("Card-G2-A_3199", "K_Initialisierung: Initialisierte Attribute von MF / EF.CardAccess"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3266("Card-G2-A_3266", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3270("Card-G2-A_3270", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3271("Card-G2-A_3271", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3277("Card-G2-A_3277", "K_Personalisierung und K_Initialisierung: Konformität kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3278("Card-G2-A_3278", "K_Initialisierung: Initialisiertes Attribut numberOfOctet von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3281("Card-G2-A_3281", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_HPC.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3282("Card-G2-A_3282", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_HPC.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3283("Card-G2-A_3283", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3284("Card-G2-A_3284", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3285("Card-G2-A_3285", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3286("Card-G2-A_3286", "K_Personalisierung: Personalisierte Attribute von MF / PIN.CH"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3287("Card-G2-A_3287", "K_Personalisierung: Personalisierte Attribute von MF / PrK.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3288("Card-G2-A_3288", "K_Personalisierung: Personalisierte Attribute von MF / PrK.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3289("Card-G2-A_3289", "K_Personalisierung: Personalisierte Attribute von MF / PrK.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3290("Card-G2-A_3290", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3291("Card-G2-A_3291", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3292("Card-G2-A_3292", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3293("Card-G2-A_3293", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3294("Card-G2-A_3294", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3295("Card-G2-A_3295", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3296("Card-G2-A_3296", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3297("Card-G2-A_3297", "K_Personalisierung: Personalisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3298("Card-G2-A_3298", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / PrK.HP.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3299("Card-G2-A_3299", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / PIN.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3301("Card-G2-A_3301", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / EF.C.HP.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3302("Card-G2-A_3302", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3303("Card-G2-A_3303", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3304("Card-G2-A_3304", "K_Personalisierung: Personalisierte Attribute von MF / DF.QES / EF.C.HP.QES-AC3"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3305("Card-G2-A_3305", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HP.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3306("Card-G2-A_3306", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / PrK.HP.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3307("Card-G2-A_3307", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HP.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3308("Card-G2-A_3308", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.HP.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3314("Card-G2-A_3314", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / PrK.HP.AUTO.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3315("Card-G2-A_3315", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / PIN.AUTO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3316("Card-G2-A_3316", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / PIN.SO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3317("Card-G2-A_3317", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / EF.C.HP.AUTO1.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3318("Card-G2-A_3318", "K_Personalisierung: Personalisierte Attribute von MF / DF.AUTO / EF.C.HP.AUTO2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3320("Card-G2-A_3320", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.CIA.CIAInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3321("Card-G2-A_3321", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.OD (Object Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3322("Card-G2-A_3322", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.AOD (Authentication Object Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3323("Card-G2-A_3323", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.PrKD (Private Key Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3324("Card-G2-A_3324", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA.ESIGN / EF.CD (Certificate Directory)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3325("Card-G2-A_3325", "K_Initialisierung und K_Personalisierung: Abweichung von Festlegungen zum Zwecke der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3326("Card-G2-A_3326", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.R2048 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3327("Card-G2-A_3327", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3385("Card-G2-A_3385", "K_Personalisierung: Festlegung von CHR in MF / EF.C.HPC.AUTR_CVC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3386("Card-G2-A_3386", "K_Personalisierung: Festlegung von CHR in MF / EF.C.HPC.AUTR_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3387("Card-G2-A_3387", "K_Personalisierung: Festlegung von CHR in MF / EF.C.HPC.AUTD_SUK_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3395("Card-G2-A_3395", "K_Personalisierung: personalisierter Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3523("Card-G2-A_3523", "K_Personalisierung: Schlüsselgenerierung auf der Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3590("Card-G2-A_3590", "Symmetrische Kartenadministration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3591("Card-G2-A_3591", "Schlüsselspeicherung"),

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