CREATE TABLE `course` (
  `cid` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `cname` varchar(32) COLLATE utf8mb4_bin NOT NULL DEFAULT '',
  `user_id` bigint(20) unsigned NOT NULL DEFAULT 0,
  `cstatus` varchar(32) COLLATE utf8mb4_bin NOT NULL DEFAULT '0',
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
