package com.entity.view;

import com.entity.YuchangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 渔场信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
@TableName("yuchangxinxi")
public class YuchangxinxiView  extends YuchangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuchangxinxiView(){
	}
 
 	public YuchangxinxiView(YuchangxinxiEntity yuchangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yuchangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
