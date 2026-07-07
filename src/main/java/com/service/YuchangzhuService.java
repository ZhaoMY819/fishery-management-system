package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuchangzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuchangzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuchangzhuView;


/**
 * 渔场主
 *
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public interface YuchangzhuService extends IService<YuchangzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuchangzhuVO> selectListVO(Wrapper<YuchangzhuEntity> wrapper);
   	
   	YuchangzhuVO selectVO(@Param("ew") Wrapper<YuchangzhuEntity> wrapper);
   	
   	List<YuchangzhuView> selectListView(Wrapper<YuchangzhuEntity> wrapper);
   	
   	YuchangzhuView selectView(@Param("ew") Wrapper<YuchangzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuchangzhuEntity> wrapper);

   	

}

