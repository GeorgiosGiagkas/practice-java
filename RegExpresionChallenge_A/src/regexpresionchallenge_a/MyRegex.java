/*
 
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. 
Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
 */
package regexpresionchallenge_a;

/**
 *
 * @author giagkas
 */
public class MyRegex {
    private String IPValidationPattern="^((000)|(0?0?[1-9])|(0?[1-9][0-9])|(1[0-9]{2})|(2[0-4][0-9])|(25[0-5]))\\.((0?0?[1-9])|(0?[1-9][0-9])|(1[0-9]{2})|(2[0-4][0-9])|(25[0-5]))\\.((0?0?[1-9])|(0?[1-9][0-9])|(1[0-9]{2})|(2[0-4][0-9])|(25[0-5]))\\.((0?0?[1-9])|(0?[1-9][0-9])|(1[0-9]{2})|(2[0-4][0-9])|(25[0-5]))$";
    
    public boolean validateIP(String ip){
        if(ip.matches(this.IPValidationPattern))    return true;
        return false;
    }
}
