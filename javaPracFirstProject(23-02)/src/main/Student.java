/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Я
 */
public class Student {
    private int Id;
    private String Fam;
    private String Name;
    private String Groupa;
    private String Department;
    private String discipline;
    private String mark;
    private String NameTeacher;

    public Student(int Id, String Fam, String Name, String Department) {
        this.Id = Id;
        this.Fam = Fam;
        this.Name = Name;
        this.Department = Department;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFam() {
        return Fam;
    }

    public void setFam(String Fam) {
        this.Fam = Fam;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGroupa() {
        return Groupa;
    }

    public void setGroupa(String Groupa) {
        this.Groupa = Groupa;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getNameTeacher() {
        return NameTeacher;
    }

    public void setNameTeacher(String NameTeacher) {
        this.NameTeacher = NameTeacher;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", Fam=" + Fam + ", Name=" + Name + ", Groupa=" + Groupa + ", Department=" + Department + ", discipline=" + discipline + ", mark=" + mark + ", NameTeacher=" + NameTeacher + '}';
    }
    
}