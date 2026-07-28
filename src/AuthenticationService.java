public class AuthenticationService {
    public static interface IAuthenticationService {
        User signUp(String username, String password);
        User logIn(String username, String password);
    }
}
