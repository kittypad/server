package main.com.yourantao.aimeili.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Order
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see main.com.yourantao.aimeili.bean.Order
 * @author MyEclipse Persistence Tools
 */

public class OrderDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(OrderDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String ORDER_NUM = "orderNum";
	public static final String ORDER_SUM = "orderSum";
	public static final String ADDRESS_ID = "addressId";
	public static final String POSTAGE = "postage";
	public static final String PAYMENT_TYPE = "paymentType";
	public static final String DELIVER_TYPE = "deliverType";
	public static final String DELIVER_TIME = "deliverTime";
	public static final String INVOICE = "invoice";
	public static final String FINISH = "finish";
	public static final String PROVIDER_ID = "providerId";
	public static final String RELATED_NUM = "relatedNum";
	public static final String HANDLED = "handled";
	public static final String INVOICE_TYPE = "invoiceType";
	public static final String INVOICE_CONTENT = "invoiceContent";
	public static final String INVOICE_NAME = "invoiceName";
	public static final String LOGISTICS = "logistics";

	protected void initDao() {
		// do nothing
	}

	public void save(Order transientInstance) {
		log.debug("saving Order instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Order persistentInstance) {
		log.debug("deleting Order instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Order findById(java.lang.Integer id) {
		log.debug("getting Order instance with id: " + id);
		try {
			Order instance = (Order) getHibernateTemplate().get(
					"main.com.yourantao.aimeili.bean.Order", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Order instance) {
		log.debug("finding Order instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Order instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Order as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findByOrderNum(Object orderNum) {
		return findByProperty(ORDER_NUM, orderNum);
	}

	public List findByOrderSum(Object orderSum) {
		return findByProperty(ORDER_SUM, orderSum);
	}

	public List findByAddressId(Object addressId) {
		return findByProperty(ADDRESS_ID, addressId);
	}

	public List findByPostage(Object postage) {
		return findByProperty(POSTAGE, postage);
	}

	public List findByPaymentType(Object paymentType) {
		return findByProperty(PAYMENT_TYPE, paymentType);
	}

	public List findByDeliverType(Object deliverType) {
		return findByProperty(DELIVER_TYPE, deliverType);
	}

	public List findByDeliverTime(Object deliverTime) {
		return findByProperty(DELIVER_TIME, deliverTime);
	}

	public List findByInvoice(Object invoice) {
		return findByProperty(INVOICE, invoice);
	}

	public List findByFinish(Object finish) {
		return findByProperty(FINISH, finish);
	}

	public List findByProviderId(Object providerId) {
		return findByProperty(PROVIDER_ID, providerId);
	}

	public List findByRelatedNum(Object relatedNum) {
		return findByProperty(RELATED_NUM, relatedNum);
	}

	public List findByHandled(Object handled) {
		return findByProperty(HANDLED, handled);
	}

	public List findByInvoiceType(Object invoiceType) {
		return findByProperty(INVOICE_TYPE, invoiceType);
	}

	public List findByInvoiceContent(Object invoiceContent) {
		return findByProperty(INVOICE_CONTENT, invoiceContent);
	}

	public List findByInvoiceName(Object invoiceName) {
		return findByProperty(INVOICE_NAME, invoiceName);
	}

	public List findByLogistics(Object logistics) {
		return findByProperty(LOGISTICS, logistics);
	}

	public List findAll() {
		log.debug("finding all Order instances");
		try {
			String queryString = "from Order";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Order merge(Order detachedInstance) {
		log.debug("merging Order instance");
		try {
			Order result = (Order) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Order instance) {
		log.debug("attaching dirty Order instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Order instance) {
		log.debug("attaching clean Order instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrderDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OrderDAO) ctx.getBean("OrderDAO");
	}
	/**
	 * 自定义查找用户待确认订单
	 */
	public List findUnconfirmedOrdersByUserId(int userId) {
		String hql = "from Order where userId=" + userId
				+ " and finish=0 and handled != 3 order by orderNum, providerId";
		List<Order> results = (List<Order>) getHibernateTemplate().find(hql);
		return results;
	}

	/**
	 * 自定义查找历史订单
	 */
	public List findHistoryOrdersByUserId(int userId) {
		String hql = "from Order where userId=" + userId
				+ " and finish=3 and handled = 3 by orderNum, providerId";
		List<Order> results = (List<Order>) getHibernateTemplate().find(hql);
		return results;
	}

	/**
	 * 自定义统计用户待确认/历史成功订单的数量
	 */
	public List<Integer> getOrderCount(int userId) {
		// TODO Auto-generated method stub
		String hql1 = "select orderNum from Order where userId=" + userId
				+ " and finish=0 group by orderNum";
		List result1 = getHibernateTemplate().find(hql1);
		String hql2 = "select orderNum from Order  where userId=" + userId
				+ " and finish=3 group by orderNum";
		List result2 = getHibernateTemplate().find(hql2);
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(result1.size());
		intList.add(result2.size());
		return intList;
	}
	
	/*public List<Order> getUnconfirmedPhoneOrders(){
		String hql = "from Order where handled = 0 and finish = 0 order by userId, orderNum, providerId";
		List<Order> result = getHibernateTemplate().find(hql);
		return result;
	}*/
	
	public List<Order> getUsersAndUnconfirmedPhoneOrders() {
		String hql ="from Order where handled = 0 and finish = 0 group by orderNum order by userId, orderNum";
		List<Order> result = getHibernateTemplate().find(hql);
		return result;
	}
	public List<Order> getUsersAndUnhandledOrders(){
		String hql ="from Order where handled = 1 and finish = 0 group by orderNum order by userId, orderNum";
		List<Order> result = getHibernateTemplate().find(hql);
		return result;
	}
}