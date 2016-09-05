package de.ehex.foss.rfcs.rfc2119;

import static java.util.Objects.nonNull;

/**
 * Enumeration of all requirement levels‚ according to
 * <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>.
 *
 * @author Stefan Gasterst&auml;dt
 * @since August 17th, 2016
 */
public enum RequirementLevel {

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;1. this is the
     * {@code MUST} requirement level.
     */
    MUST("MUST", "This word, or the terms \"REQUIRED\" or \"SHALL\", mean that the definition is an absolute requirement of the specification."),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;1.
     * {@code REQUIRED} is a valid alias of the {@link #MUST} requirement level.
     */
    REQUIRED("REQUIRED", MUST),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;1. {@code SHALL}
     * is a valid alias of the {@link #MUST} requirement level.
     */
    SHALL("SHALL", MUST),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;2. this is the
     * {@code MUST NOT} requirement level.
     */
    MUST_NOT("MUST NOT", "This phrase, or the phrase \"SHALL NOT\", mean that the definition is an absolute prohibition of the specification."),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;2.
     * {@code SHALL NOT} is a valid alias of the {@link #MUST_NOT MUST NOT} requirement level.
     */
    SHALL_NOT("SHALL NOT", MUST_NOT),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;3. this is the
     * {@code SHOULD} requirement level.
     */
    SHOULD("SHOULD", "This word, or the adjective \"RECOMMENDED\", mean that there may exist valid reasons in particular circumstances to ignore a particular item, but the full implications must be understood and carefully weighed before choosing a different course."),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;3.
     * {@code RECOMMENDED} is a valid alias of the {@link #SHOULD} requirement level.
     */
    RECOMMENDED("RECOMMENDED", SHOULD),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;4. this is the
     * {@code SHOULD NOT} requirement level.
     */
    SHOULD_NOT("SHOULD NOT", "This phrase, or the phrase \"NOT RECOMMENDED\" mean that there may exist valid reasons in particular circumstances when the particular behavior is acceptable or even useful, but the full implications should be understood and the case carefully weighed before implementing any behavior described with this label."),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;4.
     * {@code NOT RECOMMENDED} is a valid alias of the {@link #SHOULD_NOT SHOULD NOT} requirement level.
     */
    NOT_RECOMMENDED("NOT RECOMMENDED", SHOULD_NOT),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;5. this is the
     * {@code MAY} requirement level.
     */
    MAY("MAY", "This word, or the adjective \"OPTIONAL\", mean that an item is truly optional. One vendor may choose to include the item because a particular marketplace requires it or because the vendor feels that it enhances the product while another vendor may omit the same item. An implementation which does not include a particular option MUST be prepared to interoperate with another implementation which does include the option, though perhaps with reduced functionality. In the same vein an implementation which does include a particular option MUST be prepared to interoperate with another implementation which does not include the option (except, of course, for the feature the option provides.)"),

    /**
     * According to <a href="https://www.ietf.org/rfc/rfc2119.txt">RFC&thinsp;2119</a>, Section&thinsp;5.
     * {@code OPTIONAL} is a valid alias of the {@link #MAY} requirement level.
     */
    OPTIONAL("OPTIONAL", MAY);

    private RequirementLevel(final String phrase, final String definition) {
        assert nonNull(phrase) : "There must be a non-null phrase!";
        assert !phrase.isEmpty() : "There must be a non-empty phrase!";
        assert nonNull(definition) : "There must be a non-null definition text!";
        assert !definition.isEmpty() : "There must be a non-empty definition text!";

        this.phrase = phrase;
        this.definition = definition;
        this.aliasOf = null;
    }

    private RequirementLevel(final String phrase, final RequirementLevel aliasOf) {
        assert nonNull(phrase) : "There must be a non-null phrase!";
        assert !phrase.isEmpty() : "There must be a non-empty phrase!";
        assert nonNull(aliasOf) : "There must be a non-null alias reference!";
        assert !phrase.equals(aliasOf.phrase) : "The phrase must differ from the alias' phrase!";

        this.phrase = phrase;
        this.definition = null;
        this.aliasOf = aliasOf;
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

    private final String definition;

    /**
     * Returns the definition text of this requirement level.
     *
     * @return the definition text of this requirement level
     */
    public final String getDefinition() {
        final RequirementLevel proper = this.getProperRequirementLevel();
        assert nonNull(proper) : "Class invariant violation!";
        assert nonNull(proper.definition) : "Class invariant violation!";
        return proper.definition;
    }

    private final RequirementLevel aliasOf;

    /**
     * Returns {@code true} if and only if {@code this} requirement level is an alias of another proper requirement
     * level.
     *
     * @return {@code true} iff {@code this} requirement level is an alias of another proper requirement level
     */
    public final boolean isAlias() {
        return nonNull(this.aliasOf);
    }

    /**
     * Returns the proper requirement level of {@code this} requirement level. For example, {@link #REQUIRED} and
     * {@link #SHALL} aliases {@link #MUST}.
     *
     * @return the proper requirement level of {@code this} requirement level
     */
    public final RequirementLevel getProperRequirementLevel() {
        return nonNull(this.aliasOf) ? this.aliasOf : this;
    }

}
