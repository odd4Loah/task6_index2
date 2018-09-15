import com.lihoo.jnshu.dao.StudentListDOMapper;
import com.lihoo.jnshu.model.StudentListDO;
import com.lihoo.jnshu.model.StudentListDOExample;
import com.lihoo.jnshu.service.StudentListDOService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
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

    private static Logger logger = LogManager.getLogger(StusListTest.class);

//    @Autowired(required = false)
//    StudentListDOService studentListDOService;

    @Autowired
    StudentListDOMapper studentListDOMapper;

    @Test
    public void CRUDTest() {
        logger.info("*****************************************");
        StudentListDOExample doExample = new StudentListDOExample();
        doExample.createCriteria().andUsernameEqualTo("黄苏威");
        List<StudentListDO> listDOS = studentListDOMapper.selectByExample(doExample);
        System.out.println(listDOS);
        for (StudentListDO stu : listDOS) {
            logger.info(stu);
        }
        logger.info("*****************************************");
        System.out.println("*****************************************");
    }
}
