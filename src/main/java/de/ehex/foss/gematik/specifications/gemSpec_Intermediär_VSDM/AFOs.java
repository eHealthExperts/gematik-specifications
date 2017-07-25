package de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;
import de.ehex.foss.gematik.specifications.AfoHistory;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Intermediär_VSDM]}.
 *
 * @author Alexander Walter
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    VSDM_A_2348("VSDM-A_2348", "Intermediär VSDM: Ermitteln der URL des Fachdienstes"),

    VSDM_A_2349("VSDM-A_2349", "Intermediär VSDM: Lokalisierungsinformation zwischenspeichern"),

    VSDM_A_2350("VSDM-A_2350", "Intermediär VSDM: konfigurierbare Parameter"),

    VSDM_A_2351("VSDM-A_2351", "Intermediär VSDM: konfigurierbare Admissions für den Verbindungsaufbau zu den Fachdiensten"),

    VSDM_A_2353("VSDM-A_2353", "Intermediär VSDM: HTTP-Fehlermeldungen erstellen"),

    VSDM_A_2356("VSDM-A_2356", "Intermediär VSDM: Performanceprotokoll mit Feldern schreiben"),

    VSDM_A_2357("VSDM-A_2357", "Intermediär VSDM: Performanceprotokoll für Performancevorgaben schreiben"),

    VSDM_A_2358("VSDM-A_2358", "Intermediär VSDM: Fehlerprotokoll mit Feldern schreiben"),

    VSDM_A_2359("VSDM-A_2359", "Intermediär VSDM: Ablaufprotokoll mit Feldern schreiben"),

    VSDM_A_2547("VSDM-A_2547", "Intermediär VSDM: konfigurierbare Parameter für den Verbindungsaufbau zum Fachmodul"),

    VSDM_A_2548("VSDM-A_2548", "Intermediär VSDM: konfigurierbare Parameter für den Verbindungsaufbau zum Fachdienste"),

    VSDM_A_2549("VSDM-A_2549", "Intermediär VSDM: konfigurierbare Parameter für Cipher-Suiten"),

    VSDM_A_2550("VSDM-A_2550", "Intermediär VSDM: konfigurierbare Admissions für den Verbindungsaufbau zum Fachmodul"),

    VSDM_A_2669("VSDM-A_2669", " Intermediär VSDM: Zugriff nur für autorisierte Personen"),

    VSDM_A_2673("VSDM-A_2673", "Intermediär VSDM: Vorgangsnummer bilden"),

    VSDM_A_2704("VSDM-A_2704", "Intermediär VSDM: De-/Aktivieren der Protokollierung"),

    VSDM_A_2706("VSDM-A_2706", "Intermediär VSDM: Performancevorgaben Verbindungsversuche"),

    VSDM_A_2707("VSDM-A_2707", "Intermediär VSDM: HTTP Header-Field Via hinzufügen"),

    @AfoHistory(documentVersion = "gemProdT_Intermediaer_VSDM_PTV140_V100", description = "Von der gematik als KANN- zu MUSS-Anforderung verändert, ohne dass es als neue AFO formuliert wurde.")
    VSDM_A_2712("VSDM-A_2712", "Intermediär VSDM: Verzeichnisdienst aufrufen"),

    VSDM_A_2747("VSDM-A_2747", "Intermediär VSDM: keine personbezogenen Daten im Performanceprotokoll"),

    VSDM_A_2748("VSDM-A_2748", "Intermediär VSDM: Löschen von pseudonymisierten Daten in Protokollen innerhalb von 180 Tagen"),

    VSDM_A_2761("VSDM-A_2761", "Intermediär VSDM: Mechanismen zur Anonymisierung"),

    VSDM_A_2940("VSDM-A_2940", "Intermediär VSDM: Verbot zum Speicherung von personbezogene Daten in Protokolldateien"),

    VSDM_A_2942("VSDM-A_2942", "Intermediär VSDM: Debugprotokoll schreiben"),

    VSDM_A_2943("VSDM-A_2943", "Intermediär VSDM: Sicherheitsprotokoll schreiben"),

    VSDM_A_3006("VSDM-A_3006", "Intermediär VSDM: Eintrag von SRV Resource Records in der DNS Domain der Service Zone TI"),

    VSDM_A_3021("VSDM-A_3021", "Intermediär VSDM: Kein Pipelining"),

    VSDM_A_3022("VSDM-A_3022", "Intermediär VSDM: Connection Pooling zu Fachdiensten"),

    VSDM_A_3023("VSDM-A_3023", "Intermediär VSDM: Zusätzliche Verbindungen zu Fachdiensten"),

    @AfoHistory(documentVersion = "gemSpec_Intermediär_VSDM, Version 1.6.0 RC 2", description = "Titel nicht vollständig, da PTStB nicht released")
    VSDM_A_3028("VSDM-A_3028", "Intermediär VSDM: Zusätzliche Verbindungen zu Fachdiensten wieder schließen"),

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
