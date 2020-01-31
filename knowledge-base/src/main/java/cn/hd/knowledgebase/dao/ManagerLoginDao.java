package cn.hd.knowledgebase.dao;

import cn.hd.knowledgebase.entity.Manager;
import org.apache.ibatis.annotations.Param;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/1/6 17:29
 * @package cn.hd.knowledgebase.dao
 */
public interface ManagerLoginDao {
    public Manager getManagerByMid(@Param("mid")int sid, @Param("password")String password);
}
