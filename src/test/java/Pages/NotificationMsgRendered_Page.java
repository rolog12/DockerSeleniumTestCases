package Pages;

import org.openqa.selenium.By;
import wrapper.setWrapper;

import java.util.ArrayList;

public class NotificationMsgRendered_Page extends setWrapper {
    By notificationLink_Loc= By.xpath("//a[@href=\"/notification_message\"]");
    By MsgAler_Loc=By.id("flash");
    protected String successMsg="Action successful";
    protected String notSucessMsg="Action unsuccesful, please try again";
    public void setUrl(){
        chromeDriverSetUp();
        goToURL(Url_notification_msg_rendered);
    }

    public void clicklinkToNotification (){
        clickonLinkNdAssert(notificationLink_Loc,MsgAler_Loc,successMsg,notSucessMsg);
        }
}
