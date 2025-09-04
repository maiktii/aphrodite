## 🧠 **Pre-Test Backend Engineer (Java, OOP, Spring Boot)**

---

### 🔸 **A. Pilihan Ganda (5 Soal)**

1. Apa yang menjadi tanggung jawab utama seorang Backend Engineer?

   - A. Mendesain UI
   - **B. Mengelola logika aplikasi dan komunikasi data dengan database** 
   - C. Membuat animasi
   - D. Membuat desain grafis

2. Dalam OOP Java, konsep **encapsulation** berarti:

   - **A. Menyembunyikan detail implementasi dan menyediakan akses lewat method**
   - B. Mewarisi method dari class lain
   - C. Menambahkan method ke dalam class
   - D. Menghubungkan dua class yang berbeda

3. `@Autowired` pada Spring Boot digunakan untuk:

   - A. Menjalankan program utama
   - B. Menyimpan konfigurasi properties
   - **C. Meng-inject dependency otomatis ke dalam bean**
   - D. Mendaftarkan endpoint baru

4. Mengapa sebaiknya logika bisnis diletakkan di service layer?

   - **A. Agar controller lebih ringan dan fokus pada request/response**
   - B. Agar lebih cepat dalam compile
   - C. Karena controller tidak mendukung operasi logika
   - D. Agar dapat digunakan langsung tanpa testing

5. Di bawah ini adalah cara yang benar membuat endpoint di Spring Boot:

   - A. `@Route("/api")`
   - B. `@Mapping("/api")`
   - **C. `@GetMapping("/api")`**
   - D. `@WebRoute("/api")`

---

### 🔸 **B. True / False (5 Soal)**

6. Dalam arsitektur backend, service biasanya dipanggil langsung dari frontend.**(FALSE)**
7. Constructor Injection adalah cara yang direkomendasikan untuk dependency injection di Spring. **(TRUE)**
8. `@Service` digunakan untuk menandai sebuah class sebagai penyedia logika bisnis. **(TRUE)**
9. Semua logika bisa ditaruh dalam controller agar tidak perlu membuat banyak file. **(FALSE)**
10. Spring Boot memerlukan `main()` method untuk menjalankan aplikasinya. **(TRUE)**

---

### 🔸 **C. Jawaban Singkat Penjelasan (10 Soal)**

11. Jelaskan apa itu Backend dan bagaimana perannya dalam aplikasi.
Answer : **Backend adalah komponen dari arsitektur perngkat lunak yang bertanggung jawab untuk mengelola logika bisnis, database, autentikasi, dan komunikasi antara server dan client**
12. Apa perbedaan antara class dan object dalam Java?
Answer : **Class digunakan untuk membuat object sedangkan object adalah bagian dari class**
13. Sebutkan dan jelaskan 2 prinsip OOP lainnya selain encapsulation. 
Answer : **(INHERITANCE & INTERFACE)**
14. Mengapa kita menggunakan annotation `@RestController`?
Answer : **Tag yang berguna sebagai pendanda sebuah class adalah controller yang menangani HTTP request dan mengembalikan berupa response JSON atau XML**
15. Apa keuntungan menggunakan Spring Boot dibanding membuat server dari nol di Java?
Answer : **Lebih memudahkan karena seperti diberikan template untuk melakukan code**
16. Jelaskan cara kerja dependency injection di Spring Boot secara sederhana.
Answer : **memasukkan beberapa dependency kedalam class sehingga pemanggilan bisa otomatis**
17. Apa manfaat memisahkan controller dan service dalam arsitektur aplikasi?
Answer : **memisahkan logic sehingga lebih mudah untuk melakukan debug**
18. Jelaskan apa yang terjadi jika Anda tidak menambahkan `@Service` pada class yang berisi logika.
Answer : **Springboot tidak mampu mendeteksi apakah class tersebut sebagai sebuah service yang berarti untuk beberapa constructor yang sudah disetup tidak akan dapat dipanggil**
19. Apa itu `@RequestParam` dan kapan digunakan?
Answer : **Untuk mengambil nilai dari parameter query dalam URL request HTTP**
20. Bagaimana cara menghubungkan controller ke service menggunakan constructor?
Answer : **Setup class @Service, setup class controller dan panggil @Service tag untuk mendapatkan service object yang ada di class service**

---

### 🔸 **D. Koreksi Kode (5 Soal)**

> Jelaskan kesalahan dan berikan versi yang benar.

21.

```java
@RestController
//Panggil Servicenya
@Service
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello(); // error
    }
}
```

22.

```java
public class Person {
    public String name;

    //Menghilangkan void sehingga value dari name bisa dikembalikan
    public Person(String name) {
        this.name = name;
    }
}
```

23.

```java
@RestController
public class GreetController {
    @PostMapping("/greet")
    //Tipe data request belum ada
    public String greet(@RequestBody String name) {
        return "Hello, " + name;
    }
}
```

24.

```java
@Service
public class InfoService {
    public String getInfo() {
        return "Info OK";
    }
}

// controller
@RestController
public class InfoController {

    //tambahkan construction injection
    private final InfoService infoservice;

   
    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }


    @GetMapping("/info")
    public String get() {
        // InfoService info = new InfoService(); -> hilangkan ini
        return infoService.getInfo();
    }
}
```

25.

```java
@RestController
public class MathController {
    @GetMapping("/add")
    //tambahkan @RequestParam
    public int addNumbers(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
```
