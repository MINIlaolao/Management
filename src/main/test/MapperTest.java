import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
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

//    @Autowired
//    employeeBeanMapper   emp;
//    @Autowired
//    departmentBeanMapper dept;
//    @Autowired
//    positionBeanMapper   pot;
//    @Autowired
//    userMapper mUserMapper;
    @Autowired
//    employeeMapper emp;
    SqlSession sqlSession;
    /**
     * 测试Mapper
     */
    @Test
//    public void testUser()
//    {
//       user user = mUserMapper.getUserById("laoqixin", "123");
//        System.out.println(user);
//    }
    public void testprepareData()
    {
//                System.out.println(dept);
////                1.插入部门:成功
//                dept.insertSelective(new departmentBean(7, "软测部门"));
//                dept.insertSelective(new departmentBean(8, "软测部门"));

//                2.生成一个员工:成功
//                emp.insert(new employee(
//                        8,"劳启新",19,1000.0,
//                        "出品","出品部"));
//        System.out.println("成功");
        //
//                3.批量插入员工 使用sqlSession操作:失败 需创建额外的sqlSession
//                  employeeBeanMapper mapper = sqlSession.getMapper(employeeBeanMapper.class);
//                  for(int i = 0;i<1000;i++)
//                  {
//                      String empname = UUID.randomUUID().toString().substring(0, 5)+i;
//                      mapper.insert(new employeeBean(null, empname,19,10000.0,"打杂","打杂部门"));
//                  }
            }


        //    private SqlSessionFactory SqlSessionFactory;
        //    @Before
        //    public void setUp() throws IOException
        //    {
        //        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        //        SqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //    }
        //    @Test
        //    public void testEmployeeById()
        //    {
        //        SqlSession session = SqlSessionFactory.openSession();
        //        employeeBeanMapper mapper = session.getMapper(employeeBeanMapper.class);
        //        employeeBean employee = mapper.selectByPrimaryKey(2);
        //        System.out.println(employee.getEmpId() + "," + employee.getEmpName() + "," + employee.getEmpAge()
        //                                   + "," + employee.getEmpIncome() + "," + employee.getEmpDepart() + "," +
        //                                   employee.getEmpPosition());
        //        session.close();
        //    }
        //}
//    }
  }