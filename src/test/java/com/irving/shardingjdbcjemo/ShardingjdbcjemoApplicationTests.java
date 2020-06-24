package com.irving.shardingjdbcjemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.irving.shardingjdbcjemo.entity.Course;
import com.irving.shardingjdbcjemo.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingjdbcjemoApplicationTests {
	//注入 mapper
	@Autowired
	private CourseMapper courseMapper;
	//添加课程的方法
	@Test
	public void addCourse() {
		for(int i=1;i<=10;i++) {
			Course course = new Course();
			course.setCname("java"+i);
			course.setUserId(100L);
			course.setCstatus("Normal"+i);
			courseMapper.insert(course);
		} }
	//查询课程的方法
	@Test
	public void findCourse() {
		QueryWrapper<Course> wrapper = new QueryWrapper<>();
		wrapper.eq("cid",482480249800491008L);
		Course course = courseMapper.selectOne(wrapper);
		System.out.println(course);
	}

	@Test
	public void addCourseDb() {
		for(int i=1;i<=10;i++) {
			Course course = new Course();
			course.setCname("java"+i);
			course.setUserId(111L);
			course.setCstatus("Normal"+i);
			courseMapper.insert(course);
		} }
	//查询操作
	@Test
	public void findCourseDb() {
		QueryWrapper<Course> wrapper = new QueryWrapper<>();
//设置 userid 值
		wrapper.eq("user_id",111L);
//设置 cid 值
		//wrapper.eq("cid",465162909769531393L);
		List<Course> courses = courseMapper.selectList(wrapper);
		System.out.println(courses.size());
	}
}
