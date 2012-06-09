package com.example;

import java.io.IOException;

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

        String requestMessage = removeBackslash(request.getPathInfo());
        Greeting greeting = new Greeting(requestMessage);
        putMessage(greeting.reply(), response);
    }
    
    private String removeBackslash(String requestMessage) throws ServletException, IOException {
        return requestMessage.replaceAll("/","");
    }

    private void putMessage(String requestMessage, HttpServletResponse response) throws ServletException, IOException {
        ServletOutputStream out = response.getOutputStream();

        String replyMessage = requestMessage + ",shimosuk";
        out.write(replyMessage.getBytes());
        out.flush();
    }
}
