import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletInvitations extends HttpServlet{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {


        for (int i = 0; i < 100; i++) {
            System.out.println("gelukt");
        }

        RequestDispatcher view = req.getRequestDispatcher("InvitationsTemplate/templateHTMLfile.html");
        view.forward(req, res);

    }
}
