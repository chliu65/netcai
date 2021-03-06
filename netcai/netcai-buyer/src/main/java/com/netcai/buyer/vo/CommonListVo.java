package com.netcai.buyer.vo;

import java.io.Serializable;
import java.util.List;

public class CommonListVo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 来源于users的ID
	 */
	private Long sellerId;

	/**
	 * 店铺名称
	 */
	private String sellerName;
	
	/**
	 * 店铺别名,可以理解为简称
	 */
	private String sellerAlias;
	
	/**
	 * 店铺logo
	 */
	private String sellerLogo;
	
	/**
	 * 店铺评级,默认为0
	 */
	private int sellerRank;
	
	/**
	 * 店铺评分
	 */
	private Double sellerGrade;
	
    /**
     * 店铺商品
     */
	private List<GoodsVo> goodsList;

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerAlias() {
		return sellerAlias;
	}

	public void setSellerAlias(String sellerAlias) {
		this.sellerAlias = sellerAlias;
	}

	public String getSellerLogo() {
		return sellerLogo;
	}

	public void setSellerLogo(String sellerLogo) {
		this.sellerLogo = sellerLogo;
	}

	public int getSellerRank() {
		return sellerRank;
	}

	public void setSellerRank(int sellerRank) {
		this.sellerRank = sellerRank;
	}

	public Double getSellerGrade() {
		return sellerGrade;
	}

	public void setSellerGrade(Double sellerGrade) {
		this.sellerGrade = sellerGrade;
	}

	public List<GoodsVo> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<GoodsVo> goodsList) {
		this.goodsList = goodsList;
	}
	
}
