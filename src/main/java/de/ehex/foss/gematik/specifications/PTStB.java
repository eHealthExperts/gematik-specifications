package de.ehex.foss.gematik.specifications;

import java.util.Set;

/**
 * API definition of a gematik <em>Produtktypsteckbrief</em> (abbr. PTStB, engl. product type characteristics).
 *
 * In detail, a PTStB is a special specification because it does not originally specify some {@link AFO}s but references
 * all relevant ones.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public abstract interface PTStB extends TestableSpecification {

    /**
     * Returns the reference label of {@code this} PTStB.
     *
     * Usually, this field can be derive from the cover of the gematik PTStB (most probably identified by
     * <em>Referenzierung</em>).
     *
     * @return the reference label of {@code this} PTStB
     */
    @Override /* to update the javadoc */
    public abstract String getReference();

    /**
     * Returns a {@linkplain Set set} of all {@link AFO}s referenced by {@code this} PTStB.
     *
     * @return a set of all AFOs referenced by {@code this} PTStB
     */
    @Override /* to update the javadoc */
    public abstract Set<AFO> getAFOs();

    /**
     * Returns a {@linkplain Set set} of all {@link AFO}s referenced by {@code this} PTStB that have to be tested by
     * manufacturers on its own responsibility.
     *
     * <em>Any implementation must ensure the sub-set relation of this method's result in relation to {@link #getAFOs()}.</em>
     */
    @Override /* to update the javadoc */
    public abstract Set<AFO> getTestableAFOs();

}
