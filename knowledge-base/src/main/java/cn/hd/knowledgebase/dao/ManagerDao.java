package cn.hd.knowledgebase.dao;

import cn.hd.knowledgebase.entity.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/1/5 12:53
 * @package cn.hd.knowledgebase.dao
 */
public interface ManagerDao {

    public List<Manager> getAllManagers();

    public Manager getManager(@Param("mid") Integer mid, @Param("mname") String mname, @Param("mobile") String mobile);

    public int addManager(@Param("manager") Manager manager);

    public int deleteManager(@Param("mid") Integer mid);

    public int updateManager(@Param("mid") Integer mid, @Param("mname") String mname, @Param("mobile") String mobile, @Param("password") String password);

}
