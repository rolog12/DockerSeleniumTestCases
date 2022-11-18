package tests;

import Pages.ContextMenu_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContextMenuTest extends ContextMenu_Page {
    @Before
    public void setUp()  {
        setUrl();
    }

    @Test
    public void excecuteRightClick(){
        rightClickAndAssert();
        assertRightClick();

    }

    @After
    public void tearDown() {
        implicitWait(5);
        dissmissOrAcceptAlert(true);
        closeAllWindows();
    }

}
