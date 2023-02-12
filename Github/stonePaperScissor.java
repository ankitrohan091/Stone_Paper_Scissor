import java.util.Scanner;
import java.util.Random;
public class stonePaperScissor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int turn=1;
        int user_win=0;
        int comp_win=0;
      while(turn<=5)
      {//you can also use for loop
        System.out.println("\nTurn Number : "+turn);
        System.out.print("Enter Your Choice(Stone,Paper,Scissor) : ");
        String user=sc.next();
        user=user.toLowerCase();
        int comp=rand.nextInt(3);
        //Here you cannot use ==(equal to) operator beacuse you take string input from user
        if(comp==1 && user.equals("stone"))
        {
            System.out.println("Computer Turn is : Paper");
            System.out.println("So, You Lose this turn!");
            turn+=1;
            comp_win+=1;
        }
        else if(user.equals("stone") && comp==2){
            System.out.println("Computer Turn is : Scissor");
            System.out.println("So, You Win this turn!");
            turn+=1;
            user_win+=1;
          }
        else if(user.equals("stone") && comp==0){
            System.out.println("Computer Turn is : Stone");
            System.out.println("So,This turn is Draw!");
            //turn+=1;
          }
       else if(user.equals("paper") && comp==0){
            System.out.println("Computer Turn is : Stone");
            System.out.println("So, You Win this turn!");
            turn+=1;
            user_win+=1;
          }
       else if(user.equals("paper") && comp==1){
            System.out.println("Computer Turn is : Paper");
            System.out.println("So,This turn is Draw!");
            //turn+=1;
          }
       else if(user.equals("paper") && comp==2){
            System.out.println("Computer Turn is : Scissor");
            System.out.println("So, You Lose this turn!");
            turn+=1;
            comp_win+=1;
          }
       else if(user.equals("scissor") && comp==0){
            System.out.println("Computer Turn is : Stone");
            System.out.println("So, You Lose this turn!");
            turn+=1;
            comp_win+=1;
          }
      else if(user.equals("scissor") && comp==1){
            System.out.println("Computer Turn is : Paper");
            System.out.println("So, You Win this turn!");
            turn+=1;
            user_win+=1;
          }
      else if(user.equals("scissor") && comp==2){
            System.out.println("Computer Turn is : Scissor");
            System.out.println("So,This turn is Draw!");
            //turn+=1;
          }
      else {
        System.out.println("You Entered wrong input !");
      }
        }//End of while
        if(comp_win>user_win){ //To decide the winner
            System.out.println("\nScore is : "+user_win +":"+comp_win);
            System.out.println("\n**Sorry,You Lose the Match!**");
        }
        else if(comp_win==user_win){
            System.out.println("\nScore is : "+user_win +":"+comp_win);
            System.out.println("\n**Match is Draw!**");
        }
        else {
            System.out.println("\nScore is : "+user_win +":"+comp_win);
            System.out.println("\n******Congratulations,You Win the Match!******");
        }
        sc.close();
    }//end of main
}//End of class