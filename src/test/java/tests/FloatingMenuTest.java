package tests;

import Pages.FloatingMenu_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FloatingMenuTest extends FloatingMenu_Page {
    @Before
    public void setUp(){
        setUrl();
    }

    @Test
    public void scrollingNdAssertAction() {
        scrollingNdAssert();
    }

    @After
    public void tearDown(){
        closeAllWindows();
    }
}
