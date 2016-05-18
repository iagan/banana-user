/**
 * 用户信息表
 */
CREATE TABLE plat_user(
  user_id          BIGINT(20) NOT NULL COMMENT '内部ID',
  login_id         VARCHAR(16) NOT NULL COMMENT '登录ID(用户自定义ID)',
  nick_name        VARCHAR(16) NOT NULL COMMENT '昵称',
  mobile           VARCHAR(16) NULL COMMENT '手机号',
  email            VARCHAR(32) NULL COMMENT '邮箱',
  sex              CHAR(1) NOT NULL DEFAULT '2' COMMENT '性别',
  passwd           CHAR(32) NOT NULL COMMENT '账号密码/支付密码',
  area_code        VARCHAR(16)  NULL COMMENT '地区代码',
  create_time      DATETIME NOT NULL COMMENT '创建时间',
  version          INT(11) NOT NULL DEFAULT 1 COMMENT '数据版本号',
  PRIMARY KEY (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '账号信息表';