package lwt.service.Impl;

import lwt.dao.StudentDao;
import lwt.domain.Student;
import lwt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean add(Student student) {
        studentDao.add(student);
        return true;
    }

    @Override
    public boolean update(Student student) {
        studentDao.update(student);
        return true;
    }

    @Override
    public boolean delete(int id) {
        studentDao.delete(id);
        return true;
    }

    @Override
    public Student findById(int id) {
        Student student = studentDao.findById(id);
        return student;
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = studentDao.findAll();
        return students;
    }
}
