package de.ehex.foss.gematik.specifications.gemKPT_Test_ORS1;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemKPT_Test_ORS1]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2234("KOM-LE-A_2234", "KOM-LE und PVS System: Tests in Referenz- Test- und Produktivumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2238("KOM-LE-A_2238", "Mitwirkungsverpflichtung am Testverfahren von KOM-LE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2239("KOM-LE-A_2239", "Bereitstellung KOM-LE Clientmodul in Referenz- und Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2241("KOM-LE-A_2241", "KOM-LE Clientmodul Qualitätsziele und Testarten in Referenzumgebung des Entwicklertests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2242("KOM-LE-A_2242", "Durchführung von Entwicklertests der Hersteller und Betreiber KOM-LE Clientmoduls"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2244("KOM-LE-A_2244", "KOM-LE Clientmodul Qualitätsziele und Testarten in Testumgebung der Eingangsprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2245("KOM-LE-A_2245", "KOM-LE-Clientmodul Qualitätsziele und Testarten in Testumgebung des Produkttests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2247("KOM-LE-A_2247", "KOM-LE Clientmodul Qualitätsziele und Testarten in Testumgebung des produktübergreifenden Tests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2250("KOM-LE-A_2250", "Bereitstellung Fachdienst KOM-LE in Referenz- und Testumgebung in dreifacher Ausführung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2251("KOM-LE-A_2251", "Fachdienst KOM-LE Qualitätsziele und Testarten in Referenzumgebung des Entwicklertests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2252("KOM-LE-A_2252", "Durchführung von eigenständigen Entwicklertests der Hersteller und Betreiber des Fachdienstes KOM-LE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2254("KOM-LE-A_2254", "Fachdienst KOM-LE Qualitätsziele und Testarten in Testumgebung der Eingangsprüfung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2255("KOM-LE-A_2255", "Fachdienst KOM-LE Qualitätsziele und Testarten in Testumgebung des Produkttests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2257("KOM-LE-A_2257", "Fachdienst KOM-LE Qualitätsziele und Testarten in Testumgebung des produktübergreifenden Tests"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2260("KOM-LE-A_2260", "Teilnahme Fachdienst KOM-LE an Erprobung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2261("KOM-LE-A_2261", "Teilnahme Betreiber von Produkttypen der Fachanwendung KOM-LE an Erprobung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2265("KOM-LE-A_2265", "Teilnehmende Leistungserbringerinstitutionen an der Inbetriebnahme von KOM-LE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    KOM_LE_A_2268("KOM-LE-A_2268", "Verfügbarkeit des Fachdienstes von KOM-LE"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2730("TIP1-A_2730", "Beschleunigter Change-Prozess"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2769("TIP1-A_2769", "Kompatibilität und Interoperabilität der Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2781("TIP1-A_2781", "Dauerhafte Verfügbarkeit in der Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2805("TIP1-A_2805", "Zeitnahe Anpassung von Produktkonfigurationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2820("TIP1-A_2820", "Zulassung für PU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3202("TIP1-A_3202", "Mitwirkungspflicht Hersteller und Anbieter am Test"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3212("TIP1-A_3212", "Bereitstellung X.509-nonQES-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4121("TIP1-A_4121", "Eigene Tests der Hersteller und Anbieter in RU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4122("TIP1-A_4122", "Ziel Eigenverantwortlicher Test"),

    TIP1_A_4126("TIP1-A_4126", "Ausgangskriterium Eigenverantwortlicher Test: Produktdokumentation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4127("TIP1-A_4127", "Ausgangskriterium Eigenverantwortlicher Test: Testbericht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4132("TIP1-A_4132", "Keine Tests durch Hersteller / Anbieter in TU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4133("TIP1-A_4133", "Unterstützung durch Hersteller / Anbieter in TU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4149("TIP1-A_4149", "Ziel Entwicklertest: Erfüllung ISO 2500 0"),

    TIP1_A_4157("TIP1-A_4157", "Eingangskriterium Eingangsprüfung: Testbericht Entwicklertest"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4158("TIP1-A_4158", "Eingangskriterium Eingangsprüfung: Produktbereitstellung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4911("TIP1-A_4911", "Serviceleistungen des Service Providers eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4912("TIP1-A_4912", "Definition von Serviceleistungen und Überwachung der Serviceerbringung durch den Service Provider eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4913("TIP1-A_4913", "Bereitstellung eines lokalen IT-Service-Managements durch den Service Provider eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4914("TIP1-A_4914", "Etablierung eines SPOC durch den Service Provider eGK zur Kommunikation mit anderen an der Erprobungsphase im ORS1 beteiligten Service Providern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4915("TIP1-A_4915", "Mitwirkung im übergreifenden ITSM der TI durch den Service Provider eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4916("TIP1-A_4916", "Supportleistungen des Service Providers eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4918("TIP1-A_4918", "Koordination von Anbietern und Herstellern im Support durch den Service Provider eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4919("TIP1-A_4919", "Nutzung von angebotenen Leistungen anderer Service Provider durch den Service Provider eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4920("TIP1-A_4920", "Service Level Prozess- & Servicequalitätsvorgaben Service Provider eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4929("TIP1-A_4929", "Nachweis über Qualität der Zufallszahlen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4932("TIP1-A_4932", "Zulassung für PU: Sicherheitsgutachten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5052("TIP1-A_5052", "Dauerhafte Verfügbarkeit in der RU"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5060("TIP1-A_5060", "Service- und Supportverantwortung des Service Providers eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5061("TIP1-A_5061", "Produktverantwortung des Service Providers eGK"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5062("TIP1-A_5062", "Koordination von produktverantwortlichen Anbietern und Herstellern durch den Service Provider eGK"),

    VSDM_A_2797("VSDM-A_2797", "Intermediär VSDM: Qualitätsziele und Testarten in Referenzumgebung"),

    VSDM_A_2799("VSDM-A_2799", "Bereitstellung Intermediär VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2800("VSDM-A_2800", "Fachdienst VSDM: Qualitätsziele und Testarten in Referenzumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2802("VSDM-A_2802", "Bereitstellung Fachdienste VSDM (UFS, VSDD, CMS) in Referenzumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2803("VSDM-A_2803", "Bereitstellung Fachdienste VSDM (UFS, VSDD, CMS) in Test- und Produktivumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2812("VSDM-A_2812", "Bereitstellung Testkartensatz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2813("VSDM-A_2813", "Personalisierung der Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2814("VSDM-A_2814", "Eindeutigkeit der Testkartenschlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2815("VSDM-A_2815", "Berücksichtigung von Vorgaben zur Schlüsselerzeugung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2824("VSDM-A_2824", "Mitwirkungsverpflichtung am Testverfahren"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2825("VSDM-A_2825", "Bereitstellen von VSD-Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2826("VSDM-A_2826", "Bereitstellen datumsbasierter VSD-Updates"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2827("VSDM-A_2827", "Prüfen der eGK-Sperrung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2828("VSDM-A_2828", "Prüfen der eGK-Entsperrung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2829("VSDM-A_2829", "Entfernen der Updateinformationen aus UFS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2830("VSDM-A_2830", "Integration multipler Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2831("VSDM-A_2831", "Verwendung von Testkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2832("VSDM-A_2832", "Umsetzung des Flip/Flop-Verfahrens"),

    VSDM_A_2845("VSDM-A_2845", "Durchführung von eigenständigen Entwicklertests der Hersteller und Betreiber Intermediär VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2846("VSDM-A_2846", "Durchführung von Entwicklertests der Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2853("VSDM-A_2853", "Teilnahme Fachdienste VSDM an Erprobung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2854("VSDM-A_2854", "Teilnahme Betreiber von Fachdiensten VSDM an Erprobung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2858("VSDM-A_2858", "VSD Aktualisierung durch Schema-Update"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2862("VSDM-A_2862", "Teilnehmende Versicherte an Inbetriebnahme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2912("VSDM-A_2912", "Service- und Supportverantwortung des Service Providers Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2913("VSDM-A_2913", "Koordination von produktverantwortlichen Anbietern und Herstellern durch den Service Provider Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2914("VSDM-A_2914", "Produktverantwortung des Service Providers Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2915("VSDM-A_2915", "Serviceleistungen des Service Providers Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2916("VSDM-A_2916", "Definition von Serviceleistungen und Überwachung der Serviceerbringung durch den Service Provider Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2917("VSDM-A_2917", "Bereitstellung eines lokalen IT-Service-Managements durch den Service Provider Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2918("VSDM-A_2918", "Etablierung eines SPOC durch den Service Provider Fachdienste VSDM zur Kommunikation mit anderen an der Erprobungsphase beteiligten Service Providern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2919("VSDM-A_2919", "Wahrnehmung der Mitwirkungspflichten gemäß den Richtlinien zum Betrieb der TI durch den Service Provider Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2920("VSDM-A_2920", "Supportleistungen des Service Providers Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2921("VSDM-A_2921", "Koordination von Anbietern und Herstellern im Support durch den Service Provider Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2922("VSDM-A_2922", "Nutzung von angebotenen Leistungen anderer Service Provider durch den Service Provider Fachdienste VSDM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2923("VSDM-A_2923", "Service Level Prozess- & Servicequalitätsvorgaben Service Provider Fachdienste VSDM"),

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
