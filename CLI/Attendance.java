import java.util.*;
class Attendance
{
    public void details()
    {
        
    }
    public void attendance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ATTENDANCE SYSTEM\n");
        System.out.println("Subjects: ");
        System.out.println("1. EDUP");
        System.out.println("2. DEX");
        System.out.println("3. PRJ");
        System.out.println("4. FCN");
        System.out.println("5. DST");
        System.out.println("6. LXL");
        System.out.print("Please select the subject: ");
        int choice = sc.nextInt();
        System.out.println("1 --> Present");
        System.out.println("0 --> Absent");
        int ad[] = new int[100];
        for(int i=1;i<64;i++)
        {
            System.out.print("B0"+i+": ");
            ad[i] = sc.nextInt();
        }
    }
    public static void main(String args[])
    {
        Attendance obj = new Attendance();
        obj.attendance();
    }
}