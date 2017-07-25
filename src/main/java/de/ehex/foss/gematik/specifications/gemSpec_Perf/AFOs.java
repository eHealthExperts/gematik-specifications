package de.ehex.foss.gematik.specifications.gemSpec_Perf;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Perf]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3055("GS-A_3055", "Performance - zentrale Dienste - Skalierbarkeit (Anbieter)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3058("GS-A_3058", "Performance - zentrale Dienste - lineare Skalierbarkeit"),

    GS_A_4145("GS-A_4145", "Performance - zentrale Dienste - Robustheit gegenüber Lastspitzen"),

    GS_A_4146("GS-A_4146", "Performance - Performance-Daten erfassen"),

    GS_A_4147("GS-A_4147", "Performance - Störungsampel - Performance-Daten"),

    GS_A_4148("GS-A_4148", "Performance - Störungsampel - Ereignisnachricht bei Ausfall"),

    GS_A_4149("GS-A_4149", "Performance - Reporting-Daten in Performance-Report"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4150("GS-A_4150", "Performance - Konnektor in LE-U1 - Parallele Verarbeitung VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4151("GS-A_4151", "Performance - Konnektor in LE-U1 - Parallele Verarbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4153("GS-A_4153", "Performance - Konnektor in LE-U1 - Verfügbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4154("GS-A_4154", "Performance - Kartenterminal - Bearbeitungszeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4155("GS-A_4155", "Performance - zentrale Dienste - Verfügbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4156("GS-A_4156", "Performance - zentrales Netz - Verfügbarkeit - Anschlussoption „Hohe Verfügbarkeit“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4157("GS-A_4157", "Performance - Konfigurationsdienst - Bearbeitungszeit unter Last"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4158("GS-A_4158", "Performance - TSL-Dienst - Verfügbarkeit"),

    GS_A_4159("GS-A_4159", "Performance - OCSP Responder - Bearbeitungszeiten unter Spitzenlast"),

    GS_A_4160("GS-A_4160", "Performance - OCSP-Responder - Performance Reporting -Daten nach Zertifikatstyp"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4161("GS-A_4161", "Performance - Störungsampel - Durchsatz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4162("GS-A_4162", "Performance - Namensdienst - Bearbeitungszeit unter Last"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4163("GS-A_4163", "Performance - Zeitdienst - Durchsatz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4165("GS-A_4165", "Performance - Zeitdienst - Verfügbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4166("GS-A_4166", "Performance - Zentrales Netz - Durchsatz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4167("GS-A_4167", "Performance - Zentrales Netz - Roundtrip Time"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4168("GS-A_4168", "Performance - VPN-Zugangsdienst - Bearbeitungszeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4170("GS-A_4170", "Performance - VPN-Zugangsdienst - Durchsatz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4346("GS-A_4346", "Performance - Konnektor in LE-U1 - Bearbeitungszeit lastfrei"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4347("GS-A_4347", "Performance - Zentrales Netz - Paketverlustrate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4353("GS-A_4353", "Performance - zentrales Netz - Verfügbarkeit - Anschlussoption „Niedrige Verfügbarkeit“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4853("GS-A_4853", "Performance - Konfigurationsdienst - Verfügbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4854("GS-A_4854", "Performance - TSL-Dienst - Last und Parallele Downloads"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5013("GS-A_5013", "Performance - Konnektor - Software Download"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5014("GS-A_5014", "Performance - Zentrales Netz - Volumenmessung im SZZP"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5015("GS-A_5015", "Performance - VPN-Zugangsdienst - Volumenmessung im SIS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5028("GS-A_5028", "Performance - zentrale Dienste - Verfügbarkeit Produktivbetrieb"),

    GS_A_5029("GS-A_5029", "Performance - VSDM Intermediär - Bearbeitungszeit unter Last"),

    GS_A_5031("GS-A_5031", "Performance - VSDM Fachdienste - Bearbeitungszeit unter Last"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5032("GS-A_5032", "Performance - VSDM Fachdienste - Verfügbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5036("GS-A_5036", "Performance - Stapelsignatur Konnektor für LE-U3"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5059("GS-A_5059", "Performance - Stapelsignatur Konnektor für LE-U1 im Auslieferungszustand"),

    GS_A_5092("GS-A_5092", "Performance - Performance-Daten erfassen (Fachdienste VSDM)"),

    GS_A_5093("GS-A_5093", "Performance - Störungsampel - Performance-Daten (Fachdienste VSDM)"),

    GS_A_5094("GS-A_5094", "Performance - Störungsampel - Ereignisnachricht bei Ausfall (Fachdienste VSDM)"),

    GS_A_5095("GS-A_5095", "Performance - Reporting-Daten in Performance-Report (Fachdienste VSDM)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5096("GS-A_5096", "Performance - Konnektor in LE-U2 - Bearbeitungszeit lastfrei"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5097("GS-A_5097", "Performance - Konnektor in LE-U3 - Bearbeitungszeit lastfrei"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5098("GS-A_5098", "Performance - Konnektor in LE-U4 - Bearbeitungszeit lastfrei"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5099("GS-A_5099", "Performance - Konnektor in LE-U2 - Parallele Verarbeitung VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5100("GS-A_5100", "Performance - Konnektor in LE-U3 - Parallele Verarbeitung VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5101("GS-A_5101", "Performance - Konnektor in LE-U4 - Parallele Verarbeitung VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5102("GS-A_5102", "Performance - Konnektor in LE-U2 - Parallele Verarbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5103("GS-A_5103", "Performance - Konnektor in LE-U3 - Parallele Verarbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5104("GS-A_5104", "Performance - Konnektor in LE-U4 - Parallele Verarbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5105("GS-A_5105", "Performance - Stapelsignatur Konnektor für LE-U2 im Auslieferungszustand"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5106("GS-A_5106", "Performance - Stapelsignatur Konnektor für LE-U4"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5107("GS-A_5107", "Performance - Konnektor in LE-U2 - Verfügbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5108("GS-A_5108", "Performance - Konnektor in LE-U3 - Verfügbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5109("GS-A_5109", "Performance - Konnektor in LE-U4 - Verfügbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5130("GS-A_5130", "Performance - Konnektor - Performance Logging"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5135("GS-A_5135", "Performance - Verzeichnisdienst - Bearbeitungszeit unter Last"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5247("GS-A_5247", "Performance - Konnektor - G2-Karten mit unterschiedlicher CV-Root"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5325("GS-A_5325", "Performance - Konnektor - Kapazitätsplanung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5326("GS-A_5326", "Performance - Konnektor - Hauptspeicher"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5327("GS-A_5327", "Performance - Konnektor - Skalierbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5328("GS-A_5328", "Performance - Konnektor - TLS-Handshake"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5329("GS-A_5329", "eHealth-KT Performance - TLS-Handshake I"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5330("GS-A_5330", "eHealth-KT Performance - TLS-Handshake II"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5331("GS-A_5331", "Performance - zentrale Dienste - TLS-Handshake"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5332("GS-A_5332", "Performance - Konnektor - Robustheit gegenüber Lastspitzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5333("GS-A_5333", "Performance - Konnektor - TLS Session Resumption 1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5334("GS-A_5334", "Performance - Konnektor - TLS Session Resumption 2"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5490("GS-A_5490", "Performance - Konnektor - Aktualisierung BNetzA-VL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5519("GS-A_5519", "SigProxy: Performance - TLS-Handshake"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5520("GS-A_5520", "SigProxy: Performance - TLS Session Resumption 1"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5521("GS-A_5521", "SigProxy: Performance - Weiterleiten von Nachrichten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5522("GS-A_5522", "SigProxy: Performance - Validierung auf Anzeigbarkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5523("GS-A_5523", "Performance - zentrale Dienste - Redundanzlösung"),

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
