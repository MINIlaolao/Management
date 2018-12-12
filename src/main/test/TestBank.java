import com.laoqixin.bean.User;
import com.laoqixin.dao.UserMapper;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  @项目名：  renyuanguanlixitong0.2
 *  @包名：    PACKAGE_NAME
 *  @文件名:   TestBank
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/12 18:35
 *  @描述：    测试接口
 */
public class TestBank extends TestCase {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void testUserDao()
    {
        UserMapper dao = (UserMapper) context.getBean("userMapper");
        User user = dao.findUser("laoqixin","123");
        System.out.println(user.getId());
    }
}
