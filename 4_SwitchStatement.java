// For one Condition check via if and else
// for multistatement declare switch case statement
public class SwitchStatement {
   public static void main(String[] args) {
       int marks=60;
       switch(marks){
            case 10:
                System.out.println("Value is 10");
                break;
            case 20:
                System.out.println("Value is 20");
                break;
            case 30:
                System.out.println("Value is 30");
                break;
            case 40:
                System.out.println("Value is 40");
                break;
            case 50:
                System.out.println("Value is 50");
                break;
            // case 50: Duplicate case cant declare
            // case "sixty": Also You can't declare because it will dive you string to int error
            case 60:
                System.out.println("Value is 60");
                break;
            // YOu can decalre many cases bby short hand technique
            case 70: case 80: case 90: 
                System.out.println("Value is between 70 to 90");
            default:
                System.out.println("Value is not declared in switch statement");
                break;
       }
   } 
}
