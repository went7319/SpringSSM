import lwt.config.SpringConfig;
import lwt.domain.Student;
import lwt.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class StudentServiceTest {

    @Autowired
    private StudentService studentSerice;

    @Test
    public void findByIdTest(){
        Student student = studentSerice.findById(2);
        System.out.println(student);

    }

    @Test
    public void fingAllTest(){
        List<Student> students = studentSerice.findAll();
        System.out.println(students);


    }

}
