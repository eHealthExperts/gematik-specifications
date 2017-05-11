package de.ehex.foss.gematik.specifications;

import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_CM_KOMLE_PTV1_2_0;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_FD_KOMLE_PTV1_2_0;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_FD_VSDM_PTV1_5_0_1;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_Intermediaer_VSDM_PTV150_V100;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_Kon_PTV260_V100_LDAPProxy;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_X_509_TSP_nonQES_eGK_PTV1_6_0_V1_2_1;
import static de.ehex.foss.gematik.specifications.gemErrata_R1_4_6.AFOs.ARV_706_3_SPEC_SST_STAMPEL_AFO_0010;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4384;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4387;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4642;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4643;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4646;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4647;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4648;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4649;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4650;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.GS_A_4655;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2323;
import static de.ehex.foss.gematik.specifications.gemSpec_TSL.AFOs.TIP1_A_5120;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
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
public enum EVTScopes implements TestScope {

    KOMLE_CM(gemProdT_CM_KOMLE_PTV1_2_0, emptyList(), emptyList()),

    KOMLE_FD(gemProdT_FD_KOMLE_PTV1_2_0, emptyList(), emptyList()),

    LDAP_PROXY(gemProdT_Kon_PTV260_V100_LDAPProxy, emptyList(), emptyList()),

    /**
     * TODO: Put a note why
     * <em>GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4655, TIP1_A_5120</em>
     * is/are included into test-scope.
     */
    OCSP_EGK(gemProdT_X_509_TSP_nonQES_eGK_PTV1_6_0_V1_2_1, emptyList(), asList(ARV_706_3_SPEC_SST_STAMPEL_AFO_0010, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4655, TIP1_A_5120)),

    /**
     * TODO: Put a note why <em>VSDM_A_2323</em> is/are be excluded from testing.
     *
     * TODO: Put a note why <em>GS_A_4384, GS_A_4387</em> is/are included into test-scope.
     */
    VSDM_FD(gemProdT_FD_VSDM_PTV1_5_0_1, asList(VSDM_A_2323), asList(ARV_706_3_SPEC_SST_STAMPEL_AFO_0010, GS_A_4384, GS_A_4387)),

    INTERMEDIAER_VSDM(gemProdT_Intermediaer_VSDM_PTV150_V100, emptyList(), singletonList(ARV_706_3_SPEC_SST_STAMPEL_AFO_0010)),

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
