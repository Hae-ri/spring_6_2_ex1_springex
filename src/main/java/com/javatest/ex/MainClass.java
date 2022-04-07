package com.javatest.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// 컨테이너 객체를 ApplicationConfig 클래스로 설정하여 생성
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1",Student.class);
		Student student2 = ctx.getBean("student2",Student.class);
		
		System.out.println(student1.getName());
		System.out.println(student2.getName());
		
	}

}
