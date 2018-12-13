import com.laoqixin.dao.EmployeeMapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 *  @项目名：  人员管理系统0.1
 *  @包名：    PACKAGE_NAME
 *  @文件名:   MapperTest
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/11 18:56
 *  @描述：    TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext.xml"} )
public class MapperTest {


    @Autowired
    EmployeeMapper employeeMapper;
    SqlSession sqlSession;

    /**
     * 测试Mapper
     */
//    @Test
//    public void testUser()
//    {
//       user user = mUserMapper.getUserById("laoqixin", "123");
//        System.out.println(user);
//    }
//    public void testprepareData()
//    {
//        Employee employee = new Employee();
//        employee.setEmpId(1);
//        employee.setEmpName("laoqxin");
//        employee.setEmpAge(1);
//        employee.setEmpDepart("人事");
//        employee.setEmpIncome(2000.0);
//        employee.setEmpPosition("人事部门");
//        employeeMapper.updateByPrimaryKey(employee);
//    }
  }