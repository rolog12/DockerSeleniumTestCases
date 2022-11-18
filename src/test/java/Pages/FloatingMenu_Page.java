package Pages;

import org.openqa.selenium.By;
import wrapper.setWrapper;

public class FloatingMenu_Page extends setWrapper {

    By Paragraph_loc= By.xpath("//div/p[1]");
    public void setUrl(){
        chromeDriverSetUp();
        goToURL(Url_FlotaingMenu);
    }

    public void scrollingNdAssert () {
    scrollingThePage();
    assertisDisplayed("true",Paragraph_loc);
    }
}
