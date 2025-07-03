package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ
     * @return PassswordStringth INVALID อื่นๆ
     */
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        int minLength = 8;
        boolean isLowerCase = false,isUperCase = false;
        if(password==null || password.length()<minLength)
            return PasswordStrength.INVALID;

        
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                isLowerCase = true;
            }
        }
        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                isUperCase = true;
            }
        }
        if(isLowerCase == true && isUperCase == true){
            return PasswordStrength.MEDIUM;
        }
         if(isLowerCase == true || isUperCase == true){
            return PasswordStrength.WEAK;
        } 
        if(isLowerCase == false && isUperCase == false){
            return PasswordStrength.STRONG;
        }
        return PasswordStrength.STRONG;
    }
}