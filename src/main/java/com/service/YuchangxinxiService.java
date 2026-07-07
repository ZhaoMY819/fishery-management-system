package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuchangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuchangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuchangxinxiView;


/**
 * 渔场信息
 *
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public interface YuchangxinxiService extends IService<YuchangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuchangxinxiVO> selectListVO(Wrapper<YuchangxinxiEntity> wrapper);
   	
   	YuchangxinxiVO selectVO(@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);
   	
   	List<YuchangxinxiView> selectListView(Wrapper<YuchangxinxiEntity> wrapper);
   	
   	YuchangxinxiView selectView(@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuchangxinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YuchangxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YuchangxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YuchangxinxiEntity> wrapper);



}

