package de.ehex.foss.gematik.specifications.gemSMIME_KOMLE;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSMIME_KOMLE]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2095("KOM-LE-A_2095", "Reihenfolge Signatur und Verschlüsselung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2096("KOM-LE-A_2096", "Signatur und Verschlüsselung entsprechend S/MIME V3.2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2097("KOM-LE-A_2097", "Verschlüsselter Body"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2098("KOM-LE-A_2098", "Header der äußeren Nachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2099("KOM-LE-A_2099", "Header-Element X-KOM-LE-Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2100("KOM-LE-A_2100", "Wert Header-Element X-KOM-LE-Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2101("KOM-LE-A_2101", "Neues message-id Element"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2102("KOM-LE-A_2102", "Wert subject Header-Element"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2103("KOM-LE-A_2103", "Opak-Signatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2104("KOM-LE-A_2104", "Typ S/MIME-Verschlüsselung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2106("KOM-LE-A_2106", "EnvelopedData ohne originatorInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2107("KOM-LE-A_2107", "EnvelopedData mit unprotectedAttrs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2108("KOM-LE-A_2108", "Schlüsselverwaltungsalgorithmus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2109("KOM-LE-A_2109", "Zertifikatsidentifizierung bei keyTransRecipientInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2111("KOM-LE-A_2111", "RecipientInfo Element für Sender"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2112("KOM-LE-A_2112", "Inhalt von encryptedContentInfo"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2114("KOM-LE-A_2114", "Attribut recipient-emails"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2115("KOM-LE-A_2115", "Referenzierte Zertifikate in RecipientEmail"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2116("KOM-LE-A_2116", "E-Mail-Adresse des Zertifikatsinhabers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2117("KOM-LE-A_2117", "Zertifikatsidentifikation über Aussteller und Seriennummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2118("KOM-LE-A_2118", "Keine crls in signed-data"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2119("KOM-LE-A_2119", "Signed-data muss certificates enthalten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2121("KOM-LE-A_2121", "Signierte Daten im Element eContent"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2122("KOM-LE-A_2122", "Signaturzertifikat im Element Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2123("KOM-LE-A_2123", "Genau ein signerInfo Element"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2124("KOM-LE-A_2124", "Inhalt Element sid aus Unterzeichnerinformationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2125("KOM-LE-A_2125", "Aussteller und Seriennummer entsprechend Signaturzertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2126("KOM-LE-A_2126", "Unterzeichnerinformationen ohne unsignedAttrs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2127("KOM-LE-A_2127", "Unterzeichnerinformationen mit signiertem Attribut recipientemails"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2128("KOM-LE-A_2128", "Zertifikate für Verschlüsselung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2129("KOM-LE-A_2129", "Signaturzertifikat"),

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
