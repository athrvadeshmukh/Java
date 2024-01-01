package Game;
import java.util.*;

class Guesser
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser Kindly guess the integer type number ");
        guessNum= scan.nextInt();
        return guessNum;
    }


}

class Player
{   int guessNum;
    int guessingNumber()
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Players Kindly guess the integer type number ");
    guessNum= scan.nextInt();
    return guessNum;

    }
}

class Umpire 
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

        void collectNumFromGuesser()
    {
        Guesser g = new Guesser();
        g.guessingNumber();
        numFromGuesser = g.guessingNumber();

    }

        void collectNumFromPlayers()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1  = p1.guessingNumber();
        numFromPlayer2  = p2.guessingNumber();
        numFromPlayer3  = p3.guessingNumber();

    }

        void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("You all are winmners");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 and 2 are winners");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 1 and 3 are winners");
            }
            else
            {
                System.out.println("Player 1 Won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("PLayer 2 and 3 are winners");
            }
            else
            {
                System.out.println("Player 2 won the game");
            }
        }
        else if (numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 3 won the game");
        }
        else
        {
            System.out.println("no one won the game");
        }
    }

}

public class Launch1 

{   
    public static void main(String[] args)
    {
        System.out.println("Game Started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    
    }

}
/* If any problem arises in running this code then type this command in the terminal to run this code */
// javac Game/Launch1.java
//java Game.Launch1