package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/AllTestcasesLeaf.feature",glue="stepsAll",monochrome=true,publish=true )
public class AllCasesRunner extends AbstractTestNGCucumberTests  {


}
