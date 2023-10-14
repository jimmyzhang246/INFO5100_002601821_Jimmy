import java.util.List;

public class School {
    public int id;
    private int history;
    private int studentsNum;
    private int facultyNum;
    public int classroom;
    public String address;
    public String introduction;
    public String country;
    public boolean ivy;
    private int count = 0;

    private class Northeastern {
        List<String> campus;
        List<String> major;
        List<String> teacher;
        List<String> student;
        boolean hasCodingClass;
        boolean hasEcoClass;
        boolean hasSportClass;
        boolean hasKungFuClass;

        private int nid;

        private int ncount = 0;
        public Northeastern(List<String> campus, List<String> major, List<String> teacher, List<String> student, boolean hasCodingClass, boolean hasEcoClass, boolean hasSportClass, boolean hasKungFuClass) {
            nid = ncount++;
            this.campus = campus;
            this.major = major;
            this.teacher = teacher;
            this.student = student;
            this.hasCodingClass = hasCodingClass;
            this.hasEcoClass = hasEcoClass;
            this.hasSportClass = hasSportClass;
            this.hasKungFuClass = hasKungFuClass;
        }

        public List<String> getCampus() {
            return campus;
        }

        public void setCampus(List<String> campus) {
            this.campus = campus;
        }

        public List<String> getMajor() {
            return major;
        }

        public void setMajor(List<String> major) {
            this.major = major;
        }

        public List<String> getTeacher() {
            return teacher;
        }

        public void setTeacher(List<String> teacher) {
            this.teacher = teacher;
        }
    }

    public School(int history, int studentsNum, int facultyNum, int classroom, String address, String introduction, String country, boolean ivy) {
        id = count++;
        this.history = history;
        this.studentsNum = studentsNum;
        this.facultyNum = facultyNum;
        this.classroom = classroom;
        this.address = address;
        this.introduction = introduction;
        this.country = country;
        this.ivy = ivy;
        System.out.println("Created School instance with id:" + id);
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getStudentsNum() {
        return studentsNum;
    }

    public void setStudentsNum(int studentsNum) {
        this.studentsNum = studentsNum;
    }

    public int getFacultyNum() {
        return facultyNum;
    }

    public void setFacultyNum(int facultyNum) {
        this.facultyNum = facultyNum;
    }
}
