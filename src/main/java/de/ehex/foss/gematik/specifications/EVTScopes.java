package de.ehex.foss.gematik.specifications;

import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_CM_KOMLE_PTV1_2_0;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_FD_KOMLE_PTV1_2_0;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_FD_VSDM_PTV1_5_0_2;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_Intermediaer_VSDM_PTV150_V100;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_Kon_PTV260_V100_LDAPProxy;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_X_509_TSP_nonQES_eGK_PTV1_7_0_0;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4173;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4191;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4230;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4249;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4255;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4259;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4261;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4268;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4270;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4271;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4272;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4273;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4274;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4275;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4276;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4279;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4284;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4285;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4287;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4288;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4289;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4290;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4291;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4292;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4294;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4295;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4304;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4305;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4306;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4307;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4308;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4309;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4310;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4311;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4312;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4313;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4314;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4315;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4316;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.GS_A_4317;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4367;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4368;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4384;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4387;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5518;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4642;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4643;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4646;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4647;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4648;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4649;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4650;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4655;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_5513;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2323;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3737;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3747;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3753;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3756;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3760;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3772;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4980;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4981;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4982;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4983;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4984;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2012;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2046;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2047;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2076;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2087;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2174;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2177;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2309;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2326;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2328;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2329;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2330;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2331;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2332;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2345;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2347;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2361;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2366;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_4944;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_4945;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_4946;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_4947;
import static de.ehex.foss.gematik.specifications.gemSpec_TSL.AFOs.TIP1_A_5120;
import static de.ehex.foss.gematik.specifications.gemSpec_X_509_TSP.AFOs.TIP1_A_3548;
import static de.ehex.foss.gematik.specifications.gemSpec_X_509_TSP.AFOs.TIP1_A_3550;
import static de.ehex.foss.gematik.specifications.gemSpec_X_509_TSP.AFOs.TIP1_A_3554;
import static de.ehex.foss.gematik.specifications.gemSpec_X_509_TSP.AFOs.TIP1_A_4230;
import static de.ehex.foss.gematik.specifications.gemSpec_X_509_TSP.AFOs.TIP1_A_4235;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.unmodifiableSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * According to the currently released specifications, this enumeration list all (currently considered) gematik EVT
 * scopes.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 27th, 2016
 */
