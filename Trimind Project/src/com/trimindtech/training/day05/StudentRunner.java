package com.trimindtech.training.day05;

public class StudentRunner {
    public static void main(String[] args) {
        Student s=new Student("John25","25");
        Student s1=new Student("Viru30","30");
        Student s2=new Student("Doe35","35");
        Student s3=new Student("IronMan40","40");
        Student s4=new Student("Carolina29","29");
        Student s5=new Student("Carolina29","29");
        Student[] student={s,s1,s2,s3,s4};
        System.out.println(StudentExists(student,new Student("Doe","34")));
    }
    public static boolean StudentExists(Student[] arr, Student st)
    {
        for (Student student:arr) {
            if(student.equals(st))
            {
                return true;
            }

        }
        return false;
    }
}
