package com.dao;

import com.entity.DiscussyuchangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyuchangxinxiVO;
import com.entity.view.DiscussyuchangxinxiView;


/**
 * 渔场信息评论表
 * 
 * @author 
 * @email 
 * @date 2030-04-28 22:38:34
 */
public interface DiscussyuchangxinxiDao extends BaseMapper<DiscussyuchangxinxiEntity> {
	
	List<DiscussyuchangxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyuchangxinxiEntity> wrapper);
	
	DiscussyuchangxinxiVO selectVO(@Param("ew") Wrapper<DiscussyuchangxinxiEntity> wrapper);
	
	List<DiscussyuchangxinxiView> selectListView(@Param("ew") Wrapper<DiscussyuchangxinxiEntity> wrapper);

	List<DiscussyuchangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyuchangxinxiEntity> wrapper);

	
	DiscussyuchangxinxiView selectView(@Param("ew") Wrapper<DiscussyuchangxinxiEntity> wrapper);
	

}
