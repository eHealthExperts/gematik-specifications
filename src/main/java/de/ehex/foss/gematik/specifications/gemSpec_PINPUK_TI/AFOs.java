package de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_PINPUK_TI]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2227("GS-A_2227", "Keine Kartendubletten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2228("GS-A_2228", "Trennung von Karte und PIN/PUK-Brief"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2229("GS-A_2229", "Prozesse und Maßnahmen zur Aushändigung von Karte und PIN/PUK-Brief"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2230("GS-A_2230", "PIN/PUK-Erzeugung: Länge PIN/PUK (Kartenherausgeber)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2232("GS-A_2232", "PIN/PUK-Erzeugung: Verfahren für PIN/PUK-Auswahl"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2234("GS-A_2234", "PIN/PUK-Erzeugung: Zufallsgenerator für PIN/PUK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2235("GS-A_2235", "PIN/PUK-Erzeugung: Ableitung von PIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2236("GS-A_2236", "PIN/PUK-Erzeugung: Ableitung der PIN aus eindeutig dem Versicherten zugeordneten Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2237("GS-A_2237", "PIN/PUK-Erzeugung: kein Rückschluss von PIN/PUK auf Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2238("GS-A_2238", "PIN/PUK-Erzeugung: Informationen an Karteninhaber bei selbstständiger Wahl der PIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2239("GS-A_2239", "PIN/PUK-Erzeugung: Ableitung von PIN im Sicherheitsmodul"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2240("GS-A_2240", "PIN/PUK-Speicherung: Verschlüsselung der PIN außerhalb von Sicherheitsmodulen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2242("GS-A_2242", "PIN/PUK-Speicherung: Integrität der PIN außerhalb von Sicherheitsmodulen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2244("GS-A_2244", "PIN/PUK-Speicherung: Verschlüsselung unterschiedlicher PINs mit unterschiedlichen Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2246("GS-A_2246", "PIN/PUK-Speicherung: Verschlüsselung gleicher PINs führt zu unterschiedlichen verschlüsselten Werten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2247("GS-A_2247", "PIN/PUK-Speicherung: Wiederholte Verschlüsselung der PIN führt zu unterschiedlichen Werten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2248("GS-A_2248", "PIN/PUK-Speicherung: unterschiedliche Schlüssel für unterschiedliche Zwecke"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2249("GS-A_2249", "PIN/PUK-Speicherung: Dokumentation der Zwecke"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2250("GS-A_2250", "PIN/PUK-Speicherung: Entschlüsselung nur durch berechtigten Empfänger"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2252("GS-A_2252", "PIN/PUK-Löschung: Löschung von PIN/PUK nach Ablauf der Speicherdauer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2253("GS-A_2253", "PIN/PUK-Transport: Sicherer PIN-Transport beim Kartenherausgeber bzw. Kartenpersonalisierer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2254("GS-A_2254", "PIN/PUK-Transport: Schutz außerhalb geschützter Hardware beim Kartenherausgeber bzw. Kartenpersonalisierer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2255("GS-A_2255", "PIN/PUK-Transport: Verteilung beschränken"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2256("GS-A_2256", "PIN/PUK-Transport: einmalige PIN-Erstellung beim Kartenherausgeber bzw. Kartenpersonalisierer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2260("GS-A_2260", "PIN/PUK-Transport: Transport außerhalb eines Sicherheitsmoduls"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2261("GS-A_2261", "PIN/PUK-Transport: Transport außerhalb eines Sicherheitsmoduls - kein Klartext"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2264("GS-A_2264", "PIN/PUK-Transport: elektronische PIN-Verteilung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2266("GS-A_2266", "PIN/PUK-Transport: Verschlüsselung gleicher PINs muss zu unterschiedlichen Werten führen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2270("GS-A_2270", "PIN/PUK-Transport: Unterschiedliche verschlüsselte Werte auch bei gleichen PINs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2271("GS-A_2271", "PIN/PUK-Transport: kein Rückschluss auf vorher benutzte Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2274("GS-A_2274", "PIN/PUK-Transport: Löschung der PIN nach Transport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2276("GS-A_2276", "PIN/PUK-Transport: Aktivitäten im Vier-Augen-Prinzip bei der Zuordnung einer PIN/PUK zu einer Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2277("GS-A_2277", "PIN/PUK-Transport: Aktivitäten im Vier-Augen-Prinzip beim Rücksetzen des Fehlbedienungszählers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2284("GS-A_2284", "PIN/PUK-Änderung: Änderungen durch Kartenpersonalisierer im Vier-Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2285("GS-A_2285", "PIN/PUK-Änderung: Prozess bei Kompromittierung beim Kartenherausgeber bzw. Kartenpersonalisierer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2287("GS-A_2287", "PIN/PUK-Löschung: Nachweis der Löschung nicht mehr gebrauchter PIN beim Kartenherausgeber bzw. Kartenpersonalisierer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2291("GS-A_2291", "PIN/PUK-Löschung: Löschen von nicht mehr benötigten Klartext-PIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2292("GS-A_2292", "PIN/PUK-Löschung: Außerbetriebnahme der PIN und Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2295("GS-A_2295", "Schutz der Schlüssel für PIN/PUK gemäß Hierarchiestufe 4"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5085("GS-A_5085", "PIN/PUK-Änderung: Prozess bei Kompromittierungsmeldung durch Karteninhaber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5209("GS-A_5209", "PIN/PUK-Speicherung: PIN/PUK unverzüglich löschen"),

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