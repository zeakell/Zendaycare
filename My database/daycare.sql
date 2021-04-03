/* create database */
CREATE DATABASE  zendaycare
USE zendaycare
/* insert tabel */
CREATE TABLE anak
(
	id_anak VARCHAR(7) NOT NULL PRIMARY KEY,
	Nama_lengkap VARCHAR(150) NOT NULL,
	TTL DATE NOT NULL,
	jenis_kelamin  VARCHAR(10) NOT NULL,
	id_orangtua VARCHAR(7) NOT NULL CONSTRAINT FK_ANAK_IBU REFERENCES parent(id_orangtua) 
)

CREATE TABLE parent
(
	id_orangtua VARCHAR(7) NOT NULL PRIMARY KEY,
	Nama_lengkap VARCHAR(150) NOT NULL,
	TTL DATE NOT NULL,
	jenis_kelamin  VARCHAR(10) NOT NULL,
	pekerjaan  VARCHAR(50) NOT NULL,
	no_handphone  VARCHAR(13) NOT NULL,
	provinsi VARCHAR(250) NOT NULL,
	kabkota VARCHAR(250) NOT NULL,
	alamat  VARCHAR(200) NOT NULL,
	email VARCHAR(100) NOT NULL,
	username VARCHAR(50) NOT NULL,
	katasandi VARCHAR(50) NOT NULL
)

CREATE TABLE jabatan
(
	id_jabatan VARCHAR(7) NOT NULL PRIMARY KEY,
	Nama_jabatan VARCHAR(50) NOT NULL
)

CREATE TABLE jenjang
(
	id_jenjang VARCHAR(7) NOT NULL PRIMARY KEY,
	Nama_jenjang VARCHAR(150) NOT NULL,
	usia  VARCHAR(100) NOT NULL
)

CREATE TABLE pegawai
(
	id_pegawai VARCHAR(7) NOT NULL PRIMARY KEY,
	Nama_lengkap VARCHAR(150) NOT NULL,
	TTL DATE NOT NULL,
	jenis_kelamin  VARCHAR(10) NOT NULL,
	pedidikan VARCHAR(50) NOT NULL,
	alamat VARCHAR(250) NOT NULL,
	no_handphone VARCHAR(13) NOT NULL,
	id_jabatan VARCHAR(7) NOT NULL CONSTRAINT FK_jab_peg REFERENCES jabatan(id_jabatan) ,
	sertifikat VARCHAR(200) NOT NULL,
	userlog VARCHAR(30) NOT NULL,
	katasandi VARCHAR(30) NOT NULL
)

CREATE TABLE registrasi
(
	no_registrasi VARCHAR(7) NOT NULL PRIMARY KEY,
	tanggal_registrasi DATE NOT NULL,
	jam_registrasi VARCHAR(20) NOT NULL,
	id_orangtua  VARCHAR(7) NOT NULL CONSTRAINT FK_parent_REG REFERENCES parent(id_orangtua) ,
	id_anak VARCHAR(7) NOT NULL,
	id_jenjang VARCHAR(7) NOT NULL CONSTRAINT FK_JENJANG_REG REFERENCES jenjang(id_jenjang),	
	id_service VARCHAR(7) NOT NULL CONSTRAINT FK_LAY_REG REFERENCES layanan(id_service),
	harga_layanan INT NOT NULL,
	statuss VARCHAR(30) NOT NULL
)

CREATE TABLE pembayaran
(
	no_pembayaran VARCHAR(7) NOT NULL PRIMARY KEY,
	tanggal_pembayaran DATE NOT NULL,
	jam_pembayaran VARCHAR(20) NOT NULL,
	no_registrasi  VARCHAR(7) NOT NULL CONSTRAINT FK_REG_BAYAR REFERENCES [dbo].[registrasi]([no_registrasi]),
	total_pemabayaran INT NOT NULL,
	statuss VARCHAR(30) NOT NULL
)

CREATE TABLE layanan
(
	id_service Varchar(7) NOT NULL PRIMARY KEY,
	nama_service varchar(50) not null,
	harga int 
)

CREATE TABLE activity
(
	jam time NOT NULL ,
	activity varchar(500) not null
)

/* alter table constraint*/
/* table anak*/
alter table anak
add constraint JK check([Jenis_Kelamin] IN ('laki-laki','perempuan')) 


/* tabel orangtua*/
alter table parent
add constraint JKp check([Jenis_Kelamin] IN ('laki-laki','perempuan')) 

alter table parent
add constraint NHP CHECK ([no_handphone] LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')

/* tabel pegawai*/
alter table pegawai
add constraint JKpg check([Jenis_Kelamin] IN ('laki-laki','perempuan')) 

alter table pegawai
add constraint NHPg CHECK ([no_handphone] LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')


/* tabel registrasi*/
alter table registrasi
add constraint st check([statuss] IN ('LUNAS','BELUM LUNAS')) 

/* tabel PEMBAYARAN*/
alter table pembayaran
add constraint st1 check([statuss] IN ('LUNAS','BELUM LUNAS')) 


/* TRIGGER FOR CHANGE STATUS */
	create trigger CS
	on [dbo].[pembayaran]
	for insert
	as
	begin
		update a set a.statuss = b.statuss
		from [dbo].[registrasi]  a JOIN inserted b 
		on a.no_registrasi = b.no_registrasi
	end

create trigger Pesan
on [dbo].[registrasi]
after update
as
begin
	print 'TRANSAKSI TELAH DIBAYARKAN'
end
RETURN
