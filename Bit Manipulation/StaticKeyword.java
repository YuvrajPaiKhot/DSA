public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Sharada Mandir";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "Aryaans";

        System.out.println(s1.schoolName);
    }
}

class Student{
    String name;
    int rollno;

    static String schoolName;

    void getName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
