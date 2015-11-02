package com.example;

/**
 * Created by User on 11/2/2015.
 */
public class TheGoPro {
    int filmingDepth = 40;
    String pictureQuality = "Good"; //(Good, Moderate, Best)
    int framesPerSecond = 30;
    boolean requiresWifi = false;
    boolean requiresTouchScreen = false;
    boolean requiresOneButtonControl = false;

    public void setFilmingDepth(int fd)
    {
        filmingDepth = fd;
    }
    public void setPictureQuality(int pq)
    {
        //This converts the picture quality integer that the user enters to a word
        if (pq == 1)
        {
            pictureQuality = "Good";
        }
        else if (pq == 2)
        {
            pictureQuality = "Moderate";
        }
        else if (pq == 3)
        {
            pictureQuality = "Best";
        }
        else
        {
            System.out.println("Not an option");
        }
    }
    //This converts the integer the user enters into a speed
    public void setFramesPerSecond(int fps)
    {
        if (fps == 1)
        {
            framesPerSecond = 30;
        }
        else if (fps == 2)
        {
            framesPerSecond = 60;
        }
        else if (fps == 3)
        {
            fps = 430; //Abbreviated 4k30 which will function fine
        }
        else
        {
            fps = 10;
        }
    }
    //It's more natural to type n or y instead of true or false so I convert that input here
    public void setRequiresWifi(char wifi)
    {
        if ((wifi == 'N') || (wifi == 'n'))
        {
            requiresWifi = false;
        }
        else
        {
            requiresWifi = true;
        }
    }
    public void setRequiresTouchScreen(char touchScreen)
    {
        if ((touchScreen == 'n')||(touchScreen == 'N'))
        {
            requiresTouchScreen = false;
        }
        else
        {
            requiresTouchScreen = true;
        }
    }
    public void setRequiresOneButtonControl(char oneButton)
    {
       if ((oneButton == 'n')||(oneButton == 'N'))
       {
           requiresOneButtonControl = false;
       }
        else
       {
           requiresOneButtonControl = true;
       }
    }
    //This compares various criteria and chooses a good GoPro based on it.
    public void bestFitGoPro()
    {
        if ((filmingDepth == 40) && (pictureQuality == "Good") && (framesPerSecond == 30) && (requiresWifi == false)
                && (requiresTouchScreen == false) && (requiresOneButtonControl == false))
            System.out.println("You need the Hero");
        else if ((requiresWifi == true) && (requiresTouchScreen == false) && (requiresOneButtonControl == false))
        {
            System.out.println("You need the Hero+");
        }
        else if ((requiresTouchScreen == true) || (requiresWifi == true) && (pictureQuality == "Moderate"))
        {
            System.out.println("You need the Hero+ LCD");
        }
        else if ((requiresTouchScreen == true) || (requiresWifi == true) && (pictureQuality == "Best")
                && (framesPerSecond == 60))
        {
            System.out.println("You need the Hero4 Silver");
        }
        else if ((framesPerSecond == 430 ) && (requiresOneButtonControl == false))
        {
            System.out.println("You need the Hero4 Black");
        }
        else if ((requiresOneButtonControl == true))
        {
            System.out.println("You need the Hero4 Session");
        }
    }
}

