package lwt.controller;

import lwt.domain.Student;
import lwt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping()
    public Result add(@RequestBody Student student) {
        boolean bl = studentService.add(student);
        if (bl) {
            return new Result(Code.ADD_OK, bl);
        }
        else {
            return new Result(Code.ADD_ERR, bl, "章鱼狗逼");
        }
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean bl = studentService.delete(id);
        if (bl) {
            return new Result(Code.DEL_OK, bl);
        }
        else {
            return new Result(Code.DEL_ERR, bl, "章鱼狗逼");
        }
    }

    @PutMapping
    public Result update(@RequestBody Student student) {
        boolean bl = studentService.update(student);
        if (bl) {
            return new Result(Code.UPDATE_OK, bl);
        }
        else {
            return new Result(Code.UPDATE_ERR, bl, "章鱼狗逼");
        }
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id) {
        Student student = studentService.findById(id);
        System.out.println("111");

        if (student==null) {
            return new Result(Code.GET_ERR, student, "章鱼狗逼");
        }
        else {
            return new Result(Code.GET_OK, student);
        }
    }

    @GetMapping
    public Result findAll() {
        List<Student> students = studentService.findAll();
        if (students==null) {
            return new Result(Code.GET_ERR, students, "章鱼狗逼");
        }
        else {
            return new Result(Code.GET_OK, students);
        }
    }
}
