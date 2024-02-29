import java.util.*;

public class toySelector
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    
    int nerfGun = 0;
    int dollHouse = 0;
    int videoGames = 0;

    String social;
    String imagination;
    String sports;
    String tech;
    String outOrIn;
    
    boolean repeat; 
    
    
    System.out.println("Do they like games that involve technology (yes or no)? "); 
    tech = keyboard.next();
    tech = tech.trim().toLowerCase();
    
    System.out.println("Do they like sports (yes or no)? ");
    sports = keyboard.next();
    sports = sports.trim().toLowerCase();

    System.out.println("Do they enjoy playing outside or inside? "); 
    outOrIn = keyboard.next();
    outOrIn = outOrIn.trim().toLowerCase();
    
    System.out.println("Do they like playing as different things or people (yes or no)? "); 
    imagination = keyboard.next();
    imagination = imagination.trim().toLowerCase();
    
    System.out.println("Do they prefer dressing up (yes or no)? "); 
    social = keyboard.next();
    social = social.trim().toLowerCase();
    
    if (tech.indexOf("yes") >= 0
               || tech.indexOf("Yes") >= 0)
    {    
        videoGames = videoGames + 1;
    }
    else if (tech.indexOf("no") >= 0
               || tech.indexOf("No") >= 0) {
        nerfGun = nerfGun + 1;
        dollHouse = dollHouse + 1;
    }
    
    if (sports.indexOf("yes") >= 0
               || sports.indexOf("Yes") >= 0)
    {    
        nerfGun = nerfGun + 1;
        videoGames = videoGames + 1;
    }
    else if (sports.indexOf("no") >= 0
               || sports.indexOf("No") >= 0) {
        dollHouse = dollHouse + 1;
    }
    
    if (outOrIn.indexOf("inside") >= 0
               || outOrIn.indexOf("Inside") >= 0) {    
        videoGames = videoGames + 1;
        dollHouse = dollHouse + 1;
    }
    else if (outOrIn.indexOf("outside") >= 0
               || outOrIn.indexOf("Outside") >= 0) {
        nerfGun = nerfGun + 1;
    }
    
    if (imagination.indexOf("yes") >= 0
               || imagination.indexOf("Yes") >= 0)
    {    
        dollHouse = dollHouse + 1;
    }
    else if (imagination.indexOf("no") >= 0
               || imagination.indexOf("No") >= 0) {
        nerfGun = nerfGun + 1;
        videoGames = videoGames + 1;
    }
    
    if (social.indexOf("yes") >= 0
             || social.indexOf("Yes") >= 0)
    {    
        dollHouse = dollHouse + 1;
    }
    else if (social.indexOf("no") >= 0
              || social.indexOf("No") >= 0) {
        videoGames = videoGames + 1;
        nerfGun = nerfGun + 1;
    }
    
    if (videoGames > nerfGun && videoGames > dollHouse){
        System.out.println("Based off of your selections, we would recommend a video game!");
    }
    else if (nerfGun > videoGames && nerfGun > dollHouse){
        System.out.println("Based off of your selections, we would recommend a nerf gun!");
    }
    else if (dollHouse > videoGames && dollHouse > nerfGun){
        System.out.println("Based off of your selections, we would recommend a dollhouse!");
    }
}
}