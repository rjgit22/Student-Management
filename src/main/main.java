package main;

import util.inpututil;
import util.menuutil;

import javax.security.auth.login.Configuration;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to School operation centre");
        while(true) {
            int operator = inpututil.enterinteger("\nWhat do you want to do?"
                    + "\n1: Register Student"
                    + "\n2: Show all student"
                    + "\n3: Find student"
                    + "\n4: Update student"
                    + "\n0: Quit"
            );
            if (operator == 1) {
                menuutil.registerstudents();
            }
            else if (operator == 2) {
                menuutil.printallstudents();
            }
            else if(operator == 3){
                menuutil.findstudents();
            }
            else if(operator == 4){
                menuutil.updatestudents();
            }
            else if(operator == 0){
                System.out.println("Quiting from operation!");

                break;
            }
            else{
                System.out.println("Invalid operation!");
                break;
            }
            }

        }

    }

