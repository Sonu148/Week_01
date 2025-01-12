import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a 6-digit number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areUniqueOTPs(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        
        // Add each OTP to the set, if it is already present, return false
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false; // Duplicate found
            }
        }
        
        // If all OTPs are unique, return true
        return true;
    }

    public static void main(String[] args) {
        // Array to store the OTP numbers generated 10 times
        int[] otps = new int[10];
        
        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        
        // Display the OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if the OTP numbers are unique
        boolean unique = areUniqueOTPs(otps);
        
        // Display result
        if (unique) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are duplicated.");
        }
    }
}
