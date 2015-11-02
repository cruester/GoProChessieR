//This program selects a GoPro based on your preferences
package com.example;

import java.util.Scanner;

public class SelectGoPro {
    public static void main(String args[])
    {
        int depth = 40; //underwater film depth in meters
        int quality = 1; //Picture quality
        int frames = 1; //Frames per second
        char wifi = 'N'; //Wifi and Bluetooth enabled
        char touch = 'N'; //Touch screen
        char button = 'N'; //One button start
        Scanner input = new Scanner(System.in);

        TheGoPro myGoPro = new TheGoPro();

        System.out.println("How far underwater (in meters) will you need to film? ");
        depth = input.nextInt();
        myGoPro.setFilmingDepth(depth);

        System.out.println("What sort of video quality would you like? ");
        System.out.println("Type 1 for good, 2 for moderate, 3 for best, and 4 for does not matter");
        frames = input.nextInt();
        myGoPro.setFramesPerSecond(frames);

        System.out.println("How high of quality does the picture need to be? ");
        System.out.println("Type 1 for Good, 2 for Moderate, or 3 for Best");
        quality = input.nextInt();
        myGoPro.setPictureQuality(quality);

        System.out.println("Would you like to start filming easily, at the push of a button? ");
        button = input.next().charAt(0);
        myGoPro.setRequiresOneButtonControl(button);

        System.out.println("Would you like an easy to use touch screen for navigating your" +
                " GoPro?");
        touch = input.next().charAt(0);
        myGoPro.setRequiresTouchScreen(touch);

        System.out.println("Are you interested in being able to upload your videos and images directly " +
                " from your GoPro with Wifi and Bluetooth? ");
        wifi = input.next().charAt(0);
        myGoPro.setRequiresWifi(wifi);
        myGoPro.bestFitGoPro();
    }
}
