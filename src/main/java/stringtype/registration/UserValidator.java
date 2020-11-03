package stringtype.registration;

public class UserValidator {

    public boolean isValidUserName(String username) {
        boolean isValid = username.equals("") ? false : true;
        return isValid;
    }

    public boolean isValidPassword(String password1, String password2) {

        boolean isValid = ((password1.length() >= 8) && (password1.equals(password2))) ? true : false;
        return isValid;
    }

    public boolean isValidEmail(String email) {
        boolean condition1 = ( email.indexOf("@") != -1 ); //Van-e benne @ karakter?
        boolean condition2 = ( email.indexOf(".", (email.indexOf("@")+2)) != -1 ); //A @ után nem közvetlenül lennie kell .-nak
        boolean condition3 = ( email.indexOf("@") != 0 ); //@ nem lehet az első
        boolean condition4 = ( email.indexOf(".") != (email.length()-1) ); //. nem lehet az utolsó

        boolean isValid = condition1 && condition2 && condition3 && condition4;
        return isValid;
    }
}
