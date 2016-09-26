package de.ehex.foss.gematik.specifications;

import static de.ehex.foss.gematik.specifications.Erratas.gemErrata_R1_4_6;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_CM_KOMLE_PTV1_2_0;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_FD_KOMLE_PTV1_2_0;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_FD_VSDM_PTV1_4_0;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_Intermediaer_VSDM_PTV150_V100;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_Kon_PTV260_V100_LDAPProxy;
import static de.ehex.foss.gematik.specifications.PTStBs.gemProdT_X_509_TSP_nonQES_eGK_PTV1_5_0_V1_0_0;
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
import static java.util.Collections.unmodifiableSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public enum TestScope {

    KOMLE_CM(asList(gemProdT_CM_KOMLE_PTV1_2_0), emptyList(), emptyList()),

    KOMLE_FD(asList(gemProdT_FD_KOMLE_PTV1_2_0), emptyList(), emptyList()),

    LDAP_PROXY(asList(gemProdT_Kon_PTV260_V100_LDAPProxy), emptyList(), emptyList()),

    /**
     * TODO: Put a note why
     * <em>GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4655, TIP1_A_5120</em> are
     * included into test-scope.
     */
    OCSP_EGK(asList(gemProdT_X_509_TSP_nonQES_eGK_PTV1_5_0_V1_0_0, gemErrata_R1_4_6), emptyList(), asList(GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4655, TIP1_A_5120)),

    /**
     * TODO: Put a note why <em>VSDM_A_2323</em> can be excluded from testing.
     *
     * TODO: Put a note why <em>GS_A_4384, GS_A_4387</em> are included into test-scope.
     */
    VSDM_FD(asList(gemProdT_FD_VSDM_PTV1_4_0, gemErrata_R1_4_6), asList(VSDM_A_2323), asList(GS_A_4384, GS_A_4387)),

    INTERMEDIAER_VSDM(asList(gemProdT_Intermediaer_VSDM_PTV150_V100, gemErrata_R1_4_6), emptyList(), emptyList()),

    ;

    private Set<AFO> testAFOs;

    private TestScope(final List<? extends TestableSpecification> baseSpecs, final List<AFO> excludedAFOs, final List<AFO> includedAFOs) {
        final List<AFO> tmpExcludedAFOs = new ArrayList<>(excludedAFOs);
        tmpExcludedAFOs.retainAll(includedAFOs);
        if (!tmpExcludedAFOs.isEmpty()) {
            throw new IllegalArgumentException("Folgende AFOs sind als excluded und included angegeben: " + tmpExcludedAFOs);
        }

        final Set<AFO> resultSet = new HashSet<>();
        baseSpecs.forEach(bs -> resultSet.addAll(bs.getTestableAFOs()));
        resultSet.removeAll(excludedAFOs);
        resultSet.addAll(includedAFOs);

        this.testAFOs = unmodifiableSet(resultSet);
    }

    public Set<AFO> getTestableAFOs() {
        return this.testAFOs;
    }

}
