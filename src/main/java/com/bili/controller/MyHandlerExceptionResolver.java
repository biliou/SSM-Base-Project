package com.bili.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义异常处理器
 * HandlerExceptionResolver 所有异常处理需要的基类 
 * @author Administrator
 *
 */
@Controller
public class MyHandlerExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, 
							HttpServletResponse response, Object obj,Exception ex) {
		System.out.println("进入MyHandlerExceptionResolver");
		
		//ex可以放到request,model map modelmap
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("ex", ex);
		
		if(ex instanceof java.lang.ArithmeticException){
			return new ModelAndView("errors/error_myhandlerExceptionResolver",model);
		}else{
			return new ModelAndView("errors/error_404",model);
		}
	 
 	}

}
