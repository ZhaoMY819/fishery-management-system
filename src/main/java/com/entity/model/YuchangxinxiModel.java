package com.entity.model;

import com.entity.YuchangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 渔场信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public class YuchangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 鱼种类型
	 */
	
	private String yuzhongleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 渔场地址
	 */
	
	private String yuchangdizhi;
		
	/**
	 * 营业时间
	 */
	
	private String yingyeshijian;
		
	/**
	 * 每小时/元
	 */
	
	private Double yuchangshoufei;
		
	/**
	 * 区域
	 */
	
	private String quyu;
		
	/**
	 * 渔场介绍
	 */
	
	private String yuchangjieshao;
		
	/**
	 * 渔场主账号
	 */
	
	private String yuchangzhuzhanghao;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 评分
	 */
	
	private Double totalscore;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：鱼种类型
	 */
	 
	public void setYuzhongleixing(String yuzhongleixing) {
		this.yuzhongleixing = yuzhongleixing;
	}
	
	/**
	 * 获取：鱼种类型
	 */
	public String getYuzhongleixing() {
		return yuzhongleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：渔场地址
	 */
	 
	public void setYuchangdizhi(String yuchangdizhi) {
		this.yuchangdizhi = yuchangdizhi;
	}
	
	/**
	 * 获取：渔场地址
	 */
	public String getYuchangdizhi() {
		return yuchangdizhi;
	}
				
	
	/**
	 * 设置：营业时间
	 */
	 
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
				
	
	/**
	 * 设置：每小时/元
	 */
	 
	public void setYuchangshoufei(Double yuchangshoufei) {
		this.yuchangshoufei = yuchangshoufei;
	}
	
	/**
	 * 获取：每小时/元
	 */
	public Double getYuchangshoufei() {
		return yuchangshoufei;
	}
				
	
	/**
	 * 设置：区域
	 */
	 
	public void setQuyu(String quyu) {
		this.quyu = quyu;
	}
	
	/**
	 * 获取：区域
	 */
	public String getQuyu() {
		return quyu;
	}
				
	
	/**
	 * 设置：渔场介绍
	 */
	 
	public void setYuchangjieshao(String yuchangjieshao) {
		this.yuchangjieshao = yuchangjieshao;
	}
	
	/**
	 * 获取：渔场介绍
	 */
	public String getYuchangjieshao() {
		return yuchangjieshao;
	}
				
	
	/**
	 * 设置：渔场主账号
	 */
	 
	public void setYuchangzhuzhanghao(String yuchangzhuzhanghao) {
		this.yuchangzhuzhanghao = yuchangzhuzhanghao;
	}
	
	/**
	 * 获取：渔场主账号
	 */
	public String getYuchangzhuzhanghao() {
		return yuchangzhuzhanghao;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：评分
	 */
	 
	public void setTotalscore(Double totalscore) {
		this.totalscore = totalscore;
	}
	
	/**
	 * 获取：评分
	 */
	public Double getTotalscore() {
		return totalscore;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
