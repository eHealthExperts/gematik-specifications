package de.ehex.foss.gematik.specifications;

import java.util.Set;

/**
 * API definition of a gematik specification.
 *
 * In detail, a specification is identified by its {@linkplain #getReference() reference label} and all of
 * {@link #getAFOs() its uniquely specified (resp. referenced) AFO}s.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public abstract interface Specification {

    // TODO: Support the specification's "Version" attribute.

    // TODO: Support the specification's "Revision" attribute.

    // TODO: Support the specification's "Stand" attribute.

    // TODO: Support the specification's "Status" attribute.

    // TODO: Support the specification's "Klassifizierung" attribute.

    /**
     * Returns the reference label of {@code this} specification.
     *
     * @return the reference label of {@code this} specification
     */
    public abstract String getReference();

    /**
     * Returns a {@linkplain Set set} of all {@link AFO}s specified (resp. referenced) by {@code this} specification.
     *
     * @return a set of all {@link AFO}s specified (resp. referenced) by {@code this} specification
     */
    public abstract Set<AFO> getAFOs();

}
