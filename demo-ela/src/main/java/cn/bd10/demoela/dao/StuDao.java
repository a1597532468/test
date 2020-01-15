package cn.bd10.demoela.dao;


import cn.bd10.demoela.entity.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface StuDao extends ElasticsearchRepository<Student,Long> {

}
