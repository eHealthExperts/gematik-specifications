package de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_SST_VSDM;

import de.ehex.foss.gematik.specifications.gemSpec_OM.ErrorType;
import de.ehex.foss.gematik.specifications.gemSpec_OM.Severity;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of common error codes (see Tab.13: Tab_SST_VSDM_11 – Übergreifende Fehlercodes,
 * Schnittstellenspezifikation Transport VSDM [gemSpec_SST_VSDM], version 1.9.0, released Oct. 28th 2016)
 *
 * @author Stefan Gasterst&auml;dt
 * @since February 10th, 2017
 */
@SPEC(value = gemSpec_SST_VSDM, note = "Tab.13: Tab_SST_VSDM_11 – Übergreifende Fehlercodes")
public abstract interface VSDM_FD_Fault {

    public abstract int getCode();

    public abstract String getErrorText();

    public abstract ErrorType getErrorType();

    public abstract Severity getSeverity();

    public abstract boolean isDetailAllowed();

}
