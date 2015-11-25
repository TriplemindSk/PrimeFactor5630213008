100 >> 2x2x5x5

35 >> 7x5

15 >> 3x5

315 >> 3x3x5x7


ชอบวิธีการเรียกใช้งาน class แบบนี้(ไม่ใช้ static method พรำ่เพรื่อ)

ชื่อ class, โดยเฉพาะ method ไม่สื่อ

    Prime => PrimeFactor
    
    PrimeNumber => generate
    
    getPrime => printPrimeFactor

ชื่อ package ควรจะเป็นไปตาม java convention(camel case ขึ้นต้นด้วยตัวเล็ก)

การทำงานที่ซำ้ซ้อนกันระหว่าง PrimeNumber กับ getPrime ทำไมต้องเช็คอีกรอบว่า

ค่าที่อยู่ใน factor.get(k) หาร number ลงตัวทั้งๆที่รู้อยู่แล้ว

getPrime น่าจะรับ ArrayList<Integer> factor ผ่าน parameter เลย

PrimeNumber จะได้ return ค่าที่เป็น ArrayList<Integer> factor

แทนที่จะฝากค่าไว้ที่ class variable

Scanner sc = new Scanner(System.in) ประกาศทำไม่ไม่ได้ใช้

สรุปอยู่ที่ https://github.com/zyracuze/git101PSU/tree/master/PrimeFactor
