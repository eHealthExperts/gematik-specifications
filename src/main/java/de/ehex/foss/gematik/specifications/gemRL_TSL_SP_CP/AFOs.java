package de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemRL_TSL_SP_CP]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4173("GS-A_4173", "Erbringung von Verzeichnisdienstleistungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4174("GS-A_4174", "Veröffentlichung von CA- und Signer-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4175("GS-A_4175", "Veröffentlichungspflicht für kritische Informationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4176("GS-A_4176", "Mitteilungspflicht bei Änderungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4177("GS-A_4177", "Zugriffskontrolle auf Verzeichnisse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4178("GS-A_4178", "Standardkonforme Namensvergabe in Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4179("GS-A_4179", "Format von E-Mail-Adressen in Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4180("GS-A_4180", "Gestaltung der Struktur der Verzeichnisdienste"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4181("GS-A_4181", "Eindeutigkeit der Namensform des Zertifikatsnehmers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4182("GS-A_4182", "Kennzeichnung von personen- bzw. organisationsbezogenen Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4183("GS-A_4183", "Kennzeichnung von maschinen-, rollenbezogenen oder pseudonymisierten (nicht personenbezogenen) Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4185("GS-A_4185", "Unterscheidung von Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4186("GS-A_4186", "Prüfung auf den Besitz des privaten Schlüssels bei dem Zertifikatsnehmer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4187("GS-A_4187", "Nutzung bestehender SGB-Datensätze bei Registrierung für Endanwender (Versicherte)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4188("GS-A_4188", "Zuverlässige Identifizierung und vollständige Prüfung der Antragsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4189("GS-A_4189", "Prüfungspflicht für Person, Schlüsselpaar, Schlüsselaktivierungsdaten und Name"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4190("GS-A_4190", "Regelung für die Berechtigung zur Antragstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4191("GS-A_4191", "Einsatz interoperabler Systeme durch einen externen Dienstleister"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4192("GS-A_4192", "Prüfung der Berechtigung zur Antragstellung auf Schlüsselerneuerung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4194("GS-A_4194", "Identifikation des Antragstellers und Dokumentation bei der Beantragung eines CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4195("GS-A_4195", "Schriftform für Aufnahme eines Zertifikats in die TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4199("GS-A_4199", "Berechtigung für Beantragung von CA-Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4201("GS-A_4201", "Dokumentation des Registrierungsprozesses"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4202("GS-A_4202", "Identifikation des Zertifikatsnehmers im Rahmen der Registrierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4203("GS-A_4203", "Dokumentationspflichten für die Beantragung von Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4204("GS-A_4204", "Bearbeitung von Zertifikatsanträgen eines TSP-X.509 nonQES durch die gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4205("GS-A_4205", "Verpflichtung zum Wechsel des CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4206("GS-A_4206", "Prüfung auf Korrektheit des Schlüsselpaares eines TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4207("GS-A_4207", "Vorgaben für die Ausgabe von Endnutzerzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4208("GS-A_4208", "Ausgabe von Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4209("GS-A_4209", "Sicherstellung der Verbindung von Zertifikatsnehmer und privatem Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4210("GS-A_4210", "Dokumentation der Annahme eines Zertifikatsantrags und der sicheren Ausgabe des Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4211("GS-A_4211", "Bereitstellung von CA-Zertifikaten bei Aufnahme in die TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4212("GS-A_4212", "Verwendung des privaten Schlüssels durch den Zertifikatsnehmer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4213("GS-A_4213", "Zulässige Nutzungsarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4214("GS-A_4214", "Veröffentlichung der öffentlichen Schlüssel durch den TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4215("GS-A_4215", "Bedingungen für eine Zertifizierung nach Schlüsselerneuerung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4216("GS-A_4216", "Bedingungen für eine Zertifikatsänderung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4217("GS-A_4217", "Autorisierung einer Zertifikatsänderung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4218("GS-A_4218", "Beschreibung der Bedingungen für die Sperrung eines Anwenderzertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4219("GS-A_4219", "Sperrung von Anwenderzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4221("GS-A_4221", "Anzeige der Kompromittierung des privaten Signaturschlüssels"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4222("GS-A_4222", "Beschreibung der Bedingungen für die Sperrung des Zertifikat eines TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4223("GS-A_4223", "Obligatorische Gründe für die Sperrung des Zertifikats eines TSP-X.509 nonQES durch die gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4225("GS-A_4225", "Festlegung eines Sperrberechtigten für Endanwenderzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4226("GS-A_4226", "Verfahren für einen Sperrantrag"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4227("GS-A_4227", "Dokumentation der Fristen für einen Sperrantrag"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4228("GS-A_4228", "Unverzügliche Bearbeitung eines Sperrantrags"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4229("GS-A_4229", "Methoden zum Prüfen von Sperrinformationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4230("GS-A_4230", "Gewährleistung der Online-Verfügbarkeit von Sperrinformationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4231("GS-A_4231", "Anforderungen zur Online-Prüfung von Sperrinformationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4232("GS-A_4232", "Informationspflicht der gematik Root-CA bei Sperrung der Zertifikats eines TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4233("GS-A_4233", "Zertifikatsuspendierung für Kartenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4234("GS-A_4234", "Zusammenhang zwischen Zertifikatssperrung und -suspendierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4235("GS-A_4235", "Festlegung zu Verantwortlichkeit für Suspendierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4236("GS-A_4236", "Verfahren für Anträge auf Suspendierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4237("GS-A_4237", "Festlegung zu maximaler Dauer von Suspendierungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4238("GS-A_4238", "Funktionsbeschreibung des Statusabfragedienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4241("GS-A_4241", "Sperrung von Zertifikaten bei Kündigung durch den Zertifikatsnehmer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4242("GS-A_4242", "Dokumentationspflicht für Prozesse der Schlüsselhinterlegung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4245("GS-A_4245", "Anzeige von Änderung an der Gesellschafterstruktur des Betreibers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4246("GS-A_4246", "Bereitstellung aktueller Liste registrierter TSP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4247("GS-A_4247", "Obligatorische Vorgaben für das Rollenkonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4248("GS-A_4248", "Bereitstellung der Protokollierungsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4249("GS-A_4249", "Standort für Backup-HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4250("GS-A_4250", "Verwendung des Backup-HSM gemäß Vier-Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4251("GS-A_4251", "Backup-Konzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4252("GS-A_4252", "Besetzung von Rollen und Informationspflichten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4254("GS-A_4254", "Rollenzuordnung unter Wahrung der Vier-Augen-Prinzips"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4255("GS-A_4255", "Nutzung des HSM im kontrollierten Bereich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4256("GS-A_4256", "Zugang zu Systemen für die Zertifikatserzeugung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4259("GS-A_4259", "Vorgaben für die informationstechnische Trennung sicherheitskritischer Bestandteile der Systemumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4260("GS-A_4260", "Manipulationsschutz veröffentlichter Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4261("GS-A_4261", "Vorgaben zur Betriebsumgebung für sicherheitskritische Bestandteile des Systems"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4262("GS-A_4262", "Gewährleistung des Zugangs zur Betriebsstätte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4263("GS-A_4263", "Rollenunterscheidung im organisatorischen Konzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4264("GS-A_4264", "Mitteilungspflicht für Zuordnung der Rollen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4265("GS-A_4265", "Obligatorische Rollen für sicherheitsrelevante Tätigkeiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4266("GS-A_4266", "Ausschluss von Rollenzuordnungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4267("GS-A_4267", "Rollenaufteilung auf Personengruppen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4268("GS-A_4268", "Anforderungen an den Einsatz freier Mitarbeiter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4269("GS-A_4269", "Einsicht in Dokumente für Mitarbeiter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4270("GS-A_4270", "Aufzeichnung von technischen Ereignissen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4271("GS-A_4271", "Aufzeichnung von organisatorischen Ereignissen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4272("GS-A_4272", "Aufbewahrungsfrist für sicherheitsrelevante Protokolldaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4273("GS-A_4273", "Schutz vor Zugriff, Löschung und Manipulation elektronischer Protokolldaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4274("GS-A_4274", "Archivierung von für den Zertifizierungsprozess relevanten Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4275("GS-A_4275", "Dokumentationspflicht für Prozesse zum Schlüsselwechsel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4276("GS-A_4276", "Aktionen und Verantwortlichkeit im Rahmen der Notfallplanung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4277("GS-A_4277", "Anzeigepflicht bei Beendigung der Zertifizierungsdienstleistungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4278("GS-A_4278", "Maßnahmen zur Einstellung des Zertifizierungsbetriebs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4279("GS-A_4279", "Fortbestand von Archiven und die Abrufmöglichkeit einer vollständigen Widerrufsliste"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4280("GS-A_4280", "Fristen bei Einstellung des Zertifizierungsbetriebs für die gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4281("GS-A_4281", "Fristen bei der Einstellung des Zertifizierungsbetriebs für einen TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4282("GS-A_4282", "Erforderliche Form bei Einstellung des Zertifizierungsbetriebs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4283("GS-A_4283", "Gültigkeit der Zertifikate bei Einstellung des Zertifizierungsbetriebs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4284("GS-A_4284", "Beachtung des betreiberspezifischen Sicherheitskonzepts bei der Erzeugung von Schlüsselpaaren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4285("GS-A_4285", "Sicherheitsniveau bei der Generierung von Signaturschlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4287("GS-A_4287", "Sichere Aufbewahrung des privaten Schlüssels einer CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4288("GS-A_4288", "Verwendung eines Backup-HSM zum Im-/Export von privaten Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4289("GS-A_4289", "Unterstützung des sicheren Löschen von Schlüsseln durch HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4290("GS-A_4290", "Generieren und Löschen von Schlüsselpaaren gemäß Vier-Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4291("GS-A_4291", "Berechnungen mit dem privaten Schlüssel gemäß Vier-Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4292("GS-A_4292", "Protokollierung der HSM-Nutzung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4294("GS-A_4294", "Bedienung des Schlüsselgenerierungssystems"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4295("GS-A_4295", "Berücksichtigung des aktuellen Erkenntnisstands bei der Generierung von Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4296("GS-A_4296", "Anlass für den Wechsel von Schlüsselpaaren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4297("GS-A_4297", "Behandlung einer Kompromittierung eines Schlüsselpaares"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4299("GS-A_4299", "Zulassung/Abnahme und Aufnahme in den Vertrauensraum der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4300("GS-A_4300", "Zweckbindung von Schlüsselpaaren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4302("GS-A_4302", "Transportmedium für die Übergabe des privaten Schlüssels eines Schlüsselpaars"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4303("GS-A_4303", "Festlegung der Schlüsselverwendung (keyUsage)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4304("GS-A_4304", "Speicherung und Anwendung von privaten Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4305("GS-A_4305", "Ordnungsgemäße Sicherung des privaten Schlüssels"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4306("GS-A_4306", "Verwendung von privaten Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4307("GS-A_4307", "Vorgaben an HSM-Funktionalität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4308("GS-A_4308", "Speicherung und Auswahl von Schlüsselpaaren im HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4309("GS-A_4309", "Verwendung von zertifizierten kryptographischen Modulen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4310("GS-A_4310", "Vorgaben an die Prüftiefe der Evaluierung eines HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4311("GS-A_4311", "Hinterlegung des privaten Signaturschlüssels"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4312("GS-A_4312", "Aktivierung privater Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4313("GS-A_4313", "Deaktivierung privater Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4314("GS-A_4314", "Sichere Übermittlung von Aktivierungsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4315("GS-A_4315", "Konformität zum betreiberspezifischen Sicherheitskonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4316("GS-A_4316", "Härtung von Betriebssystemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4317("GS-A_4317", "Obligatorische Sicherheitsmaßnahmen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4318("GS-A_4318", "Maßnahmen zur Beurteilung der Systemsicherheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4319("GS-A_4319", "Prüfpflichten vor Nutzung neuer Software im Wirkbetrieb"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4321("GS-A_4321", "Bereitstellung eines Certificate Policy Disclosure Statements"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4322("GS-A_4322", "Zusicherung der Dienstqualität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4323("GS-A_4323", "Wahrung der Vertraulichkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4324("GS-A_4324", "Zusicherung der Dienstgüte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4325("GS-A_4325", "Zweckbindung von Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4326("GS-A_4326", "Dokumentationspflicht für beschränkte Gültigkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4327("GS-A_4327", "Transparenz für Nachträge zum Certificate Policy Statement"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4328("GS-A_4328", "Informationspflicht bei Änderung des CPS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4330("GS-A_4330", "Einbringung des Komponentenzertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4331("GS-A_4331", "Sicherstellungspflicht des Antragstellers eines Komponentenzertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4332("GS-A_4332", "Dokumentation der Pflichten des Antragstellers eines Komponentenzertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4333("GS-A_4333", "Informationspflicht gegenüber Antragsteller bei Sperrung eines Komponentenzertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4335("GS-A_4335", "Keine Sperrungeines Zertifikats für den Produkttyp gSMC-KT"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4336("GS-A_4336", "Sperranträge der gematik für Komponentenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4337("GS-A_4337", "Sonderregelung für die Sperrung von Komponentenzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4338("GS-A_4338", "Suspendierung von Komponentenzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4339("GS-A_4339", "Autorisierung für die Sperrung von Komponentenzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4340("GS-A_4340", "Befristung von Sperranträgen für Komponentenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4341("GS-A_4341", "Entfall der Verpflichtung für die Bereitstellung einer Statusprüfung bestimmter Komponentenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4342("GS-A_4342", "Verbot einer Schlüsselhinterlegung für Komponentenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4343("GS-A_4343", "Unterstützung der Übergabe bei Schließung eines TSP-X.509 nonQES für Komponentenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4344("GS-A_4344", "Sperrung von Komponentenzertifikate bei Schließung eines TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4345("GS-A_4345", "Automatisierte Zertifikatsanträge für Komponentenzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4348("GS-A_4348", "Verbot der Erneuerung von Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4349("GS-A_4349", "Obligatorische Gründe für die Sperrung eines selbst signierten Zertifikats eines TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4350("GS-A_4350", "Maximale Gültigkeitsdauer des Zertifikats der gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4351("GS-A_4351", "Maximale Gültigkeitsdauer des Zertifikats eines TSP-X.509 nonQES bei Erzeugung durch die gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4352("GS-A_4352", "Maximale Gültigkeitsdauer eines Endbenutzerzertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4355("GS-A_4355", "Maximale Gültigkeitsdauer des Zertifikats eines TSP-X.509 nonQES bei Erzeugung durch den TSP-X.509 nonQES"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4394("GS-A_4394", "Dokumentation der Zertifikatsausgabeprozesse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4395("GS-A_4395", "Benachrichtigung des Zertifikatsnehmer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4396("GS-A_4396", "Speicherung hinterlegter Root- und CA-Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4906("GS-A_4906", "Zuordnung von Schlüsseln zu Identitäten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4908("GS-A_4908", "CP-Test, Erfüllung der Certificate Policy für Testzertifikate zur Aufnahme in die Test-TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4909("GS-A_4909", "CP-Test, Erbringung von Verzeichnisdienstleistungen für Testzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4910("GS-A_4910", "CP-Test, Zugriffskontrolle auf Verzeichnisse für Testzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4911("GS-A_4911", "CP-Test, Standardkonforme Namensvergabe in Testzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4912("GS-A_4912", "CP-Test, Format von E-Mail-Adressen in Testzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4913("GS-A_4913", "CP-Test, Gestaltung der Struktur der Verzeichnisdienste"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4914("GS-A_4914", "CP-Test, Eindeutigkeit der Namensform des Zertifikatsnehmers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4915("GS-A_4915", "CP-Test, Kein Bezug zu Echtdaten von Personen oder Organisationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4916("GS-A_4916", "CP-Test, Kennzeichnung von personen- bzw. organisationsbezogenen Testzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4917("GS-A_4917", "CP-Test, Kennzeichnung von maschinen-, rollenbezogenen oder pseudonymisierten (nicht personenbezogenen) Testzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4919("GS-A_4919", "CP-Test, Testkennzeichen in Testzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4923("GS-A_4923", "CP-Test, Veröffentlichung von Testausstellerzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4925("GS-A_4925", "CP-Test, Keine Verwendung von Echtdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4926("GS-A_4926", "CP-Test, Policy von Testzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4927("GS-A_4927", "CP-Test, Bereitstellung eines Sperrdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4928("GS-A_4928", "CP-Test, Suspendierung und Desuspendierung von Testzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4929("GS-A_4929", "CP-Test, Funktionsweise des Statusabfragedienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4930("GS-A_4930", "CP-Test, Verfügbarkeit des Statusabfragedienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4931("GS-A_4931", "CP-Test, Maximale Gültigkeitsdauer von Testzertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4933("GS-A_4933", "CP-Test, Zertifikatsprofile für Testzertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5020("GS-A_5020", "Einbringung des Komponentenzertifikats durch denKartenherausgeber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5075("GS-A_5075", "Schlüsselbackup bei der gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5083("GS-A_5083", "Zertifikatsantragstellung im Vier-Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5084("GS-A_5084", "Zugang zu HSM-Systemen im Vier-Augen-Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5123("GS-A_5123", "Verfahrensbeschreibung Datensicherung der gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5468("GS-A_5468", "Planmäßige Schlüsselerneuerung der gematik Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5469("GS-A_5469", "Verwendung des neuesten Schlüssels der gematik Root-CA"),

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
