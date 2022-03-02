print("=====OBJECT ORIENTED PROGRAMMING with CLASS=====")

class buah:
    def __init__(self, warna, rasa, nama, harga):
        self.warna = warna
        self.rasa = rasa
        self.nama = nama
        self.harga = harga

buah1 = buah("Merah", "Manis", "Apel Merah", "40.000")
print("Nama buahnya:", buah1.nama)
print("Warnanya:", buah1.warna)
print("Rasanya:", buah1.rasa)
print("Harganya per kilo:", buah1.harga)



