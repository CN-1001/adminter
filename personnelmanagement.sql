/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50548
Source Host           : localhost:3306
Source Database       : personnelmanagement

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2020-11-20 13:11:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `phone` varchar(14) DEFAULT NULL COMMENT '电话',
  `type` varchar(255) DEFAULT NULL COMMENT '工种',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
