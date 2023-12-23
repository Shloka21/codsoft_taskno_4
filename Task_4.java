import java.util.Scanner;

class Task_4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c1,c2;
        double total,amt;
        System.out.println("*****CURRENCY CONVERTER*****");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("***Select The Base Currency***");
        System.out.println("");
        System.out.println("");
        System.out.println("1] Rupees");
        System.out.println("2] U.S Dollar");
        System.out.println("3] Euro");
        System.out.println("4] Japanese Yen");
        System.out.println("");
        c1=sc.nextInt();
        if(c1==1)
        {
            System.out.println("Your Have Selected Your Base Currency:Rupees");
             System.out.println("");
        }
        else if(c1==2)
        {
            System.out.println("Your Have Selected Your Base Currency:U.S Dollars");
             System.out.println("");
        }
         else if(c1==3)
        {
            System.out.println("Your Have Selected Your Base Currency:Euros");
             System.out.println("");
        }
         else if(c1==4)
        {
            System.out.println("Your Have Selected Your Base Currency:Japanese Yen");
             System.out.println("");
        }
         else
        {
            System.out.println("Select Valid Option");
             System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("***Select The Target Currency***");
        System.out.println("");
        System.out.println("");
        System.out.println("1] Rupees");
        System.out.println("2] U.S Dollar");
        System.out.println("3] Euro");
        System.out.println("4] Japanese Yen");
        System.out.println("");
        c2=sc.nextInt();
        if(c1==1)
        {
            System.out.println("Your Have Selected Your Target Currency:Rupees");
             System.out.println("");
        }
        else if(c1==2)
        {
            System.out.println("Your Have Selected Your Target Currency:U.S Dollars");
             System.out.println("");
        }
         else if(c1==3)
        {
            System.out.println("Your Have Selected Your Target Currency:Euros");
             System.out.println("");
        }
         else if(c1==4)
        {
            System.out.println("Your Have Selected Your Target Currency:Japanese Yen");
             System.out.println("");
        }
         else
        {
            System.out.println("Select Valid Option");
             System.out.println("");
        }
        System.out.println("Enter Amount:");
        amt=sc.nextDouble();
        System.out.println("");
        System.out.println("");
        if(c1==1 && c2==1)
        {
            System.out.println("Rupees:" + amt);
            System.out.println("Rupees:" + amt);
            System.out.println("");
            System.out.println("");
        }
       else if(c1==1 && c2==2)
        {
            total=amt*0.012;
            System.out.println("Rupees:" + amt);
            System.out.println("U.S Dollar:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==1 && c2==3)
        {
            total=amt*0.011;
            System.out.println("Rupees:" + amt);
            System.out.println("Euros:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==1 && c2==4)
        {
            total=amt*1.76;
            System.out.println("Rupees:" + amt);
            System.out.println("Japanese Yen:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==2 && c2==1)
        {
            total=amt*83.26;
            System.out.println("U.S Dollar:" + amt);
            System.out.println("Rupees:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==2 && c2==2)
        {
            total=amt*1;
            System.out.println("U.S Dollar:" + amt);
            System.out.println("U.S Dollar:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==2 && c2==3)
        {
            total=amt*0.92;
            System.out.println("U.S Dollar:" + amt);
            System.out.println("Euros:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==2 && c2==4)
        {
            total=amt*146.81;
            System.out.println("U.S Dollar:" + amt);
            System.out.println("Japanese Yen:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==3 && c2==1)
        {
            total=amt*90.59;
            System.out.println("Euros:" + amt);
            System.out.println("Rupees:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==3 && c2==2)
        {
            total=amt*1.09;
            System.out.println("Euros:" + amt);
            System.out.println("U.S Dollar:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==3 && c2==3)
        {
            total=amt*1;
            System.out.println("Euros:" + amt);
            System.out.println("Euros:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==3 && c2==4)
        {
            total=amt*159.74;
            System.out.println("Euros:" + amt);
            System.out.println("Japanese Yen:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==4 && c2==1)
        {
            total=amt*0.57;
            System.out.println("Japanese Yen:" + amt);
            System.out.println("Rupees:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==4 && c2==2)
        {
            total=amt*0.0068;
            System.out.println("Japanese Yen:" + amt);
            System.out.println("U.S Dollar:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==4 && c2==3)
        {
            total=amt*0.0063;
            System.out.println("Japanese Yen:" + amt);
            System.out.println("Euros:" + total);
            System.out.println("");
            System.out.println("");
        }
        else if(c1==4 && c2==4)
        {
            total=amt*1;
            System.out.println("Japanese Yen:" + amt);
            System.out.println("Japanese Yen:" + total);
            System.out.println("");
            System.out.println("");
        }
        else
        {
            System.out.println("Select Valid Currency!!");
        }
    }
}