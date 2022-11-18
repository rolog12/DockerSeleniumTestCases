package tests;

import Pages.UploadFile_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class uploadFileTest extends UploadFile_Page {
    @Before
    public void setUp() {
        setURL();
    }

    @Test
    public void uploadFile(){
        uploadFileAction();
    }

    @After
    public void tearDown(){
    closeAllWindows();
    }
}
