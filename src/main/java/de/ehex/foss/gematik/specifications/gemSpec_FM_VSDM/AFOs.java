package de.ehex.foss.gematik.specifications.gemSpec_FM_VSDM;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_FM_VSDM]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2563("VSDM-A_2563", "Fachmodul VSDM: Abbruch nach Timeout"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2565("VSDM-A_2565", "Fachmodul VSDM: parallele Verarbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2566("VSDM-A_2566", "Fachmodul VSDM: konfigurierbare Parameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2567("VSDM-A_2567", "ReadVSD: VD, PD und Status-Container lesen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2568("VSDM-A_2568", "ReadVSD: gesperrte Gesundheitsanwendung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2569("VSDM-A_2569", "ReadVSD: AUT-Zertifikat der eGK offline ungültig"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2570("VSDM-A_2570", "ReadVSD: AUT-Zertifikat der eGK online ungültig"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2571("VSDM-A_2571", "ReadVSD: technischer Fehler"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2572("VSDM-A_2572", "ReadVSD: GVD in Antwort enthalten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2573("VSDM-A_2573", "ReadVSD: Echheitsprüfung eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2574("VSDM-A_2574", "ReadVSD: Echtheitsprüfung SM-B/HBA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2575("VSDM-A_2575", "ReadVSD: Prüfungsnachweis wenn erstellt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2576("VSDM-A_2576", "ReadVSD: Prüfungsnachweis von der eGK, wenn möglich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2577("VSDM-A_2577", "ReadVSD: Prüfungsnachweis lesen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2578("VSDM-A_2578", "ReadVSD: Prüfungsnachweis erzeugen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2579("VSDM-A_2579", "ReadVSD: Prüfungsnachweis schreiben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2580("VSDM-A_2580", "Fachmodul VSDM: ReadVSD - Aktualisierungsaufträge ermitteln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2581("VSDM-A_2581", "ReadVSD: Aktualisierung durchführen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2582("VSDM-A_2582", "ReadVSD: Aktualisierungsaufträge ermitteln wegen gesperrter Gesundheitsanwendung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2583("VSDM-A_2583", "ReadVSD: Aktualisierungsaufträge ermitteln wegen offline ungültigem AUTH-Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2584("VSDM-A_2584", "ReadVSD: Aktualisierungsaufträge ermitteln wegen online ungültigem AUTH-Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2585("VSDM-A_2585", "ReadVSD: Aktualisierung CMS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2586("VSDM-A_2586", "ReadVSD: Protokollierung VSD-Aktualisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2587("VSDM-A_2587", "ReadVSD: Protokollierung GVD Lesen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2588("VSDM-A_2588", "Fachmodul VSDM: Prüfungsnachweis erstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2589("VSDM-A_2589", "Fachmodul VSDM: Prüfungsnachweis-Ergebnis erstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2590("VSDM-A_2590", "Fachmodul VSDM: Prüfungsnachweis komprimieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2591("VSDM-A_2591", "Fachmodul VSDM: Prüfungsnachweis verschlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2592("VSDM-A_2592", "Fachmodul VSDM: Prüfungsnachweis entschlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2594("VSDM-A_2594", "Fachmodul VSDM: Variante - Prüfungsnachweis nicht vorhanden."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2595("VSDM-A_2595", "Fachmodul VSDM: Variante - Prüfungsnachweis nicht entschlüsselbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2597("VSDM-A_2597", "Fachmodul VSDM: Aktualisierungsaufträge ermitteln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2601("VSDM-A_2601", "Fachmodul VSDM: Aktualisierungsaufträge durchführen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2602("VSDM-A_2602", "Fachmodul VSDM: Reihenfolge der Abarbeitung der Aktualisierungsaufträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2603("VSDM-A_2603", "Fachmodul VSDM: Seperate Aktualisierungen für mehere UpdateIds"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2604("VSDM-A_2604", "ReadVSD: Fehlermeldung wenn Gesundheitsanwendung im Ablauf gesperrt wird"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2605("VSDM-A_2605", "ReadVSD: Keine Fehlermeldung wenn Gesundheitsanwendung im Ablauf entsperrt wird"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2606("VSDM-A_2606", "Fachmodul VSDM: Abbruch aller weiteren Aktualisierungen bei Fehler in einer Aktualisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2607("VSDM-A_2607", "Fachmodul VSDM: alte Versionen der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2609("VSDM-A_2609", "ReadKVK: Versichertendaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2611("VSDM-A_2611", "ReadKVK: Abbruch bei fehlgeschlagener Prüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2612("VSDM-A_2612", "Fachmodul VSDM: Umsetzung des Anwendungsfalls 'VSDM-UC_02: Automatische Onlineprüfung VSD'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2613("VSDM-A_2613", "Fachmodul VSDM: Aufruf der Operation AutoUpdateVSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2614("VSDM-A_2614", "AutoUpdateVSD: Prüfungsnachweis erzeugen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2615("VSDM-A_2615", "AutoUpdateVSD: Prüfungsnachweis schreiben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2616("VSDM-A_2616", "Fachmodul VSDM: AutoUpdateVSD - Texte für Anzeige am Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2619("VSDM-A_2619", "AutoUpdateVSD: Aktualisierungsaufträge ermitteln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2620("VSDM-A_2620", "AutoUpdateVSD: Aktualisierung durchführen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2621("VSDM-A_2621", "AutoUpdateVSD: Echheitsprüfung eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2622("VSDM-A_2622", "AutoUpdateVSD: Echtheitsprüfung SMC-B/HBA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2623("VSDM-A_2623", "AutoUpdateVSD: Protokollierung VSD-Aktualisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2624("VSDM-A_2624", "AutoUpdateVSD: Fehlermeldung wenn Gesundheitsanwendung im Ablauf gesperrt wird"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2625("VSDM-A_2625", "AutoUpdateVSD: Keine Fehlermeldung wenn Gesundheitsanwendung im Ablauf entsperrt wird"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2626("VSDM-A_2626", "ReadKVK: Ablauf des Gültigkeitsdatums"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2635("VSDM-A_2635", "Fachmodul VSDM: keine Protokollierung von medizinischen Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2636("VSDM-A_2636", "Fachmodul VSDM: Protokollierung im einheitlichen Format"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2637("VSDM-A_2637", "Fachmodul VSDM: Zugriff nur für autorisierte Personen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2638("VSDM-A_2638", "Fachmodul VSDM: Felder im Ablaufprotokoll"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2639("VSDM-A_2639", "Fachmodul VSDM: Felder im Performance-Protokoll"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2642("VSDM-A_2642", "Fachmodul VSDM: Verarbeitungszeiten anderer Systeme im Performance-Protokoll"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2644("VSDM-A_2644", "Fachmodul VSDM: Protokolldateien kopieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2649("VSDM-A_2649", "Fachmodul VSDM: Protokolldateien begrenzen auf 180 Tage, Datenschutz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2650("VSDM-A_2650", "Fachmodul VSDM: Vorgangsnummer bilden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2651("VSDM-A_2651", "Fachmodul VSDM: Felder im Fehler-Protokoll"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2652("VSDM-A_2652", "ReadVSD: Daten base64-kodiert"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2653("VSDM-A_2653", "Fachmodul VSDM: Prüfungsnachweis - ErrorCode"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2654("VSDM-A_2654", "Fachmodul VSDM: Abbruch wenn Protokoll nicht auf eGK geschrieben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2655("VSDM-A_2655", "Fachmodul VSDM: Prüfungsnachweis überschreiben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2660("VSDM-A_2660", "ReadVSD: inkonsistente VSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2662("VSDM-A_2662", "ReadVSD: Abbruch C2C wenn Aktualisierungen vorliegen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2664("VSDM-A_2664", "Fachmodul VSDM: Ereignisdienst - maximale Offlinezeit überschritten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2665("VSDM-A_2665", "Fachmodul VSDM: Ereignisdienst - für Topics registrieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2667("VSDM-A_2667", "Fachmodul VSDM: Ereignisdienst - Texte für Fortschritt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2668("VSDM-A_2668", "Fachmodul VSDM: Endpunkt-Adresse des Intermediärs bilden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2687("VSDM-A_2687", "Fachmodul VSDM: unterstützte Versionen der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2708("VSDM-A_2708", "Fachmodul VSDM: Werte für StatusVD in Antwortnachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2745("VSDM-A_2745", "Fachmodul VSDM: Schlüssel für Prüfungsnachweis mandantenfähig ablegen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2749("VSDM-A_2749", "Fachmodul VSDM: zugehörige Nachrichten zum Fehler"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2750("VSDM-A_2750", "Fachmodul VSDM: automatisches Löschen innerhalb 30 Tage"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2752("VSDM-A_2752", "Fachmodul VSDM: Aktualisierungsaufträge einzeln ausführen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2770("VSDM-A_2770", "Fachmodul VSDM: Prüfungsnachweis minimieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2772("VSDM-A_2772", "ReadVSD: Prüfungsnachweis parallelisiert schreiben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2775("VSDM-A_2775", "ReadVSD: Aufrufkontext prüfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2776("VSDM-A_2776", "Fachmodul VSDM: Schlüssel aus Eingabe ableiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2777("VSDM-A_2777", "Fachmodul VSDM: Schlüssel und Prüfungsnachweis mandantenfähig"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2778("VSDM-A_2778", "Fachmodul VSDM: Anzeige Masterschlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2779("VSDM-A_2779", "Fachmodul VSDM: Masterschlüssel zufällig erzeugen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2784("VSDM-A_2784", "ReadVSD: GVD nicht aus dem Container EF.VD lesen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2789("VSDM-A_2789", "Fachmodul VSDM: keine Protokollierung von Schlüsselmaterial"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2791("VSDM-A_2791", "Fachmodul VSDM: Ausführungszeiten im Performance-Protokoll"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2792("VSDM-A_2792", "Fachmodul VSDM: ReadVSD in den Dienstverzeichnisdienst einbringen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2793("VSDM-A_2793", "Fachmodul VSDM: ReadKVK in den Dienstverzeichnisdienst einbringen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2874("VSDM-A_2874", "Fachmodul VSDM: keine Protokollierung von personenbezogenen Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2944("VSDM-A_2944", "Fachmodul VSDM: Debugprotokoll schreiben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2979("VSDM-A_2979", "Fachmodul VSDM: unterstützte Versionen der VSDM Speichertrukturen auf der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2981("VSDM-A_2981", "Fachmodul VSDM: Kartenterminal - Texte für Fortschritt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2989("VSDM-A_2989", "Fachmodul VSDM: Speicherstruktur des Containers EF.Prüfungsnachweises auf der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2998("VSDM-A_2998", "Fachmodul VSDM: Abbruch der Operation ReadVSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3004("VSDM-A_3004", "Fachmodul VSDM: Benutzerdokumentation: Verwendung unterschiedlicher Schlüssel VSDM-PNW-Key"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3007("VSDM-A_3007", "Fachmodul VSDM: Ermitteln der URL des zugeordneten VSDM Intermediärs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3020("VSDM-A_3020", "Fachmodul VSDM: Konfiguration des Context zum Aufruf der Operation AutoUpdateVSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3033("VSDM-A_3033", "Fachmodul VSDM: kein Prüfungsnachweis wenn Online nicht aktiviert"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3067("VSDM-A_3067", "Prüfungsnachweis protokollieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3070("VSDM-A_3070", "ICCSN der eGK im Fehlerprotokoll speichern"),

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