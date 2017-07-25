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
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3824("GS-A_3824", "Hostnamen von Produkttypen der Fachanwendungen sowie der zentralen TI-Plattform"),

    GS_A_3832("GS-A_3832", "DNS-Protokoll, Resolver-Implementierungen"),

    GS_A_3833("GS-A_3833", "DNSSEC-Protokoll, Resolver-Implementierungen"),

    GS_A_3834("GS-A_3834", "DNS-Protokoll, Nameserver-Implementierungen"),

    GS_A_3839("GS-A_3839", "DNSSEC, Zonen mittels DNSSEC sichern"),

    GS_A_3840("GS-A_3840", "DNS-Resolver, Nutzung von DNSSEC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3841("GS-A_3841", "Nameserver-Implementierungen, Einsatz von TSIG"),

    GS_A_3842("GS-A_3842", "DNS, Verwendung von iterativen queries zwischen Nameservern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3928("GS-A_3928", "Nameserver-Implementierungen, Second Level Domainnamen"),

    GS_A_3930("GS-A_3930", "Nameserver-Implementierungen, TTL"),

    GS_A_3931("GS-A_3931", "DNSSEC-Protokoll, Nameserver-Implementierungen"),

    GS_A_3932("GS-A_3932", "Abfrage der in der Topologie am nächsten stehenden Nameservers"),

    GS_A_3933("GS-A_3933", "NTP-Server-Implementierungen, Protokoll NTPv4"),

    GS_A_3934("GS-A_3934", "NTP-Client-Implementierungen, Protokoll NTPv4"),

    GS_A_3937("GS-A_3937", "NTP-Client-Implementierungen, Association Mode und Polling Intervall"),

    GS_A_3939("GS-A_3939", "Produkttypen der TI-Plattform, Zeitsynchronisierung nach Neustart"),

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
    GS_A_4018("GS-A_4018", "Dokumentation UDP/TCP-Portbereiche Anbieter"),

    GS_A_4024("GS-A_4024", "Nutzung IP-Adressbereiche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4027("GS-A_4027", "Reporting IP-Adressbereiche"),

    GS_A_4033("GS-A_4033", "Statisches Routing TI-Übergabepunkte", SHOULD),

    GS_A_4035("GS-A_4035", "Dynamisches Routing Anschluss an das Zentrale Netz TI", MAY),

    GS_A_4036("GS-A_4036", "Möglichkeit des Einsatzes von Hochverfügbarkeitsprotokollen", MAY),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4759("GS-A_4759", "IPv4-Adressen Produkttyp zum SZZP"),

    GS_A_4762("GS-A_4762", "Dynamisches Routing Anschluss an das Zentrale Netz TI, Routing-Protokolle"),

    GS_A_4763("GS-A_4763", "Einsatz von Hochverfügbarkeitsprotokollen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4805("GS-A_4805", "Abstimmung angeschlossener Produkttyp mit dem Anbieter Zentrales Netz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4808("GS-A_4808", "Nameserver-Implementierungen, nichtautorisierte Zonentransfers"),

    GS_A_4809("GS-A_4809", "Nameserver-Implementierungen, Redundanz"),

    GS_A_4810("GS-A_4810", "DNS-SD, Format von TXT Resource Records"),

    GS_A_4817("GS-A_4817", "Produkttypen der Fachanwendungen sowie der zentralen TIPlattform, Einbringung des DNSSEC Trust Anchor für den Namensraum TI"),

    GS_A_4819("GS-A_4819", "Schnittstelle I_NTP_Time_Information, Nutzung durch fachanwendungsspezifische Dienste", SHOULD),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4820("GS-A_4820", "Schnittstelle I_NTP_Time_Information, Nutzung durch Zentrale Dienste der TI-Plattform"),

    GS_A_4831("GS-A_4831", "Standards für IPv4"),

    GS_A_4832("GS-A_4832", "Path MTU Discovery"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5089("GS-A_5089", "Nameserver-Implementierungen, Schlüssel sicher speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5346("GS-A_5346", "DNSSEC, Festlegung der DNSSEC gesicherten Zonen und Verpflichtung zur Validierung von DNSSEC RRs"),

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
