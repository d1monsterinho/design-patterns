package chainofresponsibility;

import chainofresponsibility.dto.User;

import static chainofresponsibility.Credentials.*;

public class AuthorizationWebHandler extends WebHandler {

    @Override
    public boolean handle(User user) {
        if (user.getRole().equals(ADMIN_ROLE)) grantAdminAuthorities();
        else if (user.getRole().equals(USER_ROLE)) grantUserAuthorities();

        return checkHandleNext(user);
    }

    private void grantAdminAuthorities() {
        System.out.println("Admin role user has been granted with admin authorities.");
    }

    private void grantUserAuthorities() {
        System.out.println("User role user has been granted with admin authorities.");
    }
}
