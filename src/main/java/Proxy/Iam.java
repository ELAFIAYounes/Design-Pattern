package Proxy;

public class Iam implements InternetServiceProvider{
    @Override
    public String serveSite(String url) {
        return String.format("https://%s.com",url);
    }
}
