package com.example.java_ee.task3_servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "calc", value = "/calc")
public class CalculatorServlet extends HttpServlet {
    private String operations;
    private double number1;
    private double number2;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        operations = req.getParameter("operation");
        number1 = Double.parseDouble(req.getParameter("number1"));
        number2 = Double.parseDouble(req.getParameter("number2"));

        printWriter.println("<html>\n" +
                "    <head>\n" +
                "        <title>\n" +
                "            New Servlet\n" +
                "        </title>\n" +
                "    </head>\n" +
                "\n" +
                "    <body>\n" +
                "\n" +
                "        <p>\n");

        operations(printWriter);

        printWriter.println(
                "        </p>\n" +
                "\n" +
                "    </body>\n" +
                "</html>");

    }

    private void operations(PrintWriter printWriter) {
        switch (operations) {
            case "add":
                printWriter.println(number1 + " + " + number2 + " = " + (number2+number1));
                break;
            case "sub":
                printWriter.println(number1 + " - " + number2 + " = " + (number1-number2));
                break;
            case "mul":
                printWriter.println(number1 + " * " + number2 + " = " + (number1*number2));
                break;
            case "div":
                printWriter.println(number1 + " / " + number2 + " = " + (number1/number2));
                break;
        }
    }

}
