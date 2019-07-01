package data_access;

import java.time.LocalDate;
import java.util.List;

public class CourseDaoList implements CourseDao {
	
	private static List<Course> course;

	@Override
	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	public static List<Course> getCourse() {
		return course;
	}

	public static void setCourse(List<Course> course) {
		CourseDaoList.course = course;
	}

}
