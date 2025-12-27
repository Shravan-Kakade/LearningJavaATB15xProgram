package ex_06_Java_TernaryOperator;

public class Lab041_TO_Age_Classification {
    //    Covered in this class - Lab068 - 24 DEC 2025
    public static void main(String[] args) {
//      Based on the age given of a person, need to check if user is minor, adult or senior citizen
//      age below 18 - minor, age above 60 - sr.citizen & in between adult
        System.out.println("Print the correct category of age of a person");
        String ageA = args[0];  // To extract the value of String in an Array
        System.out.println(ageA instanceof String); // to check if given variable is string or not
        int age = Integer.parseInt(ageA); // to convert the String into Integer
        System.out.println(age);
        String category = (age>18 && age>60)? "Person is Senior citizen":(age<18?"Person is Minor":"Person is Adult");
        System.out.println(category);
    }
}
