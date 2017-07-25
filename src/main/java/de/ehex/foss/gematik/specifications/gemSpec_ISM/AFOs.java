package de.ehex.foss.gematik.specifications.gemSpec_ISM;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_ISM]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4503("GS-A_4503", "Dokumentation des ISM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4504("GS-A_4504", "Bereitstellung der Dokumentation des ISM bei Audits"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4505("GS-A_4505", "Jährliche Prüfung der Dokumentation des ISM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4506("GS-A_4506", "Übermittlung von Security Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4507("GS-A_4507", "Bereitstellung des Security Reports in der Erprobung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4508("GS-A_4508", "Bereitstellung des Security Reports im Produktivbetrieb"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4509("GS-A_4509", "Dateiformat und -struktur des Security Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4510("GS-A_4510", "Dateinamenskonvention des Security Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4511("GS-A_4511", "Aufschlüsselung pro TI-Produkt"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4512("GS-A_4512", "Dateistruktur der Informationen in den Security Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4513("GS-A_4513", "Kennzahl 01: Budgetierung der Informationssicherheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4514("GS-A_4514", "Kennzahl 02: Schulungstage mit Bezug zur Informationssicherheit je Mitarbeiter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4515("GS-A_4515", "Kennzahl 03: Anzahl der externen und internen Informationssicherheits-Audits"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4516("GS-A_4516", "Kennzahl 04: Behebungszeit von in internen oder externen Audits festgestellten Abweichungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4517("GS-A_4517", "Kennzahl 05: Vollständigkeit der Erfassung organisationseigener Werte (Assets)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4518("GS-A_4518", "Kennzahl 06: Prozesstreue in der Änderungsverwaltung (Change Management)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4519("GS-A_4519", "Kennzahl 07: Prozessablauf in der Änderungsverwaltung (Change Management)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4520("GS-A_4520", "Kennzahl 08: Anzahl privilegierter Benutzer"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4521("GS-A_4521", "Kennzahl 09: Regeltests der Notfallpläne anhand von Notfallübungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4522("GS-A_4522", "Kennzahl 10: Regelprüfung des Dokumentationsrahmenwerks des ISM der Anbieter"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4523("GS-A_4523", "Bereitstellung Kommunikationsschnittstelle für Informationssicherheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4524("GS-A_4524", "Meldung von Kontaktinformationen zum Informationssicherheitsmanagement"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4525("GS-A_4525", "Audit-Unterstützung des Koordinators für Informationssicherheit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4526("GS-A_4526", "Aufbewahrungsvorgaben an die Nachweise zu den im Security Report gemachten Angaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4527("GS-A_4527", "Audit-Kennzahlen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4528("GS-A_4528", "Meldung von lokalen Sicherheitsvorfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4529("GS-A_4529", "Meldung von schwerwiegenden Sicherheitsvorfällen und notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4530("GS-A_4530", "Maßnahmen zur Behebung von schwerwiegenden Sicherheitsvorfällen und -notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4531("GS-A_4531", "Umgehende Umsetzung von Maßnahmen bei schwerwiegenden Sicherheitsvorfällen und -notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4532("GS-A_4532", "Kontrolle der Umsetzung von Maßnahmen in Folge eines schwerwiegenden Sicherheitsvorfalls oder -notfalls"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4533("GS-A_4533", "Berücksichtigung von Änderungen im Umfeld der Informationssicherheit und Ergebnissen des technischen Fortschritts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4534("GS-A_4534", "Berücksichtigung von Änderungen der Informationssicherheitsanforderungen der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4535("GS-A_4535", "Kontrolle der Umsetzung von Maßnahmen durch die gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4537("GS-A_4537", "Meldung von Informationssicherheitsrisiken"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4538("GS-A_4538", "Nutzen des Risikobewertungstemplate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4539("GS-A_4539", "Meldung von angepassten Risikoleveln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4540("GS-A_4540", "Risikoreporting"),

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
