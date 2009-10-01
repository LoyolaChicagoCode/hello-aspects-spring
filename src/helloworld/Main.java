package helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laufer
 *
 */
public class Main {

  public static void main(String[] args) {
  	BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml"); 
    Hello bean = (Hello) factory.getBean("helloWorld");
    System.out.println(bean.getMessage());
    System.out.println(bean.getOne());
  }
}
