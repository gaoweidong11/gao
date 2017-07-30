package tcpIp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by 高伟冬 on 2017/7/30.
 * gao
 * 19:55
 * 星期日
 */
public class Address {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            String localhostname = ip.getHostName();
            String localip = ip.getHostAddress();
            System.out.println("本机名：" + localhostname);
            System.out.println("本机IP地址：" + localip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
