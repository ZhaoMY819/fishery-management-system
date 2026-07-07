package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuzhongleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuzhongleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuzhongleixingView;


/**
 * 鱼种类型
 *
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public interface YuzhongleixingService extends IService<YuzhongleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuzhongleixingVO> selectListVO(Wrapper<YuzhongleixingEntity> wrapper);
   	
   	YuzhongleixingVO selectVO(@Param("ew") Wrapper<YuzhongleixingEntity> wrapper);
   	
   	List<YuzhongleixingView> selectListView(Wrapper<YuzhongleixingEntity> wrapper);
   	
   	YuzhongleixingView selectView(@Param("ew") Wrapper<YuzhongleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuzhongleixingEntity> wrapper);

   	

}

