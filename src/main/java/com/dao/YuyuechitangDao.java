package com.dao;

import com.entity.YuyuechitangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuechitangVO;
import com.entity.view.YuyuechitangView;


/**
 * 预约池塘
 * 
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public interface YuyuechitangDao extends BaseMapper<YuyuechitangEntity> {
	
	List<YuyuechitangVO> selectListVO(@Param("ew") Wrapper<YuyuechitangEntity> wrapper);
	
	YuyuechitangVO selectVO(@Param("ew") Wrapper<YuyuechitangEntity> wrapper);
	
	List<YuyuechitangView> selectListView(@Param("ew") Wrapper<YuyuechitangEntity> wrapper);

	List<YuyuechitangView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuechitangEntity> wrapper);

	
	YuyuechitangView selectView(@Param("ew") Wrapper<YuyuechitangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuechitangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuechitangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuechitangEntity> wrapper);



}
