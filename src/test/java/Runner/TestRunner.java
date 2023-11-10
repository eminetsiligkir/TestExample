package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;

@CucumberOptions(
        glue = {"StepDefinitions","Util"},
        features = {"src/test/java/Features"},
        tags = "@TextBox"
        //dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {

/*    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    // TestNG Hooks

    @AfterSuite
    public void afterSuite() {
    }

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }

    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeMethod
    public void beforeMethod() {
    }*/

}