### JDBC API

```java
/*
@Author:steam-404
 */

//核心api
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class JDBC {
    public static void main(String[] args) throws SQLException{
//        配置连接信息
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "root";

//        需要执行的sql语句
        String SQL = "select * from blog.access;";
//        连接对象
        Connection connection = DriverManager.getConnection(url, user, password);
//        创建请求对象
        Statement statement = connection.createStatement();
//        返回集
        ResultSet resultSet = statement.executeQuery(SQL);
//        使用循环方式获取mysql数据
        while (resultSet.next()) {
//            打印类型为String的数据
            System.out.println(resultSet.getString("browser"));
        }
//        关闭数据库连接(从里到外,依次关闭)
        resultSet.close();
        statement.close();
        connection.close();
    }
}
```
