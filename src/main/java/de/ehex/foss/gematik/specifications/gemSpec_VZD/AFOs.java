package de.ehex.foss.gematik.specifications.gemSpec_VZD;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_VZD]}.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5546("TIP1-A_5546", "VZD, Integritäts- u. Authentizitätsschutz"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5547("TIP1-A_5547", "VZD, Löschen ungültiger Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5548("TIP1-A_5548", "VZD, Protokollierung der Änderungsoperationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5549("TIP1-A_5549", "VZD, Keine Leseprofilbildung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5550("TIP1-A_5550", "VZD, Keine Kopien von gelöschten Daten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5551("TIP1-A_5551", "VZD, Sicher gegen Datenverlust"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5552("TIP1-A_5552", "VZD, Begrenzung der Suchergebnisse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5553("TIP1-A_5553", "VZD, Private Schlüssel sicher speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5554("TIP1-A_5554", "VZD, Registrierungsdaten sicher speichern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5555("TIP1-A_5555", "VZD, SOAP-Fehlercodes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5556("TIP1-A_5556", "VZD, Fehler Logging"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5557("TIP1-A_5557", "VZD, Unterstützung IPv4 und IPv6"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5558("TIP1-A_5558", "VZD, Sicheres Speichern der TSL"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5560("TIP1-A_5560", "VZD, Erweiterbarkeit für neue Fachdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5561("TIP1-A_5561", "VZD, DNS-SD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5562("TIP1-A_5562", "VZD, Parallele Zugriffe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5563("TIP1-A_5563", "VZD, Erhöhung der Anzahl der Einträge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5564("TIP1-A_5564", "VZD, Festlegung der Schnittstellen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5565("TIP1-A_5565", "VZD, Schnittstelle I_Directory_Query"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5566("TIP1-A_5566", "LDAP Client, LDAPS"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5567("TIP1-A_5567", "VZD, LDAPS bei search_Directory"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5568("TIP1-A_5568", "VZD und LDAP Client, Implementierung der LDAPv3 search Operation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5569("TIP1-A_5569", "VZD, search_Directory, Suche nach definierten Attributen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5570("TIP1-A_5570", "LDAP Client, TUC_VZD_0001 'search_Directory'"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5571("TIP1-A_5571", "VZD, Schnittstelle I_Directory_Maintenance"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5572("TIP1-A_5572", "VZD, I_Directory_Maintenance, TLS-gesicherte Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5574("TIP1-A_5574", "VZD und Nutzer der Schnittstelle I_Directory_Maintenance, WebService"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5575("TIP1-A_5575", "VZD, Umsetzung add_Directory_Entry"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5577("TIP1-A_5577", "VZD, Umsetzung read_Directory_Entry"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5579("TIP1-A_5579", "VZD, Umsetzung modify_Directory_Entry"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5581("TIP1-A_5581", "VZD, Umsetzung delete_Directory_Entry"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5583("TIP1-A_5583", "VZD, Schnittstelle I_Directory_Application_Maintenance"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5584("TIP1-A_5584", "VZD, Änderung nur durch registrierte FAD"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5585("TIP1-A_5585", "VZD, I_Directory_Application_Maintenance, TLS-gesicherte Verbindung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5586("TIP1-A_5586", "VZD, I_Directory_Application_Maintenance, Webservice und LDAPv3"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5587("TIP1-A_5587", "VZD, Implementierung der LDAPv3 Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5590("TIP1-A_5590", "VZD, Umsetzung add_Directory_FA-Attributes (SOAP)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5591("TIP1-A_5591", "FAD, TUC_VZD_0006 “add_Directory_FA-Attributes (SOAP)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5593("TIP1-A_5593", "VZD, Umsetzung add_Directory_FA-Attributes (LDAPv3)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5594("TIP1-A_5594", "FAD, TUC_VZD_0007 “add_Directory_FA-Attributes (LDAPv3)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5595("TIP1-A_5595", "VZD, Umsetzung delete_Directory_FA-Attributes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5596("TIP1-A_5596", "FAD, TUC_VZD_0008 “delete_Directory_FA-Attributes (SOAP)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5597("TIP1-A_5597", "VZD, Umsetzung delete_Directory_FA-Attributes (LDAPv3)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5598("TIP1-A_5598", "FAD, TUC_VZD_0009 “delete_Directory_FA-Attributes (LDAPv3)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5599("TIP1-A_5599", "VZD, Umsetzung modify_Directory_FA-Attributes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5600("TIP1-A_5600", "FAD, TUC_VZD_0010 “modify_Directory_FA-Attributes (SOAP)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5602("TIP1-A_5602", "VZD, Umsetzung modify_Directory_FA-Attributes (LDAPv3)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5603("TIP1-A_5603", "FAD, TUC_VZD_0011 “modify_Directory_FA-Attributes (LDAPv3)”"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5604("TIP1-A_5604", "VZD, Registrierung FADs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5605("TIP1-A_5605", "VZD, De-Registrierung FADs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5606("TIP1-A_5606", "VZD, Mandat zur Löschung von Einträgen."),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5607("TIP1-A_5607", "VZD, logisches Datenmodell"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5608("TIP1-A_5608", "VZD, Ordnungskriterium Datenmodell Verzeichnisdienst"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5610("TIP1-A_5610", "VZD, Einwilligung muss vorliegen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5611("TIP1-A_5611", "VZD, Widerspruch der Einwilligung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5612("TIP1-A_5612", "VZD, Mandatsregistrierung für FAD zur Administration von Basisdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5613("TIP1-A_5613", "VZD, Mandatsderegistrierung für FAD zur Administration von Basisdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5620("TIP1-A_5620", "VZD, Nicht-Speicherung von Leading und Trailing Spaces"),

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
