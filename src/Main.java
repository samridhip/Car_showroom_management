import java.util.Scanner;

interface utility{
    public void get_details();
    public void set_details();
}
public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("==============******WELCOME TO SHOWROOM MANAGEMENT SYSTEM******==============");
        System.out.println();
        System.out.println("==============***ENTER YOUR CHOICE***================");
        System.out.println();
        System.out.println("1].ADD SHOWROOM \t\t\t 2].ADD EMPLOYEES \t\t\t 3]ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOM \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Showroom showroom[]= new Showroom[5];
        Employees employee[]=new Employees[5];
        int car_counter=0;
        int showroom_counter=0;
        int employees_counter=0;
        int choice=100;
        while (choice!=0){
            main_menu();
            choice=sc.nextInt();
            while(choice!=9&&choice!=0){
                switch(choice){
                    case 1:
                        showroom[showroom_counter]= new Showroom();
                        showroom[showroom_counter].set_details();
                        
                }
            }
        }
    }
}
