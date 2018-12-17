import com.laoqixin.bean.Department;
import com.laoqixin.dao.DepartmentMapper;
import com.laoqixin.dao.EmployeeMapper;
import com.laoqixin.service.DepartmentService;
import com.laoqixin.service.EmployeeService;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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
    EmployeeMapper   employeeMapper;
    @Autowired
    EmployeeService  employeeService;
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    DepartmentService departmentService;
    SqlSession       sqlSession;

    /**
     * 测试EmployeeMapper
     */
//    @Test:成功
//    public void testMapper()
//    {
//        Employee employee = new Employee(3,"劳启新",18,1000.0,"开发部","开发");
//        employeeMapper.insert(employee);
//        System.out.println(employee.getEmpId());
//    }

    /**
     * 测试Service
     */
//    @Test :成功
//    public void testService()
//    {
//        Employee employee = employeeService.selectByPrimaryKey(1);
//        System.out.println(employee.getEmpName());
//    }
    /**
     * 测试ControllerMapper
     */
    @Test
    public void testMapper()
    {
//        Department       department = new Department();
        List<Department> list       = departmentService.selectAll();
        for(Department a : list) {
            System.out.println(a);
        }
    }
  }