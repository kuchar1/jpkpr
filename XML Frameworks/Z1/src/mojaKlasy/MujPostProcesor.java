package mojaKlasy;

import java.util.ArrayList;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MujPostProcesor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		
		System.out.println(beanName+ " " + bean.getClass().getName());
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String neanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}



	
}
