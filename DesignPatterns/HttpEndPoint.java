final public class HttpEndPoint {
    final private String hostname;
    final private String protocol;
    final private String URI;
    final private String fullURL;

    public String getHostname() {
        return hostname;
    }

    @Override
    public String toString() {
        return "HttpEndPoint [hostname=" + hostname + ", protocol=" + protocol + ", URI=" + URI + ", fullURL=" + fullURL
                + "]";
    }

    public String getProtocol() {
        return protocol;
    }

    public String getURI() {
        return URI;
    }

    public String getFullURL() {
        return fullURL;
    }

    private HttpEndPoint(Builder builder){
        this.hostname = builder.hostname;
        this.protocol = builder.protocol;
        this.URI = builder.URI;
        this.fullURL = protocol + "://" + hostname + URI;
    }

    public static class Builder{
        private String hostname;
        private String protocol;
        private String URI;
    
        public static Builder newInstance(){
            return new Builder();
        }

        public Builder setHostname(String hostname){
            this.hostname = hostname;
            return this;
        }

        public Builder setProtocol(String protocol){
            this.protocol = protocol;
            return this;
        }

        public Builder setURI(String URI){
            this.URI = URI;
            return this;
        }

        public HttpEndPoint build(){
            return new HttpEndPoint(this);
        }

    }

}
