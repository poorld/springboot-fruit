## 目录规范
### 目录规范
根目录:com.teenyda
- common项目中公用的文件
- config配置信息类
- constant常量接口类
- controller前端控制器
- dao数据访问层
- domain实体类
- dto数据传输对象
- exception异常类
- interceptor拦截器
- service数据服务层
- utils工具类
- vo数据传输类(展现数据时用的)

资源:resources
- mapper目录 mybatis .xml文件
- application.yml 项目配置
- logback.xml 日志配置文件
- README.MD 项目说明
- sql.db 创建数据库语句

## 接口规范
Cover [restful最佳实践——接口规范](https://www.toutiao.com/i6634864990727717384/)
### 前提
RESTful API 统一约束客户端和服务器之间的接口。简化和分离系统架构，使每个模块独立！
请求中使用URI定位资源
用HTTP Verbs[动词]（GET、POST、PUT、DELETE）描述操作（具体表现形式）
数据传递（默认）采用：Content-Type: application/json; charset=utf-8

### URL规范
```text
GET https//domain.com/api/{模块名}/{?菜单名}/{接口名}/:param
```
1.不能使用大写，用中横线 - 不用下划线 _ ；
2.使用名词表示资源集合，使用复数形式（为确保所有API URIs保持一致），不能使用动词；
3.每个资源都至少有一个标识它的URI，同时应该遵循一个可预测的层次结构来提高可理解性，从而提高可用性；
4.无需在URI中增加版本号，通过HTTP请求头信息的字段中进行区分（或者在URI包含主版本信息，同时请求头包含子版本信息。

### Request
|请求方法|说明|安全性|幂等性|
|---|---|---|---|
|GET(SELECT)|获取资源|√|√|
|POST(CREATE)|创建资源|×|×|
|PUT(UPDATE)|更新资源|×|√|
|DELETE(DELETE)|删除资源|×|√|
说明：
1. 安全性 ：不会改变资源状态，可以理解为只读的；
2. 幂等性 ：执行1次和执行N次，对资源状态改变的效果是等价的。
3. 查询字段内容过多，统一使用POST方式查询，请求地址增加/query加以区分
4. 批量删除，统一使用POST方式，请求地址增加/delete加以区分

### status说明
| 状态 | 说明 |
| -----| -----|
|fail | 返回码为500-599|
|error|返回码为400-499|
|success|其它状态码(1xx、2xx、3xx)|

参考
```
├── pom.xml
└── src
    └── main
        └── java
            └── org
                └── spring
                    └── springboot
                        ├── Application.java
                        ├── constant
                        │   └── CityErrorInfoEnum.java
                        ├── data
                        │   ├── ErrorInfoInterface.java
                        │   ├── GlobalErrorInfoEnum.java
                        │   ├── GlobalErrorInfoException.java
                        │   ├── GlobalErrorInfoHandler.java
                        │   └── ResultBody.java
                        └── web
                            ├── City.java
                            └── ErrorJsonController.java
```


### 解决application.yml不生效问题
> Could not resolve placeholder 'server.port' in value "${server.port}"
- 右键点击resources文件夹
- Mark Directory as 
- Sources Root

### 工具类static成员使用@Value获取不到值
- 添加一个set方法，并使用@Value注解
```java
private static String port;
@Value("${server.port}")
public void setPort(String port){
    this.port = port;
}
```

### 开启请求-响应json驼峰转换
```yaml
  spring:
    jackson:
        # 请求响应的驼峰转换
        # response bookName -> book_name
        # request book_name -> bookName
        property-naming-strategy: CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES
```
> 注意：使用驼峰转换后就不能用驼峰式提交表单，否则获取不到数据
>
> book_name √
>
> bookName ×

# mybatis-generoter
https://gitee.com/rohou/mybatis-generator?_from=gitee_search

自定义生成mybatis ，可以自己控制模板

db目录下的main文件运行即可

借鉴 Mybatis-generator的思想

insert、update、query生成 主键查询生成XXXById

自由控制sql的返回的属性集，通过fetchXXX，或者excludeXXX控制 通过Builder构建查询


# EasyCode 代码生成器
[EasyCode](https://plugins.jetbrains.com/plugin/10954-easy-code)

基于IntelliJ IDEA开发的代码生成插件，支持自定义任意模板（Java，html，js，xml）。

只要是与数据库相关的代码都可以通过自定义模板来生成。支持数据库类型与java类型映射关系配置。

支持同时生成生成多张表的代码。每张表有独立的配置信息。完全的个性化定义，规则由你设置。

> 为了区分mybatis-generoter与EasyCode生成的代码，
> mybatis-generoter生成的代码位于com.teenyda.domain(实体类) com.teenyda.mapper(数据库访问) 
> EasyCode生成的代码位于com.teenyda.entity(实体类) com.teenyda.dao(数据库访问) com.teenyda.service(数据库访问) 