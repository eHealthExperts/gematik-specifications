package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;
import static java.util.Arrays.stream;
import static java.util.Optional.ofNullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.ietf.jgss.Oid;

import de.ehex.foss.gematik.specifications.OID;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of public key object identifier (OID) mostly used in G2 CV certificates (see Tab.61: Tab_PKI_901
 * Objektidentifier des öffentlichen Schlüssels eines CV-Zertifikats der Generation 2, Übergreifende Spezifikation PKI
 * [gemSpec_PKI], version 1.12.0, released Apr. 21st 2017)
 *
 * @author Sascha Zak
 * @since June 6th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "Tab_PKI_901 Objektidentifier des öffentlichen Schlüssels eines CV-Zertifikats der Generation 2")
public enum CVCG2PublicKeyOIDs implements OID {

    /** Transport des öffentlichen Signaturprüfschlüssels einer CA, 256 Bit */
    PUK_SIG_256("ecdsa-with-SHA256", "brainpoolP256r1", "1.2.840.10045.4.3.2"),

    /** Transport des öffentlichen Signaturprüfschlüssels einer CA, 384 Bit */
    PUK_SIG_384("ecdsa-with-SHA384", "brainpoolP384r1", "1.2.840.10045.4.3.3"),

    /** Transport des öffentlichen Signaturprüfschlüssels einer CA, 512 Bit */
    PUK_SIG_512("ecdsa-with-SHA512", "brainpoolP512r1", "1.2.840.10045.4.3.4"),

    /** Transport eines öffentlichen Authentisierungsschlüssels, 256 Bit */
    PUK_AUTH_256("authS_gemSpec-COS-G2_ecc-with-sha256", "brainpoolP256r1", "1.3.36.3.5.3.1"),

    /** Transport des öffentlichen Authentisierungsschlüssels einer CA, 384 Bit */
    PUK_AUTH_384("authS_gemSpec-COS-G2_ecc-with-sha384", "brainpoolP384r1", "1.3.36.3.5.3.2"),

    /** Transport des öffentlichen Authentisierungsschlüssels einer CA, 512 Bit */
    PUK_AUTH_512("authS_gemSpec-COS-G2_ecc-with-sha512", "brainpoolP512r1", "1.3.36.3.5.3.3")

    ;

    private static final Map<String, CVCG2PublicKeyOIDs> refMap = new HashMap<>();
    private static final Map<String, CVCG2PublicKeyOIDs> oidMap = new HashMap<>();

    static {
        stream(CVCG2PublicKeyOIDs.values()).forEach(p -> {
            refMap.put(p.getRef(), p);
            oidMap.put(p.getOid(), p);
        });
    }

    private final String ref;
    private final String item;
    private final String oidString;
    private final Oid oid;

    private CVCG2PublicKeyOIDs(final String ref, final String item, final String oid) {
        this.ref = ref;
        this.item = item;
        this.oidString = oid;
        this.oid = OID.super.toOid();
    }

    @Override
    public Oid toOid() throws IllegalStateException {
        return this.oid;
    }

    /**
     * Returns the public key OID reference.
     *
     * @return public key OID reference
     */
    @Override
    public String getRef() {
        return this.ref;
    }

    /**
     * Returns the public key item.
     *
     * @return public key item
     */
    @Override
    public String getItem() {
        return this.item;
    }

    /**
     * Returns the public key OID.
     *
     * @return public key oid
     */
    @Override
    public String getOid() {
        return this.oidString;
    }

    /**
     * Returns the (first found) {@link CVCG2PublicKeyOIDs} with the given OID value.
     *
     * @param oid
     *            OID value to search for
     * @return {@link Optional} containing the (first found) {@link CVCG2PublicKeyOIDs} with the given OID value or an
     *         empty {@link Optional}, if no such {@link CVCG2PublicKeyOIDs} exists
     */
    public static Optional<CVCG2PublicKeyOIDs> ofOid(final String oid) {
        return ofNullable(oidMap.get(oid));
    }

    /**
     * Returns the (first found) {@link CVCG2PublicKeyOIDs} with the given OID reference.
     *
     * @param ref
     *            document reference to search for
     * @return {@link Optional} containing the (first found) {@link CVCG2PublicKeyOIDs} with the given document
     *         refenrence or an empty {@link Optional}, if no such {@link CVCG2PublicKeyOIDs} exists
     */
    public static Optional<CVCG2PublicKeyOIDs> ofRef(final String ref) {
        return ofNullable(refMap.get(ref));
    }
}
