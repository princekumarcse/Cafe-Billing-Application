import java.util.*;
public class FoodOrder{
    // variable for price 
    int frenchFries=100;
    int burger=120;
    int pastry=100;
    int pizza=200;
    int coldCoffee=100;
    int colddrink= 80;
    int icedtea=80;
    int ch;
    int  quantity;
    static int total;
    String again;
    Scanner sc= new Scanner(System.in);


    //method for menu
    public void displayMenu(){
        System.out.println("***********Welcome To Our Cafe***********");
        System.out.println("=========================================");
        System.out.println("          1.FRENCH-FRIES   100/- ");
        System.out.println("          2.BURGER         120/- ");
        System.out.println("          3.PASTRY         100/- ");
        System.out.println("          4.PIZZA          200/- ");
        System.out.println("          5.COLD-COFFEE    100/- ");
        System.out.println("          6.COLD-DRINKS    80/- ");
        System.out.println("          7.ICE-TEA        80/- ");
        System.out.println("          8.EXIT ");
        System.out.println("=========================================");

        System.out.println("What do you want to order Today? ");
    }

    // method to generate the bill
    public void generateBill(){
        System.out.println();
        System.out.println("*********Thank You for Odering*********");
        System.out.println("*********Your Bill is: "+total+ "*********");
      }

           //Method for food order item list
        public void order(){
             System.out.println("ENTER YOUR CHOICE: ");
             ch=sc.nextInt();
            while(true){
               switch(ch){
                 case 1://1.FRENCH-FRIES
                    System.out.println("You have Selected FRENCH-FRIES");
                    System.out.println("Enter the Quantity: ");
                    quantity=sc.nextInt();
                    total=total+ quantity*frenchFries;
                    break;

                 case 2://2.BURGER
                    System.out.println("You have Selected BURGER");
                    System.out.println("Enter the Quantity: ");
                    quantity=sc.nextInt();
                    total=total+ quantity*burger;
                    break;

                  case 3://3.PASTRY 
                    System.out.println("You have Selected PASTRY");
                    System.out.println("Enter the Quantity: ");
                    quantity=sc.nextInt();
                    total=total+ quantity*pastry;
                   break;

                  case 4://4.PIZZA  
                    System.out.println("You have Selected PIZZA");
                    System.out.println("Enter the Quantity: ");
                    quantity=sc.nextInt();
                    total=total+ quantity*pizza;
                   break;

                  case 5://5.COLD-COFFEE
                    System.out.println("You have Selected COLD-COFFEE");
                    System.out.println("Enter the Quantity: ");
                    quantity=sc.nextInt();
                    total=total+ quantity*coldCoffee;
                    break;

                  case 6://6.COLD-DRINKS  
                    System.out.println("You have Selected COLD-DRINKS ");
                    System.out.println("Enter the Quantity: ");
                    quantity=sc.nextInt();
                    total=total+ quantity*colddrink;
                    break;
                  case 7://7.ICE-TEA
                    System.out.println("You have Selected ICE-TEA");
                    System.out.println("Enter the Quantity: ");
                    quantity=sc.nextInt();
                    total=total+ quantity*icedtea;
                    break;

                  case 8://8.EXIT 
                    System.exit(0); 
                    System.out.println("***== HAVE A Nice Day!==***");
                    break;

                  default:
                    System.out.println("Please Enter Valid Choice");
                    break; 
                }
                  System.out.println("==========================================");
                  System.out.println("Do you wish to order anything else(Y/N): ");
                  again=sc.next();
                  if(again.equalsIgnoreCase("Y")){
                     order();
                  }else if(again.equalsIgnoreCase("N")){
                     generateBill();
                     System.exit(1);
                  }else{
                     System.out.println("Invalid Choice");
                  }
            }        
        }
}
