package Proxy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> webSites = Arrays.asList("maroctelecom","facebook","twitter","instagram","youtube");

        InternetServiceProvider isp =  new InternetProxy();

        for(String site : webSites){
            System.out.println(isp.serveSite(site));
        }
    }
}
