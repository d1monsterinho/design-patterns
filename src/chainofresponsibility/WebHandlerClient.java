package chainofresponsibility;

import chainofresponsibility.dto.User;

public class WebHandlerClient {
    public void auth() {

        WebHandler firstWebHandlerChain = WebHandler.createWebHandlerChain(
                new AuthNotificationWebHandler(),
                new AuthenticationWebHandler(),
                new AuthorizationWebHandler()
        );

        User admin = new User("admin", "admin_p");
        firstWebHandlerChain.handle(admin);

        User user = new User("user", "user_p");
        firstWebHandlerChain.handle(user);

        User invalidUser = new User("anon", "anon_p");
        firstWebHandlerChain.handle(invalidUser);
    }
}
