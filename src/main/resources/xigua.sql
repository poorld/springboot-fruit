/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : xigua

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-08-18 14:04:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `auth_id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `media_id` varchar(20) NOT NULL,
  `description` varchar(50) NOT NULL,
  `following_count` int(11) NOT NULL,
  `verified_content` varchar(50) DEFAULT NULL,
  `follow` tinyint(1) DEFAULT NULL,
  `user_verified` tinyint(1) DEFAULT NULL,
  `auth_type` int(1) DEFAULT NULL,
  `auth_info` varchar(50) NOT NULL,
  `video_live_auth` int(11) NOT NULL,
  `ban_status` int(11) DEFAULT NULL,
  `followers_count` int(11) DEFAULT NULL,
  `share_url` varchar(255) DEFAULT NULL,
  `ugc_publish_media_id` varchar(255) DEFAULT NULL,
  `avatar_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`auth_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of author
-- ----------------------------

-- ----------------------------
-- Table structure for push
-- ----------------------------
DROP TABLE IF EXISTS `push`;
CREATE TABLE `push` (
  `push_id` int(11) NOT NULL,
  `video_id` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `push_date` datetime DEFAULT NULL,
  PRIMARY KEY (`push_id`),
  KEY `video_id` (`video_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `push_ibfk_1` FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`),
  CONSTRAINT `push_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of push
-- ----------------------------

-- ----------------------------
-- Table structure for subscription
-- ----------------------------
DROP TABLE IF EXISTS `subscription`;
CREATE TABLE `subscription` (
  `sub_id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `auth_id` varchar(255) DEFAULT NULL,
  `sub` tinyint(1) DEFAULT NULL COMMENT '是否订阅',
  PRIMARY KEY (`sub_id`),
  KEY `user_id` (`user_id`),
  KEY `auth_id` (`auth_id`),
  CONSTRAINT `subscription_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `subscription_ibfk_2` FOREIGN KEY (`auth_id`) REFERENCES `author` (`auth_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subscription
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `video_id` varchar(255) NOT NULL,
  `auth_id` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `abstract` varchar(255) DEFAULT NULL,
  `has_video` tinyint(1) DEFAULT NULL,
  `article_url` varchar(255) DEFAULT NULL,
  `publish_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `item_id` varchar(255) DEFAULT NULL,
  `detail_video_large_image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`video_id`),
  KEY `user_id` (`auth_id`),
  CONSTRAINT `video_ibfk_1` FOREIGN KEY (`auth_id`) REFERENCES `author` (`auth_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of video
-- ----------------------------
