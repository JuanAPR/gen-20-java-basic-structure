# Java Fundamental - Java Basic Structure
Pada lesson 3, diajarkan mengenai struktur pada Java. Hal yang diajarkan termasuk tipe data, package dan import, modifier, structure, variabel, metode dan konstruktor.
Kemudian diberikan beberapa tugas untuk dikerjakan yang telah dibuat pada repository ini.

## Tugas
1. Membuat class yang didalamnya terdapat penggunaan atribut
2. Membuat perhitungan aritmatika sederhana
3. Membuat tampilan layar segitiga dengan menggunakan looping
4. Membuat metode yang menampilkan hasil bilangan (ganjil/genap) pada dua bilangan variable yang ditambahkan.
5. Membuat program yang menerima bilangan positif n, dan menampilkan bilangan bulat positif pertama yang habis dibagi 3 tetapi tidak habis dibagi 2, dengan n adalah jumlah bilangan yang ditampilkan (i.e : n = 5 akan menampilkan 5 bilangan)
6. Membuat program untuk menghitung deret n= 1+2+3+..+n, dengan nilai n diinputkan oleh pengguna.

## Class
Pada tugas ini, saya membuat beberapa kelas yang digunakan untuk membuat tugas. Kelas `Main` akan memanggil kelas `Variables` , `Arithmatic` , `OddEven`, `ThreeNotTwo` dan `UlangTambah`.
Untuk tugas menamampilkan layar segitiga, saya membuat kelas `MakeTriangle` yang terpisah dari kelas `Main`.

### Main
Kelas `Main` selain digunakan untuk memulai aplikasi serta memanggil kelas lain, kelas ini juga akan menjadi tempat untuk memasukkan value menggunakan Java Utility Scanner yang berasal dari bawaan Java.
Dengan `Scanner` maka kita dapat memasukan value melalui terminal untuk disimpan dalam variabel yang telah disiapkan.

### Variables
Kelas ini akan menampilkan beberapa variabel dengan tipe data yang berbeda. Variabel dan tersebut disimpan dalam kelas Variables dan akan dipanggil pada kelas Main dengan membuat instance objek kelas Variables.
Ketika terpanggil maka kelas Variables akan melakukan `System.out.print` pada variabel yang ada di dalam kelas Variables.

### Arithmatic
Kelas ini akan melakukan sebuah perhitungan atau pengurangan sederhana. Pada kelas ini terdapat dua metode untuk pertambahan dan untuk pengurangan. Seperti `Variables` kelas `Main` akan memanggil `Arithmatic`
kemudian akan dipanggil metode dalam `Arithmatic` untuk melakukan pertambahan atau pengurangan.

### OddEven
Kelas ini akan menambahkan dua variabel kemudian hasilnya akan dicek apakah merupakan bilangan ganji atau genap. `OddEven` akan dipanggil dalam kelas `Main` kemudian metode dalam `OddEven` akan dijalankan
sehingga variabel yang dijumlahkan akan dicek apakah termasuk ganjil atau genap.

### MakeTriangle
Kelas ini berdiri sendiri, sehingga tidak dipanggil oleh `Main`. Pada kelas ini, digunakan `Scanner` untuk memasukan nilai ukuran segitiga yang akan dibuat. Selanjutnya berdasarkan ukuran tersebut, dilakukan
perulangan `for loop` sehingga dalam membuat segitiga akan dilakukan secara otomatis.

### ThreeNotTwo
Kelas ini menggunakan constructor untuk menyimpan data secara sementara menggunakan `this` kemudian digunakan method `three` untuk melakukan perulangan sesuai dengan n yang dimasukkan. Perulangan tersebut menggunakan `while` dan kondisi dicek menggunakan `if` memastikan nilai yang keluar habis dibagi 3 dan tidak habis dibagi 2. Kelas `ThreeNotTwo` sendiri akan dipanggil oleh kelas `Main` seperti pada kelas lainnya.

### UlangTambah
Kelas ini akan menghitung jumlah deret sesuai dengan masukan nilai n oleh pengguna. Dengan perulangan `for loop` dapat kita
set kondisi yang sesuai dengan kebutuhan, yaitu tidak melebihi nilai n dalam perulangannya. Kemudian untuk menambahkan setiap
bilangan yang diulang digunakan operator `+=` untuk menambahkan nilai sebelumnya dengan nilai baru yang didapat.
