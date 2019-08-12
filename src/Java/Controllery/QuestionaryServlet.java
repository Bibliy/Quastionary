package Controllery;

import main.org.itstep.bibliy.Answer;
import main.org.itstep.bibliy.AnswerList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class QuestionaryServlet extends HttpServlet {
    private AnswerList answerList = AnswerList.getInstance();

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response)throws  SecurityException, IOException{
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String age = request.getParameter("age");
        String gender = "mail".equals(request.getParameter("gender"))? "man" : "woman";
        int answer = Integer.parseInt(request.getParameter("answer"));

        answerList.add(new Answer(name,surname,age,gender,answer));
         response.sendRedirect("/Questionary/src/Java/View/answerList.jsp");
    }
}
