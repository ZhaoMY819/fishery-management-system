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


import com.dao.DiscussyuchangxinxiDao;
import com.entity.DiscussyuchangxinxiEntity;
import com.service.DiscussyuchangxinxiService;
import com.entity.vo.DiscussyuchangxinxiVO;
import com.entity.view.DiscussyuchangxinxiView;

@Service("discussyuchangxinxiService")
public class DiscussyuchangxinxiServiceImpl extends ServiceImpl<DiscussyuchangxinxiDao, DiscussyuchangxinxiEntity> implements DiscussyuchangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyuchangxinxiEntity> page = this.selectPage(
                new Query<DiscussyuchangxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyuchangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyuchangxinxiEntity> wrapper) {
		  Page<DiscussyuchangxinxiView> page =new Query<DiscussyuchangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyuchangxinxiVO> selectListVO(Wrapper<DiscussyuchangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyuchangxinxiVO selectVO(Wrapper<DiscussyuchangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyuchangxinxiView> selectListView(Wrapper<DiscussyuchangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyuchangxinxiView selectView(Wrapper<DiscussyuchangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
