package cn.hd.knowledgebase.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int uid;
    private String uname;
    private String mobile;
    private String password;
    private int gender;
    private int member;
    private int status;
    private String createTime;
    private String updateTime;
}
