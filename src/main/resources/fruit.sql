/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : fruit

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 11/11/2020 20:05:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for banner
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `banner_id` int(5) NOT NULL AUTO_INCREMENT,
  `product_id` int(5) DEFAULT NULL,
  `image` varchar(255) COLLATE utf8_bin NOT NULL,
  `desc` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`banner_id`),
  KEY `banner_ibfk_1` (`product_id`),
  CONSTRAINT `banner_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of banner
-- ----------------------------
BEGIN;
INSERT INTO `banner` VALUES (1, 1, 'http://img14.yiguoimg.com/d/items/2019/190329/9288737665820285_1133x498.jpg', NULL);
INSERT INTO `banner` VALUES (2, 9, 'http://172.20.74.110:9000/api/app/file/downloadFile/f28407a9111145708d77d6e2909795b7.jpg', NULL);
INSERT INTO `banner` VALUES (3, NULL, 'https://cdn.pixabay.com/photo/2018/06/07/09/01/emotions-3459666__480.jpg', NULL);
INSERT INTO `banner` VALUES (4, 11, 'http://172.20.74.110:9000/api/app/file/downloadFile/a0575eeb19a94002be4598448abd5bc4.jpg', NULL);
INSERT INTO `banner` VALUES (5, NULL, 'https://cdn.pixabay.com/photo/2017/07/23/16/01/nature-2531761__480.jpg', NULL);
COMMIT;

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
  `comments_id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) NOT NULL,
  `product_id` int(5) NOT NULL,
  `content` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `img1` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `img2` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `img3` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `audit` int(1) NOT NULL DEFAULT '0' COMMENT '0未审核 1审核通过',
  `reply` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '商家回复',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`comments_id`),
  KEY `user_id` (`user_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25003 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of comments
-- ----------------------------
BEGIN;
INSERT INTO `comments` VALUES (25001, 10001, 1, '居然寄错了，两只都是反的。还好是凉鞋，能将就着穿！', 'https://acg.loli.ma/acgurl.php', 'https://acg.loli.ma/imgurl.php', 'https://api.loli.ma', 0, '亲，可以把鞋子交换一下呢！亲，可以把鞋子交换一下呢！亲，可以把鞋子交换一下呢！亲，可以把鞋子交换一下呢！', NULL);
INSERT INTO `comments` VALUES (25002, 10002, 1, '还行吧！', 'http://localhost:9000/api/app/file/downloadFile/fb22d154936844ee9cf5d565c5f76965.jpg', 'https://acg.loli.ma/acgurl.php', 'https://acg.loli.ma/imgurl.php', 0, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for consumption_record
-- ----------------------------
DROP TABLE IF EXISTS `consumption_record`;
CREATE TABLE `consumption_record` (
  `consumption_id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) NOT NULL,
  `consumption` decimal(4,1) DEFAULT '0.0' COMMENT '消费金额',
  `source` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '消费来源:购物/充值/vip',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`consumption_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `consumption_record_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of consumption_record
-- ----------------------------
BEGIN;
INSERT INTO `consumption_record` VALUES (6, 10001, 23.0, '购物', '2020-11-09 13:38:12');
INSERT INTO `consumption_record` VALUES (7, 10001, 28.0, '购物', '2020-11-09 13:39:22');
INSERT INTO `consumption_record` VALUES (8, 10001, 14.0, '购物', '2020-11-09 13:49:22');
INSERT INTO `consumption_record` VALUES (9, 10001, 25.0, '购物', '2020-11-09 20:11:14');
INSERT INTO `consumption_record` VALUES (10, 10001, 17.0, '购物', '2020-11-10 12:47:33');
INSERT INTO `consumption_record` VALUES (11, 10001, 25.0, '购物', '2020-11-10 12:52:24');
INSERT INTO `consumption_record` VALUES (12, 10001, 46.0, '购物', '2020-11-10 12:54:06');
INSERT INTO `consumption_record` VALUES (13, 10001, -19.0, '购物', '2020-11-10 22:44:12');
INSERT INTO `consumption_record` VALUES (14, 10001, 23.0, '购物', '2020-11-10 22:45:44');
INSERT INTO `consumption_record` VALUES (15, 10001, 23.0, '购物', '2020-11-10 22:46:13');
INSERT INTO `consumption_record` VALUES (16, 10001, 42.0, '购物', '2020-11-10 22:46:37');
INSERT INTO `consumption_record` VALUES (17, 10001, 40.0, '购物', '2020-11-10 22:47:05');
INSERT INTO `consumption_record` VALUES (18, 10001, 25.0, '购物', '2020-11-10 22:47:42');
INSERT INTO `consumption_record` VALUES (19, 10001, 40.0, '购物', '2020-11-10 22:47:53');
INSERT INTO `consumption_record` VALUES (20, 10001, 25.0, '购物', '2020-11-10 22:48:43');
INSERT INTO `consumption_record` VALUES (21, 10001, 11.0, '购物', '2020-11-10 22:48:55');
INSERT INTO `consumption_record` VALUES (22, 10001, 31.0, '购物', '2020-11-10 22:49:05');
INSERT INTO `consumption_record` VALUES (23, 10001, 11.0, '购物', '2020-11-10 22:49:41');
INSERT INTO `consumption_record` VALUES (24, 10001, 46.0, '购物', '2020-11-10 22:49:52');
INSERT INTO `consumption_record` VALUES (25, 10001, 25.0, '购物', '2020-11-10 22:50:22');
INSERT INTO `consumption_record` VALUES (26, 10001, 46.0, '购物', '2020-11-10 22:50:29');
INSERT INTO `consumption_record` VALUES (27, 10001, 46.0, '购物', '2020-11-10 22:50:41');
INSERT INTO `consumption_record` VALUES (28, 10001, 46.0, '购物', '2020-11-10 22:51:40');
INSERT INTO `consumption_record` VALUES (29, 10001, 25.0, '购物', '2020-11-10 22:52:19');
INSERT INTO `consumption_record` VALUES (30, 10001, 23.0, '购物', '2020-11-11 18:45:35');
INSERT INTO `consumption_record` VALUES (31, 10001, 31.0, '购物', '2020-11-11 18:46:06');
INSERT INTO `consumption_record` VALUES (32, 10003, 27.0, '购物', '2020-11-11 20:04:00');
COMMIT;

