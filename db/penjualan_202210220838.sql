-- homely.penjualan definition

CREATE TABLE `penjualan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nama_pemesan` varchar(50) DEFAULT NULL,
  `area` varchar(50) DEFAULT NULL,
  `tipe_rumah` varchar(50) DEFAULT NULL,
  `luas_tanah` int DEFAULT NULL,
  `harga` int DEFAULT NULL,
  `lama_cicilan` int DEFAULT NULL,
  `cicilan` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO penjualan (nama_pemesan,area,tipe_rumah,luas_tanah,harga,lama_cicilan,cicilan) VALUES
	 ('fuad','Bougenvile','Tipe-36',80,130000000,10,13300000),
	 ('adi','Bougenvile','Tipe-36',100,140000000,48,2375000),
	 ('badeu','Flamboyan','Tipe-36',140,248000000,60,3713333);