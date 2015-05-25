/*
SQLyog Ultimate v9.63 
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
  `carriageCompany_id` int(11) NOT NULL,
  `vehicle_id` int(11) DEFAULT NULL,
  `carriageCompany_corporateRepresentative` varchar(20) DEFAULT NULL,
  `carriageCompany_address` varchar(100) DEFAULT NULL,
  `carriageCompany_zipCode` varchar(6) DEFAULT NULL,
  `carriageCompany_status` varchar(10) DEFAULT NULL,
  `carriageCompany_isDeleted` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`carriageCompany_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `driver` */

DROP TABLE IF EXISTS `driver`;

CREATE TABLE `driver` (
  `driver_id` int(11) NOT NULL,
  `drivingLlicense_id` int(11) DEFAULT NULL,
  `vehicle_id` int(11) DEFAULT NULL,
  `driver_name` varchar(20) DEFAULT NULL,
  `driver_vicheNumber` varchar(14) DEFAULT NULL,
  `driver_company` varchar(40) DEFAULT NULL,
  `driver_isDelete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`driver_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `drivinglicense` */

DROP TABLE IF EXISTS `drivinglicense`;

CREATE TABLE `drivinglicense` (
  `drivingLicense_id` int(11) NOT NULL,
  `drive_id` int(11) DEFAULT NULL,
  `drivingLicense_vehicleTtype` varchar(10) DEFAULT NULL,
  `drivingLicense_status` varchar(10) DEFAULT NULL,
  `drivingLicense_record` int(11) DEFAULT NULL,
  `drivingLicense_end` date DEFAULT NULL,
  `drivingLicense_start` date DEFAULT NULL,
  `drivingLicense_issueDate` date DEFAULT NULL,
  PRIMARY KEY (`drivingLicense_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `limitt` */

DROP TABLE IF EXISTS `limitt`;

CREATE TABLE `limitt` (
  `limit_id` int(11) NOT NULL,
  `limit_name` varchar(20) DEFAULT NULL,
  `limit_status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`limit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `passwordquestion` */

DROP TABLE IF EXISTS `passwordquestion`;

CREATE TABLE `passwordquestion` (
  `passwordQuestion_id` int(11) NOT NULL,
  `passwordQuestion_content` varchar(1024) DEFAULT NULL,
  `passwordQuestion_answer` varchar(1024) DEFAULT NULL,
  `passwordQuestion_isDeleted` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`passwordQuestion_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `station` */

DROP TABLE IF EXISTS `station`;

CREATE TABLE `station` (
  `station_id` int(11) NOT NULL,
  `carriageCompany_id` int(11) DEFAULT NULL,
  `station_code` varchar(20) DEFAULT NULL,
  `station_corporateRepresentative` varchar(20) DEFAULT NULL,
  `station_address` varchar(100) DEFAULT NULL,
  `station_zipCode` varchar(6) DEFAULT NULL,
  `station_status` varchar(20) DEFAULT NULL,
  `ststion_briefIntroduction` varchar(1024) DEFAULT NULL,
  `ststion_isDeleted` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`station_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `passwordQuestion_id` int(11) DEFAULT NULL,
  `limit_id` int(11) DEFAULT NULL,
  `user_systemNumber` int(11) DEFAULT NULL,
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
  `user_isDeleted` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `vehicle` */

DROP TABLE IF EXISTS `vehicle`;

CREATE TABLE `vehicle` (
  `vehicle_id` int(11) NOT NULL,
  `drive_id` int(11) DEFAULT NULL,
  `vehicle_type` varchar(10) DEFAULT NULL,
  `vehicle_number` varchar(14) DEFAULT NULL,
  `vehicle_status` varchar(10) DEFAULT NULL,
  `vehicle_remark` varchar(50) DEFAULT NULL,
  `vehicle_carrier` varchar(40) DEFAULT NULL,
  `vehicle_isDelete` tinyint(1) DEFAULT NULL,
  `vehicle_route` varchar(30) DEFAULT NULL,
  `vehicle_location` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`vehicle_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
