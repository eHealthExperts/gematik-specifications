package de.ehex.foss.gematik.specifications.gemSpec_OM;

/**
 * Enumeration of all error types (see Tab.5: "Tab_ErrorType – Definition ErrorType", "Übergreifende Spezifikation
 * Operations und Maintenance" [gemSpec_OM], version 1.7.0, released Aug. 24th 2016)
 *
 * @author Stefan Gasterst&auml;dt, Sascha Zak
 * @since February 9th, 2017
 */
public enum ErrorType {

    SECURITY("Security", //
             "Sicherheitsrelevanter Fehler", //
             "Verletzung eines definierten Sicherheits-Schwellwertes."),

    TECHNICAL("Technical", //
              "Technischer Fehler", //
              "Ereignis, das vornehmlich technisch orientierte Fehlerbehandlungen erfordert."),

    BUSINESS("Business", //
             "Fachlicher Fehler", //
             "Ereignis, das vornehmlich fachlich orientierte Fehlerbehandlungen erfordert."),

    INFRASTRUCTURE("Infrastructure", //
                   "Infrastruktur Fehler", //
                   "Ereignis, das eine Fehlerbehandlung in den zentralen Produkttypen der TI-Plattform und fachanwendungsspezifischen Diensten erfordert (Verwendung ausschließlich im Konnektor)."),

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
