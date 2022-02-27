import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final String username = "";
        final String password = "";
        String url = "https://wilcox.schoolloop.com/portal/login";

        final WebClient webClient = new WebClient();
        final HtmlPage loginPage = webClient.getPage(url);
        final HtmlForm loginForm = loginPage.getFormByName("form");

        HtmlTextInput userField = loginForm.getInputByName("login_name");
        HtmlPasswordInput passField = loginForm.getInputByName("password");

        userField.type(username);
        passField.type(password);

        HtmlAnchor htmlAnchor = loginPage.getAnchorByHref("javascript:document.form.event_override.value='login';document.form.submit();");
        HtmlPage inboxPage = htmlAnchor.click();

        inboxPage.save(new File("inbox.html"));

        System.out.println(inboxPage.asXml());

    }


}
