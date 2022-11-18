package tests;

import Pages.JsLogError_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JsLogErrorTest extends JsLogError_Page {
    @Before
    public void setUp(){
        setUrl();
    }

    @Test
    public void jsLogErrorAction() {
        handleJsErrorLogs();
    }

    @After
    public void tearDown(){
    closeAllWindows();
    }
}
