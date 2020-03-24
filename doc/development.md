1. 功能实现最小划分
2. 选取技术栈
3. 设计系统分层结构
4. 设计RESTful API
5. 模块划分
6. 开发人员分配
7. 项目推进流程


# AMS

## 功能实现最小划分

1. 会员管理：
	- 访问后台管理界面
	- 新增会员，删除用户，编辑用户
	- 分页组件，分页查询
	- 会员名模糊搜索
	- 注册
	- 会员主页，展示会员信息
	- 个人资料设置，用户修改个人资料
2. 角色管理：
	- 建立权限（角色）实体
	- 建立会员与权限（角色）的关系：绑定会员id
	- 创建用户时关联角色
	- 修改会员角色
	- 初始化权限（角色），会员数据
3. 文章管理
	- 文章模型设计
	- 文章频道分类
	- 发表文章
	- 编辑文章
	- 删除文章
	- 查询文章
	- 按标题，关键字模糊查询文章
	- 按照最新的文章排序
4. 文章关键字分析
	- 发布文章前，分析文章内容，得出topK的关键字作为标签
5. 爬虫管理
	- 对各大门户网站建立爬虫，爬去最新文章

## 技术栈
1. 整体框架：Sprint Boot
2. 采用前后端完全分离
3. 数据持久化：mybatis
4. 全文搜索：Elasticsearch
5. 前端框架：Bootstrap
6. JQuery
7. 数据库：MySQL 8.0.12
8. Gradle导入依赖，插件
9.大数据支持
10.爬虫技术
11.redis缓存技术
## 设计系统分层结构
### 后台
- controller：控制层
- service：服务层
- repository：资源层，用于持久化数据
- domain：实体域
- vo：Value Object，存储数据对象，如前台发回的Response
- util：工具类
- redis：缓存
- mq:消息队列
- result:给前端返回的数据
### 前台
放在src/main/resources目录下
```
└── resources/
 	└── static/
	| 	└── css/
	| 	 	├── fonts/
	| 	 	├── images/
	| 	 	└── js/
	|			├── admins/
	| 	 		├── users/
	| 	 		└── userspace/
	|
	└── templates/
		├── admains/
		├── users/
		├── fragments/
		├── userspace/
		├── index.html
		├── login.html
		└── register.html
```

## 设计RESTful API
1. 会员管理
	- 注册
		- /register: GET获取注册界面
		- /register: POST提交注册表单，注册成功转到登录界面
			- **User**：用户实体对象
	- 后台管理
		- /admins:　获取后台管理界面
	
	- 用户管理
		- /users: GET获取用户列表
			- pageIndex: 页面索引
			- pageSize: 一页展示的用户数
			- name: 用户名称的关键字
		- /users/add: GET获取添加用户界面
		- /users: POST保存用户对象
			- **User**: 待保存用户对象
			- authorityId: 角色ID
		- /users/{id}: 根据用户id删除用户
		- /users/edit/{id}: 根据用户id编辑用户信息


## 项目推进
在已有的基础（Spring Boot + Thymeleaf + 部分User管理　+ 简单页面）上还需要做：

1. 整合mybatis做持久层框架，项目Hibernate，mybatis更加轻量级，灵活，高效，适合中小项目。
2. 整合Elasticsearch作全文搜索
3. 集成Bootstrap，添加更多页面
4. 集成Spring Security
5. 用户管理实现
6. 角色管理实现
7. 权限管理实现
8. 博客管理实现
9. 关键字生成标签实现
10. 首页搜索实现

学习内容也与之对应，尽量每周都有一定的推进