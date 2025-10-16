package jobsheet5;

import java.util.Scanner;
public class switchCetakKRS07 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Print KRS SIAKAD---");
        System.out.println("Enter current semester");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
            System.out.println("KRS Semester 1 displayed");
            break;
            case 2:
            System.out.println("KRS Semester 2 displayed");
            break;
            case 3:
            System.out.println("KRS Semester 3 displayed");
            break;
            case 4:
            System.out.println("KRS Semester 4 displayed");
            break;
            case 5:
            System.out.println("KRS Semester 5 displayed");
            break;
            case 6:
            System.out.println("KRS Semester 6 displayed");
            break;
            case 7:
            System.out.println("KRS Semester 7 displayed");
            break;
            case 8:
            System.out.println("KRS Semester 8 displayed");
            break;
            default:
            System.out.println("Invalid semester");
        }
    }
    
}
