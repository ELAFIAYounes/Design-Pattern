package Proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider{
    private List<String> blockedWebSite = Arrays.asList("facebook","youtube","instagram");

    @Override
    public String serveSite(String url) {
        internetLog(url);
        if(blockedWebSite.contains(url)) return "This Web Site is blocked !!";
        else return new Iam().serveSite(url);
    }

    private void internetLog(String url) {
        System.out.printf("[%d] -> %s requested \n",System.currentTimeMillis(),url);
    }
}
