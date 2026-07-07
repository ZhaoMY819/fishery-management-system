package com.entity.model;

import com.entity.HuiyujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 回鱼记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2030-04-28 22:38:33
 */
public class HuiyujiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 回鱼图片
	 */
	
	private String huiyutupian;
		
	/**
	 * 鱼种类型
	 */
	
	private String yuzhongleixing;
		
	/**
	 * 回鱼价格
	 */
	
	private Double huiyujiage;
		
	/**
	 * 重量
	 */
	
	private Integer zhongliang;
		
	/**
	 * 总价
	 */
	
	private Double zongjia;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 回鱼时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huiyushijian;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 渔场主账号
	 */
	
	private String yuchangzhuzhanghao;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：回鱼图片
	 */
	 
	public void setHuiyutupian(String huiyutupian) {
		this.huiyutupian = huiyutupian;
	}
	
	/**
	 * 获取：回鱼图片
	 */
	public String getHuiyutupian() {
		return huiyutupian;
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
	 * 设置：回鱼价格
	 */
	 
	public void setHuiyujiage(Double huiyujiage) {
		this.huiyujiage = huiyujiage;
	}
	
	/**
	 * 获取：回鱼价格
	 */
	public Double getHuiyujiage() {
		return huiyujiage;
	}
				
	
	/**
	 * 设置：重量
	 */
	 
	public void setZhongliang(Integer zhongliang) {
		this.zhongliang = zhongliang;
	}
	
	/**
	 * 获取：重量
	 */
	public Integer getZhongliang() {
		return zhongliang;
	}
				
	
	/**
	 * 设置：总价
	 */
	 
	public void setZongjia(Double zongjia) {
		this.zongjia = zongjia;
	}
	
	/**
	 * 获取：总价
	 */
	public Double getZongjia() {
		return zongjia;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：回鱼时间
	 */
	 
	public void setHuiyushijian(Date huiyushijian) {
		this.huiyushijian = huiyushijian;
	}
	
	/**
	 * 获取：回鱼时间
	 */
	public Date getHuiyushijian() {
		return huiyushijian;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
