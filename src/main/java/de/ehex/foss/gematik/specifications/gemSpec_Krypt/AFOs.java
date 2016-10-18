package de.ehex.foss.gematik.specifications.gemSpec_Krypt;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Krypt]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4357("GS-A_4357", "X.509-Identitäten für die Erstellung und Prüfung digitaler nichtqualifizierter elektronischer Signaturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4359("GS-A_4359", "X.509-Identitäten für die Durchführung einer TLSAuthentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4361("GS-A_4361", "X.509-Identitäten für die Erstellung und Prüfung digitaler Signaturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4362("GS-A_4362", "X.509-Identitäten für Verschlüsselungszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4367("GS-A_4367", "Zufallszahlengenerator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4368("GS-A_4368", "Schlüsselerzeugung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4377("GS-A_4377", "Card-to-Card-Authentisierung G1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4378("GS-A_4378", "Card-to-Server (C2S) Authentisierung und Trusted Channel G1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4379("GS-A_4379", "Card-to-Card-Authentisierung G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4380("GS-A_4380", "Card-to-Server (C2S) Authentisierung und Trusted Channel G2"),

    GS_A_4384("GS-A_4384", "TLS-Verbindungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4385("GS-A_4385", "TLS-Verbindungen, Version 1.2"),

    GS_A_4386("GS-A_4386", "TLS-Verbindungen, Version 1.1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4387("GS-A_4387", "TLS-Verbindungen, Version 1.0"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4388("GS-A_4388", "DNSSEC-Kontext"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4393("GS-A_4393", "Algorithmus bei der Erstellung von Hashwerten von Zertifikaten oder öffentlichen Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5035("GS-A_5035", "Nichtverwendung des SSL-Protokolls"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5079("GS-A_5079", "Migration von Algorithmen und Schlüssellängen bei PKIBetreibern"),

    GS_A_5091("GS-A_5091", "Verwendung von RSASSA-PSS bei XMLDSig-Signaturen"),

    GS_A_5131("GS-A_5131", "Hash-Algorithmus bei OCSP / CertID"),

    GS_A_5207("GS-A_5207", "Signaturverfahren beim initialen Pairing zwischen Konnektor und eHealth-Kartenterminal"),

    GS_A_5322("GS-A_5322", " Weitere Vorgaben für TLS-Verbindungen"),

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
