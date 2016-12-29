package com.wu.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * test
 * @author Wu
 *
 */
@Controller
@RequestMapping("/test")
public class TestController{
	Logger _logger = Logger.getLogger(TestController.class);
	@RequestMapping("/download")
	public ResponseEntity<byte[]> downLoad(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String path = "C:\\Users\\Wu\\Desktop";
		String filename = request.getParameter("filename");
		File file = new File(path+"/"+filename);
		_logger.info("path:"+ path);
		_logger.info("filename:"+filename);
		HttpHeaders header = new HttpHeaders();
		header.setContentDispositionFormData("attachment", filename);
		header.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),header,HttpStatus.CREATED);
	}
}
