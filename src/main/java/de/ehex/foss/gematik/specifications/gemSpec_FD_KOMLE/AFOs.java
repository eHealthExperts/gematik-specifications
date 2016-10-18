package de.ehex.foss.gematik.specifications.gemSpec_FD_KOMLE;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_FD_KOMLE]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2130("KOM-LE-A_2130", "Generieren einer Zustellbestätigung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2131("KOM-LE-A_2131", "Fehlernachricht bei fehlerhafter E-Mail-Adresse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2132("KOM-LE-A_2132", "Identifikation der Originalnachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2133("KOM-LE-A_2133", "Durchführung eines Accountings zur Abrechnung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2134("KOM-LE-A_2134", "Aktionen bei Fehlerzuständen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2135("KOM-LE-A_2135", "Protokollierung von Vorgängen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2136("KOM-LE-A_2136", "Protokollierung außerhalb gesetzlicher und vertraglicher Pflichten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2137("KOM-LE-A_2137", "Protokollierung zum Zwecke der Fehler- bzw. Störungsbehebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2138("KOM-LE-A_2138", "Auskunftsfähigkeit über den Systemzustand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2139("KOM-LE-A_2139", "Konfiguration Fachdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2140("KOM-LE-A_2140", "Schnittstelle I_Message_Service"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2141("KOM-LE-A_2141", "Technische Umsetzung der Schnittstelle I_Message_Service"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2142("KOM-LE-A_2142", "Ports der Schnittstelle I_Message_Service"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2143("KOM-LE-A_2143", "Aufbau der TLS-Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2144("KOM-LE-A_2144", "Schritte beim Aufbau der TLS-Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2145("KOM-LE-A_2145", "Validierung der TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2146("KOM-LE-A_2146", "Verarbeitung von Nachrichten entsprechend S/MIME-Profil"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2147("KOM-LE-A_2147", "Generierung von Zustellbestätigungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2148("KOM-LE-A_2148", "Authentifizierungsmechanismen beim Nachrichtenversand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2149("KOM-LE-A_2149", "Kein Empfang von Nachrichten bei deregistriertem Konto"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2150("KOM-LE-A_2150", "Kein Versenden von Nachrichten bei deregistriertem Konto"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2151("KOM-LE-A_2151", "Unterstützung des POP3-Kommandos APOP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2152("KOM-LE-A_2152", "Unterstützung des POP3-Kommandos UIDL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2154("KOM-LE-A_2154", "Versand von Löschbenachrichtigungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2155("KOM-LE-A_2155", "Nicht abgeholte Nachrichten nach der Deregistrierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2156("KOM-LE-A_2156", "Schnittstelle zur Registrierung und Deregistrierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2157("KOM-LE-A_2157", "Aufgaben der Schnittstelle zur Registrierung und Deregistrierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2158("KOM-LE-A_2158", "Protokollieren von Registrierung und Deregistrierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2159("KOM-LE-A_2159", "Verwendung der Schnittstelle I_Directory_Application_Maintenance"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2160("KOM-LE-A_2160", "Kommunikation mit dem Verzeichnisdienst über TLS 1.1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2161("KOM-LE-A_2161", "Benutzername der KOM-LE-Teilnehmers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2162("KOM-LE-A_2162", "Übermittlung der Passwörter zum Fachdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2163("KOM-LE-A_2163", "Vorgaben zur Minimum-Qualität des Passwortes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2164("KOM-LE-A_2164", "Passwörter nicht im Klartext speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2165("KOM-LE-A_2165", "Möglichkeit der Änderung des Passwortes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2166("KOM-LE-A_2166", "Keine Änderung oder Löschung des Passwortes durch Dritte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2167("KOM-LE-A_2167", "Sperrung des Accounts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2168("KOM-LE-A_2168", "Entsperren des Accounts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2169("KOM-LE-A_2169", "Authentifizierungsdaten beim Versenden und Empfangen von Nachrichten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2171("KOM-LE-A_2171", "Skalierbarkeit KOM-LE-Fachdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2185("KOM-LE-A_2185", "Mail Server darf nur Nachrichten aus der TI verarbeiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2186("KOM-LE-A_2186", "Verwendung des C.FD.TLS-S Server-Zertifikats bei der TLSAuthentifizierung mit dem Clientmodul"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2187("KOM-LE-A_2187", "Authentifizierung des KOM-LE-Teilnehmers über AUT-Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2188("KOM-LE-A_2188", "Authentifizierung über AUT-Zertifikat unter Verwendung des Auth-Clients"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2189("KOM-LE-A_2189", "Verwendung des C.FD.TLS-C Client-Zertifikats bei der TLSAuthentifizierung mit dem Verzeichnisdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2223("KOM-LE-A_2223", "Unterstützung Autoreply für Abwesenheitsnotiz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2224("KOM-LE-A_2224", "Einstellen von Abwesenheitsnotizen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2231("KOM-LE-A_2231", "Schnittstellen der TI-Plattform"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2277("KOM-LE-A_2277", "Versenden von Abwesenheitsnotizen ohne Signatur und Verschlüsselung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2278("KOM-LE-A_2278", "Aufbau Autoreply für Abwesenheitsnotiz"),


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
