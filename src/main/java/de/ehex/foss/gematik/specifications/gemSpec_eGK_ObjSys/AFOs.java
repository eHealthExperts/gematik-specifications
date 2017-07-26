package de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_eGK_ObjSys]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 *
 * @deprecated WTF! Gematik publishes AFOs multiple times within the same release! This AFO source should be removed in
 *             favor of {@link de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys_G2_1.AFOs};
 */
@Deprecated
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2333("Card-G2-A_2333_DOUBLET", "K_Initialisierung: Änderung von Zugriffsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2334("Card-G2-A_2334_DOUBLET", "K_Initialisierung: Eigenschaften aller Objekte in SE#1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2335("Card-G2-A_2335_DOUBLET", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2336("Card-G2-A_2336_DOUBLET", "K_Initialisierung: Dateiattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2337("Card-G2-A_2337_DOUBLET", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2339("Card-G2-A_2339_DOUBLET", "K_Personalisierung: Druck der CAN auf die eGK bei Verwendung der optionalen kontaktlosen Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2341("Card-G2-A_2341_DOUBLET", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2342("Card-G2-A_2342_DOUBLET", "K_Personalisierung und K_Initialisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2343("Card-G2-A_2343_DOUBLET", "K_Personalisierung: Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2344("Card-G2-A_2344_DOUBLET", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2345("Card-G2-A_2345_DOUBLET", "K_Personalisierung und K_Initialisierung: ATR-Codierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2346("Card-G2-A_2346_DOUBLET", "K_Personalisierung und K_Initialisierung: TC1 Byte im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2347("Card-G2-A_2347_DOUBLET", "K_Personalisierung und K_Initialisierung: Vorgaben für Historical Bytes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2351("Card-G2-A_2351_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2352("Card-G2-A_2352_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2359("Card-G2-A_2359_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_eGK.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2363("Card-G2-A_2363_DOUBLET", "K_Personalisierung: CHR in MF / EF.C.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2364("Card-G2-A_2364_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2367("Card-G2-A_2367_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2369("Card-G2-A_2369_DOUBLET", "K_Initialisierung Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2370("Card-G2-A_2370_DOUBLET", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2371("Card-G2-A_2371_DOUBLET", "K_Initialisierung: Attribute von MF / EF.Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2372("Card-G2-A_2372_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PIN.CH"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2375("Card-G2-A_2375_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / MRPIN.home"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2377("Card-G2-A_2377_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PrK.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2380("Card-G2-A_2380_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2388("Card-G2-A_2388_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2389("Card-G2-A_2389_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2390("Card-G2-A_2390_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.VSD.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2391("Card-G2-A_2391_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.VSD.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2394("Card-G2-A_2394_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2395("Card-G2-A_2395_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Einwilligung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2396("Card-G2-A_2396_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.GVD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2397("Card-G2-A_2397_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Logging"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2398("Card-G2-A_2398_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.PD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2399("Card-G2-A_2399_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Prüfungsnachweis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2400("Card-G2-A_2400_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Standalone"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2401("Card-G2-A_2401_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.StatusVD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2402("Card-G2-A_2402_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.TTN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2403("Card-G2-A_2403_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.VD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2404("Card-G2-A_2404_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Verweis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2405("Card-G2-A_2405_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2406("Card-G2-A_2406_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / EF.NFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2407("Card-G2-A_2407_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / EF.StatusNFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2408("Card-G2-A_2408_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / MRPIN.NFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2410("Card-G2-A_2410_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2411("Card-G2-A_2411_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE / EF.DPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2412("Card-G2-A_2412_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE / EF.StatusDPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2413("Card-G2-A_2413_DOUBLET", "K_ K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE / MRPIN.DPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2415("Card-G2-A_2415_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2416("Card-G2-A_2416_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD / EF.EinwilligungGDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2417("Card-G2-A_2417_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD / MRPIN.GDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2418("Card-G2-A_2418_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD / EF.VerweiseGDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2420("Card-G2-A_2420_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2421("Card-G2-A_2421_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2424("Card-G2-A_2424_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUTN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2427("Card-G2-A_2427_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2434("Card-G2-A_2434_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENCV.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2437("Card-G2-A_2437_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2440("Card-G2-A_2440_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.AUTN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2443("Card-G2-A_2443_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2449("Card-G2-A_2449_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.ENCV.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2452("Card-G2-A_2452_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA_ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2453("Card-G2-A_2453_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA_ESIGN / EF.CIA_Info"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2459("Card-G2-A_2459_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2460("Card-G2-A_2460_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.CH.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2463("Card-G2-A_2463_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PIN.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2464("Card-G2-A_2464_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PrK.CH.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2667("Card-G2-A_2667_DOUBLET", "K_Personalisierung und K_Initialisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2857("Card-G2-A_2857_DOUBLET", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2858("Card-G2-A_2858_DOUBLET", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2861("Card-G2-A_2861_DOUBLET", "K_eGK: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2862("Card-G2-A_2862_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2863("Card-G2-A_2863_DOUBLET", "K_Personalisierung: Anzahl Stellen einer CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2864("Card-G2-A_2864_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / MRPIN.NFD_READ"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2974("Card-G2-A_2974_DOUBLET", "K_eGK: Vorhandensein einer USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2975("Card-G2-A_2975_DOUBLET", "K_eGK: Kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2977("Card-G2-A_2977_DOUBLET", "K_eGK: Zusatzanforderungen für kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2978("Card-G2-A_2978_DOUBLET", "K_Initialisierung: Kontaktlose Schnittstelle wird nicht genutzt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2981("Card-G2-A_2981_DOUBLET", "K_eGK: logische_Kanäle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2982("Card-G2-A_2982_DOUBLET", "K_Initialisierung: Anzeige von logischen Kanälen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2984("Card-G2-A_2984_DOUBLET", "K_eGK: Vorhandensein Kryptobox"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2985("Card-G2-A_2985_DOUBLET", "K_Personalisierung und K_Initialisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2986("Card-G2-A_2986_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3180("Card-G2-A_3180_DOUBLET", "K_Initialisierung: Größe persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3200("Card-G2-A_3200_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.CardAccess"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3202("Card-G2-A_3202_DOUBLET", "K_Initialisierung: Option QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3204("Card-G2-A_3204_DOUBLET", "K_Personalisierung und K_Initialisierung: Konformität kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3205("Card-G2-A_3205_DOUBLET", "K_Initialisierung: Initialisiertes Attribut numberOfOctet von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3207("Card-G2-A_3207_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_eGK.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3208("Card-G2-A_3208_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3217("Card-G2-A_3217_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3219("Card-G2-A_3219_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3229("Card-G2-A_3229_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3230("Card-G2-A_3230_DOUBLET", "K_Initialisierung: AMTS_ vorbereitet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3231("Card-G2-A_3231_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3232("Card-G2-A_3232_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / MRPIN.DPE_READ"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3233("Card-G2-A_3233_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3234("Card-G2-A_3234_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE / EF.OSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3235("Card-G2-A_3235_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE / EF.StatusOSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3236("Card-G2-A_3236_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE / MRPIN.OSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3237("Card-G2-A_3237_DOUBLET", "K_Initialisierung: Speicherplatzreservierung für zukünftige Anwendungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3238("Card-G2-A_3238_DOUBLET", "K_Initialisierung: Größe der Speicherplatzreservierung für zukünftige Anwendungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3240("Card-G2-A_3240_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3241("Card-G2-A_3241_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.EinwilligungAMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3242("Card-G2-A_3242_DOUBLET", "K_Initialisierung und K_Personalisierung: Abweichung von Festlegungen zum Zwecke der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3243("Card-G2-A_3243_DOUBLET", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3244("Card-G2-A_3244_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.AMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3245("Card-G2-A_3245_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.VerweiseAMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3246("Card-G2-A_3246_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.StatusAMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3247("Card-G2-A_3247_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / MRPIN.AMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3248("Card-G2-A_3248_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / PIN.AMTS_REP (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3263("Card-G2-A_3263_DOUBLET", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / PrK.AMTS.ENC.E256 (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3265("Card-G2-A_3265_DOUBLET", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3272("Card-G2-A_3272_DOUBLET", "K_Initialisierung: Vorgaben für AMTS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3279("Card-G2-A_3279_DOUBLET", "K_Initialisierung: AMTS_angelegt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3335("Card-G2-A_3335_DOUBLET", "K_Personalisierung: Option des PIN-Brief-Versands für MF / DF.HCA / DF.AMTS / PIN.AMTS_REP (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3391("Card-G2-A_3391_DOUBLET", "K_Personalisierung: personalisierter Wert von pointInTime"),

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
