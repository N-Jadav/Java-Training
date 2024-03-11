class Student{
  int rollno;
  String name;
  int marks;
}

public class Arrays {

  public static void main(String[] args) {

    //  -------------------- 2-D ARRAYS ------------------
    //   int nums[][] = new int[3][4];

    //   for(int i=0; i<3;i++){
    //     for(int j=0; j<4; j++){
    //       nums[i][j] = (int)(Math.random()*100);
    //       System.out.print(nums[i][j]+ " ");
    //     }
    //     System.out.println();
    //   }
    // }

    // ---------------- JAGGED ARRAYS --------------------

    // int nums[][] = new int[3][];

    // nums[0] = new int[3];
    // nums[1] = new int[4];
    // nums[2] = new int[2];

    // for(int i=0; i<3; i++){
    //     for(int j=0; j<nums[i].length; j++){
    //       nums[i][j]=(int)(Math.random()*10);
    //       System.out.print(nums[i][j]+ " ");
    //     }
    //     System.out.println();
    //   }

    Student s1 = new Student();
    s1.rollno = 12;
    s1.name = "Neerali";
    s1.marks = 23;

    Student s2 = new Student();
    s2.rollno = 13;
    s2.name = "Ravi";
    s2.marks = 29;

    Student s3 = new Student();
    s3.rollno = 14;
    s3.name = "Ritesh";
    s3.marks = 28;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    // ------------ For Loop ----------
    // for(int i=0; i<3; i++){
    //   System.out.print(students[i].name+" "+students[i].marks+" "+students[i].rollno);
    //   System.out.println();
    // }

    //-------------- FOR EACH LOOP ------------------------
    for(Student n: students){
      System.out.print(n.name+" "+n.marks+" "+n.rollno);
      System.out.println();
    }
  }
}