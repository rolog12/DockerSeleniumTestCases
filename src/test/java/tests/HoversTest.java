package tests;

import Pages.Hovers_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HoversTest extends Hovers_Page {
    @Before
    public void setUp(){
        setUrl();
    }

    @Test
    public void hoverNdAssertAction() {
        hoversNdAssert();
    }
    @After
    public void tearDown(){
        closeAllWindows();
    }
}
