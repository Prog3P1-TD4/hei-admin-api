package school.hei.haapi.endpoint.rest.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import school.hei.haapi.model.Course;
import school.hei.haapi.model.StudentCourse;

@Component
@AllArgsConstructor
public class StudentCourseMapper {
  private final CourseMapper courseMapper;
  public school.hei.haapi.endpoint.rest.model.Course toRest (StudentCourse studentCourse){
    Course course = studentCourse.getCourse();
    return courseMapper.toRest(course);
  }
}
