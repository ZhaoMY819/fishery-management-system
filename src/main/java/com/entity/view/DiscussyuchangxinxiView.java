package com.entity.view;

import com.entity.DiscussyuchangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 渔场信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2030-04-28 22:38:34
 */
@TableName("discussyuchangxinxi")
public class DiscussyuchangxinxiView  extends DiscussyuchangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyuchangxinxiView(){
	}
 
 	public DiscussyuchangxinxiView(DiscussyuchangxinxiEntity discussyuchangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyuchangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
