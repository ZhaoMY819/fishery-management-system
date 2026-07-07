package com.entity.vo;

import com.entity.YuzhongleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 鱼种类型
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public class YuzhongleixingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 回鱼价格
	 */
	
	private Double huiyujiage;
				
	
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
			
}
