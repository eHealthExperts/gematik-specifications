package de.ehex.foss.gematik.specifications;

import static de.ehex.foss.gematik.specifications.gemErrata_R1_4_6.AFOs.ARV_706_3_SPEC_SST_STAMPEL_AFO_0010;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.unmodifiableSet;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.concat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; gematik {@link Errata}s.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum Erratas implements Errata {

    gemErrata_R1_4_6("gemErrata_R1.4.6", asList(ARV_706_3_SPEC_SST_STAMPEL_AFO_0010), emptyList()),

    ;

    private Erratas(final String reference, final List<AFO> testAFOs, final List<AFO> nonTestAFOs) {
        assert nonNull(reference) : "There must be a non-null gematik reference identifier!";
        assert !reference.isEmpty() : "There must be a non-empty gematik reference identifier!";
        assert nonNull(testAFOs) : "There must be a non-null list of (test-relevant) AOFs!";
        assert nonNull(nonTestAFOs) : "There must be a non-null list of (test-irrelevant) AOFs!";

        this.reference = reference;
        this.testAFOs = unmodifiableSet(new HashSet<>(testAFOs));
        // assert disjoint(testAFOs, nonTestAFOs);
        nonTestAFOs.stream().filter(testAFOs::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!", this.name(), afo));
        this.afos = unmodifiableSet(concat(testAFOs.stream(), nonTestAFOs.stream()).collect(toSet()));
    }

    private final String reference;

    @Override
    public String getReference() {
        return this.reference;
    }

    private final Set<AFO> afos;

    @Override
    public Set<AFO> getAFOs() {
        return this.afos;
    }

    private final Set<AFO> testAFOs;

    @Override
    public Set<AFO> getTestableAFOs() {
        return this.testAFOs;
    }

}
