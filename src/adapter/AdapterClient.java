package adapter;

public class AdapterClient {

    public void plug(EuPlug euPlug) {
        euPlug.plug();
        //some additional work e.g logging etc.
    }
}
