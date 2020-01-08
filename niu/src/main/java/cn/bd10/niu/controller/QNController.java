package cn.bd10.niu.controller;

import cn.bd10.niu.service.QNService;

import com.google.gson.Gson;
import com.qiniu.http.Response;
import com.qiniu.storage.model.DefaultPutRet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author 吕继伟
 * @version V1.0
 * @Project: lixi1
 * @Package com.example.demo.controller
 * @date 2020/1/8 11:19 星期三
 */
@Controller
public class QNController {

    @Autowired
    private QNService qnService;
    @Value("http://q3rowxqmd.bkt.clouddn.com")
    private String path;

    @RequestMapping("/a")
    public String init(){
        return "house";
    }

    @PostMapping("/shangchuan")
    public String shangchuan(@RequestParam("file") MultipartFile file)throws Exception{
        Response response=qnService.uploadFile(file.getInputStream());
        DefaultPutRet putRet=new Gson().fromJson(response.bodyString(),DefaultPutRet.class);
        String url =path+"/"+putRet.key;
        System.out.println(url);
        return "aaa";
    }


}
