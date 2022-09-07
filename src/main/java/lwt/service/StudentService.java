package lwt.service;

import lwt.domain.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional//开启事务管理器
public interface StudentService {

    public boolean add(Student student);

    public boolean update(Student student);

    public boolean delete(int id);

    public Student findById(int id);

    public List<Student> findAll();

}
