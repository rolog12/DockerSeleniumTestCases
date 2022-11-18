package tests;

import Pages.DownLoad_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DownLoadTest extends DownLoad_Page {
    @Before
    public void setUp(){
        setUrl();
    }

    @Test
    public void downloadinProgess() throws InterruptedException {
    downloadFile();
    }

    @After
    public void tearDown() {
    closeAllWindows();
    }
}
