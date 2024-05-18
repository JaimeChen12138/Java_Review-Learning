package Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_ {

  public static void main(String[] args) throws UnknownHostException {
    // 1) get 本机的 InetAddress obj
    InetAddress localHost = InetAddress.getLocalHost();
    System.out.println(localHost);

    //2)根据指定主机名  get InetAddress obj
    // InetAddress.getByName();

    //3) based on domain name  return InetAddress obj, return domain name and ip
    InetAddress host2 = InetAddress.getByName("www.google.com");
    System.out.println(host2);

    //4) based on InetAddress obj, => get the IP address
    System.out.println(host2.getHostAddress());

    //5) based on InetAddress obj to get 主机名/domain name
    System.out.println(host2.getHostName());
  }

}
