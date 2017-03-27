package edu.matc.ChangeNotification;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by student on 3/26/17.
 */
public class SendNotificationEmail extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        out.println("*****If you see an error in this table, Please send email to: sue@badgerwelding.com. *****");
    }
}
