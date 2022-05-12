package main;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String classname;
    private int balance=0;

    public Student() {
    }

    public Student(String name, String surname,int age,String classname) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.classname = classname;

    }


    /* public Student(String name, String surname,int age,String classname, int balance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.classname = classname;
        this.balance = balance;
    } */




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + name + '\'' +
                ", surname= " + surname + '\'' +
                ", age= " + age +
                ", classname= " + classname + '\'' +
                ", balance= " + balance +
                '}';
    }
    public String getinfo(){
        return "Name : "+ getName() + " ,Surname : " + getSurname()+ " ,Age : "+ getAge()+ " ,Classname :" +
                ""+getClassname()
        ;
    }
}
