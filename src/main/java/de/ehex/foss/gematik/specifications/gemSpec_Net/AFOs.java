package de.ehex.foss.gematik.specifications.gemSpec_Net;

import static de.ehex.foss.gematik.specifications.AFOType.MAY;
import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static de.ehex.foss.gematik.specifications.AFOType.SHOULD;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Net]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3824("GS-A_3824", "FQDN von Produkttypen der Fachanwendungen sowie der zentralen TI-Plattform"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3828("GS-A_3828", "Namensraum der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3829("GS-A_3829", "Konnektor, Nutzung externer Namensräume"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3830("GS-A_3830", "Namensdienst, Domainnamen- und Hierarchie"),

    GS_A_3832("GS-A_3832", "DNS-Protokoll, Resolver-Implementierungen"),

    GS_A_3833("GS-A_3833", "DNSSEC-Protokoll, Resolver-Implementierungen"),

    GS_A_3834("GS-A_3834", "DNS-Protokoll, Nameserver-Implementierungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3835("GS-A_3835", "DNS-Protokoll, Unterstützung von DNS-SD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3838("GS-A_3838", "DNSSEC, Trust Anchor"),

    GS_A_3839("GS-A_3839", "DNSSEC, Zonen mittels DNSSEC sichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3840("GS-A_3840", "DNS-Resolver, Nutzung von DNSSEC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3841("GS-A_3841", "Nameserver-Implementierungen, Einsatz von TSIG"),

    GS_A_3842("GS-A_3842", "DNS, Verwendung von iterativen queries zwischen Nameservern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3926("GS-A_3926", "Namensdienst, DNS-Root und Top Level Domain"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3927("GS-A_3927", "Namensdienst, Second Level Domains"),

    GS_A_3928("GS-A_3928", "Nameserver-Implementierungen, Second Level Domainnamen"),

    GS_A_3930("GS-A_3930", "Nameserver-Implementierungen, TTL"),

    GS_A_3931("GS-A_3931", "DNSSEC-Protokoll, Nameserver-Implementierungen"),

    GS_A_3932("GS-A_3932", "Abfrage der in der Topologie am nächsten stehenden Nameservers"),

    GS_A_3933("GS-A_3933", "NTP-Server-Implementierungen, Protokoll NTPv4"),

    GS_A_3934("GS-A_3934", "NTP-Client-Implementierungen, Protokoll NTPv4"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3935("GS-A_3935", "NTP-Server-Implementierungen, Kiss-o ́-Death"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3936("GS-A_3936", "NTP-Server-Implementierungen, IBURST"),

    GS_A_3937("GS-A_3937", "NTP-Client-Implementierungen, Association Mode und Polling Intervall"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3938("GS-A_3938", "NTP-Server-Implementierungen, Association Mode und Polling Intervall"),

    GS_A_3939("GS-A_3939", "Produkttypen der TI-Plattform, Zeitsynchronisierung nach Neustart"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3940("GS-A_3940", "Produkttyp Zeitdienst, Stratum 1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3941("GS-A_3941", "Produkttyp VPN-Zugangsdienst, Stratum 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3942("GS-A_3942", "Produkttyp Konnektor, Stratum 3"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3945("GS-A_3945", "NTP-Server-Implementierungen, SNTP"),

    GS_A_3946("GS-A_3946", "NTP-Client-Implementierungen, SNTP"),

    GS_A_4009("GS-A_4009", "Übertragungstechnologie auf OSI-Schicht LAN"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4010("GS-A_4010", "Standards für IPv6"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4011("GS-A_4011", "Unterstützung des Dual-Stack Mode"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4012("GS-A_4012", "Leistungsanforderungen an den Dual-Stack Mode"),

    GS_A_4013("GS-A_4013", "Nutzung von UDP/TCP-Portbereichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4016("GS-A_4016", "Operative Vergabe von UDP/TCP-Portbereichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4017("GS-A_4017", "Dokumentation UDP/TCP-Portbereiche GBV"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4018("GS-A_4018", "Dokumentation UDP/TCP-Portbereiche Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4022("GS-A_4022", "Koordinierung Adressvergabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4023("GS-A_4023", "Zuweisung IP-Adressbereiche"),

    GS_A_4024("GS-A_4024", "Nutzung IP-Adressbereiche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4026("GS-A_4026", "Dokumentation IP-Adressbereiche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4027("GS-A_4027", "Reporting IP-Adressbereiche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4029("GS-A_4029", "IPv4-Adresskonzept Produktivumgebung"),

    GS_A_4033("GS-A_4033", "Statisches Routing TI-Übergabepunkte", SHOULD),

    GS_A_4036("GS-A_4036", "Möglichkeit des Einsatzes von Hochverfügbarkeitsprotokollen", MAY),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4037("GS-A_4037", "Unterstützung der DiffServ-Architektur"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4042("GS-A_4042", "DSCP-Markierung durch Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4043("GS-A_4043", "DSCP-Markierung durch SZZPs des Zentralen Netzes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4044("GS-A_4044", "DSCP-Kompatibilität im Zentralen Netz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4045("GS-A_4045", "DSCP-Transport im Zentralen Netz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4048("GS-A_4048", "DiffServ-Behandlung von Datenverkehr - Produkttypen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4050("GS-A_4050", "DiffServ-Behandlung innerhalb des Zentralen Netzes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4051("GS-A_4051", "Unterstützung von Dienstklassen im Zentralen Netz TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4052("GS-A_4052", "Stateful Inspection"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4053("GS-A_4053", "Ingress und Egress Filtering"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4054("GS-A_4054", "Paketfilter Default Deny"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4057("GS-A_4057", "Technische Anforderungen Sicherheitsgateways -Betriebssoftware"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4058("GS-A_4058", "Sicherheitskomponenten SZZP/Zentrales Netz TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4061("GS-A_4061", "Sicherheitskomponenten Zugangsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4062("GS-A_4062", "Sicherheitskomponenten bei Netzübergängen zu Fremdnetzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4064("GS-A_4064", "Koordinierung Sicherheitsgateway-Regeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4065("GS-A_4065", "Meldung neue Sicherheitsgateway-Regeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4066("GS-A_4066", "Umsetzung Sicherheitsgateway-Regeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4067("GS-A_4067", "Reporting Sicherheitsgateway-Regeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4068("GS-A_4068", "Dokumentation Sicherheitsgateway-Regeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4069("GS-A_4069", "Erlaubter Verkehr Produkttypen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4070("GS-A_4070", "Netzwerksteuerungsprotokolle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4071("GS-A_4071", "Namensraum der TI-Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4072("GS-A_4072", "Namensdienst, DNS-Root und Top Level Domain, Domainnamen- und Hierarchie für die TI-Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4074("GS-A_4074", "NTP-Server-Implementierungen, Maximale Abweichung der Zeitinformation von Stratum-1- und -2-NTP-Servern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4075("GS-A_4075", "Produkttyp Konnektor, Maximale Abweichung der Zeitinformation des NTP-Servers"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4754("GS-A_4754", "Zuweisung IP-Adressbereiche, Reservierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4756("GS-A_4756", "Reporting IP-Adressbereiche, Form"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4758("GS-A_4758", "IPv4-Adressen SZZP zum Produkttyp"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4759("GS-A_4759", "IPv4-Adressen Produkttyp zum SZZP"),

    GS_A_4763("GS-A_4763", "Einsatz von Hochverfügbarkeitsprotokollen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4765("GS-A_4765", "DSCP-Transport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4766("GS-A_4766", "DiffServ-Klassifizierung auf dem Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4767("GS-A_4767", "DiffServ-Klassifizierung durch SZZPs des Zentralen Netzes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4770("GS-A_4770", "Minimale Unterstützung von Behandlungsaggregaten im Zentralen Netz TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4771("GS-A_4771", "Aggregierung von Dienstklassen im Zentralen Netz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4772("GS-A_4772", "Bandbreitenbegrenzung durch Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4773("GS-A_4773", "DiffServ-gemäße Behandlung im Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4774("GS-A_4774", "Klassenbasiertes Queuing im Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4777("GS-A_4777", "Technische Anforderungen Sicherheitsgateways - Dokumentation Systemfunktion"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4778("GS-A_4778", "Technische Anforderungen Sicherheitsgateways -Verbindungen nach Erstinstallation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4779("GS-A_4779", "Technische Anforderungen Sicherheitsgateways - keine Verbindungen bei Ausfall der Komponenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4780("GS-A_4780", "Reporting Sicherheitsgateway-Regeln, Format"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4781("GS-A_4781", "Logischer Aufbau SZZP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4782("GS-A_4782", "SZZPs bei angeschlossenen Produkttypen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4783("GS-A_4783", "SZZP Sicherheitsgateways"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4784("GS-A_4784", "Anschlussvarianten SZZP-Produkttyp"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4785("GS-A_4785", "Technische Maßnahmen bei redundanten SZZPs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4786("GS-A_4786", "Anschlussvarianten SZZP-Provider (CE-PE)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4787("GS-A_4787", "Anschlussbandbreiten SZZP-Provider (CE-PE)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4788("GS-A_4788", "TI zentrales Transportnetz Provider"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4789("GS-A_4789", "Ausschluss öffentlicher Transportnetze"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4790("GS-A_4790", "Zentrales Netz, nur erlaubte Kommunikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4791("GS-A_4791", "Zentrales Netz, neue Typen von erlaubtem Verkehr"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4792("GS-A_4792", "Onboarding zugelassene Fachdienste, Zentraler Dienste und Bestandsnetze"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4795("GS-A_4795", "Produkttyp Zentrales Netz, Festlegung der Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4796("GS-A_4796", "Anschlusstyp CPE an Produkttyp"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4797("GS-A_4797", "Anschlusstyp CPE an Produkttyp, Modularität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4798("GS-A_4798", "Schnittstelle I_IP_Transport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4799("GS-A_4799", "IPv4-Adressen SZZP-Backbone und SZZP intern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4800("GS-A_4800", "Adresskonflikte IPv4-Adressen SZZP-Backbone und SZZP intern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4801("GS-A_4801", "Erreichbarkeit TI IP-Adressbereiche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4804("GS-A_4804", "Umsetzung Parameter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4805("GS-A_4805", "Abstimmung angeschlossener Produkttyp mit dem Anbieter Zentrales Netz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4806("GS-A_4806", "PoP Redundanter Anschluss"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4807("GS-A_4807", "Ballungsräume PoPs Zentrales Netz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4808("GS-A_4808", "Nameserver-Implementierungen, nichtautorisierte Zonentransfers"),

    GS_A_4809("GS-A_4809", "Nameserver-Implementierungen, Redundanz"),

    GS_A_4810("GS-A_4810", "DNS-SD, Format von TXT Resource Records"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4811("GS-A_4811", "Produkttyp Konnektor, DNS-SD, Interpretation von TXT Resource Records"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4812("GS-A_4812", "Produkttyp Namensdienst, Festlegung der Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4813("GS-A_4813", "Produkttyp Namensdienst, nur erlaubte Kommunikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4814("GS-A_4814", "Prozess zur Verwaltung von DNS Resource Records"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4815("GS-A_4815", "Prozess zur DNSSEC Schlüsselverteilung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4816("GS-A_4816", "Produkttyp Konnektor, Einbringung des DNSSEC Trust Anchor ür den Namensraum TI"),

    GS_A_4817("GS-A_4817", "Produkttypen der Fachanwendungen sowie der zentralen TI-Plattform, Einbringung des DNSSEC Trust Anchor für den Namensraum TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4818("GS-A_4818", "Prozess zur Verwaltung von Subdomains"),

    GS_A_4819("GS-A_4819", "Schnittstelle I_NTP_Time_Information, Nutzung durch fachanwendungsspezifische Dienste", SHOULD),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4820("GS-A_4820", "Schnittstelle I_NTP_Time_Information, Nutzung durch Zentrale Dienste der TI-Plattform"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4821("GS-A_4821", "Schnittstelle I_NTP_Time_Information, Ersatzverfahren für Zentrale Dienste der TI-Plattform"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4822("GS-A_4822", "Produkttyp Zeitdienst, Festlegung der Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4823("GS-A_4823", "Produkttyp Zeitdienst, Synchronisierung der Stratum-1-NTP-Server mit DCF77"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4824("GS-A_4824", "Produkttyp Zeitdienst, Anzahl der Stratum-1-NTP-Server"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4825("GS-A_4825", "Produkttyp Zeitdienst, nur erlaubte Kommunikation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4826("GS-A_4826", "Produkttyp Zeitdienst, Monitoring der Stratum-1-NTP-Server"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4827("GS-A_4827", "Produkttyp Zeitdienst, Vergleich mit Referenzzeitquelle"),

    GS_A_4831("GS-A_4831", "Standards für IPv4"),

    GS_A_4832("GS-A_4832", "Path MTU Discovery"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4833("GS-A_4833", "Prozess „Verwaltung von UDP/TCP-Portbereichen“ - Definition/Implementierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4834("GS-A_4834", "Prozess „Verwaltung von IP-Adressbereichen“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4837("GS-A_4837", "Behandlung von Dienstklassen im Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4840("GS-A_4840", "DiffServ-Behandlung im VPN-Zugangsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4841("GS-A_4841", "Unterstützung von Dienstklassen im VPN-Zugangsdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4846("GS-A_4846", "Prozess „Verwaltung von Sicherheitsgateway-Regeln“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4847("GS-A_4847", "Produkttyp VPN-Zugangsdienst, DNSSEC im Namensraum Transportnetz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4848("GS-A_4848", "Produkttyp Konnektor, DNSSEC im Namensraum Transportnetz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4849("GS-A_4849", "Produkttyp Konnektor, recursive queries"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4850("GS-A_4850", "IPv4-Adresskonzept Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4851("GS-A_4851", "IPv4-Adresskonzept Referenzumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4879("GS-A_4879", "DNSSEC, Zonen im Namensraum Internet mittels DNSSEC sichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4880("GS-A_4880", "IP-VPN - Bereitstellung für TI-Umgebungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4881("GS-A_4881", "IP-VPN- Interface zum Produkttyp"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4882("GS-A_4882", "IP-VPN- Zugesicherte Bandbreiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4883("GS-A_4883", "IP-VPN- Verhinderung von Datenaustausch"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4884("GS-A_4884", "Erlaubte ICMP-Types"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4885("GS-A_4885", "Namensdienst, Gültigkeitszeitraum des DNSSEC Trust Anchor TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4889("GS-A_4889", "Bandbreitenzuweisung am Übergang ins Zentrale Netz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4890("GS-A_4890", "Bandbreitenzuweisung am Übergang ins Zentrale Netz-DiffServ"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4891("GS-A_4891", "Klassenbasierte Zuordnung von Bandbreiten im Konnektor"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4895("GS-A_4895", "Meldung Anbieter Zentrales Netz an angeschlossenen Produkttyp"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5024("GS-A_5024", "KSR, Bereitstellung von DNS SRV Resource Records"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5037("GS-A_5037", "VPN-Zugangsdienst, Prozess zur Verteilung des DNSSEC Trust Anchor im Namensraum Transportnetz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5076("GS-A_5076", "SZZP für mehrere Produktinstanzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5089("GS-A_5089", "Nameserver-Implementierungen, private Schlüssel sicher speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5132("GS-A_5132", "Namensdienst, DNSSEC Trust Anchor TI PU basierend auf der TLD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5133("GS-A_5133", "Namensdienst, DNSSEC Trust Anchor TU/RU basierend auf der TLD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5199("GS-A_5199", "DNSSEC im Namensraum Internet, Vertrauensanker"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5346("GS-A_5346", "DNSSEC, Festlegung der DNSSEC gesicherten Zonen und Verpflichtung zur Validierung von DNSSEC RRs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5347("GS-A_5347", "Produkttyp Namensdienst, DNSSEC Key- und Algorithm-Rollover"),

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
