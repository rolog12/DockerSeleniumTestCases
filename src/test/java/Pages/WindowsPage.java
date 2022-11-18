package Pages;

import org.openqa.selenium.By;
import wrapper.setWrapper;

public class WindowsPage extends setWrapper {
    By ClickHereLink_Loc= By.linkText("Click Here");
    By NewWindow_Loc=By.xpath("//div/h3[text()=\"New Window\"]");
    public void setUrl(){
        chromeDriverSetUp();
        goToURL(Url_windows);
    }

    public void clickOnNewWindowLink(){
        waitFor(3,ClickHereLink_Loc);
        clickonButton(ClickHereLink_Loc);
        handleNewWindow();
       myassertValidation("New Window",getTextFromLocator(NewWindow_Loc),1);
    }
}
