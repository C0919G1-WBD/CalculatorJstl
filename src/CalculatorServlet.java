import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float fistOperand = Float.parseFloat(request.getParameter("1stOperand"));
        float secondOperand = Float.parseFloat(request.getParameter("2ndOperand"));
        char operator = request.getParameter("operator").charAt(0);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        writer.println("<h1>Result: </h1>");

        try{
            float result = Calculator.calculator(fistOperand,secondOperand,operator);
            writer.println(fistOperand + " " + operator + " " + secondOperand + " = " + result);
        } catch (Exception ex) {
            writer.println("Error: "+ex.getMessage());
        }

        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
