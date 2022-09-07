package lwt.dao;

import lwt.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentDao {

    @Insert("insert into student value (null,#{name},#{age})")
    public void add(Student Student);

    @Delete("delete from student where id=#{id}")
    public void delete(int id);

    @Update("update student set name=#{name},age=#{age} where id=#{id} ")
    public void update(Student student);

    @Select("select * from student where id=#{id}")
    public Student findById(int id);

    @Select("select * from student")
    public List<Student> findAll();
}
