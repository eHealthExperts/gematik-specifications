package de.ehex.foss.gematik.specifications.gemSpec_St_Ampel;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_St_Ampel]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since May 11th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3272("TIP1-A_3272", "Datenerhebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3274("TIP1-A_3274", "Darstellung der Auswertung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3275("TIP1-A_3275", "Darstellungsebene 1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3276("TIP1-A_3276", "Statusdarstellung der Ebenen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3277("TIP1-A_3277", "Darstellungsebene 1 Weiterverzweigung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3278("TIP1-A_3278", "Bereitstellung der darstellungsebenenspezifischen Historie der Informationstafel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3279("TIP1-A_3279", "Darstellungsebene 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3281("TIP1-A_3281", "Darstellungsebene 2 Weiterverzweigung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3283("TIP1-A_3283", "Behandlung Anwendung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3284("TIP1-A_3284", "Darstellung der „Aktuelle Meldungen“ auf der Informationstafel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3285("TIP1-A_3285", "Darstellung Ebene 3"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3291("TIP1-A_3291", "Darstellung der „Ankündigungen“ auf der Informationstafel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3296("TIP1-A_3296", "Automatische Aktualisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3297("TIP1-A_3297", "Zugriffsschutz gemäß Schutzbedarf"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3298("TIP1-A_3298", "Erteilung Einzel-Zugriffsberechtigungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3299("TIP1-A_3299", "Verbot Gruppenberechtigungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3301("TIP1-A_3301", "Verwendung von Standardprodukten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3302("TIP1-A_3302", "Störungsampel, Konfigurierbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3304("TIP1-A_3304", "Protokollierung Nutzerzugriffe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3305("TIP1-A_3305", "Speicherungsdauer von übermittelten Daten an die Störungsampel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3368("TIP1-A_3368", "Filterung der Informationen der Informationstafel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3370("TIP1-A_3370", "Legende"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3521("TIP1-A_3521", "Erreichbarkeit der Störungsampel in der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3524("TIP1-A_3524", "Störungsampel, verschlüsselte Kommunikation zwischen Logikeinheit und Präsentationseinheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3527("TIP1-A_3527", "Störungsampel, I_Monitoring_Read, Gesicherter Zugang"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3529("TIP1-A_3529", "Versionswechselfähigkeit des Standardproduktes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3531("TIP1-A_3531", "Präsentationseinheit der Störungsampel: Nutzeroberfläche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3532("TIP1-A_3532", "Präsentationseinheit der Störungsampel: Nutzerauthentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3533("TIP1-A_3533", "Logikeinheit der Störungsampel: Beschreibung Administrationsoberfläche der Logikeinheit für die Präsentationseinheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3538("TIP1-A_3538", "Logikeinheit der Störungsampel: Beschreibung Administrationsoberfläche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3540("TIP1-A_3540", "Logikeinheit der Störungsampel: Nutzerauthentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3541("TIP1-A_3541", "Bereitstellung von Zugriffsstatistiken"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3543("TIP1-A_3543", "Erweiterbarkeit der Darstellungsebenen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3687("TIP1-A_3687", "Störungsampel, Unterstützung IPv4 und IPv6"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5795("TIP1-A_5795", "Störungsampel, Authentisierte Zugriffe für Anwender"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5796("TIP1-A_5796", "Störungsampel, Zugriff gemäß Berechtigungs- und Rollenkonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5797("TIP1-A_5797", "Störungsampel, Festlegung der Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5798("TIP1-A_5798", "Störungsampel, Verarbeitung und Darstellung der Daten nach Vorgabe des GBV"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5917("TIP1-A_5917", "Störungsampel, Rechte der Anwender gemäß Rolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5935("TIP1-A_5935", "Störungsampel, Bereitstellung der Schnittstelle I_Monitoring_Message"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5936("TIP1-A_5936", "Störungsampel, I_Monitoring_Message, Bearbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5937("TIP1-A_5937", "Störungsampel, Bereitstellung der Schnittstelle I_Monitoring_SelfDisclosure"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5941("TIP1-A_5941", "Störungsampel, Bereitstellung der Schnittstelle I_Monitoring_Read"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5991("TIP1-A_5991", "Störungsampel, Anwenderzuordnung der Schnittstelle I_Monitoring_Read per Session"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5992("TIP1-A_5992", "Störungsampel, Schnittstelle I_Monitoring_Update"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5993("TIP1-A_5993", "Störungsampel und Client, I_Monitoring_Update, WebService"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5994("TIP1-A_5994", "Störungsampel und Client, I_Monitoring_Update, eindeutige Zuordnung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5995("TIP1-A_5995", "Störungsampel und Client, I_Monitoring_Update, Servicepunkte und IP-Adressen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5996("TIP1-A_5996", "Störungsampel und Client, I_Monitoring_Update, maximale Zeitabweichung zwischen Berichtszeitraum und Nachrichtenübermittelung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5997("TIP1-A_5997", "Nutzer der Störungsampel I_Monitoring_Update, Zeitstempel bei Ausfall/Wiederherstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5998("TIP1-A_5998", "Nutzer der Störungsampel I_Monitoring_Update, Zertifikatsprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5999("TIP1-A_5999", "Nutzer der Störungsampel I_Monitoring_Update, maximale HTTP-Nachrichtenlänge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6000("TIP1-A_6000", "Störungsampel, I_Monitoring_Update, Fehlermeldungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6001("TIP1-A_6001", "Störungsampel, I_Monitoring_Update, Rückmeldung der Nachrichten-ID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6002("TIP1-A_6002", "Nutzer der Störungsampel I_Monitoring_Update, Selbstauskunft als Bestandteil jeder SOAP-Nachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6003("TIP1-A_6003", "Nutzer der Störungsampel I_Monitoring_Update, eindeutige Zuordnung des Messwertes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6004("TIP1-A_6004", "Störungsampel, I_Monitoring_Update, TLS-gesicherte Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6005("TIP1-A_6005", "Störungsampel, I_Monitoring_Message, TLS-gesicherte Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6714("TIP1-A_6714", "Störungsampel, Darstellung von Produktivbetrieb und Erprobungen"),

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
