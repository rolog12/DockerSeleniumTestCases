package tests;

import Pages.DynamicControls_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DynamicControlsTest extends DynamicControls_Page {
    @Before
    public void setUp(){
        chromeDriverSetUp();
        setUrl();
    }

    @Test
    public void dynamicControlClickNdAssert() {
        removeAddBtn();
        enableDisableBtn();
    }

    @After
    public void tearDown(){
       closeAllWindows();
    }
}
