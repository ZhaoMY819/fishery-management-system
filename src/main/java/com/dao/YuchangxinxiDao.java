package com.dao;

import com.entity.YuchangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuchangxinxiVO;
import com.entity.view.YuchangxinxiView;


/**
 * 渔场信息
 * 
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public interface YuchangxinxiDao extends BaseMapper<YuchangxinxiEntity> {
	
	List<YuchangxinxiVO> selectListVO(@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);
	
	YuchangxinxiVO selectVO(@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);
	
	List<YuchangxinxiView> selectListView(@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);

	List<YuchangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);

	
	YuchangxinxiView selectView(@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuchangxinxiEntity> wrapper);



}
