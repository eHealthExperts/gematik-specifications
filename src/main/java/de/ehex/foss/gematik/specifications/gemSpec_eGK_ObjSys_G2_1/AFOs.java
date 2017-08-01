package de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys_G2_1;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_eGK_ObjSys_G2_1]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2334("Card-G2-A_2334", "K_Initialisierung: Eigenschaften aller Objekte in SE#1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2335_01("Card-G2-A_2335-01", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2337("Card-G2-A_2337", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2339("Card-G2-A_2339", "K_Personalisierung: Druck der CAN auf die eGK bei Verwendung der optionalen kontaktlosen Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2341("Card-G2-A_2341", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2342_01("Card-G2-A_2342-01", "K_Personalisierung und K_Initialisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2343("Card-G2-A_2343", "K_Personalisierung: Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2344("Card-G2-A_2344", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2345("Card-G2-A_2345", "K_Personalisierung und K_Initialisierung: ATR-Codierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2346_01("Card-G2-A_2346-01", "K_Personalisierung und K_Initialisierung: Wert des TC1 Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2347("Card-G2-A_2347", "K_Personalisierung und K_Initialisierung: Vorgaben für Historical Bytes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2351("Card-G2-A_2351", "K_Initialisierung: Initialisierte Attribute von MF"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2352("Card-G2-A_2352", "K_Initialisierung: Initialisierte Attribute von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2359("Card-G2-A_2359", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_eGK.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2363("Card-G2-A_2363", "K_Personalisierung: CHR in MF / EF.C.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2364_01("Card-G2-A_2364-01", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2367_01("Card-G2-A_2367-01", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2369_01("Card-G2-A_2369-01", "K_Initialisierung Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2370("Card-G2-A_2370", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2371_01("Card-G2-A_2371-01", "K_Initialisierung: Attribute von MF / EF.Version @deprecated"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2372_01("Card-G2-A_2372-01", "PIN.CH; Prüfung Transportstatus via GetPinStatus gemäß LA-Beschluß vom 24.10.2013"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2375_01("Card-G2-A_2375-01", "K_Initialisierung: Initialisierte Attribute von MF / MRPIN.home"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2377_01("Card-G2-A_2377-01", "K_Initialisierung: Initialisierte Attribute von MF / PrK.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2380_01("Card-G2-A_2380-01", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2388("Card-G2-A_2388", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2389_01("Card-G2-A_2389-01", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2390_01("Card-G2-A_2390-01", "K_Initialisierung: Initialisierte Attribute von MF / SK.VSD.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2391_01("Card-G2-A_2391-01", "K_Initialisierung: Initialisierte Attribute von MF / SK.VSD.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2394("Card-G2-A_2394", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2395_01("Card-G2-A_2395-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Einwilligung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2396_01("Card-G2-A_2396-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.GVD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2397_01("Card-G2-A_2397-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Logging"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2398_01("Card-G2-A_2398-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.PD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2399_01("Card-G2-A_2399-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Prüfungsnachweis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2400_01("Card-G2-A_2400-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Standalone"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2401_01("Card-G2-A_2401-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.StatusVD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2403_01("Card-G2-A_2403-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.VD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2404_01("Card-G2-A_2404-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Verweis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2405_01("Card-G2-A_2405-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2406_01("Card-G2-A_2406-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / EF.NFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2407_01("Card-G2-A_2407-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / EF.StatusNFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2408_01("Card-G2-A_2408-01", "K_Initialisierung: Initialisierte Attribute von MF / MRPIN.NFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2410_01("Card-G2-A_2410-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2411_01("Card-G2-A_2411-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE / EF.DPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2412_01("Card-G2-A_2412-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE / EF.StatusDPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2413_01("Card-G2-A_2413-01", "K_Initialisierung: Initialisierte Attribute von MF / MRPIN.DPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2415_01("Card-G2-A_2415-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2416_01("Card-G2-A_2416-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD / EF.EinwilligungGDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2417_01("Card-G2-A_2417-01", "K_Initialisierung: Initialisierte Attribute von MF / MRPIN.GDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2418_01("Card-G2-A_2418-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD / EF.VerweiseGDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2420("Card-G2-A_2420", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2421_01("Card-G2-A_2421-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2424_01("Card-G2-A_2424-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUTN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2427_01("Card-G2-A_2427-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2434_01("Card-G2-A_2434-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENCV.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2437_01("Card-G2-A_2437-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2440_01("Card-G2-A_2440-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.AUTN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2443_01("Card-G2-A_2443-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2449_01("Card-G2-A_2449-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.ENCV.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2459("Card-G2-A_2459", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2460_01("Card-G2-A_2460-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.CH.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2463_01("Card-G2-A_2463-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PIN.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2464_01("Card-G2-A_2464-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PrK.CH.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2667("Card-G2-A_2667", "K_Personalisierung und K_Initialisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2857("Card-G2-A_2857", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2861("Card-G2-A_2861", "K_eGK: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2862("Card-G2-A_2862", "K_Initialisierung: Initialisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2863("Card-G2-A_2863", "K_Personalisierung: Anzahl Stellen einer CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2864_01("Card-G2-A_2864-01", "K_Initialisierung: Initialisierte Attribute von MF / MRPIN.NFD_READ"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2974("Card-G2-A_2974", "K_eGK: Vorhandensein einer USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2975("Card-G2-A_2975", "K_eGK: Kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2977("Card-G2-A_2977", "K_eGK: Zusatzanforderungen für kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2978("Card-G2-A_2978", "K_Initialisierung: Kontaktlose Schnittstelle wird nicht genutzt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2981("Card-G2-A_2981", "K_eGK: logische_Kanäle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2982("Card-G2-A_2982", "K_Initialisierung: Anzeige von logischen Kanälen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2984("Card-G2-A_2984", "K_eGK: Vorhandensein Kryptobox"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2985("Card-G2-A_2985", "K_Personalisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2986_01("Card-G2-A_2986-01", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3200("Card-G2-A_3200", "K_Initialisierung: Initialisierte Attribute von MF / EF.CardAccess"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3202("Card-G2-A_3202", "K_Initialisierung: Option QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3204("Card-G2-A_3204", "K_Personalisierung und K_Initialisierung: Konformität kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3205("Card-G2-A_3205", "K_Initialisierung: Initialisiertes Attribut numberOfOctet von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3207("Card-G2-A_3207", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_eGK.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3208("Card-G2-A_3208", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3217_01("Card-G2-A_3217-01", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3219("Card-G2-A_3219", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3229("Card-G2-A_3229", "K_Personalisierung: Personalisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3231("Card-G2-A_3231", "K_Initialisierung: Initialisierte Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3233_01("Card-G2-A_3233-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3234_01("Card-G2-A_3234-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE / EF.OSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3235_01("Card-G2-A_3235-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE / EF.StatusOSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3236_01("Card-G2-A_3236-01", "K_Initialisierung: Initialisierte Attribute von MF / MRPIN.OSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3237("Card-G2-A_3237", "K_Initialisierung: Speicherplatzreservierung für zukünftige Anwendungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3240_01("Card-G2-A_3240-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3243("Card-G2-A_3243", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3244_01("Card-G2-A_3244-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.AMTS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3245_01("Card-G2-A_3245-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.VerweiseAMTS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3246_01("Card-G2-A_3246-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.StatusAMTS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3247_01("Card-G2-A_3247-01", "K_Initialisierung: Initialisierte Attribute von MF / MRPIN.AMTS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3248_01("Card-G2-A_3248-01", "K_Initialisierung: Initialisierte Attribute von MF / PIN.AMTS_REP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3263_01("Card-G2-A_3263-01", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / PrK.AMTS.ENC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3265("Card-G2-A_3265", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3335_01("Card-G2-A_3335-01", "K_Personalisierung: Option des PIN-Brief-Versands für MF / PIN.AMTS_REP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3391("Card-G2-A_3391", "K_Personalisierung: personalisierter Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3595("Card-G2-A_3595", "K_Initialisierung: Initialisierte Attribute von MF / PIN.AMTS_REP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3596("Card-G2-A_3596", "K_Initialisierung: Herstellerspezifischer FileIdentifier"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3597("Card-G2-A_3597", "K_Personalisierung und K_Initialisierung: TC1 Byte im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3598("Card-G2-A_3598", "K_Initialisierung: Inhalt der Records von EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3603("Card-G2-A_3603", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUT.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3604("Card-G2-A_3604", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUT.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3605("Card-G2-A_3605", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUTN.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3607("Card-G2-A_3607", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3608("Card-G2-A_3608", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3609("Card-G2-A_3609", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENCV.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3611("Card-G2-A_3611", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.AUT.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3613("Card-G2-A_3613", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.AUTN. E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3615("Card-G2-A_3615", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.ENC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3617("Card-G2-A_3617", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.ENCV.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3619("Card-G2-A_3619", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.CH.QES.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3621("Card-G2-A_3621", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PrK.CH.QES.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3701("Card-G2-A_3701", "K_Initialisierung: Angabe der Speicherplatzreserve"),

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