package com.dao;

import com.entity.HuiyujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyujiluVO;
import com.entity.view.HuiyujiluView;


/**
 * 回鱼记录
 * 
 * @author 
 * @email 
 * @date 2030-04-28 22:38:33
 */
public interface HuiyujiluDao extends BaseMapper<HuiyujiluEntity> {
	
	List<HuiyujiluVO> selectListVO(@Param("ew") Wrapper<HuiyujiluEntity> wrapper);
	
	HuiyujiluVO selectVO(@Param("ew") Wrapper<HuiyujiluEntity> wrapper);
	
	List<HuiyujiluView> selectListView(@Param("ew") Wrapper<HuiyujiluEntity> wrapper);

	List<HuiyujiluView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyujiluEntity> wrapper);

	
	HuiyujiluView selectView(@Param("ew") Wrapper<HuiyujiluEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuiyujiluEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuiyujiluEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuiyujiluEntity> wrapper);



}
