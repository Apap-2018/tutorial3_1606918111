# tutorial3_1606918111
Membuat controller dan fungsi add
4. localhost:8080/pilot/add?id=1&licenseNumber=1234&name=Jono&flyHour=20
Pertanyaan 1​: apakah hasilnya? Jika error, tuliskan penjelasan Anda.
Muncul "Data Berhasil Disimpan"

localhost:8080/pilot/add?id=1&licenseNumber=1234&name=Jono
Pertanyaan 2: ​apakah hasilnya? Jika error, tuliskan penjelasan Anda
ERROR 400 karena method add pada controller membutuhkan parameter flyHour


Method View by licenseNumber
3. localhost:8080/pilot/add?id=1&licenseNumber=1234&name=Jono&flyHour=20
localhost:8080/pilot/view?licenseNumber=1234
Pertanyaan 3​: apakah data Pilot tersebut muncul? Jika tidak, mengapa? ya muncul

4. localhost:8080/pilot/view?licenseNumber=1234
Pertanyaan 4​: apakah data Pilot tersebut muncul? Jika tidak, mengapa? tidak karena data tidak disimpan di dalam database

Method View All
3. Jalankan program dan buka
localhost:8080/pilot/add?id=1&licenseNumber=1234&name=Jono&flyHour=20
localhost:8080/pilot/viewall
Pertanyaan 5​: apakah data Pilot tersebut muncul? muncul

4.Coba tambahkan data Pilot lainnya dengan data yang berbeda, lalu buka
localhost:8080/pilot/viewall
Pertanyaan 6​: Apakah semua data Pilot muncul? muncul


