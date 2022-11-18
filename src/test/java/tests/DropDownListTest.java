package tests;

import Pages.DropDown_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DropDownListTest extends DropDown_Page {

    @Before
    public void setUp(){
        setUrl();
    }

    @Test
    public void selecTheOption() {
        option1Selected();
        assertOptionsList();
        option2Selected();
        assertOptionsList();
    }

    @After
    public void tearDown() throws Exception {
        closeAllWindows();
    }
}
