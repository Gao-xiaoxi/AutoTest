package group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
    @Test(groups = "server")
    public void Test1(){
        System.out.println("这是服务端组测试1");
    }
    @Test(groups = "server")
    public void Test2(){
        System.out.println("这是服务端组测试2");
    }
    @Test(groups = "client")
    public void Test3(){
        System.out.println("这是客户端组测试1");
    }
    @Test(groups = "client")
    public void Test4(){
        System.out.println("这是客户端组测试2");
    }
    @BeforeGroups("server")
    public void Test5(){
        System.out.println("服务端组运行之前");
    }
    @AfterGroups("server")
    public void Test6(){
        System.out.println("服务端组运行之后");
    }
}
