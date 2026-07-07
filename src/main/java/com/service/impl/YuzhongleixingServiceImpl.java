package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuzhongleixingDao;
import com.entity.YuzhongleixingEntity;
import com.service.YuzhongleixingService;
import com.entity.vo.YuzhongleixingVO;
import com.entity.view.YuzhongleixingView;

@Service("yuzhongleixingService")
public class YuzhongleixingServiceImpl extends ServiceImpl<YuzhongleixingDao, YuzhongleixingEntity> implements YuzhongleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuzhongleixingEntity> page = this.selectPage(
                new Query<YuzhongleixingEntity>(params).getPage(),
                new EntityWrapper<YuzhongleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuzhongleixingEntity> wrapper) {
		  Page<YuzhongleixingView> page =new Query<YuzhongleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuzhongleixingVO> selectListVO(Wrapper<YuzhongleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuzhongleixingVO selectVO(Wrapper<YuzhongleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuzhongleixingView> selectListView(Wrapper<YuzhongleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuzhongleixingView selectView(Wrapper<YuzhongleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
