package de.ehex.foss.gematik.specifications.gemSpec_DSM;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_DSM]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4435("GS-A_4435", "kDSM: Dokumentation des DSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4436("GS-A_4436", "kDSM: Bereitstellung der Dokumentation des DSM bei Audits"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4437("GS-A_4437", "kDSM: Jährliche Prüfung der Dokumentation des DSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4448("GS-A_4448", "kDSM: Übermittlung von Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4449("GS-A_4449", "kDSM: Monatliche Reports in der Erprobung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4450("GS-A_4450", "kDSM: Erfassungszeitraum monatlicher Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4451("GS-A_4451", "kDSM: Kein Personenbezug in Kennzahlen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4453("GS-A_4453", "kDSM: Sicherstellung der Kennzahl-Meldung in Unterbeauftragungsverhältnissen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4455("GS-A_4455", "kDSM: Anpassung der Reports bei geänderten Kennzahlen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4456("GS-A_4456", "kDSM: Dateiformat des Kennzahlen-Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4457("GS-A_4457", "kDSM: Anpassung an geändertes CSV-Format"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4458("GS-A_4458", "kDSM: Identifizierung der Ursachen von auffälligen Kennzahlenwerten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4459("GS-A_4459", "kDSM: Meldung der Anzahl der Datenschutzbeschwerden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4460("GS-A_4460", "kDSM: Meldung der Anzahl der Datenschutzanfragen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4461("GS-A_4461", "kDSM: Meldung der fehlerhaft adressierten Datenschutzanfragen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4462("GS-A_4462", "kDSM: Durchschnittliche Bearbeitungszeit für Datenschutzanfragen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4463("GS-A_4463", "kDSM: Meldung der Anzahl gravierender Datenschutzvorfälle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4464("GS-A_4464", "kDSM: Meldung der Datenschutzschulungstage"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4465("GS-A_4465", "kDSM: Meldung des Anteils der Verfahren im internen Verfahrensverzeichnis"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4466("GS-A_4466", "kDSM: Meldung der Anzahl externer und interner Datenschutz-Audits"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4467("GS-A_4467", "kDSM: Selbsteinschätzung zum Datenschutz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4468("GS-A_4468", "kDSM: Jährlicher Datenschutzreport der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4470("GS-A_4470", "kDSM: Informationen zu Kennzahlen im Datenschutzreport der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4471("GS-A_4471", "kDSM: Auftragsdatenverarbeitung im Datenschutzreport der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4472("GS-A_4472", "kDSM: Allgemeiner Datenschutzbericht"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4473("GS-A_4473", "kDSM: Unverzügliche Benachrichtigung bei Verstößen gemäß § 42a BDSG bzw. § 83a SGB X"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4474("GS-A_4474", "kDSM: Nutzung des Incident Managements der gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4475("GS-A_4475", "kDSM: Stellungnahme bei gravierenden Datenschutzverstößen gemäß § 42a BDSG bzw. § 83a SGB X"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4476("GS-A_4476", "kDSM: Maßnahmen zur Behebung gravierender Datenschutzverstöße"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4477("GS-A_4477", "kDSM: Umgehende Umsetzung von Maßnahmen bei gravierenden Datenschutzverstößen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4478("GS-A_4478", "kDSM: Kontrolle der Umsetzung von Maßnahmen in Folge eines gravierenden Datenschutzverstoßes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4479("GS-A_4479", "kDSM: Meldung von Kontaktinformationen zum Datenschutzmanagement"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4480("GS-A_4480", "kDSM: Berücksichtigung von Änderungen im Datenschutzrecht und Ergebnissen des technischen Fortschritts"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4481("GS-A_4481", "kDSM: Berücksichtigung von Änderungen der Datenschutzanforderungen der TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4482("GS-A_4482", "kDSM: Kontrolle der Umsetzung von Maßnahmen durch die gematik"),

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
