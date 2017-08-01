package de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_OSCP_Proxy]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5831("TIP1-A_5831", "FehlerLog"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5835("TIP1-A_5835", "Fehlerprotokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5836("TIP1-A_5836", "Schutz von Log-Dateien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5837("TIP1-A_5837", "Technische Datenschutzmaßnahmen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5838("TIP1-A_5838", "Verwendung von Standards und Best Practices"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5848("TIP1-A_5848", "Erreichbarkeit OCSP-Proxy"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5849("TIP1-A_5849", "OCSP-Anfragen aus der TI beantworten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5851("TIP1-A_5851", "Weiterleitung von OCSP-Anfragen für nonQES- und QES-EE- Zertifikate der zu unterstützenden HBA-Vorläuferkarten."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5852("TIP1-A_5852", "Verbindungsaufbau zu OCSP-Respondern im Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5853("TIP1-A_5853", "Ablehnung von Anfragen aus dem Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5855("TIP1-A_5855", "Speicherung von OCSP-Anfragen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5856("TIP1-A_5856", "Speicherung von OCSP-Antworten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5857("TIP1-A_5857", "Protokollierung von OCSP-Anfragen und OCSP-Antworten"),

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