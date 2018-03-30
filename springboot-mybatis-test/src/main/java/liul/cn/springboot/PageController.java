package liul.cn.springboot;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/hello")
	public String hello(Map<String,Object> map) {
		map.put("name","Andy");
		return "hello";
	}

	@RequestMapping("/helloFtl")
	public String helloFtl(Map<String,Object> map) {
		map.put("name","Andy");
		return "helloFtl";
	}
}
