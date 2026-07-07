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


import com.dao.YuyuechitangDao;
import com.entity.YuyuechitangEntity;
import com.service.YuyuechitangService;
import com.entity.vo.YuyuechitangVO;
import com.entity.view.YuyuechitangView;

@Service("yuyuechitangService")
public class YuyuechitangServiceImpl extends ServiceImpl<YuyuechitangDao, YuyuechitangEntity> implements YuyuechitangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuechitangEntity> page = this.selectPage(
                new Query<YuyuechitangEntity>(params).getPage(),
                new EntityWrapper<YuyuechitangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuechitangEntity> wrapper) {
		  Page<YuyuechitangView> page =new Query<YuyuechitangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuyuechitangVO> selectListVO(Wrapper<YuyuechitangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuechitangVO selectVO(Wrapper<YuyuechitangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuechitangView> selectListView(Wrapper<YuyuechitangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuechitangView selectView(Wrapper<YuyuechitangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YuyuechitangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YuyuechitangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YuyuechitangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
