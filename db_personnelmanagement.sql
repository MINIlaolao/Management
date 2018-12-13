/*
Navicat MySQL Data Transfer

Source Server         : LAO
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : db_personnelmanagement

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-12-13 10:35:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `depart_id` int(11) NOT NULL,
  `depart_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`depart_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '财务部门');
INSERT INTO `department` VALUES ('2', '人事部门');
INSERT INTO `department` VALUES ('3', '公关部门');
INSERT INTO `department` VALUES ('4', '生产部门');
INSERT INTO `department` VALUES ('5', '销售部门');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `emp_id` int(11) NOT NULL,
  `emp_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `emp_age` int(11) NOT NULL,
  `emp_income` double NOT NULL,
  `emp_depart` varchar(255) CHARACTER SET utf8 NOT NULL,
  `emp_position` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'laoqxin', '1', '2000', '人事', '人事部门');
INSERT INTO `employee` VALUES ('2', '劳启新', '20', '30000', '财务部门', '部门经理');
INSERT INTO `employee` VALUES ('3', '洪晓鹏', '20', '6000', '生产部门', '部门经理');
INSERT INTO `employee` VALUES ('4', '庄汉佳', '20', '6000', '公关部门', '外交人员');
INSERT INTO `employee` VALUES ('5', '李志辉', '20', '16000', '销售部门', '部门经理');

-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `ps_id` int(11) NOT NULL,
  `ps_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`ps_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', '部门经理');
INSERT INTO `position` VALUES ('2', '人事主管');
INSERT INTO `position` VALUES ('3', '销售人员');
INSERT INTO `position` VALUES ('4', '生产人员');
INSERT INTO `position` VALUES ('5', '外交人员');
INSERT INTO `position` VALUES ('6', '财务人员');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(32) NOT NULL,
  `user_id` varchar(11) NOT NULL,
  `user_password` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'laoqixin', '123');
