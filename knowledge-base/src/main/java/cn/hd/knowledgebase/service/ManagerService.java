package cn.hd.knowledgebase.service;


import cn.hd.knowledgebase.entity.Manager;

import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/1/5 13:22
 * @package cn.hd.knowledgebase.service
 */
public interface ManagerService {
    public List<Manager> queryAllManagers();

    public Manager queryManager(Integer mid, String mname, String mobile);

    public int addManager(Manager manager);

    public int deleteManager(Integer mid);

    public int updateManager(Integer mid, String mname, String mobile, String password);
}
