package chainofresponsibility;

import chainofresponsibility.dto.User;

public abstract class WebHandler {
    private WebHandler nextWebHandler;

    public static WebHandler createWebHandlerChain(WebHandler firstHandler, WebHandler... chain) {
        WebHandler chainHead = firstHandler;

        for (WebHandler currentHandler : chain) {
            chainHead.setNextWebHandler(currentHandler);
            chainHead = currentHandler;
        }

        return firstHandler;
    }

    public abstract boolean handle(User user);

    boolean checkHandleNext(User user) {
        if (nextWebHandler == null) {
            return true;
        } else {
            return nextWebHandler.handle(user);
        }
    }

    public void setNextWebHandler(WebHandler nextWebHandler) {
        this.nextWebHandler = nextWebHandler;
    }
}
