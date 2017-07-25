package de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM;

import static de.ehex.foss.gematik.specifications.AFOType.MAY;
import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static de.ehex.foss.gematik.specifications.AFOType.SHOULD;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;
import de.ehex.foss.gematik.specifications.AfoHistory;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_SST_VSDM]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    VSDM_A_2222("VSDM-A_2222", "Intermediär VSDM: mit TLS-Client X.509-Zertifikat authentifizieren"),

    VSDM_A_2223("VSDM-A_2223", "Intermediär VSDM: TLS-Server X.509-Zertifikat der Fachdienste VSDM auf Gültigkeit prüfen"),

    VSDM_A_2225("VSDM-A_2225", "Fachanwendung VSDM: Fachmodul VSDM, Intermediär VSDM: TLS Session Resumption mittels Session-ID nutzen"),

    VSDM_A_2226("VSDM-A_2226", "Fachanwendung VSDM: Verbindung offen halten", SHOULD),

    VSDM_A_2227("VSDM-A_2227", "Intermediär VSDM: mit TLS-Server X.509-Zertifikat authentifizieren"),

    VSDM_A_2228("VSDM-A_2228", "Intermediär VSDM: TLS-Client X.509-Zertifikat des Fachmoduls VSDM auf Gültigkeit prüfen"),

    VSDM_A_2231("VSDM-A_2231", "Intermediär VSDM: Nachrichten nicht validieren"),

    VSDM_A_2233("VSDM-A_2233", "Intermediär VSDM: Nachrichten unverändert durchreichen"),

    VSDM_A_2234("VSDM-A_2234", "Intermediär VSDM: Lokalisierung der Fachdienste VSDM"),

    VSDM_A_2236("VSDM-A_2236", "Intermediär VSDM: keine Implementierungsdetails in Fehlermeldung"),

    VSDM_A_2238("VSDM-A_2238", "Intermediär VSDM: Nachrichten grundsätzlich nicht speichern"),

    VSDM_A_2240("VSDM-A_2240", "Intermediär VSDM: eingehende Nachricht zu einer Fehlermeldung speichern"),

    VSDM_A_2241("VSDM-A_2241", "Fachdienste VSDM: WS-I Basic Profile in der Version 1.2 umsetzen"),

    VSDM_A_2242("VSDM-A_2242", "Fachdienste VSDM: Nachrichten konform zu WSDL- und Schemadateien"),

    VSDM_A_2253("VSDM-A_2253", "Fachdienste VSDM: mit TLS-Server X.509-Zertifikat authentifizieren"),

    VSDM_A_2254("VSDM-A_2254", "Fachdienste VSDM: TLS-Client X.509-Zertifikat des Intermediärs VSDM auf Gültigkeit prüfen"),

    VSDM_A_2255("VSDM-A_2255", "Fachdienste VSDM: HTTP-Komprimierung unterstützen"),

    VSDM_A_2256("VSDM-A_2256", "Fachdienste VSDM: HTTP-Komprimierung nutzen"),

    VSDM_A_2257("VSDM-A_2257", "Fachdienste VSDM: invalide Anfragenachrichten erkennen"),

    VSDM_A_2258("VSDM-A_2258", "Fachdienste VSDM: auf zulässige Werte validieren"),

    VSDM_A_2259("VSDM-A_2259", "Fachdienste VSDM: Toleranz gegenüber zusätzlichen Elementen", SHOULD),

    VSDM_A_2260("VSDM-A_2260", "Fachdienste VSDM: beliebige Reihenfolge der Header-Elemente"),

    VSDM_A_2261("VSDM-A_2261", "Fachdienste VSDM: keine Whitespaces", SHOULD),

    VSDM_A_2262("VSDM-A_2262", "Fachdienste VSDM: nur spezifizierte Header-Elemente"),

    VSDM_A_2263("VSDM-A_2263", "Fachdienste VSDM: Anfragenachrichten validieren"),

    VSDM_A_2264("VSDM-A_2264", "Fachdienste VSDM: Sessionformationen vergeben und korrelieren"),

    VSDM_A_2266("VSDM-A_2266", "Fachdienste VSDM: keine Implementierungsdetails in Fehlermeldung"),

    VSDM_A_2267("VSDM-A_2267", "Fachdienste VSDM: Fehlermeldungen speichern", SHOULD),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2268("VSDM-A_2268", "Fachdienste VSDM: Nachrichten grundsätzlich nicht speichern"),

    VSDM_A_2269("VSDM-A_2269", "Fachdienste VSDM: mit SOAP Fault mit gematik-Fehlerstruktur antworten"),

    VSDM_A_2270("VSDM-A_2270", "Fachdienste VSDM: mit SOAP Faults ohne gematik-Fehlerstruktur antworten", MAY),

    VSDM_A_2271("VSDM-A_2271", "Intermediär VSDM: Fehlermeldungen unverändert durchreichen"),

    VSDM_A_2272("VSDM-A_2272", "Fachdienste VSDM: SOAP Fault mit einem Trace-Element"),

    VSDM_A_2273("VSDM-A_2273", "Fachdienste VSDM: eindeutig rückverfolgbare Fehlermeldungen"),

    VSDM_A_2274("VSDM-A_2274", "Fachdienste VSDM: Anfragenachricht zu einer Fehlermeldung speichern", SHOULD),

    VSDM_A_2279("VSDM-A_2279", "Fachdienste VSDM: HTTP-Fehlermeldung erzeugen", SHOULD),

    VSDM_A_2299("VSDM-A_2299", "Fachdienste VSDM: Sessioninformation prüfen"),

    VSDM_A_2301("VSDM-A_2301", "Fachdienste VSDM: Sessionformationen konfigurieren"),

    VSDM_A_2313("VSDM-A_2313", "Fachdienste VSDM: Toleranz gegenüber nicht verarbeiteten Elemente", SHOULD),

    VSDM_A_2330("VSDM-A_2330", "Fachdienste VSDM: abgelaufene Session erkennen"),

    VSDM_A_2674("VSDM-A_2674", "Intermediär VSDM: Anfragenachricht zu einer Fehlermeldung speichern"),

    VSDM_A_2902("VSDM-A_2902", "Fachdienste VSDM: mit SOAP Fault mit gematik-Fehlerstruktur antworten"),

    VSDM_A_2950("VSDM-A_2950", "Intermediär VSDM: Erstellung von Performance-Berichten"),

    VSDM_A_2952("VSDM-A_2952", "Fachdienste VSDM: Erstellung von Performance-Berichten"),

    VSDM_A_2955("VSDM-A_2955", "Fachdienste VSDM: generische Fehlermeldungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2958("VSDM-A_2958", "Fachdienste VSDM: Lesen von Log-Einträgen"),

    VSDM_A_3001("VSDM-A_3001", "Verschlüsselter Transport durch Fachdienste VSDM"),

    VSDM_A_3002("VSDM-A_3002", "Verschlüsselter Transport durch Intermediär VSDM"),

    @AfoHistory(documentVersion = "gemSpec_SST_VSDM_V1.8.0_RC", description = "Aus OPB1-Paket - ist State of Change und noch nicht released")
    VSDM_A_3026("VSDM-A_3026", "Intermediär VSDM: kein Session Ressumption zu Fachdienste VSDM"),

    @AfoHistory(documentVersion = "gemSpec_SST_VSDM_V1.8.0_RC", description = "Aus OPB1-Paket - ist State of Change und noch nicht released")
    VSDM_A_3027("VSDM-A_3027", "Fachanwendung VSDM: Bedingung Rollenprüfung für HTTPS-Verbindungsaufbau"),

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
