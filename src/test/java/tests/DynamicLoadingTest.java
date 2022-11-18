package tests;

import Pages.DynamicLoading_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DynamicLoadingTest extends DynamicLoading_Page {
    @Before
    public void setUp() {
        setUrl();
    }

    @Test
    public void startButtonClick() {
        startbtnNdAssert();
    }

    @After
    public void tearDown(){
        closeAllWindows();
    }
}
