package cn.bd10.demoela.controller;


import cn.bd10.demoela.dao.StuDao;
import cn.bd10.demoela.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EsController {

    @Autowired
    private StuDao stuDao;

    @GetMapping("save")
    public String save(Student student){
        stuDao.save(student);
        return "success";
    }

}
