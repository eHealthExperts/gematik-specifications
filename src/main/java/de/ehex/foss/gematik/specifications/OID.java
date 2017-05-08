package de.ehex.foss.gematik.specifications;

import static java.lang.String.format;

import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

/**
 * API definition of a gematik OID (OID = Object Identifier), mostly used in context of X.509 certificates and PKI. A
 * gematik OID wraps the real OID together with a document reference (readable identifier) and a target item
 * description.
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
public abstract interface OID {

    /**
     * Returns the document reference.
     *
     * @return (document) reference
     */
    public abstract String getRef();

    /**
     * Returns the target item description.
     *
     * @return target item description
     */
    public abstract String getItem();

    /**
     * Returns the OID {@link String} representation.
     *
     * @return OID {@link String} representation
     */
    public abstract String getOid();

    /**
     * Converts the OID {@link String} representation into an {@link Oid} instance.
     *
     * @return {@link Oid} instance
     * @throws IllegalStateException
     *             if the {@link String} representation is not convertable into an {@link Oid}.
     * @see #getOid()
     */
    public default Oid toOid() throws IllegalStateException {
        final String oidString = getOid();
        try {
            return new Oid(oidString);
        } catch (final GSSException e) {
            throw new IllegalArgumentException(format("Failed to convert [%s] into Oid instance", oidString));
        }
    }
}
