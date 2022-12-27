import logic.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       HttpSession session = request.getSession();

        Cart cart = (Cart)session.getAttribute("cart");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart);


        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Count is </h1>");
        pw.println("</html>");

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
