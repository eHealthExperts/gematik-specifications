package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

/**
 * Defines an access profile enumerating a set of rights to access smartcard data or functions.
 *
 * @author Sascha Zak
 *
 */
public abstract interface AccessProfile {

    /**
     * Returns the access profile number.
     *
     * @return access profile number
     */
    public abstract byte getProfile();
}
