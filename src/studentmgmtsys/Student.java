package studentmgmtsys;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int studentYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //Constructor will prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.studentYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + studentYear + " " + studentID);




    }

    //Generate ID
    private void setStudentID() {
        //Grade Level + ID
        id++;
        this.studentID = studentYear + "" + id;

    }

    //Enroll in courses
    public void enroll() {
        //Loop and user hits 0 when done enrolling
        do {
            System.out.println("Enter course number to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (course != "Q") {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break
            }
        } while (1 != 0);
        System.out.println("ENROLLED IN: " + course);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    //View Balance

    //Pay tuition

    //Print student Status
}
