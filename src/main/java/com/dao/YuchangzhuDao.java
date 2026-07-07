package com.dao;

import com.entity.YuchangzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuchangzhuVO;
import com.entity.view.YuchangzhuView;


/**
 * 渔场主
 * 
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
public interface YuchangzhuDao extends BaseMapper<YuchangzhuEntity> {
	
	List<YuchangzhuVO> selectListVO(@Param("ew") Wrapper<YuchangzhuEntity> wrapper);
	
	YuchangzhuVO selectVO(@Param("ew") Wrapper<YuchangzhuEntity> wrapper);
	
	List<YuchangzhuView> selectListView(@Param("ew") Wrapper<YuchangzhuEntity> wrapper);

	List<YuchangzhuView> selectListView(Pagination page,@Param("ew") Wrapper<YuchangzhuEntity> wrapper);

	
	YuchangzhuView selectView(@Param("ew") Wrapper<YuchangzhuEntity> wrapper);
	

}
