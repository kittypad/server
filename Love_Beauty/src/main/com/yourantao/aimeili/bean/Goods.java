package main.com.yourantao.aimeili.bean;

import java.sql.Timestamp;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private Integer providerId;
	private Integer brandId;
	private Integer categoryId;
	private String goodsName;
	private String goodsThumb;
	private String goodsImages;
	private Float goodsPrice;
	private String goodsUrl;
	private Float goodsScore;
	private String goodsSkin;
	private String goodsAge;
	private String goodsDescription;
	private String goodsSpecification;
	private Integer goodsCount;
	private Short goodsIsNew;
	private Short goodsIsHot;
	private Integer goodsBuyCount;
	private Integer goodsViewCount;
	private Timestamp goodsAddTime;
	private Timestamp goodsLastUpdate;
	private Short goodsStatus;
	private Integer goodsRank;

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(Integer providerId, Integer brandId, Integer categoryId,
			String goodsName, String goodsThumb, String goodsImages,
			Float goodsPrice, String goodsUrl, Float goodsScore,
			String goodsSkin, String goodsAge, String goodsDescription,
			String goodsSpecification, Integer goodsCount, Short goodsIsNew,
			Short goodsIsHot, Integer goodsBuyCount, Integer goodsViewCount,
			Timestamp goodsAddTime, Timestamp goodsLastUpdate,
			Short goodsStatus, Integer goodsRank) {
		this.providerId = providerId;
		this.brandId = brandId;
		this.categoryId = categoryId;
		this.goodsName = goodsName;
		this.goodsThumb = goodsThumb;
		this.goodsImages = goodsImages;
		this.goodsPrice = goodsPrice;
		this.goodsUrl = goodsUrl;
		this.goodsScore = goodsScore;
		this.goodsSkin = goodsSkin;
		this.goodsAge = goodsAge;
		this.goodsDescription = goodsDescription;
		this.goodsSpecification = goodsSpecification;
		this.goodsCount = goodsCount;
		this.goodsIsNew = goodsIsNew;
		this.goodsIsHot = goodsIsHot;
		this.goodsBuyCount = goodsBuyCount;
		this.goodsViewCount = goodsViewCount;
		this.goodsAddTime = goodsAddTime;
		this.goodsLastUpdate = goodsLastUpdate;
		this.goodsStatus = goodsStatus;
		this.goodsRank = goodsRank;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getProviderId() {
		return this.providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsThumb() {
		return this.goodsThumb;
	}

	public void setGoodsThumb(String goodsThumb) {
		this.goodsThumb = goodsThumb;
	}

	public String getGoodsImages() {
		return this.goodsImages;
	}

	public void setGoodsImages(String goodsImages) {
		this.goodsImages = goodsImages;
	}

	public Float getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsUrl() {
		return this.goodsUrl;
	}

	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}

	public Float getGoodsScore() {
		return this.goodsScore;
	}

	public void setGoodsScore(Float goodsScore) {
		this.goodsScore = goodsScore;
	}

	public String getGoodsSkin() {
		return this.goodsSkin;
	}

	public void setGoodsSkin(String goodsSkin) {
		this.goodsSkin = goodsSkin;
	}

	public String getGoodsAge() {
		return this.goodsAge;
	}

	public void setGoodsAge(String goodsAge) {
		this.goodsAge = goodsAge;
	}

	public String getGoodsDescription() {
		return this.goodsDescription;
	}

	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}

	public String getGoodsSpecification() {
		return this.goodsSpecification;
	}

	public void setGoodsSpecification(String goodsSpecification) {
		this.goodsSpecification = goodsSpecification;
	}

	public Integer getGoodsCount() {
		return this.goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Short getGoodsIsNew() {
		return this.goodsIsNew;
	}

	public void setGoodsIsNew(Short goodsIsNew) {
		this.goodsIsNew = goodsIsNew;
	}

	public Short getGoodsIsHot() {
		return this.goodsIsHot;
	}

	public void setGoodsIsHot(Short goodsIsHot) {
		this.goodsIsHot = goodsIsHot;
	}

	public Integer getGoodsBuyCount() {
		return this.goodsBuyCount;
	}

	public void setGoodsBuyCount(Integer goodsBuyCount) {
		this.goodsBuyCount = goodsBuyCount;
	}

	public Integer getGoodsViewCount() {
		return this.goodsViewCount;
	}

	public void setGoodsViewCount(Integer goodsViewCount) {
		this.goodsViewCount = goodsViewCount;
	}

	public Timestamp getGoodsAddTime() {
		return this.goodsAddTime;
	}

	public void setGoodsAddTime(Timestamp goodsAddTime) {
		this.goodsAddTime = goodsAddTime;
	}

	public Timestamp getGoodsLastUpdate() {
		return this.goodsLastUpdate;
	}

	public void setGoodsLastUpdate(Timestamp goodsLastUpdate) {
		this.goodsLastUpdate = goodsLastUpdate;
	}

	public Short getGoodsStatus() {
		return this.goodsStatus;
	}

	public void setGoodsStatus(Short goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	public Integer getGoodsRank() {
		return this.goodsRank;
	}

	public void setGoodsRank(Integer goodsRank) {
		this.goodsRank = goodsRank;
	}

}