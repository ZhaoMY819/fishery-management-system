package com.entity.model;

import com.entity.YuzhongleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 鱼种类型
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public class YuzhongleixingModel  implements Serializable {
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
