import model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BeerSelect extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List<String> result = be.getBrands(c);

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("Beer Selection Advice<br>");

//        for (String i : result) {
//            out.println("<br>Try:  " + i);
//        }

        request.setAttribute("styles", result);

        RequestDispatcher view =
                request.getRequestDispatcher("result.jsp");

        view.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

}
