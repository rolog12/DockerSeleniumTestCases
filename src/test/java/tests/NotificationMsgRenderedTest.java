package tests;

import Pages.NotificationMsgRendered_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NotificationMsgRenderedTest extends NotificationMsgRendered_Page {
    @Before
    public void setUp(){
        setUrl();
    }

    @Test
    public void notificationNdAssert() {
        clicklinkToNotification();
    }

    @After
    public void tearDown(){
    closeAllWindows();
    }
}
