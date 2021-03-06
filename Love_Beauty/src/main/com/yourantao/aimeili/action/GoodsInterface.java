package main.com.yourantao.aimeili.action;

import java.io.File;

public interface GoodsInterface {
	
	/**
	 * 更新商品详情
	 */
	public String updateGoods();
	
	/**
	 * 更新商品对应真实商品
	 */
	public String updateGoods2realGoods();
	
	/**
	 * 我的护肤品中获得适合，不适合和需要注意的商品列表
	 */
	public String getGoodsListBySkin();
	
	/**
	 * 根据分类获得适合，不适合和需要注意的商品列表
	 * @return
	 */
	public String getGoodsListBySkinAndCat();
	/**
	 * 获得真实商品的评论
	 */
	public String getGoodsRealComment();
	
	/**
	 * 通过分类获得商品列表
	 * 
	 * @return
	 */
	public String getGoodsListByCat();
	
	/**
	 * 通过功效获得商品列表
	 * 
	 * @return
	 */
	public String getGoodsListByEfficacy();
	
	/**
	 * 通过品牌获得商品列表
	 * 
	 * @return
	 */
	public String getGoodsListByBrand();
	
	/**
	 * 获得收藏商品列表
	 * @return
	 */
	public String getGoodsListByFav();
	
	/**
	 * 根据搜索词获得商品列表
	 * @return
	 * 简单算法: 1.高频词为，品牌名OR分类名OR功效明
	 * 			2.遇到 ,.+-`~!\/;:。，、！等字符则做分词处理
	 *  		3.分词后的逻辑为，若有多个词都为品牌名  分类名  或者 功效名，则是或的关系处理；若一个词是品牌名，但另一个词是分类名或者功效名，则是且的关系
	 *  		4.当搜索词不是高频词时，则按标题中的内容进行比对
	 *  		5.全无则返回没有搜索到商品
	 */
	public String getGoodsListBySearch();
	
	/**
	 * 添加商品
	 * @return
	 */
	public String insertGoods();
	
	/**
	 * 获得商品详情图
	 * @return
	 */
	public String getGoodsImages();
	
	/**
	 * 更新商品详情图
	 * @return
	 */
	public String updateGoodsImages();
	
	/**
	 * 获得商品对应关系的真实商品
	 * @return
	 */
	public String getGoodsMapList();
	
	/**
	 * 通过品牌或者系列获得真实商品
	 * @return
	 */
	public String GetGoodsRealListBySeries();
	
	/**
	 * 获得商品对应关系的真实商品
	 * @return
	 */
	public String GetGoodsRealListByMap();
	
	/**
	 * 获得商品的 心得评测
	 */
	public String getGoodsExperience();
	
	/**
	 * 根据排行榜获得商品列表
	 * @return
	 */
	public String getGoodsListByRanking();
	
	/**
	 * 获得某件商品的收藏数
	 * @return
	 */
	public String getGoodsFavoriteCount();
	
	/**
	 * 根据排行榜获得商品列表,为小编建立的接口
	 * @return
	 */
	public String getGoodsListByRanking0();
	
	/**
	 *  for Programmer
	 * 将真实商品中的某一个站的数据导入商品表中
	 * @return
	 */
	public String copyGoodsReal2Goods();
	
	/**
	 *  for Programmer
	 * 更新全部的商品聚合(goodsMap)
	 * @return
	 */
	public String updateGoodsMap();
	
	/**
	 *  for Programmer
	 * 心得评测与商品的对应（goodsExperience）
	 * @return
	 */
	public String updateGoodsExperience();
	
	/**
	 *  for Programmer
	 *心得评测数据库中的详情修改（goodsExperience）
	 * @return
	 */
	public String updateGoodsExperienceDetail();
	
	/**
	 * for Programmer
	 * 将不在对应关系的goodsreal 添加到goods表中
	 * @return
	 */
	public String insertNoMapGoodsReal();
	
	/**
	 * for Programmer
	 * 删除重复的商品数据
	 * @param 
	 */
	public String deleteRepeatGoods();
	
	/**
	 * for Programmer
	 * 插入更多的品牌
	 * @param 
	 */
	public String insertBrand();
	
	
	public void setNewGoods_thumbContentType(String thumbContentType);

	public void setNewGoods_thumbFileName(String thumbFileName);

	public void setNewGoods_thumb(File newtopic_thumb);

	public void setNewGoods_imageContentType(String imageContentType);

	public void setNewGoods_imageFileName(String imageFileName);

	public void setNewGoods_image(File newtopic_image);
}
