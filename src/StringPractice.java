public class StringPractice
{
    static StringPractice stringPractice = new StringPractice();
    // crate an object for non-classic method

    //static area of main method
    public static void main(String []args)
    {
     stringPractice.concatenate( "Mira Patel and", "Mona Shah");
     stringPractice.contains("Mira Patel and", "and");
     stringPractice.removespecialsymbol( "£30.00 are not equal to £20.00", "30.00 are not equal to 20.00");
     stringPractice.stringendswith("Python Exercises", "Python Exercise", "se");
     stringPractice.compare("Stephen Edwin King", "Wailter Winchell", "stephen edwin king");
     extractnumber();
     length();
     startsWithOtherString();
     substring();
     replace();
    }

    //non-static method concatenate
     void concatenate(String one, String two)
     {
         System.out.println("String 1 : "+one);
         System.out.println("String 2 : "+two);
         System.out.println("The concatenated string : "+one+" "+two);
       //the concatenation of string 1 and 2
     }
     //non-static method contains
     void contains(String a, String b)

     {
         System.out.println("original string: "+a+"  "+b);
         //original string: Mira Patel and Mona Shah
         System.out.println("specified sequence of char values: "+b);
         //specified sequence of char values: and answer
         System.out.println(a.contains(b));
     }
     //non-static method removespeecialsymbol
     void removespecialsymbol(String a , String b)
     {
         System.out.println("old:"+ a); //a = sentence with symbol
         System.out.println("NEW:"+ a.replaceAll("£", ""));
          // sentence a replaces with sentence b
     }

     void stringendswith(String p, String q, String r)
     {
         boolean last1 = p.endsWith(r);
         boolean last2 = q.endsWith(r);
         System.out.println("\"" + p + "\" ends with " + "\"" + r + "\"? " + last1);
         System.out.println("\"" + q + "\" ends with " + "\"" + r + "\"? " + last2);
         //to check given string ends with another string
     }
     // non-static method compare
     void compare(String x, String y, String z)
     {
         boolean str1 = x.equals(y);
         boolean str2 = x.equalsIgnoreCase(z);
         System.out.println("\"" + x + "\" equals \" " + y + "\"?" + str1);
         System.out.println("\"" + x + "\" equals \" " + z + "\"?" + str2);
         //compare a given string to another string, ignoring case consideration
     }
     static void extractnumber()
     {
         String s = "Sarabhai77 dodia89 3636475 Tokyo";
         //old string
         System.out.println(s);
         System.out.println(s.replaceAll("\\D+", "" ));
         //extract numbers only from old string
     }

     static void length()
    {
        String s = "EXAMPLE.COM";
        int length = s.length();
        System.out.println(s);
        System.out.println("The string length of \""+s+"\" is : " + length);
        //11 is the length of given string

    }
    static void startsWithOtherString()
    {
        String m = "pasta is favourite food.";
        String n = "noodles is also favourite food.";
        String p = "pasta";
        boolean p1 = true;
        boolean  p2 = false;
        System.out.println(m +"starts with" + p + " ? " +p1);
        System.out.println(n +"starts with" + p + " ? " +p2);
        //check whether a given string starts with another string
    }
     static void substring()
     {
         String A = "The quick brown fox jumps over the lazy dog";
         String sub = A.substring(9, 26);
         System.out.println("old = " + A);
         System.out.println("New = " + sub);
         //substring of a given string at two specified positions
      }
      static void replace()
      {
          String M = "Madhuri Dixit Nene";
          String N = M.replace('i', 't');
          System.out.println("Old : " + M);
          System.out.println("New : " + N);
         //replace specific character
      }

}























