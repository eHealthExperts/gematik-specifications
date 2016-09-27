package de.ehex.foss.gematik.specifications;

import java.util.Set;

/**
 * API definition of a test scope.
 *
 * In detail, it provides a non-empty, unmodifiable {@linkplain Set set} of various AFOs all to be used in conjunction
 * with a specific test scope.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public abstract interface TestScope {

    /**
     * Returns a non-empty, unmodifiable {@linkplain Set set} of all {@link AFO}s to be tested (for whatever reason).
     *
     * @implSpec Any specific implementation must ensure the returned set is unmodifiable! For example, one can easily
     *           make use of {@link java.util.Collections#unmodifiableSet(Set)}. Further, it is illegal to return either
     *           {@code null} or an empty set.
     *
     * @return a non-empty, unmodifiable set of all AFOs to be tested
     */
    public abstract Set<? extends AFO> getTestableAFOs();

}
