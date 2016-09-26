package de.ehex.foss.gematik.specifications.gemSpec_Sich_DS;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

import de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AFOsTest implements AFOsTests<AFOs> {

    // TODO: Migrate to new j8unit-util-enum-features after next big j8unit-release
    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return stream(AFOs.values()).map(x -> new Object[] { x }).collect(toList());
    }

    @Parameter(0)
    public AFOs sut;

    @Override
    public AFOs createNewSUT() {
        return this.sut;
    }

}
