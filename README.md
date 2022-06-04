# Bangkit_Android_Fundamental_1

## Pengantar
Anda sudah mempelajari komponen-komponen dasar Android pada modul Fundamental, seperti:

Navigasi perpindahan halaman aplikasi menggunakan Intent (Latihan Intent Explicit).
Menerapkan Parcelable untuk transaksi data antar Activity (Latihan Mengirim Data dengan Parcelable).
Latihan menerapkan RecyclerView dalam menampilkan data berbentuk list (Latihan RecyclerView) .
Membangun layout dengan menggunakan ConstraintLayout (Latihan ConstraintLayout).
Sebelum melangkah ke modul berikutnya, Anda perlu mengirimkan proyek aplikasi dengan tema GitHub User App terlebih dahulu. Aplikasi ini menampilkan daftar user yang ada di GitHub beserta detailnya. Data yang digunakan adalah data lokal yang bisa Anda dapatkan pada bagian Resources di bawah.



## Kriteria
Fitur yang harus ada pada aplikasi:

### List User
Syarat:
Menampilkan data pada halaman aplikasi dengan minimal jumlah 10 item.
Menggunakan RecyclerView untuk menampilkan data.
Menggunakan ConstraintLayout untuk menyusun tampilan List Item untuk RecyclerView.
Tidak terdapat nested hierarki (ViewGroup di dalam ViewGroup)
Setiap view memiliki constraint yang sesuai

### Detail User
Syarat:

Terdapat informasi detail dari seorang user. Berikut beberapa informasi yang wajib ditampilkan pada halaman aplikasi:
Username
Name
Avatar
Menggunakan Parcelable sebagai interface dari obyek data yang akan dikirimkan antar Activity.

## Berikut kerangka tampilan yang bisa Anda gunakan sebagai referensi:

![20200409170133cc4ad19d6ee72e638887210b1a2cb2d7](https://user-images.githubusercontent.com/61174498/171983476-408cac56-2468-402f-b8df-23555fa09edf.png)

## Anda dapat menerapkan beberapa saran di bawah ini untuk mendapatkan nilai tinggi, berikut sarannya:

### Menerapkan tampilan aplikasi yang sesuai standar:
Tampilan aplikasi memiliki width, height, margin, dan padding yang sesuai.
Pemilihan warna sesuai dengan tema aplikasi. 
Tidak ada komponen yang saling bertumpuk.
Penggunaan komponen yang sesuai dengan fungsinya.
Contoh : Komponen ImageView yang dijadikan sebagai button navigasi.

### Menuliskan kode dengan bersih.
Bersihkan comment dan kode yang tidak digunakan.
Indentasi yang sesuai.
Menghapus import yang tidak digunakan.

### Melengkapi halaman detail dengan informasi seperti berikut:
Follower
Following
Company
Location 
Repository

### Terdapat improvisasi fitur seperti (pilih satu): 
Splash screen yang sesuai dengan tema aplikasi.
Share
dsb.

### Membuat dan mengimplementasikan Style baru (Tuliskan penerapan style di kolom catatan). 

### Mengganti warna primary dan secondary brand pada Theme.
