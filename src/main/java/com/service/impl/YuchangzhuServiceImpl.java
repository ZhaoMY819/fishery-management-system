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


import com.dao.YuchangzhuDao;
import com.entity.YuchangzhuEntity;
import com.service.YuchangzhuService;
import com.entity.vo.YuchangzhuVO;
import com.entity.view.YuchangzhuView;

@Service("yuchangzhuService")
public class YuchangzhuServiceImpl extends ServiceImpl<YuchangzhuDao, YuchangzhuEntity> implements YuchangzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuchangzhuEntity> page = this.selectPage(
                new Query<YuchangzhuEntity>(params).getPage(),
                new EntityWrapper<YuchangzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuchangzhuEntity> wrapper) {
		  Page<YuchangzhuView> page =new Query<YuchangzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuchangzhuVO> selectListVO(Wrapper<YuchangzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuchangzhuVO selectVO(Wrapper<YuchangzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuchangzhuView> selectListView(Wrapper<YuchangzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuchangzhuView selectView(Wrapper<YuchangzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
