package tests;

import Pages.JavaScriptAlerts_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaScriptAlertTest extends JavaScriptAlerts_Page {
    @Before
    public void setUp(){
        setUrl();
    }

    @Test
    public void alertNdAssert() throws InterruptedException {
        jsAlertNdAssert();
        jsConfirmNdAssert();
        jsPromptNdAssert();

    }

    @After
    public void tearDown() {
       // closeAllWindows();
    }
}
