package de.ehex.foss.gematik.specifications.gemSpec_VPN_ZugD;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_VPN_ZugD]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4277("TIP1-A_4277", "VPN-Zugangsdienst, Physische Trennung der VPN-Konzentratoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4278("TIP1-A_4278", "VPN-Zugangsdienst, Geografische Verteilung der VPN-Konzentratoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4279("TIP1-A_4279", "VPN-Zugangsdienst, Mindestanzahl Standorte VPN-Konzentrator"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4281("TIP1-A_4281", "VPN-Zugangsdienst, NAT an der Schnittstelle zum Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4282("TIP1-A_4282", "VPN-Zugangsdienst, Eindeutiger FQDN für VPN-Konzentratoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4284("TIP1-A_4284", "VPN-Zugangsdienst, Redundanter Internetzugang"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4285("TIP1-A_4285", "VPN-Zugangsdienst, Umschaltzeiten am Internetzugang"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4286("TIP1-A_4286", "VPN-Zugangsdienst, keine TI-Tunnel bei fehlender TI-Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4287("TIP1-A_4287", "VPN-Zugangsdienst, keine SIS-Tunnel bei fehlender SIS-Internetverbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4288("TIP1-A_4288", "VPN-Zugangsdienst, redundante Anbindung an die TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4289("TIP1-A_4289", "VPN-Zugangsdienst, Service-Zone TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4290("TIP1-A_4290", "VPN-Zugangsdienst, Redundanz der VPN-Konzentratoren im VPN-Konzentrator-Standort"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4291("TIP1-A_4291", "VPN-Zugangsdienst, standortübergreifende Redundanz der VPN-Konzentratoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4292("TIP1-A_4292", "VPN-Zugangsdienst, Härtung des VPN-Konzentrators"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4293("TIP1-A_4293", "VPN-Zugangsdienst, IPv4-Adressierung der Internetschnittstellen der VPN-Konzentratoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4294("TIP1-A_4294", "VPN-Zugangsdienst, Adressen des SIS zum Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4295("TIP1-A_4295", "VPN-Zugangsdienst, eigene Domain für VPN-Konzentrator-FQDN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4296("TIP1-A_4296", "VPN-Zugangsdienst, Namensauflösung durch SRV-Record"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4297("TIP1-A_4297", "VPN-Zugangsdienst, Nutzung der SRV-Records zu betrieblichen Zwecken"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4300("TIP1-A_4300", "VPN-Zugangsdienst, Performance Authentisierung / Autorisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4301("TIP1-A_4301", "VPN-Zugangsdienst, Durchsatz Verbindung zum Transportnetz Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4302("TIP1-A_4302", "VPN-Zugangsdienst, Nameserver mit rekursiver Funktion im Namensraum Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4303("TIP1-A_4303", "VPN-Zugangsdienst, Nameserver mit autoritativer Funktion im Namensraum Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4305("TIP1-A_4305", "VPN-Zugangsdienst, Nameserver Internet Adressierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4306("TIP1-A_4306", "VPN-Zugangsdienst, Nameserver Namensraum TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4307("TIP1-A_4307", "VPN-Zugangsdienst, Bereitstellung Nameserver TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4308("TIP1-A_4308", "VPN-Zugangsdienst, Adressierung des Nameservers TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4309("TIP1-A_4309", "VPN-Zugangsdienst, Nameserver im Namensraum SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4310("TIP1-A_4310", "VPN-Zugangsdienst, Bereitstellung Nameserver SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4311("TIP1-A_4311", "VPN-Zugangsdienst, Adressierung Nameserver SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4312("TIP1-A_4312", "VPN-Zugangsdienst, Bereitstellung Registrierungsserver"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4314("TIP1-A_4314", "VPN-Zugangsdienst, Adressierung des Registrierungsservers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4315("TIP1-A_4315", "VPN-Zugangsdienst, Bildung von AAA-Zugangsdaten aus Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4316("TIP1-A_4316", "VPN-Zugangsdienst, Autorisierung über Protokoll"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4317("TIP1-A_4317", "VPN-Zugangsdienst, Profilzuweisung durch Autorisierungsserver"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4318("TIP1-A_4318", "VPN-Zugangsdienst, ACL-Zuweisung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4319("TIP1-A_4319", "VPN-Zugangsdienst, Verteilung des Autorisierungsservers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4321("TIP1-A_4321", "VPN-Zugangsdienst, IP-Adresse des Autorisierungsservers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4322("TIP1-A_4322", "VPN-Zugangsdienst, http-Forwarder - Bereitstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4323("TIP1-A_4323", "VPN-Zugangsdienst, http-Forwarder - Verteilung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4325("TIP1-A_4325", "VPN-Zugangsdienst, http-Forwarder - Absenderadresse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4326("TIP1-A_4326", "VPN-Zugangsdienst, http-Forwarder - kein Cache"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4327("TIP1-A_4327", "VPN-Zugangsdienst, http-Forwarder - IP-Adresse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4328("TIP1-A_4328", "VPN-Zugangsdienst, Anzahl der Stratum-2-NTP-Server"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4330("TIP1-A_4330", "VPN-Zugangsdienst, Synchronisierung der Konnektoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4331("TIP1-A_4331", "VPN-Zugangsdienst, Adressierung der NTP-Server"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4332("TIP1-A_4332", "VPN-Zugangsdienst, Verteilung des SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4334("TIP1-A_4334", "VPN-Zugangsdienst, Adressierung des SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4335("TIP1-A_4335", "VPN-Zugangsdienst, Bereitstellung der öffentlichen Adressen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4337("TIP1-A_4337", "VPN-Zugangsdienst, Physisch getrennte Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4338("TIP1-A_4338", "VPN-Zugangsdienst, Sicherung zum Transportnetz Internet durch Paketfilter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4339("TIP1-A_4339", "VPN-Zugangsdienst, Platzierung Paketfilters Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4340("TIP1-A_4340", "VPN-Zugangsdienst, Richtlinien für den Paketfilter zum Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4341("TIP1-A_4341", "VPN-Zugangsdienst, Erkennung von Angriffen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4344("TIP1-A_4344", "VPN-Zugangsdienst SIS, Maßnahmen gegen Schadsoftware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4345("TIP1-A_4345", "VPN-Zugangsdienst SIS, Application Layer Gateway"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4346("TIP1-A_4346", "VPN-Zugangsdienst SIS, Paketfilter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4347("TIP1-A_4347", "VPN-Zugangsdienst SIS, Filter für aktive Inhalte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4348("TIP1-A_4348", "VPN-Zugangsdienst SIS, URL-Filter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4349("TIP1-A_4349", "VPN-Zugangsdienst und Konnektor, IPsec-Protokoll"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4350("TIP1-A_4350", "VPN-Zugangsdienst und Konnektor, ESP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4351("TIP1-A_4351", "VPN-Zugangsdienst und Konnektor, Auswertung der Sequenznummern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4352("TIP1-A_4352", "VPN-Zugangsdienst und Konnektor, Fenster für die Auswertung der Sequenznummern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4353("TIP1-A_4353", "VPN-Zugangsdienst und Konnektor, Internet Key Exchange Version 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4354("TIP1-A_4354", "VPN-Zugangsdienst und Konnektor, NAT-Traversal"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4355("TIP1-A_4355", "VPN-Zugangsdienst und Konnektor, Dynamic Address Update"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4356("TIP1-A_4356", "VPN-Zugangsdienst und Konnektor, IP Payload Compression Protocol"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4357("TIP1-A_4357", "VPN-Zugangsdienst und Konnektor, Peer Liveness Detection"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4358("TIP1-A_4358", "Konnektor, Liveness Check Konnektor Zeitablauf"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4359("TIP1-A_4359", "Konnektor, NAT-Keepalives"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4360("TIP1-A_4360", "Konnektor, Konfiguration der NAT-Keepalives im Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4364("TIP1-A_4364", "VPN-Zugangsdienst, DiffServ-Behandlung zwischen VPN-Konzentrator und Transportnetz Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4367("TIP1-A_4367", "VPN-Zugangsdienst, DiffServ-Behandlung zwischen VPN-Zugangsdienst und Zentralem Netz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4368("TIP1-A_4368", "VPN-Zugangsdienst, DiffServ-Behandlung SIS zum Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4369("TIP1-A_4369", "VPN-Zugangsdienst, Festlegung der Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4370("TIP1-A_4370", "VPN-Zugangsdienst, Schnittstelle I_Secure_Channel_Tunnel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4371("TIP1-A_4371", "VPN-Zugangsdienst, Identität zur Authentisierung des VPN-Konzentrators TI beim Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4372("TIP1-A_4372", "VPN-Zugangsdienst, Ablauf des IPsec-Verbindungsaufbaus zur TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4373("TIP1-A_4373", "Konnektor, TUC_VPN-ZD_0001 “IPsec-Tunnel TI aufbauen”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4374("TIP1-A_4374", "VPN-Zugangsdienst, Verbindungsaufbau"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4375("TIP1-A_4375", "VPN-Zugangsdienst, Verhalten bei Verbindungsabbau"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4376("TIP1-A_4376", "VPN-Zugangsdienst, Auswahl des VPN-Konzentrators aufgrund von SRV-Records"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4377("TIP1-A_4377", "VPN-Zugangsdienst, Namensauflösung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4387("TIP1-A_4387", "VPN-Zugangsdienst, Adressblöcke für VPN-Konzentratoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4389("TIP1-A_4389", "VPN-Zugangsdienst, I_Secure_Channel_Tunnel::disconnect"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4390("TIP1-A_4390", "VPN-Zugangsdienst und Konnektor, Operation registerKonnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4391("TIP1-A_4391", "VPN-Zugangsdienst und Konnektor, Operation deregisterKonnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4392("TIP1-A_4392", "VPN-Zugangsdienst und Konnektor, Operation registerStatus"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4394("TIP1-A_4394", "VPN-Zugangsdienst, Schnittstelle I_Secure_Internet_Tunnel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4395("TIP1-A_4395", "VPN-Zugangsdienst, Identität zur Authentisierung des VPN-Konzentrators SIS beim Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4396("TIP1-A_4396", "VPN-Zugangsdienst, Ablauf des IPsec-Verbindungsaufbaus Richtung Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4397("TIP1-A_4397", "Konnektor, TUC_VPN-ZD_0002 “IPsec Tunnel SIS aufbauen”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4398("TIP1-A_4398", "VPN-Zugangsdienst, I_Secure_Internet_Tunnel::disconnect"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4399("TIP1-A_4399", "VPN-Zugangsdienst, Prozess Änderung der Sicherheitsleistungen des SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4472("TIP1-A_4472", "VPN-Zugangsdienst, Adressierung der Service-Zone TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4473("TIP1-A_4473", "VPN-Zugangsdienst, Verhalten der Konzentratoren bei Vollauslastung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4474("TIP1-A_4474", "IPv6-Adressierung der Internetschnittstellen der VPN-Konzentratoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4475("TIP1-A_4475", "VPN-Zugangsdienst, Performance Authentisierung / Autorisierung bei Standortausfall"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4476("TIP1-A_4476", "VPN-Zugangsdienst, Durchsatz Verbindung zum Zentralen Netz TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4477("TIP1-A_4477", "VPN-Zugangsdienst, Synchronisierung der Komponenten mit den Stratum-2-NTP-Servern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4478("TIP1-A_4478", "VPN-Zugangsdienst, Synchronisierung der Komponenten mit Ersatzverfahren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4479("TIP1-A_4479", "VPN-Zugangsdienst, maximale Zeitabweichung der Stratum-2-NTP-Server"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4480("TIP1-A_4480", "VPN-Zugangsdienst,"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4481("TIP1-A_4481", "VPN-Zugangsdienst, Kommunikation zwischen Service-Zonen und Zugangszonen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4482("TIP1-A_4482", "VPN-Zugangsdienst, Kommunikation zwischen Konnektoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4484("TIP1-A_4484", "Routing VPN-Zugangsdienst TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4485("TIP1-A_4485", "Routing VPN-Zugangsdienst Bestandsnetze"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4486("TIP1-A_4486", "Routing VPN-Zugangsdienst TI, lokale Dienste"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4487("TIP1-A_4487", "Routing VPN-Zugangsdienst SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4488("TIP1-A_4488", "Bandbreiten innerhalb des VPN-Zugangsdienstes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4489("TIP1-A_4489", "DiffServ-Behandlung im alternativen Zugangsnetz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4490("TIP1-A_4490", "DiffServ-Markierung durch SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4491("TIP1-A_4491", "VPN-Zugangsdienst, Registrierungsserver Fehlermeldungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4492("TIP1-A_4492", "VPN-Zugangsdienst, Zuweisung der Adressen, Verhinderung der Profilbildung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4495("TIP1-A_4495", "VPN-Zugangsdienst, Nutzung der ContractID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4497("TIP1-A_4497", "VPN-Zugangsdienst, sichere Speicherung des Key Signing Keys des TI Trust Anchors"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4498("TIP1-A_4498", "VPN-Zugangsdienst, Prozess Abschluss, Ändern und Auflösen des Vertragsverhältnisses sowie Deregistrierung von Konnektoren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5046("TIP1-A_5046", "VPN-Zugangsdienst, Sichere Speicherung des Vertrauensankers der PKI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5047("TIP1-A_5047", "VPN-Zugangsdienst, Gültigkeitsprüfung und Speicherung der TSL-Inhalte in lokalem Trust Store"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5048("TIP1-A_5048", "VPN-Zugangsdienst, Schlüssel sicher speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5074("TIP1-A_5074", "VPN-Zugangsdienst, Einhaltung des Datenschutzes bei Protokollierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5103("TIP1-A_5103", "VPN-Zugangsdienst, Resource Records im Nameserver Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5104("TIP1-A_5104", "VPN-Zugangsdienst, Resource Records im Nameserver TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5105("TIP1-A_5105", "VPN-Zugangsdienst, Konfigurationsdaten zur Übergabe bei Vertragsabschluss"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5117("TIP1-A_5117", "Anonymisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5118("TIP1-A_5118", "VPN-Zugangsdienst, Schnittstelle I_Registration_Service"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5120("TIP1-A_5120", "Clients des TSL-Dienstes: HTTP-Komprimierung unterstützen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5155("TIP1-A_5155", "VPN-Zugangsdienst SIS, Verhinderung Verbindungsaufbau aus dem Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5156("TIP1-A_5156", "VPN-Zugangsdienst SIS, Erkennung von Angriffen aus dem Internet"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5389("TIP1-A_5389", "VPN-Zugangsdienst, zyklische Prüfung der C.NK.VPN und C.HCI.OSIG Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5390("TIP1-A_5390", "VPN-Zugangsdienst, gesperrtes C.HCI.OSIG oder gesperrtes C.NK.VPN Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5391("TIP1-A_5391", "VPN-Zugangsdienst, Unterstützung von Änderungen der Registrierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5418("TIP1-A_5418", "VPN-Zugangsdienst, Standorte VPN-Konzentrator RU und TU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5451("TIP1-A_5451", "VPN-Zugangsdienst, IPsec-Verbindungen bei Komponentenausfall beenden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5709("TIP1-A_5709", "VPN-Zugangsdienst, bereitgestellte Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5710("TIP1-A_5710", "VPN-Zugangsdienst, Verteilung des hash&URL-Servers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5711("TIP1-A_5711", "VPN-Zugangsdienst, Härtung des hash&URL-Servers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5712("TIP1-A_5712", "VPN-Zugangsdienst, IP-Adresse des hash&URL-Servers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5713("TIP1-A_5713", "VPN-Zugangsdienst, Härtung des Registrierungsservers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_6748("TIP1-A_6748", "Traffic Selectoren VPN-Zugangsdienst TI"),

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