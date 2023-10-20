import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        Session session = new Session();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            String studentName = "Student " + (char)(i + 'A');
            Student student;
            if (i % 2 == 0) {
                student = new PartTimeStudent(studentName);
            } else {
                student = new FullTimeStudent(studentName);
                ((FullTimeStudent) student).addExamScore(rand.nextInt(100));
                ((FullTimeStudent) student).addExamScore(rand.nextInt(100));
            }

            for (int j = 0; j < 15; j++) {
                student.addQuizScore(rand.nextInt(100));
            }

            session.addStudent(student);
        }

        session.printAvgQuizScores();
        session.printSortedQuizScores();
        session.printPartTimeStudents();
        session.printFullTimeExamScores();
    }
}
