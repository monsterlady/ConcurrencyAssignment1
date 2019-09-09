import java.util.Scanner;

public class Ruikang {
    public void
    getCustomList() {
        int str = 9898989;
        System.out.println(str);
        Scanner ruikang1 = new Scanner(System.in);
        int userInput = ruikang1.nextInt();
        if(userInput == str){
            System.out.println("Right");
        } else {
            System.out.println("Wrong!");
            getCustomList();
        }
        //return customList;
    }

    public static void main(String [] args){
        new Ruikang().getCustomList();
    }

}
