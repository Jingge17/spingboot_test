package liul.cn.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("liul.cn.*")//扫描mybatis类 UserMapper(上级包目录才可生效)
public class App {

	public static void main(String[] args) {
		 SpringApplication.run(App.class, args);

	}

}
