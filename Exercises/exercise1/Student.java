import java.util.*;

class Student {
    private String name;
    private List<Integer> quizScores;

    public Student(String name) {
        this.name = name;
        this.quizScores = new ArrayList<>();
    }

    public void addQuizScore(int score) {
        quizScores.add(score);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getQuizScores() {
        return quizScores;
    }
}
