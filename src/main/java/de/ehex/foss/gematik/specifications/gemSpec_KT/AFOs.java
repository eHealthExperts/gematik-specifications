package de.ehex.foss.gematik.specifications.gemSpec_KT;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_KT]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2948("TIP1-A_2948", "Definition SICCT/eHealth"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2950("TIP1-A_2950", "Mindestanforderung Display des eHealth-Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2951("TIP1-A_2951", "eHealth-Kartenterminal: Eingabeeinheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2952("TIP1-A_2952", "eHealth-Kartenterminal: weitere Sensoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2953("TIP1-A_2953", "Zuverlässigkeitsprognose eHealth-Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2954("TIP1-A_2954", "Zuverlässigkeitsprognose eHealth-Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2955("TIP1-A_2955", "Dauerhafte Stromversorgung der im eHealth-Kartenterminal gesteckten Chipkarte(n)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2956("TIP1-A_2956", "Kurzzeitig höherer Strombedarf von Chipkarten (Spike)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2957("TIP1-A_2957", "Behandlung Bedienungsfehler und ungültige Eingaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2958("TIP1-A_2958", "Sichtbarkeit MAC-Adresse des eHealth-Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2959("TIP1-A_2959", "Lokale Terminalfunktion zur Anzeige der MAC-Adresse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2960("TIP1-A_2960", "Unabhängigkeit Netzwerkanschluss bei lokaler Terminalfunktion zur Anzeige der MAC-Adresse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2961("TIP1-A_2961", "Authentifizierung und MAC-Adressenabfrage"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2962("TIP1-A_2962", "Spezifizierung gematik-Prüfzeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2963("TIP1-A_2963", "Prüfzeichen und inverse Form"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2964("TIP1-A_2964", "Anbringung gematik-Prüfzeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2965("TIP1-A_2965", "Sichere Updatemöglichkeit KT-Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2966("TIP1-A_2966", "eHealth-Kartenterminal und direkte Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2967("TIP1-A_2967", "Aktivierung weiterer Managementschnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2968("TIP1-A_2968", "Aktivieren und Deaktivieren von weiteren Managementschnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2969("TIP1-A_2969", "Administration des eHealth-Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2970("TIP1-A_2970", "Weitere Managementschnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2971("TIP1-A_2971", "Über LAN-Netzwerk administrieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2972("TIP1-A_2972", "Anzeige Kartenzugriffe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2973("TIP1-A_2973", "Anzeige Zugriffe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2976("TIP1-A_2976", "Prüfung Integrität/Authentizität einer neuen Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2977("TIP1-A_2977", "Fehlerhafte oder nicht authentische Übertragung abweisen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2978("TIP1-A_2978", "Übernahme als aktive Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2979("TIP1-A_2979", "Aktivierung und Erkennbarkeit sicherer PIN-Modus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2980("TIP1-A_2980", "Managementschnittstellen zur Administrierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2981("TIP1-A_2981", "Rolle Administrator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2982("TIP1-A_2982", "Rolle Benutzer und Administration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2983("TIP1-A_2983", "Übertragung medizinischer und personenbezogener Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2984("TIP1-A_2984", "Anzeige medizinischer und personenbezogener Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2985("TIP1-A_2985", "Schlüsselmaterial des SM-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2986("TIP1-A_2986", "Kein SM-KT vorhanden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2987("TIP1-A_2987", "Aktivierung direkte Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2988("TIP1-A_2988", "Administratorkennwort eingegeben an der direkten Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2989("TIP1-A_2989", "Separates Setzen der Kennwörter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2990("TIP1-A_2990", "Fehlerzähler bei falscher Kennworteingabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2991("TIP1-A_2991", "Fehlerzähler: Veränderung über Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2992("TIP1-A_2992", "Fehlerzähler: Abfrage"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2993("TIP1-A_2993", "Geschütze Speicherung der Kennwörter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2994("TIP1-A_2994", "Sperrzeiten für direkte Managementschnittstelle bei Falscheingabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2995("TIP1-A_2995", "Fehlerzähler: spannungsloser Zustand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2996("TIP1-A_2996", "Fehlerzähler: Speicherung verstrichener Sperrzeit im spannungslosem Zustand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2997("TIP1-A_2997", "Fehlerzähler: Neustart Sperrzeit nach spannungslosem Zustand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2998("TIP1-A_2998", "Sperrung weiterer Managementschnittstellen bei Falscheingabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2999("TIP1-A_2999", "Sperrung weiterer Managementschnittstellen für alle Benutzer bei Falscheingabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3000("TIP1-A_3000", "Mindestanforderungen Kennwort"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3001("TIP1-A_3001", "Zeichen für Kennwort"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3002("TIP1-A_3002", "Beschränkung für Kennwortauswahl"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3003("TIP1-A_3003", "Kennwörter und programmierbare Funktionstasten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3004("TIP1-A_3004", "Kennwort und Klartextanzeige"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3005("TIP1-A_3005", "Zufallszahlen und Einmalschlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3006("TIP1-A_3006", "Mindestanzahl Pairing-Block"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3007("TIP1-A_3007", "Empfohlene Anzahl Pairing-Blöcke"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3008("TIP1-A_3008", "Unterstützung Kartenkontakte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3009("TIP1-A_3009", "Elektrischer Anschluss Kartenkontakte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3010("TIP1-A_3010", "„Card-In“-Schalter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3011("TIP1-A_3011", "Anpressdruck der Kontakte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3012("TIP1-A_3012", "Streichung 'SICCT SELECT CT MODE'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3013("TIP1-A_3013", "Einschränkungen CMD DO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3034("TIP1-A_3034", "Display eines eHealth-Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3035("TIP1-A_3035", "Zuverlässigkeit des eHealth-Kartenterminals im Betrieb"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3036("TIP1-A_3036", "Mehrwertmodule: keine Störungen der eHealth-Anwendungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3038("TIP1-A_3038", "Vertrauenswürdiger Zustand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3039("TIP1-A_3039", "Quelle für Zufallszahlen Zufallszahlengenerator des SM-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3040("TIP1-A_3040", "Erzeugung von Zufallszahlen ohne vorhandenes SM-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3041("TIP1-A_3041", "Zufallszahlengenerator geringerer Güte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3043("TIP1-A_3043", "Speicherung Shared Secret"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3044("TIP1-A_3044", "Erstellung des Authentifizierungstokens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3045("TIP1-A_3045", "Pairing-Information"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3046("TIP1-A_3046", "Pairing-Block"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3047("TIP1-A_3047", "Zugriff auf Shared Secrets"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3048("TIP1-A_3048", "Shared Secrets und Klartextanzeige"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3049("TIP1-A_3049", "Löschung Pairing-Blöcke"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3050("TIP1-A_3050", "Löschung öffentliche Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3051("TIP1-A_3051", "Löschen von Pairing-Informationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3052("TIP1-A_3052", "Funktionsfähigkeit der Karte bei Notentnahme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3053("TIP1-A_3053", "Beschriftung/Bedruckung bei Notentnahme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3054("TIP1-A_3054", "Hilfsmittel Notentnahme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3055("TIP1-A_3055", "Bauform eHealth-Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3056("TIP1-A_3056", "Notentnahme bei Stromausfall"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3057("TIP1-A_3057", "Benutzerdokumentation für Notentnahme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3058("TIP1-A_3058", "Unterstützung kontaktbehaftete Chipkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3059("TIP1-A_3059", "eHealth-Kartenterminal und Kontaktiereinheiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3061("TIP1-A_3061", "Format Kontaktiereinheiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3062("TIP1-A_3062", "Kommunikationsverhalten des Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3063("TIP1-A_3063", "Synchrone und asynchrone Übertragungsprotokolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3064("TIP1-A_3064", "Kontext der verwalteten Chipkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3065("TIP1-A_3065", "Verbindungsabbruch"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3066("TIP1-A_3066", "Mehrere Verbindungen zu ansteuernden Hosts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3067("TIP1-A_3067", "Anzahl Konnektorverbindungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3068("TIP1-A_3068", "Mehrere Verbindungen über SICCT-Port"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3069("TIP1-A_3069", "Verbindungen und eHealth-Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3070("TIP1-A_3070", "Ressourcen und unterschiedliche Kontexte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3071("TIP1-A_3071", "Übergang Nutzungsrecht für Ressourcen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3072("TIP1-A_3072", "Verbindung zum Kartenterminal aufgebaut, Ablehnung Konnektorverbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3073("TIP1-A_3073", "Verbindung zum Kartenterminal aufgebaut, Abbruch Konnektorverbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3074("TIP1-A_3074", "Verbindung zum eHealth-Kartenterminal aufbauen, Zurücksetzten gesteckter Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3075("TIP1-A_3075", "SICCT-Kommandos über Netzwerk"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3077("TIP1-A_3077", "Kommandopuffer für APDUs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3078("TIP1-A_3078", "Shared Secrets und die öffentlichen Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3079("TIP1-A_3079", "SICCT OUTPUT und SICCT INPUT Displaynachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3080("TIP1-A_3080", "SICCT OUTPUT und SICCT INPUT mindestens 48 Zeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3081("TIP1-A_3081", "SICCT REQUEST ICC und SICCT EJECT ICC Displaynachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3082("TIP1-A_3082", "SICCT REQUEST ICC und SICCT EJECT ICC mindestens 48 Zeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3083("TIP1-A_3083", "SICCT PERFORM VERIFICATION: Parameter Displaynachricht und PIN-Prompt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3084("TIP1-A_3084", "Displaynachrichten mittels SICCT PERFORM VERIFICATION"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3085("TIP1-A_3085", "Anzeige von PIN-Prompts mittels SICCT PERFORM VERIFICATION"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3086("TIP1-A_3086", "SICCT PERFORM VERIFICATION Kommando, Eingabe des 1.Zeichens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3087("TIP1-A_3087", "SICCT PERFORM VERIFICATION Kommando, Eingabe der weiteren Zeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3088("TIP1-A_3088", "SICCT MODIFY VERIFICATION DATA Kommando, Eingabe des 1. Zeichens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3089("TIP1-A_3089", "SICCT MODIFY VERIFICATION DATA Kommando, Eingabe der weiteren Zeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3090("TIP1-A_3090", "PIN mit variabler oder fixer Länge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3091("TIP1-A_3091", "PIN-Länge Kartenterminal bekannt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3092("TIP1-A_3092", "Aktualisierung der Kartenterminal-Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3093("TIP1-A_3093", "Neu einzuspielende Firmware-Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3094("TIP1-A_3094", "Aktualisierung von CA-Zertifikaten der Komponenten-PKI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3095("TIP1-A_3095", "Aufbau des SICCT-spezifischen TLS-Kanals bei nicht-gültigem Konnektorzertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3096("TIP1-A_3096", "Aufbau des SICCT-spezifischen TLS-Kanals, erlaubte Kommandos bei gültigem Konnektorzertifikat ohne Pairing"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3097("TIP1-A_3097", "Aufbau des SICCT-spezifischen TLS-Kanals, erlaubte Kommandos bei gültigem Konnektorzertifikat mit Pairing"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3098("TIP1-A_3098", "Aufbau des SICCT-spezifischen TLS-Kanals, zusätzlich erlaubtes Kommando bei gültigem Konnektorzertifikat ohne Pairing"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3099("TIP1-A_3099", "Auslieferungszustand Kennwörter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3100("TIP1-A_3100", "Auslieferungszustand Pairing-Information"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3101("TIP1-A_3101", "Auslieferungszustand Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3102("TIP1-A_3102", "Auslieferungszustand Direktkennwort"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3103("TIP1-A_3103", "Erstmaliges Setzen des Direktkennworts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3104("TIP1-A_3104", "Definition Werksreset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3105("TIP1-A_3105", "Mindestgröße gematik Prüfzeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3106("TIP1-A_3106", "Benutzerführung und integriertes Display"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3107("TIP1-A_3107", "Optische Gestaltung des Prüfzeichens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3108("TIP1-A_3108", "Prüfung der einzuspielenden Firmware-Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3109("TIP1-A_3109", "EPS-Datei „gematik Prüfzeichen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3110("TIP1-A_3110", "Gleichzeitige Kommunikation zu unterschiedlichen Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3111("TIP1-A_3111", "Transiente bzw. überbrückbare Fehlerzustände bei der Kartenkommunikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3112("TIP1-A_3112", "Entnahme des SM-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3113("TIP1-A_3113", "Zustand EHEALTH EXPECT CHALLENGE RESPONSE, Abbruch durch anderes Kommando"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3114("TIP1-A_3114", "Zustand EHEALTH EXPECT CHALLENGE RESPONSE, Einnehmen des Zustands"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3115("TIP1-A_3115", "Zustand EHEALTH EXPECT CHALLENGE RESPONSE, Timeout"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3116("TIP1-A_3116", "SICCT-Modus und EHEALTH EXPECT CHALLENGE RESPONSE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3117("TIP1-A_3117", "Protokollfehler spezifikationskonform behandeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3118("TIP1-A_3118", "Discretionary Data Data Object"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3119("TIP1-A_3119", "Kommandostruktur des EHEALTH TERMINAL AUTHENTICATE Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3120("TIP1-A_3120", "Antwortstruktur des EHEALTH TERMINAL AUTHENTICATE Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3121("TIP1-A_3121", "Allgemeine Status Codes gemäß SICCT-Spezifikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3122("TIP1-A_3122", "“Shared Secret Data Object Definition”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3123("TIP1-A_3123", "“Shared Secret Data Object Challenge Definition”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3124("TIP1-A_3124", "“Shared Secret Data Object Response Definition”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3125("TIP1-A_3125", "Kommando mit P2=’01’ (CREATE)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3126("TIP1-A_3126", "Kommando mit P2=’02’ (VALIDATE)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3127("TIP1-A_3127", "P2=’03’ (ADD Phase 1)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3128("TIP1-A_3128", "P2=’04’ (ADD Phase 2)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3129("TIP1-A_3129", "TLS-Verbindungsaufbau: notwendiges kryptographisches Material"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3130("TIP1-A_3130", "Kartenkontakte und Umschalten in andere Betriebsmodi"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3131("TIP1-A_3131", "Ergänzung der SICCT-Spezifikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3132("TIP1-A_3132", "Anzahl der während der PIN-Eingabe anzeigbaren Zeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3133("TIP1-A_3133", "PIN-Länge mindestens 12 Zeichen ermöglichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3134("TIP1-A_3134", "Während der PIN-Eingabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3135("TIP1-A_3135", "Anzahl eingegebene Zeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3136("TIP1-A_3136", "Aufbau des SICCT-spezifischen TLS-Kanals, erlaubte Kommandos bei ungültigem Konnektorzertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3137("TIP1-A_3137", "„Liste ausführbarer Kommandos ohne gültiges Konnektorzertifikat“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3138("TIP1-A_3138", "Kartenkontakte und Umschalten Betriebsmodi"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3144("TIP1-A_3144", "SICCT-Terminalname"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3145("TIP1-A_3145", "Anzeige des SICCT-Terminalnamens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3146("TIP1-A_3146", "Abfrage SICCT-Terminalnamen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3147("TIP1-A_3147", "Übertragungsparameter PPS1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3148("TIP1-A_3148", "TA1 Byte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3149("TIP1-A_3149", "PPS-Verfahren und Wert ‚97’"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3150("TIP1-A_3150", "Zusammenarbeit mit einer Karte die im TA1 Byte des ATR der Wert ‚97’ zurückliefert"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3151("TIP1-A_3151", "UNICast basierte Dienstanfragepakete"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3152("TIP1-A_3152", "KT: Update-Komponente innerhalb des LAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3153("TIP1-A_3153", "Update-Varianten für eHealth-Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3154("TIP1-A_3154", "Authentisierung für weiteren Werksreset-Mechanismus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3158("TIP1-A_3158", "TSP-Update-Mechanismus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3159("TIP1-A_3159", "TSP-Update-Mechanismus für KT ohne Firmware-Update"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3160("TIP1-A_3160", "Mehrwertmodule auf KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3161("TIP1-A_3161", "Mehrwertmodule KT de-/aktivierbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3162("TIP1-A_3162", "Erkennbarkeit, ob Mehrwertmodul aktiv ist"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3170("TIP1-A_3170", "Ausführen eines zulässigen Downgrades"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3177("TIP1-A_3177", "Ausführung des Kommandos EHEALTH TERMINAL AUTHENTICATE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3180("TIP1-A_3180", "Zugriff auf DF.KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3181("TIP1-A_3181", "Priorisierung DF.KT Zugriff"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3182("TIP1-A_3182", "Erkennung von Übertragungsfehlern und nicht authentischen Übertragungen während eines Firmware-Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3183("TIP1-A_3183", "selbständige Übertragungsfehlererkennung bei KT-Firmware-Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3184("TIP1-A_3184", "KT-Unterstützung des anonymen Zugriffs für Rolle CT CONTROL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3185("TIP1-A_3185", "Ablage des Sicherheitsankers in einem schreibgeschützten Bereich des KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3188("TIP1-A_3188", "Erhaltung Konfigurationen nach Update"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3189("TIP1-A_3189", "Unterstützung IPv4"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3190("TIP1-A_3190", "Unterstützung IPv6"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3191("TIP1-A_3191", "Definition anonyme Session"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3192("TIP1-A_3192", "Anforderungen an Slotsiegel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3227("TIP1-A_3227", "Umsetzung der KT-Identität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3229("TIP1-A_3229", "Schutz vor Auslesen des Shared Secrets"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3231("TIP1-A_3231", "TLS-Verbindung: einseitige Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3232("TIP1-A_3232", "Sicherung administrativer TLS-Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3233("TIP1-A_3233", "Einseitige Authentisierung während des Aufbaus der administrativen TLS-Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3234("TIP1-A_3234", "Private Schlüssel zur Sicherung des administrativen TLS-Kanals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3235("TIP1-A_3235", "Öffentliche Schlüssel und Zertifikate zur Sicherung des administrativen TLS-Kanals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3236("TIP1-A_3236", "Kennworteingabe bei der Aktivierung einer weiteren Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3239("TIP1-A_3239", "Persistente Speicherung im Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3241("TIP1-A_3241", "Abweichung von [gemSpec_Krypt#2.2]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3242("TIP1-A_3242", "Nicht SICCT-spezifische TLS-Verbindungen und [gemSpec_Krypt#2.2]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3243("TIP1-A_3243", "Initiales Pairing"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3244("TIP1-A_3244", "Außerbetriebnahme eines eHealth-Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3245("TIP1-A_3245", "Keine Veränderung bei fehlerhafter oder nicht authentischer Übertragung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3246("TIP1-A_3246", "Port der netzwerkbasierten Managementschnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3247("TIP1-A_3247", "Statusmeldung der Chipkarte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3248("TIP1-A_3248", "Notentnahme vor Ort"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3249("TIP1-A_3249", "Zugriff auf die Plug-In-Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3250("TIP1-A_3250", "Deadlock während Kartenkommunikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3251("TIP1-A_3251", "„CONTROL COMMAND“-Kommando"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3253("TIP1-A_3253", "Kommunikation gemäß SICCT-Protokoll"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3255("TIP1-A_3255", "CA-Zertifikate der relevanten TSP speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3256("TIP1-A_3256", "CA-Zertifikate in Kartenterminal und anschließende Speicherung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3257("TIP1-A_3257", "Schutz CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3258("TIP1-A_3258", "Beendigung SICCT-spezifische TLS-Verbindung, resetten der Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3259("TIP1-A_3259", "Beendigung SICCT-spezifische TLS-Verbindung, Verlust der Sicherheitszustände"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3260("TIP1-A_3260", "Netzwerkbasierten Managementschnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3261("TIP1-A_3261", "alleinige KT-Kontrolle über Anzeigemechanismus Diensttypaktivität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3262("TIP1-A_3262", "SM-KT-Identität für Mehrwertmodule nutzbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3263("TIP1-A_3263", "Dokumentation der Konfiguration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3264("TIP1-A_3264", "Return Code Control Command"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3265("TIP1-A_3265", "Ergänzung Sicherheitsprotokolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3266("TIP1-A_3266", "Kartenkommandos ablehnen bei nicht vorhandenem Pairing"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3412("TIP1-A_3412", "Nähere Beschreibung Rolle Administrator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3413("TIP1-A_3413", "Prüfung Authentizität und Integrität bei Inbetriebnahme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3415("TIP1-A_3415", "Sicherung der Netzwerkkommunikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3416("TIP1-A_3416", "Prüfung Stellen des Kennwortes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3417("TIP1-A_3417", "Möglichkeit zum Werksreset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3418("TIP1-A_3418", "Werksreset nicht dauerhaft unausführbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3420("TIP1-A_3420", "Weiterer Mechanismus für Werksreset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3421("TIP1-A_3421", "PUK-Verfahren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3422("TIP1-A_3422", "PUK-Eingabe bei Inbetriebnahme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3423("TIP1-A_3423", "Fehlerzähler PUK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3424("TIP1-A_3424", "Werksreset Administrator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3425("TIP1-A_3425", "Dokumentation Werksreset Mechanismus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3926("TIP1-A_3926", "Karten-Kompatibilität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3927("TIP1-A_3927", "Kontaktschonende Kontaktiereinheiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3929("TIP1-A_3929", "Landende Kontakte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3930("TIP1-A_3930", "Physikalische Sicherheit-Klima"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3932("TIP1-A_3932", "Physikalische Sicherheit-Vibration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3933("TIP1-A_3933", "Mathematische Prüfung Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3934("TIP1-A_3934", "Ermittlung Zertifikatsrolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3935("TIP1-A_3935", "Vergleich Zertifikatsrolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3936("TIP1-A_3936", "Durchsuchen CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3937("TIP1-A_3937", "Einbringen CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3938("TIP1-A_3938", "Darstellung Selbstauskunft"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3939("TIP1-A_3939", "Darstellung Firmware-Gruppen-Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3940("TIP1-A_3940", "Zertifikat prüfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3941("TIP1-A_3941", "Update von TSP-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3942("TIP1-A_3942", "Belastbarkeit des Netzteils"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3944("TIP1-A_3944", "Einführung oder Entnahme der Chipkarte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3947("TIP1-A_3947", "Dokumentation Einbringung Serverzertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3948("TIP1-A_3948", "CTM Festlegung für eHealth"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4115("TIP1-A_4115", "Sicherstellung CA Berechtigung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5083("TIP1-A_5083", "Anforderungen PUK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5424("TIP1-A_5424", "Ausführung eines Werksreset ohne Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5425("TIP1-A_5425", "Aktivierung/Deaktivierung des Werksreset ohne Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5426("TIP1-A_5426", "Standardeinstellung Werksreset ohne Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5656("TIP1-A_5656", "Unterstützung Auto-IP-Protokoll optional"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6481("TIP1-A_6481", "Firmwarelieferung via P_KSRS_Upload Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6482("TIP1-A_6482", "Anzahl CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6483("TIP1-A_6483", "SICCT MODIFY VERIFICATION DATA Displaynachricht und PIN-Prompt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6541("TIP1-A_6541", "Benutzerfreundlichkeit und weitere Kennwort-/PIN-Eingaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6717("TIP1-A_6717", "gSMC-KT Verantwortung durch den Hersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6718("TIP1-A_6718", "Bezugsquellen gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6719("TIP1-A_6719", "Prüfung von Authentizität und Integrität der gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6720("TIP1-A_6720", "Verwendung zugelassener Gerätekarten gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_7016("TIP1-A_7016", "Prüfung der personalisierten gSMC-KT"),

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
