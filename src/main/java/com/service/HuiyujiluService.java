package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyujiluView;


/**
 * 回鱼记录
 *
 * @author 
 * @email 
 * @date 2030-04-28 22:38:33
 */
public interface HuiyujiluService extends IService<HuiyujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyujiluVO> selectListVO(Wrapper<HuiyujiluEntity> wrapper);
   	
   	HuiyujiluVO selectVO(@Param("ew") Wrapper<HuiyujiluEntity> wrapper);
   	
   	List<HuiyujiluView> selectListView(Wrapper<HuiyujiluEntity> wrapper);
   	
   	HuiyujiluView selectView(@Param("ew") Wrapper<HuiyujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyujiluEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HuiyujiluEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HuiyujiluEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HuiyujiluEntity> wrapper);



}

