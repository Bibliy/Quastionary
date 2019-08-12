package main.org.itstep.bibliy;



import java.util.Date;

public class Answer {
    private String name;
    private String surname;
    private String gender;
    private String age;
    private Date date;
    private int answer;



    public Answer(String name, String surname, String gender, String age, Date date, int answer) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.date = date;
        this.answer = answer;
    }

    public Answer(String name, String surname, String age, String gender, int answer) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}

