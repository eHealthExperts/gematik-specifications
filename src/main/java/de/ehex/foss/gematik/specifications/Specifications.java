package de.ehex.foss.gematik.specifications;

import static java.util.Objects.nonNull;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; gematik {@link Specification}s.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum Specifications implements Specification {

    gemKPT_Test("gemKPT_Test", de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.class),

    gemKPT_Test_ORS1("gemKPT_Test_ORS1", de.ehex.foss.gematik.specifications.gemKPT_Test_ORS1.AFOs.class),

    gemRL_TSL_SP_CP("gemRL_TSL_SP_CP", de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.class),

    gemSpec_CAN_TI("gemSpec_CAN_TI", de.ehex.foss.gematik.specifications.gemSpec_CAN_TI.AFOs.class),

    gemSpec_CVC_Root("gemSpec_CVC_Root", de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.class),

    gemSpec_CVC_TSP("gemSpec_CVC_TSP", de.ehex.foss.gematik.specifications.gemSpec_CVC_TSP.AFOs.class),

    gemSpec_DSM("gemSpec_DSM", de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.class),

    gemSpec_eGK_Fach_VSDM("gemSpec_eGK_Fach_VSDM", de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.class),

    gemSpec_eGK_ObjSys("gemSpec_eGK_ObjSys", de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.class),

    gemSpec_eGK_ObjSys_G2_1("gemSpec_eGK_ObjSys_G2_1", de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys_G2_1.AFOs.class),

    gemSpec_eGK_OPT("gemSpec_eGK_OPT", de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.class),

    gemSpec_FM_VSDM("gemSpec_FM_VSDM", de.ehex.foss.gematik.specifications.gemSpec_FM_VSDM.AFOs.class),

    gemSpec_gSMC_K_ObjSys("gemSpec_gSMC_K_ObjSys", de.ehex.foss.gematik.specifications.gemSpec_gSMC_K_ObjSys.AFOs.class),

    gemSpec_gSMC_KT_ObjSys("gemSpec_gSMC_KT_ObjSys", de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.class),

    gemSpec_gSMC_KT_ObjSys_G2_1("gemSpec_gSMC_KT_ObjSys_G2_1", de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.class),

    gemSpec_HBA_ObjSys("gemSpec_HBA_ObjSys", de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.class),

    gemSpec_HBA_ObjSys_G2_1("gemSpec_HBA_ObjSys_G2_1", de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys_G2_1.AFOs.class),

    gemSpec_Intermediaer_VSDM("gemSpec_Intermediär_VSDM", de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.class),

    gemSpec_ISM("gemSpec_ISM", de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.class),

    gemSpec_Karten_Fach_TIP("gemSpec_Karten_Fach_TIP", de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.class),

    gemSpec_Kon("gemSpec_Kon", de.ehex.foss.gematik.specifications.gemSpec_Kon.AFOs.class),

    gemSpec_Kon_SigProxy("gemSpec_Kon_SigProxy", de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.class),

    gemSpec_Krypt("gemSpec_Krypt", de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.class),

    gemSpec_KSR("gemSpec_KSR", de.ehex.foss.gematik.specifications.gemSpec_KSR.AFOs.class),

    gemSpec_KT("gemSpec_KT", de.ehex.foss.gematik.specifications.gemSpec_KT.AFOs.class),

    gemSpec_MobKT("gemSpec_MobKT", de.ehex.foss.gematik.specifications.gemSpec_MobKT.AFOs.class),

    gemSpec_Net("gemSpec_Net", de.ehex.foss.gematik.specifications.gemSpec_Net.AFOs.class),

    gemSpec_OID("gemSpec_OID", de.ehex.foss.gematik.specifications.gemSpec_OID.AFOs.class),

    gemSpec_OM("gemSpec_OM", de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.class),

    gemSpec_OCSP_Proxy("gemSpec_OCSP_Proxy", de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.class),

    gemSpec_Perf("gemSpec_Perf", de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.class),

    gemSpec_PINPUK_TI("gemSpec_PINPUK_TI", de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.class),

    gemSpec_PKI("gemSpec_PKI", de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.class),

    gemSpec_SiBetrUmg("gemSpec_SiBetrUmg", de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.class),

    gemSpec_Sich_DS("gemSpec_Sich_DS", de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.class),

    gemSpec_SMC_B_ObjSys("gemSpec_SMC_B_ObjSys", de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.class),

    gemSpec_SMC_B_ObjSys_G2_1("gemSpec_SMC_B_ObjSys_G2_1", de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.class),

    gemSpec_SMC_OPT("gemSpec_SMC_OPT", de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.class),

    gemSpec_SST_FD_VSDM("gemSpec_SST_FD_VSDM", de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.class),

    gemSpec_SST_VSDM("gemSpec_SST_VSDM", de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.class),

    gemSpec_St_Ampel("gemSpec_St_Ampel", de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.class),

    gemSpec_TSL("gemSpec_TSL", de.ehex.foss.gematik.specifications.gemSpec_TSL.AFOs.class),

    gemSpec_VPN_ZugD("gemSpec_VPN_ZugD", de.ehex.foss.gematik.specifications.gemSpec_VPN_ZugD.AFOs.class),

    gemSpec_VZD("gemSpec_VZD", de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.class),

    gemSpec_X_509_TSP("gemSpec_X.509_TSP", de.ehex.foss.gematik.specifications.gemSpec_X_509_TSP.AFOs.class),

    SPdPerval("SPdPerval", de.ehex.foss.gematik.specifications.SPdPersval.AFOs.class),

    ;

    private <AFO_ENUM extends Enum<AFO_ENUM> & AFO> Specifications(final String reference, final Class<AFO_ENUM> base) {
        assert nonNull(reference) : "There must be a non-null gematik reference identifier!";
        assert !reference.isEmpty() : "There must be a non-empty gematik reference identifier!";
        assert nonNull(base) : "There must be a non-null AFO-enum base class!";
        assert Enum.class.isAssignableFrom(base) : "AFO base must be assignable to " + Enum.class + "!";
        assert AFO.class.isAssignableFrom(base) : "AFO base must be assignable to " + AFO.class + "!";

        this.reference = reference;
        this.base = base;
    }

    private final String reference;

    @Override
    public String getReference() {
        assert nonNull(this.reference) : "Class invariant violation!";
        assert !this.reference.isEmpty() : "Class invariant violation!";

        return this.reference;
    }

    private final Class<? extends Enum<? extends AFO>> base;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public Set<AFO> getAFOs() {
        final Set set = EnumSet.allOf((Class) this.base);
        return set;
    }

    /**
     * Returns the {@linkplain Specification specification} according to the specified {@code base} {@link AFO}
     * {@link Enum enum} {@link Class class}.
     *
     * @param base
     *            the query {@code AFO} {@code enum} {@code class}
     * @param <AFO_ENUM>
     *            the effectively wildcard {@link AFO} {@link Enum enum} type
     * @return the specification according to the specified {@code base} {@code AFO} {@code enum} {@code class}
     * @throws NullPointerException
     *             if {@code base} is {@code null}
     * @throws IllegalArgumentException
     *             if {@code base} is neither assignable to {@link Enum} nor to {@link AFO}; or if there is no according
     *             specification available
     */
    public static <AFO_ENUM extends Enum<AFO_ENUM> & AFO> Specifications valueOf(final Class<? extends AFO_ENUM> base) throws NullPointerException, IllegalArgumentException {
        if (!Enum.class.isAssignableFrom(base)) {
            throw new IllegalArgumentException("The given base class is not assignable to " + Enum.class);
        }
        if (!AFO.class.isAssignableFrom(base)) {
            throw new IllegalArgumentException("The given base class is not assignable to " + AFO.class);
        }
        return Arrays.stream(Specifications.values()) //
                .filter(s -> s.base.equals(base)) //
                .findFirst() //
                .orElseThrow(() -> new IllegalArgumentException("No enum constant for base class " + base));
    }

    /**
     * Returns the {@linkplain Specification specification} according to the specified {@link AFO afo}.
     *
     * @param afo
     *            the query {@code AFO}
     * @param <AFO_ENUM>
     *            the effectively wildcard {@link AFO} {@link Enum enum} type
     * @return the specification according to the specified {@code afo}
     * @throws NullPointerException
     *             if {@code afo} is {@code null}
     * @throws IllegalArgumentException
     *             if {@code afo} is neither assignable to {@link Enum} nor to {@link AFO}; or if there is no according
     *             specification available
     */
    @SuppressWarnings("unchecked")
    public static <AFO_ENUM extends Enum<AFO_ENUM> & AFO> Specifications valueOf(final AFO_ENUM afo) {
        return valueOf((Class<? extends AFO_ENUM>) afo.getClass());
    }

}