-- ----------------------------
-- Table structure for contact
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `contact_id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `mobile` varchar(50) COLLATE utf8_bin NOT NULL,
  `address` varchar(50) COLLATE utf8_bin NOT NULL,
  `contact_flag` int(1) NOT NULL DEFAULT '0' COMMENT '1 默认联系人',
  PRIMARY KEY (`contact_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `contact_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of contact
-- ----------------------------
BEGIN;
INSERT INTO `contact` VALUES (2, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', 0);
INSERT INTO `contact` VALUES (3, 10001, '忍辱负', '123456789', '还好还好_(:з」∠)_还好吧你呢', 0);
INSERT INTO `contact` VALUES (4, 10001, '好的呢', '12345678911', '南宁师范大学桂圆公寓', 0);
INSERT INTO `contact` VALUES (5, 10003, '墨鱼烦', '15278455545', '墨鱼烦家里面呵呵呵呵', 0);
COMMIT;

-- ----------------------------
-- Table structure for discounts
-- ----------------------------
DROP TABLE IF EXISTS `discounts`;
CREATE TABLE `discounts` (
  `discounts_id` int(5) NOT NULL AUTO_INCREMENT,
  `discounts_category_id` int(5) NOT NULL,
  `discounts_explain` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '说明',
  `conditions` int(3) DEFAULT NULL COMMENT '满足条件的价格',
  `conditions_explain` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '满足条件说明',
  `discounts` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '优惠',
  `members` int(1) NOT NULL DEFAULT '0' COMMENT '会员限制',
  PRIMARY KEY (`discounts_id`),
  KEY `discounts_category_id` (`discounts_category_id`),
  CONSTRAINT `discounts_ibfk_1` FOREIGN KEY (`discounts_category_id`) REFERENCES `discounts_category` (`discounts_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of discounts
-- ----------------------------
BEGIN;
INSERT INTO `discounts` VALUES (2, 2001, '满22元减2元', 22, '满22元才能享受优惠', '2', 1);
INSERT INTO `discounts` VALUES (4, 2001, '满30元减5元', 30, '满30元才能享受优惠', '5', 1);
INSERT INTO `discounts` VALUES (6, 2001, '满50元减8元', 50, '满50元享受优惠', '8', 1);
INSERT INTO `discounts` VALUES (7, 2001, '满25元减3元', 25, '满25元才能享受优惠', '3', 0);
INSERT INTO `discounts` VALUES (8, 2001, '满35元减5元', 35, '满35元才能享受优惠', '5', 0);
INSERT INTO `discounts` VALUES (9, 2002, '满60元享85折', 60, '满60元才能享受折扣', '85', 1);
INSERT INTO `discounts` VALUES (10, 2002, '满80元享89折', 80, '满80元才能享受折扣', '89', 0);
INSERT INTO `discounts` VALUES (11, 2003, '充值10元减1元', 10, '满10元才能享受折扣', '1', 1);
COMMIT;

