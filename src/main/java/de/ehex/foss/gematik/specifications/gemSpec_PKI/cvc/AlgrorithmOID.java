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
 * Definition of algorithm OIDs of CV certificates (see Tab. 52: Tab_PKI_260 Object Identifier der Registration
 * Authority TeleTrusT, Übergreifende Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th
 * 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "Tab_PKI_260 Object Identifier der Registration Authority TeleTrusT")
public enum AlgrorithmOID implements OID {

    CVC_CA("sigS_ISO9796-2Withrsa_sha256", "signature scheme with RSA signature and DSI according to [ISO 9796-2] and SHA-256", "1.3.36.3.4.2.2.4"), //
    CHIPKARTE("authS_ISO9796-2Withrsa_sha256_mutual", "authentication scheme with RSA signature and DSI according to [ISO 9796-2] and SHA-256 for mutual authentication with or without establishment of a Trusted Channel", "1.3.36.3.5.2.4"),;

    private static final Map<String, AlgrorithmOID> refMap = new HashMap<>();
    private static final Map<String, AlgrorithmOID> oidMap = new HashMap<>();

    static {
        stream(AlgrorithmOID.values()).forEach(p -> {
            refMap.put(p.getRef(), p);
            oidMap.put(p.getOid(), p);
        });
    }

    private final String ref;
    private final String item;
    private final String oidString;
    private final Oid oid;

    private AlgrorithmOID(final String ref, final String item, final String oid) {
        this.ref = ref;
        this.item = item;
        this.oidString = oid;
        this.oid = OID.super.toOid();
    }

    @Override
    public Oid toOid() throws IllegalStateException {
        return this.oid;
    }

    @Override
    public String getRef() {
        return this.ref;
    }

    @Override
    public String getItem() {
        return this.item;
    }

    @Override
    public String getOid() {
        return this.oidString;
    }

    /**
     * Returns the (first found) {@link AlgrorithmOID} with the given OID value.
     *
     * @param oid
     *            OID value to search for
     * @return {@link Optional} containing the (first found) {@link AlgrorithmOID} with the given OID value or an
     *         empty {@link Optional}, if no such {@link AlgrorithmOID} exists
     */
    public static Optional<AlgrorithmOID> ofOid(final String oid) {
        return ofNullable(oidMap.get(oid));
    }

    /**
     * Returns the (first found) {@link AlgrorithmOID} with the given OID reference.
     *
     * @param ref
     *            document reference to search for
     * @return {@link Optional} containing the (first found) {@link AlgrorithmOID} with the given document refenrence
     *         or an empty {@link Optional}, if no such {@link AlgrorithmOID} exists
     */
    public static Optional<AlgrorithmOID> ofRef(final String ref) {
        return ofNullable(refMap.get(ref));
    }
}
