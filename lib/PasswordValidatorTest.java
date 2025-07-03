package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected INVALID but got " + result1);
        }
        // --- เขียน Test Case อื่นๆ ต่อ ---
        pw = "aaaaaaaa";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed: All LowerCase password is WEAK.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected WEAK but got " + result2);
        }
        pw = "AAAAAAAA";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed: All UpperCase password is WEAK.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected WEAK but got " + result3);
        }
        pw = "PooHfdDOOL";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 2 : "+pw+" : Passed: All LowerCase and Uppercase password is MEDIUM.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected MEDIUM but got " + result4);
        }
        pw = "!@#$%^&*";
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 2 : "+pw+" : Passed: Password is STRONG.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected STRONG but got " + result5);
        }

        System.out.println("--------------------------------");
    }
}
