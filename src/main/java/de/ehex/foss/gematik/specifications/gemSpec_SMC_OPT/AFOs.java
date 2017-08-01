package de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_SMC_OPT]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2008("Card-G2-A_2008", "Formfaktor SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2009("Card-G2-A_2009", "Layout Vorderseite SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2010("Card-G2-A_2010", "Layout Vorderseite SMC-B, Ausweisnummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2011("Card-G2-A_2011", "Layout Vorderseite SMC-B, Gültigkeitszeitraum"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2012("Card-G2-A_2012", "Layout Vorderseite SMC-B, Profil"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2013("Card-G2-A_2013", "Ausrichtung Text Regionen 1-3 SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2014("Card-G2-A_2014", "Layout Vorderseite SMC-B, ID-000-Bereich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2015("Card-G2-A_2015", "Schriftgröße ID-000 SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2016("Card-G2-A_2016", "Formfaktor gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2017("Card-G2-A_2017", "Layout Vorderseite gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2018("Card-G2-A_2018", "Layout Vorderseite gSMC-K, Kartennummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2019("Card-G2-A_2019", "Layout Vorderseite gSMC-K, Profilnummern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2020("Card-G2-A_2020", "Layout Vorderseite gSMC-K, ID-000-Bereich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2021("Card-G2-A_2021", "Schriftgröße ID-000 gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2022("Card-G2-A_2022", "Formfaktor (g)SMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2023("Card-G2-A_2023", "Layout Vorderseite gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2024("Card-G2-A_2024", "Layout Vorderseite gSMC-KT, Kartennummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2025("Card-G2-A_2025", "Layout Vorderseite gSMC-KT, Profilnummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2026("Card-G2-A_2026", "Layout Vorderseite gSMC-KT, ID-000-Bereich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2027("Card-G2-A_2027", "Schriftgröße ID-000 gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3209("Card-G2-A_3209", "Layout Vorderseite gSMC-KT, Hashwert von C.SMKT.AUT.R2048, Bedruckung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3239("Card-G2-A_3239", "Layout Vorderseite gSMC-KT, Hashwert von C.SMKT.AUT.R2048, Übermittlung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3478("Card-G2-A_3478", "Elektrophysikalische Eigenschaften des Kartenkörpers der (g)SMC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_3513("Card-G2-A_3513", "Bemaßung der Kontakte der (g)SMC"),

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