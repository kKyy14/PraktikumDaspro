package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = "";
        System.out.print("Has the student been cleared of compensation? (Y/T or Yes/No): ");
        String CompensationStatus = sc.nextLine().trim();
        System.out.print("enter the number of guidance logs with Supervisor 1: ");
        int supervisor1 = sc.nextInt();
        System.out.print("enter the number of guidance logs with Supervisor 2: ");
        int supervisor2 = sc.nextInt();

        if(CompensationStatus.equals("Yes") || CompensationStatus.equals("Y")) {
            if(supervisor1>= 8 && supervisor2 >= 4) {
                message = "All requirements are met. The student may register for the is exam.";
            }else if (supervisor1<8 && supervisor2<4) {
                message = "Failed: Guidance logs eith supervisor 1 are fewer than 8 AND supervisor 2 fewer than 4.";
            } else if (supervisor1 < 8 && supervisor2 >= 4){
                message ="Failed: Guidance logs with Supervisor 1 are fewer than 8.";
            }else if (supervisor1 >= 8 && supervisor2 < 4){
                message = "Guidance logs with Supervisor 2 are fewer than 4.";
            }
        }else {
            message = "Failed: The student has not been cleared of compensation";
        }

        System.out.println(message);
    }

}
