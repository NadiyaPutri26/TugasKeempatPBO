# TugasKeempatPBO
Dalam praktikum ini, akan dipelajari cara _connect_ Netbeans dengan postgreeSQL dan penerapan konsep CRUD yang interaktif dan _Main Class_ di Netbeans. Dalam praktikum ini akan mempelajari pengetikan atau penulisan _query_ SQL yang benar.

# _Connect_ PostgreeSQL
Untuk melakukan _connect_ antara Netbeans dan postgreeSQL, yang perlu dilakukan adalah membuat _database_ nya dulu di pgAdmin. Dalam praktikum ini nama _database_ nya adalah "DB_PBO_P4". Kemudian dalam aplikasi Netbeans, klik "Ctrl+5" untuk membuka menu "Services", setelah itu lakukan _connect database_ dengan masuk di menu "Drivers" dan pilih "PostgreeSQL". Isi nama _database_ sesuai yang ada di pgAdmin, isi _password_ usernya untuk _connect_ ke _server database_. Setelah klik "Next", pada bagian "Choose Database Schema" pilih "public", kemudian setelah klik "Next" masukkan nama _database_ sesuai dengan nama _database_ di pgAdmin dan _finish_. Maka Netbeans sudah terhubung dengan pgAdmin.

# Class Koneksi (_Superclass_)
Dalam praktikum ini, dilakukan penerapan _Inheritance_ seperti praktikum sebelumnya, dimana **Class Koneksi** adalah _superclass_ sedangkan **Class Create, Class Insert, Class Read/ Select, Class Update,** dan **Class Delete** akan menjadi _subclassnya_.

# Konsep CRUD (_Create, Read/ Select, Update,_ dan _Delete_) dan _Insert_ 

## **_CREATE_**

  
Dalam praktikum ini untuk **Class Create** (_subclass_) berisi code untuk membuat tabel _database_ "tokobunga", dimana setiap kolom dalan tabelnya adalah:
- **idbunga CHAR (3)** --> _Primary key_, dengan format (huruf pertama nama bunga - urutan), contoh: Mawar Merah (M01)
- **namabunga VARCHAR (20)** --> nama bunga
- **kategoribunga VARCHAR (20)** --> produk bunga dalam praktikum ini berbentuk buket dalam berbagai jenis (contoh: buket Wedding, buket Friends, buket Special, buket Valentine)
- **deskripsiproduk VARCHAR (255)** --> deskripsi produk buket bunga (menyesuaikan nama bunga juga)
- **harga INT** --> dalam praktikum ini harga buket tergantung jumlah tangkai bunga dan ukuran buket
- **stok INT** --> stok bunga yang ada di toko
- **ukuran VARCHAR (10)** --> dalam praktikum ini ada 3 macam ukuran, yakni K (kecil), M (Medium), B (besar) dan masing-masing ukuran memiliki jumlah tangkai yang sudah di tentukan yakni K (11-20), M (21-30), B (31-40).

Berikut _Query_ _Create_:


**String QUERY = "CREATE TABLE tokobunga ("
            + "idbunga CHAR (3) PRIMARY KEY, "
            + "namabunga VARCHAR (20), "
            + "kategoribunga VARCHAR (20), "
            + "deskripsiproduk VARCHAR (255), "
            + "harga INT, "
            + "stok INT, "
            + "ukuran VARCHAR (10)"
            + ");";**

## **_INSERT_**

  
Dalam **Class Insert** (_subclass_) akan dibuat _code_ untuk menjalankan _query_ untuk menambahkan data ke dalam tabel yang sudah dibuat yakni tabel "tokobunga" dalam _class_ ini menggunakan **Class Scanner** agar _user_ dapat mengisi data ketika program _running_. 

Berikut _Query_ untuk _Insert_: 


**String QUERY = "INSERT INTO tokobunga (idbunga, namabunga, kategoribunga"
                    + ", deskripsiproduk, harga, stok, ukuran) VALUES('" + bunga + "','"
                    + bunga1 + "','" + bunga2 + "','" + bunga3 + "','" + bunga4 + "','"
                    + bunga5 + "','" + bunga6 + "')";**

## **_READ/ SELECT_**

  
Kemudian dalam **Class Read/ Select** (_subclass_), akan menampilkan data yang sudah dimasukkan ke dalam tabel "tokobunga" melalui **Class Insert**. Selain itu, dalam _class_ ini menggunakan **Class Scanner** agar _user_ dapat mengisi data ketika program _running_. 

Berikut _Query_ untuk _Select_: 



**String QUERY = "SELECT * FROM tokobunga";**

## **_UPDATE_**

  
Dalam **Class Update** (subclass) akan dilakukan perbaruan data. Dalam praktikum ini perbaruan data yang dilakukan adalah memperbaiki typo (salah kata) ketika menginsert data di kolom "deskripsiproduk" pada idbunga= T01. _Class_ ini juga menggunakan **Class Scanner** agar _user_ dapat mengisi data ketika program _running_.

Berikut _Query_ untuk _Update_:  


**String QUERY = "UPDATE tokobunga SET " + bunga + "='" + bunga1 + "' WHERE " + bunga2 + "='" + bunga3 + "';";**

## **_DELETE_**

  
Dalam **Class Delete** (subclass) akan dilakukan penghapusan data. Selain itu, class ini menggunakan Class Scanner agar user dapat mengisi data ketika program running. 


Dalam praktikum ini _Query_ untuk _Delete_ adalah **String QUERY = "DELETE FROM tokobunga WHERE " + bunga + "='" + bunga1 + "';";**.

# Menu Utama (_Main Class_)
Dalam praktikum ini terdapat **Class Menu** untuk memanggil semua _Class_ yang ada dalam _Package_ "TokoBunga". Dimana dalam praktikum ini menggunakan **Class Scanne**r dalam _library_ milik Java agar _user_ dapat mengisi data ketika program _running_. 


