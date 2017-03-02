package de.ehex.foss.gematik.specifications.gemSpec_OM;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_OM;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Enumeration of all error types (see Tab.6: Tab_Severity_Codes – Severity Codes, Übergreifende Spezifikation
 * Operations und Maintenance [gemSpec_OM], version 1.7.0, released Aug. 24th 2016)
 *
 * @author Stefan Gasterst&auml;dt, Sascha Zak
 * @since February 9th, 2017
 */
@SPEC(value = gemSpec_OM, note = "Tab.6: Tab_Severity_Codes – Severity Codes")
public enum Severity {

    @SPEC(value = gemSpec_OM, note = "Tab.6: Tab_Severity_Codes – Severity Codes")
    DEBUG("Debug", "Verwendung im Debug-Protokoll und zur internen Verwendung in der Fehlerbehandlung"),

    @SPEC(value = gemSpec_OM, note = "Tab.6: Tab_Severity_Codes – Severity Codes")
    INFO("Info", "Verwendung im Ablaufprotokoll und zur internen Verwendung in der Fehlerbehandlung"),

    @SPEC(value = gemSpec_OM, note = "Tab.6: Tab_Severity_Codes – Severity Codes")
    WARNING("Warning", "Nicht OK, weicht von der Norm ab. Verletzung eines definierten Schwellwertes."),

    @SPEC(value = gemSpec_OM, note = "Tab.6: Tab_Severity_Codes – Severity Codes")
    ERROR("Error", "Fehler, Abbruch der Verarbeitung."),

    @SPEC(value = gemSpec_OM, note = "Tab.6: Tab_Severity_Codes – Severity Codes")
    FATAL("Fatal", "Kritischer Fehler, Abbruch der Verarbeitung."),

    ;

    private final String code;

    private final String description;

    private Severity(final String code, final String description) {
        this.code = code;
        this.description = description;
    }

    public String code() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.code;
    }

}
