package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 渔场信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
@TableName("yuchangxinxi")
public class YuchangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuchangxinxiEntity() {
		
	}
	
	public YuchangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 渔场名称
	 */
					
	private String yuchangmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：渔场名称
	 */
	public void setYuchangmingcheng(String yuchangmingcheng) {
		this.yuchangmingcheng = yuchangmingcheng;
	}
	/**
	 * 获取：渔场名称
	 */
	public String getYuchangmingcheng() {
		return yuchangmingcheng;
	}
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
