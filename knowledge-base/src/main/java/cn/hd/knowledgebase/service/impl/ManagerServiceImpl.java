package cn.hd.knowledgebase.service.impl;

import cn.hd.knowledgebase.dao.ManagerDao;
import cn.hd.knowledgebase.entity.Manager;
import cn.hd.knowledgebase.service.ManagerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/1/5 13:22
 * @package cn.hd.knowledgebase.service.impl
 */
@Service

public class ManagerServiceImpl implements ManagerService {

    @Resource
    private ManagerDao managerDao;

    @Override
    public List<Manager> queryAllManagers() {
        return managerDao.getAllManagers();
    }

    @Override
    public Manager queryManager(Integer mid, String mname, String mobile) {
        return managerDao.getManager(mid, mname, mobile);
    }

    @Override
    @Transactional
    public int addManager(Manager manager) {
        try {
            int addResult = managerDao.addManager(manager);
            return addResult;
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 0;
        }
    }

    @Override
    @Transactional
    public int deleteManager(Integer mid) {
        try {
            int deleteResult = managerDao.deleteManager(mid);
            return deleteResult;
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 0;
        }
    }

    @Override
    @Transactional
    public int updateManager(Integer mid, String mname, String mobile, String password) {
        try {
            int updateResult = managerDao.updateManager(mid, mname, mobile, password);
            return updateResult;
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 0;
        }
    }

}
