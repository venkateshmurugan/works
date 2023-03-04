public class SynchronyConnectorServ {
    
    Isynchrony2RequestBuilder synchrony2RequestBuilder;
    SynchronyConnector synchronyConnector;

    public SynchronyConnectorServ(){
        synchrony2RequestBuilder = new SynchronyRequestBuilderAdapter();
        synchronyConnector = new SynchronyConnector();
    }

    public void processPayment(String requestParams){
        //Class from SDK

        Isynchrony2Request request = synchrony2RequestBuilder.buildRequest(requestParams);
        synchronyConnector.process(request);
    }
}
