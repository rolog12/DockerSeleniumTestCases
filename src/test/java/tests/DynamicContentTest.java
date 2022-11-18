package tests;

import Pages.DynamicContent_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DynamicContentTest extends DynamicContent_Page {
    @Before
    public void setUp() {
        setUrl();
    }

    @Test
    public void refreshF5() {
        refreshThePageNdAssert(3);
    }

    @After
    public void tearDown() {
        closeAllWindows();
    }
}
