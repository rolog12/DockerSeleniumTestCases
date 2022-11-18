package tests;

import Pages.WindowsPage;
import org.junit.Before;
import org.junit.Test;

public class WindowsTest extends WindowsPage {
    @Before
    public void setUp() {
        setUrl();
    }

    @Test
    public void clickOnWindowNdAssert() {
        clickOnNewWindowLink();
    }
}
