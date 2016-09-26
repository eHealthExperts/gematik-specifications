package de.ehex.foss.gematik.specifications;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; gematik {@link Errata}s.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum Erratas implements Errata {

    gemErrata_R1_4_6("gemErrata_R1.4.6", de.ehex.foss.gematik.specifications.gemErrata_R1_4_6.AFOs.class);

    /**
     * Returns the {@linkplain Errata Errata} according to the specified {@code base} {@link AFO} {@link Enum enum}
     * {@link Class class}.
     *
     * @param base
     *            the query {@code AFO} {@code enum} {@code class}
     * @param <A>
     *            the effectively wildcard {@link AFO} {@link Enum enum} type
     * @return the Errata according to the specified {@code base} {@code AFO} {@code enum} {@code class}
     * @throws NullPointerException
     *             if {@code base} is {@code null}
     * @throws IllegalArgumentException
     *             if {@code base} is neither assignable to {@link Enum} nor to {@link AFO}; or if there is no according
     *             Errata available
     */
    public static <A extends Enum<A> & AFO> Erratas valueOf(final Class<? extends A> base) throws NullPointerException, IllegalArgumentException {
        if (Enum.class.isAssignableFrom(base)) {
            throw new IllegalArgumentException("The given base class is not assignable to " + Enum.class);
        }
        if (AFO.class.isAssignableFrom(base)) {
            throw new IllegalArgumentException("The given base class is not assignable to " + AFO.class);
        }
        return Arrays.stream(Erratas.values()) //
                .filter(s -> s.base.equals(base)) //
                .findFirst() //
                .orElseThrow(() -> new IllegalArgumentException("No enum constant for base class " + base));
    }

    /**
     * Returns the {@linkplain Errata Errata} according to the specified {@link AFO afo}.
     *
     * @param afo
     *            the query {@code AFO}
     * @param <A>
     *            the effectively wildcard {@link AFO} {@link Enum enum} type
     * @return the Errata according to the specified {@code afo}
     * @throws NullPointerException
     *             if {@code afo} is {@code null}
     * @throws IllegalArgumentException
     *             if {@code afo} is neither assignable to {@link Enum} nor to {@link AFO}; or if there is no according
     *             Errata available
     */
    @SuppressWarnings("unchecked")
    public static <A extends Enum<A> & AFO> Erratas valueOf(final A afo) {
        return valueOf((Class<? extends A>) afo.getClass());
    }

    private <A extends Enum<A> & AFO> Erratas(final String reference, final Class<? extends A> base) {
        this.reference = reference;
        this.base = base;
    }

    private final String reference;

    @Override
    public String getReference() {
        return this.reference;
    }

    private final Class<? extends Enum<? extends AFO>> base;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public Set<AFO> getAFOs() {
        final Set set = EnumSet.allOf((Class) this.base);
        return set;
    }

    @Override
    public Set<AFO> getTestableAFOs() {
        return this.getAFOs();
    }

}
