package test.com.yourantao.aimeili.action;

import main.com.yourantao.aimeili.bean.Brand;
import main.com.yourantao.aimeili.bean.BrandDAO;
import main.com.yourantao.aimeili.conf.Config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spring_dbtest {

	private static final Logger log = LoggerFactory.getLogger(spring_dbtest.class); //spring����־��ʽ
	public static void main(String [] args){
		/* hibernateʹ�÷�ʽ
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

		java.util.Properties p = System.getProperties();
		java.util.Enumeration keys = p.keys();
		while( keys.hasMoreElements() )
		{
		     System.out.println( keys.nextElement());
		 }
		String pathString=System.getProperty("testpath");
		System.out.println(pathString);
		String pathString2=System.getProperty("config.location");
		System.out.println(pathString2);
		 System.out.println(Runtime.getRuntime().maxMemory()); 
		
		//spring ʹ�÷�ʽ(�ɹ�����)
		String pathString1=System.getProperty("user.dir");
		System.out.println(pathString1);
		
		ApplicationContext ac=Config.getACInstant();
		  BrandDAO td = BrandDAO.getFromApplicationContext(ac);
		  
		  Brand brand=td.findById(1);//��ѯ
		  System.out.print(brand.getBrandName());
		  System.out.println(brand.getBrandName());
		  log.debug(brand.getBrandName());
		
		  Brand brand1=new Brand();
		  brand1.setBrandId(2);
		  brand1.setBrandName("test2");
		  brand1.setBrandAlias("aaa");
		  brand1.setBrandDescription("��������");
		  brand1.setBrandOtherNames("othername test");
		  brand1.setBrandRank(1);
		  td.save(brand1);//����
		  log.debug(brand1.getBrandName());
		  System.out.println(brand1.getBrandName());
		  
		  Brand brand2=td.findById(1);
		  td.delete(brand2);//ɾ��
		  log.debug(brand2.getBrandName());
		  System.out.println(brand2.getBrandName());
		  
		  Brand brand3=td.findById(2);
		  brand3.setBrandName("5");
		  td.merge(brand3);//����
		  log.debug(brand3.getBrandName());
		  System.out.println(brand3.getBrandName());
	}
}
