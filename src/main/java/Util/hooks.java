package Util;
import io.cucumber.java.*;
public class hooks {
    driverFactory driverFactory = new driverFactory();
    propertiesFactory propertiesFactory = new propertiesFactory();


    @Before
    public void before() {
        driverFactory.initDriver(propertiesFactory.getBrowser());
    }
}
