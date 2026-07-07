package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyuchangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyuchangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyuchangxinxiView;


/**
 * 渔场信息评论表
 *
 * @author 
 * @email 
 * @date 2030-04-28 22:38:34
 */
public interface DiscussyuchangxinxiService extends IService<DiscussyuchangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyuchangxinxiVO> selectListVO(Wrapper<DiscussyuchangxinxiEntity> wrapper);
   	
   	DiscussyuchangxinxiVO selectVO(@Param("ew") Wrapper<DiscussyuchangxinxiEntity> wrapper);
   	
   	List<DiscussyuchangxinxiView> selectListView(Wrapper<DiscussyuchangxinxiEntity> wrapper);
   	
   	DiscussyuchangxinxiView selectView(@Param("ew") Wrapper<DiscussyuchangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyuchangxinxiEntity> wrapper);

   	

}

