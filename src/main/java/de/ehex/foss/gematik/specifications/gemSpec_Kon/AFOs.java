package de.ehex.foss.gematik.specifications.gemSpec_Kon;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Kon]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4500("TIP1-A_4500", "Dokumentgrößen von 25 MB"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4502("TIP1-A_4502", "Zeichensatzcodierungen UTF-8 und ISO-8859-15"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4503("TIP1-A_4503", "Verpflichtung zur Nutzung von gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4504("TIP1-A_4504", "Keine Administratorinteraktion bei Einsatz mehrerer gSMC-Ks"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4505("TIP1-A_4505", "Schutz vor physischer Manipulation gSMC-K (Sichere Verbundenheit der gSMC-K)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4506("TIP1-A_4506", "Initiale Identitäten der gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4507("TIP1-A_4507", "Isolation während der Bootup-Phase"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4508("TIP1-A_4508", "Konnektorzustand nach Bootup"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4509("TIP1-A_4509", "Betriebszustand erfassen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4510("TIP1-A_4510", "Sicherheitskritische Fehlerzustände"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4512("TIP1-A_4512", "Ereignis bei Änderung des Betriebszustandes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4513("TIP1-A_4513", "Betriebszustände anzeigen und Fehlerzustände zurücksetzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4514("TIP1-A_4514", "Verfügbarkeit einer TLS Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4515("TIP1-A_4515", "Verpflichtung zur Nutzung der TLS-Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4516("TIP1-A_4516", "Authentifizierung der Clients über Basic-Auth und X.509-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4517("TIP1-A_4517", "Schlüssel und X.509-Zertifikate für die Authentisierung des Clientsystems erzeugen und exportieren sowie X.509-Zertifikate importieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4518("TIP1-A_4518", "Konfiguration der Anbindung Clientsysteme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4519("TIP1-A_4519", "Web-Services konform zu [BasicProfile1.2]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4520("TIP1-A_4520", "Bildung von Fehler-Trace-Strukturen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4521("TIP1-A_4521", "Protokollierung von Fehlern inkl. Trace-Struktur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4522("TIP1-A_4522", "Zugriffsberechtigungs-Informationsmodell des Konnektors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4523("TIP1-A_4523", "Sicherung der Aktualität des InformationsmodellsZugriffsberechtigungsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4524("TIP1-A_4524", "TUC_KON_000 “Prüfe Zugriffsberechtigung”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4525("TIP1-A_4525", "Initialisierung Zugriffsberechtigungsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4526("TIP1-A_4526", "Bearbeitung Informationsmodell Zugriffsberechtigungsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4527("TIP1-A_4527", "TUC_KON_080 “Dokument validieren”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4528("TIP1-A_4528", "Bereitstellen des Dienstverzeichnisdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4529("TIP1-A_4529", "Formatierung der Ausgabedatei"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4532("TIP1-A_4532", "Schnittstelle der Basisanwendung Dienstverzeichnisdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4533("TIP1-A_4533", "Dienstverzeichnisdienst initialisieren."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4534("TIP1-A_4534", "Kartenterminals nach eHealth-KT-Spezifikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4535("TIP1-A_4535", "Unterstützung logischer Kartenterminals für HSMs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4536("TIP1-A_4536", "TLS-Verbindung zu Kartenterminals halten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4537("TIP1-A_4537", "KT-Statusanpassung bei Beendigung oder Timeout einer Netzwerkverbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4538("TIP1-A_4538", "Wiederholter Verbindungsversuch zu den KTs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4539("TIP1-A_4539", "Robuster Kartenterminaldienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4540("TIP1-A_4540", "Reaktion auf Dienstbeschreibungspakete"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4541("TIP1-A_4541", "Reaktion auf KT-Slot-Ereignis - Karte eingesteckt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4542("TIP1-A_4542", "Reaktion auf KT-Slot-Ereignis - Karte entfernt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4543("TIP1-A_4543", "KT-Statusanpassung bei Beginn eines Updatevorgangs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4544("TIP1-A_4544", "KT-Statusanpassung bei Ende eines Updatevorgangs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4545("TIP1-A_4545", "TUC_KON_050 „BeginneKartenterminalsitzung“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4546("TIP1-A_4546", "TUC_KON_054 „Kartenterminal hinzufügen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4547("TIP1-A_4547", "TUC_KON_051 „Mit Anwender über Kartenterminal interagieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4548("TIP1-A_4548", "TUC_KON_053 „Paire Kartenterminal“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4549("TIP1-A_4549", "Initialisierung Kartenterminaldienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4550("TIP1-A_4550", "Konfigurationsparameter des Kartenterminaldienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4551("TIP1-A_4551", "Einsichtnahme von Kartenterminaleinträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4552("TIP1-A_4552", "Manueller Verbindungsversuch zu Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4553("TIP1-A_4553", "Einsichtnahme in und Aktualisierung der Kartenterminaleinträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4554("TIP1-A_4554", "Bearbeitung von Kartenterminaleinträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4555("TIP1-A_4555", "Manuelles Hinzufügen eines Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4556("TIP1-A_4556", "Pairing mit Kartenterminal durchführen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4557("TIP1-A_4557", "Ändern der Korrelationswerte eines Kartenterminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4558("TIP1-A_4558", "Caching-Dauer von Kartendaten im Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4559("TIP1-A_4559", "Konnektorzugriffsverbot auf DF.KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4560("TIP1-A_4560", "Rahmenbedingungen für Kartensitzungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4561("TIP1-A_4561", "Terminal-Anzeigen für PIN-Operationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4562("TIP1-A_4562", "Reaktion auf „Karte entfernt“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4563("TIP1-A_4563", "Reaktion auf „Karte gesteckt“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4565("TIP1-A_4565", "TUC_KON_001 „Karte öffnen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4566("TIP1-A_4566", "TUC_KON_026 „Liefere CardSession“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4567("TIP1-A_4567", "TUC_KON_012 „PIN verifizieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4568("TIP1-A_4568", "TUC_KON_019 „PIN ändern“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4569("TIP1-A_4569", "TUC_KON_021 „PIN entsperren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4570("TIP1-A_4570", "TUC_KON_022 „Liefere PIN-Status“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4571("TIP1-A_4571", "TUC_KON_023 „Karte reservieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4572("TIP1-A_4572", "TUC_KON_005 „Card-to-Card authentisieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4573("TIP1-A_4573", "TUC_KON_202 „LeseDatei“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4574("TIP1-A_4574", "TUC_KON_203 „SchreibeDatei“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4575("TIP1-A_4575", "TUC_KON_209 „LeseRecord“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4577("TIP1-A_4577", "TUC_KON_214 „FügeHinzuRecord“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4579("TIP1-A_4579", "TUC_KON_018 „eGK-Sperrung prüfen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4580("TIP1-A_4580", "TUC_KON_006 „Datenzugriffsaudit eGK schreiben“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4581("TIP1-A_4581", "TUC_KON_218 „Signiere“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4582("TIP1-A_4582", "TUC_KON_219 „Entschlüssele“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4583("TIP1-A_4583", "TUC_KON_200 „SendeAPDU“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4584("TIP1-A_4584", "TUC_KON_024 „Karte zurücksetzen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4585("TIP1-A_4585", "TUC_KON_216 „LeseZertifikat“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4586("TIP1-A_4586", "Basisanwendung Kartendienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4587("TIP1-A_4587", "Operation VerifyPin"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4588("TIP1-A_4588", "Operation ChangePin"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4589("TIP1-A_4589", "Operation GetPinStatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4590("TIP1-A_4590", "Operation UnblockPin"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4592("TIP1-A_4592", "Konfigurationswerte des Kartendienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4593("TIP1-A_4593", "TUC_KON_025 „Initialisierung Kartendienst“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4594("TIP1-A_4594", "Richtung bei Verbindungsaufbau des Systeminformationsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4595("TIP1-A_4595", "Gesicherte Übertragung von Ereignissen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4596("TIP1-A_4596", "Nachrichtenaufbau und -kodierung des Systeminformationsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4597("TIP1-A_4597", "Unterstützung von Missbrauchserkennungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4598("TIP1-A_4598", "TUC_KON_256 „Systemereignis absetzen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4599("TIP1-A_4599", "TUC_KON_252 “Liefere KT_Liste”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4600("TIP1-A_4600", "TUC_KON_253 “Liefere Karten_Liste”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4602("TIP1-A_4602", "TUC_KON_254 “Liefere Ressourcendetails”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4603("TIP1-A_4603", "Basisanwendung Systeminformationsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4604("TIP1-A_4604", "Operation GetCardTerminals"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4605("TIP1-A_4605", "Operation GetCards"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4607("TIP1-A_4607", "Operation GetResourceInformation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4608("TIP1-A_4608", "Operation Subscribe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4609("TIP1-A_4609", "Operation Unsubscribe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4610("TIP1-A_4610", "Operation GetSubscription"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4611("TIP1-A_4611", "Konfigurationswerte des Systeminformationsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4612("TIP1-A_4612", "Maximale Anzahl an Subscriptions"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4613("TIP1-A_4613", "Initialisierung Subscriptions-Liste beim Bootup"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4614("TIP1-A_4614", "Missbrauchserkennung Verschlüsselungsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4615("TIP1-A_4615", "Enc: Keine Onlineprüfung bei Logischer Separation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4616("TIP1-A_4616", "TUC_KON_070 “Daten hybrid verschlüsseln”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4617("TIP1-A_4617", "TUC_KON_071 „Daten hybrid entschlüsseln“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4618("TIP1-A_4618", "TUC_KON_072 “Daten symmetrisch verschlüsseln”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4619("TIP1-A_4619", "TUC_KON_073 “Daten symmetrisch entschlüsseln”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4620("TIP1-A_4620", "Basisdienst Verschlüsselungsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4621("TIP1-A_4621", "Operation EncryptDocument"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4622("TIP1-A_4622", "Operation DecryptDocument"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4623("TIP1-A_4623", "Unterstützte Signaturverfahren nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4624("TIP1-A_4624", "Default-Signaturverfahren nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4626("TIP1-A_4626", "Sig: Keine Onlineprüfung bei Logischer Separation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4627("TIP1-A_4627", "Unterstützte Signaturverfahren QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4628("TIP1-A_4628", "Default-Signaturverfahren QES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4629("TIP1-A_4629", "Unterstützte Karten QES-Erstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4639("TIP1-A_4639", "Generierung von Jobnummern für PIN-Eingaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4640("TIP1-A_4640", "Anzeige der Jobnummern für PIN-Eingaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4642("TIP1-A_4642", "Ableitung der Jobnummer von einem Zufallswert"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4643("TIP1-A_4643", "Beschaffenheit der Jobnummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4644("TIP1-A_4644", "Jobnummer über 1.000 Vorgänge eindeutig"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4645("TIP1-A_4645", "Zeichen der Jobnummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4646("TIP1-A_4646", "TUC_KON_155 „Dokumente zur Signatur vorbereiten“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4647("TIP1-A_4647", "TUC_KON 165 „Signaturvoraussetzungen für nonQES prüfen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4648("TIP1-A_4648", "TUC_KON_166 „nonQES Signaturen erstellen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4649("TIP1-A_4649", "TUC_KON_152 „Signaturvoraussetzungen für QES prüfen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4651("TIP1-A_4651", "TUC_KON_154 „QES Signaturen erstellen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4652("TIP1-A_4652", "TUC_KON_168 „Einzelsignatur QES erstellen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4653("TIP1-A_4653", "TUC_KON_160 „Dokumente nonQES signieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4654("TIP1-A_4654", "TUC_KON_161 “nonQES Dokumentsignatur prüfen”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4655("TIP1-A_4655", "TUC_KON_150 „Dokument QES signieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4669("TIP1-A_4669", "QES-Stapelsignatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4670("TIP1-A_4670", "Secure Messaging für die DTBS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4671("TIP1-A_4671", "Verhalten des Konnektors beim Abbruch einer Stapelsignatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4672("TIP1-A_4672", "TUC_KON_151 „QES- Dokumentensignatur prüfen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4676("TIP1-A_4676", "Basisdienst Signaturdienst (nonQES und QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4680("TIP1-A_4680", "Konfigurationswerte des Signaturdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4682("TIP1-A_4682", "Sicheres Einbringen des TI-Vertrauensankers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4684("TIP1-A_4684", "Regelmäßige Aktualisierung der CRL und der TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4685("TIP1-A_4685", "Vermeidung von Spitzenlasten bei TSL- und CRL-Download"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4686("TIP1-A_4686", "Warnung vor und bei Ablauf der TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4687("TIP1-A_4687", "Warnung vor und bei Ablauf des TI-Vertrauensankers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4688("TIP1-A_4688", "OCSP-Forwarding"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4689("TIP1-A_4689", "Caching von OCSP-Antworten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4690("TIP1-A_4690", "Timeout und Graceperiod für OCSP-Anfragen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4691("TIP1-A_4691", "Ablauf der gSMC-K und der gesteckten Karten regelmäßig prüfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4692("TIP1-A_4692", "Missbrauchserkennung, zu kontrollierende Operationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4693("TIP1-A_4693", "TUC_KON_032 “TSL aktualisieren”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4694("TIP1-A_4694", "TUC_KON_040 „CRL aktualisieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4695("TIP1-A_4695", "TUC_KON_033 „Zertifikatsablauf prüfen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4696("TIP1-A_4696", "TUC_KON_037 „Zertifikat prüfen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4697("TIP1-A_4697", "TUC_KON_034 “Zertifikatsinformationen extrahieren”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4698("TIP1-A_4698", "Basisanwendung Zertifikatsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4699("TIP1-A_4699", "Operation CheckCertificateExpiration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4700("TIP1-A_4700", "Operation ReadCardCertificate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4701("TIP1-A_4701", "TUC_KON_035 „Zertifikatsdienst initialisieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4702("TIP1-A_4702", "Konfigurierbarkeit des Zertifikatsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4703("TIP1-A_4703", "Vertrauensraumstatus anzeigen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4704("TIP1-A_4704", "Zertifikatsablauf anzeigen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4705("TIP1-A_4705", "TSL manuell importieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4706("TIP1-A_4706", "CRL manuell importieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4707("TIP1-A_4707", "Betrieb in Test- und Referenzumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4708("TIP1-A_4708", "Protokollierungsfunktion"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4709("TIP1-A_4709", "Integrität des Sicherheitsprotokolls"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4710("TIP1-A_4710", "Protokollierung personenbezogener und medizinischer Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4711("TIP1-A_4711", "Kapazität der Protokolldateien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4712("TIP1-A_4712", "Protokollierung erfolgreicher Kryptooperationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4713("TIP1-A_4713", "Herstellerspezifische Systemprotokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4714("TIP1-A_4714", "Art der Protokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4715("TIP1-A_4715", "TUC_KON_271 “Schreibe Protokolleintrag”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4716("TIP1-A_4716", "Einsichtnahme und Veränderung der Protokolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4717("TIP1-A_4717", "Konfigurationswerte des Protokollierungsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4718("TIP1-A_4718", "TUC_KON_272 “Initialisierung Protokollierungsdienst”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4719("TIP1-A_4719", "TLS-Dienst reagiert auf Veränderung LU_ONLINE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4720("TIP1-A_4720", "TUC_KON_110 'Kartenbasierte TLS-Verbindung aufbauen'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4721("TIP1-A_4721", "TUC_KON_111 'Kartenbasierte TLS-Verbindung abbauen'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4722("TIP1-A_4722", "TLS-Dienst initialisieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4723("TIP1-A_4723", "Verhalten als IPv4 Router"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4724("TIP1-A_4724", "LAN-Adapter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4725("TIP1-A_4725", "WAN-Adapter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4726("TIP1-A_4726", "Internet Anbindung nur bei MGM_LU_ONLINE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4728("TIP1-A_4728", "Nur IPv4. IPv6 nur hardwareseitig vorbereitet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4729("TIP1-A_4729", "Es darf kein dynamisches Routing verwendet werden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4730("TIP1-A_4730", "Kommunikation mit NET_TI_GESICHERTE_FD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4731("TIP1-A_4731", "Kommunikation mit NET_TI_ZENTRAL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4732("TIP1-A_4732", "Kommunikation mit NET_TI_DEZENTRAL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4733("TIP1-A_4733", "Kommunikation mit ANLW_AKTIVE_BESTANDSNETZE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4734("TIP1-A_4734", "Kommunikation mit NET_SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4735("TIP1-A_4735", "Kommunikation mit dem Internet (via SIS)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4736("TIP1-A_4736", "Kommunikation mit dem Internet (via IAG)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4737("TIP1-A_4737", "Kommunikation mit „Aktive Komponenten“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4738("TIP1-A_4738", "Route zum IAG"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4740("TIP1-A_4740", "Admin Defined Firewall Rules"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4741("TIP1-A_4741", "Kommunikation mit dem Intranet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4742("TIP1-A_4742", "Kommunikation mit den Fachmodulen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4744("TIP1-A_4744", "Firewall - Drop statt Reject"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4745("TIP1-A_4745", "Eingeschränkte Nutzung von „Ping“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4746("TIP1-A_4746", "Firewall - Abwehr von IP-Spoofing, DoS/DDoS-Angriffe und Martian Packets"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4747("TIP1-A_4747", "Firewall - Einschränkungen der IP-Protokolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4748("TIP1-A_4748", "Firewall - Routing-Regeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4749("TIP1-A_4749", "Firewall Restart"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4750("TIP1-A_4750", "Firewall-Protokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4751("TIP1-A_4751", "Reagiere auf LAN_IP_Changed"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4752("TIP1-A_4752", "Reagiere auf WAN_IP_Changed"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4753("TIP1-A_4753", "Ereignisbasiert Netzwerkrouten einrichten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4754("TIP1-A_4754", "TUC_KON_305 „LAN-Adapter initialisieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4755("TIP1-A_4755", "TUC_KON_306 „WAN-Adapter initialisieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4758("TIP1-A_4758", "TUC_KON_304 „Netzwerk-Routen einrichten“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4759("TIP1-A_4759", "Konfiguration LAN-Interface"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4760("TIP1-A_4760", "Konfiguration WAN-Interface"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4761("TIP1-A_4761", "Konfiguration Anbindung LAN/WAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4762("TIP1-A_4762", "Konfigurationsparameter Firewall-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4763("TIP1-A_4763", "DHCP-Server des Konnektors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4765("TIP1-A_4765", "Liefere Netzwerkinformationen über DHCP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4766("TIP1-A_4766", "Deaktivierbarkeit des DHCP-Servers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4767("TIP1-A_4767", "Konfiguration des DHCP-Servers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4768("TIP1-A_4768", "TUC_KON_343 „Initialisierung DHCP-Server“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4769("TIP1-A_4769", "DHCP Client Funktionalität des Konnektors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4771("TIP1-A_4771", "Reagieren auf DHCP/LAN_CLIENT/ STATECHANGED- und DHCP/WAN_CLIENT/ STATECHANGED-Ereignisse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4772("TIP1-A_4772", "TUC_KON_341 „DHCP-Informationen beziehen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4773("TIP1-A_4773", "Konfiguration des DHCP-Clients"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4774("TIP1-A_4774", "Manuelles anstoßen eines DHCP-Lease-Renew"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4775("TIP1-A_4775", "Aktive DHCP-Clients bei Auslieferung des Konnektors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4776("TIP1-A_4776", "Setzen der IP-Adresse nach Timeout"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4778("TIP1-A_4778", "Anforderungen an den VPN-Client"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4779("TIP1-A_4779", "Wiederholte Fehler beim VPN-Verbindungsaufbau"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4780("TIP1-A_4780", "TI VPN-Client Start Events"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4781("TIP1-A_4781", "SIS VPN-Client Start Events"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4782("TIP1-A_4782", "SIS VPN-Client Stop Events"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4783("TIP1-A_4783", "TUC_KON_321 „Verbindung zu dem VPN-Konzentrator der TI aufbauen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4784("TIP1-A_4784", "TUC_KON_322 „Verbindung zu dem VPN-Konzentrator des SIS aufbauen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4785("TIP1-A_4785", "Konfigurationsparameter VPN-Client"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4786("TIP1-A_4786", "Maximale Zeitabweichung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4787("TIP1-A_4787", "Konfigurationsabhängige Funktionsweise"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4788("TIP1-A_4788", "Verhalten bei Abweichung zwischen lokaler Zeit und erhaltenen Zeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4789("TIP1-A_4789", "Zustandsvariablen des Konnektor Zeitdiensts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4790("TIP1-A_4790", "TUC_KON_351 „Liefere Systemzeit“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4791("TIP1-A_4791", "Operation sync_Time"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4792("TIP1-A_4792", "Explizites Anstoßen der Zeitsynchronisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4793("TIP1-A_4793", "Konfigurierbarkeit des Konnektor NTP-Servers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4794("TIP1-A_4794", "Warnung und Übergang in kritischen Betriebszustand bei nichterfolgter Zeitsynchronisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4795("TIP1-A_4795", "TUC_KON_352 „Initialisierung Zeitdienst“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4796("TIP1-A_4796", "Grundlagen des Namensdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4797("TIP1-A_4797", "DNS-Forwards des DNS-Servers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4798("TIP1-A_4798", "DNS Stub-Resolver"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4799("TIP1-A_4799", "Aktualität der DNS-Vertrauensanker sicherstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4801("TIP1-A_4801", "TUC_KON_361 „DNS-Namen auflösen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4802("TIP1-A_4802", "TUC_KON_362 „Liste der Dienste abrufen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4803("TIP1-A_4803", "TUC_KON_363 „Dienstdetails abrufen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4804("TIP1-A_4804", "Basisanwendung Namensdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4805("TIP1-A_4805", "Konfigurationsparameter Namensdienst und Dienstlokalisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4806("TIP1-A_4806", "Verpflichtende Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4807("TIP1-A_4807", "Mandantenübergreifende Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4808("TIP1-A_4808", "Zugangsschutz der Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4810("TIP1-A_4810", "Benutzerverwaltung der Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4811("TIP1-A_4811", "Festlegung des Konnektornamens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4812("TIP1-A_4812", "Anzeige der Versionsinformationen (Selbstauskunft)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4813("TIP1-A_4813", "Persistieren der Konfigurationsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4814("TIP1-A_4814", "Export- Import von Konfigurationsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4815("TIP1-A_4815", "Export: Schutz der Integrität, Authentizität und Nichtabstreitbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4816("TIP1-A_4816", "Export: Schutz der Vertraulichkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4818("TIP1-A_4818", "Konfigurieren von Fachmodulen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4819("TIP1-A_4819", "Auslösen eines Konnektorneustarts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4820("TIP1-A_4820", "Werksreset des Konnektors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4821("TIP1-A_4821", "Aktivieren/Deaktivieren von Leistungsumfängen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4822("TIP1-A_4822", "Konnektor Standalone einsetzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4823("TIP1-A_4823", "Konnektor mit logischer Trennung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4824("TIP1-A_4824", "Freischaltdaten des Konnektors bearbeiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4825("TIP1-A_4825", "Konnektor zur Nutzung (wiederholt) freischalten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4826("TIP1-A_4826", "Status Konnektorfreischaltung einsehen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4827("TIP1-A_4827", "Konnektorfreischaltung zurücknehmen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4829("TIP1-A_4829", "Vollständige Aktualisierbarkeit des Konnektors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4831("TIP1-A_4831", "KT-Update nach Wiedererreichbarkeit erneut anstoßen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4832("TIP1-A_4832", "TUC_KON_280 „Konnektoraktualisierung durchführen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4833("TIP1-A_4833", "TUC_KON_281 „Kartenterminalaktualisierung anstoßen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4834("TIP1-A_4834", "TUC_KON_282 „UpdateInformationen beziehen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4835("TIP1-A_4835", "Konfigurationswerte des KSR-Client"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4836("TIP1-A_4836", "Automatische Prüfung und Download von Update-Paketen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4837("TIP1-A_4837", "Übersichtsseite des KSR-Client"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4838("TIP1-A_4838", "Einsichtnahme in Update-Informationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4839("TIP1-A_4839", "Festlegung der durchzuführenden Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4840("TIP1-A_4840", "Auslösen der durchzuführenden Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4841("TIP1-A_4841", "Hardware für Dauerbetrieb"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4842("TIP1-A_4842", "Gehäuseversiegelung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4843("TIP1-A_4843", "Zustandsanzeige"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4844("TIP1-A_4844", "Ethernet-Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4845("TIP1-A_4845", "Verwendungsumgebung - Klima"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4846("TIP1-A_4846", "Verwendungsumgebung - Vibration"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4981("TIP1-A_4981", "Steuerung der Betriebsumgebung via gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4982("TIP1-A_4982", "Anzeige von TU/RU in der Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4985("TIP1-A_4985", "TUC_KON_055 „Befülle CT-Object“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4986("TIP1-A_4986", "Informationsparameter des Kartenterminaldienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4988("TIP1-A_4988", "Unterstützung von Gen1 und Gen2 Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4992("TIP1-A_4992", "Guidance zur Jobnummer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4994("TIP1-A_4994", "Warnung vor und bei Ablauf der CRL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4996("TIP1-A_4996", "Hinweis auf neue Sicherheitsprotokolleinträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5005("TIP1-A_5005", "Protokollierung in der Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5009("TIP1-A_5009", "Authentifizierungsvarianten für Verbindungen zwischen Konnektor und Clientsystemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5010("TIP1-A_5010", "Operation SignDocument (nonQES und QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5011("TIP1-A_5011", "Import von Kartenterminal-Informationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5012("TIP1-A_5012", "Remote-PIN-Verfahren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5033("TIP1-A_5033", "Missbrauchserkennung Signaturdienst (nonQES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5034("TIP1-A_5034", "Operation VerifyDocument (nonQES und QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5035("TIP1-A_5035", "Operation GetIPAddress"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5058("TIP1-A_5058", "Fehlerübermittlung durch gematik-SOAP-Fault"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5110("TIP1-A_5110", "Übersicht über alle verfügbaren Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5111("TIP1-A_5111", "PIN-Management der SM-Bs für den Administrator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5112("TIP1-A_5112", "Operation RenewSubscriptions"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5113("TIP1-A_5113", "Abwehr von XML-Signature-Wrapping Angriffen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5148("TIP1-A_5148", "Performance - Konnektor - Mittlerer Abstand zwischen Ausfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5149("TIP1-A_5149", "PKCS#1-Schnittstelle nur für Authentisierung mit HBAx und SM-B nutzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5152("TIP1-A_5152", "Aktualisieren der Infrastrukturinformationen aus der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5153("TIP1-A_5153", "TUC_Kon_283 „Infrastruktur Konfiguration aktualisieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5387("TIP1-A_5387", "Erweiterte Nutzung der AdES-Profile"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5392("TIP1-A_5392", "gSMC-K-Verantwortung durch den Hersteller des Konnektors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5393("TIP1-A_5393", "Dokumentation der Konnektorzertifikatszuordnungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5394("TIP1-A_5394", "Bereitstellen eines Konnektorsperrprozesses"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5395("TIP1-A_5395", "Sperrberechtigung der gematik gegenüber Konnektorhersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5396("TIP1-A_5396", "Prüfung des Sperrauftrages für Konnektoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5397("TIP1-A_5397", "Umsetzung von Sperraufträgen für Konnektoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5398("TIP1-A_5398", "Beschränkung der Sperrberechtigung des Konnektorherstellers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5399("TIP1-A_5399", "Protokollierung der Sperrung von Konnektoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5400("TIP1-A_5400", "Fortführen des Konnektor-Sperrprozesses"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5401("TIP1-A_5401", "Parallele Nutzbarkeit Clientsystemschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5402("TIP1-A_5402", "Baseline-Profilierung der AdES-EPES-Profile"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5403("TIP1-A_5403", "Common PKI konforme Profile"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5406("TIP1-A_5406", "IP-Pakete mit Source Route Option"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5407("TIP1-A_5407", "NAT-Umsetzung im Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5408("TIP1-A_5408", "Terminal-Anzeigen beim Anfordern und Auswerfen von Karten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5409("TIP1-A_5409", "TUC_KON_056 „Karte anfordern“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5410("TIP1-A_5410", "TUC_KON_057 „Karte auswerfen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5411("TIP1-A_5411", "Basisdienst Kartenterminaldienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5412("TIP1-A_5412", "Operation RequestCard"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5413("TIP1-A_5413", "Operation EjectCard"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5414("TIP1-A_5414", "Initialisierung „Anbindung LAN/WAN“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5415("TIP1-A_5415", "Initialisierung „VPN-Client“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5416("TIP1-A_5416", "Initialisierung „Namensdienst und Dienstlokalisierung“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5417("TIP1-A_5417", "TI VPN-Client Stop Events"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5433("TIP1-A_5433", "Manuell importierte X.509-CA-Zertifikate nur für hybride Verschlüsselung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5434("TIP1-A_5434", "Verschlüsselung/Entschlüsselung eines XML Dokuments ergibt unverändertes XML-Dokument"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5436("TIP1-A_5436", "XML Dokument nach Entfernen der Signatur unverändert"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5437("TIP1-A_5437", "Signaturverfahren für externe Authentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5439("TIP1-A_5439", "Operation ExternalAuthenticate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5446("TIP1-A_5446", "Zusätzliche Signaturverfahren für Dokumentensignaturprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5447("TIP1-A_5447", "Einsatzbereich der Signaturvarianten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5449("TIP1-A_5449", "Operation VerifyCertificate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5516("TIP1-A_5516", "LDAP-Proxy reagiert auf Veränderung LU_ONLINE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5517("TIP1-A_5517", "Konnektor, TUC_KON_290 „LDAP-Verbindung aufbauen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5518("TIP1-A_5518", "Konnektor, TUC_KON_291 „Verzeichnis abfragen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5519("TIP1-A_5519", "Konnektor, TUC_KON_292 'LDAP-Verbindung trennen'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5520("TIP1-A_5520", "Konnektor, TUC_KON_293 'Verzeichnisabfrage abbrechen'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5521("TIP1-A_5521", "Konnektor, LDAPv3 Operationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5530("TIP1-A_5530", "Kommunikation mit NET_TI_OFFENE_FD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5536("TIP1-A_5536", "Connector Event Transport Protocol über TCP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5537("TIP1-A_5537", "Anzeige IP-Routinginformationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5540("TIP1-A_5540", "QES-Signaturprüfergebnis bezogen auf Signaturzeitpunkt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5541("TIP1-A_5541", "Referenzen in Dokumenten nicht dynamisch auflösen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5542("TIP1-A_5542", "Konnektor, Funktion zur Prüfung der Erreichbarkeit von Systemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5543("TIP1-A_5543", "Keine manuelle PIN-Eingabe für gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5545("TIP1-A_5545", "nonQES-Signaturprüfergebnis bezogen auf Signaturzeitpunkt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5647("TIP1-A_5647", "Remote Management Konnektor: Personenbezogene Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5648("TIP1-A_5648", "Remote Management Konnektor: Offene Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5649("TIP1-A_5649", "Remote Management Konnektor: Standardbasierte Protokolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5650("TIP1-A_5650", "Remote Management Konnektor: Aufbau der Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5651("TIP1-A_5651", "Remote Management Konnektor: Absicherung der Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5652("TIP1-A_5652", "Remote Management Konnektor: Konfiguration Remote Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5653("TIP1-A_5653", "Remote Management Konnektor: Protokollierung Remote Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5654("TIP1-A_5654", "Sicherheits-Protokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5655("TIP1-A_5655", "Deregistrierung bei Außerbetriebnahme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5657("TIP1-A_5657", "Freischaltung von Softwareupdates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5658("TIP1-A_5658", "Konnektor, rollenspezifische Endpunkte der Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5659("TIP1-A_5659", "Bewusste Entscheidung bei Freischaltung von Softwareupdates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5660("TIP1-A_5660", "Hinweise im Handbuch für manuell importierte X.509-CA-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5661("TIP1-A_5661", "Automatisierung Managementschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5662("TIP1-A_5662", "Gesicherte Übertragung von BNetzA-VL und Hashwert"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5663("TIP1-A_5663", "Prüfung der technischen Rolle bei TLS-Verbindungsaufbau zum TSL-Dienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5664("TIP1-A_5664", "Reihenfolge der Dokumente bei Stapelsignatur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5665("TIP1-A_5665", "Basisdienst Authentifizierungsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5666("TIP1-A_5666", "Operation StopSignature (nonQES und QES)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5667("TIP1-A_5667", "Operation GetJobNumber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5682("TIP1-A_5682", "XML Nicht geeignete Algorithmen im VerificationReport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5694("TIP1-A_5694", "SOAP Message Transmission Optimization Mechanism"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5696("TIP1-A_5696", "Prüfung der personalisierten gSMC-K"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5698("TIP1-A_5698", "Löschen von Kartenterminaleinträgen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5700("TIP1-A_5700", "Ereignisbasiert http-Forwarder Adressen ermitteln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5938("TIP1-A_5938", "TUC_KON_284 „KSR-Client initialisieren“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6031("TIP1-A_6031", "Kein selbsttätiges Zurücksetzen der SM-B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6476("TIP1-A_6476", "Lieferung von Softwareupdates via P_KSRS_Upload Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6477("TIP1-A_6477", "Manuelles Service Discovery"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6478("TIP1-A_6478", "Erlaubte SICCT-Kommandos bei CT.CONNECTED=Nein"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6479("TIP1-A_6479", "Keine Protokollierung vertraulicher Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6480("TIP1-A_6480", "Resource Records der Zone konlan."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6725("TIP1-A_6725", "Lebensdauer von Textanzeigen am Kartenterminal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6727("TIP1-A_6727", "Cross-Origin Resource Sharing"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6728("TIP1-A_6728", "BNetzA-VL manuell importieren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6729("TIP1-A_6729", "TUC_KON_031 “BnetzA-VL aktualisieren”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6730("TIP1-A_6730", "Regelmäßige Aktualisierung der BNetzA-VL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6731("TIP1-A_6731", "Regelmäßige Prüfung der BNetzA-VL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6732("TIP1-A_6732", "Vermeidung von Spitzenlasten bei BNetzA-VL-Download"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6733("TIP1-A_6733", "Aktive BNetzA-VL anzeigen"),

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
