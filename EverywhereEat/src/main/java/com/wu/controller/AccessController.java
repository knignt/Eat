package com.wu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.wu.entity.User;
import com.wu.service.IUserService;

@Controller
@RequestMapping("/access")
public class AccessController {
	private static Logger _log = Logger.getLogger(AccessController.class);
	
	@Resource
	private IUserService service;
	@RequestMapping("/regist")
	public String regist(HttpServletRequest request,Model model){
		
		return null;
	}
	@RequestMapping("/validate")
	public @ResponseBody String validate(HttpServletRequest request) throws Exception{
		String sname = request.getParameter("name");
		_log.info("name :" + sname);
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = new HashMap<String, String>();
		if(!sname.equals("")){
			User user = service.getUserBySname(sname);
			if(user!=null){
				//不存在用户
				map.put("result", "yes");
			}
			//存在用户
			map.put("result", "no");
		}
		
		return mapper.writeValueAsString(map);
	}
}
