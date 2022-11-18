package tests;

import Pages.DragAndDrop_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DragAndDropTest extends DragAndDrop_Page {
    @Before
    public void setUp(){
        setUrl();
    }

    @Test
    public void performDragNdDrop() {
        goTodragndDropNdAssert();
    }

    @After
    public void tearDown() {
    closeAllWindows();
    }
}
