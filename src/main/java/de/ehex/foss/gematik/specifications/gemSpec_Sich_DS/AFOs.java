package de.ehex.foss.gematik.specifications.gemSpec_Sich_DS;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_Sich_DS]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs
implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2012("GS-A_2012", "Verantwortung der Anbieter und Betreiber für Einhaltung der Anforderungen Datenschutz und Informationssicherheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2021("GS-A_2021", "Anwendung der einheitlichen Methoden der Informationssicherheit durch Betreiber und Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2046("GS-A_2046", "Umsetzung der Anforderungen aus [gemSpec_SiBetrUmg] durch Anbieter von zentralen Produkten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2047("GS-A_2047", "Gestaltung der Umgebung von zentralen Produkten durch Betreiber für Schutzbedarf \"mittel\""),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2065("GS-A_2065", "Beschlagnahmeschutz bei Anbietern und Betreibern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2070("GS-A_2070", "Datenschutzkontrolle durch BfDI und gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2071("GS-A_2071", "Unterstützung bei der Datenschutzkontrolle durch BfDI und gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2072("GS-A_2072", "Bereitstellung von Datenschutz-Audits zur Datenschutzkontrolle durch BfDI und gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2073("GS-A_2073", "Anordnung von Maßnahmen des Datenschutzes durch BfDI und gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2074("GS-A_2074", "Umsetzung der durch BfDI und gematik angeordneten Maßnahmen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2075("GS-A_2075", "Untersagen von Verfahren durch BfDI und gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2076("GS-A_2076", "Datenschutzmanagement nach BSI für Betreiber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2087("GS-A_2087", "Information für Betroffene über Produkte durch Anbieter und Betreiber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2156("GS-A_2156", "Auditierungen der Zulassungsnehmer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2174("GS-A_2174", "Inhalte des Sicherheitsgutachtens aus Sicht des Datenschutzes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2177("GS-A_2177", "Anbieter müssen Pflichten der Auftragsdatenverarbeitung erfüllen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2213("GS-A_2213", "Wahrnehmung der Betroffenenrechte beim Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2214("GS-A_2214", "Anbieter müssen jährlich die Betreiber kontrollieren."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2309("GS-A_2309", "ISM der Beteiligten: Rollen und Verantwortlichkeiten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2326("GS-A_2326", "ISM der Beteiligten: Etablierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2328("GS-A_2328", "ISM der Beteiligten: Pflege und Fortschreibung der Sicherheitskonzepte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2329("GS-A_2329", "ISM der Beteiligten: Umsetzung der Sicherheitskonzepte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2330("GS-A_2330", "ISM der Beteiligten: Schwachstellen-Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2331("GS-A_2331", "ISM der Beteiligten: Sicherheitsvorfalls-Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2332("GS-A_2332", "ISM der Beteiligten: Notfallmanagement"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2333("GS-A_2333", "ISM der Beteiligten: Meldung an das koordinierende ISM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2339("GS-A_2339", "ISM der Beteiligten: regelmäßige Reviews"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2343("GS-A_2343", "ISM der Beteiligten: eigene Audits"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2345("GS-A_2345", "ISM der Beteiligten: Reviews und Trendanalysen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2347("GS-A_2347", "ISM der Beteiligten: Grundlagen neuer Planungsphasen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2350("GS-A_2350", "Produktunterstützung der Hersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2354("GS-A_2354", "Produktunterstützung mit geeigneten Sicherheits-Technologien"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2355("GS-A_2355", "ISM der Beteiligten: Nutzung des Problem-ManagementProzesses"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2356("GS-A_2356", "ISM der Beteiligten: Nutzung des Incident-ManagementProzesses"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2357("GS-A_2357", "ISM der Beteiligten: Nutzung der Prozesse und Reports des Betriebs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2359("GS-A_2359", "ISM der Beteiligten: Nutzung der Sicherheits-Technologien des koordinierenden ISM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2360("GS-A_2360", "ISM der Beteiligten: Meldung von Restrisiken"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2361("GS-A_2361", "ISM der Beteiligten: Vorfallsmanagement"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2362("GS-A_2362", "ISM der Beteiligten: Bericht lokaler Sicherheitsvorfälle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2363("GS-A_2363", "ISM der Beteiligten: Meldung schwerwiegender Sicherheitsvorfälle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2366("GS-A_2366", "ISM der Beteiligten: Notfallbewältigung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2524("GS-A_2524", "Produktunterstützung: Nutzung des Problem-ManagementProzesses"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_2525("GS-A_2525", "Hersteller: Schließen von Schwachstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3078("GS-A_3078", "Anbieter einer Schlüsselverwaltung: verpflichtende Migrationsstrategie bei Schwächung kryptographischer Primitive"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3125("GS-A_3125", "Schlüsselinstallation und Verteilung: Dokumentation gemäß Minimalitätsprinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3130("GS-A_3130", "Krypto_Schlüssel_Installation: Dokumentation der Schlüsselinstallation gemäß Minimalitätsprinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3139("GS-A_3139", "Krypto_Schlüssel: Dienst Schlüsselableitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3141("GS-A_3141", "Krypto_Schlüssel_Ableitung: Maßnahmen bei Bekanntwerden von Schwächen in der Schlüsselableitungsfunktion"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3149("GS-A_3149", "Krypto_Schlüssel_Archivierung: Dokumentation der Schlüsselarchivierung gemäß Minimalitätsprinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4944("GS-A_4944", "Produktentwicklung: Behebung von Sicherheitsmängeln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4945("GS-A_4945", "Produktentwicklung: Qualitätssicherung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4946("GS-A_4946", "Produktentwicklung: sichere Programmierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4947("GS-A_4947", "Produktentwicklung: Schutz der Vertraulichkeit und Integrität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5017("GS-A_5017", "ISM der Beteiligten: Schließen von Schwachstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5324("GS-A_5324", "Teilnahme des Anbieters an Sitzungen des kDSMS/kISMS"),

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
