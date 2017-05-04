# rabbitmq-test
rabbitmq的 hello world 例子


1.部署rabbitmq服务器(rabbitmq-server) 此处用docker镜像来完成 
  
  （1）下载镜像 docker pull rabbitmq:management
   (2) 启动.(注意 5672端口为amqp协议  15672端口是http协议)
        docker run --name rabbitmq -p 15671:15671 -p 15672:15672 -p 25672:25672 -p 4369:4369 -p 5671:5671 -p 5672:5672 rabbitmq:management   
        (注释：-p / --publish 设置 容器端口 与宿主机端口的映射 )
    
      访问 http://{你的server-name}:15672/  即可访问。 默认用户名和密码都是 guest. 这个账号只允许via localhost 如果想远程连接，需要添加用户。
2.创建一个application
   （1）引入依赖
           <parent>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-parent</artifactId>
              <version>1.5.3.RELEASE</version>
          </parent>
          <dependencies>
              <dependency>
                  <groupId>org.springframework.boot</groupId>
                  <artifactId>spring-boot-starter-web</artifactId>
              </dependency>
              <dependency>
                  <groupId>org.springframework.boot</groupId>
                  <artifactId>spring-boot-starter-amqp</artifactId>
              </dependency>
              <dependency>
                  <groupId>org.springframework.boot</groupId>
                  <artifactId>spring-boot-starter-test</artifactId>
                  <scope>test</scope>
              </dependency>
       </dependencies>
    （2）创建生产者 send 和 接收者 receiver
    （3）运行测试
