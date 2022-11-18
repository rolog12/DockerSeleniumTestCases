package tests;

import Pages.CheckBoxes_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckBoxTest extends CheckBoxes_Page {

    @Before
    public void setUp(){
        setUrl();
    }

    @Test
    public void selectTheCheckBox() {
        chooseCheckBoxes();
        assertCheckBox();
    }

    @After
    public void tearDown(){
     closeAllWindows();
    }
}
