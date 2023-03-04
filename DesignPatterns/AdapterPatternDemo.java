import java.security.cert.Extension;

public class AdapterPatternDemo {
    public static void main(String[] args){
        ExtendedAccountDetailsProvider acct = new ExtendedAccountDetailsProvider();

        acct.getExtendedAccountDetails();
    };
}
