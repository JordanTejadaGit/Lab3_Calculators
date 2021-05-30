package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String Result = request.getParameter("age");
        
        request.setAttribute("message", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        if (request.getParameter("plus") != null) {
            if (first == "" || first == null || second == "" || second == null || !isNumeric(first) || !isNumeric(second)) {
            
                request.setAttribute("message", "invalid");
            
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
            else {
                int firstInt = Integer.parseInt(first);
                int secondInt = Integer.parseInt(second);
                
                request.setAttribute("message", firstInt + secondInt);
                
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
        }
        else if (request.getParameter("minus") != null) {
            if (first == "" || first == null || second == "" || second == null || !isNumeric(first) || !isNumeric(second)) {
            
                request.setAttribute("message", "invalid");
            
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
            else {
                int firstInt = Integer.parseInt(first);
                int secondInt = Integer.parseInt(second);
                
                request.setAttribute("message", firstInt - secondInt);
                
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
        }
        
        else if (request.getParameter("multiply") != null) {
            if (first == "" || first == null || second == "" || second == null || !isNumeric(first) || !isNumeric(second)) {
            
                request.setAttribute("message", "invalid");
            
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
            else {
                int firstInt = Integer.parseInt(first);
                int secondInt = Integer.parseInt(second);
                
                request.setAttribute("message", firstInt * secondInt);
                
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
        }
        
        else if (request.getParameter("remainder") != null) {
            if (first == "" || first == null || second == "" || second == null || !isNumeric(first) || !isNumeric(second)) {
            
                request.setAttribute("message", "invalid");
            
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
            else {
                int firstInt = Integer.parseInt(first);
                int secondInt = Integer.parseInt(second);
                
                request.setAttribute("message", firstInt % secondInt);
                
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
        }
    }
    
    public static boolean isNumeric (String number) {
        if (number == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}