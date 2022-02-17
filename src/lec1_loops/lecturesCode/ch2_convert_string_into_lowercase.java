package lec1_loops.lecturesCode;

public class ch2_convert_string_into_lowercase {
    public static void main(String[] args) {

//question:convert any string into lower case;

        String a= "ASDF JKL:";
        a = a.toLowerCase();

        System.out.println(a);
        System.out.println(  );//this is for spacing only


// problem 2: replace places to underscores in strings;

        String text = "to my college ";
        text = text.replace(" ","__");
        System.out.println(text);
        System.out.println(  );//this is for spacing only


// problem 3 write a letter template that
        // dear (name) thanks alot write this in custom name!

        String letter = "dear <|name|> thanks a lot " ;
        letter = letter.replace("<|name|>" ,"family" );
        System.out.println(letter);

//noteForYouuu: write a java noteForYouuu to detect double and triple spaces

        String mystring="this string  contains double spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //problem : write a noteForYouuu to escape sequence character:

        String myletter = "dear shantanu,\n\tyou are awesome,\n\t in charting! ";
        System.out.println(myletter);

        String g= "disco";
        System.out.println(g);//this is another way to print strings

    }
}


