package de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM;

import static de.ehex.foss.gematik.specifications.AFOType.MAY;
import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static de.ehex.foss.gematik.specifications.AFOType.SHOULD;
import static de.ehex.foss.gematik.specifications.AFOType.SHOULD_NOT;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_SST_FD_VSDM]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    VSDM_A_2280("VSDM-A_2280", "Fachdienst UFS: GetUpdateFlags gemäß UFS.wsdl implementieren."),

    VSDM_A_2281("VSDM-A_2281", "Fachdienst UFS: Aktualisierungsauftrag eindeutig identifizierbar"),

    VSDM_A_2283("VSDM-A_2283", "Fachdienst UFS: fehlgeleitete Nachrichten abweisen"),

    VSDM_A_2286("VSDM-A_2286", "Fachdienst UFS: optionale UpdateFlags nicht senden", SHOULD_NOT),

    VSDM_A_2287("VSDM-A_2287", "Fachdienst UFS: Prüfziffer übermitteln"),

    VSDM_A_2288("VSDM-A_2288", "Fachdienst UFS: Lokalisierungsinformation bilden"),

    VSDM_A_2290("VSDM-A_2290", "Fachdienst UFS: IIN der ICCSN unbekannt"),

    VSDM_A_2291("VSDM-A_2291", "Fachdienst UFS: ICCSN unbekannt"),

    VSDM_A_2292("VSDM-A_2292", "Fachdienst UFS: nicht spezifizierter Fehler"),

    VSDM_A_2293("VSDM-A_2293", "Fachdienst UFS: schema-invalide Requests", MAY),

    VSDM_A_2294("VSDM-A_2294", "Fachdienst VSDD: PerformUpdates und GetNextCommandPackage gemäß der Syntax der CCS.wsdl implementieren"),

    VSDM_A_2295("VSDM-A_2295", "Fachdienst CMS: PerformUpdates und GetNextCommandPackage gemäß der Syntax der CCS.wsdl implementieren"),

    VSDM_A_2297("VSDM-A_2297", "CCS-Schnittstelle: Sessioninformation bilden"),

    VSDM_A_2302("VSDM-A_2302", "CCS-Schnittstelle: Trusted Channel aufbauen"),

    VSDM_A_2305("VSDM-A_2305", "CCS-Schnittstelle: fehlgeleitete Nachrichten abweisen"),

    VSDM_A_2314("VSDM-A_2314", "CCS-Schnittstelle: AdditionalInfo tolerieren", SHOULD),

    VSDM_A_2315("VSDM-A_2315", "CCS-Schnittstelle: UpdatePerformed nutzen"),

    VSDM_A_2316("VSDM-A_2316", "CCS-Schnittstelle: CommandPackage nutzen"),

    VSDM_A_2317("VSDM-A_2317", "CCS-Schnittstelle: Close nutzen"),

    VSDM_A_2322("VSDM-A_2322", "CCS-Schnittstelle: Nachrichten mit abgelaufener Session abweisen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2323("VSDM-A_2323", "CCS-Schnittstelle: Aktualisierung in falscher Reihenfolge abweisen"),

    VSDM_A_2324("VSDM-A_2324", "CCS-Schnittstelle: falsche Kombination ICCSN und Update-Identifier abweisen"),

    VSDM_A_2325("VSDM-A_2325", "CCS-Schnittstelle: nicht spezifizierter Fehler"),

    VSDM_A_2326("VSDM-A_2326", "CCS-Schnittstelle: Trusted Channel nicht aufgebaut"),

    VSDM_A_2327("VSDM-A_2327", "CCS-Schnittstelle: eGK defekt"),

    VSDM_A_2328("VSDM-A_2328", "CCS-Schnittstelle: ComponentType \"CCS\" verwenden"),

    VSDM_A_2329("VSDM-A_2329", "Fachdienst UFS: ComponentType \"UFS\" verwenden"),

    VSDM_A_2331("VSDM-A_2331", "CCS-Schnittstelle: Detail-Element mit Update-Identifier"),

    VSDM_A_2332("VSDM-A_2332", "CCS-Schnittstelle: Fehler mit weitereren Command-Packages beheben", SHOULD),

    VSDM_A_2333("VSDM-A_2333", "CCS-Schnittstelle: schmema-invaliden Anfragenachrichten", MAY),

    VSDM_A_2334("VSDM-A_2334", "CCS-Schnittstelle: Sessioninformation bilden"),

    VSDM_A_2339("VSDM-A_2339", "CCS-Schnittstelle: LastIfOk nutzen", SHOULD),

    VSDM_A_2341("VSDM-A_2341", "Fachdienst VSDD: Prüfziffer übermitteln"),

    VSDM_A_2342("VSDM-A_2342", "Fachdienst CMS: Prüfziffer nicht übermitteln", SHOULD),

    VSDM_A_2546("VSDM-A_2546", "Fachdienst VSDD: Aktualisierung aller VSD-Container bei Änderung der Schemaversion"),

    VSDM_A_2751("VSDM-A_2751", "Fachdienst UFS: Aktualisierungsaufträge zusammenführen", SHOULD),

    VSDM_A_2961("VSDM-A_2961", "Fachdienst VSDD: Transaktionsstatus setzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    VSDM_A_2999("VSDM-A_2999", "Fachdienst VSDD CMS: Logging von Fehlerzuständen"),

    VSDM_A_3009("VSDM-A_3009", "CCS-Schnittstelle: Reaktion auf Abort-Element - CLOSE Element"),

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
