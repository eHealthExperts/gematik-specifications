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

    MUST("MUSS", RequirementLevel.MUST),

    MUST_NOT("DARF NICHT", RequirementLevel.MUST_NOT),

    SHOULD("SOLL", RequirementLevel.SHOULD),

    SHOULD_NOT("SOLL NICHT", RequirementLevel.SHOULD_NOT),

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
