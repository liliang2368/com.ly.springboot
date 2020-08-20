package com.yc.projects.yc74ibike.web.controllers;

import com.yc.projects.yc74ibike.dao.bo.User;
import com.yc.projects.yc74ibike.service.Interface.IUserBusisv;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yc.projects.yc74ibike.vo.Bike;
import com.yc.projects.yc74ibike.web.model.JsonModel;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// @RestController   ->   @Controller  +   @ResponseBody
@RestController
@Api(value="小辰出行单车信息操作接口",tags= {"单车信息","控制层"})
public class BikeController {
	
	private Logger logger = LogManager.getLogger();
	@Autowired
	private IUserBusisv iUserBusisv;

	@ApiOperation(value = "门店采购订单报表组装数据接口", httpMethod = "POST")
	@ApiResponse(code = 200, message = "success", response = String.class)
	@GetMapping(value = "hello")
	public  JsonModel open(@RequestBody User user) {
		JsonModel jsonModel=new JsonModel();
		int result=iUserBusisv.insertUser(user);
		jsonModel.setObj(jsonModel);
		return jsonModel;
	}
	
	

}
