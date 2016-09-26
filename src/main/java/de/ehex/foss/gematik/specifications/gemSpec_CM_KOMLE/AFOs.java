package de.ehex.foss.gematik.specifications.gemSpec_CM_KOMLE;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_CM_KOMLE]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2003("KOM-LE-A_2003", "Unterstützung von E-Mail-Clients"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2004("KOM-LE-A_2004", "Größe einer KOM-LE-Nachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2005("KOM-LE-A_2005", "Keine persistente Speicherung von Nachrichten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2006("KOM-LE-A_2006", "Einzuhaltende Standards beim Senden und Empfangen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2007("KOM-LE-A_2007", "SMTP Begrüßung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2008("KOM-LE-A_2008", "Initialer SMTP-Dialog"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2009("KOM-LE-A_2009", "Unterstützung der Serverteile der Mechanismen PLAIN und LOGIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2010("KOM-LE-A_2010", "Extrahieren von MTA-Adresse, Portnummer und Kartenaufrufkontext"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2011("KOM-LE-A_2011", "Verbindungsaufbau mit dem MTA über MTA-Adresse und Portnummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2012("KOM-LE-A_2012", "Authentisierung gegenüber dem MTA mit Benutzernamen und Passwort"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2013("KOM-LE-A_2013", "Unterstützung der Clientteile der Mechanismen PLAIN und LOGIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2014("KOM-LE-A_2014", "Authentifizierung gegenüber MTA mit anderen Mechanismen als PLAIN und LOGIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2015("KOM-LE-A_2015", "Ergebnis des Verbindungsaufbaus mit dem MTA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2016("KOM-LE-A_2016", "Schließen der SMTP-Verbindung mit dem Clientsystem"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2017("KOM-LE-A_2017", "Schließen der SMTP-Verbindung mit dem MTA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2018("KOM-LE-A_2018", "Weiterleitung von SMTP-Meldungen und Antwortcodes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2019("KOM-LE-A_2019", "Signatur und Verschlüsselung entsprechend KOM-LE-S/MiMEProfil"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2020("KOM-LE-A_2020", "Signieren der Nachricht mit dem Schlüssel Prk.HCI.OSIG"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2021("KOM-LE-A_2021", "Verhalten, wenn Nachricht nicht signiert werden kann"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2022("KOM-LE-A_2022", "Verschlüsseln der Nachricht mit den Verschlüsselungszertifikaten C.HCI.ENC bzw. C.HP.ENC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2023("KOM-LE-A_2023", "Verschlüsselungszertifikate aus dem Verzeichnisdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2024("KOM-LE-A_2024", "Information des Absenders über Empfänger, für die nicht verschlüsselt werden kann"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2025("KOM-LE-A_2025", "Abbruch des Sendens, wenn keine Verschlüsselung möglich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2026("KOM-LE-A_2026", "Cachen von Verschlüsselungszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2027("KOM-LE-A_2027", "Befüllung des recipient-emails Attributs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2028("KOM-LE-A_2028", "Entfernen von Empfängern aus dem Header der Nachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2029("KOM-LE-A_2029", "Aufbereitung einer vom Clientsystem erhaltenen KOM-LES/MIME-Nachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2030("KOM-LE-A_2030", "POP3-Dialog zur Authentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2031("KOM-LE-A_2031", "Unterstützung der Serverteile der Mechanismen USER/PASS und SASL PLAIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2032("KOM-LE-A_2032", "Extrahieren der Zugangsdaten des POP3-Servers und des Kartenaufrufkontextes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2033("KOM-LE-A_2033", "Verbindungsaufbau mit POP3-Server über Adresse und Portnummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2034("KOM-LE-A_2034", "Authentifizierung gegenüber POP3-Server mit Benutzernamen und Passwort"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2035("KOM-LE-A_2035", "Unterstützung der Clientteile der Mechanismen USER/PASS und SASL PLAIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2036("KOM-LE-A_2036", "Authentifizierung gegenüber POP3-Server mit anderen Mechanismen als USER/PASS oder SASL PLAIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2037("KOM-LE-A_2037", "Antwortcodes des Verbindungsaufbaus mit dem POP3-Server"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2038("KOM-LE-A_2038", "Schließen der POP3-Verbindung mit dem Clientsystem"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2039("KOM-LE-A_2039", "Schließen der POP3-Verbindung mit dem POP3-Server"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2040("KOM-LE-A_2040", "Übermittlung von POP3-Kommandos und -Meldungen nach erfolgreicher Authentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2041("KOM-LE-A_2041", "Setzen des Parameters <N> des TOP-Kommandos auf Null"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2042("KOM-LE-A_2042", "Entschlüsselung einer KOM-LE-SMIME-Nachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2043("KOM-LE-A_2043", "Beachtung des recipient-emails Attributs bei der Entschlüsselung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2044("KOM-LE-A_2044", "E-Mail-Adresse des den Abholvorgang auslösenden Nutzers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2045("KOM-LE-A_2045", "Entschlüsselung nur mit Schlüsseln des abholenden Nutzers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2046("KOM-LE-A_2046", "Aufbau der Fehlernachricht bei fehlgeschlagener Entschlüsselung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2047("KOM-LE-A_2047", "Fehlertexte bei fehlgeschlagener Entschlüsselung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2048("KOM-LE-A_2048", "Prüfung der Signatur einer KOM-LE-Nachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2049("KOM-LE-A_2049", "Ergebnis der Signaturprüfung einer KOM-LE-Nachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2050("KOM-LE-A_2050", "Vermerke des Ergebnisses der Signaturprüfung einer KOM-LENachricht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2052("KOM-LE-A_2052", "Quellen zur Ermittlung der SM-B des Senders beim Signieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2057("KOM-LE-A_2057", "Abbrechen des Signierens, wenn keine SM-B verfügbar ist"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2058("KOM-LE-A_2058", "Abbrechen des Signierens, wenn Freischaltung der erforderlichen SM-B fehlschlägt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2059("KOM-LE-A_2059", "Verwendung des recipient-emails Attributs beim Entschlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2060("KOM-LE-A_2060", "Quellen zur Ermittlung der erforderlichen Karte beim Entschlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2061("KOM-LE-A_2061", "Speichern von Zuordnungen im Cache beim Entschlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2062("KOM-LE-A_2062", "Abbrechen des Entschlüsseln, wenn die erforderliche Karte nicht verfügbar ist"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2063("KOM-LE-A_2063", "Abbrechen des Entschlüsseln, wenn Freischaltung der erforderlichen Karte fehlschlägt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2064("KOM-LE-A_2064", "Verwendung von X.509-Identitäten bei der TLSAuthentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2065("KOM-LE-A_2065", "Schutz des Schlüsselspeichers für TLS-Verbindungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2066("KOM-LE-A_2066", "Verwendung von TLS für SMTP-Verbindungen mit Clientsystemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2067("KOM-LE-A_2067", "Verwendung von TLS für POP3-Verbindungen mit Clientsystemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2069("KOM-LE-A_2069", "Unterstützung von TLS Version 1.0 für die Kommunikation mit Clientsystemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2070("KOM-LE-A_2070", "Verbindungsaufbau mit dem Konnektor mit TLS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2071("KOM-LE-A_2071", "TLS-Verbindung mit dem Konnektor mit oder ohne zertifikatsbasierter Client-Authentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2072("KOM-LE-A_2072", "Verwendung von HTTP-Basic-Authentifizierung für TLSVerbindungen mit dem Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2074("KOM-LE-A_2074", "Verbindung zu KOM-LE-Fachdiensten immer über TLS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2075("KOM-LE-A_2075", "Prüfung von TLS-Server-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2076("KOM-LE-A_2076", "Ermittlung der Serviceendpunkte des Konnektors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2077("KOM-LE-A_2077", "Auswahl der unterstützten Version einer Dienstschnittstelle des Konnektors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2079("KOM-LE-A_2079", "Protokolldateien für Ablauf, Performance und Fehler"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2080("KOM-LE-A_2080", "Keine Protokollierung sensibler Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2081("KOM-LE-A_2081", "Format der Protokolldateien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2082("KOM-LE-A_2082", "Zugriff auf Protokolldateien einschränken"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2083("KOM-LE-A_2083", "Kopien der Protokolldateien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2084("KOM-LE-A_2084", "Aktivierung und Deaktivierung der Protokollierung von Performanceinformationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2085("KOM-LE-A_2085", "Begrenzung des Speicherplatzes für Protokolldateien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2086("KOM-LE-A_2086", "Vorgangsnummer für Protokolleinträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2087("KOM-LE-A_2087", "Felder zur Protokollierung des Ablaufs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2088("KOM-LE-A_2088", "Felder zur Protokollierung der Performance"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2089("KOM-LE-A_2089", "Aktionen zur Protokollierung der Performance"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2090("KOM-LE-A_2090", "Felder zur Protokollierung der Fehler"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2091("KOM-LE-A_2091", "Konfigurationsparameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2092("KOM-LE-A_2092", "Warnhinweis bei Abschaltung der TLS-Client-Parameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2094("KOM-LE-A_2094", "Skalierbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2176("KOM-LE-A_2176", "Prüfen auf gültiges ENC-Zertifikat für den Empfänger im RCPTKommando"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2177("KOM-LE-A_2177", "Verwenden von SignDocument und EncryptDocument"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2178("KOM-LE-A_2178", "Kein Versenden an Empfänger mit unterschiedlichen TelematikIDs in den Verschlüsselungszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2179("KOM-LE-A_2179", "Vermerk in der Nachricht bei erfolgreicher Entschlüsselung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2180("KOM-LE-A_2180", "Struktur des Signaturprüfberichts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2181("KOM-LE-A_2181", "Authentifizierung von Clientsystemen gegenüber dem Clientmodul"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2182("KOM-LE-A_2182", "Verwendung des vom KOM-LE-Anbieter zur Verfügung gestellten Zertifikats für die clientseitige TLS-Authentifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2184("KOM-LE-A_2184", "Standardwerte der Konfigurationsparameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2190("KOM-LE-A_2190", "Übergabe des recipient-emails Attributs beim Signieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2191("KOM-LE-A_2191", "Übergabe des recipient-emails Attributs beim Verschlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2192("KOM-LE-A_2192", "Fehlernachricht bei Empfänger mit unterschiedlichen TelematikIDs in den Verschlüsselungszertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2193("KOM-LE-A_2193", "Verpacken des verschlüsselten CMS-Objektes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2225("KOM-LE-A_2225", "Update-Mechanismen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2230("KOM-LE-A_2230", "Synchronisation mit der Systemzeit des Konnektors"),

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
