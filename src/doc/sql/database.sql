-- 创建数据库；
CREATE DATABASE `db_blog` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

-- 创建测试用数据库表；
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 插入测试用数据；
INSERT INTO `db_blog`.`t_user` (`user_name`, `password`, `age`) VALUES ('Shawearn', '123456', '18');
INSERT INTO `db_blog`.`t_user` (`user_name`, `password`, `age`) VALUES ('Shaw', '123456', '19');
INSERT INTO `db_blog`.`t_user` (`user_name`, `password`, `age`) VALUES ('earn', '654321', '20');