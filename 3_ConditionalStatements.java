public class ConditionalStatements {
    public static void main(String[] args) {
        //Here We will see What is the Condition Statements in Java.
        /*
        If-Else
        If-elseif-else
        switch statements
        */
        //In This Program We Will Find The Given Number Is Even Or Odd.
        int number =10;
        if(number%2 == 0){
            System.out.println("Number is Even");
        }
        else{ // Do not Declare Condition in Else Block
            System.out.println("Number is Odd");
        }

        //If-ElseIf-else
        //Lets Find Biggest One In Three Numbers
        int a=2; //In Java You Can Declare and define Variables Anywhere.
        int b=3;
        int c=1;
        if(a>b && a>c){
            System.out.println("A is Bigger.");
        }
        else if(b>a && b>c){
            System.out.println("B is Bigger.");
        }
        else{
            System.out.println("C is the Biggest one.");
        }

        //In java you cant pass the integer value in if condition 
        // if(1){
        //     System.out.println("Hello World");
        // }
        // And You can Commment The Line By Command: (Ctrl+/) .
        //Because java has a datatype Boolean by that type you can true/false the condition.
        if(true){
            System.out.println("In this if statement we had given the boolean Condition.");
        }
        
    System.out.println("Thanks For Watching Our Video.");
    }
}

