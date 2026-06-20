package chainofresponsibility;

import chainofresponsibility.dto.User;

import static chainofresponsibility.Credentials.*;

public class AuthenticationWebHandler extends WebHandler {

    @Override
    public boolean handle(User user) {
        if (authenticate(user)) {
            return checkHandleNext(user);
        } else {
            return false;
        }
    }

    private boolean authenticate(User user) {
        if (user.getRole().equals(ADMIN_ROLE) && user.getPassword().equals(ADMIN_PASSWORD) ||
                user.getRole().equals(USER_ROLE) && user.getPassword().equals(USER_PASSWORD)) {
            System.out.printf("Successful authentication for %s role.%n", user.getRole());
            return true;
        } else {
            System.out.printf("Failed authentication attempt. Invalid role or password. Entered role: %s.%n", user.getRole());
            return false;
        }
    }
}
