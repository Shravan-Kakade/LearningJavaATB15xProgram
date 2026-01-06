package ex_09_Switch;

import java.util.Scanner;

public class Lab061_Switch_Real_Time {
/*  Covered in this class Lab087 - 05 Jan 2025
    Web Automation
    I will ask the user to give me the input for browser
    I will start the automation in that browser.
 */
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the browser that you want to use");
        String browser = sc.next();
        browser = browser.toLowerCase(); //String is converted to lower case because in switch statement lower case string is used
        switch (browser){
            case "chrome":
                System.out.println("Start Automation in Chrome Browser");
                System.out.println("Open a Browser Chrome");
                break;
            case "firefox":
                System.out.println("Start Automation in Mozilla Firefox");
                System.out.println("Open a Browser Firefox");
                break;
            case "edge":
                System.out.println("Start Automation in Edge");
                System.out.println("Open a Browser Edge");
                break;
            default:
                System.out.println("Provide valid browser name");
        }
    }
}
