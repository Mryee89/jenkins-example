package my.com.myexample;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends InstrumentationTestCase {

    private UiDevice device;

    @Override
    public void setUp() throws Exception {
        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        device.wait(Until.hasObject(By.desc("Applications")), 3000);

            UiObject2 appsButton = device.findObject(By.desc("Applications"));
            appsButton.click();

        device.wait(Until.hasObject(By.text("My Example")), 3000);

        UiObject2 calculatorApp = device.findObject(By.text("My Example"));
        calculatorApp.click();
    }

    public void testAdd() throws Exception {
        device.wait(Until.hasObject(By.desc("More options")), 3000);

        UiObject2 buttonNine = device.findObject(By.desc("More options"));
        buttonNine.click();

        device.wait(Until.hasObject(By.text("Settings")), 3000);

        UiObject2 buttonPlus = device.findObject(By.text("Settings"));
        buttonPlus.click();

        device.pressBack();
        device.pressBack();
    }
}