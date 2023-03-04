public class SynchronyRequestBuilderAdapter implements Isynchrony2RequestBuilder{
    
    IsynchronyRequestBuilder reqBuilderV1;

    public SynchronyRequestBuilderAdapter(){
        reqBuilderV1 = new SynchronyRequestBuilder();
    }


    public Isynchrony2Request buildRequest(String params){
    
        IsynchronyRequest reqV1 = reqBuilderV1.createRequest();
        Isynchrony2Request reqV2 = new SynchronyRequest();

        reqV2.setCardNumberLast4(reqV1.cardNum());
        reqV2.setCountryCode(reqV1.country());

        return reqV2;
    }
    
}
