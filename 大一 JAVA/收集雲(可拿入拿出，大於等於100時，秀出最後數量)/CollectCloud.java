import java.util.Scanner;
import java.security.SecureRandom;
public class CollectCloud {
    public static void Talk(){
        System.out.println ("How many cloud at first");
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();
        Talk();
        int cloud = input.nextInt();
        System.out.println ("There are " + " "+cloud +" "+ "in bottle.");
        int[] hasCloud = new int[100];
        hasCloud[0] = cloud;
        int i = 1;
 
        while (cloud < 100) {
            System.out.println ("Who you might meet on the road(1：scarecrow /2：lion/ 3：ironman/4：fatcat)");
            int friend = sr.nextInt(5) + 1;
            if (friend == 3) {
                cloud = cloud + 10;
                hasCloud[i] = cloud;
                i++;
            if (cloud >= 100){
                cloud = 100;
            }                
                System.out.println("Meet ironman，now we have " +" "+ cloud +" "+ " clouds!");
            }
            if (friend == 2) {
                int a = cloud % 10;
                int b = cloud / 10;
                cloud = cloud + a + b;
                hasCloud[i] = cloud;
                i++;
            if (cloud >= 100){
                cloud = 100;
            }
                System.out.println("Meet lion，now we have " +" "+ cloud +" "+ " clouds!");
            }
            if (friend == 1) {
                int addCloud = 0;
                if (cloud % 2 == 0) {
                   addCloud += 2;
                }
                if (cloud % 3 == 0) {
                    addCloud += 3;
                }
                if (cloud % 5 == 0) {
                    addCloud += 5;
                }
                if (cloud % 7 == 0) {
                    addCloud += 7;
                }
                cloud += addCloud;
                hasCloud[i] = cloud;
                i++;
            if (cloud >= 100){
                cloud = 100;
            }
                System.out.println("Meet strawcrow，now we have " +" "+ cloud +" "+ " clouds!");
            }
            if (friend == 4 ) {
                if (cloud >= 10){
                    int c = cloud % 10;
                    int d = cloud / 10;
                    cloud += c*10+d-cloud;
                }
               hasCloud[i] = cloud;
                i++;
            if (cloud >= 100){
                cloud = 100;
            }
                System.out.println("Meet fatcat，now we have " +" "+ cloud +" "+ " clouds!");
            }
            if (friend == 5){
                int askForCloud = sr.nextInt(50);
                cloud = cloud - askForCloud;
                if (cloud <= 0) {
                        cloud = 0;   
                    }    
            if (cloud >= 100){
                cloud = 100;
            }
                System.out.println("Meet heartqueen，now we have " +" "+ cloud +" "+ " clouds!");
            }

        }  

        for (int j = 0; j < i; j++){
             if (j >= 100){
                j = 100;
            }           
            System.out.print (hasCloud[j]+"  ");
        }
        
    }
}