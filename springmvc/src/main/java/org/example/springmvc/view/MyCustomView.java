package org.example.springmvc.view;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.View;

import java.io.PrintWriter;
import java.util.Map;

public class MyCustomView implements View {
    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType(getContentType());
        PrintWriter writer = response.getWriter();
        writer.print("<html><body>");
        writer.print("<h1>Custom View Content<h1>");
        writer.print("<p>my custom view !!</p>");
        writer.print("</body></html>");

        writer.close();
    }

    @Override
    public String getContentType() {
        return "text/html";
    }
}
