import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listPrice = Float.parseFloat(request.getParameter("list-price"));
        float discountPercent = Float.parseFloat(request.getParameter("discount-percent"));

        float discountAmount = listPrice * discountPercent * 0.01f;
        float discountPrice = listPrice - discountAmount;

        try (PrintWriter printWriter = response.getWriter()) {
            response.setContentType("text/html;charset=UTF-8");
            printWriter.println("Discount Amount: " + discountAmount);
            printWriter.println("\nDiscount Price: " + discountPrice);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
