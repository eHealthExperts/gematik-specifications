package de.ehex.foss.gematik.specifications;

import java.util.Set;

/**
 * API definition of a gematik <em>Errata</em>.
 *
 * In detail, an Errata is a special specification because it does not originally specify some {@link AFO}s but
 * references all relevant ones.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public abstract interface Errata extends TestableSpecification {

    /**
     * Returns the reference label of {@code this} Errata.
     *
     * Usually, this field can be derive from the cover of the gematik Errata (most probably identified by
     * <em>Referenzierung</em>).
     *
     * @return the reference label of {@code this} Errata
     */
    @Override /* to update the javadoc */
    public abstract String getReference();

    /**
     * Returns a {@linkplain Set set} of all {@link AFO}s referenced by {@code this} Errata.
     *
     * @return a set of all AFOs referenced by {@code this} Errata
     */
    @Override /* to update the javadoc */
    public abstract Set<AFO> getAFOs();

    /**
     * Returns a {@linkplain Set set} of all {@link AFO}s referenced by {@code this} Errata that have to be tested by
     * manufacturers on its own responsibility.
     *
     * <em>Any implementation must ensure the sub-set relation of this method's result in relation to {@link #getAFOs()}.</em>
     */
    @Override /* to update the javadoc */
    public abstract Set<AFO> getTestableAFOs();

}
