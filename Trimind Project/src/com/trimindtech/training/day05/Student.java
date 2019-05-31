package com.trimindtech.training.day05;

public class Student {
    private String name;
    private String id;
    //private Object Student;

    Student(String name,String id)
    {
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    @Override
    public boolean equals(Object ob)
    {
        Student student=(Student)ob;
        boolean nameMatched=this.getName().equals(student.getName());
        boolean idMatched=this.getId().equals(student.getId());
        return nameMatched&&idMatched;
    }
}

