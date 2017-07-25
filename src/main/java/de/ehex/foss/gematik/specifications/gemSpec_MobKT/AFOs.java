package de.ehex.foss.gematik.specifications.gemSpec_MobKT;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_MobKT]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3689("TIP1-A_3689", "Lokaler Anschluss zur Übertragung an das HOST-System"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3690("TIP1-A_3690", "mobile Szenarien: Datenübertragung an das Primärsystem mittels Dockingstation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3691("TIP1-A_3691", "Übertragungsprotokoll bei herstellerspezifischer Host-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3693("TIP1-A_3693", "Mobile Szenarien: Unverfälschtheit der Daten bei Übertragung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3694("TIP1-A_3694", "Mobile Szenarien: Zu übertragende Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3695("TIP1-A_3695", "Mobile Szenarien: Sicherstellung der Fortschaltsperre während der Übertragung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3696("TIP1-A_3696", "Mobile Szenarien, Betriebsbereitschaft: Anzeige der Betriebsbereitschaft im Rahmen der Benutzerführung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3697("TIP1-A_3697", "Mobile Szenarien: Interpretation der Fehleranzeige"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3698("TIP1-A_3698", "Anzeige von Bedienfehlern und ungültigen Eingaben am Mobilen KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3699("TIP1-A_3699", "Versionierung der Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3700("TIP1-A_3700", "Sicherstellung von Authentizität und Integrität eines FW-Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3701("TIP1-A_3701", "Übernahme als aktive Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3702("TIP1-A_3702", "Format der Kontaktiereinheit zur Aufnahme von Karten im ID-1-Format"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3703("TIP1-A_3703", "Zeitpunkt der Schaltung des „Card-In-Schalters“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3704("TIP1-A_3704", "Anpressdruck der Kontaktflächen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3705("TIP1-A_3705", "Umsetzung der Kartenkommunikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3708("TIP1-A_3708", "Erhaltung zwischengespeicherter Daten ohne Strom"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3709("TIP1-A_3709", "Erhaltung Systemzeit mittels Pufferbatterie"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3710("TIP1-A_3710", "Manuelles Rücksetzen des Authentifikationsstatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3711("TIP1-A_3711", "Blockieren von ungültigen und fehlerhaften Kommandos"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3712("TIP1-A_3712", "Umweltanforderungen für den Einsatz in mobilen Szenarien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3713("TIP1-A_3713", "Transportierbarkeit für den Einsatz in mobilen Szenarien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3714("TIP1-A_3714", "Möglichkeit zum manuellen Löschen bereits übertragener Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3715("TIP1-A_3715", "Display zur Anzeige am Mobilen KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3716("TIP1-A_3716", "PIN Pad zur PIN-Eingabe am Mobilen KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3717("TIP1-A_3717", "Freischaltung der eGK mittels PIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3718("TIP1-A_3718", "Mindestanzahl der Kontaktiereinheiten am mobilen Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3719("TIP1-A_3719", "Mindestanzahl gleichzeitig aufnehmbarer ID-1-Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3720("TIP1-A_3720", "Gleichzeitig aufnehmbare ID-1-Karte und Plug-In-Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3721("TIP1-A_3721", "Anzahl Kontaktiereinheiten im Sinne der Zukunftssicherheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3722("TIP1-A_3722", "Verlust der aktiven Authentifizierungsstatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3723("TIP1-A_3723", "Dimensionierung des erweiterten Displays"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3724("TIP1-A_3724", "Schreibender Zugriff auf die eGK nur auf den Logging-Container"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3725("TIP1-A_3725", "Managementschnittstelle zu Diagnose- und Konfigurationszwecken des Mini-AKs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3727("TIP1-A_3727", "Schutz der Managementschnittstelle durch Username und Passwort"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3728("TIP1-A_3728", "Export und Import von Konfigurationsdaten über die Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3729("TIP1-A_3729", "Einschränkungen der exportierbaren Konfigurationsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3730("TIP1-A_3730", "Einstellungsmöglichkeiten über die Managementschnittstelle des Mini-AKs im Falle einer Einboxlösung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3731("TIP1-A_3731", "Aktionen zur Diagnose von Betriebs und Fehlerzuständen über die Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3732("TIP1-A_3732", "Mobile Szenarien: Freilaufgenauigkeit eingesetzter Systemuhren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3733("TIP1-A_3733", "Erhalt eventuell vorhandener Daten eines Versicherten bei Fehler während des Zwischenspeicherns"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3737("TIP1-A_3737", "mobile Szenarien Konfiguration: Export/Import von Konfigurationsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3738("TIP1-A_3738", "Definition Einboxlösung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3739("TIP1-A_3739", "mobile Szenarien: Ausschließliche Nutzung von HBA oder SMC-Bs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3740("TIP1-A_3740", "Konfigurationsschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3741("TIP1-A_3741", "Rolle Administrator an der Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3742("TIP1-A_3742", "Berechtigungen der Rolle Administrator an der Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3743("TIP1-A_3743", "Sicherer Firmware-Update-Mechanismus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3744("TIP1-A_3744", "Erkennung von Übertragungsfehlern während des Firmware Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3745("TIP1-A_3745", "Systemuhr im Mini-PS: Aufteilung in Datum und Uhrzeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3746("TIP1-A_3746", "Mobile Szenarien, Firmware Update: Verantwortlichkeit der Prüfung der neuen Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3747("TIP1-A_3747", "Mobile Szenarien, Firmware Update: Zulässige Verfahren zur Sicherung des FW-Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3748("TIP1-A_3748", "mobile Szenarien: Löschen des Zwischenspeichers bei Rücksetzen auf Werkseinstellungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3749("TIP1-A_3749", "mobile Szenarien: weitere Zulässige Zeichen für Kennwörter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3750("TIP1-A_3750", "mobile Szenarien: Username nicht als Bestandteil des Kennwortes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3751("TIP1-A_3751", "mobile Szenarien: Kennwörter nicht auf programmierbaren Funktionstasten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3752("TIP1-A_3752", "mobile Szenarien: Keine Klartextanzeige des Kennwortes während Eingabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3753("TIP1-A_3753", "mobile Szenarien: Sicherung des Fehlerzählers vor Veränderung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3754("TIP1-A_3754", "Schutz vor Kartenzugriff bei Anschluss an das Primärsystem"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3755("TIP1-A_3755", "Verwendung der Ver- und Entschlüsselungsfunktionen berechtigter Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3756("TIP1-A_3756", "mobile Szenarien: Verschlüsselung zwischenzuspeichernder Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3757("TIP1-A_3757", "Einhalten des Seitenverhältnisses des Prüfzeichens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3758("TIP1-A_3758", "Mindestgröße des Prüfzeichens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3759("TIP1-A_3759", "Verhalten bei Rücksetzen des Sicherheitsstatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3760("TIP1-A_3760", "Softwareselbsttest"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3761("TIP1-A_3761", "Definition Werksreset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3762("TIP1-A_3762", "Verbindung zwischen Mini-PS und erweitertem Display"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3763("TIP1-A_3763", "Landende Kontakte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3764("TIP1-A_3764", "Mindestlänge, zulässige Zeichen für Kennwörter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3765("TIP1-A_3765", "Mobiles KT: Karten-Versorgungsspannung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3766("TIP1-A_3766", "mobKT Werkszustand - Kennwörter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3767("TIP1-A_3767", "mobKT Werkszustand - erlaubte Funktion"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3768("TIP1-A_3768", "Mobiles KT: 'TUC_MOKT_200 sendAPDU'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3769("TIP1-A_3769", "Mobiles KT: 'TUC_MOKT_202 readFile'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3770("TIP1-A_3770", "Mobiles KT: 'TUC_MOKT_209 readRecord'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3771("TIP1-A_3771", "Mobiles KT: 'TUC_MOKT_214 appendRecord'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3772("TIP1-A_3772", "Mobiles KT: 'TUC_MOKT_220 fulfillAccessConditions'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3773("TIP1-A_3773", "Mobiles KT: 'TUC_MOKT_250 selectCardFile'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3774("TIP1-A_3774", "Mobiles KT: 'TUC_MOKT_405 authenticateCardToCard'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3775("TIP1-A_3775", "Mobiles KT: 'TUC_MOKT_406 writeEGKAudit'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3776("TIP1-A_3776", "Mobiles KT: 'TUC_MOKT_407 selectKeyForAsymmetricExternalAuthentication'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3777("TIP1-A_3777", "Mobiles KT: 'TUC_MOKT_412 verifyPIN'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3778("TIP1-A_3778", "Mobiles KT: 'TUC_MOKT_417 readFromEGK'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3779("TIP1-A_3779", "Mobiles KT: 'TUC_MOKT_418 checkEGK'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3780("TIP1-A_3780", "Mobiles KT: 'TUC_MOKT_419 changePIN'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3781("TIP1-A_3781", "Mobiles KT: 'TUC_MOKT_420 showEGKAccessInKTDisplay'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3782("TIP1-A_3782", "Mobiles KT: 'TUC_MOKT_438 checkEGKAuthCertificate'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3783("TIP1-A_3783", "Mobiles KT: 'TUC_MOKT_470 encryptData'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3784("TIP1-A_3784", "Mobiles KT: 'TUC_MOKT_471 decryptData'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3787("TIP1-A_3787", "Mobiles KT: durch Kartendienst bereitzustellende Funktionen für sichere Kommunikation zwischen Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3788("TIP1-A_3788", "Mobiles KT: Bestimmung des AID einer Prozessorkarte nach [ISO7816-3]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3789("TIP1-A_3789", "Mobiles KT: unterschiedliche berechtigte Karten für die Verschlüsselung und Ablage von Daten im Zwischenspeicher"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3790("TIP1-A_3790", "Mobiles KT: PIN-Änderung für HBA und SMC-B über Benutzerschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3791("TIP1-A_3791", "Mobiles KT: PIN-Entsperren bei blockiertem HBA oder SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3792("TIP1-A_3792", "Mobiles KT: Terminal-Anzeigen gemäß Vorgaben zu Darstellung von Display Messages"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3793("TIP1-A_3793", "Mobiles KT: Terminal-Anzeigen - Nummer der jeweiligen Functional Unit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3794("TIP1-A_3794", "Mobiles KT: 'TUC_MOKT_421 unblockPIN'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3795("TIP1-A_3795", "Mobiles KT: 'TUC_MOKT_010 writeToInternalStorage'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3796("TIP1-A_3796", "Mobiles KT: 'TUC_MOKT_011 readFromInternalStorage'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3798("TIP1-A_3798", "Mobiles KT: Keine Zwischenspeicherung zusätzlicher Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3799("TIP1-A_3799", "Signalisieren der Kartenzugriffe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3800("TIP1-A_3800", "Mobile Szenarien: Haltbarkeit der Geräte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3801("TIP1-A_3801", "Mobile Szenarien: Zuverlässigkeitsprognose der Geräte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3802("TIP1-A_3802", "Mobile Szenarien: Interne Stromquelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3803("TIP1-A_3803", "Mindestdauer der Standbyzeit für Mobile Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3804("TIP1-A_3804", "Umschalten aus einem speziellen Betriebsmodus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3805("TIP1-A_3805", "Umweltanforderungen für den Einsatz in mobilen Szenarien bei Lagerung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3806("TIP1-A_3806", "Bestätigung der PIN-Eingabe am Mobilen KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3807("TIP1-A_3807", "Format der zu unterstützenden Plug-In-Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3808("TIP1-A_3808", "Verschlüsselung zwischengespeicherter Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3809("TIP1-A_3809", "Kommunikation zwischen Mini-PS und Drucker"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3810("TIP1-A_3810", "Aufnahme von Arzt- und Betriebstättennummer über das Mini-PS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3811("TIP1-A_3811", "mobile Szenarien Ausdruck von Daten: Eingabe von Arzt- und Betriebsstättennummer während Druckvorgang"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3812("TIP1-A_3812", "Kartenkontakte und Umschalten in andere Betriebsmodi"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3813("TIP1-A_3813", "Kartenkontakte und Umschalten Betriebsmodi"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3815("TIP1-A_3815", "Mobiles KT: Bestimmung der AID aus File Control Parameter oder Application Template"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3816("TIP1-A_3816", "Mobiles KT: Karten-Inkompatibilität als Ergebnis der Kompatibilitätsprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3825("TIP1-A_3825", "Ausführen eines zulässigen Downgrades"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3832("TIP1-A_3832", "Persistente Speicherung von Arzt- und Betriebsstättennummer am Mini-PS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3834("TIP1-A_3834", "mobile Szenarien: Fehlerzähler für Falscheingaben von Kennworten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3835("TIP1-A_3835", "mobile Szenarien: Sperrzeiten bei mehrfachen Fehlversuchen der Kennworteingabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3836("TIP1-A_3836", "mobile Szenarien: Erhalt des Fehlerzählers im spannungslosen Zustand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3837("TIP1-A_3837", "mobile Szenarien: Erhalt der verstrichenen Wartezeit im spannungslosen Zustand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3838("TIP1-A_3838", "mobile Szenarien: Wartezeit nach Reset ohne Erhalt der verstrichenen Wartezeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3839("TIP1-A_3839", "Manipulationsgeschützte Speicherung des Sicherheitsattributes für die Sicherung des FW- Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3840("TIP1-A_3840", "mobile Szenarien: Freigabe von Ressourcen bei Fehlersituation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3842("TIP1-A_3842", "Referenzuhr zur Bestimmung des Zeitpunktes für Log-Einträge der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3843("TIP1-A_3843", "Mindestanzahl an durch ein erweitertes Display darstellbaren Zeilen und Zeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3844("TIP1-A_3844", "Am erweiterten Display darstellbarer Zeichensatz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3847("TIP1-A_3847", "Mobile Szenarien: Betriebsdauer mittels interner Stromquelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3848("TIP1-A_3848", "Verhinderung von Ableiten von Daten durch die Dockingstation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3849("TIP1-A_3849", "Verhinderung von Zwischenspeichern von Daten durch die Dockingstation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3850("TIP1-A_3850", "Automatisches Rücksetzen des Sicherheitsstatus bei Inaktivität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3851("TIP1-A_3851", "Automatisches Rücksetzen des Sicherheitsstatus bei Abschalten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3852("TIP1-A_3852", "Lebensdauer sensibler, medizinischer Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3853("TIP1-A_3853", "Externes Display am Mini-PS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3854("TIP1-A_3854", "Mobiles Kartenterminal: erweitertes Display"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3855("TIP1-A_3855", "mobile Szenarien, Dockingstation: Löschen des Zwischenspeichers nach Übertragung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3856("TIP1-A_3856", "Mobiles KT: Einschränkungen bei Ablauf der Zertifikatsgültigkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3859("TIP1-A_3859", "Berechtigungen der optionalen Rollen an der Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3860("TIP1-A_3860", "mobile Szenarien: Verwendung des Zufallszahlengenerators einer berechtigten Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3861("TIP1-A_3861", "Mobiles KT: Vorgaben zum Kommando SICCT PERFORM VERIFICATION"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3862("TIP1-A_3862", "Mobiles KT: Timeout bei der PIN-Eingabe (erstes Zeichen)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3863("TIP1-A_3863", "Mobiles KT: Timeout bei der PIN-Eingabe (weitere Zeichen)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3864("TIP1-A_3864", "Mobiles KT: Vorgaben zum Kommando SICCT MODIFY VERIFICATION"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3865("TIP1-A_3865", "Mobiles KT: Timeout bei der PIN-Änderung (erstes Zeichen)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3866("TIP1-A_3866", "Mobiles KT: Timeout bei der PIN-Änderung (weitere Zeichen)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3867("TIP1-A_3867", "Mobile Szenarien: Am Display darstellbare Zeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3868("TIP1-A_3868", "mobile Szenarien: Freigabe von Ressourcen ohne manuelles Eingreifen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3869("TIP1-A_3869", "Werksreset nicht dauerhaft unausführbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3870("TIP1-A_3870", "mobKT im Werkszustand erlaubte Funktion"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3871("TIP1-A_3871", "Mobile Szenarien: Übertragungsrhythmus zwischengespeicherter Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3872("TIP1-A_3872", "Mobiles KT: Information bei Ablauf der Zertifikatsgültigkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3873("TIP1-A_3873", "Mobiles KT: Konfiguration Zeitpunkt Warnung vor Ablauf Zertifikatsgültigkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3874("TIP1-A_3874", "Gewährleistung der Sicherheit bei Unterstützung kontaktloser Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3875("TIP1-A_3875", "Freischaltung der berechtigten Karte mittels PIN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4256("TIP1-A_4256", "Zu unterstützende Übertragungsprotokolle zu den asynchronen Chipkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4257("TIP1-A_4257", "Zu unterstützende Übertragungsprotokolle zu den synchronen Chipkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4258("TIP1-A_4258", "Mobile Szenarien: Manuelles Löschen zwischengespeicherter VSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4259("TIP1-A_4259", "Mobile Szenarien: Einzelnes Löschen der zwischengespeicherten Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4260("TIP1-A_4260", "Mobile Szenarien: Anzeige der Fehlerzustände"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4261("TIP1-A_4261", "Mobile Szenarien: Mechanismen zur Fehleranzeige"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4262("TIP1-A_4262", "Verwendung von Kontaktschonenden Kontaktiereinheiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4263("TIP1-A_4263", "Handhabung von Fehlerfällen, Verhinderung von Deadlock-Situationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4266("TIP1-A_4266", "mobile Szenarien: Abfrage Statusinformation über Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4267("TIP1-A_4267", "mobile Szenarien: Aufbringung eines inversen Prüfzeichens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4268("TIP1-A_4268", "mobile Szenarien: Geschütztes Speichern von Kennwörtern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4269("TIP1-A_4269", "Authentifikation der Rolle Administrator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4270("TIP1-A_4270", "Zugriff auf zwischengespeicherte Daten erst nach Authentisierung zugelassen."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4271("TIP1-A_4271", "Mobiles KT: Fehlermeldung Karten Inkompatibilität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4272("TIP1-A_4272", "Mobile Szenarien: Fortschaltsperre"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4273("TIP1-A_4273", "Selbstauskunft: Produkt-Versionsstand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4274("TIP1-A_4274", "Selbstauskunft: Firmware-Gruppen-Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4275("TIP1-A_4275", "Überbrücken von Fehlerzuständen bei der Kartenkommunikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4401("TIP1-A_4401", "Dauerhafte Stromversorgung der gesteckten Chipkarte(n)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4402("TIP1-A_4402", "Vermeidung von Beschädigungen der Karte durch die Kontaktiereinheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4403("TIP1-A_4403", "Schutz der zwischengespeicherten Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4404("TIP1-A_4404", "Zwischenspeicher zur Sicherung von Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4405("TIP1-A_4405", "Sicherheit bei Anschluss externer Komponenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4406("TIP1-A_4406", "Spezifizierung gematik-Prüfzeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4407("TIP1-A_4407", "Anbringung gematik-Prüfzeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4408("TIP1-A_4408", "Optische Gestaltung des Prüfzeichens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4410("TIP1-A_4410", "Mobiles Kartenterminal: Software zur Anbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4411("TIP1-A_4411", "Kurzzeitig höherer Strombedarf von Chipkarten (Spike)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4412("TIP1-A_4412", "Erhaltung zwischengespeicherter Daten mittels Pufferbatterie"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4413("TIP1-A_4413", "Beschränkung des Zugangs zu Plug-In-Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4414("TIP1-A_4414", "Einschränkungen an das Einstellen des Datums bei zwischengespeicherten Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4415("TIP1-A_4415", "Mobiles KT: konfigurierbares Druckmodul"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4417("TIP1-A_4417", "Mobiles KT: Reset CT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4418("TIP1-A_4418", "Mobiles KT: Request ICC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4419("TIP1-A_4419", "Mobiles KT: Eject ICC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4420("TIP1-A_4420", "Mobiles KT: SELECT FILE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4421("TIP1-A_4421", "Mobiles KT: ERASE BINARY"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4422("TIP1-A_4422", "Mobiles KT: GET STATUS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4423("TIP1-A_4423", "Übertragungsraten zu den Chipkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4424("TIP1-A_4424", "mobile Szenarien Verschlüsselung: Zu verwendende Verfahren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4425("TIP1-A_4425", "Verwendung des erweiterten Displays zur PIN-Eingabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4426("TIP1-A_4426", "Mobiles KT: Fehlersignalisierung über erweitertes Display"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4921("TIP1-A_4921", "Mobiles KT: Fachliche Anwendungsfälle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4922("TIP1-A_4922", "Mobiles KT: sicherer Modus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4934("TIP1-A_4934", "Mobiles KT: CT-API Versionierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4935("TIP1-A_4935", "Mobiles KT: CT-API Abfrage Versionsnummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4936("TIP1-A_4936", "Mobiles KT: Anforderung an Zufallszahlen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4937("TIP1-A_4937", "Mobiles KT: Anforderung an Einmalschlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4938("TIP1-A_4938", "Mobiles KT: Bestimmung der AID einer Speicherkarte nach [KVK#4.1]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4939("TIP1-A_4939", "Mobiles KT: Extended Length der Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4940("TIP1-A_4940", "Mobiles KT: Nachladen von Cross-CVCs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4941("TIP1-A_4941", "Mobiles KT: Hinweis Administratorauthentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4942("TIP1-A_4942", "Kommandoaufbau Host-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4943("TIP1-A_4943", "Ergänzung allgemeiner Fehlercode"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4944("TIP1-A_4944", "Mobiles KT: Timer Request ICC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4945("TIP1-A_4945", "Mobiles KT: Timer Eject ICC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4946("TIP1-A_4946", "Umsetzung der Chipkartenschnittstelle entsprechend [KVK], [HBA], [SMC-B] und [eGK]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4947("TIP1-A_4947", "Vibrationstests I"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4948("TIP1-A_4948", "Ausprägung des Zugriffsprotokolls"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4949("TIP1-A_4949", "Beschreibung des Verfahrens für das Zugriffsprotokoll"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4950("TIP1-A_4950", "Mobiles KT: READ BINARY"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4951("TIP1-A_4951", "Dimensionierung des Zwischenspeichers: Mindestanzahl zwischenzuspeichernder VSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4952("TIP1-A_4952", "mobile Szenarien: Zeitpunkt für Prüfung auf berechtigte Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4953("TIP1-A_4953", "mobile Szenarien, Zertifikatsdienst: Überprüfung der Gültigkeit der X.509-Zertifikate einer Karte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4954("TIP1-A_4954", "Möglichkeit zum Werksreset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4955("TIP1-A_4955", "Werksreset Administrator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4956("TIP1-A_4956", "Mobiles KT: Kartendienstunterstützung für eGK, HBA, SMC-B und KVK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4957("TIP1-A_4957", "Mobiles KT: Unterstützung Kartenversionen von eGK, HBA und SMC-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4958("TIP1-A_4958", "Abbruchtaste bei PIN-Eingabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4973("TIP1-A_4973", "Schreibschutz KVK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4974("TIP1-A_4974", "Anzeige Systemzeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4975("TIP1-A_4975", "Prüfung Systemzeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4976("TIP1-A_4976", "Enter-Taste bei bekannter PIN-Länge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4977("TIP1-A_4977", "Lage Kartenkontakte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4978("TIP1-A_4978", "Unterstützung Kartenkontakte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4979("TIP1-A_4979", "Elektrischer Anschluss Kartenkontakte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5006("TIP1-A_5006", "Dokumentation der Konfiguration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5008("TIP1-A_5008", "Mobiles KT: Ausschluss Prüfung auf Freischaltung bei SELECT FILE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5014("TIP1-A_5014", "EMV-Prüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5085("TIP1-A_5085", "Beleuchtung erweitertes Display"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5145("TIP1-A_5145", "Konfigurierbarkeit der Benutzerinaktivitätszeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5146("TIP1-A_5146", "Intervall der Benutzerinaktivitätszeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5147("TIP1-A_5147", "Benutzerinaktivitätszeit im Auslieferungszustand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5373("TIP1-A_5373", "Vibrationstests II, Falltest"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5374("TIP1-A_5374", "Mobile Szenarien: Fortschaltsperre, Nichtaufhebbarkeit der Markierung als übertragen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5427("TIP1-A_5427", "Weiterer Mechanismus für Werksreset"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5428("TIP1-A_5428", "Authentisierung für weiteren Werksreset Mechanismus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5429("TIP1-A_5429", "Dokumentation Werksreset Mechanismus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5430("TIP1-A_5430", "Ausführung eines Werksreset ohne Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5431("TIP1-A_5431", "Aktivierung/Deaktivierung des Werksreset ohne Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5432("TIP1-A_5432", "Standardeinstellung Werksreset ohne Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6059("TIP1-A_6059", "Mobiles KT: flexibel konfigurierbares Druckmodul"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6060("TIP1-A_6060", "Mobiles KT: Zulassung einer neuen Version des Druckmoduls"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6484("TIP1-A_6484", "Anzahl Cross-CVCs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6485("TIP1-A_6485", "Mobiles KT: Kompatibilität zukünftiger Kartenversionen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6706("TIP1-A_6706", "Mobiles KT: Versionen der Betriebssysteme für CT-API"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_7033("TIP1-A_7033", "Austauschbare Pufferbatterien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_7034("TIP1-A_7034", "Stromloser Zustand - Verlust der Uhrzeit und Übertragung von Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_7035("TIP1-A_7035", "Stromloser Zustand - Einstellen der Uhrzeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2714("VSDM-A_2714", "Fachmodul VSDM (mobKT): technische Nutzbarkeit und Offline-Gültigkeit der eGK prüfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2717("VSDM-A_2717", "Fachmodul VSDM (mobKT): VSD Status Container prüfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2718("VSDM-A_2718", "Fachmodul VSDM (mobKT): PD und VD lesen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2719("VSDM-A_2719", "Fachmodul VSDM (mobKT): GVD lesen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2720("VSDM-A_2720", "Fachmodul VSDM (mobKT): Protokolleintrag auf eGK schreiben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2721("VSDM-A_2721", "Fachmodul VSDM (mobKT): PD, VD, GVD und StatusVD im Zwischenspeicher ablegen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2725("VSDM-A_2725", "Fachmodul VSDM (mobKT): Technische Fehler beim Lesen von VSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2730("VSDM-A_2730", "Fachmodul VSDM (mobKT): KVK Lesen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2731("VSDM-A_2731", "Fachmodul VSDM (mobKT): KVK prüfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2732("VSDM-A_2732", "Fachmodul VSDM (mobKT): Felder hinzufügen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2734("VSDM-A_2734", "Fachmodul VSDM (mobKT): VSD im Zwischenspeicher ablegen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2762("VSDM-A_2762", "Fachmodul VSDM (mobKT): Echtheit der beteiligten Karten prüfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2763("VSDM-A_2763", "Fachmodul VSDM (mobKT): HPC im Ablauf freischalten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2764("VSDM-A_2764", "Fachmodul VSDM (mobKT): Warnung wenn kein Versicherungsschutz besteht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2765("VSDM-A_2765", "Fachmodul VSDM (mobKT): Aktivitäten KVK Lesen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2766("VSDM-A_2766", "Fachmodul VSDM (mobKT): Aktivitäten beim Lesen von der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2767("VSDM-A_2767", "Fachmodul VSDM (mobKT): unterstützte Versionen der eGK 1+ und 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2768("VSDM-A_2768", "Fachmodul VSDM (mobKT): Versichertendaten im Zwischenspeicher überschreiben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2769("VSDM-A_2769", "Fachmodul VSDM (mobKT): 'GültigkeitsDatum' mit der Systemuhr überprüfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2782("VSDM-A_2782", "Fachmodul VSDM (mobKT): Pflichtfelder zum Anzeigen auf dem Display"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2783("VSDM-A_2783", "Fachmodul VSDM (mobKT): GVD nicht aus dem Container EF.VD lesen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2876("VSDM-A_2876", "Fachmodul VSDM (mobKT): Speicherung von VSD und Protokollierungsdaten im dafür vorgesehenen Zwischenspeicher"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2877("VSDM-A_2877", "Fachmodul VSDM (mobKT): Bedruckungsvorschriften für Formularköpfe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2878("VSDM-A_2878", "Fachmodul VSDM (mobKT): Übertragung von Arztnummer und die Betriebsstättennummer zum Drucker"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2880("VSDM-A_2880", "Fachmodul VSDM (mobKT): Versichertendaten auf dem Display unverändert anzeigen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2881("VSDM-A_2881", "Felder hinzufügen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2903("VSDM-A_2903", "Fachmodul VSDM (mobKT): Löschen von VSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2927("VSDM-A_2927", "Anzeigen zwischengespeicherter Versichertendaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2928("VSDM-A_2928", "Drucken von Versichertendaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2930("VSDM-A_2930", "Fachmodul VSDM (mobKT): Übertragungsformat der KVK-Daten an der Host-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2931("VSDM-A_2931", "Fachmodul VSDM (mobKT): Konfigurationsmöglichkeit Festformat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2938("VSDM-A_2938", "Fachmodul VSDM (mobKT): alte Versionen der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2962("VSDM-A_2962", "Fachmodul VSDM (mobKT): Unterstützung einer neuen VSD-Schemaversion"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2963("VSDM-A_2963", "Fachmodul VSDM (mobKT): Nicht bekanntes Schema beim Lesen von VSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2980("VSDM-A_2980", "Fachmodul VSDM: unterstützte Versionen der VSDM Speicherstrukturen auf der eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2985("VSDM-A_2985", "Fachmodul VSDM (mobKT): Warnung bei ruhendem Leistungsanspruch"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2995("VSDM-A_2995", "Fachmodul VSDM (mobKT): Unterstützung einer neuen VSD-Speicherstruktur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3000("VSDM-A_3000", "Fachmodul VSDM (mobKT): Weitere Prüfungen beim Lesen von VSD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3049("VSDM-A_3049", "Fachmodul VSDM (mobKT): Bedruckungsvorschriften ASV-Kennzeichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3050("VSDM-A_3050", "Version der Bedruckungsvorschriften"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3051("VSDM-A_3051", "Fachmodul VSDM (mobKT): Aktuelle Bedruckungsvorschriften für Formularköpfe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_3052("VSDM-A_3052", "Fachmodul VSDM (mobKT): Weitere Funktionalitäten aktueller Bedruckungsvorschriften"),

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
