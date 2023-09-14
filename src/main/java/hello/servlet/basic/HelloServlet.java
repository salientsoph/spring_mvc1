package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServet", urlPatterns = "/hello") // /hello 하면 여기로 옴
public class HelloServlet extends HttpServlet {

    @Override  //ctrl + o 해서 override
    //http 요청이 오면 -> WAS(servlet container)가 request, response 객체를 만들어 던짐
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain"); //header
        response.setCharacterEncoding("utf-8"); //header
        response.getWriter().write("hello " + username);  //body
    }
}
