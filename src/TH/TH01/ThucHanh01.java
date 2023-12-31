package TH.TH01;

public class ThucHanh01 {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] inlvalidEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid " + isValid);
        }

        for(String email : inlvalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid " + isValid);
        }
    }
}
