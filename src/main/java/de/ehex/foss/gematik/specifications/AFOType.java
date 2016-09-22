package de.ehex.foss.gematik.specifications;

import static java.util.Objects.nonNull;

import de.ehex.foss.rfcs.rfc2119.RequirementLevel;

/**
 * Enumerates all types of AFOs as specified by the gematik (each including a reference to the according
 * {@linkplain RequirementLevel RFC&thinsp;2119 requirement level}).
 *
 * Note, <strong>the {@link #phrase}</strong> of each level (as returned by {@link #toString()}) <strong>is a german
 * keyword</strong> according to the chapter <em>&quot;1.5 Methodik&quot;</em> within most of the gematik's
 * specifications.
 *
 * In detail, these five phrases are: <em>{@link #MUST MUSS}</em>, <em>{@link #MUST_NOT DARF NICHT}</em>,
 * <em>{@link #SHOULD SOLL}</em>, <em>{@link #SHOULD_NOT SOLL NICHT}</em>, <em>{@link #MAY KANN}</em>.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 9th, 2016
 */
public enum AFOType {

    /**
     * A <em>MUSS</em> (engl. must) {@link AFO} specifies a requirement that must be supported by any specification
     * compliant products.
     */
    MUST("MUSS", RequirementLevel.MUST),

    /**
     * A <em>DARF NICHT</em> (engl. must not) {@link AFO} specifies a prohibition that must be complied by any
     * specification compliant products.
     */
    MUST_NOT("DARF NICHT", RequirementLevel.MUST_NOT),

    /**
     * A <em>SOLL</em> (engl. should) {@link AFO} specifies a requirement that should be supported by any specification
     * compliant products. If not supported, there must be an acceptable reason.
     */
    SHOULD("SOLL", RequirementLevel.SHOULD),

    /**
     * A <em>SOLL NICHT</em> (engl. should not) {@link AFO} specifies a prohibition that should be complied by any
     * specification compliant products. If not complied, there must be an acceptable reason.
     */
    SHOULD_NOT("SOLL NICHT", RequirementLevel.SHOULD_NOT),

    /**
     * A <em>KANN</em> (engl. may) {@link AFO} specifies a requirement that may or may not be supported by any
     * specification compliant products.
     */
    MAY("KANN", RequirementLevel.MAY);

    private AFOType(final String phrase, final RequirementLevel level) {
        assert nonNull(phrase) : "There must be a non-null phrase!";
        assert !phrase.isEmpty() : "There must be a non-empty phrase!";
        assert nonNull(level) : "There must be a non-null requirement level!";
        assert !level.isAlias() : "There must be a non-aliasing requirement level!";

        this.phrase = phrase;
        this.level = level;
    }

    private final String phrase;

    /**
     * Returns the {@linkplain #phrase} of {@code this} requirement level.
     *
     * @return the phrase of {@code this} requirement level
     */
    @Override
    public final String toString() {
        assert nonNull(this.phrase) : "Class invariant violation!";
        return this.phrase;
    }

    private final RequirementLevel level;

    /**
     * Returns the RFC&thinsp;2119 requirement level according to {@code this} gematik AFO type.
     *
     * @return the RFC&thinsp;2119 requirement level according to {@code this} gematik AFO type
     */
    public final RequirementLevel getLevel() {
        return this.level;
    }

}
