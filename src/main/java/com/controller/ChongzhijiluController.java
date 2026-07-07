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

import com.entity.ChongzhijiluEntity;
import com.entity.view.ChongzhijiluView;

import com.service.ChongzhijiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 充值记录
 * 后端接口
 * @author 
 * @email 
 * @date 2030-04-28 22:38:32
 */
@RestController
@RequestMapping("/chongzhijilu")
public class ChongzhijiluController {
    @Autowired
    private ChongzhijiluService chongzhijiluService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongzhijiluEntity chongzhijilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chongzhijilu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        EntityWrapper<ChongzhijiluEntity> ew = new EntityWrapper<ChongzhijiluEntity>();


        //查询结果
		PageUtils page = chongzhijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongzhijilu), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ChongzhijiluEntity chongzhijilu, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<ChongzhijiluEntity> ew = new EntityWrapper<ChongzhijiluEntity>();

        //查询结果
		PageUtils page = chongzhijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongzhijilu), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongzhijiluEntity chongzhijilu){
       	EntityWrapper<ChongzhijiluEntity> ew = new EntityWrapper<ChongzhijiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongzhijilu, "chongzhijilu")); 
        return R.ok().put("data", chongzhijiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongzhijiluEntity chongzhijilu){
        EntityWrapper< ChongzhijiluEntity> ew = new EntityWrapper< ChongzhijiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongzhijilu, "chongzhijilu")); 
		ChongzhijiluView chongzhijiluView =  chongzhijiluService.selectView(ew);
		return R.ok("查询充值记录成功").put("data", chongzhijiluView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongzhijiluEntity chongzhijilu = chongzhijiluService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(chongzhijilu,deSens);
        return R.ok().put("data", chongzhijilu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongzhijiluEntity chongzhijilu = chongzhijiluService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(chongzhijilu,deSens);
        return R.ok().put("data", chongzhijilu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增充值记录") 
    public R save(@RequestBody ChongzhijiluEntity chongzhijilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongzhijilu);
        chongzhijiluService.insert(chongzhijilu);
        return R.ok().put("data",chongzhijilu.getId());
    }
    
    /**
     * 前台保存
     */
    @SysLog("新增充值记录")
    @RequestMapping("/add")
    public R add(@RequestBody ChongzhijiluEntity chongzhijilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongzhijilu);
        chongzhijiluService.insert(chongzhijilu);
        return R.ok().put("data",chongzhijilu.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改充值记录")
    public R update(@RequestBody ChongzhijiluEntity chongzhijilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongzhijilu);
        //全部更新
        chongzhijiluService.updateById(chongzhijilu);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除充值记录")
    public R delete(@RequestBody Long[] ids){
        chongzhijiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
