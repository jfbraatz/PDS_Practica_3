package TestCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculateEnergyIncome_Syntax.class, testEquivalencia.class, testSintactico.class })
public class AllTests {

}
