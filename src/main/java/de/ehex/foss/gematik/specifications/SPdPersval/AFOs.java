package de.ehex.foss.gematik.specifications.SPdPersval;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [SPdPersval]}. SPdPersval:
 * Spezifischer Prüfpunkt der Personalisierungsvalidierung
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Persval_1("Persval_1", "IK-Nummern Prüfung: Die IK-Nummer muss valide sein gemäß KT-Browser Kostenträgerstammdaten (hrsg. KBV)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Persval_2("Persval_2", "Keine Feldüberlappungen der optischen Felder 1, 2, 5 und 6 gemäß den GSV-Festlegungen vom 17.8.2011"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Persval_3("Persval_3", "Anforderungen, die die Übereinstimmungen zwischen Aufdruck und Chipdaten (PD,VD) und Zertifikate definieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Persval_4("Persval_4", "VSD Schemaprüfung von XML-Prolog"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Persval_5("Persval_5", "Richtigkeit der Daten"),

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