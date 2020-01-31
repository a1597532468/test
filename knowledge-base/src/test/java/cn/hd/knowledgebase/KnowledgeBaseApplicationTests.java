package cn.hd.knowledgebase;

import cn.hd.knowledgebase.dao.ManagerDao;
import cn.hd.knowledgebase.entity.Manager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledgeBaseApplicationTests {

    @Resource
    private ManagerDao managerDao;

    @Test
    public void contextLoads() {
        List<Manager> allManagers = managerDao.getAllManagers();
        for (Manager m:allManagers ) {
            System.out.println(m);
        }
    }

    @Test
    public void contextLoads1() {
        Manager manager = managerDao.getManager(1, null, null);
        System.out.println(manager);

    }

    @Test
    public void contextLoads2() {
        Manager manager1 = new Manager();
        manager1.setMname("111123");
        manager1.setMobile("123124343");
        int i = managerDao.addManager(manager1);
        System.out.println(i);

    }
    @Test
    public void contextLoads3() {
        int i = managerDao.deleteManager(8);
        System.out.println(i);
    }
    @Test
    public void contextLoads4() {
        int dsds = managerDao.updateManager(6, "dsds", "111111111", "2222222");
        System.out.println(dsds);
    }



}

