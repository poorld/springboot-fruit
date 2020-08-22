# Spring AOP拦截抽象类(父类)中方法失效问题
1. 方法1
    - 参考https://blog.csdn.net/u014439693/article/details/106506177/

    - 在拦截类(我这里是父类AbstractApiController)加上EnableAspectJAutoProxy(exposeProxy = true)

    - Pointcut切点:
    ```java
    @Pointcut("execution(public * com.teenyda.controller.api.AbstractApiController.*(..))")
    ```
    - 强制使用代理对象调用父类方法
    
    定义一个方法，获取代理对象
    ```java
       private AbstractApiController getProxyObject() {
            return ((AbstractApiController) AopContext.currentProxy());
        }
    ```
   
   - 使用 代理对象.父类方法()
   ```java
    getProxyObject().responseSuccessJson(bookDto);
    ```
   
> 缺点：调用父类方法需要通过代理对象调用才能被拦截到

2. 方法2
    - Pointcut切点 在类后面加上 +
        ```java
        @Pointcut("execution(public * com.teenyda.controller.api.AbstractApiController+.*(..))")
        ```
    
    > 如果根据前面的步骤来修改测试或者是参考链接，把所有步骤撤销，然后直接使用方法2