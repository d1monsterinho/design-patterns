package chainofresponsibility;

import chainofresponsibility.dto.User;

public class AuthNotificationWebHandler extends WebHandler {

    @Override
    public boolean handle(User user) {
        System.out.printf("Authentication attempt for %s role.%n", user.getRole());

        return checkHandleNext(user);
    }
}
