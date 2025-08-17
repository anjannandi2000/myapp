package Myproject_crud.springboot.myapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int rollNo;
    @Column(name="student_name")
    private String name;
    @Column(name="student_percentage")
    private float percentage;
    @Column(name="student_branch")
    private String branch;


//    public Student(String name,String branch,float percentage) {
//        super();
//        this.name = name;
//        this.branch = branch;
//        this.percentage = percentage;
//    }




//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public String getName() {
//        return name;
//
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public float getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(float percentage) {
//        this.percentage = percentage;
//    }
//
//    public String getBranch() {
//        return branch;
//    }

//    public void setBranch(String branch) {
//        this.branch = branch;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                '}';
    }



}

