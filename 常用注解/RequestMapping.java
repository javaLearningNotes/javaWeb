/*
Author:steam-404
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//标记一个类作为Spring MVC控制器，用于处理HTTP请求和响应。
public class Request{
    @RequestMapping(value = "/testRequest")
//    HTTP请求映射到相应的处理方法或类上
    public void testRequest() {
//        具体业务
    }
}