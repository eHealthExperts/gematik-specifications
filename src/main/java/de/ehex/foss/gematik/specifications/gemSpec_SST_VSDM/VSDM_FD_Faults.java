package de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_SST_VSDM;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.ErrorType.SECURITY;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.ErrorType.TECHNICAL;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.Severity.FATAL;
import de.ehex.foss.gematik.specifications.gemSpec_OM.ErrorType;
import de.ehex.foss.gematik.specifications.gemSpec_OM.Severity;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Enumeration of all common error code (see Tab.13: Tab_SST_VSDM_11 – Übergreifende Fehlercodes,
 * Schnittstellenspezifikation Transport VSDM [gemSpec_SST_VSDM], version 1.9.0, released Oct. 28th 2016)
 *
 * @author Stefan Gasterst&auml;dt
 * @since February 10th, 2017
 */
@SPEC(value = gemSpec_SST_VSDM, note = "Tab.13: Tab_SST_VSDM_11 – Übergreifende Fehlercodes")
public enum VSDM_FD_Faults
implements VSDM_FD_Fault {

    /**
     * <dl>
     * <dt>Code:</dt>
     * <dd>500</dd>
     * <dt>ErrorType:</dt>
     * <dd>Technical</dd>
     * <dt>Severity:</dt>
     * <dd>Fatal</dd>
     * <dt>ErrorText:</dt>
     * <dd>Internal Server Error</dd>
     * <dt>Befüllung Detail:</dt>
     * <dd>Darf nicht vorhanden sein.</dd>
     * <dt>Auslösende Bedingung:</dt>
     * <dd>Der Server ist in einen unerwarteten Zustand geraten, der die weitere Verarbeitung der Nachricht
     * verhindert.</dd>
     * <dl>
     */
    @SPEC(value = gemSpec_SST_VSDM, note = "Tab.13: Tab_SST_VSDM_11 – Übergreifende Fehlercodes")
    INTERNAL_SERVER_ERROR(500, TECHNICAL, FATAL, "Internal Server Error", false),

    /**
     * <dl>
     * <dt>Code:</dt>
     * <dd>1011</dd>
     * <dt>ErrorType:</dt>
     * <dd>Technical</dd>
     * <dt>Severity:</dt>
     * <dd>Fatal</dd>
     * <dt>ErrorText:</dt>
     * <dd>Die aufgerufene Komponente ist temporär nicht verfügbar.</dd>
     * <dt>Befüllung Detail:</dt>
     * <dd>Soll Informationen enthalten, welche Komponente nicht verfügbar ist, aus welchem Grund die Komponente nicht
     * verfügbar ist und ob ein erneuter Versuch der Übertragung sinnvoll ist.</dd>
     * <dt>Auslösende Bedingung:</dt>
     * <dd>Bei der Verarbeitung einer Nachricht wurde festgestellt, dass für die Verarbeitung dieser Nachricht eine
     * benötigte Komponente nicht verfügbar ist.
     *
     * Unter Komponenten werden in diesem Zusammenhang interne Systeme z.B. Datenbanken, HSM, usw. verstanden.</dd>
     * <dl>
     */
    @SPEC(value = gemSpec_SST_VSDM, note = "Tab.13: Tab_SST_VSDM_11 – Übergreifende Fehlercodes")
    UNAVAILABLE(1011, TECHNICAL, FATAL, "Die aufgerufene Komponente ist temporär nicht verfügbar."),

    /**
     * <dl>
     * <dt>Code:</dt>
     * <dd>1006</dd>
     * <dt>ErrorType:</dt>
     * <dd>Security</dd>
     * <dt>Severity:</dt>
     * <dd>Fatal</dd>
     * <dt>ErrorText:</dt>
     * <dd>Nachricht zurückgewiesen. Die Nachricht wurde an einen für diese Anfrage nicht zuständigen Fachdienst
     * weitergeleitet.</dd>
     * <dt>Befüllung Detail:</dt>
     * <dd>Welcher der Lokalisierungsparameter war ungültig und welcher Wert wurde stattdessen erwartet.</dd>
     * <dt>Auslösende Bedingung:</dt>
     * <dd>Die Überprüfung der Lokalisierungsinformationen innerhalb eines Fachdienstes führt zu dem Ergebnis, dass die
     * Nachricht an den falschen Empfänger (Fachdienst) gesendet wurde.</dd>
     * <dl>
     */
    @SPEC(value = gemSpec_SST_VSDM, note = "Tab.13: Tab_SST_VSDM_11 – Übergreifende Fehlercodes")
    LOCALIZATION_INVALID(1006, SECURITY, FATAL, "Nachricht zurückgewiesen. Die Nachricht wurde an einen für diese Anfrage nicht zuständigen Fachdienst weitergeleitet."),

    /**
     * <dl>
     * <dt>Code:</dt>
     * <dd>1014</dd>
     * <dt>ErrorType:</dt>
     * <dd>Technical</dd>
     * <dt>Severity:</dt>
     * <dd>Fatal</dd>
     * <dt>ErrorText:</dt>
     * <dd>Die zu dieser ConversationID zugehörige Fachdienst-Session ist abgelaufen.</dd>
     * <dt>Befüllung Detail:</dt>
     * <dd>Darf nicht vorhanden sein.</dd>
     * <dt>Auslösende Bedingung:</dt>
     * <dd>Für die in der Nachricht angegebene ConversationID konnte keine zugehörige Session ermittelt werden bzw. die
     * Session ist abgelaufen.
     *
     * Dieser Fehlercode soll verwendet werden, wenn der Fehlerfall bei der Überprüfung auf Nachrichtenebene auffällt.
     * Alternativ kann der Fehlercode 5 verwendet werden.</dd>
     * <dl>
     */
    @SPEC(value = gemSpec_SST_VSDM, note = "Tab.13: Tab_SST_VSDM_11 – Übergreifende Fehlercodes")
    CONVERSATION_TIMEOUT_1014(1014, TECHNICAL, FATAL, "Die zu dieser ConversationID zugehörige Fachdienst-Session ist abgelaufen.", false),

    /**
     * <dl>
     * <dt>Code:</dt>
     * <dd>5</dd>
     * <dt>ErrorType:</dt>
     * <dd>Technical</dd>
     * <dt>Severity:</dt>
     * <dd>Fatal</dd>
     * <dt>ErrorText:</dt>
     * <dd>Die zu dieser ConversationID zugehörige Fachdienst-Session ist abgelaufen.</dd>
     * <dt>Befüllung Detail:</dt>
     * <dd>Darf nicht vorhanden sein.</dd>
     * <dt>Auslösende Bedingung:</dt>
     * <dd>Für die in der Nachricht angegebene ConversationID konnte keine zugehörige Session ermittelt werden bzw. die
     * Session ist abgelaufen.
     *
     * Dieser Fehlercode soll verwendet werden, wenn der Fehlerfall bei der Überprüfung auf Nachrichtenebene auffällt.
     * Alternativ kann der Fehlercode 01014 verwendet werden.</dd>
     * <dl>
     */
    @SPEC(value = gemSpec_SST_VSDM, note = "Tab.13: Tab_SST_VSDM_11 – Übergreifende Fehlercodes")
    CONVERSATION_TIMEOUT_5(5, TECHNICAL, FATAL, "Die zu dieser ConversationID zugehörige Fachdienst-Session ist abgelaufen.", false),

    ;

    private VSDM_FD_Faults(final int code, final ErrorType errorType, final Severity severity, final String errorText) {
        this(code, errorType, severity, errorText, true);
    }

    private VSDM_FD_Faults(final int code, final ErrorType errorType, final Severity severity, final String errorText, final boolean detailAllowed) {
        this.code = code;
        this.errorType = errorType;
        this.severity = severity;
        this.errorText = errorText;
        this.detailAllowed = detailAllowed;
    }

    private final int code;

    @Override
    public int getCode() {
        return this.code;
    }

    private final ErrorType errorType;

    @Override
    public ErrorType getErrorType() {
        return this.errorType;
    }

    private final Severity severity;

    @Override
    public Severity getSeverity() {
        return this.severity;
    }

    private final String errorText;

    @Override
    public String getErrorText() {
        return this.errorText;
    }

    private final boolean detailAllowed;

    @Override
    public boolean isDetailAllowed() {
        return this.detailAllowed;
    }

}
