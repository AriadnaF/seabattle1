package lv.tsi.javaweb.seabattle;

import lv.tsi.javaweb.seabattle.model.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/register")  // urlPattern - kuda popadaem snachala absolute path
public class Servlet extends HttpServlet {
    // doPost get all parameters but does't show them
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("player-name");
        Player player = new Player();
        player.setName(name);

        response.sendRedirect("waitEnemyRegister.jsp"); // send response (get instruction to brauser to go to atother page
     //   System.out.println("Player: " + name);
    }
// doGet - get all paramenters to a command line (server) and they are seen
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //   String name = request.getParameter("player-name");
     //   System.out.println("Player: " + name);
    }
}
