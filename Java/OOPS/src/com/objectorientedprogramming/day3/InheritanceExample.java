package com.objectorientedprogramming.day3;
class Info{
    int id;
    String location;
    String dob;
    static {
        System.out.println("Compiling Information...");
    }

    public Info(int id, String location, String dob) {
        this.id = id;
        this.location = location;
        this.dob = dob;
        System.out.print(id+" "+location+" "+dob);
    }

}
class Student extends Info{
    int marks;

    public Student(int id, String location, String dob,int marks) {
        super(id, location, dob);
        this.marks=marks;
        System.out.println(" "+marks+"%");
    }
}
class Teacher extends Info{
    int salary;

    public Teacher(int id, String location, String dob,int salary) {
        super(id, location, dob);
        this.salary= salary;
        System.out.println(" "+salary+"Rs");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
    new Student(101,"India","1998 June",75);
    new Teacher(11,"India","1975 Jan",50000);
    }
}
