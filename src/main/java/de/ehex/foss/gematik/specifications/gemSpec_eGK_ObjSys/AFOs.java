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
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2333("Card-G2-A_2333", "K_Initialisierung: Änderung von Zugriffsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2334("Card-G2-A_2334", "K_Initialisierung: Eigenschaften aller Objekte in SE#1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2335("Card-G2-A_2335", "K_Initialisierung: Ordnerattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2336("Card-G2-A_2336", "K_Initialisierung: Dateiattribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2337("Card-G2-A_2337", "K_Initialisierung: Zugriffsregeln für besondere Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2339("Card-G2-A_2339", "K_Personalisierung: Druck der CAN auf die eGK bei Verwendung der optionalen kontaktlosen Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2341("Card-G2-A_2341", "K_Initialisierung: Wert des Attributes root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2342("Card-G2-A_2342", "K_Personalisierung und K_Initialisierung: Wert des Attributes answerToReset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2343("Card-G2-A_2343", "K_Personalisierung: Wert des Attributes iccsn8"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2344("Card-G2-A_2344", "K_Initialisierung: Inhalt persistentPublicKeyList"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2345("Card-G2-A_2345", "K_Personalisierung und K_Initialisierung: ATR-Codierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2346("Card-G2-A_2346", "K_Personalisierung und K_Initialisierung: TC1 Byte im ATR"),

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
    Card_G2_A_2364("Card-G2-A_2364", "K_Initialisierung: Initialisierte Attribute von MF / EF.C.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2367("Card-G2-A_2367", "K_Initialisierung: Initialisierte Attribute von MF / EF.DIR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2369("Card-G2-A_2369", "K_Initialisierung Attribute von MF / EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2370("Card-G2-A_2370", "K_Personalisierung: Personalisiertes Attribut von EF.GDO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2371("Card-G2-A_2371", "K_Initialisierung: Attribute von MF / EF.Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2372("Card-G2-A_2372", "K_Initialisierung: Initialisierte Attribute von MF / PIN.CH"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2375("Card-G2-A_2375", "K_Initialisierung: Initialisierte Attribute von MF / MRPIN.home"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2377("Card-G2-A_2377", "K_Initialisierung: Initialisierte Attribute von MF / PrK.eGK.AUT_CVC.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2380("Card-G2-A_2380", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2388("Card-G2-A_2388", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2389("Card-G2-A_2389", "K_Initialisierung: Initialisierte Attribute von MF / SK.CMS.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2390("Card-G2-A_2390", "K_Initialisierung: Initialisierte Attribute von MF / SK.VSD.AES128"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2391("Card-G2-A_2391", "K_Initialisierung: Initialisierte Attribute von MF / SK.VSD.AES256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2394("Card-G2-A_2394", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2395("Card-G2-A_2395", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Einwilligung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2396("Card-G2-A_2396", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.GVD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2397("Card-G2-A_2397", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Logging"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2398("Card-G2-A_2398", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.PD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2399("Card-G2-A_2399", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Prüfungsnachweis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2400("Card-G2-A_2400", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Standalone"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2401("Card-G2-A_2401", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.StatusVD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2402("Card-G2-A_2402", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.TTN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2403("Card-G2-A_2403", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.VD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2404("Card-G2-A_2404", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / EF.Verweis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2405("Card-G2-A_2405", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2406("Card-G2-A_2406", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / EF.NFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2407("Card-G2-A_2407", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / EF.StatusNFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2408("Card-G2-A_2408", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / MRPIN.NFD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2410("Card-G2-A_2410", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2411("Card-G2-A_2411", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE / EF.DPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2412("Card-G2-A_2412", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE / EF.StatusDPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2413("Card-G2-A_2413", "K_ K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.DPE / MRPIN.DPE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2415("Card-G2-A_2415", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2416("Card-G2-A_2416", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD / EF.EinwilligungGDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2417("Card-G2-A_2417", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD / MRPIN.GDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2418("Card-G2-A_2418", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.GDD / EF.VerweiseGDD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2420("Card-G2-A_2420", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2421("Card-G2-A_2421", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2424("Card-G2-A_2424", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUTN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2427("Card-G2-A_2427", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2434("Card-G2-A_2434", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENCV.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2437("Card-G2-A_2437", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2440("Card-G2-A_2440", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.AUTN.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2443("Card-G2-A_2443", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2449("Card-G2-A_2449", "K_Initialisierung: Initialisierte Attribute von MF / DF.ESIGN / PrK.CH.ENCV.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2452("Card-G2-A_2452", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA_ESIGN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2453("Card-G2-A_2453", "K_Initialisierung: Initialisierte Attribute von MF / DF.CIA_ESIGN / EF.CIA_Info"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2459("Card-G2-A_2459", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2460("Card-G2-A_2460", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / EF.C.CH.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2463("Card-G2-A_2463", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PIN.QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2464("Card-G2-A_2464", "K_Initialisierung: Initialisierte Attribute von MF / DF.QES / PrK.CH.QES.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2667("Card-G2-A_2667", "K_Personalisierung und K_Initialisierung: Wert von „positionLogicalEndOfFile“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2857("Card-G2-A_2857", "K_Initialisierung: Verwendbarkeit der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2858("Card-G2-A_2858", "K_Initialisierung: Eigenschaften der Objekte in anderen SEs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2861("Card-G2-A_2861", "K_eGK: USB-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2862("Card-G2-A_2862", "K_Initialisierung: Initialisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2863("Card-G2-A_2863", "K_Personalisierung: Anzahl Stellen einer CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2864("Card-G2-A_2864", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / MRPIN.NFD_READ"),

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
    Card_G2_A_2985("Card-G2-A_2985", "K_Personalisierung und K_Initialisierung: Historical Bytes im ATR"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2986("Card-G2-A_2986", "K_Initialisierung: Initialisierte Attribute von MF / PuK.RCA.ADMINCMS.CS.E256"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3180("Card-G2-A_3180", "K_Initialisierung: Größe persistentPublicKeyList"),

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
    Card_G2_A_3217("Card-G2-A_3217", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.CH.AUT.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3219("Card-G2-A_3219", "K_Personalisierung: Personalisierte Attribute von MF / DF.ESIGN / EF.C.CH.ENC.R2048"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3229("Card-G2-A_3229", "K_Personalisierung: Personalisierte Attribute von MF / SK.CAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3230("Card-G2-A_3230", "K_Initialisierung: AMTS_ vorbereitet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3231("Card-G2-A_3231", "K_Initialisierung: Initialisierte Attribute von MF / EF.Version2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3232("Card-G2-A_3232", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.NFD / MRPIN.DPE_READ"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3233("Card-G2-A_3233", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3234("Card-G2-A_3234", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE / EF.OSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3235("Card-G2-A_3235", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE / EF.StatusOSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3236("Card-G2-A_3236", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.OSE / MRPIN.OSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3237("Card-G2-A_3237", "K_Initialisierung: Speicherplatzreservierung für zukünftige Anwendungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3238("Card-G2-A_3238", "K_Initialisierung: Größe der Speicherplatzreservierung für zukünftige Anwendungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3240("Card-G2-A_3240", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3241("Card-G2-A_3241", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.EinwilligungAMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3242("Card-G2-A_3242", "K_Initialisierung und K_Personalisierung: Abweichung von Festlegungen zum Zwecke der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3243("Card-G2-A_3243", "K_Personalisierung: Personalisierte Attribute von MF / PuK.RCA.CS.E256 für Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3244("Card-G2-A_3244", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.AMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3245("Card-G2-A_3245", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.VerweiseAMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3246("Card-G2-A_3246", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / EF.StatusAMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3247("Card-G2-A_3247", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / MRPIN.AMTS (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3248("Card-G2-A_3248", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / PIN.AMTS_REP (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3263("Card-G2-A_3263", "K_Initialisierung: Initialisierte Attribute von MF / DF.HCA / DF.AMTS / PrK.AMTS.ENC.E256 (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3265("Card-G2-A_3265", "K_Initialisierung: Wert von pointInTime"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3272("Card-G2-A_3272", "K_Initialisierung: Vorgaben für AMTS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3279("Card-G2-A_3279", "K_Initialisierung: AMTS_angelegt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3335("Card-G2-A_3335", "K_Personalisierung: Option des PIN-Brief-Versands für MF / DF.HCA / DF.AMTS / PIN.AMTS_REP (AMTS_angelegt)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3391("Card-G2-A_3391", "K_Personalisierung: personalisierter Wert von pointInTime"),

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
