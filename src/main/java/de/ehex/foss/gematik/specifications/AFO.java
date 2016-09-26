package de.ehex.foss.gematik.specifications;

import java.util.Comparator;

/**
 * API definition of a gematik AFO (AFO = Anforderung, engl. Requirement).
 *
 * <em>Any AFO implementation must ensure immutable instances.</em>
 *
 * @apiNote Although AFOs can be ordered by its {@link #getAfoId()}, this interface does not extend {@link Comparable}.
 *          Otherwise, the specific AFO enumerations (e.g. {@link de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs})
 *          cannot be defined as {@code enum} types (because {@link Enum} already extends {@link Comparable}). In
 *          result, this interface provides an according separate {@link Comparator} to be used when sorting/comparing
 *          AFOs: {@link #AFO_COMPARATOR}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 9th, 2016
 */
public abstract interface AFO {

    /**
     * Returns the ID of {@code this} AFO.
     *
     * @return the ID of {@code this} AFO
     */
    public abstract String getAfoId();

    /**
     * This {@link Comparator} compares two given AFO instances by its {@linkplain #getAfoId() id}
     * {@linkplain String#compareTo(String) lexicographically}.
     */
    public static final Comparator<? super AFO> AFO_COMPARATOR = (x, y) -> x.getAfoId().compareTo(y.getAfoId());

    /**
     * Returns the label of {@code this} AFO.
     *
     * @return the label of {@code this} AFO
     */
    public abstract String getLabel();

    /**
     * Returns the requirement type of {@code this} AFO.
     *
     * @return the requirement type of {@code this} AFO
     */
    public abstract AFOType getType();

}
