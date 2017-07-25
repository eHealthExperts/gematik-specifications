package de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_SiBetrUmg]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3737("GS-A_3737", "Spezifisches Sicherheitskonzept: Mindestumfang des spezifischen Sicherheitskonzeptes.."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3747("GS-A_3747", "Technische_Komponenten: Dokumentation der technischen Komponenten und der geforderten Sicherheitsfunktionalität."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3753("GS-A_3753", "Notfallkonzept: Der Dienstanbieter MUSS ein Notfallkonzept erstellen (1)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3756("GS-A_3756", "Umsetzung_Maßnahmen_spezifisches_Siko: Umsetzung und Prüfbarkeit von Maßnahmen."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3760("GS-A_3760", "Gutachten zur Einhaltung der Sicherheitsanforderungen für Dienstbetreiber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3772("GS-A_3772", "Notfallkonzept: Der Dienstanbieter MUSS ein Notfallkonzept erstellen (2)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3784("GS-A_3784", "Nachweis durch ISO2700 1 Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4980("GS-A_4980", "Umsetzung der Norm ISO/IEC 2700 1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4981("GS-A_4981", "Erreichen der Ziele der Norm ISO/IEC 2700 1 Annex A"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4982("GS-A_4982", "Umsetzung der Maßnahmen der Norm ISO/IEC 2700 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4983("GS-A_4983", "Umsetzung der Maßnahmen aus dem BSI-Grundschutz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4984("GS-A_4984", "Befolgen von herstellerspezifischen Vorgaben"),

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
