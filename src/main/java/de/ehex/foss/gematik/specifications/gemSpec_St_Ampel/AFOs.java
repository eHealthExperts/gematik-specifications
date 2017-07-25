package de.ehex.foss.gematik.specifications.gemSpec_St_Ampel;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_St_Ampel]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since May 11th, 2017
 */
public enum AFOs
implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5993("TIP1-A_5993", "Störungsampel und Client, I_Monitoring_Update, WebService"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5994("TIP1-A_5994", "Störungsampel und Client, I_Monitoring_Update, eindeutige Zuordnung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5995("TIP1-A_5995", "Störungsampel und Client, I_Monitoring_Update, Servicepunkte gemSpec_St_Ampel und IP-Adressen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5996("TIP1-A_5996", "Störungsampel und Client, I_Monitoring_Update, maximale Zeitabweichung zwischen Berichtszeitraum und Nachrichtenübermittelung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5997("TIP1-A_5997", "Nutzer der Störungsampel I_Monitoring_Update, Zeitstempel bei Ausfall/Wiederherstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5998("TIP1-A_5998", "Nutzer der Störungsampel I_Monitoring_Update, Zertifikatsprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5999("TIP1-A_5999", "Nutzer der Störungsampel I_Monitoring_Update, maximale HTTP-Nachrichtenlänge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6002("TIP1-A_6002", "Nutzer der Störungsampel I_Monitoring_Update, Selbstauskunft als Bestandteil jeder SOAP-Nachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6003("TIP1-A_6003", "Nutzer der Störungsampel I_Monitoring_Update, eindeutige Zuordnung des Messwertes"),

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
