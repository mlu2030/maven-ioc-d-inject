package io.mlu.mde;

import io.mlu.mde.auto.Car;
import io.mlu.mde.auto.CarBeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
// Lazy evaluation
//        Resource r = new ClassPathResource("applicationContext.xml");
//
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions(r);
//
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarBeanConfig.class);
        Car car = (Car) applicationContext.getBean("carBean");
        System.out.println("### The car from the Bean:\n" + car);

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(IoTDeviceBeanConfig.class);
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IoTDeviceBeanConfig.class);

//        IoTDevice firstBean = applicationContext.getBean(IoTDevice.class);
//        IoTDevice secondBean = (IoTDevice) applicationContext.getBean("myBean");
//        IoTDevice firstBean = (IoTDevice) applicationContext.getBean("FridgeBean");
//        IoTDevice secondBean = (IoTDevice) applicationContext.getBean("DishwasherBean");

//        firstBean.setDevice("Fridge");
//        firstBean.setDescription("Wine chiller");
//
//        secondBean.setDevice("Dishwasher");
//        secondBean.setDescription("super fast");

//        System.out.println("1 - Dependence Injection:\t" + firstBean);
//        System.out.println("2 - Dependence Injection:\t" + secondBean);

//        applicationContext.close();
    }

}
