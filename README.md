# test_springboot
springboot demo

#### 启动
1. mvn spring-boot:run
2. ① mvn install  ② cd target  ③java -jar xxx.jar --spring.profiles.active=prod


#### Tips
1. @RestController = @Controller + @ResponseBody 返回json数据.
2.
 header 1 | header 2
 ---|---
 @PathVariable | 获取url中的数据
 @RequestParam | 获取请求参数的值(GET和POST)
 @GetMapping | 组合注解