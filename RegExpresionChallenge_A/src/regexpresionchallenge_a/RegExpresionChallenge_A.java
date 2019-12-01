/*
 
Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and 
assign it to the pattern such that it can be used to validate an IP address.
 */
package regexpresionchallenge_a;

/**
 *
 * @author giagkas
 */
public class RegExpresionChallenge_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyRegex r1 = new MyRegex();
        System.out.println(r1.validateIP("000.12.12.034"));
        System.out.println(r1.validateIP("121.234.12.12"));
        System.out.println(r1.validateIP("23.45.12.56"));
        System.out.println(r1.validateIP("000.12.234.23.23"));
        System.out.println(r1.validateIP("666.666.23.23"));
        System.out.println(r1.validateIP(".213.123.23.32"));
        System.out.println(r1.validateIP("23.45.22.32."));
        System.out.println(r1.validateIP("I.Am.not.an.ip"));
        //String r="((0?0?[1-9])|(0?[1-9][0-9])|(1[0-9]{2})|(2[0-4][0-9])|(25[0-5]))\\.((0?0?[1-9])|(0?[1-9][0-9])|(1[0-9]{2})|(2[0-4][0-9])|(25[0-5]))";
        //System.out.println("12.034".matches(r));
    }
    
}
