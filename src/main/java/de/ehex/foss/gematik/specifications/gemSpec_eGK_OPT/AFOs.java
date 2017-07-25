package de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_eGK_OPT]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2230("Card-G2-A_2230", "Kartenformat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2231("Card-G2-A_2231", "Toleranzen Kartenkörper"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2232("Card-G2-A_2232", "Größe Chip-Modul"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2237("Card-G2-A_2237", "Vorderseite der eGK-Inhalt Feld 1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2238("Card-G2-A_2238", "Vorderseite der eGK-Inhalt Feld 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2241("Card-G2-A_2241", "Vorderseite der eGK-Inhalt Feld 5"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2242("Card-G2-A_2242", "Vorderseite der eGK-Inhalt Feld 6"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2249("Card-G2-A_2249", "Positionierung Leonardo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2277("Card-G2-A_2277", "Name des Versicherten (28 Zeichen)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2278("Card-G2-A_2278", "Name des Versicherten > 28 Zeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2279("Card-G2-A_2279", "Abkürzungsregeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2285("Card-G2-A_2285", "Abkürzungsregeln für Name des Kartenherausgebers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2296("Card-G2-A_2296", "Vorgaben aus Rundschreiben 25/2004 für EHIC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2309("Card-G2-A_2309", "Material Kartenkörper"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2310("Card-G2-A_2310", "Physikalische Eigenschaften des Kartenkörpers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2311("Card-G2-A_2311", "Überprüfung physikalische Eigenschaften"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2312("Card-G2-A_2312", "Biegefestigkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2313("Card-G2-A_2313", "Torsionsfestigkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2314("Card-G2-A_2314", "Weichmacherstabilität: Biege- und Torsionsprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2315("Card-G2-A_2315", "Weichmacherstabilität: Verblockungen/Ablösungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2316("Card-G2-A_2316", "Untersuchungsverfahren Weichmacherstabilität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2317("Card-G2-A_2317", "Haftfestigkeit Chipmodul"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2318("Card-G2-A_2318", "Untersuchungsverfahren Haftfestigkeit Chipmodul"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2319("Card-G2-A_2319", "Abriebfestigkeit der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2320("Card-G2-A_2320", "Untersuchungsverfahren Abriebfestigkeit der Personalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2321("Card-G2-A_2321", "Haltbarkeit des Layouts/Artworks"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2322("Card-G2-A_2322", "Schweiß- und Speicheltest"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2323("Card-G2-A_2323", "Vorgaben zum Test Beschreibbarkeit und Wischfestigkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2324("Card-G2-A_2324", "Test Beschreibbarkeit und Wischfestigkeit: Zeitpunkt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2325("Card-G2-A_2325", "Test Beschreibbarkeit und Wischfestigkeit: Ergebnis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    Card_G2_A_2883("Card-G2-A_2883", "Vorderseite der eGK- CAN in Feld 2"),

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