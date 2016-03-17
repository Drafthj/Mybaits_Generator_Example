CREATE DATABASE `mtest` /*!40100 DEFAULT CHARACTER SET utf8 */;

DROP TABLE IF EXISTS `mtest`.`course`;
CREATE TABLE  `mtest`.`course` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `course_name` varchar(45) CHARACTER SET utf8 NOT NULL,
  `teacher_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `mtest`.`student`;
CREATE TABLE  `mtest`.`student` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `age` int(10) unsigned NOT NULL,
  `sex` char(2) NOT NULL,
  `birth` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `mtest`.`student_course`;
CREATE TABLE  `mtest`.`student_course` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `student_id` int(10) unsigned NOT NULL,
  `course_id` int(10) unsigned NOT NULL,
  `score` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `mtest`.`teacher`;
CREATE TABLE  `mtest`.`teacher` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `age` int(10) unsigned NOT NULL,
  `sex` char(2) NOT NULL,
  `birth` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;