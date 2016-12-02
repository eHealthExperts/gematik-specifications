package de.ehex.foss.rfcs.rfc2119;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.util.List;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public final class RequirementLevelTest implements RequirementLevelTests<RequirementLevel> {

    @Parameters(name = "{0}")
    public final static List<? extends RequirementLevel> data() {
        return testParametersOfEnumClass(RequirementLevel.class);
    }

    @Parameter(0)
    public RequirementLevel sut;

    @Override
    public final RequirementLevel createNewSUT() {
        return this.sut;
    }

}
