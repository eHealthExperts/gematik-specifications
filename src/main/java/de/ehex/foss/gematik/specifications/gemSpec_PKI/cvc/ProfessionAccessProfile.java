package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.APOTHEKENASSISTENT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.APOTHEKENFACHARBEITER;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.APOTHEKENHELFER;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.BUNDESWEHRAPOTHEKE;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.FAMULANT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.KRANKENHAUS;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.KRANKENHAUSAPOTHEKE;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.KUJ_PSYCHOTHERAPEUT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.MOBILE_EINRICHTUNG_RETTUNGSDIENST;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.OEFFENTLICHE_APOTHEKE;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PHARMAZIEINGENIEUR;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PHARMAZIEPRAKTIKANT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PHARM_ASSISTENT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PHARM_KAUFM_ANGESTELLTER;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PHARM_TECHN_ASSISTENT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PKA_AUSZUBILDENDER;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PRAXIS_ARZT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PRAXIS_PSYCHOTHERAPEUT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PS_PSYCHOTHERAPEUT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.PTA_PRAKTIKANT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.ZAHNARZT;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs.ZAHNARZTPRAXIS;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.stream;
import static java.util.Optional.ofNullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import de.ehex.foss.gematik.specifications.gemSpec_OID.ProfessionOIDs;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of certificate holder authorization (CHA) profiles of CV certificates, mostly mapping to
 * {@link ProfessionOIDs} (see Tab. 47: Tab_PKI_254 Zugriffsprofile für eine Rollenauthentisierung, Übergreifende
 * Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "Tab_PKI_254 Zugriffsprofile für eine Rollenauthentisierung")
public enum ProfessionAccessProfile implements AccessProfile {

    VERSICHERTER(0, ProfessionOIDs.VERSICHERTER), //
    EKIOSK(1), //
    ARZT(2, ProfessionOIDs.ARZT, ZAHNARZT, PRAXIS_ARZT, ZAHNARZTPRAXIS, KRANKENHAUS), //
    APOTHEKER(3, ProfessionOIDs.APOTHEKER, APOTHEKENASSISTENT, PHARMAZIEINGENIEUR, APOTHEKENASSISTENT, OEFFENTLICHE_APOTHEKE, KRANKENHAUSAPOTHEKE, BUNDESWEHRAPOTHEKE, PHARM_ASSISTENT, PHARM_TECHN_ASSISTENT, PHARM_KAUFM_ANGESTELLTER,
            PHARMAZIEPRAKTIKANT, APOTHEKENHELFER, APOTHEKENFACHARBEITER, FAMULANT, PTA_PRAKTIKANT, PKA_AUSZUBILDENDER), //
    PSYCHOTHERAPEUT(4, ProfessionOIDs.PSYCHOTHERAPEUT, PS_PSYCHOTHERAPEUT, KUJ_PSYCHOTHERAPEUT, PRAXIS_PSYCHOTHERAPEUT), //
    HEILMITTELERBRINGER(5), //
    RESERVIERT(6), //
    RETTUNGSASSISTENT(7, ProfessionOIDs.RETTUNGSASSISTENT, MOBILE_EINRICHTUNG_RETTUNGSDIENST), //
    KOSTENTRAEGER(8, ProfessionOIDs.KOSTENTRAEGER), //
    GESUNDHEITSEINRICHTUNGEN(9), //
    UZWDRDV(10), //
    ;

    private static final Map<ProfessionOIDs, ProfessionAccessProfile> oidMap = new HashMap<>();

    static {
        stream(ProfessionAccessProfile.values()).forEach(p -> {
            stream(p.getProfessionOids()).forEach(oid -> oidMap.put(oid, p));
        });
    }

    private final byte profile;
    private final ProfessionOIDs[] professionOids;

    private ProfessionAccessProfile(final int profile, final ProfessionOIDs... professionOids) {
        this.profile = (byte) profile;
        this.professionOids = professionOids == null ? new ProfessionOIDs[] {} : copyOf(professionOids, professionOids.length);
    }

    /**
     * Returns the profile number.
     *
     * @return profile number
     */
    @Override
    public byte getProfile() {
        return this.profile;
    }

    /**
     * Returns the mapping {@link ProfessionOIDs}.
     *
     * @return mapping {@link ProfessionOIDs}
     */
    public ProfessionOIDs[] getProfessionOids() {
        return copyOf(this.professionOids, this.professionOids.length);
    }

    /**
     * Returns the {@link ProfessionAccessProfile} that maps to the given {@link ProfessionOIDs}.
     *
     * @param professionOid
     *            {@link ProfessionOIDs} to search for
     * @return {@link Optional} containing the {@link ProfessionAccessProfile} that maps to the given
     *         {@link ProfessionOIDs} or an empty {@link Optional}, if no such {@link ProfessionAccessProfile} exists
     */
    public static Optional<ProfessionAccessProfile> ofProfessionOid(final ProfessionOIDs professionOid) {
        return ofNullable(oidMap.get(professionOid));
    }

    /**
     * Returns the {@link ProfessionAccessProfile} that maps to the given profession OID value.
     *
     * @param professionOid
     *            profession OID value to search for
     * @return {@link Optional} containing the {@link ProfessionAccessProfile} that maps to the given profession OID
     *         value or an empty {@link Optional}, if no such {@link ProfessionAccessProfile} exists
     */
    public static Optional<ProfessionAccessProfile> ofProfessionOid(final String professionOid) {
        final Optional<ProfessionOIDs> profession = ProfessionOIDs.ofOid(professionOid);
        return profession.isPresent() ? ofNullable(oidMap.get(profession.get())) : Optional.empty();
    }
}
