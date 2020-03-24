DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(40)  COMMENT '用户id，主键',
  `phone_number` varchar(15) not null COMMENT '用户手机号',
  `nickname` varchar(255) NOT NULL COMMENT '登录昵称',
  `password` varchar(32) DEFAULT NULL COMMENT 'MD5(MD5(pass明文+固定salt)+salt)',
  `sex` int(1)  COMMENT '0:女, 1:男',
  `age` int(3)  COMMENT '年龄:0~100',
  `province` varchar(10)  COMMENT '用户省份',
  `interest` varchar(32)  COMMENT '感兴趣的方向,例如：Java/二次元/大数据/游戏;用 / 分割',
  `salt` varchar(10) DEFAULT NULL COMMENT '加密的字符串（随机生成）',
  `head` varchar(128) DEFAULT NULL COMMENT '头像，云存储的id',
  `register_date` datetime DEFAULT NULL COMMENT '注册时间',
  `last_login_date` datetime DEFAULT NULL COMMENT '上次登录时间',
  `login_count` int(11) DEFAULT '0' COMMENT '登录次数',
   `reserved_filds` varchar (255) COMMENT'预留位1',
   `reserved_filds2` varchar (255) COMMENT '预留位2',
   `reserved_filds3` varchar (255) COMMENT '预留位3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;