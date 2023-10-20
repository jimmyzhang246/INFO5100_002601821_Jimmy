import java.util.*;

class Session {
    private List<Student> students;

    public Session() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAvgQuizScores() {
        for (Student student : students) {
            List<Integer> quizScores = student.getQuizScores();
            int sum = 0;
            for (int i : quizScores) {
                sum += i;
            }
            double avg = (double)sum / (double)quizScores.size();
            System.out.println("The Average Quiz Score of " + student.getName() + " is: "+avg);
        }
    }

    public void printSortedQuizScores() {
        ArrayList<Integer> allQuizScores = new ArrayList<>();
        for (Student student : students) {
            allQuizScores.addAll(student.getQuizScores());
        }
        Collections.sort(allQuizScores);
        System.out.println("The Sorted Quiz Scores are: " + allQuizScores);
    }

    public void printPartTimeStudents() {
        System.out.println("The Name of Part-Time Students are:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.getName());
            }
        }
    }

    public void printFullTimeExamScores() {
        System.out.println("The Exam Scores of Full-Time Students are:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                List<Integer> examScores = ((FullTimeStudent) student).getExamScores();
                System.out.println("The Exam Scores of " + student.getName() + " are: "+examScores);
            }
        }
    }
}
