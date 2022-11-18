package Pages;

import org.openqa.selenium.By;
import wrapper.setWrapper;

public class ContextMenu_Page extends setWrapper {
    By contextMenu_loc= By.id("hot-spot"); //*[@id="hot-spot"]
    By rightClick_loc=By.id("hot-spot");

    public void setUrl() {
        chromeDriverSetUp();
        goToURL(Url_contextMenu);
    }

    public void rightClickAndAssert() {
    rightClickContext(webelement_meth(rightClick_loc));

    }
    public void assertRightClick () {
        switchToalert();
        myassertValidation("You selected a context menu",printAlertText(),1);

    }


}
