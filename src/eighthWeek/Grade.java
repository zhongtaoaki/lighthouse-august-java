package eighthWeek;

public class Grade {

    private int number;

    private Subject subject;
    private int score;
    private String name;

    public Grade(String name, String subject, int score) {
        this.name = name;
        switch (subject) {
            case "JAVA":
                this.subject = Subject.JAVA;
                break;
            case "PYTHON":
                this.subject = Subject.PYTHON;
                break;
            default:
                this.subject = Subject.AWS;
                break;
        }
        this.score = score;
    }

    

    public Grade(int number, Subject subject, int score) {
        this.number = number;
        this.subject = subject;
        this.score = score;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Subject getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public enum Subject {
        JAVA, PYTHON, AWS;
    }

    @Override
    public String toString() {
        return "科目=" + subject + ", 分数=" + score + ", 姓名=" + name;
    }

    
}
