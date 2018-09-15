import com.lihoo.jnshu.dao.StudentInfoDOMapper;
import com.lihoo.jnshu.dao.StudentListDOMapper;
import com.lihoo.jnshu.model.StudentInfoDO;
import com.lihoo.jnshu.model.StudentInfoDOExample;
import com.lihoo.jnshu.model.StudentListDO;
import com.lihoo.jnshu.model.StudentListDOExample;

import com.lihoo.jnshu.service.StudentInfoDOService;
import com.lihoo.jnshu.service.StudentListDOService;
import com.lihoo.jnshu.util.Log2Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * #Title: StusListTest
 * #ProjectName task6_index2
 * #Description: TODO
 * #author lihoo
 * #date 2018/9/15-10:19
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class StusListTest {

    @Autowired(required = false)
    StudentListDOService studentListDOService;

    @Autowired
    StudentListDOMapper studentListDOMapper;

    @Autowired
    StudentInfoDOService studentInfoDOService;

    @Autowired
    StudentInfoDOMapper studentInfoDOMapper;

    @Test
    public void CRUDTest() {
        StudentListDOExample doExample = new StudentListDOExample();
//        doExample.createCriteria().andUsernameEqualTo("安度因");
        doExample.or().andTeachBroEqualTo("舞厅鸭Bill");
        List<StudentListDO> listDOS = studentListDOService.selectByExample(doExample);
        Log2Util.logger.info("-------------------------------------------------------");
        for (StudentListDO stu : listDOS) {
            Log2Util.logger.info(stu);
        }
        Log2Util.logger.info("-------------------------------------------------------");
    }

    @Test
    public void findAll() {
        StudentInfoDOExample doExample = new StudentInfoDOExample();
        doExample.or().getAllCriteria();
        List<StudentInfoDO> lista = studentInfoDOMapper.selectByExample(doExample);
        Log2Util.logger.info("-------------------------------------------------------");
        for (StudentInfoDO stu : lista) {
            Log2Util.logger.info(stu);
        }
        Log2Util.logger.info("-------------------------------------------------------");
    }

    @Test
    public void findAll2() {
        StudentInfoDOExample doExample = new StudentInfoDOExample();
        List<StudentInfoDO> list = studentInfoDOService.selectByExample(doExample);
        Log2Util.logger.info("-------------------------------------------------------");
        for (StudentInfoDO stu : list) {
            Log2Util.logger.info(stu);
        }
        Log2Util.logger.info("-------------------------------------------------------");
    }


}
