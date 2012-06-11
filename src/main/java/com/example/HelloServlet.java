package com.example;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import com.example.model.HelloGoodbye;

public class HelloServlet extends HttpServlet {

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String requestMessage = getMessage(request.getPathInfo());
        HelloGoodbye helloGoodbye = new HelloGoodbye(requestMessage);
        String reply = putMessage(helloGoodbye.iSay());

        request.setAttribute("request", reply);
        RequestDispatcher dispatcher = request.getRequestDispatcher( "/helloGoodbye.jsp" );
        dispatcher.forward( request, response );
    }
    
    private String getMessage(String requestMessage){
        String[] request = requestMessage.split("/");
        return request[1];
    }

    private String putMessage(String requestMessage) {
        return  requestMessage;
    }
}
