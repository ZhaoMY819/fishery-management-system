package com.dao;

import com.entity.YuzhongleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuzhongleixingVO;
import com.entity.view.YuzhongleixingView;


/**
 * 鱼种类型
 * 
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public interface YuzhongleixingDao extends BaseMapper<YuzhongleixingEntity> {
	
	List<YuzhongleixingVO> selectListVO(@Param("ew") Wrapper<YuzhongleixingEntity> wrapper);
	
	YuzhongleixingVO selectVO(@Param("ew") Wrapper<YuzhongleixingEntity> wrapper);
	
	List<YuzhongleixingView> selectListView(@Param("ew") Wrapper<YuzhongleixingEntity> wrapper);

	List<YuzhongleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YuzhongleixingEntity> wrapper);

	
	YuzhongleixingView selectView(@Param("ew") Wrapper<YuzhongleixingEntity> wrapper);
	

}
