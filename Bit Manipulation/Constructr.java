public class Constructr {
    public static void main(String[] args) {
        Student s1 = new Student("Yuvraj");
        s1.name = "Yuvraj";
        s1.rollno = 242;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int rollno;
    String password;
    int marks[];

    // Shallow copy constructor()
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;
    // }

    // Deep Copy constructor()
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name){
        marks = new int[3];
        this.name = name; // First 'name': Global variable, Second 'name': parameter
    }
    Student(int rollno){
        marks = new int[3];
        this.rollno = rollno;
    }
    Student(){
        System.out.println("Yuvraj");
    }
    // The above phenomenon of creating multiple condtructors is called constructor overloading
    // It is an example of polymorphism
}
