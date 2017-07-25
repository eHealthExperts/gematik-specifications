package de.ehex.foss.gematik.specifications.gemSpec_gSMC_K_ObjSys;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_gSMC_K_ObjSys]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2532("Card-G2-A_2532", "K_Initialisierung: Änderung von Zugriffsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2533("Card-G2-A_2533", "K_Initialisierung: Verwendung von SE#1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2535("Card-G2-A_2535", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2536("Card-G2-A_2536", "K_Initialisierung: Dateiattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2537("Card-G2-A_2537", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2538("Card-G2-A_2538", "K_Initialsierung: Anzahl logischer Kanäle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2540("Card-G2-A_2540", "K_Initialisierung: Normative Anforderungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2541("Card-G2-A_2541", "K_Personalisierung: zusätzliche Ordner"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2542("Card-G2-A_2542", "K_Personalisierung: zusätzliche Objekte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2543("Card-G2-A_2543", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2544("Card-G2-A_2544", "K_Personalisierung und K_Initialisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2545("Card-G2-A_2545", "K_Personalisierung: Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2546("Card-G2-A_2546", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2547("Card-G2-A_2547", "K_Personalisierung und K_Initialisierung: ATR-Kodierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2548("Card-G2-A_2548", "K_Personalisierung und K_Initialisierung: TC1 Byte im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2553("Card-G2-A_2553", "K_Initialisierung: Initialisierte Attribute von MF"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2554("Card-G2-A_2554", "K_Initialisierung: Initialisierte Attribute von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2561("Card-G2-A_2561", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_SAK.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2562("Card-G2-A_2562", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.CA_SAK.CS.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2563("Card-G2-A_2563", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2565("Card-G2-A_2565", "K_Initialisierung: Initialisierte Attribute von MF / EF.EnvironmentSettings"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2566("Card-G2-A_2566", "K_Initialisierung: Initialisierte Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2567("Card-G2-A_2567", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2568("Card-G2-A_2568", "K_Initialisierung: Initialisierte Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2569("Card-G2-A_2569", "K_Initialisierung: Initialisierte Attribute von MF / PIN.AK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2570("Card-G2-A_2570", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.AK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2571("Card-G2-A_2571", "K_Initialisierung: Initialisierte Attribute von MF / PIN.NK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2572("Card-G2-A_2572", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.NK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2573("Card-G2-A_2573", "K_Initialisierung: Initialisierte Attribute von MF / PIN.Pers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2574("Card-G2-A_2574", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.Pers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2575("Card-G2-A_2575", "K_Initialisierung: Initialisierte Attribute von MF / PIN.SAK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2576("Card-G2-A_2576", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.SAK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2577("Card-G2-A_2577", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2578("Card-G2-A_2578", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.AUT.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2579("Card-G2-A_2579", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.AUT.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2580("Card-G2-A_2580", "K_Initialisierung: Initialisierte Attribute von MF / PrK.GP.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2581("Card-G2-A_2581", "K_Initialisierung: Initialisierte Attribute von MF / PrK.GP.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2582("Card-G2-A_2582", "K_Initialisierung: Initialisierte Attribute von MF / PrK.GP.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2583("Card-G2-A_2583", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2585("Card-G2-A_2585", "K_Initialisierung: Initialisierte Attribute von MF / PuK.GP.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2588("Card-G2-A_2588", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2589("Card-G2-A_2589", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2592("Card-G2-A_2592", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2595("Card-G2-A_2595", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / EF.C.AK.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2599("Card-G2-A_2599", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2600("Card-G2-A_2600", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.CA_PS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2601("Card-G2-A_2601", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.CA_PS.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2602("Card-G2-A_2602", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.CA_PS.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2605("Card-G2-A_2605", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2606("Card-G2-A_2606", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / EF.ActKey"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2607("Card-G2-A_2607", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / EF.CardInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2608("Card-G2-A_2608", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / EF.CFSMACKey"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2609("Card-G2-A_2609", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / EF.ConfigUser"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2612("Card-G2-A_2612", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / EF.C.NK.VPN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2617("Card-G2-A_2617", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.CFS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2623("Card-G2-A_2623", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PuK.CFS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2626("Card-G2-A_2626", "K_Initialisierung: Vorhandensein von DF.SAK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2627("Card-G2-A_2627", "K_Initialisierung: Konfiguration von DF.SAK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2628("Card-G2-A_2628", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2631("Card-G2-A_2631", "K_Initialisierung: Initialisierte Attribute von MF/ DF.SAK / EF.C.SAK.AUT2.XXXX"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2635("Card-G2-A_2635", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2638("Card-G2-A_2638", "K_Personalisierung: CHR von C.SAK.AUTD_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2639("Card-G2-A_2639", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / EF.C.SAK.AUTD_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2640("Card-G2-A_2640", "K_Personalisierung: CHR von C.SAK.AUTD_CVC.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2641("Card-G2-A_2641", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / EF.C.SAK.AUTD_CVC.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2643("Card-G2-A_2643", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.AUTD_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2644("Card-G2-A_2644", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.AUTD_CVC.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2645("Card-G2-A_2645", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.CA_xTV.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2646("Card-G2-A_2646", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.CA_xTV.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2647("Card-G2-A_2647", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.CA_xTV.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2648("Card-G2-A_2648", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.SIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2649("Card-G2-A_2649", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.SIG.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2650("Card-G2-A_2650", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.SIG.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2653("Card-G2-A_2653", "K_Initialisierung: Initialisierte Attribute von MF / DF.Sicherheitsanker"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2654("Card-G2-A_2654", "K_Initialisierung: Initialisierte Attribute von MF / DF.Sicherheitsanker / EF.C.BNetzA.RCA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2655("Card-G2-A_2655", "K_Initialisierung: Initialisierte Attribute von MF / DF.Sicherheitsanker / EF.C.TSL.CA_1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2656("Card-G2-A_2656", "K_Initialisierung: Initialisierte Attribute von MF / DF.Sicherheitsanker / EF.C.TSL.CA_2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2658("Card-G2-A_2658", "K_Initialisierung: Initialisierte Attribute von MF / DF.Sicherheitsanker / PIN.BNetzA_RCA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2659("Card-G2-A_2659", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.BNetzA_RCA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2660("Card-G2-A_2660", "K_Initialisierung: Initialisierte Attribute von MF / DF.Sicherheitsanker / PIN.TSL_CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2661("Card-G2-A_2661", "K_Initialisierung: CHANGE REFERENCE DATA bei Nutzung der Leer-PIN für PIN.TSL_CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2662("Card-G2-A_2662", "K_Initialisierung: Zahl der Ordner in MF, DF.AK, DF.NK, DF.SAK, DF.Sicherheitsanker"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2663("Card-G2-A_2663", "K_gSMC-K: Anlegen von EF.GeneralPurpose in MF, DF.AK, DF.NK, DF.SAK, DF.Sicherheitsanker"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2665("Card-G2-A_2665", "K_Personalisierung und K_Initialisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2666("Card-G2-A_2666", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2873("Card-G2-A_2873", "K_gSMC-K: Kryptobox"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2994("Card-G2-A_2994", "K_Personalisierung: Absicherung der Kartenadministration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2995("Card-G2-A_2995", "K_gSMC-K: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2996("Card-G2-A_2996", "K_gSMC-K: Vorhandensein einer USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2997("Card-G2-A_2997", "K_Personalisierung und K_Initialisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2998("Card-G2-A_2998", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3040("Card-G2-A_3040", "K_Terminal: Ausschluss kontaktlose Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3041("Card-G2-A_3041", "K_Personalisierung und K_Initialisierung: Vorgaben für Historical Bytes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3191("Card-G2-A_3191", "K_Initialisierung: Größe persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3192("Card-G2-A_3192", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3193("Card-G2-A_3193", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3201("Card-G2-A_3201", "K_Personalisierung und K_Initialisierung: Zuordnung zu transportStatus für die Passwortobjekte der gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3206("Card-G2-A_3206", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3251("Card-G2-A_3251", "K_Initialisierung: Initialisiertes Attribut numberOfOctet von MF / EF.ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3252("Card-G2-A_3252", "K_Initialisierung: Initialisierte Attribute von MF / EF.PuK.RCA.CS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3254("Card-G2-A_3254", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.AUT.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3256("Card-G2-A_3256", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.AUT.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3258("Card-G2-A_3258", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.AUT.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3259("Card-G2-A_3259", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.NK.VPN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3260("Card-G2-A_3260", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / EF.C.NK.VPN2.XXXX"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3261("Card-G2-A_3261", "K_Initialisierung und K_Personalisierung: Abweichung von Festlegungen zum Zwecke der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3262("Card-G2-A_3262", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3268("Card-G2-A_3268", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3280("Card-G2-A_3280", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3328("Card-G2-A_3328", "K_Personalisierung: Festlegung von CHR für EF.C.SMC.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3329("Card-G2-A_3329", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.SMC.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3330("Card-G2-A_3330", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.SMC.AUT_CVC.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3331("Card-G2-A_3331", "K_externe Welt: Festlegung von CHR für EF.C.SMC.AUT_CVC.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3332("Card-G2-A_3332", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3333("Card-G2-A_3333", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SMC.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3334("Card-G2-A_3334", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SMC.AUT_CVC.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3336("Card-G2-A_3336", "K_Initialisierung und K_Personalisierung: Vorgaben für die Option_Erweiterung_herstellerspezifische_Schlüssel_01"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3337("Card-G2-A_3337", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.ENC.R2048 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3338("Card-G2-A_3338", "K_Personalisierung: Personalisierte Attribute von MF /"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3339("Card-G2-A_3339", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.ENC2.R2048 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3345("Card-G2-A_3345", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.ENC.R3072 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3372("Card-G2-A_3372", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.TLS.R2048 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3376("Card-G2-A_3376", "K_Personalisierung: Personalisierte Attribute von MF / PrK.KONN.TLS.R2048 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3377("Card-G2-A_3377", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.TLS2.R2048 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3378("Card-G2-A_3378", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.TLS.R3072 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3379("Card-G2-A_3379", "K_Initialisierung: Initialisierte Attribute von MF / EF.PuK.KONN.SIG.R4096 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3380("Card-G2-A_3380", "K_Personalisierung: Personalisierte Attribute von MF / EF.PuK.KONN.SIG.R4096 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3381("Card-G2-A_3381", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SDS.R2048 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3382("Card-G2-A_3382", "K_Personalisierung: Personalisierte Attribute von MF / PrK.SDS.R2048 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3383("Card-G2-A_3383", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SDS2.R2048 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3384("Card-G2-A_3384", "K_Initialisierung: Initialisierte Attribute von MF / PrK.SDS.R3072 (Option_Erweiterung_herstellerspezifische_Schlüssel_01)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3392("Card-G2-A_3392", "K_Initialisierung: Attribute von MF / EF.KeyInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3393("Card-G2-A_3393", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.CA_SAK.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3394("Card-G2-A_3394", "K_Personalisierung: Personalisierte Attribute von MF / EF.EnvironmentSettings"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3396("Card-G2-A_3396", "K_Personalisierung: Personalisierte Attribute von MF / PIN.AK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3397("Card-G2-A_3397", "K_Personalisierung: Personalisierte Attribute von MF / PIN.NK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3398("Card-G2-A_3398", "K_Personalisierung: Personalisierte Attribute von MF / PIN.Pers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3399("Card-G2-A_3399", "K_Personalisierung: Personalisierte Attribute von MF / PIN.SAK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3400("Card-G2-A_3400", "K_Personalisierung: Personalisierte Attribute von MF / PrK.KONN.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3401("Card-G2-A_3401", "K_Personalisierung: Personalisierte Attribute von MF / PrK.GP.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3402("Card-G2-A_3402", "K_Personalisierung: Personalisierte Attribute von MF / PuK.GP.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3403("Card-G2-A_3403", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3404("Card-G2-A_3404", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3405("Card-G2-A_3405", "K_Personalisierung: Personalisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3406("Card-G2-A_3406", "K_Personalisierung: Personalisierte Attribute von MF / DF.AK / PrK.AK.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3407("Card-G2-A_3407", "K_Personalisierung: Personalisierte Attribute von MF / DF.AK / PrK.AK.CA_PS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3408("Card-G2-A_3408", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.CA_PS2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3409("Card-G2-A_3409", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.CA_PS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3410("Card-G2-A_3410", "K_Personalisierung: Personalisierte Attribute von MF / DF.NK / EF.C.NK.VPN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3411("Card-G2-A_3411", "K_Personalisierung: Personalisierte Attribute von MF / DF.NK / PrK.NK.VPN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3412("Card-G2-A_3412", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.NK.VPN2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3413("Card-G2-A_3413", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.NK.VPN.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3414("Card-G2-A_3414", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.NK.VPN.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3415("Card-G2-A_3415", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.NK.VPN.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3416("Card-G2-A_3416", "K_Personalisierung: Personalisierte Attribute von MF / DF.NK / PrK.CFS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3417("Card-G2-A_3417", "K_Personalisierung: Personalisierte Attribute von MF / DF.NK / PuK.CFS.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3418("Card-G2-A_3418", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.CFS2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3419("Card-G2-A_3419", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.CFS.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3420("Card-G2-A_3420", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.CFS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3421("Card-G2-A_3421", "K_Initialisierung: Initialisierte Attribute von MF / DF.NK / PrK.CFS.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3422("Card-G2-A_3422", "K_Initialisierung: Initialisierte Attribute von MF/ DF.SAK / EF.C.SAK.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3423("Card-G2-A_3423", "K_Personalisierung: Personalisierte Attribute von MF/ DF.SAK / EF.C.SAK.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3424("Card-G2-A_3424", "K_Personalisierung: Personalisierte Attribute von MF / DF.SAK / PrK.SAK.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3425("Card-G2-A_3425", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.AUT2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3426("Card-G2-A_3426", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.AUT.R3072"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3427("Card-G2-A_3427", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.AUT.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3428("Card-G2-A_3428", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.AUT.E384"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3429("Card-G2-A_3429", "K_Personalisierung: Personalisierte Attribute von MF / DF.SAK / EF.C.SAK.AUTD_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3430("Card-G2-A_3430", "K_Personalisierung: Personalisierte Attribute von MF / DF.SAK / PrK.SAK.AUTD_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3431("Card-G2-A_3431", "K_Personalisierung: Personalisierte Attribute von MF / DF.SAK / PrK.SAK.CA_xTV.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3432("Card-G2-A_3432", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.CA_xTV2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3433("Card-G2-A_3433", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.CA_xTV.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3434("Card-G2-A_3434", "K_Personalisierung: Personalisierte Attribute von MF / DF.SAK / PrK.SAK.SIG.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3435("Card-G2-A_3435", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.SIG2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3436("Card-G2-A_3436", "K_Initialisierung: Initialisierte Attribute von MF / DF.SAK / PrK.SAK.SIG.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3438("Card-G2-A_3438", "K_Personalisierung: Personalisierte Attribute von MF / DF.Sicherheitsanker / PIN.BNetzA_RCA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3439("Card-G2-A_3439", "K_Personalisierung: Personalisierte Attribute von MF / DF.Sicherheitsanker / PIN.TSL_CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3442("Card-G2-A_3442", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.AUT2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3443("Card-G2-A_3443", "K_Initialisierung: Initialisierte Attribute von MF / PrK.KONN.AUT.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3444("Card-G2-A_3444", "K_Initialisierung: Initialisierte Attribute von MF / PrK.GP2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3446("Card-G2-A_3446", "K_Initialisierung: Initialisierte Attribute von MF / PrK.GP.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3447("Card-G2-A_3447", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3448("Card-G2-A_3448", "K_Initialisierung: Initialisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3449("Card-G2-A_3449", "K_Personalisierung: Personalisierte Attribute von MF / SK.CUP.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3450("Card-G2-A_3450", "K_Personalisierung: Personalisierte Attribute von MF / DF.AK / EF.C.AK.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3451("Card-G2-A_3451", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / EF.C.AK.AUT2.XXXX"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3452("Card-G2-A_3452", "K_Initialisierung: Initialisierte Attribute von MF / DF.AK / PrK.AK.AUT2.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3514("Card-G2-A_3514", "K_Personalisierung: personalisierter Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3580("Card-G2-A_3580", "K_Personalisierung: Personalisierte Attribute von MF / EF.PuK.RCA.CS.R2048 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3581("Card-G2-A_3581", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3582("Card-G2-A_3582", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.BNetzA.RCA für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3583("Card-G2-A_3583", "K_Personalisierung: Personalisierte Attribute von MF / EF.C.TSL.CA_1 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3593("Card-G2-A_3593", "Schlüsselspeicherung"),

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