package de.ehex.foss.gematik.specifications.gemSpec_CVC_Root;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_CVC_Root]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5173("TIP1-A_5173", "Inhalt der Ausgabepolicy der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5174("TIP1-A_5174", "Inhalt des Sicherheitskonzepts der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5175("TIP1-A_5175", "Darstellung der Zusammenarbeit verschiedener Organisationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5176("TIP1-A_5176", "Betrieb der CVC-Root-CA nach Zulassung der gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5182("TIP1-A_5182", "Verlust der Verfügbarkeit der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5183("TIP1-A_5183", "Verwendung des Schlüsselpaars der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5184("TIP1-A_5184", "Begrenzung der Lebensdauer des Schlüsselpaars der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5185("TIP1-A_5185", "Maximale Gültigkeitsdauer des Schlüsselpaars der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5186("TIP1-A_5186", "Ablauf der Gültigkeitsdauer des privaten Schlüssels der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5187("TIP1-A_5187", "Weiterverwendung des privaten Schlüssels einer CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5188("TIP1-A_5188", "Vernichtung nicht mehr benötigter Schlüssel durch die CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5189("TIP1-A_5189", "Vernichtung der privaten Schlüssel bei Verlust der Zulassung der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5190("TIP1-A_5190", "Maßnahmen zur Vernichtung der Schlüsselpaare durch die CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5191("TIP1-A_5191", "Information über die Vernichtung aller Schlüsselpaare durch die CVC-Root-CA an gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5192("TIP1-A_5192", "Einsatz eines HSM, CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5193("TIP1-A_5193", "Schlüsselgenerierung im HSM der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5194("TIP1-A_5194", "Speicherung und Anwendung des privaten Schlüssels in einem gemSpec_CVC_Root HSM,"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5195("TIP1-A_5195", "Einsatz einer Chipkarte als HSM, CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5196("TIP1-A_5196", "Ordnungsgemäße Sicherung des privaten Schlüssels der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5197("TIP1-A_5197", "Verwendung von privaten Schlüsseln einer CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5198("TIP1-A_5198", "Evaluierung von HSMs - CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5199("TIP1-A_5199", "Vorgaben an die Funktionalität des HSM der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5200("TIP1-A_5200", "Nutzung eines HSM nach erfolgreicher Benutzerauthentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5201("TIP1-A_5201", "Speicherung und Auswahl von Schlüsselpaaren im HSM der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5202("TIP1-A_5202", "Keine Weitergabe sensitiver Schlüssel durch die CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5203("TIP1-A_5203", "Verwendung eines Backup-HSMs durch die CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5204("TIP1-A_5204", "Backup-HSMs - sicherer Schlüsseltransport CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5205("TIP1-A_5205", "Schlüsselbackup bei der gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5206("TIP1-A_5206", "Verfahrensbeschreibung Datensicherung der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5207("TIP1-A_5207", "Quorum der Wiederherstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5208("TIP1-A_5208", "Import aktuell genutzter CVC-Root-Schlüsselpaare"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5212("TIP1-A_5212", "Wechsel der Schlüsselversion bei der CVC-Root-CA, Cross-Zertifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5213("TIP1-A_5213", "Wechsel der Schlüsselversion bei der CVC-Root-CA, Verfügbarkeit der Crosszertifizierungsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5214("TIP1-A_5214", "Wechsel der Schlüsselversion bei der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5215("TIP1-A_5215", "Planmäßiger Wechsel der Schlüsselversion bei der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5216("TIP1-A_5216", "Planmäßiger Wechsel der Schlüsselversion bei der CVC-Root- CA, Erzeugung des Cross-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5219("TIP1-A_5219", "Schlüsselerzeugung nach Anordnung durch die gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5220("TIP1-A_5220", "Protokollierung durch die CVC-Root-CA - Ereignisse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5221("TIP1-A_5221", "Protokollierung durch die CVC-Root-CA - Werte pro Ereignis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5223("TIP1-A_5223", "Protokollierung durch die CVC-Root-CA - Aktivierung eines neuen Schlüsselpaares"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5224("TIP1-A_5224", "Protokollierung durch die CVC-Root-CA - Erzeugung eines CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5225("TIP1-A_5225", "Nachvollziehbarkeit bei Produktion von CVC-CA-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5226("TIP1-A_5226", "Schutz der Protokolldaten gegen Manipulation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5227("TIP1-A_5227", "Prüfung der Protokolldaten durch die gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5228("TIP1-A_5228", "Berücksichtigung von Rollen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5229("TIP1-A_5229", "Definition der Rollen in der CVC-Root-CA und Festlegungen ihrer Aufgaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5230("TIP1-A_5230", "Benennung von Mitarbeitern gegenüber der gematik durch die CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5231("TIP1-A_5231", "Berücksichtigung von Zugriffen auf das HSM im Vier-Augen- Prinzip, CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5232("TIP1-A_5232", "Umsetzung der definierten Prozesse durch die CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5233("TIP1-A_5233", "Geschützter Bereich der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5234("TIP1-A_5234", "Verwendung mehrerer geschützter Bereiche der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5235("TIP1-A_5235", "Schutz von HSM der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5236("TIP1-A_5236", "Zugriffe auf Systeme der CVC-Root-CA über Arbeitsplatzrechner (oder Systeme) außerhalb des geschützten Bereichs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5237("TIP1-A_5237", "Sicherer Betrieb von Systemkomponenten der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5238("TIP1-A_5238", "Veröffentlichung des öffentlichen Root-Schlüssels"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5239("TIP1-A_5239", "Sicherstellung der Integrität und Authentizität des öffentlichen Schlüssels bei Veröffentlichung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5240("TIP1-A_5240", "Bereitstellung des Fingerprints zum öffentlichen Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5241("TIP1-A_5241", "Bereitstellung von Cross-Zertifikaten (Link-Zertifikaten)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5243("TIP1-A_5243", "Information an die CVC-CAs über die Verfügbarkeit einer neuen Root-Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5245("TIP1-A_5245", "Schnittstelle zur Einsicht und Übermittlung von Registrierungsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5246("TIP1-A_5246", "Daten zum TSP-CVC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5247("TIP1-A_5247", "Daten zur CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5248("TIP1-A_5248", "Betrieb von Test-CVC-Root-CAs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5249("TIP1-A_5249", "Backup und Verfügbarkeit der CVC-Root-CA für Produktiv- und Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5250("TIP1-A_5250", "Schriftlicher Antrag auf Ausstellung eines CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5251("TIP1-A_5251", "Eingangsdaten zur Erzeugung eines CVC-CA-Zertifikats, die durch den TSP-CVC zur Verfügung gestellt werden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5252("TIP1-A_5252", "CVC-PKCS#10-Request zur Erzeugung eines CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5253("TIP1-A_5253", "Übergabe des CVC-CA-Zertifikats an den TSP-CVC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5254("TIP1-A_5254", "Prüfung des schriftlichen Antrags auf Ausstellung eines CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5255("TIP1-A_5255", "Ergebnis der Prüfung des schriftlichen Antrags auf Ausstellung eines CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5256("TIP1-A_5256", "Vereinbarung zur Übergabe des CVC-PKCS#10-Requests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5257("TIP1-A_5257", "Prüfung des Mitarbeiters des TSP-CVC und dessen Berechtigung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5258("TIP1-A_5258", "Prüfung des CVC-PKCS#10-Requests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5259("TIP1-A_5259", "Erstellung eines CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5260("TIP1-A_5260", "Berücksichtigung von Eingangsdaten gemäß [gemSpec_PKI] bei Ausstellung von CVC-CA-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5261("TIP1-A_5261", "Verwendung der Eingangsdaten des TSP-CVC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5262("TIP1-A_5262", "Setzen der Certificate Authority Reference (CAR)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5263("TIP1-A_5263", "Setzen des Datums in Certificate Authority Reference (CAR)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5264("TIP1-A_5264", "Setzen der Certificate Effective Date (CED)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5265("TIP1-A_5265", "Setzen der Certificate Expiration Date (CXD)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5266("TIP1-A_5266", "Signierung des CVC-CA-Zertifikats durch die CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5267("TIP1-A_5267", "Protokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5268("TIP1-A_5268", "CVC-PKCS#10-Request, Format des technischen Requests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5270("TIP1-A_5270", "CVC-PKCS#10-Request, Konkretisierungen für die Kartengeneration 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5272("TIP1-A_5272", "CVC-PKCS#10-Request, Angabe der Attribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5273("TIP1-A_5273", "CVC-PKCS#10-Request, Kodierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5274("TIP1-A_5274", "Signierung des Test-CVC-CA-Zertifikats durch die Test-CVC- Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5275("TIP1-A_5275", "Entgegennahme der Informationen zur Zulassung und Registrierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5276("TIP1-A_5276", "Protokollierung der Entgegennahme der Informationen zur Zulassung und Registrierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5367("TIP1-A_5367", "CVC-PKCS#10-Request für Kartengeneration 2, Object Identifier der Attribute"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5372("TIP1-A_5372", "Systemtechnische Trennung bei Aufbau und Betrieb der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5380("TIP1-A_5380", "Zugang zu HSM-Systemen im Vier-Augen-Prinzip"),

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
