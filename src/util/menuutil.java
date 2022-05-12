package util;

import main.Student;
import main.configuration;

public class menuutil {
    public static void printallstudents(){
        if(configuration.students==null){
            System.out.println("You do not have any students");
            return;
        }
        int count = inpututil.enterinteger("Students you have registered are :");
        for (int i = 0; i < configuration.students.length; i++) {

            Student st = configuration.students[i];
            System.out.println((i+1) + " .Student \n" + st.getinfo());
        }

    }
    public static void registerstudents(){
        int count = inpututil.enterinteger("How many students you want to register?");
        configuration.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Registration");
            Student st = inpututil.fill();
            configuration.students[i] = st;
        }
    }
    public static void findstudents(){
        String find = inpututil.enterstring("Enter name or surname you want to find :");
        for(int i=0;i< configuration.students.length;i++){
            Student st = configuration.students[i];
            if(st.getName().equalsIgnoreCase(find) || st.getSurname().equalsIgnoreCase(find)){
                System.out.println(st.getinfo());
            }

        }
    }
    public static void updatestudents(){
        int student_place = inpututil.enterinteger("In which student you want to do update");
        System.out.println("Enter information: ");
        Student st = inpututil.fill();
        configuration.students[student_place-1] = st;
        System.out.println(st.getinfo());
    }
}
