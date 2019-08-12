package main.org.itstep.bibliy;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;

public class AnswerList {

    private static final AnswerList answerList = new AnswerList();
    //public PhantomReference list;
    public List<Answer>list = new ArrayList<Answer>();


    private  AnswerList(){}

    public synchronized  void  add(Answer answer){
        this.list.add(answer);
    }

    public static AnswerList getInstance(){
        return answerList;
    }
}
