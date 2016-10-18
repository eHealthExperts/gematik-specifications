package de.ehex.foss.gematik.specifications.gemSpec_HSM_B;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_HSM-B]}.
 *
 * @author Anastasiya Zuyeva
 * @since October 18th, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6137("TIP1-A_6137", "Anforderungen an Klima"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6138("TIP1-A_6138", "Anforderungen an Belastbarkeit für Vibrationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6139("TIP1-A_6139", "Gewährleistung der optimalen Betriebsbedingungen für physikalische Umgebung/Betriebsumfeld des HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6140("TIP1-A_6140", "Angaben über die Performanz des HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6141("TIP1-A_6141", "Transparente Anbindung an den Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6142("TIP1-A_6142", "Virtualisierung von KT und Karte gegenüber Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6143("TIP1-A_6143", "Schnittstelle „I_HSM_Operations“ zum Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6144("TIP1-A_6144", "Unterstützung der Schnittstelle „I_KT_Communication“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6145("TIP1-A_6145", "Unterstützung der Schnittstelle „I_Smartcard_Operations“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6146("TIP1-A_6146", "Unterstützung der Schnittstelle „I_Poll_System_Information“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6147("TIP1-A_6147", "Unterstützung der Ereignismeldung über die Schnittstelle „I_Notification“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6148("TIP1-A_6148", "Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6149("TIP1-A_6149", "Außenschnittstellen HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6150("TIP1-A_6150", "Unterstützung von IPv4"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6151("TIP1-A_6151", "Unterstützung von IPv6"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6152("TIP1-A_6152", "Verwerfen von IPv6-Paketen im IPv4-Betrieb"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6153("TIP1-A_6153", "Unterstützung von SICCT mit eHealth-Erweiterungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6154("TIP1-A_6154", "Keine Verwendung des Auto-IP-Protokolls"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6155("TIP1-A_6155", "Unterstützung von TLS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6156("TIP1-A_6156", "TLS-gesicherte Kommunikation mit dem Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6157("TIP1-A_6157", "X.509-Identität eines vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6158("TIP1-A_6158", "Gesicherte Kommunikation über die Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6159("TIP1-A_6159", "Benutzerauthentifizierung bei der Verwaltung des HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6160("TIP1-A_6160", "Vier-Augen-Prinzip bei der Personalisierung des HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6161("TIP1-A_6161", "Prüfung der Korrektheit des zu importierenden CVC-Root-CA Schlüssels"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6162("TIP1-A_6162", "Prüfung der Korrektheit des zu importierenden Zertifikats „C.SMKT.CA.R2048“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6163("TIP1-A_6163", "Auswahl der Schlüssellängen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6164("TIP1-A_6164", "Erforderliches Sicherheitsniveau für das HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6165("TIP1-A_6165", "Beschreibung der erforderlichen zusätzlichen Sicherheitsmaßnahmen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6166("TIP1-A_6166", "Nachweis der Erfüllung des erforderlichen Sicherheitsniveaus für das HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6167("TIP1-A_6167", "Verwendung von Standards und „Best Practices“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6168("TIP1-A_6168", "Verwendung eines BSI-konformen Zufallszahlengenerators"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6169("TIP1-A_6169", "Gewährleistung der Einhaltung der Sicherheitsanforderungen für die Betriebsumgebung des HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6170("TIP1-A_6170", "Anzahl virtueller Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6171("TIP1-A_6171", "Anzahl virtueller Kartenslots"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6172("TIP1-A_6172", "Angaben zum Mengengerüst des HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6173("TIP1-A_6173", "Optionale Unterstützung vom Reference Coding"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6174("TIP1-A_6174", "Warten auf eingehende Dienstanfragen (optional)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6175("TIP1-A_6175", "Sicherheitsprotokoll des Dienstbeschreibungspakets"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6176("TIP1-A_6176", "Warten auf eingehende Clientverbindungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6177("TIP1-A_6177", "Eine Verbindung zu jedem vKT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6178("TIP1-A_6178", "Robuste HSM Dienste"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6179("TIP1-A_6179", "Nicht-unterstütze SICCT Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6180("TIP1-A_6180", "Keine CT Admin Rolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6181("TIP1-A_6181", "Verfügbarkeit der X.509-Zertifikate der Kartenterminalanwendung im HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6182("TIP1-A_6182", "X.509-Zertifikate, die exklusiv zu einem vKT gehören"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6183("TIP1-A_6183", "Gemeinsame Nutzung der X.509-Zertifikate zwischen vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6184("TIP1-A_6184", "Verfügbarkeit der privaten X.509-Schlüsselobjekte der Kartenterminalanwendung im HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6185("TIP1-A_6185", "Private X.509-Schlüsselobjekte, die exklusiv zu einem vKT gehören"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6186("TIP1-A_6186", "Unterstützung von Pairing"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6187("TIP1-A_6187", "Unterstützung von Kommando „EHEALTH TERMINAL AUTHENTICATE“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6188("TIP1-A_6188", "TUC_HSM-B_030 „EHEALTH TERMINAL AUTHENTICATE“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6189("TIP1-A_6189", "Reaktion auf Dienstanfragen (optional)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6190("TIP1-A_6190", "TUC_HSM-B_001 „Dienstbeschreibungspaket senden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6191("TIP1-A_6191", "Reaktion auf eingehende Verbindungsversuche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6192("TIP1-A_6192", "Reaktion auf die eingehenden SICCT Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6193("TIP1-A_6193", "TUC_HSM-B_004 „Kommando ausführen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6194("TIP1-A_6194", "Reaktion auf Request zum Verbindungsabbau"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6195("TIP1-A_6195", "Reaktion auf Ereignis - virtuelle Karte eingesteckt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6196("TIP1-A_6196", "Reaktion auf Ereignis - virtuelle Karte entfernt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6197("TIP1-A_6197", "TUC_HSM-B_0003 „Ereignisnachricht senden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6198("TIP1-A_6198", "Umsetzung des Kommandos SICCT INIT CT SESSION"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6199("TIP1-A_6199", "TUC_HSM-B_005 „SICCT INIT CT SESSION"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6200("TIP1-A_6200", "Umsetzung des Kommandos SICCT CLOSE CT SESSION"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6201("TIP1-A_6201", "TUC_HSM-B_006 „SICCT CLOSE CT SESSION"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6202("TIP1-A_6202", "Umsetzung des Kommandos „SICCT GET STATUS“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6203("TIP1-A_6203", "Implementierung CTM DO gemäß eHealth-Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6204("TIP1-A_6204", "Festlegung „ICC Status Byte“ für das HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6205("TIP1-A_6205", "Implementierung „INTFC DO“ für das HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6206("TIP1-A_6206", "TUC_HSM-B_007 „SICCT GET STATUS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6207("TIP1-A_6207", "Umsetzung des Kommandos „SICCT RESET CT“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6208("TIP1-A_6208", "TUC_HSM-B_009 „SICCT RESET CT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6209("TIP1-A_6209", "Umsetzung des Kommandos „SICCT REQUEST ICC“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6210("TIP1-A_6210", "TUC_HSM-B_010 „SICCT REQUEST ICC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6211("TIP1-A_6211", "TUC_HSM-B_011 „SICCT EJECT ICC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6212("TIP1-A_6212", "TUC_HSM-B_002 „Konnektor hinzufügen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6213("TIP1-A_6213", "vSMC-B Objektsystem"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6214("TIP1-A_6214", "Zugriffsregeln für das vSMC-B Objektsystem"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6215("TIP1-A_6215", "Zugriffsregeln für die Kartenkommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6216("TIP1-A_6216", "Keine Unterstützung von „Option_Kryptobox“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6217("TIP1-A_6217", "Verfügbarkeit der öffentlichen Schlüssel der CVC-Root-CA im HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6218("TIP1-A_6218", "Gemeinsame Nutzung der öffentlichen CVC-Root-CA-Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6219("TIP1-A_6219", "Verfügbarkeit der CV-Zertifikate im HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6220("TIP1-A_6220", "CV-Zertifikate, die exklusiv zu einer vSMC-B gehören"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6221("TIP1-A_6221", "Gemeinsame Nutzung der CV-Zertifikate der CVC-SMC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6222("TIP1-A_6222", "Verfügbarkeit der privaten CV-Schlüsselobjekte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6223("TIP1-A_6223", "CV-Schlüsselobjekte, die exklusiv zu einer vSMC-B gehören"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6224("TIP1-A_6224", "Speicherung der optionalen Schlüsselobjekte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6225("TIP1-A_6225", "Umsetzung des Kommandos „PSO Verify Certificate“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6226("TIP1-A_6226", "Unterstützte „PSO Verify Certificate“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6227("TIP1-A_6227", "Unterstützte Kurvenparameter für CV-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6228("TIP1-A_6228", "TUC_HSM-B_013 „PSO Verify Certificate“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6229("TIP1-A_6229", "Verfügbarkeit der X.509-Zertifikate der ESIGN-Anwendung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6230("TIP1-A_6230", "X.509-Zertifikate der ESIGN-Anwendung, die exklusiv zu einer vSMC-B gehören"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6231("TIP1-A_6231", "Verfügbarkeit der privaten X.509-Schlüsselobjekte der ESIGNAnwendung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6232("TIP1-A_6232", "X.509-Schlüsselobjekte, die exklusiv zu einer vSMC-B gehören"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6233("TIP1-A_6233", "Unterstützung von „Sessionkey-Ableitung“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6234("TIP1-A_6234", "Unterstützte „Aushandlungsschlüssel“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6235("TIP1-A_6235", "Verwendungszweck der Sessionkeys"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6236("TIP1-A_6236", "TUC_HSM-B_014 „Sessionkeys ableiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6237("TIP1-A_6237", "Umsetzung “Bearbeitung einer per Secure Messaging gesicherten Kommando-APDU”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6238("TIP1-A_6238", "TUC_HSM-B_015 „SM-CAPDU auspacken“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6239("TIP1-A_6239", "Umsetzung “Sicherung einer ungesicherten Antwort-APDU”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6240("TIP1-A_6240", "TUC_HSM-B_016 „RAPDU-per-SM sichern“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6241("TIP1-A_6241", "Umsetzung des Kommandos „Internal Authenticate“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6242("TIP1-A_6242", "Unterstützte „Internal Authenticate“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6243("TIP1-A_6243", "TUC_HSM-B_017 „Internal Authenticate“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6244("TIP1-A_6244", "Umsetzung des Kommandos „External Authenticate“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6245("TIP1-A_6245", "Unterstützte „External Authenticate“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6246("TIP1-A_6246", "TUC_HSM-B_018 „External Authenticate“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6247("TIP1-A_6247", "Umsetzung des Kommandos „Get Challenge“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6248("TIP1-A_6248", "Unterstützte „Get Challenge“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6249("TIP1-A_6249", "TUC_HSM-B_019 „Get Challenge“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6250("TIP1-A_6250", "Umsetzung des Kommandos „General Authenticate“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6251("TIP1-A_6251", "Unterstützte „General Authenticate“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6252("TIP1-A_6252", "TUC_HSM-B_020 „General Authenticate“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6253("TIP1-A_6253", "Umsetzung des Kommandos „Get Security Status Key“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6254("TIP1-A_6254", "Unterstützte „Get Security Status Key“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6255("TIP1-A_6255", "TUC_HSM-B_021 „Get Security Status Key“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6256("TIP1-A_6256", "Speicherung das Passwortobjekt „PIN.SMC“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6257("TIP1-A_6257", "Zuordnung des Passwortobjekts zu vSMC-Bs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6258("TIP1-A_6258", "Freischaltung der vSMC-B nur mit eigener PIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6259("TIP1-A_6259", "Die Länge der PIN/PUK der vSMC-Bs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6260("TIP1-A_6260", "Remote-PIN nur mit Secure Messaging"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6261("TIP1-A_6261", "Sperrung eine vSMC-B durch Nutzung der PUK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6262("TIP1-A_6262", "Umsetzung des Kommandos „Verify“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6263("TIP1-A_6263", "Unterstützte „Verify“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6264("TIP1-A_6264", "TUC_HSM-B_022 „Verify“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6265("TIP1-A_6265", "Umsetzung des Kommandos „Change Reference Data“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6266("TIP1-A_6266", "Unterstützte „Change Reference Data“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6267("TIP1-A_6267", "TUC_HSM-B_023 „Change Reference Data“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6268("TIP1-A_6268", "Umsetzung des Kommandos „Reset Retry Counter“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6269("TIP1-A_6269", "Unterstützte „Reset Retry Counter“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6270("TIP1-A_6270", "TUC_HSM-B_024 „Reset Retry Counter“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6271("TIP1-A_6271", "Umsetzung des Kommandos „Get PIN Status“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6272("TIP1-A_6272", "Unterstützte „Get PIN Status“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6273("TIP1-A_6273", "TUC_HSM-B_025 „Get PIN Status“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6274("TIP1-A_6274", "Umsetzung des Kommandos „PSO Compute Digital Signature“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6275("TIP1-A_6275", "Unterstützte „PSO Compute Digital Signature“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6276("TIP1-A_6276", "TUC_HSM-B_026 „PSO Compute Digital Signature“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6277("TIP1-A_6277", "Umsetzung des Kommandos „PSO Decipher“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6278("TIP1-A_6278", "Unterstützte „PSO Decipher“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6279("TIP1-A_6279", "TUC_HSM-B_022 „PSO Decipher“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6280("TIP1-A_6280", "Umsetzung des Kommandos „Read Binary“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6281("TIP1-A_6281", "Unterstützte „Read Binary“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6282("TIP1-A_6282", "TUC_HSM-B_028 „Read Binary“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6283("TIP1-A_6283", "Umsetzung des Kommandos „Manage Security Environment“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6284("TIP1-A_6284", "Unterstützte „Manage Security Environment“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6285("TIP1-A_6285", "Unterstützung der Schlüsselsuche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6286("TIP1-A_6286", "TUC_HSM-B_033 „Manage Security Environment“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6287("TIP1-A_6287", "Umsetzung des Kommandos „Manage Channel“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6288("TIP1-A_6288", "Unterstützte „Manage Channel“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6289("TIP1-A_6289", "Zugriffregeln für das Kommando „Manage Channel“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6290("TIP1-A_6290", "TUC_HSM-B_034 „Manage Channel“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6291("TIP1-A_6291", "Umsetzung des Kommandos „Select“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6292("TIP1-A_6292", "Unterstützte „Select“-Varianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6293("TIP1-A_6293", "Managementschnittstelle gemäß [SICCT]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6294("TIP1-A_6294", "Logische Operationen zur Verwaltung von vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6295("TIP1-A_6295", "ICCSN-Eingabe während der Erstellung von vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6296("TIP1-A_6296", "Aktivieren von vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6297("TIP1-A_6297", "Deaktivieren von vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6298("TIP1-A_6298", "Benennen von FUs der vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6299("TIP1-A_6299", "Initiales Pairing von vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6300("TIP1-A_6300", "Auslesen des Fingerprints der TLS-Zertifikate der vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6301("TIP1-A_6301", "Löschen von Pairing-Informationen der vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6302("TIP1-A_6302", "Logische Operationen zur Verwaltung von vSMC-Bs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6303("TIP1-A_6303", "ICCSN-Eingabe während der Erstellung von vSMC-Bs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6304("TIP1-A_6304", "Herausgabe der ICCSN für vKT.SMKTs und vSMC-Bs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6305("TIP1-A_6305", "Prüfung der Korrektheit der ICCSN für vKT.SMKTs und vSMCBs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6306("TIP1-A_6306", "Eindeutige Zuordnung von ICCSNs zu vKT.SMKTs und vSMCBs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6307("TIP1-A_6307", "Sicherstellung der weltweiten Eindeutigkeit der ICCSNs für vSMC-Bs und vKT.SMKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6308("TIP1-A_6308", "Zuordnung von vSMC-Bs zu vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6309("TIP1-A_6309", "Einstecken einer vSMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6310("TIP1-A_6310", "Entfernen einer vSMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6311("TIP1-A_6311", "Beschreibung/Bereitstellung der Prozesse bzw. Schnittstellen für Beantragung von Zertifikaten für HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6312("TIP1-A_6312", "Schnittstellenspezifikation konform zu Vorgaben der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6313("TIP1-A_6313", "Logische Operationen zur Verwaltung von CA-Zertifikaten der vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6314("TIP1-A_6314", "Logische Operationen zur Verwaltung von X.509-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6315("TIP1-A_6315", "Prüfung der Korrektheit eines X.509-Zertifikatsantrags für ein vKT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6316("TIP1-A_6316", "Korrekte ICCSN eines X.509-Zertifikats, das exklusiv zu einem vKT gehört"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6317("TIP1-A_6317", "Prüfung der Korrektheit eines ins HSM-B zu importierenden X.509-Zertifikats eines vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6318("TIP1-A_6318", "Prüfung des zugehörigen privaten Schlüssels zu einem importierenden Zertifikat eines vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6319("TIP1-A_6319", "Bereitstellung der importieren X.509-Zertifikate eines vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6320("TIP1-A_6320", "Logische Operationen zur Verwaltung von CVC-SMC-CA Zertifikaten der vSMC-Bs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6321("TIP1-A_6321", "Logische Operationen zur Verwaltung von CV- und X.509-Zertifikaten die exklusiv zu einer vSMC-B gehören"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6322("TIP1-A_6322", "Schnittstellenimplementierung konform zu Vorgaben der TSPs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6323("TIP1-A_6323", "Prüfung der Korrektheit eines CV-Zertifikatsantrags für eine vSMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6324("TIP1-A_6324", "Korrekte ICCSN eines CV-Zertifikats, das exlusiv zu einer vSMC-B gehört"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6325("TIP1-A_6325", "Prüfung der Korrektheit eines ins HSM-B zu importierenden CVZertifikats einer vSMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6326("TIP1-A_6326", "Prüfung der Korrektheit eines ins HSM-B zu importierenden X.509-Zertifikats einer vSMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6327("TIP1-A_6327", "Prüfung des zugehörigen privaten Schlüssels zu einem importierenden Zertifikat einer vSMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6328("TIP1-A_6328", "Bereitstellung der importierten CV-Zertifikate einer vSMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6329("TIP1-A_6329", "Bereitstellung der importieren X.509-Zertifikate einer vSMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6330("TIP1-A_6330", "Sichere Aufbewahrung der importierten Zertifikate der vSMC-Bs und vKTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6331("TIP1-A_6331", "Logische Operationen zur Verwaltung von öffentlichen CVCRoot-CA Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6332("TIP1-A_6332", "Importieren von öffentlichen CVC-Root-CA Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6333("TIP1-A_6333", "Generieren von Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6334("TIP1-A_6334", "Schlüsselerzeugung mit einem BSI-konformen Zufallszahlengenerator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6335("TIP1-A_6335", "Exportieren von öffentlichen Schlüsselobjekten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6336("TIP1-A_6336", "Exportieren von privaten Schlüsselobjekten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6337("TIP1-A_6337", "Zuordnung des privaten Schlüssels zu Identitäten im HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6338("TIP1-A_6338", "Verwendung eines Backup-HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6339("TIP1-A_6339", "Sicherer Schlüsseltransport auf ein Backup-HSM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6340("TIP1-A_6340", "Logische Operationen zur Abfrage von Systeminformationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6341("TIP1-A_6341", "Systeminformationen mit Daten ohne Personenbezug"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6342("TIP1-A_6342", "Sicherer Firmware-Update-Mechanismus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6343("TIP1-A_6343", "Zulässige kryptographische Verfahren zur Sicherung des Firmware Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6344("TIP1-A_6344", "Erkennung von Übertragungsfehlern und nicht authentischen Übertragungen während eines Firmware Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6345("TIP1-A_6345", "Manipulationsgeschützte Speicherung des Sicherheitsattributes für die Sicherung des Firmware Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6346("TIP1-A_6346", "Verantwortlichkeit der Prüfung der neuen Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6347("TIP1-A_6347", "Sicherstellung von Authentizität und Integrität eines neuen Firmware Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6348("TIP1-A_6348", "Fehlerhafte oder nicht authentische Übertragung abweisen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6349("TIP1-A_6349", "Keine Veränderung bei fehlerhafter oder nicht authentischer Übertragung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6350("TIP1-A_6350", "Übernahme als aktive Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6351("TIP1-A_6351", "Versionierung der Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6352("TIP1-A_6352", "Erhaltung Konfigurationen nach Update"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6353("TIP1-A_6353", "Selbstauskunft HSM-B: Produkt-Versionsstand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6354("TIP1-A_6354", "Selbstauskunft HSM-B: Firmware-Gruppen-Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6355("TIP1-A_6355", "Die Rollen, die an der Managementschnittstelle vorgesehen werden müssen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6356("TIP1-A_6356", "Schutz vor unberechtigtem Zugriff auf die Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6357("TIP1-A_6357", "Zuordnung der Berechtigungen zu Rollen"),

    ;

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

    private final String afoID;

    @Override
    public String getAfoId() {
        assert nonNull(this.afoID) : "Class invariant violation!";
        assert !this.afoID.isEmpty() : "Class invariant violation!";

        return this.afoID;
    }

    private final String title;

    @Override
    public String getLabel() {
        assert nonNull(this.title) : "Class invariant violation!";
        assert !this.title.isEmpty() : "Class invariant violation!";

        return this.title;
    }

    private final AFOType level;

    @Override
    public AFOType getType() {
        assert nonNull(this.level) : "Class invariant violation!";

        return this.level;
    }

}
