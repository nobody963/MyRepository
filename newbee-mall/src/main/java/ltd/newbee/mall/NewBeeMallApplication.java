package ltd.newbee.mall;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

/**
 * @author 13  --------这是我新增加的------
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link https://github.com/newbee-ltd
 */
@MapperScan("ltd.newbee.mall.dao")
@SpringBootApplication
public class NewBeeMallApplication {
    public static void main(String[] args) {

        SpringApplication.run(NewBeeMallApplication.class, args);
        System.out.println("args = " + args);
    }
}
