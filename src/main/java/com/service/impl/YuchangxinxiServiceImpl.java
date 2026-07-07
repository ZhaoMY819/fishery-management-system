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


import com.dao.YuchangxinxiDao;
import com.entity.YuchangxinxiEntity;
import com.service.YuchangxinxiService;
import com.entity.vo.YuchangxinxiVO;
import com.entity.view.YuchangxinxiView;

@Service("yuchangxinxiService")
public class YuchangxinxiServiceImpl extends ServiceImpl<YuchangxinxiDao, YuchangxinxiEntity> implements YuchangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuchangxinxiEntity> page = this.selectPage(
                new Query<YuchangxinxiEntity>(params).getPage(),
                new EntityWrapper<YuchangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuchangxinxiEntity> wrapper) {
		  Page<YuchangxinxiView> page =new Query<YuchangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuchangxinxiVO> selectListVO(Wrapper<YuchangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuchangxinxiVO selectVO(Wrapper<YuchangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuchangxinxiView> selectListView(Wrapper<YuchangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuchangxinxiView selectView(Wrapper<YuchangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YuchangxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YuchangxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YuchangxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
