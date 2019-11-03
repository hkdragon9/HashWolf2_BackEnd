/*
 Navicat Premium Data Transfer

 Source Server         : aha
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : hashwolf2

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 03/11/2019 11:01:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for group_group_users
-- ----------------------------
DROP TABLE IF EXISTS `group_group_users`;
CREATE TABLE `group_group_users` (
  `group_groupid` int(11) NOT NULL,
  `group_users_userid` int(11) NOT NULL,
  KEY `FKpssiubn75js2ej6kuyut38n05` (`group_users_userid`),
  CONSTRAINT `FKpssiubn75js2ej6kuyut38n05` FOREIGN KEY (`group_users_userid`) REFERENCES `user` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for group_payments
-- ----------------------------
DROP TABLE IF EXISTS `group_payments`;
CREATE TABLE `group_payments` (
  `group_groupid` int(11) NOT NULL,
  `payments_paymentid` int(11) NOT NULL,
  UNIQUE KEY `UK_e02b0q6iruycil1l3feoe50pp` (`payments_paymentid`),
  CONSTRAINT `FKjg1od496th07mi17btrux27hf` FOREIGN KEY (`payments_paymentid`) REFERENCES `payment` (`paymentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for group_table
-- ----------------------------
DROP TABLE IF EXISTS `group_table`;
CREATE TABLE `group_table` (
  `groupid` int(11) NOT NULL AUTO_INCREMENT,
  `group_des` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `group_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`groupid`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
