package liul.cn.springboot.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 拦截内部错误  404无页面不会被拦截
 */
@ControllerAdvice
public class ExceptionHandler {
		
	    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
		@ResponseBody
		public String defaultExceptionHandler(HttpServletRequest req,Exception e){
			
			return "Error！";
		}
		
	}
