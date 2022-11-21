import java.util.ArrayList;
import java.util.Scanner;
        class Student {

            String StudentName;
            int AdNo;
            int RollNo;
            String CollegeName;

            public Student(String studentName, int adNo, int rollNo, String collegeName) {
                StudentName = studentName;
                AdNo = adNo;
                RollNo = rollNo;
                this.CollegeName = collegeName;
            }
        }
                public class Main {
                    public static void main(String[] args) {
                        ArrayList<Student> Studarr = new ArrayList<Student>();
                        while (true) {
                            System.out.println("Select an option \n1.Add Student\n2.View Student\n3.Search Student\n4.Delete Student\n5.Exit");
                            Scanner xy = new Scanner(System.in);
                            int option = xy.nextInt();
                            if (option == 5) {
                                System.out.println("You are exiting from the program");
                                System.exit(0);
                            } else {
                                switch (option) {
                                    case 1:
                                        System.out.println("Enter Students details");
                                        Scanner XY = new Scanner(System.in);
                                        System.out.println("Enter name");
                                        String ab = XY.next();
                                        System.out.println("Enter AdNo");
                                        int cd = XY.nextInt();
                                        System.out.println("Enter RollNo");
                                        int ef = XY.nextInt();
                                        System.out.println("Enter College");
                                        String gh = XY.next();
                                        Student S = new Student(ab, cd, ef, gh);
                                        Studarr.add(S);
                                        break;
                                    case 2 :
                                        System.out.println("Employee Details Showing");
                                        for (Student std : Studarr) {
                                            System.out.println("Print Student Details " );
                                            System.out.println(std.StudentName);
                                            System.out.println(std.AdNo);
                                            System.out.println(std.RollNo);
                                            System.out.println(std.CollegeName);

                                        }
                                        break;
                                }
                            }
                        }
                    }
                }