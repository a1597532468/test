package cn.bd10.niu.util;

import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QNConfig {

    @Bean
    public com.qiniu.storage.Configuration qiniuConfig(){
        return new com.qiniu.storage.Configuration(Zone.zone0());
    }

    @Bean
    public UploadManager uploadManager(){
        return new UploadManager(qiniuConfig());
    }

    @Value("E9Wcc0oo37vRJ9kSSCr0SJhRu0Rz-rwcv_rZHwwg")
    private String accessKey;
    @Value("IoSbT73acmmPCzEvY8h5o5RxVuE8slcXI8zh0tks")
    private String secretKey;

    @Bean
    public Auth auth(){
        return Auth.create(accessKey,secretKey);
    }

    @Bean
    public BucketManager bucketManager(){
        return new BucketManager(auth(),qiniuConfig());
    }

    @Bean
    public Gson gson(){
        return new Gson();
    }




}
