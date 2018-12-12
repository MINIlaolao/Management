import com.laoqixin.controller.UserController;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/*
 *  @项目名：  renyuanguanlixitong0.2
 *  @包名：    PACKAGE_NAME
 *  @文件名:   TestController
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/13 0:02
 *  @描述：    TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class TestController extends TestCase {
    @Autowired
    private UserController userController;
    private MockMvc mockMvc;

    @Before
    public void setup()
    {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void testUserController() throws Exception
    {
        //userId或userPassword错误
//        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post("/signOn")
//                                      .param("userId","laoqixin").param("userPassword","12"));
        //userId或userPassword正确
        ResultActions resultActions1 = this.mockMvc.perform(MockMvcRequestBuilders.post("/signOn")
                                      .param("userId","laoqixin").param("userPassword","123"));
        MvcResult mvcResult = resultActions1.andReturn();
        System.out.println(mvcResult.getResponse()
                                    .getForwardedUrl());
        System.out.println(mvcResult.getResponse()
                                    .getRedirectedUrl());
        System.out.println(mvcResult.getResponse()
                                    .getStatus());
    }
}
