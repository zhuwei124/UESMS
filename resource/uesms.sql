/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.28 : Database - uesms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`uesms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `uesms`;

/*Table structure for table `carriagecompany` */

DROP TABLE IF EXISTS `carriagecompany`;

CREATE TABLE `carriagecompany` (
  `carriageCompany_id` int(11) NOT NULL AUTO_INCREMENT,
  `station_id` int(11) NOT NULL,
  `vehicle_id` int(11) NOT NULL,
  `carriageCompany_corporateRepresentative` varchar(20) DEFAULT NULL,
  `carriageCompany_address` varchar(100) DEFAULT NULL,
  `carriageCompany_zipCode` varchar(6) DEFAULT NULL,
  `carriageCompany_status` varchar(10) DEFAULT NULL,
  `carriageCompany_isDeleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`carriageCompany_id`,`station_id`,`vehicle_id`),
  KEY `vehicle_id` (`vehicle_id`),
  KEY `station_id` (`station_id`),
  CONSTRAINT `carriagecompany_ibfk_1` FOREIGN KEY (`vehicle_id`) REFERENCES `vehicle` (`vehicle_id`),
  CONSTRAINT `carriagecompany_ibfk_2` FOREIGN KEY (`station_id`) REFERENCES `station` (`station_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `carriagecompany` */

insert  into `carriagecompany`(`carriageCompany_id`,`station_id`,`vehicle_id`,`carriageCompany_corporateRepresentative`,`carriageCompany_address`,`carriageCompany_zipCode`,`carriageCompany_status`,`carriageCompany_isDeleted`) values (1,0,1,'张三','四川雅安','001','启用',0),(2,0,2,'李四','四川成都','002','禁用',0),(3,0,1,'233fdsfs','weqewrer','erwrw','open11',1),(5,0,2,'111','111','1','11',0),(6,0,1,'233fdsfs','weqewrer','erwrw','open',1);

/*Table structure for table `driver` */

DROP TABLE IF EXISTS `driver`;

CREATE TABLE `driver` (
  `driver_id` int(11) NOT NULL AUTO_INCREMENT,
  `drivingLlicense_id` int(11) NOT NULL,
  `vehicle_id` int(11) NOT NULL,
  `driver_name` varchar(20) DEFAULT NULL,
  `driver_vicheNumber` varchar(14) DEFAULT NULL,
  `driver_company` varchar(40) DEFAULT NULL,
  `driver_isDeleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`driver_id`,`drivingLlicense_id`,`vehicle_id`),
  KEY `drivingLlicense_id` (`drivingLlicense_id`),
  KEY `vehicle_id` (`vehicle_id`),
  CONSTRAINT `driver_ibfk_1` FOREIGN KEY (`drivingLlicense_id`) REFERENCES `drivinglicense` (`drivingLicense_id`),
  CONSTRAINT `driver_ibfk_2` FOREIGN KEY (`vehicle_id`) REFERENCES `vehicle` (`vehicle_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `driver` */

insert  into `driver`(`driver_id`,`drivingLlicense_id`,`vehicle_id`,`driver_name`,`driver_vicheNumber`,`driver_company`,`driver_isDeleted`) values (1,1,1,'张三','2313212','3312313',0),(2,2,2,'李四','213131','23123123',0);

/*Table structure for table `drivinglicense` */

DROP TABLE IF EXISTS `drivinglicense`;

CREATE TABLE `drivinglicense` (
  `drivingLicense_id` int(11) NOT NULL AUTO_INCREMENT,
  `drive_id` int(11) NOT NULL,
  `drivingLicense_vehicleTtype` varchar(10) DEFAULT NULL,
  `drivingLicense_status` varchar(10) DEFAULT NULL,
  `drivingLicense_record` int(11) DEFAULT NULL,
  `drivingLicense_end` date DEFAULT NULL,
  `drivingLicense_start` date DEFAULT NULL,
  `drivingLicense_issueDate` date DEFAULT NULL,
  `drivingLicense_isDeleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`drivingLicense_id`,`drive_id`),
  KEY `drive_id` (`drive_id`),
  CONSTRAINT `drivinglicense_ibfk_1` FOREIGN KEY (`drive_id`) REFERENCES `driver` (`driver_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `drivinglicense` */

insert  into `drivinglicense`(`drivingLicense_id`,`drive_id`,`drivingLicense_vehicleTtype`,`drivingLicense_status`,`drivingLicense_record`,`drivingLicense_end`,`drivingLicense_start`,`drivingLicense_issueDate`,`drivingLicense_isDeleted`) values (1,1,'A','启用',2133213,'2015-05-12','2015-05-04','2015-05-06',0),(2,2,'B','禁用',35435,'2015-05-07','2015-05-15','2015-05-15',1);

/*Table structure for table `limitt` */

DROP TABLE IF EXISTS `limitt`;

CREATE TABLE `limitt` (
  `limit_id` int(11) NOT NULL AUTO_INCREMENT,
  `limit_name` varchar(20) NOT NULL,
  `limit_status` varchar(10) NOT NULL,
  `limit_level` int(1) NOT NULL,
  `limit_isDeleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`limit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `limitt` */

insert  into `limitt`(`limit_id`,`limit_name`,`limit_status`,`limit_level`,`limit_isDeleted`) values (1,'管理员','启用',0,0),(2,'车站管理员','启用',1,0),(3,'承运方','启用',2,0),(4,'司机','启用',3,0),(5,'普通用户','启用',4,0);

/*Table structure for table `passwordquestion` */

DROP TABLE IF EXISTS `passwordquestion`;

CREATE TABLE `passwordquestion` (
  `passwordQuestion_id` int(11) NOT NULL AUTO_INCREMENT,
  `passwordQuestion_content` varchar(1024) DEFAULT NULL,
  `passwordQuestion_answer` varchar(1024) DEFAULT NULL,
  `passwordQuestion_isDeleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`passwordQuestion_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `passwordquestion` */

insert  into `passwordquestion`(`passwordQuestion_id`,`passwordQuestion_content`,`passwordQuestion_answer`,`passwordQuestion_isDeleted`) values (1,'我的年龄','12',0),(2,'我的性别','男',0),(3,NULL,NULL,0);

/*Table structure for table `station` */

DROP TABLE IF EXISTS `station`;

CREATE TABLE `station` (
  `station_id` int(11) NOT NULL AUTO_INCREMENT,
  `carriageCompany_id` int(11) NOT NULL,
  `station_code` varchar(20) DEFAULT NULL,
  `station_corporateRepresentative` varchar(20) DEFAULT NULL,
  `station_address` varchar(100) DEFAULT NULL,
  `station_zipCode` varchar(6) DEFAULT NULL,
  `station_status` varchar(20) DEFAULT NULL,
  `station_briefIntroduction` varchar(1024) DEFAULT NULL,
  `station_isDeleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`station_id`,`carriageCompany_id`),
  KEY `carriageCompany_id` (`carriageCompany_id`),
  CONSTRAINT `station_ibfk_1` FOREIGN KEY (`carriageCompany_id`) REFERENCES `carriagecompany` (`carriageCompany_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `station` */

insert  into `station`(`station_id`,`carriageCompany_id`,`station_code`,`station_corporateRepresentative`,`station_address`,`station_zipCode`,`station_status`,`station_briefIntroduction`,`station_isDeleted`) values (1,1,'112312','张三','四川雅安','213123','启用','123435345',0),(2,2,'213213','李四','四川成都','231434','禁用','23243254',1);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `limit_id` int(11) NOT NULL,
  `user_systemNumber` int(11) unsigned NOT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `user_sex` varchar(2) DEFAULT NULL,
  `user_idCard` varchar(30) DEFAULT NULL,
  `user_tellNumber` varchar(11) DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_mail` varchar(50) DEFAULT NULL,
  `user_address` varchar(100) DEFAULT NULL,
  `user_qq` varchar(20) DEFAULT NULL,
  `user_status` varchar(10) DEFAULT NULL,
  `user_password` varchar(1024) DEFAULT NULL,
  `user_isDeleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`,`limit_id`),
  UNIQUE KEY `user_systemNumber` (`user_systemNumber`),
  KEY `limit_id` (`limit_id`),
  CONSTRAINT `user_ibfk_2` FOREIGN KEY (`limit_id`) REFERENCES `limitt` (`limit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`limit_id`,`user_systemNumber`,`user_name`,`user_sex`,`user_idCard`,`user_tellNumber`,`user_birthday`,`user_mail`,`user_address`,`user_qq`,`user_status`,`user_password`,`user_isDeleted`) values (1,1,1,'张三','男','23131231231313','12313131','2015-05-13','231312313','四川','231321','启用','123',0),(2,2,2,'李四','女','231313435435','45343543','2015-05-13','45353543','北京','6546464','禁用','123',0),(3,2,3,'2','2','2','2','2015-05-07','2','2','2','2','2',0),(4,1,4,'1','1','1','1','2015-05-13','1','1','1','1','1',0),(5,1,5,'1','1','1','1','2015-05-06','1','1','1','1','1',0),(6,2,6,'2','2','2','2','2015-04-30','2','2','2','2','2',0),(7,2,7,'2','2','2','2','2015-04-30','2','2','2','2','2',1),(8,2,8,'2','2','2','2','2015-04-30','2','2','2','2','2',0),(9,1,9,'1','11','1','1','2015-05-07','1','1','1','1','1',0),(10,5,10,'小芳','女','213131312','213131','2014-09-09','dasd@qw.com','川农','2112331','启用','123',0),(11,3,11,'小花','女','213131312','213131','2014-09-09','dasd@qw.com','川农','2112331','启用','123',0),(12,4,12,'小美','女','213131312','213131','2014-09-09','dasd@qw.com','川农','2112331','启用','123',0),(13,5,13,'小甜','女','213131312','213131','2014-09-09','dasd@qw.com','川农','2112331','启用','123',0),(16,5,14,'小秀','女','213131312','213131','2014-09-09','dasd@qw.com','川农','2112331','启用','123',0),(17,4,16,'小艾','女','23456','2345','2015-06-17','34244@3242','23131','32424324','2313','231321',0);

/*Table structure for table `vehicle` */

DROP TABLE IF EXISTS `vehicle`;

CREATE TABLE `vehicle` (
  `vehicle_id` int(11) NOT NULL AUTO_INCREMENT,
  `driver_id` int(11) NOT NULL,
  `vehicle_type` varchar(10) DEFAULT NULL,
  `vehicle_number` varchar(14) DEFAULT NULL,
  `vehicle_status` varchar(10) DEFAULT NULL,
  `vehicle_remark` varchar(50) DEFAULT NULL,
  `vehicle_carrier` varchar(40) DEFAULT NULL,
  `vehicle_route` varchar(30) DEFAULT NULL,
  `vehicle_location` varchar(40) DEFAULT NULL,
  `vehicle_isDeleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`vehicle_id`,`driver_id`),
  KEY `driver_id` (`driver_id`),
  CONSTRAINT `vehicle_ibfk_1` FOREIGN KEY (`driver_id`) REFERENCES `driver` (`driver_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `vehicle` */

insert  into `vehicle`(`vehicle_id`,`driver_id`,`vehicle_type`,`vehicle_number`,`vehicle_status`,`vehicle_remark`,`vehicle_carrier`,`vehicle_route`,`vehicle_location`,`vehicle_isDeleted`) values (1,1,'A','324234','启用','23124','3424','231321','321313',0),(2,2,'B','243456','禁用','543453245','233131','231313323','312313',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
