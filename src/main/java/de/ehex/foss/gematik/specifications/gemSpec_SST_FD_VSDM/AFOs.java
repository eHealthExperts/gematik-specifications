package de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_SST_FD_VSDM]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2189("VSDM-A_2189", "Fachmodul VSDM: WS-I Basic Profile in der Version 1.2 umsetzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2190("VSDM-A_2190", "Fachmodul VSDM: Nachrichten konform zu WSDL- und Schemadateien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2194("VSDM-A_2194", "Fachmodul VSDM: mit TLS-Client X.509-Zertifikat authentifizieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2199("VSDM-A_2199", "Fachmodul VSDM: HTTP-Komprimierung nutzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2200("VSDM-A_2200", "Fachmodul VSDM: HTTP-Komprimierung unterstützen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2202("VSDM-A_2202", "Fachmodul VSDM: nur spezifizierte Header-Elemente"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2203("VSDM-A_2203", "Fachmodul VSDM: keine Whitespaces"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2204("VSDM-A_2204", "Fachmodul VSDM: Antwortnachrichten validieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2205("VSDM-A_2205", "Fachmodul VSDM: invalide Antwortnachrichten erkennen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2206("VSDM-A_2206", "Fachmodul VSDM: auf zulässige Werte validieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2207("VSDM-A_2207", "Fachmodul VSDM: Toleranz gegenüber zusätzlichen Elementen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2208("VSDM-A_2208", "Fachmodul VSDM: beliebige Reihenfolge der Header-Elemente"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2209("VSDM-A_2209", "Fachmodul VSDM: Endpunkt-Adresse mit Lokalisierungsinformation bilden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2211("VSDM-A_2211", "Fachmodul VSDM: Lokalisierungsinformationen gemäß dem Schema bilden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2212("VSDM-A_2212", "Fachmodul VSDM: Sessionformationen gemäß Schema bilden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2213("VSDM-A_2213", "Fachmodul VSDM: SOAP Faults ohne gematik-Fehlerstruktur verarbeiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2214("VSDM-A_2214", "Fachmodul VSDM: HTTP-Fehlermeldungen verarbeiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2215("VSDM-A_2215", "Fachmodul VSDM: Header-Feld 'Via' auswerten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2216("VSDM-A_2216", "Fachmodul VSDM: gematik SOAP Faults verarbeiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2217("VSDM-A_2217", "Fachmodul VSDM: Nachrichten grundsätzlich nicht speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2218("VSDM-A_2218", "Fachmodul VSDM: Fehlermeldung speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2219("VSDM-A_2219", "Fachmodul VSDM: Anfragenachricht zu einer Fehlermeldung speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2226("VSDM-A_2226", "Fachanwendung VSDM: Verbindung offen halten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2235("VSDM-A_2235", "Fachmodul VSDM: Trennzeichen in der URL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2282("VSDM-A_2282", "Fachmodul VSDM: RequestHeader bei Aufruf GetUpdateFlags"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2285("VSDM-A_2285", "Fachmodul VSDM: optionale Updates nicht ausführen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2298("VSDM-A_2298", "Fachmodul VSDM: Sessioninformation für GetNextCommandPackage übernehmen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2303("VSDM-A_2303", "Fachmodul VSDM: Request-Header bei Aufruf PerformUpdates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2308("VSDM-A_2308", "Fachmodul VSDM: Operation PerformUpdates aufrufen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2310("VSDM-A_2310", "Fachmodul VSDM: Operation PerformUpdates aufrufen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2311("VSDM-A_2311", "Fachmodul VSDM: Operation GetNextCommandPackage aufrufen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2312("VSDM-A_2312", "Fachmodul VSDM: Toleranz gegenüber nicht verarbeiteten Elementen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2318("VSDM-A_2318", "Fachmodul VSDM: Kommando-APDUs unverändert durchreichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2321("VSDM-A_2321", "Fachmodul VSDM: Request-Header bei Aufruf GetNextCommandPackage"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2335("VSDM-A_2335", "Fachmodul VSDM: AdditionalInfo nicht nutzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2552("VSDM-A_2552", "Fachmodul VSDM: Abbruch bei unerwarteten Status-Code"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2553("VSDM-A_2553", "Fachmodul VSDM: Response bei unerwarteten Statuscode"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2596("VSDM-A_2596", "ReadVSD: Umsetzung des Anwendungsfalls 'VSDM-UC_01: VSD von eGK lesen'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2608("VSDM-A_2608", "ReadKVK: Umsetzung des Anwendungsfalls 'VSDM-UC_03: Versichertendaten von KVK lesen'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2631("VSDM-A_2631", "ReadVSD: ErrorCode im Prüfungsnachweis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2633("VSDM-A_2633", "I_VSDService: Implementierung ReadVSD gemäß WSDL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2634("VSDM-A_2634", "ReadVSD: Ausgangsparameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2647("VSDM-A_2647", "ReadVSD: GVD in Antwort optional"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2658("VSDM-A_2658", "Schnittstelle Primärsystem: BasicProfile 1.2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2675("VSDM-A_2675", "Schnittstelle Primärsystem: invalide Anfragenachrichten erkennen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2676("VSDM-A_2676", "Schnittstelle Primärsystem: zusätzliche Headerelemente"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2677("VSDM-A_2677", "I_KVKService: Implementierung ReadKVK gemäß WSDL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2678("VSDM-A_2678", "Schnittstelle Primärsystem: Transportsicherung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2682("VSDM-A_2682", "Fachmodul VSDM: Keine sicherheitsreleveanten Informationen im Fehlermeldungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2689("VSDM-A_2689", "Schnittstelle Primärsystem: auf zulässige Werte prüfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2690("VSDM-A_2690", "Fachmodul VSDM: Fehlercode bei nicht konsistenten VSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2691("VSDM-A_2691", "ReadVSD: Format der Ausgangsparameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2692("VSDM-A_2692", "Fachmodul VSDM: Lesen oder Dekomprimieren der VSD von der eGK scheitert"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2693("VSDM-A_2693", "ReadVSD: Eingangsparameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2695("VSDM-A_2695", "Fachmodul VSDM: Lesen der Daten von der KVK scheitert"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2696("VSDM-A_2696", "Fachmodul VSDM: Prüfsumme des KVK-Satzes falsch"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2703("VSDM-A_2703", "Schnittstelle Primärsystem: nur erlaubte Header in Antwortnachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2710("VSDM-A_2710", "ReadKVK: Eingangsparameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2711("VSDM-A_2711", "ReadKVK: Ausgangsparameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2936("VSDM-A_2936", "Fachmodul VSDM: Prüfungsnachweis nicht entschlüsselbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2937("VSDM-A_2937", "Fachmodul VSDM: Es ist kein Prüfungsnachweis auf der eGK vorhanden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2951("VSDM-A_2951", "Fachmodul VSDM: Erstellung von Performance-Berichten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2956("VSDM-A_2956", "Fachmodul VSDM: generische Fehlermeldungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2982("VSDM-A_2982", "Fachmodul VSDM: Fehlermeldung: SM-B nicht freigeschaltet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2983("VSDM-A_2983", "Fachmodul VSDM: Fehlermeldung: HBA nicht freigeschaltet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2999("VSDM-A_2999", "Fachdienst VSDD CMS: Logging von Fehlerzuständen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3003("VSDM-A_3003", "Verschlüsselter Transport durch Fachmodul VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3008("VSDM-A_3008", "Fachmodul VSDM: Response bei Abbruch"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3066("VSDM-A_3066", "Fachmodul VSDM: Kein Pipelining"),

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
