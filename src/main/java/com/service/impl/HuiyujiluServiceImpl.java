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


import com.dao.HuiyujiluDao;
import com.entity.HuiyujiluEntity;
import com.service.HuiyujiluService;
import com.entity.vo.HuiyujiluVO;
import com.entity.view.HuiyujiluView;

@Service("huiyujiluService")
public class HuiyujiluServiceImpl extends ServiceImpl<HuiyujiluDao, HuiyujiluEntity> implements HuiyujiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyujiluEntity> page = this.selectPage(
                new Query<HuiyujiluEntity>(params).getPage(),
                new EntityWrapper<HuiyujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyujiluEntity> wrapper) {
		  Page<HuiyujiluView> page =new Query<HuiyujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<HuiyujiluVO> selectListVO(Wrapper<HuiyujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyujiluVO selectVO(Wrapper<HuiyujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyujiluView> selectListView(Wrapper<HuiyujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyujiluView selectView(Wrapper<HuiyujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HuiyujiluEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HuiyujiluEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HuiyujiluEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
