package Day21;

public class WakeUpTask1_NamePrinter {

    public static void main(String[] args) {
        //               012345678901234567890
        String myName = "My name is Seyma Unal" ;

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount -1 ;
        System.out.println("lastCharIndex = " + lastCharIndex);
         // 01234
        // Hello
        // System.out.println(myName.substring(0,1));H
        // System.out.println(myName.substring(1,2));e
        // System.out.println(myName.substring(2,3));l
        // System.out.println(myName.substring(3,4));l
        // System.out.println(myName.substring(4,5));o

        // 01234
        // Hello
        // int x = 0;
        // System.out.println(myName.substring(x,x+1));H
        // ++ x ; 1
        // System.out.println(myName.substring(x,x+1));E
        // ++ x ; 2
        // System.out.println(myName.substring(x,x+1));l
        // ++ x ; 3
        // System.out.println(myName.substring(x,x+1));l
        // ++ x ; 4
        // System.out.println(myName.substring(x,x+1));o

        // for hello example: there is two way to represent when do we keep looping
        // if the x value is less than or equal to 4 x <=4
        // if the x value is less than 5 , x <5


        System.out.println("---1 char ---");
        //for (int x = 0; x < charCount ; x++){
        for (int x = 0; x <= lastCharIndex ; x++) {

            // System.out.println( myName.charAt(x) + "-->" );
            System.out.print(myName.substring(x, x + 1) + "-->");
        }

        System.out.println("------");
        System.out.println("---2 chars ---");
        for (int x = 0; x <= lastCharIndex-1 ; x++) {
        //for (int x = 0; x <= charCount-2 ; x++) {

            String twoChar = myName.substring(x, x+2);
            System.out.print( twoChar + "-->" );
        }
        System.out.println("-------");
        System.out.println("---3 chars ---");
        for (int x = 0; x <= lastCharIndex-2 ; x++) {
            //for (int x = 0; x < charCount-3 ; x++) {

            String threeChar = myName.substring(x, x+3);
            System.out.println(threeChar + "-->");

        }


    }
}
