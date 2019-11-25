/*
 Navicat Premium Data Transfer

 Source Server         : Javaweb
 Source Server Type    : MySQL
 Source Server Version : 50522
 Source Host           : localhost:3306
 Source Schema         : pces

 Target Server Type    : MySQL
 Target Server Version : 50522
 File Encoding         : 65001

 Date: 23/11/2019 21:22:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag`  (
  `courseId` int(11) NOT NULL COMMENT '该标签所属课程的ID',
  `tagId` int(11) NULL DEFAULT NULL,
  `num` int(11) NOT NULL COMMENT '该标签个数',
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
