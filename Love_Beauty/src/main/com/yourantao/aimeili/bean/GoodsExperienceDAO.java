package main.com.yourantao.aimeili.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GoodsExperience entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see main.com.yourantao.aimeili.bean.GoodsExperience
 * @author MyEclipse Persistence Tools
 */

public class GoodsExperienceDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(GoodsExperienceDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_NAME = "goodsName";
	public static final String EXPERIENCE_NAME = "experienceName";
	public static final String EXPERIENCE_FROM = "experienceFrom";
	public static final String EXPERIENCE_INTRODUCTION = "experienceIntroduction";
	public static final String EXPERIENCE_DETAIL = "experienceDetail";

	protected void initDao() {
		// do nothing
	}

	public void save(GoodsExperience transientInstance) {
		log.debug("saving GoodsExperience instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GoodsExperience persistentInstance) {
		log.debug("deleting GoodsExperience instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GoodsExperience findById(java.lang.Integer id) {
		log.debug("getting GoodsExperience instance with id: " + id);
		try {
			GoodsExperience instance = (GoodsExperience) getHibernateTemplate()
					.get("main.com.yourantao.aimeili.bean.GoodsExperience", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GoodsExperience instance) {
		log.debug("finding GoodsExperience instance by example");
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
		log.debug("finding GoodsExperience instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from GoodsExperience as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List findByExperienceName(Object experienceName) {
		return findByProperty(EXPERIENCE_NAME, experienceName);
	}

	public List findByExperienceFrom(Object experienceFrom) {
		return findByProperty(EXPERIENCE_FROM, experienceFrom);
	}

	public List findByExperienceIntroduction(Object experienceIntroduction) {
		return findByProperty(EXPERIENCE_INTRODUCTION, experienceIntroduction);
	}

	public List findByExperienceDetail(Object experienceDetail) {
		return findByProperty(EXPERIENCE_DETAIL, experienceDetail);
	}

	public List findAll() {
		log.debug("finding all GoodsExperience instances");
		try {
			String queryString = "from GoodsExperience";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GoodsExperience merge(GoodsExperience detachedInstance) {
		log.debug("merging GoodsExperience instance");
		try {
			GoodsExperience result = (GoodsExperience) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GoodsExperience instance) {
		log.debug("attaching dirty GoodsExperience instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GoodsExperience instance) {
		log.debug("attaching clean GoodsExperience instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GoodsExperienceDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (GoodsExperienceDAO) ctx.getBean("GoodsExperienceDAO");
	}
}