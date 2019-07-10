

import model.Student;

public class Text {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("李四");
        System.out.println(student.getName());
        student.setAge(20);
        System.out.println(student.getAge());
        student.setSex("女");
        System.out.println(student.getSex());
        student.setStudentNumber(2019001);
        System.out.println(student.getStudentNumber());
    }
}
