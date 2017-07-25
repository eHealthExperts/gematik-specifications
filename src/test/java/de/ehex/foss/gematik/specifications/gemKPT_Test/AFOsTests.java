package de.ehex.foss.gematik.specifications.gemKPT_Test;

import org.j8unit.repository.java.lang.EnumTests;

import de.ehex.foss.gematik.specifications.AFOTests;
import de.ehex.foss.gematik.specifications.gemKPT_Test_ORS1.AFOs;

public abstract interface AFOsTests<SUT extends AFOs> extends EnumTests<SUT, AFOs>, AFOTests<SUT> {
}
