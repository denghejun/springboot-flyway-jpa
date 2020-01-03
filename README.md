####
H2数据库根据jdbc url来申明是内存数据库还是基于持久化的文件数据库
- 内存数据库：jdbc:h2:mem:mem-db1
- 文件数据库：jdbc:h2:./local-db

#### 当Flyway出现migrate错误时，利用mvn flyway:clean修复,但所有表和数据都会被移除，所以生产环境禁止使用clean.

#### JPA可以直接申明Entity的形式自动在数据库里创建表结构

#### 可以通过console访问h2数据库,例如: http://localhost:9090/h2-console

#### 可以通过java -jar -Dspring.profiles.active=prod demo.1.0.jar 来运行