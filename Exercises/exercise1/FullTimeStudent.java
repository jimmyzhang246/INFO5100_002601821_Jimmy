import java.util.*;

class FullTimeStudent extends Student {
    private List<Integer> examScores;

    public FullTimeStudent(String name) {
        super(name);
        this.examScores = new ArrayList<>();
    }

    public void addExamScore(int score) {
        examScores.add(score);
    }

    public List<Integer> getExamScores() {
        return examScores;
    }
}
