print("=====KALKULATOR DENGAN DEF FUNCTION & PERCABANGAN=====")
import time

pengulangan = 3

for x in range (pengulangan): #range() adalah sebuah fungsi serbaguna yang gunanya untuk menciptakan sebuah list yang terdiri dari angka.
  def fungsi_hitung(angka1, angka2, operator):
    if operator == '+':
      return angka1 + angka2
    elif operator == '-':
      return angka1 - angka2
    elif operator == '*':
      return angka1 * angka2
    elif operator == '/':
      return angka1 / angka2
    elif operator == '%':
        return angka1 % angka2
    else:
      print('Salah')
      return 'Ulangi Lagi...'

  print('Masukkan angka pertama: ')
  angka1 = float(input())
  print('Masukkan angka kedua: ')
  angka2 = float(input())
  print('Pilih operator *, /, -, +, atau %?')
  operator = input()
  hasil = fungsi_hitung(angka1, angka2, operator)
  print("Hasilnya adalah ", hasil)
  print(30*("="))
time.sleep(2)
