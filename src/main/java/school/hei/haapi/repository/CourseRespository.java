package school.hei.haapi.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.haapi.model.Course;
import school.hei.haapi.model.Fee;

import java.util.List;

@Repository
public interface CourseRespository extends JpaRepository<Course , String> {
    Course getByStudentIdAndId(String studentId, String courseId);
    List<Course> getCoursesByStudentIdAndStatus(String studentId,
                                          CourseStatus status,
                                          Pageable pageable);
    List<Course> getByStudentId(String studentId, Pageable pageable);

}
