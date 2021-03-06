package main.com.yourantao.aimeili.bean;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * OrderGoods entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see main.com.yourantao.aimeili.bean.OrderGoods
 * @author MyEclipse Persistence Tools
 */

public class OrderGoodsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(OrderGoodsDAO.class);
	// property constants
	public static final String ORDER_ID = "orderId";
	public static final String GOODS_REAL_ID = "goodsRealId";
	public static final String COUNT = "count";
	public static final String PRICE = "price";
	public static final String PRICE_TYPE = "priceType";

	protected void initDao() {
		// do nothing
	}

	public void save(OrderGoods transientInstance) {
		log.debug("saving OrderGoods instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OrderGoods persistentInstance) {
		log.debug("deleting OrderGoods instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OrderGoods findById(java.lang.Integer id) {
		log.debug("getting OrderGoods instance with id: " + id);
		try {
			OrderGoods instance = (OrderGoods) getHibernateTemplate().get(
					"main.com.yourantao.aimeili.bean.OrderGoods", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(OrderGoods instance) {
		log.debug("finding OrderGoods instance by example");
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
		log.debug("finding OrderGoods instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from OrderGoods as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List findByGoodsRealId(Object goodsRealId) {
		return findByProperty(GOODS_REAL_ID, goodsRealId);
	}

	public List findByCount(Object count) {
		return findByProperty(COUNT, count);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByPriceType(Object priceType) {
		return findByProperty(PRICE_TYPE, priceType);
	}

	public List findAll() {
		log.debug("finding all OrderGoods instances");
		try {
			String queryString = "from OrderGoods";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public OrderGoods merge(OrderGoods detachedInstance) {
		log.debug("merging OrderGoods instance");
		try {
			OrderGoods result = (OrderGoods) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(OrderGoods instance) {
		log.debug("attaching dirty OrderGoods instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OrderGoods instance) {
		log.debug("attaching clean OrderGoods instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrderGoodsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OrderGoodsDAO) ctx.getBean("OrderGoodsDAO");
	}
	/**
	 * 自定义查找订单中的某一件商品的函数
	 **/
	public OrderGoods findByOrderAndGoodsId(Integer orderId, Integer goodsRealId) {
		// TODO Auto-generated method stub
		final String hql = "from OrderGoods where orderId = "+ orderId + " and goodsRealId = " + goodsRealId;
		List<OrderGoods> result = getHibernateTemplate().executeFind(new HibernateCallback(){
			@Override
			public Object doInHibernate(Session arg0)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query= arg0.createQuery(hql);
                query.setFirstResult(0);
                query.setMaxResults(1);
                List<OrderGoods> list = query.list();
                return list;
			}
		});
		if(result.isEmpty())
			return null;
		else
			return result.get(0);
	}
}