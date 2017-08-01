package de.ehex.foss.gematik.specifications.gemSpec_OM;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_OM;

import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Enumeration of all error types (see Tab.5: Tab_ErrorType – Definition ErrorType, Übergreifende Spezifikation
 * Operations und Maintenance [gemSpec_OM], version 1.7.0, released Aug. 24th 2016)
 *
 * @author Stefan Gasterst&auml;dt, Sascha Zak
 * @since February 9th, 2017
 */
@SPEC(value = gemSpec_OM, note = "Tab.5: Tab_ErrorType – Definition ErrorType")
public enum ErrorType {

    @SPEC(value = gemSpec_OM, note = "Tab.5: Tab_ErrorType – Definition ErrorType")
    SECURITY("Security", //
            "Sicherheitsrelevanter Fehler", //
            "Verletzung eines definierten Sicherheits-Schwellwertes."),

    @SPEC(value = gemSpec_OM, note = "Tab.5: Tab_ErrorType – Definition ErrorType")
    TECHNICAL("Technical", //
            "Technischer Fehler", //
            "Ereignis, das vornehmlich technisch orientierte Fehlerbehandlungen erfordert."),

    @SPEC(value = gemSpec_OM, note = "Tab.5: Tab_ErrorType – Definition ErrorType")
    BUSINESS("Business", //
            "Fachlicher Fehler", //
            "Ereignis, das vornehmlich fachlich orientierte Fehlerbehandlungen erfordert."),

    @SPEC(value = gemSpec_OM, note = "Tab.5: Tab_ErrorType – Definition ErrorType")
    INFRASTRUCTURE("Infrastructure", //
            "Infrastruktur Fehler", //
            "Ereignis, das eine Fehlerbehandlung in den zentralen Produkttypen der TI-Plattform und fachanwendungsspezifischen Diensten erfordert (Verwendung ausschließlich im Konnektor)."),

    @SPEC(value = gemSpec_OM, note = "Tab.5: Tab_ErrorType – Definition ErrorType")
    OTHER("Other", //
            "anderer Fehler", //
            "Keine eindeutige Zuordnung zu bestimmten Error-Typen möglich."),

    ;

    private final String code;

    private final String meaning;

    private final String description;

    private ErrorType(final String code, final String meaning, final String description) {
        this.code = code;
        this.meaning = meaning;
        this.description = description;
    }

    public String code() {
        return this.code;
    }

    public String getMeaning() {
        return this.meaning;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.code;
    }

}
