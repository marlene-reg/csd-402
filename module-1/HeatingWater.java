/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author marle
 */
import java.util.Scanner;

public class HeatingWater {
  public static void main(String[] args) {
    System.out.println("Hello World");
    Scanner scanner = new Scanner(System.in);

    // Taking float input
    System.out.println("Enter amount of water in kg:");
    float waterMass = scanner.nextFloat();

    // Taking float input
    System.out.println("Enter initial temperature in celsius:");
    float initialTemperature = scanner.nextFloat();

    // Taking float input
    System.out.println("Enter final temperature in celsius:");
    float finalTemperature = scanner.nextFloat();

    // Displaying the inputs
    System.out.println("Amount of Water: " + waterMass + " kg");
    System.out.println("Initial Temperature: " + initialTemperature + " Celsius");
    System.out.println("Final Temperature: " + finalTemperature + " Celsius");

    System.out.println("Energy required: " + waterMass * (finalTemperature - initialTemperature) * 4184 + " Joules");
  }
}




