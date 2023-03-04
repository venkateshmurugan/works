public class BuilderPatternDemo {
    
    public static void main(String[] args){
        
        HttpEndPoint endPoint = new HttpEndPoint.Builder().
                                setHostname("www.fidelity.com").
                                setProtocol("https").
                                setURI("/customer-service/faqs").
                                build();
        
        System.out.print(endPoint.toString());
    }
}
