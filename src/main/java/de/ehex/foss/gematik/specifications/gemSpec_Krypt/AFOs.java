package de.ehex.foss.gematik.specifications.gemSpec_Krypt;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Krypt]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4357("GS-A_4357", "X.509-Identitäten für die Erstellung und Prüfung digitaler nicht-qualifizierter elektronischer Signaturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4358("GS-A_4358", "X.509-Identitäten für die Erstellung und Prüfung qualifizierter elektronischer Signaturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4359("GS-A_4359", "X.509-Identitäten für die Durchführung einer TLS-Authentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4360("GS-A_4360", "X.509-Identitäten für die Durchführung der IPsec-Authentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4361("GS-A_4361", "X.509-Identitäten für die Erstellung und Prüfung digitalerSignaturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4362("GS-A_4362", "X.509-Identitäten für Verschlüsselungszertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4363("GS-A_4363", "CV-Zertifikate G1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4364("GS-A_4364", "CV-CA-Zertifikate G1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4365("GS-A_4365", "CV-Zertifikate G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4366("GS-A_4366", "CV-CA-Zertifikate G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4367("GS-A_4367", "Zufallszahlengenerator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4368("GS-A_4368", "Schlüsselerzeugung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4370("GS-A_4370", "Kryptographische Algorithmen für XML-Dokumente"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4371("GS-A_4371", "XML-Signaturen für nicht-qualifizierte Signaturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4372("GS-A_4372", "XML-Signaturen für qualifizierte elektronische Signaturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4373("GS-A_4373", "XML-Verschlüsselung - symmetrisch"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4374("GS-A_4374", "XML-Verschlüsselung - Hybrid"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4375("GS-A_4375", "XML-Verschlüsselung - Hybrid, Schlüsseltransport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4376("GS-A_4376", "XML-Verschlüsselung - Hybrid, Schlüsseltransport RSAES-OAEP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4377("GS-A_4377", "Card-to-Card-Authentisierung G1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4378("GS-A_4378", "Card-to-Server (C2S) Authentisierung und Trusted Channel G1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4379("GS-A_4379", "Card-to-Card-Authentisierung G2 GS-A_4380 Card-to-Server (C2S) Authentisierung und Trusted Channel G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4380("GS-A_4380", "Card-to-Server (C2S) Authentisierung und Trusted Channel G2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4381("GS-A_4381", "Schlüssellängen Algorithmus AES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4382("GS-A_4382", "IPsec-Kontext - Schlüsselvereinbarung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4383("GS-A_4383", "IPsec-Kontext - Verschlüsselte Kommunikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4384("GS-A_4384", "TLS-Verbindungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4385("GS-A_4385", "TLS-Verbindungen, Version 1.2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4386("GS-A_4386", "TLS-Verbindungen, optional Version 1.1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4387("GS-A_4387", "TLS-Verbindungen, nicht Version 1.0"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4388("GS-A_4388", "DNSSEC-Kontext"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4389("GS-A_4389", "Symmetrischer Anteil der hybriden Verschlüsselung binärer Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4390("GS-A_4390", "Asymmetrischer Anteil der hybriden Verschlüsselung binärer Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4391("GS-A_4391", "MAC im Rahmen der Personalisierung der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4392("GS-A_4392", "Algorithmus im Rahmen der Bildung der pseudonymisierten Versichertenidentität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4393("GS-A_4393", "Algorithmus bei der Erstellung von Hashwerten von Zertifikaten oder öffentlichen Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5016("GS-A_5016", "Symmetrische Verschlüsselung binärer Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5021("GS-A_5021", "Schlüsselerzeugung bei einer Schlüsselspeicherpersonalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5035("GS-A_5035", "Nichtverwendung des SSL-Protokolls"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5071("GS-A_5071", "kryptographische Vorgaben für eine Signaturprüfung in der SAK-Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5079("GS-A_5079", "Migration von Algorithmen und Schlüssellängen bei PKI-Betreibern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5080("GS-A_5080", "Signaturen binärer Daten (Dokumente)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5081("GS-A_5081", "Signaturen von PDF/A-Dokumenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5091("GS-A_5091", "Verwendung von RSASSA-PSS bei XMLDSig-Signaturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5131("GS-A_5131", "Hash-Algorithmus bei OCSP / CertID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5207("GS-A_5207", "Signaturverfahren beim initialen Pairing zwischen Konnektor und eHealth-Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5208("GS-A_5208", "Signaturverfahren für externe Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5322("GS-A_5322", "Weitere Vorgaben für TLS-Verbindungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5338("GS-A_5338", "HBA/SMC-B - Erzeugung asymmetrischer Schlüsselpaare auf der jeweiligen Karte selbst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5339("GS-A_5339", "TLS-Verbindungen, erweiterte Webbrowser-Interoperabilität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5340("GS-A_5340", "Signatur der TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5345("GS-A_5345", "TLS-Verbindungen Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5386("GS-A_5386", "kartenindividuelle geheime und private Schlüssel G2-Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5482("GS-A_5482", "zusätzliche TLS-Ciphersuiten für VZD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5518("GS-A_5518", "Prüfung Kurvenpunkte bei einer Zertifikatserstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5524("GS-A_5524", "TLS-Renegotiation eHealth-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5525("GS-A_5525", "TLS-Renegotiation Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5526("GS-A_5526", "TLS-Renegotiation-Indication-Extension"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5527("GS-A_5527", "TLS-Renegotiation-Indication-Extension Intermediär"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5530("GS-A_5530", "TLS-Verbindungen, Version 1.1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5541("GS-A_5541", "TLS-Verbindungen als TLS-Klient zur Störungsampel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5542("GS-A_5542", "TLS-Verbindungen (fatal Alert bei Abbrüchen)"),

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
