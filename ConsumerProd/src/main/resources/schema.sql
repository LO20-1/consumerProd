CREATE TABLE IF NOT EXISTS consumer(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nama VARCHAR(255),
    alamat TEXT,
    kota CHAR,
    provinsi CHAR,
    tgl_registrasi DATETIME,
    status CHAR(1) CHECK (status IN ('A', 'I'))
);