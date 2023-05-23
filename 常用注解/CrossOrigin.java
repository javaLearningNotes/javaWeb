/*
Author:steam-404
 */
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//标记一个类作为Spring MVC控制器，用于处理HTTP请求和响应。
public class message {
    @CrossOrigin
//    允许跨域
    @RequestMapping(value = "testRequest")
//    http请求
    public void testRequest(){

    }
}
