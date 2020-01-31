package cn.hd.knowledgebase.controller;

import cn.hd.knowledgebase.commons.utils.TokenUtil;
import cn.hd.knowledgebase.entity.Manager;
import cn.hd.knowledgebase.entity.ManagerResult;
import cn.hd.knowledgebase.service.ManagerService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/1/5 13:26
 * @package cn.hd.knowledgebase.controller
 */

@CrossOrigin
@RestController
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @Autowired
    private TokenUtil tokenUtil;


    @RequestMapping("init")
    public ManagerResult initial(@RequestParam(required = false) String token){
//        boolean identity = tokenUtil.isManager(token);
        System.out.println(111);
        ManagerResult result=new ManagerResult();
//        if (identity==true){
            List<Manager> allManagers = managerService.queryAllManagers();
            if(allManagers==null){
                result.setCode(0);
                result.setMessage("查询失败，请您稍后重试");
                return result;
            }else {
                String AllManagers = JSON.toJSONString(allManagers);
                result.setCode(1);
                result.setMessage("查询成功");
                result.setData(AllManagers);
                return result;
            }
//        }else {
//            result.setCode(3);
//            result.setMessage("操作失败");
//            return result;
//        }
    }

    @RequestMapping("query")
    public ManagerResult queryManagerByCondition(@RequestParam(required = false) String token, Manager manager, HttpServletRequest request){
//        boolean identity = tokenUtil.isManager(token);
        ManagerResult result=new ManagerResult();
//        if (identity==true){
            Manager queryResult = managerService.queryManager(manager.getMid(), manager.getMname(), manager.getMobile());
            if (queryResult==null){
                result.setCode(0);
                result.setMessage("查询失败，您所查询的用户不存在，请您稍后重试");
            }else{
                result.setCode(1);
                result.setMessage("查询成功");
                result.setData(JSON.toJSONString(queryResult));
            }
            return result;
//        }else {
//            result.setCode(3);
//            result.setMessage("操作失败");
//            return result;
//        }
    }

    @RequestMapping("delete")
    public ManagerResult deleteManagerByMid(@RequestParam(required = false) String token, @RequestParam Integer mid, HttpServletRequest request){
//        boolean identity = tokenUtil.isManager(token);
        ManagerResult result=new ManagerResult();
//        if (identity==true){
            int deleteResult = managerService.deleteManager(mid);
            if (deleteResult==0){
                result.setCode(0);
                result.setMessage("删除管理员失败，请您稍后再试");
            }else{
                result.setCode(1);
                result.setMessage("删除管理员成功");
            }
            return result;
//        }else {
//            result.setCode(3);
//            result.setMessage("操作失败");
//            return result;
//        }
    }

    @RequestMapping("update")
    public ManagerResult updateManagerByMid(@RequestParam(required = false) String token, Manager manager, HttpServletRequest request){
//        boolean identity = tokenUtil.isManager(token);
        ManagerResult result=new ManagerResult();
//        if (identity==true){
            int updateResult = managerService.updateManager(manager.getMid(), manager.getMname(),
                    manager.getMobile(), manager.getPassword());
            System.out.println(manager.getPassword());
            if (updateResult==0){
                result.setCode(0);
                result.setMessage("更新失败，请您稍后重试");
            }else{
                result.setCode(1);
                result.setMessage("更新成功");
            }
            return result;
//        }else {
//            result.setCode(3);
//            result.setMessage("操作失败");
//            return result;
//        }
    }
}
