package de.ehex.foss.gematik.specifications.gemSpec_Perf;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Perf]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3055("GS-A_3055", "Performance - zentrale Dienste - Skalierbarkeit (Anbieter)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3058("GS-A_3058", "Performance - zentrale Dienste - lineare Skalierbarkeit"),

    GS_A_4145("GS-A_4145", "Performance - zentrale Dienste - Robustheit gegenüber Lastspitzen"),

    GS_A_4146("GS-A_4146", "Performance - Performance-Daten erfassen"),

    GS_A_4147("GS-A_4147", "Performance - Störungsampel - Performance-Daten"),

    GS_A_4148("GS-A_4148", "Performance - Störungsampel - Ereignisnachricht bei Ausfall"),

    GS_A_4149("GS-A_4149", "Performance - Reporting-Daten in Performance-Report"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4155("GS-A_4155", "Performance - zentrale Dienste - Verfügbarkeit"),

    GS_A_4159("GS-A_4159", "Performance - OCSP Responder - Bearbeitungszeiten unter Spitzenlast"),

    GS_A_4160("GS-A_4160", "Performance - OCSP-Responder - Performance Reporting - Daten nach Zertifikatstyp"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5028("GS-A_5028", "Performance - zentrale Dienste - Verfügbarkeit Produktivbetrieb"),

    GS_A_5029("GS-A_5029", "Performance - VSDM Intermediär - Bearbeitungszeit unter Last"),

    GS_A_5030("GS-A_5030", " Performance - VSDM Intermediär - Verfügbarkeit"),

    GS_A_5031("GS-A_5031", "Performance - VSDM Fachdienste - Bearbeitungszeit unter Last"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5032("GS-A_5032", "Performance - VSDM Fachdienste - Verfügbarkeit"),

    GS_A_5073("GS-A_5073", "Performance - Intermediär VSDM - Skalierbarkeit"),

    GS_A_5092("GS-A_5092", "Performance - Performance-Daten erfassen (Fachdienste VSDM)"),

    GS_A_5093("GS-A_5093", "Performance - Störungsampel - Performance-Daten (Fachdienste VSDM)"),

    GS_A_5094("GS-A_5094", "Performance - Störungsampel - Ereignisnachricht bei Ausfall (Fachdienste VSDM)"),

    GS_A_5095("GS-A_5095", "Performance - Reporting-Daten in Performance-Report (Fachdienste VSDM)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5134("GS-A_5134", "Performance - KOM-LE Fachdienst - Skalierbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5136("GS-A_5136", "Performance - KOM-LE Clientmodul - Bearbeitungszeit unter Last"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5137("GS-A_5137", "Performance - KOM-LE Fachdienst - Durchsatz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5138("GS-A_5138", "Performance - KOM-LE Fachdienst - Bearbeitungszeit unter Last"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5139("GS-A_5139", "Performance - KOM-LE Fachdienst - Verfügbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5143("GS-A_5143", "Performance - KOM-LE Fachdienst - Nachricht senden"),

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
