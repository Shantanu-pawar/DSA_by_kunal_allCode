package lec1_loops.lecturesCode;

public class ch3_strings_methods {
    public static void main(String[] args) {

        String a = "shantanupawar";
//
        int value= a.length();
        System.out.println(value);

//        String lstring =a.toLowerCase();
//        System.out.println(lstring);
//
        String ustring = a.toUpperCase();
        System.out.println(ustring);



        String nonTrimmedstring="   eluuuu";
        System.out.println(nonTrimmedstring);

        String trimmedString= nonTrimmedstring.trim();
        System.out.println(trimmedString);

        //the substring is used in two types
        System.out.println(a.substring(5));

        System.out.println(a.substring(1,9));


        //this type of string is helps to change the characters in other words
        System.out.println(a.replace('a','s'));

        System.out.println(a.replace("a","inga"));

        System.out.println(a.startsWith("sha"));
        //this type of string is helps to identify the starting of string

        System.out.println(a.endsWith("dadu"));
        //this type of string is helps to identify the end of string

        System.out.println(a.charAt(5));
        //this type of string is helps to identify the charcter of string by using this number;

        System.out.println(a.indexOf("p"));
        //this type of string is helps to identify 1st index of this strings

        System.out.println(a.equalsIgnoreCase("sHANtanupawar"));
        //this type of string is helps to ignore of what case of letter is it only focus on values

    }

}
