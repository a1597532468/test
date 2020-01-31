package cn.hd.knowledgebase.commons.utils;

import cn.hd.knowledgebase.entity.Manager;
import cn.hd.knowledgebase.entity.User;
import cz.mallat.uasparser.UserAgentInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Component
public class TokenUtil {

    @Resource
    private RedisUtils redisUtils;


    /**
     * 添加Token到Redis
     * @param request 请求，用于生成token中的设备信息
     * @param user 用户对象
     * @return 添加是否成功
     * @throws IOException
     */
    public boolean setTokenToRedis(HttpServletRequest request,Object user) throws IOException {
        String userInfo=null;
        if (user==null){
            return false;
        }
        if (user instanceof User){
            User u = (User) user;
            userInfo=u.getUid()+"-111";
        }else if(user instanceof Manager){
            Manager m = (Manager) user;
            userInfo=m.getMid()+"-222";
        }
        return redisUtils.set(createToken(request,userInfo),userInfo);
    }

    /**
     * 通过Token判断用户是否为管理员
     * @param token
     * @return
     */
    public boolean isManager(String token){
        String userInfo=(String) redisUtils.get(token);
        if (userInfo!=null) {
            String[] split = userInfo.split("-");
            if (split[1].equals("222")) {
                return true;
            }
        }
        return false;
    }


    /**
     * 通过Token从Redis获取用户唯一标识
     * @param token
     * @return 用户ID
     * @throws IOException
     */
    public String getUidByToken(String token){
        String userInfo=(String) redisUtils.get(token);
        if (userInfo!=null) {
            String[] split = userInfo.split("-");
            return split[0];
        }
        return null;
    }


    private String createToken(HttpServletRequest request,String uuid) throws IOException {
        StringBuilder token=new StringBuilder();
        token.append("token-");
        token.append(userAgent(request)+"-");
        token.append(MD5.getMD5(uuid,16));
        token.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        token.append(UUID.randomUUID().toString().substring(0,6));
        return token.toString();
    }


    private String userAgent(HttpServletRequest request) throws IOException {
        String ua=request.getHeader("User-Agent");
        UserAgentInfo info = UserAgentUtils.uaSparser.parse(ua);
        return info.getDeviceType();
    }
}