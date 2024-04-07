import java.util.*;
class Attendance
{
    public void attendance()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ATTENDANCE SYSTEM\n");
            System.out.println("Subjects: ");
            System.out.println("1. EDUP");
            System.out.println("2. DEX");
            System.out.println("3. PRJ");
            System.out.println("4. FCN");
            System.out.println("5. DST");
            System.out.println("6. LXL");
            // System.out.print("Please select the subject: ");
            // int choice = sc.nextInt();
            System.out.println("1 --> Present");
            System.out.println("0 --> Absent");
            int ad[] = new int[100];
            for(int i=1;i<64;i++)
            {
                System.out.print("B0"+i+": ");
                ad[i] = sc.nextInt();
            }
        }
    }
}
class Details
{
    String name;
    String sap;
    String course;
    Details(String n, String s, String c)
    {
        name = n;
        sap = s;
        course = c;
    }
    public void display()
    {
        System.out.println("\nName: "+name);
        System.out.println("SAP ID: "+sap);
        System.out.println("Course: "+course);
    }
}
class Main
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("WELCOME TO CSE-3-B\n");
            System.out.println("1] STUDENT DETAILS");
            System.out.println("2] TAKE ATTENDANCE\n");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            Attendance a = new Attendance();
            Details s8 = new Details("Samyak Chedda", "574802200", "CSE");
            Details s11 = new Details("Parth Dave", "574802200", "CSE");
            Details s61 = new Details("Rishi Vejani", "57480220067", "CSE");
            if(choice == 1)
            {
                System.out.println("\nSTUDENT DETAILS\n");
                System.out.print("Enter RollNo: ");
                int rollno = sc.nextInt();
                switch(rollno)
                {
                    case 8:
                        s8.display();
                        break;
                    case 11:
                        s11.display();
                        break;
                    case 61:
                        s61.display();
                        break;
                    default:
                        System.out.println("No such student !");
                }
            }
            else if(choice == 2)
            {
                a.attendance();
            }
        }
    }
}