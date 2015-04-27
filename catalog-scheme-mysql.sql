/**mysql*/

CREATE TABLE `catalog` (
  `id` int(11) NOT NULL,
  `category` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
