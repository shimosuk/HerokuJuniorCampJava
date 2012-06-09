package com.example;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Greeting;

public class HelloServlet extends HttpServlet {

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Greeting greeting = new Greeting(request.getPathInfo());
        putMessage(greeting.reply(), response);
    }
    
    private void putMessage(String requestMessage, HttpServletResponse response) throws ServletException, IOException {
        ServletOutputStream out = response.getOutputStream();

        String replyMessage = requestMessage + ",shimosuk";
        out.write(replyMessage.getBytes());
        out.flush();
    }
}
