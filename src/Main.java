import comparatorjavasort.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Integer> marks = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException{
        Student Student = new Student("Иванов П.П.", "ЭПС", 40);
        Student.getAverageMark();
        Student.println();
        Student.getMarks();



    }


    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;

        marks.add(1);
        marks.add(2);



    }
}
