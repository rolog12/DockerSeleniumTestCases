package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import wrapper.setWrapper;

import java.io.IOException;

public class UploadFile_Page extends setWrapper {

    By chooseFile_form= By.xpath("//form[@method=\"POST\"]");
    By chooseFileBtn_loc= By.id("file-upload");
    By uploadBtn_loc= By.xpath("//form/input[@class='button']");
    By FileUploaded_loc= By.id("uploaded-files");

    protected String FileName="TestFile.txt";
    public void setURL(){
        chromeDriverSetUp();
        goToURL(Url_Upload);
    }

    public void uploadFileAction(){
        waitFor(5,chooseFile_form);
        createFileNdPath(FileName);
        sendPathToBttn(chooseFileBtn_loc);
        waitFor(5,uploadBtn_loc);
        clickonButton(uploadBtn_loc);
        myassertValidation(getTextFromLocator(FileUploaded_loc),FileName,1);
    }
}
