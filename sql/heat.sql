/*
Navicat MySQL Data Transfer

Source Server         : local-192.168.1.100
Source Server Version : 50628
Source Host           : 192.168.1.100:3306
Source Database       : heat

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2019-06-13 21:20:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_apply
-- ----------------------------
DROP TABLE IF EXISTS `t_apply`;
CREATE TABLE `t_apply` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `user_id` bigint(20) NOT NULL COMMENT '用户Id',
  `room_id` bigint(20) NOT NULL COMMENT '房间Id',
  `apply_type` int(1) DEFAULT '0' COMMENT '类型 0-报停 1-强停 2-复热',
  `stat` int(1) DEFAULT '0' COMMENT '0 - 报停申请 1 - 报停完成 2 - 强停完成 3 - 复热申请 4 - 复热完成',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_apply
-- ----------------------------

-- ----------------------------
-- Table structure for t_area
-- ----------------------------
DROP TABLE IF EXISTS `t_area`;
CREATE TABLE `t_area` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `area_name` varchar(20) DEFAULT '' COMMENT '小区名称',
  `site_id` bigint(20) NOT NULL COMMENT '站点Id',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_area
-- ----------------------------
INSERT INTO `t_area` VALUES ('3', null, '清江山水', '3', null, '112', null, null, null, '管理员', '1', '2019-06-12 15:46:59');

-- ----------------------------
-- Table structure for t_building
-- ----------------------------
DROP TABLE IF EXISTS `t_building`;
CREATE TABLE `t_building` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `building_no` varchar(20) DEFAULT '' COMMENT '热站名称',
  `building_name` varchar(20) DEFAULT '' COMMENT '热站名称',
  `unit_size` int(1) DEFAULT '2' COMMENT '单元',
  `floor_size` int(1) NOT NULL COMMENT '楼层',
  `area_id` bigint(20) NOT NULL COMMENT '小区Id',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_building
-- ----------------------------
INSERT INTO `t_building` VALUES ('1', null, '35栋', '35栋', '2', '16', '3', null, '111', null, null, null, '管理员', '1', '2019-05-28 16:04:44');
INSERT INTO `t_building` VALUES ('2', '0', '36栋', '36栋', '11', '2', '3', 'ENABLE', '36栋', '管理员', '1', '2019-06-09 20:22:07', '管理员', '1', '2019-06-09 20:22:07');
INSERT INTO `t_building` VALUES ('3', '0', '34栋', '34栋', '2', '21', '3', 'ENABLE', '34栋', '管理员', '1', '2019-06-09 21:01:59', '管理员', '1', '2019-06-09 21:01:59');

-- ----------------------------
-- Table structure for t_coupon
-- ----------------------------
DROP TABLE IF EXISTS `t_coupon`;
CREATE TABLE `t_coupon` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `period_start` varchar(20) DEFAULT '' COMMENT '有效期开始',
  `period_end` varchar(20) DEFAULT '' COMMENT '有效期结束',
  `discount` int(5) DEFAULT '0' COMMENT '减免比例',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_coupon
-- ----------------------------
INSERT INTO `t_coupon` VALUES ('1', '0', '2019-01-01 12:00:00', '2019-05-01 12:00:00', '10', 'ENABLE', '暂无说明', 'admin', '1', '2019-05-28 14:50:41', 'admin', '1', '2019-05-28 14:50:41');
INSERT INTO `t_coupon` VALUES ('2', '0', '2019-05-01 12:00:00', '2019-10-01 12:00:00', '5', 'ENABLE', '暂无说明', 'admin', '1', '2019-05-28 14:51:33', 'admin', '1', '2019-05-28 14:51:33');

-- ----------------------------
-- Table structure for t_his_room
-- ----------------------------
DROP TABLE IF EXISTS `t_his_room`;
CREATE TABLE `t_his_room` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户Id',
  `room_id` bigint(20) DEFAULT NULL COMMENT '房子Id',
  `check_in` datetime DEFAULT NULL COMMENT '入住时间',
  `check_out` datetime DEFAULT NULL COMMENT '搬出时间',
  `stat` int(1) DEFAULT '1' COMMENT '在住状态 1-在住 2-迁出',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='历史入住记录';

-- ----------------------------
-- Records of t_his_room
-- ----------------------------
INSERT INTO `t_his_room` VALUES ('1', '0', '2', '1', '2019-06-12 14:47:01', null, '1', '', '', '管理员', '1', '2019-06-12 14:23:01', '管理员', '1', '2019-06-12 14:23:01');

-- ----------------------------
-- Table structure for t_payment
-- ----------------------------
DROP TABLE IF EXISTS `t_payment`;
CREATE TABLE `t_payment` (
  `payment_no` varchar(50) NOT NULL COMMENT '缴费单',
  `payment_year` varchar(10) DEFAULT '' COMMENT '缴费单-年',
  `user_id` varchar(20) DEFAULT '' COMMENT '用户Id',
  `acreage` float(5,2) DEFAULT '0.00' COMMENT '面积',
  `discount` float(5,2) DEFAULT '0.00' COMMENT '折扣比例',
  `actFee` decimal(10,2) DEFAULT '0.00' COMMENT '实际费用',
  `redFee` decimal(10,2) DEFAULT '0.00' COMMENT '减免费用',
  `fee` decimal(10,2) DEFAULT '0.00' COMMENT '缴纳费用',
  `is_pay` int(1) DEFAULT '0' COMMENT '是否支付 0-待支付 1-已支付',
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  `pay_type` int(1) DEFAULT '0' COMMENT '0-现金 1-支付宝 2-微信 3-银联',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`payment_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_payment
-- ----------------------------

-- ----------------------------
-- Table structure for t_payment_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_payment_detail`;
CREATE TABLE `t_payment_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `payment_no` varchar(50) NOT NULL COMMENT '缴费单',
  `room_id` bigint(20) DEFAULT NULL COMMENT '房间Id',
  `room_name` varchar(100) DEFAULT '' COMMENT '房间名称 **小区**栋**单元**房间',
  `room_type` decimal(5,2) DEFAULT NULL COMMENT '房间类型',
  `price` decimal(5,2) DEFAULT '0.00' COMMENT '单价',
  `acreage` float(5,2) DEFAULT '0.00' COMMENT '房间面积',
  `fee` decimal(10,2) DEFAULT '0.00' COMMENT '费用',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_payment_detail
-- ----------------------------

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `role_code` varchar(20) DEFAULT '' COMMENT '角色编码',
  `role_name` varchar(90) DEFAULT '' COMMENT '角色名称',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_role
-- ----------------------------

-- ----------------------------
-- Table structure for t_role_user
-- ----------------------------
DROP TABLE IF EXISTS `t_role_user`;
CREATE TABLE `t_role_user` (
  `role_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`,`user_id`),
  KEY `FKdumjqlt1wyblqtpca3ag0qhtf` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_role_user
-- ----------------------------

-- ----------------------------
-- Table structure for t_room
-- ----------------------------
DROP TABLE IF EXISTS `t_room`;
CREATE TABLE `t_room` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `room_no` varchar(20) DEFAULT '' COMMENT '热站名称',
  `room_name` varchar(20) DEFAULT '' COMMENT '热站名称',
  `unit_no` int(1) DEFAULT '2' COMMENT '单元',
  `floor_no` int(1) NOT NULL COMMENT '楼层',
  `building_id` bigint(20) NOT NULL COMMENT '楼栋Id',
  `room_type` bigint(20) NOT NULL COMMENT '房间类型',
  `house_type` varchar(30) DEFAULT '' COMMENT '户型',
  `acreage` float(5,2) DEFAULT '0.00' COMMENT '面积',
  `heat_type` int(1) DEFAULT '1' COMMENT '供热状态 0-不供热 1-供热 2-报停 3-强停 4-复热',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户Id',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_room
-- ----------------------------
INSERT INTO `t_room` VALUES ('1', '0', '901', '901', '1', '9', '1', '1', '三室一厅', '95.00', '1', '2', 'ENABLE', '', '管理员', '1', '2019-06-01 11:36:24', '管理员', '1', '2019-06-12 14:23:01');
INSERT INTO `t_room` VALUES ('2', '0', '', '902', '1', '9', '1', '1', '78', '0.00', '1', null, 'ENABLE', '', '管理员', '1', '2019-06-12 16:50:31', '管理员', '1', '2019-06-12 16:50:31');
INSERT INTO `t_room` VALUES ('3', '0', '', '903', '1', '9', '1', '1', '两室一厅', '78.00', '1', null, 'ENABLE', '', '管理员', '1', '2019-06-12 16:53:05', '管理员', '1', '2019-06-12 16:53:05');

-- ----------------------------
-- Table structure for t_room_type
-- ----------------------------
DROP TABLE IF EXISTS `t_room_type`;
CREATE TABLE `t_room_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `room_type_code` varchar(20) DEFAULT '' COMMENT '房间类型编码',
  `room_type_name` varchar(20) DEFAULT '' COMMENT '房间类型名称',
  `price` decimal(5,2) NOT NULL COMMENT '单价 元/平米',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_room_type
-- ----------------------------
INSERT INTO `t_room_type` VALUES ('1', '0', 'resident', '居民', '20.00', 'ENABLE', '', 'admin', '1', '2019-05-28 14:41:28', 'admin', '1', '2019-05-28 14:41:28');
INSERT INTO `t_room_type` VALUES ('2', '0', 'business', '商业', '30.00', 'ENABLE', '', 'admin', '1', '2019-05-28 14:41:45', 'admin', '1', '2019-05-28 14:41:45');
INSERT INTO `t_room_type` VALUES ('3', '0', 'office', '办公', '25.00', 'ENABLE', '', 'admin', '1', '2019-05-28 14:41:53', 'admin', '1', '2019-05-28 14:41:53');
INSERT INTO `t_room_type` VALUES ('4', '0', 'repast', '餐饮', '15.00', 'ENABLE', '', 'admin', '1', '2019-05-28 14:42:40', 'admin', '1', '2019-05-28 14:42:40');

-- ----------------------------
-- Table structure for t_site
-- ----------------------------
DROP TABLE IF EXISTS `t_site`;
CREATE TABLE `t_site` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `site_name` varchar(20) DEFAULT '' COMMENT '热站名称',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_site
-- ----------------------------
INSERT INTO `t_site` VALUES ('3', '0', '洪山供热站', 'ENABLE', '负责洪山区的供热管理', '管理员', '1', '2019-05-28 10:55:28', '管理员', '1', '2019-06-12 17:19:40');

-- ----------------------------
-- Table structure for t_ticket
-- ----------------------------
DROP TABLE IF EXISTS `t_ticket`;
CREATE TABLE `t_ticket` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `payment_no` varchar(50) NOT NULL COMMENT '缴费单',
  `ticket_no` bigint(20) NOT NULL COMMENT '发票号码',
  `ticket_code` varchar(30) DEFAULT '' COMMENT '发票代码',
  `ticket_date` varchar(30) DEFAULT '' COMMENT '开票日期',
  `purchaser` varchar(30) DEFAULT '' COMMENT '购买方',
  `p_taxpayer_code` varchar(30) DEFAULT '' COMMENT '购买方-纳税人识别号',
  `p_address_phone` varchar(50) DEFAULT '' COMMENT '购买方-地址&电话',
  `p_bank_account` varchar(50) DEFAULT '' COMMENT '购买方-银行&账户',
  `seller` varchar(30) DEFAULT '' COMMENT '销售方',
  `s_taxpayer_code` varchar(30) DEFAULT '' COMMENT '销售方-纳税人识别号',
  `s_address_phone` varchar(50) DEFAULT '' COMMENT '销售方-地址&电话',
  `s_bank_account` varchar(50) DEFAULT '' COMMENT '销售方-银行&账户',
  `fee` decimal(10,2) DEFAULT '0.00' COMMENT '金额',
  `tax_rate` int(11) DEFAULT '13' COMMENT '税率 13%',
  `tax_fee` decimal(10,2) DEFAULT '0.00' COMMENT '税额',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `remark` varchar(300) DEFAULT '' COMMENT '备注',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_ticket
-- ----------------------------
INSERT INTO `t_ticket` VALUES ('1', '0', '20190613203012', '9745512', '033001800211', '2019-06-13', '池思军', '个人', '无', '无', '武汉市洪山供热管理有限公司', '9133011058027447X2', '杭州市余杭区文一西路969号5幢1楼110室 0571-85022088', '招商杭州高新支行 571906814810700', '5000.00', '13', '650.00', '', '', 'admin', '1', '2019-06-13 20:35:35', 'admin', '1', '2019-06-13 20:35:35');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `version` int(11) DEFAULT '0' COMMENT '版本号',
  `login_name` varchar(50) DEFAULT '' COMMENT '登录名',
  `login_pwd` varchar(300) DEFAULT '' COMMENT '登录密码',
  `user_code` varchar(32) DEFAULT '' COMMENT '工号',
  `user_name` varchar(50) DEFAULT '' COMMENT '姓名',
  `mobile_no` varchar(15) DEFAULT '' COMMENT '手机号',
  `email` varchar(50) DEFAULT '' COMMENT '邮件地址',
  `status` varchar(20) DEFAULT '' COMMENT '状态',
  `user_source` varchar(32) DEFAULT '' COMMENT '用户来源',
  `type` varchar(32) DEFAULT '' COMMENT '操作员类型（2000伙伴，3000客户，1000运营）',
  `last_login_ip` varchar(20) DEFAULT '' COMMENT '最后登录IP地址',
  `last_login_location` varchar(50) DEFAULT '' COMMENT '最后登录位置',
  `remark` varchar(300) DEFAULT '' COMMENT '描述',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `is_changed_pwd` smallint(6) DEFAULT '0' COMMENT '是否更改过密码',
  `pwd_error_count` smallint(6) DEFAULT '0' COMMENT '连续输错密码次数（连续5次输错就冻结帐号）',
  `pwd_error_time` datetime DEFAULT NULL COMMENT '最后输错密码时间',
  `creator` varchar(20) DEFAULT '' COMMENT '创建人',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_operator` varchar(20) DEFAULT '' COMMENT '最近操作人',
  `last_operator_id` bigint(20) DEFAULT NULL COMMENT '最后操作人ID',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '0', 'admin', 'E10ADC3949BA59ABBE56E057F20F883E', 'admin', '管理员', '15071392085', '', 'ENABLE', '', 'admin', '', '', '', null, '0', '0', null, '', null, '2019-05-25 17:40:35', '', null, '2019-05-25 17:40:35');
INSERT INTO `t_user` VALUES ('2', '0', 'chisj', 'FCEA920F7412B5DA7BE0CF42B8C93759', '', '池思军', '15071392085', '905568425@qq.com', '', '', 'user', '', '', '', null, '0', '0', null, '管理员', '1', '2019-06-11 00:27:39', '管理员', '1', '2019-06-11 00:27:39');
INSERT INTO `t_user` VALUES ('4', '0', 'test-1', 'E10ADC3949BA59ABBE56E057F20F883E', '', '测试-1', '15071392182', '915568422@qq.com', '', '', 'user', '', '', '', null, '0', '0', null, '管理员', '1', '2019-06-11 00:21:12', '管理员', '1', '2019-06-11 00:28:50');
INSERT INTO `t_user` VALUES ('6', '0', 'sdfd-2', '060AD92489947D410D897474079C1477', '', '阿斯蒂芬-2', '1111', '22222', '', '', 'user', '', '', '', null, '0', '0', null, '管理员', '1', '2019-06-11 16:17:03', '管理员', '1', '2019-06-11 16:17:16');

-- ----------------------------
-- Table structure for t_user_room
-- ----------------------------
DROP TABLE IF EXISTS `t_user_room`;
CREATE TABLE `t_user_room` (
  `user_id` bigint(20) NOT NULL,
  `room_id` bigint(20) NOT NULL,
  PRIMARY KEY (`room_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of t_user_room
-- ----------------------------
