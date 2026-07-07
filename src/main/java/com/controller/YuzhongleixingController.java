package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import com.utils.ValidatorUtils;
import com.utils.DeSensUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;
import com.annotation.SysLog;

import com.entity.YuzhongleixingEntity;
import com.entity.view.YuzhongleixingView;

import com.service.YuzhongleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 鱼种类型
 * 后端接口
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
@RestController
@RequestMapping("/yuzhongleixing")
public class YuzhongleixingController {
    @Autowired
    private YuzhongleixingService yuzhongleixingService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuzhongleixingEntity yuzhongleixing,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<YuzhongleixingEntity> ew = new EntityWrapper<YuzhongleixingEntity>();


        //查询结果
		PageUtils page = yuzhongleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuzhongleixing), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuzhongleixingEntity yuzhongleixing, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<YuzhongleixingEntity> ew = new EntityWrapper<YuzhongleixingEntity>();

        //查询结果
		PageUtils page = yuzhongleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuzhongleixing), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuzhongleixingEntity yuzhongleixing){
       	EntityWrapper<YuzhongleixingEntity> ew = new EntityWrapper<YuzhongleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuzhongleixing, "yuzhongleixing")); 
        return R.ok().put("data", yuzhongleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuzhongleixingEntity yuzhongleixing){
        EntityWrapper< YuzhongleixingEntity> ew = new EntityWrapper< YuzhongleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuzhongleixing, "yuzhongleixing")); 
		YuzhongleixingView yuzhongleixingView =  yuzhongleixingService.selectView(ew);
		return R.ok("查询鱼种类型成功").put("data", yuzhongleixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuzhongleixingEntity yuzhongleixing = yuzhongleixingService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yuzhongleixing,deSens);
        return R.ok().put("data", yuzhongleixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuzhongleixingEntity yuzhongleixing = yuzhongleixingService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yuzhongleixing,deSens);
        return R.ok().put("data", yuzhongleixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增鱼种类型") 
    public R save(@RequestBody YuzhongleixingEntity yuzhongleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuzhongleixing);
        yuzhongleixingService.insert(yuzhongleixing);
        return R.ok().put("data",yuzhongleixing.getId());
    }
    
    /**
     * 前台保存
     */
    @SysLog("新增鱼种类型")
    @RequestMapping("/add")
    public R add(@RequestBody YuzhongleixingEntity yuzhongleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuzhongleixing);
        yuzhongleixingService.insert(yuzhongleixing);
        return R.ok().put("data",yuzhongleixing.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改鱼种类型")
    public R update(@RequestBody YuzhongleixingEntity yuzhongleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuzhongleixing);
        //全部更新
        yuzhongleixingService.updateById(yuzhongleixing);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除鱼种类型")
    public R delete(@RequestBody Long[] ids){
        yuzhongleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
