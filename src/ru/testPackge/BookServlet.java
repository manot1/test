package ru.testPackge;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by olga on 06.06.2016.
 */


public class BookServlet  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Book> books = new ArrayList<Book>();
        books.add(new Book(11, "Test1"));
        books.add(new Book(12, "Test3"));
        books.add(new Book(13, "Test2s"));

        req.setAttribute("bookList", books);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/books.jsp");
        requestDispatcher.forward(req, resp);


    }
}