-- ----------------------------
-- Table structure for discounts_category
-- ----------------------------
DROP TABLE IF EXISTS `discounts_category`;
CREATE TABLE `discounts_category` (
  `discounts_category_id` int(5) NOT NULL AUTO_INCREMENT,
  `discounts_type` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '充值 满减 折扣',
  `discounts_flag` int(1) NOT NULL DEFAULT '0',
  `discounts_description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`discounts_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2004 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of discounts_category
-- ----------------------------
BEGIN;
INSERT INTO `discounts_category` VALUES (2001, '满减', 0, '满减呀呀呀');
INSERT INTO `discounts_category` VALUES (2002, '折扣', 1, '折扣');
INSERT INTO `discounts_category` VALUES (2003, '充值', 2, '充值有优惠哦');
COMMIT;

-- ----------------------------
-- Table structure for members
-- ----------------------------
DROP TABLE IF EXISTS `members`;
CREATE TABLE `members` (
  `members_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_bin NOT NULL,
  `level` int(1) NOT NULL COMMENT '等级',
  `price` int(2) NOT NULL COMMENT '价格/月',
  PRIMARY KEY (`members_id`)
) ENGINE=InnoDB AUTO_INCREMENT=53204 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of members
-- ----------------------------
BEGIN;
INSERT INTO `members` VALUES (53201, '白银会员', 1, 8);
INSERT INTO `members` VALUES (53202, '黄金会员', 2, 15);
INSERT INTO `members` VALUES (53203, '钻石会员', 3, 20);
COMMIT;

-- ----------------------------
-- Table structure for new_product
-- ----------------------------
DROP TABLE IF EXISTS `new_product`;
CREATE TABLE `new_product` (
  `new_product_id` int(5) NOT NULL,
  `product_id` int(5) NOT NULL,
  `image` varchar(255) COLLATE utf8_bin NOT NULL,
  `price` decimal(4,1) NOT NULL,
  `desc` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`new_product_id`,`product_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `new_product_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `order_num` varchar(20) COLLATE utf8_bin NOT NULL,
  `payment_flag` int(1) NOT NULL DEFAULT '0',
  `user_id` int(5) NOT NULL,
  `contact_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `contact_mobile` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `contact_address` varchar(300) COLLATE utf8_bin DEFAULT NULL,
  `message` varchar(300) COLLATE utf8_bin DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `type` int(1) NOT NULL,
  `payment_type` int(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `total_price` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`order_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of order_info
-- ----------------------------
BEGIN;
INSERT INTO `order_info` VALUES ('O20201109194029662', 0, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', '略略略', 1, 0, 3, '2020-11-09 19:40:30', 40.00);
INSERT INTO `order_info` VALUES ('O20201109195253019', 0, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', '不不不不', 1, 0, 3, '2020-11-09 19:52:53', 36.00);
INSERT INTO `order_info` VALUES ('O20201109201101530', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', '哈哈', 2, 0, 1, '2020-11-09 20:11:02', 27.00);
INSERT INTO `order_info` VALUES ('O20201110124718087', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', '不要辣', 2, 0, 1, '2020-11-10 12:47:18', 17.00);
INSERT INTO `order_info` VALUES ('O20201110125205777', 1, 10001, '忍辱负', '123456789', '还好还好_(:з」∠)_还好吧你呢', '不太好（￢㉨￢）', 2, 0, 1, '2020-11-11 12:52:06', 27.00);
INSERT INTO `order_info` VALUES ('O20201110125346966', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', '哈哈', 2, 0, 2, '2020-10-14 12:53:47', 54.00);
INSERT INTO `order_info` VALUES ('O20201110224404624', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-10 22:44:05', 66.00);
INSERT INTO `order_info` VALUES ('O20201110224424734', 0, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 1, 0, 2, '2020-11-01 22:44:25', 22.00);
INSERT INTO `order_info` VALUES ('O20201110224534548', 1, 10001, '忍辱负', '123456789', '还好还好_(:з」∠)_还好吧你呢', NULL, 2, 0, 1, '2020-11-02 22:45:35', 25.00);
INSERT INTO `order_info` VALUES ('O20201110224605118', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 2, '2020-11-07 22:46:05', 25.00);
INSERT INTO `order_info` VALUES ('O20201110224631057', 1, 10001, '忍辱负', '123456789', '还好还好_(:з」∠)_还好吧你呢', NULL, 2, 0, 1, '2020-11-08 22:46:31', 50.00);
INSERT INTO `order_info` VALUES ('O20201110224653891', 1, 10001, '忍辱负', '123456789', '还好还好_(:з」∠)_还好吧你呢', NULL, 2, 0, 2, '2020-11-02 22:46:54', 45.00);
INSERT INTO `order_info` VALUES ('O20201110224724097', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-04 22:47:24', 30.00);
INSERT INTO `order_info` VALUES ('O20201110224747251', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-08 22:47:47', 45.00);
INSERT INTO `order_info` VALUES ('O20201110224837421', 1, 10001, '忍辱负', '123456789', '还好还好_(:з」∠)_还好吧你呢', NULL, 2, 0, 1, '2020-11-01 22:48:37', 30.00);
INSERT INTO `order_info` VALUES ('O20201110224845791', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-03 22:48:46', 12.00);
INSERT INTO `order_info` VALUES ('O20201110224859573', 1, 10001, '忍辱负', '123456789', '还好还好_(:з」∠)_还好吧你呢', NULL, 2, 0, 1, '2020-11-04 22:49:00', 36.00);
INSERT INTO `order_info` VALUES ('O20201110224935710', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-07 22:49:36', 12.00);
INSERT INTO `order_info` VALUES ('O20201110224945403', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-08 22:49:45', 54.00);
INSERT INTO `order_info` VALUES ('O20201110225016872', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-10 22:50:17', 27.00);
INSERT INTO `order_info` VALUES ('O20201110225025851', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-05 22:50:26', 54.00);
INSERT INTO `order_info` VALUES ('O20201110225032102', 0, 10001, NULL, NULL, NULL, NULL, 1, 0, NULL, '2020-11-06 22:50:32', NULL);
INSERT INTO `order_info` VALUES ('O20201110225036272', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-07 22:50:36', 54.00);
INSERT INTO `order_info` VALUES ('O20201110225135212', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-06 22:51:35', 54.00);
INSERT INTO `order_info` VALUES ('O20201110225214099', 1, 10001, '忍辱负', '123456789', '还好还好_(:з」∠)_还好吧你呢', NULL, 2, 0, 1, '2020-11-02 22:52:14', 27.00);
INSERT INTO `order_info` VALUES ('O20201111184526857', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-11 18:45:27', 25.00);
INSERT INTO `order_info` VALUES ('O20201111184601964', 1, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 2, 0, 1, '2020-11-11 18:46:02', 36.00);
INSERT INTO `order_info` VALUES ('O20201111194303925', 0, 10001, '智取其', '15278389583', '南宁师范大学武鸣校区', NULL, 1, 0, 3, '2020-11-11 19:43:04', 27.00);
INSERT INTO `order_info` VALUES ('O20201111194319035', 0, 10001, NULL, NULL, NULL, NULL, 1, 0, NULL, '2020-11-11 19:43:19', NULL);
INSERT INTO `order_info` VALUES ('O20201111194512459', 0, 10001, NULL, NULL, NULL, NULL, 1, 0, NULL, '2020-11-11 19:45:12', NULL);
INSERT INTO `order_info` VALUES ('O20201111195051443', 0, 10001, NULL, NULL, NULL, NULL, 1, 0, NULL, '2020-11-11 19:50:51', NULL);
INSERT INTO `order_info` VALUES ('O20201111195127293', 0, 10001, NULL, NULL, NULL, NULL, 1, 0, NULL, '2020-11-11 19:51:27', NULL);
INSERT INTO `order_info` VALUES ('O20201111195803666', 0, 10001, '墨鱼烦', '15278455545', '墨鱼烦家里面呵呵呵呵', NULL, 1, 0, 3, '2020-11-11 19:58:04', 27.00);
INSERT INTO `order_info` VALUES ('O20201111200352969', 1, 10003, '墨鱼烦', '15278455545', '墨鱼烦家里面呵呵呵呵', NULL, 2, 0, 3, '2020-11-11 20:03:53', 30.00);
COMMIT;

-- ----------------------------
-- Table structure for order_item
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `order_item_id` varchar(50) COLLATE utf8_bin NOT NULL,
  `order_num` varchar(20) COLLATE utf8_bin NOT NULL,
  `product_id` int(5) NOT NULL,
  `price` decimal(4,1) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `user_id` int(5) NOT NULL,
  `spec_id` int(5) NOT NULL,
  PRIMARY KEY (`order_item_id`),
  KEY `order_num` (`order_num`),
  KEY `product_id` (`product_id`),
  KEY `user_id` (`user_id`),
  KEY `spec_id` (`spec_id`),
  CONSTRAINT `order_item_ibfk_1` FOREIGN KEY (`order_num`) REFERENCES `order_info` (`order_num`),
  CONSTRAINT `order_item_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `order_item_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `order_item_ibfk_4` FOREIGN KEY (`spec_id`) REFERENCES `spec` (`spec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of order_item
-- ----------------------------
BEGIN;
INSERT INTO `order_item` VALUES ('I0352b4dbf79843049c6ca05cff312c89', 'O20201110224424734', 1, 33.0, 2, 10001, 12127);
INSERT INTO `order_item` VALUES ('I038038a5c2644afb9c7ab2d5ab617d45', 'O20201109195253019', 9, 18.0, 2, 10001, 12123);
INSERT INTO `order_item` VALUES ('I0af7f800edd647ce92f848403b133c69', 'O20201111194303925', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('I0be471d171824c4a86fdbfd28fc23560', 'O20201110224653891', 12, 15.0, 3, 10001, 12128);
INSERT INTO `order_item` VALUES ('I110ae425a136471e835f9a2e30bf29a8', 'O20201110224631057', 1, 25.0, 2, 10001, 12126);
INSERT INTO `order_item` VALUES ('I1649f559a3234faa813d0ea0ab3e88fa', 'O20201110224845791', 9, 12.0, 1, 10001, 12121);
INSERT INTO `order_item` VALUES ('I18d97cce37fd4e2b82bc3117ab990ee3', 'O20201109201101530', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('I1969519b08e447aa808004c27c7c90d5', 'O20201110224747251', 12, 15.0, 3, 10001, 12128);
INSERT INTO `order_item` VALUES ('I23f172ed61ff4b738d3040368165c556', 'O20201110225036272', 11, 27.0, 2, 10001, 12125);
INSERT INTO `order_item` VALUES ('I288923945f9845809029b61d0dedd3c8', 'O20201110224935710', 9, 12.0, 1, 10001, 12121);
INSERT INTO `order_item` VALUES ('I47be89f880434551bcd97b0430e2ba3f', 'O20201110224605118', 1, 25.0, 1, 10001, 12126);
INSERT INTO `order_item` VALUES ('I4dccd9a8e1bf491ea0859ad03f51ac9c', 'O20201111195127293', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('I5208b9f0227445a6878bcda16b9733e4', 'O20201111195051443', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('I54e8194206ad4352b6dbcd66134e7fdf', 'O20201109194029662', 1, 25.0, 1, 10001, 12126);
INSERT INTO `order_item` VALUES ('I5d796599fc584b89b15afd2e694832db', 'O20201110225214099', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('I6360ac99dfd54de3a60e03831a152fff', 'O20201109194029662', 12, 15.0, 1, 10001, 12128);
INSERT INTO `order_item` VALUES ('I68f27b2df1cc4af1b1e6c1d93c27c6d3', 'O20201111194512459', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('I7777b6825d954990ab95f57a8cfc463c', 'O20201110124718087', 9, 18.0, 1, 10001, 12123);
INSERT INTO `order_item` VALUES ('I77d62aeb57b24f80a942a1796ef7e34c', 'O20201110224945403', 9, 18.0, 3, 10001, 12123);
INSERT INTO `order_item` VALUES ('I791af06551634524b67b4c4780a90344', 'O20201110224404624', 1, 33.0, 2, 10001, 12127);
INSERT INTO `order_item` VALUES ('I7eb413c393bb48abae4a0f0d335c7606', 'O20201110225032102', 11, 27.0, 3, 10001, 12125);
INSERT INTO `order_item` VALUES ('I88d4bc98a0894c53be68b9ff6b2d5c58', 'O20201110125205777', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('Ib1af44f17d3347f18127b2aae121bc84', 'O20201110224837421', 9, 15.0, 2, 10001, 12122);
INSERT INTO `order_item` VALUES ('Ib797218b75f14c9f8df0d2baf723d4a9', 'O20201111194319035', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('Ibe160e7cee4a4535bf1dda8c9770b6f3', 'O20201111195803666', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('Ibf1e2d7895d04210aa88c9c60ea87b96', 'O20201110224859573', 9, 18.0, 2, 10001, 12123);
INSERT INTO `order_item` VALUES ('Icaf1331354654dfd9a2f42af4a64a26b', 'O20201111184526857', 1, 25.0, 1, 10001, 12126);
INSERT INTO `order_item` VALUES ('Icd48b27900e04c64909f28eda8d4e1a3', 'O20201110225025851', 11, 27.0, 2, 10001, 12125);
INSERT INTO `order_item` VALUES ('Icf96323c2d6c451aa5ccb8f989b5bee9', 'O20201110225135212', 11, 27.0, 2, 10001, 12125);
INSERT INTO `order_item` VALUES ('Id811c368de9b481ea485b9cb8ae2acb3', 'O20201110225016872', 11, 27.0, 1, 10001, 12125);
INSERT INTO `order_item` VALUES ('Ie41bfc54c7af4e1b987fcb84a94b9af4', 'O20201111184601964', 9, 18.0, 2, 10001, 12123);
INSERT INTO `order_item` VALUES ('Ie52a03c9763d49f9bbd274f567ce48f7', 'O20201110224534548', 1, 25.0, 1, 10001, 12126);
INSERT INTO `order_item` VALUES ('If87ea39343bb4cd99a65df3cb6c4b059', 'O20201110224724097', 12, 15.0, 2, 10001, 12128);
INSERT INTO `order_item` VALUES ('Ifb09383f99634c1797714bac1f452da0', 'O20201110125346966', 11, 27.0, 2, 10001, 12125);
INSERT INTO `order_item` VALUES ('Ifb96fe6e80694a5abe12128d6d81a821', 'O20201111200352969', 9, 15.0, 2, 10001, 12122);
COMMIT;

-- ----------------------------
-- Table structure for order_payment
-- ----------------------------
DROP TABLE IF EXISTS `order_payment`;
CREATE TABLE `order_payment` (
  `order_payment_id` int(5) NOT NULL AUTO_INCREMENT,
  `order_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `total_amount` decimal(5,1) DEFAULT NULL,
  `pay_amount` decimal(5,1) DEFAULT NULL,
  `discount_amount` decimal(5,1) DEFAULT NULL,
  `creation_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `pay_status` int(1) DEFAULT NULL,
  `pay_type` int(1) DEFAULT NULL,
  PRIMARY KEY (`order_payment_id`),
  KEY `order_payment_ibfk_1` (`order_num`),
  CONSTRAINT `order_payment_ibfk_1` FOREIGN KEY (`order_num`) REFERENCES `order_info` (`order_num`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of order_payment
-- ----------------------------
BEGIN;
INSERT INTO `order_payment` VALUES (27, 'O20201109133748306', 25.0, 23.0, 2.0, '2020-11-09 13:38:08', '2020-11-09 13:48:08', 1, 3);
INSERT INTO `order_payment` VALUES (28, 'O20201109133906459', 33.0, 28.0, 5.0, '2020-11-09 13:39:20', '2020-11-09 13:49:20', 1, 3);
INSERT INTO `order_payment` VALUES (29, 'O20201109134902253', 15.0, 14.0, 1.0, '2020-11-09 13:49:21', '2020-11-09 13:59:21', 1, 3);
INSERT INTO `order_payment` VALUES (30, 'O20201109194029662', 25.0, 23.0, 2.0, '2020-11-09 19:40:42', '2020-11-09 19:50:42', 0, 3);
INSERT INTO `order_payment` VALUES (31, 'O20201109194059789', 15.0, 14.0, 1.0, '2020-11-09 19:41:12', '2020-11-09 19:51:12', 0, 3);
INSERT INTO `order_payment` VALUES (32, 'O20201109195253019', 36.0, 31.0, 5.0, '2020-11-09 19:53:15', '2020-11-09 20:03:15', 0, 3);
INSERT INTO `order_payment` VALUES (33, 'O20201109201101530', 27.0, 25.0, 2.0, '2020-11-09 20:11:13', '2020-11-09 20:21:13', 1, 1);
INSERT INTO `order_payment` VALUES (34, 'O20201110124718087', 18.0, 17.0, 1.0, '2020-11-10 12:47:32', '2020-11-10 12:57:32', 1, 1);
INSERT INTO `order_payment` VALUES (35, 'O20201110125205777', 27.0, 25.0, 2.0, '2020-11-10 12:52:22', '2020-11-10 13:02:22', 1, 1);
INSERT INTO `order_payment` VALUES (36, 'O20201110125346966', 54.0, 46.0, 8.0, '2020-11-10 12:54:03', '2020-11-10 13:04:03', 1, 2);
INSERT INTO `order_payment` VALUES (37, 'O20201110224404624', 66.0, -19.0, 85.0, '2020-11-10 22:44:11', '2020-11-10 22:54:11', 1, 1);
INSERT INTO `order_payment` VALUES (38, 'O20201110224534548', 25.0, 23.0, 2.0, '2020-11-10 22:45:42', '2020-11-10 22:55:42', 1, 1);
INSERT INTO `order_payment` VALUES (39, 'O20201110224605118', 25.0, 23.0, 2.0, '2020-11-10 22:46:12', '2020-11-10 22:56:12', 1, 2);
INSERT INTO `order_payment` VALUES (40, 'O20201110224631057', 50.0, 42.0, 8.0, '2020-11-10 22:46:36', '2020-11-10 22:56:36', 1, 1);
INSERT INTO `order_payment` VALUES (41, 'O20201110224653891', 45.0, 40.0, 5.0, '2020-11-10 22:47:04', '2020-11-10 22:57:04', 1, 2);
INSERT INTO `order_payment` VALUES (42, 'O20201110224724097', 30.0, 25.0, 5.0, '2020-11-10 22:47:27', '2020-11-10 22:57:27', 1, 1);
INSERT INTO `order_payment` VALUES (43, 'O20201110224747251', 45.0, 40.0, 5.0, '2020-11-10 22:47:52', '2020-11-10 22:57:52', 1, 1);
INSERT INTO `order_payment` VALUES (44, 'O20201110224837421', 30.0, 25.0, 5.0, '2020-11-10 22:48:41', '2020-11-10 22:58:41', 1, 1);
INSERT INTO `order_payment` VALUES (45, 'O20201110224845791', 12.0, 11.0, 1.0, '2020-11-10 22:48:53', '2020-11-10 22:58:53', 1, 1);
INSERT INTO `order_payment` VALUES (46, 'O20201110224859573', 36.0, 31.0, 5.0, '2020-11-10 22:49:04', '2020-11-10 22:59:04', 1, 1);
INSERT INTO `order_payment` VALUES (47, 'O20201110224935710', 12.0, 11.0, 1.0, '2020-11-10 22:49:40', '2020-11-10 22:59:40', 1, 1);
INSERT INTO `order_payment` VALUES (48, 'O20201110224945403', 54.0, 46.0, 8.0, '2020-11-10 22:49:51', '2020-11-10 22:59:51', 1, 1);
INSERT INTO `order_payment` VALUES (49, 'O20201110225016872', 27.0, 25.0, 2.0, '2020-11-10 22:50:21', '2020-11-10 23:00:21', 1, 1);
INSERT INTO `order_payment` VALUES (50, 'O20201110225025851', 54.0, 46.0, 8.0, '2020-11-10 22:50:28', '2020-11-10 23:00:28', 1, 1);
INSERT INTO `order_payment` VALUES (51, 'O20201110225036272', 54.0, 46.0, 8.0, '2020-11-10 22:50:39', '2020-11-10 23:00:39', 1, 1);
INSERT INTO `order_payment` VALUES (52, 'O20201110225135212', 54.0, 46.0, 8.0, '2020-11-10 22:51:39', '2020-11-10 23:01:39', 1, 1);
INSERT INTO `order_payment` VALUES (53, 'O20201110225214099', 27.0, 25.0, 2.0, '2020-11-10 22:52:18', '2020-11-10 23:02:18', 1, 1);
INSERT INTO `order_payment` VALUES (54, 'O20201111184526857', 25.0, 23.0, 2.0, '2020-11-11 18:45:34', '2020-11-11 18:55:34', 1, 1);
INSERT INTO `order_payment` VALUES (55, 'O20201111184601964', 36.0, 31.0, 5.0, '2020-11-11 18:46:05', '2020-11-11 18:56:05', 1, 1);
INSERT INTO `order_payment` VALUES (56, 'O20201111194303925', 27.0, 25.0, 2.0, '2020-11-11 19:43:09', '2020-11-11 19:53:09', 0, 3);
INSERT INTO `order_payment` VALUES (57, 'O20201111195803666', 27.0, 24.0, 3.0, '2020-11-11 19:58:11', '2020-11-11 20:08:11', 0, 3);
INSERT INTO `order_payment` VALUES (58, 'O20201111200352969', 30.0, 27.0, 3.0, '2020-11-11 20:03:59', '2020-11-11 20:13:59', 1, 3);
COMMIT;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int(5) NOT NULL AUTO_INCREMENT,
  `product_category_id` int(5) NOT NULL,
  `name` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `explain` text COLLATE utf8_bin,
  `shop_price` decimal(4,1) DEFAULT NULL,
  `price` decimal(4,1) DEFAULT NULL,
  `hot` int(1) DEFAULT NULL,
  `product_status` int(1) NOT NULL DEFAULT '0',
  `default_img` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user_id` int(5) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user_id` int(5) DEFAULT NULL,
  `recommended` int(1) DEFAULT '0' COMMENT '推荐',
  PRIMARY KEY (`product_id`),
  KEY `product_category_id` (`product_category_id`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`product_category_id`) REFERENCES `product_category` (`product_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of product
-- ----------------------------
BEGIN;
INSERT INTO `product` VALUES (1, 11001, '新疆葡萄', '特色新疆美味葡萄巴拉巴拉', 35.2, 23.5, NULL, 0, 'https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png', NULL, NULL, NULL, NULL, 0);
INSERT INTO `product` VALUES (9, 11003, '宁夏青苹果', '宁夏青苹果，又甜又大个哦哦哦', 25.0, 15.0, NULL, 0, 'http://172.20.74.110:9000/api/app/file/downloadFile/6c76ef537e9945a3bb00c4e2815c8a10.jpg', NULL, NULL, '2020-10-16 20:10:03', NULL, 1);
INSERT INTO `product` VALUES (11, 11006, '贵州红柚', '贵州红柚新鲜红心柚子蜜柚当季现摘水果三红肉柚子汁大果单个5斤', 39.0, 27.8, NULL, 0, 'https://cdn.pixabay.com/photo/2017/08/18/16/38/paper-2655579__480.jpg', NULL, NULL, '2020-10-17 13:21:12', NULL, 1);
INSERT INTO `product` VALUES (12, 11001, 'hehe', '葡萄', 22.0, 12.0, NULL, 0, 'http://172.20.74.110:9000/api/app/file/downloadFile/a89663aac0184eff9beaa51e0197b59a.jpg', NULL, NULL, '2020-10-30 10:37:07', NULL, 1);
COMMIT;

-- ----------------------------
-- Table structure for product_banner_image
-- ----------------------------
DROP TABLE IF EXISTS `product_banner_image`;
CREATE TABLE `product_banner_image` (
  `pbi_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `type` int(1) DEFAULT NULL COMMENT '1图片 2视频 3文字',
  `url` varchar(255) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`pbi_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `product_banner_image_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product_banner_image
-- ----------------------------
BEGIN;
INSERT INTO `product_banner_image` VALUES (1, 9, 1, 'https://cdn.pixabay.com/photo/2017/10/16/20/55/roses-2858453__480.png');
INSERT INTO `product_banner_image` VALUES (2, 9, 1, 'http://localhost:9000/api/app/file/downloadFile/a182c0fbfe024833925d15d9449d6218.jpg');
INSERT INTO `product_banner_image` VALUES (3, 11, 1, 'http://172.20.74.110:9000/api/app/file/downloadFile/225bb75dd5a94edb927241663dd6701b.jpg');
INSERT INTO `product_banner_image` VALUES (4, 9, 1, 'http://img14.yiguoimg.com/d/items/2019/190329/9288737665820285_1133x498.jpg');
INSERT INTO `product_banner_image` VALUES (5, 9, 1, 'https://cdn.pixabay.com/photo/2017/09/11/15/34/animals-2739386__480.jpg');
INSERT INTO `product_banner_image` VALUES (7, 9, 1, 'http://172.20.74.110:9000/api/app/file/downloadFile/1914b984ed9a436db6ac9c5ca7a45a8e.jpg');
INSERT INTO `product_banner_image` VALUES (8, 11, 1, 'http://172.20.74.110:9000/api/app/file/downloadFile/3703a8cb921b4a9cbec8d58d53430aba.jpeg');
INSERT INTO `product_banner_image` VALUES (9, 1, 1, 'https://cdn.pixabay.com/photo/2015/12/15/09/04/banner-1093909__480.jpg');
INSERT INTO `product_banner_image` VALUES (10, 1, 1, 'http://172.20.74.110:9000/api/app/file/downloadFile/2951f85459bc4307ba8be7c53641bf84.jpeg');
INSERT INTO `product_banner_image` VALUES (11, 1, 1, 'http://172.20.74.110:9000/api/app/file/downloadFile/73c73e034d5b4d859252a88be517b2e1.jpg');
INSERT INTO `product_banner_image` VALUES (12, 1, 1, 'http://172.20.74.110:9000/api/app/file/downloadFile/cfac77812e504a698076ba7926650236.jpg');
INSERT INTO `product_banner_image` VALUES (13, 12, 1, 'http://172.20.74.110:9000/api/app/file/downloadFile/01e50a883086446da96e585efb8c9a4f.jpg');
COMMIT;

-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `product_category_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `sort_order` int(4) DEFAULT NULL,
  `description` text COLLATE utf8_bin,
  `image` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user_id` int(5) DEFAULT NULL,
  PRIMARY KEY (`product_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11008 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of product_category
-- ----------------------------
BEGIN;
INSERT INTO `product_category` VALUES (11001, '葡萄', NULL, '葡萄类哦', NULL, NULL, NULL);
INSERT INTO `product_category` VALUES (11003, '苹果', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `product_category` VALUES (11004, '菠萝', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `product_category` VALUES (11005, '西瓜', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `product_category` VALUES (11006, '柚子', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `product_category` VALUES (11007, '火龙果', NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for product_discounts
-- ----------------------------
DROP TABLE IF EXISTS `product_discounts`;
CREATE TABLE `product_discounts` (
  `pd_id` int(5) NOT NULL AUTO_INCREMENT,
  `product_id` int(5) NOT NULL,
  `discounts_id` int(5) NOT NULL,
  PRIMARY KEY (`pd_id`),
  KEY `product_id` (`product_id`),
  KEY `discounts_id` (`discounts_id`),
  CONSTRAINT `product_discounts_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `product_discounts_ibfk_2` FOREIGN KEY (`discounts_id`) REFERENCES `discounts` (`discounts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of product_discounts
-- ----------------------------
BEGIN;
INSERT INTO `product_discounts` VALUES (1, 1, 2);
INSERT INTO `product_discounts` VALUES (3, 9, 4);
INSERT INTO `product_discounts` VALUES (4, 9, 7);
INSERT INTO `product_discounts` VALUES (5, 9, 8);
INSERT INTO `product_discounts` VALUES (18, 11, 2);
INSERT INTO `product_discounts` VALUES (19, 11, 9);
INSERT INTO `product_discounts` VALUES (20, 11, 4);
INSERT INTO `product_discounts` VALUES (21, 11, 6);
INSERT INTO `product_discounts` VALUES (25, 1, 7);
INSERT INTO `product_discounts` VALUES (26, 11, 8);
INSERT INTO `product_discounts` VALUES (27, 11, 7);
INSERT INTO `product_discounts` VALUES (40, 12, 8);
INSERT INTO `product_discounts` VALUES (41, 12, 7);
INSERT INTO `product_discounts` VALUES (46, 12, 6);
INSERT INTO `product_discounts` VALUES (47, 12, 9);
COMMIT;

-- ----------------------------
-- Table structure for product_info_image
-- ----------------------------
DROP TABLE IF EXISTS `product_info_image`;
CREATE TABLE `product_info_image` (
  `pii_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(255) DEFAULT NULL,
  `sort` int(255) DEFAULT NULL COMMENT '排序',
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pii_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `product_info_image_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product_info_image
-- ----------------------------
BEGIN;
INSERT INTO `product_info_image` VALUES (1, 9, 0, 'http://localhost:9000/api/app/file/downloadFile/fb22d154936844ee9cf5d565c5f76965.jpg');
INSERT INTO `product_info_image` VALUES (2, 11, NULL, 'http://172.20.74.110:9000/api/app/file/downloadFile/8f6db18ab84b49a495b76498a5bd11ad.jpg');
INSERT INTO `product_info_image` VALUES (3, 9, 5, 'https://fuss10.elemecdn.com/a/3f/3302e58f9a181d2509f3dc0fa68b0jpeg.jpeg');
INSERT INTO `product_info_image` VALUES (4, 9, 6, 'https://fuss10.elemecdn.com/1/34/19aa98b1fcb2781c4fba33d850549jpeg.jpeg');
INSERT INTO `product_info_image` VALUES (5, 9, 2, 'https://fuss10.elemecdn.com/9/bb/e27858e973f5d7d3904835f46abbdjpeg.jpeg');
INSERT INTO `product_info_image` VALUES (6, 9, 1, 'https://fuss10.elemecdn.com/d/e6/c4d93a3805b3ce3f323f7974e6f78jpeg.jpeg');
INSERT INTO `product_info_image` VALUES (7, 9, 4, 'https://fuss10.elemecdn.com/3/28/bbf893f792f03a54408b3b7a7ebf0jpeg.jpeg');
INSERT INTO `product_info_image` VALUES (8, 9, 3, 'https://fuss10.elemecdn.com/2/11/6535bcfb26e4c79b48ddde44f4b6fjpeg.jpeg');
INSERT INTO `product_info_image` VALUES (9, 1, 1, 'http://img09.yiguoimg.com/d/images/2018/180727/513691885172630779_880x900.jpg');
INSERT INTO `product_info_image` VALUES (10, 1, 2, 'http://img14.yiguoimg.com/d/images/2019/190312/513691895815513708_880x900.jpg');
INSERT INTO `product_info_image` VALUES (11, 1, 3, 'http://img12.yiguoimg.com/d/images/2018/180727/513691885172663547_880x900.jpg');
INSERT INTO `product_info_image` VALUES (12, 1, 4, 'http://img14.yiguoimg.com/d/images/2018/180727/513691885172696315_880x901.jpg');
INSERT INTO `product_info_image` VALUES (13, 1, 5, 'http://img10.yiguoimg.com/d/images/2018/180727/513691885172729083_880x900.jpg');
INSERT INTO `product_info_image` VALUES (14, 1, 6, 'http://img13.yiguoimg.com/d/images/2018/180727/513691885172761851_880x900.jpg');
INSERT INTO `product_info_image` VALUES (15, 12, 1, 'http://172.20.74.110:9000/api/app/file/downloadFile/dd9b98aaeb5d4ab2a80d0b0168adf7af.jpg');
INSERT INTO `product_info_image` VALUES (16, 12, 0, 'http://172.20.74.110:9000/api/app/file/downloadFile/6446ce7a83e74373a4c4505f3324da86.jpg');
COMMIT;

-- ----------------------------
-- Table structure for product_tag
-- ----------------------------
DROP TABLE IF EXISTS `product_tag`;
CREATE TABLE `product_tag` (
  `product_id` int(11) DEFAULT NULL,
  `tag_id` int(11) DEFAULT NULL,
  KEY `product_id` (`product_id`),
  KEY `tag_id` (`tag_id`),
  CONSTRAINT `product_tag_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `product_tag_ibfk_2` FOREIGN KEY (`tag_id`) REFERENCES `tag` (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product_tag
-- ----------------------------
BEGIN;
INSERT INTO `product_tag` VALUES (1, 13100);
INSERT INTO `product_tag` VALUES (9, 13100);
INSERT INTO `product_tag` VALUES (9, 13103);
INSERT INTO `product_tag` VALUES (11, 13100);
INSERT INTO `product_tag` VALUES (11, 13103);
INSERT INTO `product_tag` VALUES (12, 13100);
INSERT INTO `product_tag` VALUES (12, 13101);
INSERT INTO `product_tag` VALUES (12, 13102);
COMMIT;

-- ----------------------------
-- Table structure for sku
-- ----------------------------
DROP TABLE IF EXISTS `sku`;
CREATE TABLE `sku` (
  `sku_id` int(11) NOT NULL AUTO_INCREMENT,
  `attrbute` varchar(20) NOT NULL,
  PRIMARY KEY (`sku_id`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sku
-- ----------------------------
BEGIN;
INSERT INTO `sku` VALUES (101, '斤');
INSERT INTO `sku` VALUES (102, '箱');
INSERT INTO `sku` VALUES (103, '盒');
INSERT INTO `sku` VALUES (104, '包');
INSERT INTO `sku` VALUES (105, '袋');
INSERT INTO `sku` VALUES (106, '罐');
INSERT INTO `sku` VALUES (107, '个');
COMMIT;

-- ----------------------------
-- Table structure for snap_up
-- ----------------------------
DROP TABLE IF EXISTS `snap_up`;
CREATE TABLE `snap_up` (
  `snap_up_id` int(5) NOT NULL,
  `product_id` int(5) NOT NULL,
  `price` decimal(4,1) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`snap_up_id`,`product_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `snap_up_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for spec
-- ----------------------------
DROP TABLE IF EXISTS `spec`;
CREATE TABLE `spec` (
  `spec_id` int(5) NOT NULL AUTO_INCREMENT,
  `product_id` int(5) NOT NULL,
  `spec_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `price` decimal(4,1) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `sku_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`spec_id`),
  KEY `product_id` (`product_id`),
  KEY `sku_id` (`sku_id`),
  CONSTRAINT `spec_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `spec_ibfk_2` FOREIGN KEY (`sku_id`) REFERENCES `sku` (`sku_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12129 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of spec
-- ----------------------------
BEGIN;
INSERT INTO `spec` VALUES (12121, 9, '小果', 12.0, 22, 101);
INSERT INTO `spec` VALUES (12122, 9, '中果', 15.0, 22, 101);
INSERT INTO `spec` VALUES (12123, 9, '大果', 18.0, 22, 101);
INSERT INTO `spec` VALUES (12125, 11, '小果(5斤)', 27.0, 30, 107);
INSERT INTO `spec` VALUES (12126, 1, '中果', 25.0, 20, 101);
INSERT INTO `spec` VALUES (12127, 1, '大果', 33.0, 30, 101);
INSERT INTO `spec` VALUES (12128, 12, '小果', 15.0, 30, 101);
COMMIT;

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `tag_id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`tag_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tag
-- ----------------------------
BEGIN;
INSERT INTO `tag` VALUES (13100, '产地直销');
INSERT INTO `tag` VALUES (13101, '会员优惠');
INSERT INTO `tag` VALUES (13102, '限时优惠');
INSERT INTO `tag` VALUES (13103, '新品上市');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_bin NOT NULL,
  `password` varchar(100) COLLATE utf8_bin NOT NULL,
  `nickname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `image` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `qq` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `mobile` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=10004 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (10001, 'teenyda', '12345', '智取棋', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (10002, 'poorld', '12345', '忍乳妇重', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (10003, 'milk', '9527', NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-11 14:20:10');
COMMIT;

-- ----------------------------
-- Table structure for user_member
-- ----------------------------
DROP TABLE IF EXISTS `user_member`;
CREATE TABLE `user_member` (
  `user_id` int(5) NOT NULL,
  `members_id` int(5) NOT NULL AUTO_INCREMENT,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `members_id` (`members_id`),
  CONSTRAINT `user_member_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `user_member_ibfk_2` FOREIGN KEY (`members_id`) REFERENCES `members` (`members_id`)
) ENGINE=InnoDB AUTO_INCREMENT=53202 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user_member
-- ----------------------------
BEGIN;
INSERT INTO `user_member` VALUES (10001, 53201, '2020-11-02 12:47:32', '2020-12-02 12:47:42');
COMMIT;

-- ----------------------------
-- Table structure for wallet
-- ----------------------------
DROP TABLE IF EXISTS `wallet`;
CREATE TABLE `wallet` (
  `wallet_id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) NOT NULL,
  `balance` decimal(4,1) DEFAULT '0.0',
  `password` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`wallet_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `wallet_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23103 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of wallet
-- ----------------------------
BEGIN;
INSERT INTO `wallet` VALUES (23101, 10001, 9.5, NULL);
INSERT INTO `wallet` VALUES (23102, 10003, 73.0, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
