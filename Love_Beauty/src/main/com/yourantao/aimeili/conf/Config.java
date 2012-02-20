package main.com.yourantao.aimeili.conf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author whp
 * @����ʱ�䣺 2012-2-20 ����06:32:36
 * @�޸�ʱ�䣺2012-2-20 ����06:32:36
 * @���������� ����������
 */
public class Config {

	/*
	 * ���ݿ��ʼ��
	 */
	public static ApplicationContext DbInit(String springPath) {

		/*
		 * ��Ҫ�õ�hibernate.cfg.xml �����ļ� //hibernate���Ľӿ� Configuration
		 * configuration = new Configuration().configure(); //���� SessionFactory
		 * sessionFactory=configuration.buildSessionFactory();
		 * //SessionFactory�����б����˵�ǰ�����ݿ����ü�ӳ����Ϣ���������������
		 * //SessionFactory������һ�����ݿ⹫��һ������ Session session =
		 * sessionFactory.openSession(); //�����̰߳�ȫ�� Transaction
		 * txTransaction=session.beginTransaction(); //�������� Brand brand= new
		 * Brand(); brand.setBrandName("test1"); session.save(brand);
		 * session.flush(); txTransaction.commit();
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext(springPath);
		if (ac == null)
			ac = new ClassPathXmlApplicationContext("../applicationContext.xml");
		return ac;

	}
}