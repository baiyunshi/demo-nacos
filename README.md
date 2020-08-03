# demo-nacos

####环境配置信息：
jdk:1.8

springcloud:Greenwich.SR6

springboot:2.1.7.RELEASE

springcloud-alibaba:2.1.2.RELEASE

springcloud-nacos-config:2.1.2.RELEASE

####项目配置说明
目前只集成了nacos配置中心用于多环境配置测试

未集成注册中心

多环境配置文件加载方式：${spring.application.name}-${spring.profile.active}.${spring.cloud.nacos.config.file-extension}

例如本项目目前加载配置文件为：nacos-test.yaml

