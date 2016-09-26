package de.ehex.foss.gematik.specifications;

import java.util.Set;

/**
 * API definition of a specific gematik specification that, in addition to {@link #getAFOs() its uniquely specified
 * (resp. referenced) AFO}s provides a {@link #getTestableAFOs() (sub-) set of all AFOs to be tested} by manufacturers
 * on its own responsibility.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public abstract interface TestableSpecification extends Specification {

    /**
     * Returns a {@linkplain Set set} of all {@link AFO}s to be tested by manufacturers on its own responsibility.
     *
     * <em>Any implementation must ensure the sub-set relation of this method's result in relation to {@link #getAFOs()}.</em>
     *
     * @return of all AFOs to be tested by manufacturers on its own responsibility
     */
    public abstract Set<AFO> getTestableAFOs();

}
