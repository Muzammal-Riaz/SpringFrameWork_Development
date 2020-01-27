package com.web.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp
{

	public static void main(String[] args) 
	{
		//triangle triangle = new triangle();
		//triangle.draw();

		
	//*********************** BEAN FACTORY ***********************
		
	/*	//reading the configuration from spring bean factory
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("SpringBeanFactory.xml"));

		
		//calling triangle from spring.xml and casting it to the object of triangle class i.e 
		//triangle using factory bean
		
		triangle triangle = (triangle) factory.getBean("triangle");
		
	*/
		
		
	//*********************** APPLICATION CONTEXT WITH SETTER ***********************
		
	/*	//reading the configuration using Application Context 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
		
		//use "property" in block of bean inside xml file and give two arguments, one 
		// id and the other one value
		//never define constructor in subclass to execute using setter
		//calling triangle from spring.xml and casting it to the object of triangle class i.e 
		//triangle using Application Context
		//move the spring.xml to src folder and run the project	
		  
		 
		triangle triangle = (triangle) context.getBean("triangle");
		triangle.draw();
	
	*/
		
		//*********************** APPLICATION CONTEXT WITH CONSTRUCTOR ***********************
		
	/*	//reading the configuration using Application Context 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConstructor.xml");
			
		//use "constructor-arg" inside xml file under bean block to initialize value and note 
		// No id is needed for it
		//calling triangle from spring.xml and casting it to the object of triangle class i.e 
		//triangle using Application Context
		//move the spring.xml to src folder and run the project
					
		triangle triangle = (triangle) context.getBean("triangle");
		triangle.draw();
	*/
		
		
		//*********************** APPLICATION CONTEXT WITH Multiple CONSTRUCTORS ***********************
		
	/*	//reading the configuration using Application Context 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConstructorWithMultipleArguments.xml");
			
		//use "constructor-arg" twice inside xml file under bean block to initialize value and note 
		// No id is needed for it
		//calling triangle from spring.xml and casting it to the object of triangle class i.e 
		//triangle using Application Context
		//move the spring.xml to src folder and run the project
					
		triangle triangle = (triangle) context.getBean("triangle");
		triangle.draw();
	*/
		
		//*********************** INJECTING OBJECTS ***********************
		
		//reading the configuration using Application Context 
			
	/*	ApplicationContext context = new ClassPathXmlApplicationContext("SpringInjectingObjects.xml");
		
		System.out.println("Using Point Class");
		Point point0 = (Point) context.getBean("point0");
		point0.points();	
		
		Point point1 = (Point) context.getBean("point1");
		point1.points();
		
		Point point2 = (Point) context.getBean("point2");
		point2.points();
		
		System.out.println("Using InjectingObjects Class");
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("SpringInjectingObjects.xml");
		InjectingObjects points = (InjectingObjects) context1.getBean("InjectingObjects");
		points.points();
	*/	
		
		
		
		//*********************** INNER BEANS ***********************
		
		
	/*	
		ApplicationContext context1 = new ClassPathXmlApplicationContext("SpringInnerBeans.xml");
		InjectingObjects points = (InjectingObjects) context1.getBean("InjectingObjects");
		points.points();
	*/
	
	
	/*	//*********************** List of Points ***********************
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("SpringPointsList.xml");
		PointsList points = (PointsList) context1.getBean("PointsList");
		points.points();
		
	*/
		
		//*********************** List of Names ***********************
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("SpringNamesList.xml");
		Names_list names = (Names_list) context1.getBean("NamesList");
		names.print_names();
		
	
	}
	
	
	

}