public enum EVTScopes
implements TestScope {

    KOMLE_CM(gemProdT_CM_KOMLE_PTV1_2_0, emptyList(), emptyList()),

    KOMLE_FD(gemProdT_FD_KOMLE_PTV1_2_0, emptyList(), emptyList()),

    LDAP_PROXY(gemProdT_Kon_PTV260_V100_LDAPProxy, emptyList(), emptyList()),

    /**
     * TODO: Put a note why <em>GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4655,
     * TIP1_A_5120</em> is/are included into test-scope.
     *
     * EXKLUDIERTE AFOS:
     *
     * GS_A_5513 (Wahl des Signaturalgorithmus für Zertifikate): Zeitpunkt der Zertifikatserstellung ist nicht ZTS-EVT
     *
     * GS_A_5518 (Prüfung Kurvenpunkte bei einer Zertifikatserstellung): Zeitpunkt der Zertifikatserstellung ist nicht
     * ZTS-EVT
     *
     * "Tabelle 5: nicht nachzuweisende Anforderungen" aus [gemProdT_X.509_TSP_nonQES_eGK_PTV1.7.0- 0]: GS_A_4173,
     * GS_A_4273, GS_A_4292, GS_A_4313, GS_A_3772, GS_A_2177, GS_A_4944, GS_A_4191, GS_A_4274, GS_A_4294, GS_A_4314,
     * GS_A_4980, GS_A_2309, GS_A_4945, GS_A_4230, GS_A_4275, GS_A_4295, GS_A_4315, GS_A_4981, GS_A_2326, GS_A_4946,
     * GS_A_2366, GS_A_4276, GS_A_4304, GS_A_4316, GS_A_4982, GS_A_2328, GS_A_4947, GS_A_4249, GS_A_4279, GS_A_4305,
     * GS_A_4317, GS_A_4983, GS_A_2329, TIP1_A_3548, GS_A_4255, GS_A_4284, GS_A_4306, GS_A_4367, GS_A_4984, GS_A_2330,
     * TIP1_A_3550, GS_A_4259, GS_A_4285, GS_A_4307, GS_A_4368, GS_A_2012, GS_A_2331, TIP1_A_3554, GS_A_4261, GS_A_4287,
     * GS_A_4308, GS_A_3737, GS_A_2046, GS_A_2332, TIP1_A_4230, GS_A_4268, GS_A_4288, GS_A_4309, GS_A_3747, GS_A_2047,
     * GS_A_2345, TIP1_A_4235, GS_A_4270, GS_A_4289, GS_A_4310, GS_A_3753, GS_A_2076, GS_A_2347, GS_A_4271, GS_A_4290,
     * GS_A_4311, GS_A_3756, GS_A_2087, GS_A_2361, GS_A_4272, GS_A_4291, GS_A_4312, GS_A_3760, GS_A_2174
     *
     */
    OCSP_EGK(gemProdT_X_509_TSP_nonQES_eGK_PTV1_7_0_0, asList(GS_A_5513, GS_A_5518, GS_A_4173, GS_A_4273, GS_A_4292, GS_A_4313, GS_A_3772, GS_A_2177, GS_A_4944, GS_A_4191, GS_A_4274, GS_A_4294, GS_A_4314, GS_A_4980, GS_A_2309, GS_A_4945, GS_A_4230, GS_A_4275, GS_A_4295, GS_A_4315, GS_A_4981, GS_A_2326, GS_A_4946, GS_A_2366, GS_A_4276, GS_A_4304, GS_A_4316, GS_A_4982, GS_A_2328, GS_A_4947, GS_A_4249, GS_A_4279, GS_A_4305, GS_A_4317, GS_A_4983, GS_A_2329, TIP1_A_3548, GS_A_4255, GS_A_4284, GS_A_4306, GS_A_4367, GS_A_4984, GS_A_2330, TIP1_A_3550, GS_A_4259, GS_A_4285, GS_A_4307, GS_A_4368, GS_A_2012, GS_A_2331, TIP1_A_3554, GS_A_4261, GS_A_4287, GS_A_4308, GS_A_3737, GS_A_2046, GS_A_2332, TIP1_A_4230, GS_A_4268, GS_A_4288, GS_A_4309, GS_A_3747, GS_A_2047, GS_A_2345, TIP1_A_4235, GS_A_4270, GS_A_4289, GS_A_4310, GS_A_3753, GS_A_2076, GS_A_2347, GS_A_4271, GS_A_4290, GS_A_4311, GS_A_3756, GS_A_2087, GS_A_2361, GS_A_4272, GS_A_4291, GS_A_4312, GS_A_3760, GS_A_2174), asList(GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4655, TIP1_A_5120)),

    /**
     * TODO: Put a note why <em>VSDM_A_2323</em> is/are be excluded from testing.
     *
     * TODO: Put a note why <em>GS_A_4384, GS_A_4387</em> is/are included into test-scope.
     */
    VSDM_FD(gemProdT_FD_VSDM_PTV1_5_0_2, asList(VSDM_A_2323), asList(GS_A_4384, GS_A_4387)),

    INTERMEDIAER_VSDM(gemProdT_Intermediaer_VSDM_PTV150_V100, emptyList(), emptyList()),

    ;

    private Set<AFO> testAFOs;

    private EVTScopes(final TestableSpecification baseSpec, final List<AFO> excludedAFOs, final List<AFO> includedAFOs) {
        final List<AFO> tmpExcludedAFOs = new ArrayList<>(excludedAFOs);
        tmpExcludedAFOs.retainAll(includedAFOs);
        if (!tmpExcludedAFOs.isEmpty()) {
            throw new IllegalArgumentException("Folgende AFOs sind als excluded und included angegeben: " + tmpExcludedAFOs);
        }

        final Set<AFO> resultSet = new HashSet<>();
        resultSet.addAll(baseSpec.getTestableAFOs());
        resultSet.removeAll(excludedAFOs);
        resultSet.addAll(includedAFOs);

        this.testAFOs = unmodifiableSet(resultSet);
    }

    @Override
    public Set<AFO> getTestableAFOs() {
        return this.testAFOs;
    }

}
