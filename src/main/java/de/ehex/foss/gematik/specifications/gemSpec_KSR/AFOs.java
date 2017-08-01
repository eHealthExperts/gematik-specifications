package de.ehex.foss.gematik.specifications.gemSpec_KSR;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_KSR]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3311("TIP1-A_3311", "Schutz Upload-Interface"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3312("TIP1-A_3312", "Nur zugelassene Update-Pakete im Downloadbereich der PU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3313("TIP1-A_3313", "Anzahl Update-Pakete pro dezentralem Produkt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3314("TIP1-A_3314", "Inhalt Update-Paket - Hersteller-Update-Informationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3315("TIP1-A_3315", "Inhalt Update-Paket - DokumentationFiles"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3316("TIP1-A_3316", "Firmware-Gruppenkonzept Informationen für den Konfigurationsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3317("TIP1-A_3317", "Firmware-Gruppenkonzept - Lieferung mit Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3318("TIP1-A_3318", "Firmware-Gruppenkonzept - Lieferung ohne Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3319("TIP1-A_3319", "Firmware-Gruppenkonzept - Aktive Firmware-Gruppen-Information"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3320("TIP1-A_3320", "Firmware-Gruppenkonzept - Übernahme Firmware-Gruppe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3321("TIP1-A_3321", "Firmware-Gruppenkonzept - Unterstützte Firmware Versionen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3322("TIP1-A_3322", "Firmware-Gruppenkonzept - Integritäts- und Authentizitätsschutz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3323("TIP1-A_3323", "Konfigurationsdienst TLS-Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3324("TIP1-A_3324", "Konfigurationsdienst TLS-Zertifikatserstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3325("TIP1-A_3325", "Konfigurationsdienst Keine Verbindungen ohne TLS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3326("TIP1-A_3326", "IPv4 und Ipv6 Unterstützung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3328("TIP1-A_3328", "Logging Datenänderungen im Konfigurationsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3330("TIP1-A_3330", "I_KSRS_Download::listUpdates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3331("TIP1-A_3331", "I_KSRS_Download::listUpdates Request"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3332("TIP1-A_3332", "I_KSRS_Download::listUpdates Response"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3333("TIP1-A_3333", "Konfigurationsdienst SOAP-Fehlercodes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3334("TIP1-A_3334", "I_KSRS_Download::getUpdates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3335("TIP1-A_3335", "Konfigurationsdienst File Transfer HTTP Request"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3336("TIP1-A_3336", "File Transfer HTTP Response"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3342("TIP1-A_3342", "Bereitstellung P_KSRS_Upload"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3343("TIP1-A_3343", "Berechtigung P_KSRS_Upload"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3345("TIP1-A_3345", "KSR Logging - Upload-Interface"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3346("TIP1-A_3346", "Eingangsprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3347("TIP1-A_3347", "Integrität und Authentizität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3348("TIP1-A_3348", "Form und Inhalt Upload-Interface"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3349("TIP1-A_3349", "Organisatorische Schnittstelle zur Erteilung von Aufträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3350("TIP1-A_3350", "Organisatorische Schnittstelle Form und Inhalt von Aufnahme-Aufträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3351("TIP1-A_3351", "Organisatorische Schnittstelle zur Bereitstellung von PU-Log-Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3352("TIP1-A_3352", "Organisatorische Schnittstelle zur Bereitstellung von statistischen Daten der PU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3353("TIP1-A_3353", "Inhalt der statistischen Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3354("TIP1-A_3354", "KSR-Statistiken - Format"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3355("TIP1-A_3355", "Schutz Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3895("TIP1-A_3895", "Inhalt Update-Paket - Konnektor FirmwareFiles"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3896("TIP1-A_3896", "Signatur der Update-Informationen durch Konnektorhersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3897("TIP1-A_3897", "Keine Signatur der Update-Informationen durch Kartenterminalhersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3908("TIP1-A_3908", "Firmware-Gruppenkonzept - Streichung Firmware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3909("TIP1-A_3909", "Bereitstellung I_KSRS_Download"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3910("TIP1-A_3910", "Konfigurationsdienst File Transfer http Komprimierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3913("TIP1-A_3913", "Organisatorische Schnittstelle Form und Inhalt von Lösch-Aufträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3914("TIP1-A_3914", "Berechtigungen für Aufträge PU-Download-Bereich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3915("TIP1-A_3915", "Berechtigungen für Aufträge TU-Downloadbereich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3916("TIP1-A_3916", "Berechtigungen für Aufträge RU-Downloadbereich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3917("TIP1-A_3917", "Keine Aufnahme von invaliden Update-Paket bzw. Firmware-Gruppen-Informationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3918("TIP1-A_3918", "Aufnahme von validen Update-Paket bzw. Firmware-Gruppen-Informationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3919("TIP1-A_3919", "Durchführungsbestätigung eines Auftrags"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3920("TIP1-A_3920", "Form und Inhalt der Durchführungsbestätigung eines Auftrags"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3921("TIP1-A_3921", "Logging der Auftragsbearbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3922("TIP1-A_3922", "Organisatorische Schnittstelle zur Bereitstellung von RU-Log-Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3923("TIP1-A_3923", "Organisatorische Schnittstelle zur Bereitstellung von TU-Log-Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3924("TIP1-A_3924", "Organisatorische Schnittstelle zur Bereitstellung von statistischen Daten der RU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3925("TIP1-A_3925", "Organisatorische Schnittstelle zur Bereitstellung von statistischen Daten der TU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4120("TIP1-A_4120", "File Transfer HTTP Status Codes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5038("TIP1-A_5038", "FehlerLog"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5039("TIP1-A_5039", "Remote-Fehlerbehandlung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5040("TIP1-A_5040", "Schlüssel sicher speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5042("TIP1-A_5042", "P_KSRS_Upload parallel nutzbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5043("TIP1-A_5043", "Organisatorische Schnittstellen parallel nutzbar"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5154("TIP1-A_5154", "Konfigurationsdatenfiles zur Anbindung von Bestandsnetzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5157("TIP1-A_5157", "Nur freigegebene Konfigurationsdatenfiles im Downloadbereich der PU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5158("TIP1-A_5158", "Inhalt Update-Paket - Kartenterminal FirmwareFiles"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5159("TIP1-A_5159", "Inhalt Update-Paket - Firmware-Gruppen-Information"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5160("TIP1-A_5160", "I_KSRS_Download::get_Ext_Net_Config"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5161("TIP1-A_5161", "TUC_KSR_001 „Get File“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5162("TIP1-A_5162", "http Status Code „Retry After“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5163("TIP1-A_5163", "Organisatorische Schnittstelle zur Übergabe von Konfigurationsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5375("TIP1-A_5375", "Filename des Konfigurationsdatenfiles zur Anbindung von Bestandsnetzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6065("TIP1-A_6065", "KSR Fortschrittsinformation im Interface P_KSRS_Upload"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6066("TIP1-A_6066", "KSR Bereitstellung 'Signier-Tool'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6067("TIP1-A_6067", "Organisatorische Schnittstelle zur Bereitstellung von KSR Statusberichten der PU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6074("TIP1-A_6074", "Organisatorische Schnittstelle zur Bereitstellung von KSR Statusberichten der PU - Inhalt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6075("TIP1-A_6075", "Organisatorische Schnittstelle zur Bereitstellung von KSR-Statusberichten der PU - Anhänge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6076("TIP1-A_6076", "Organisatorische Schnittstelle zur Bereitstellung von KSR-Statusberichten der PU - Excel-Import"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6102("TIP1-A_6102", "Datei-Format Logging- und Statistik-Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6103("TIP1-A_6103", "SOAP-Version"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6104("TIP1-A_6104", "KSR Download Cache Server"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6105("TIP1-A_6105", "KSR Download Cache Server Transparenz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6106("TIP1-A_6106", "KSR Download Cache Server Redundanz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6107("TIP1-A_6107", "Bereitstellung Registrierungsinterface"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6108("TIP1-A_6108", "FirmwareGroupInfo.xml Signatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6109("TIP1-A_6109", "KSR Nutzung des zentralen Netzes während Redundanz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6110("TIP1-A_6110", "Authentisierung und Autorisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6111("TIP1-A_6111", "Gruppen und Berechtigungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6112("TIP1-A_6112", "Name des Update-Paketes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6113("TIP1-A_6113", "Definition Update-Paket-Struktur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6114("TIP1-A_6114", "Passwort des Update-Paketes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6115("TIP1-A_6115", "Größe des Update-Paketes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6116("TIP1-A_6116", "Update-Paket - Dateinamen und Unterverzeichnisse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6117("TIP1-A_6117", "Referenzierungen des Update-Paketes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6118("TIP1-A_6118", "Zusätzliche Dateien im Update-Paket"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6119("TIP1-A_6119", "Update-Paket - Übertragung „Firmware-Gruppen-Information“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6120("TIP1-A_6120", "Update-Paket - Dateinamen der UpdateInformation Detached-Signatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6121("TIP1-A_6121", "Update-Paket - Dateinamen der FirmwareGroupInfo Detached-Signatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6122("TIP1-A_6122", "Pfadreferenz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6123("TIP1-A_6123", "Update-Paket - Signatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6124("TIP1-A_6124", "Bereitstellung KSR Update-Paket Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6125("TIP1-A_6125", "KSR Störungsampel Monitoringdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6126("TIP1-A_6126", "Organisatorische Schnittstelle Form und Inhalt Ergebnisse von Aufnahme-Aufträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6127("TIP1-A_6127", "Fehlerhafte Signaturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6128("TIP1-A_6128", "Vollständige Update-Pakete"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6129("TIP1-A_6129", "Bereitzustellende Dateien pro Update-Paket"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6130("TIP1-A_6130", "Bereitstellung DNS Resource Records"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6131("TIP1-A_6131", "FirmwareGroupInfo.xml - Format"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6132("TIP1-A_6132", "Detached-Signature der FirmwareGroupInfo.xml"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6133("TIP1-A_6133", "FirmwareGroupInfo.xml - Element „FirmwareGroupSignature“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6134("TIP1-A_6134", "Konfigurationsdatenfile - Format"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6135("TIP1-A_6135", "Löschen der Logging-Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6136("TIP1-A_6136", "Umfang der gespeicherten Logdaten"),

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
