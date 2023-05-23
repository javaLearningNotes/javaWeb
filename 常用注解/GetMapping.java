/*
Author:steam-404
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//标记一个类作为Spring MVC控制器，用于处理HTTP请求和响应。
public class getMapping{
    @GetMapping(value = "testGet")
//    Get请求
    public void testGet(){

    }
}
