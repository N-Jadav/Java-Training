import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable is an interface which has compareTo function to manipulate and define custom logic for sorting
class Student implements Comparable<Student>{
    int age;
    String name;

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Here we have defined the sorting of students by age
    public int compareTo(Student o) {
        if(this.age > o.age)
            return 1;
        else
            return -1;
    }

    
}

public class ComparableDemo {

    public static void main(String[] args) {

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Ravi"));
        studs.add(new Student(25, "Neerali"));
        studs.add(new Student(23, "Ritesh"));
        studs.add(new Student(24, "Reena"));

        Collections.sort(studs);

        for(Student s: studs){
            System.out.println(s);
        }
        
    }
    
}
