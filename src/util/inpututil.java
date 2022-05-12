package util;
import main.Student;

import java.util.Scanner;

public class inpututil {
    public static int enterinteger(String title){
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        return operation;
    }
    public static String enterstring(String title){
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        return answer;
    }

    public static Student fill(){
        String name = inpututil.enterstring("Enter student name:");
        String surname = inpututil.enterstring("Enter student surname:");
        int age = inpututil.enterinteger("Enter student age:");
        String classname = inpututil.enterstring("Enter student classname:");
        return new Student(name , surname , age, classname);
    }
}
