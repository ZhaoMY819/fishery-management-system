package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuechitangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuechitangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuechitangView;


/**
 * 预约池塘
 *
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public interface YuyuechitangService extends IService<YuyuechitangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuechitangVO> selectListVO(Wrapper<YuyuechitangEntity> wrapper);
   	
   	YuyuechitangVO selectVO(@Param("ew") Wrapper<YuyuechitangEntity> wrapper);
   	
   	List<YuyuechitangView> selectListView(Wrapper<YuyuechitangEntity> wrapper);
   	
   	YuyuechitangView selectView(@Param("ew") Wrapper<YuyuechitangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuechitangEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YuyuechitangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YuyuechitangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YuyuechitangEntity> wrapper);



}

