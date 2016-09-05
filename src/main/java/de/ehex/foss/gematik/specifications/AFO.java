package de.ehex.foss.gematik.specifications;

import static java.util.Objects.requireNonNull;

/**
 * API definition of a gematik requirement (ger. Anforderung = AFO).
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 9th, 2016
 */
public abstract interface AFO extends Comparable<AFO> {

    /**
     * Returns the ID of {@code this} AFO.
     *
     * @return the ID of {@code this} AFO
     */
    public abstract String getAfoId();

    /**
     * {@inheritDoc}
     *
     * <p>
     * The {@code default} implementation compares any AFOs by its {@link #getAfoId() ID}.
     *
     * In result, equal IDs implies equal AFOs. Thus, these AFOs must provide an equal {@linkplain #getLabel() label}
     * and an equal {@linkplain #getType() AFO type}, all based on the according specification of the gematik.
     * </p>
     */
    @Override
    public default int compareTo(final AFO afo) {
        requireNonNull(afo);
        return this.getAfoId().compareTo(afo.getAfoId());
    }

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
