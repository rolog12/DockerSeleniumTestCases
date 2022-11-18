package tests;

import Pages.iFramePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class iFrameTest extends iFramePage {
    @Before
    public void setUp() {
        setURL();
    }

    @Test
    public void switchNdWrite() {
        switchToFrameNdwrite();
    }

    @After
    public void tearDown() {
    closeAllWindows();
    }
}
