package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_OID;
import static java.util.Arrays.stream;
import static java.util.Optional.ofNullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.ietf.jgss.Oid;

import de.ehex.foss.gematik.specifications.OID;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of OIDs of flaglist in certificate holder authotization templates (CHAT) of CV certificates (see Tab. 8:
 * Tab_PKI_408 OID-Festlegung für Flag-Listen bei CV-Zertifikaten, Spezifikation Festlegung von OIDs [gemSpec_OID],
 * version 2.12.0, released Apr. 20th 2017)
 *
 * @author Sascha Zak
 * @since May 17th, 2017
 */
@SPEC(value = gemSpec_OID, note = "Tab_PKI_408 OID-Festlegung für Flag-Listen bei CV-Zertifikaten")
public enum FlaglistOIDs implements OID {

    /** Flaglist TI */
    TI("oid_cvc_fl_ti", "cvc_FlagList_TI", "1.2.276.0.76.4.152"),

    /** Flaglist CMS */
    CMS("oid_cvc_fl_cms", "cvc_FlagList_CMS", "1.2.276.0.76.4.153"),

    ;

    private static final Map<String, FlaglistOIDs> refMap = new HashMap<>();
    private static final Map<String, FlaglistOIDs> oidMap = new HashMap<>();

    static {
        stream(FlaglistOIDs.values()).forEach(p -> {
            refMap.put(p.getRef(), p);
            oidMap.put(p.getOid(), p);
        });
    }

    private final String ref;
    private final String item;
    private final String oidString;
    private final Oid oid;

    private FlaglistOIDs(final String ref, final String item, final String oid) {
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
     * Returns the flaglist OID reference.
     *
     * @return flaglist OID reference
     */
    @Override
    public String getRef() {
        return this.ref;
    }

    /**
     * Returns the flaglist item.
     *
     * @return flaglist item
     */
    @Override
    public String getItem() {
        return this.item;
    }

    /**
     * Returns the flaglist OID.
     *
     * @return flaglist oid
     */
    @Override
    public String getOid() {
        return this.oidString;
    }

    /**
     * Returns the (first found) {@link FlaglistOIDs} with the given OID value.
     *
     * @param oid
     *            OID value to search for
     * @return {@link Optional} containing the (first found) {@link FlaglistOIDs} with the given OID value or an empty
     *         {@link Optional}, if no such {@link FlaglistOIDs} exists
     */
    public static Optional<FlaglistOIDs> ofOid(final String oid) {
        return ofNullable(oidMap.get(oid));
    }

    /**
     * Returns the (first found) {@link FlaglistOIDs} with the given OID reference.
     *
     * @param ref
     *            document reference to search for
     * @return {@link Optional} containing the (first found) {@link FlaglistOIDs} with the given document refenrence or
     *         an empty {@link Optional}, if no such {@link FlaglistOIDs} exists
     */
    public static Optional<FlaglistOIDs> ofRef(final String ref) {
        return ofNullable(refMap.get(ref));
    }
}
