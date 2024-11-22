=== ทดสอบ zk บน spring Boot ===
- zkspringboot-starter version 3.2.1 ซึ่งใช้ ZK version 9.6.0 แต่ใช้ spring-boot-starter-web 3.2.11 ได้
- jdk 17
- ใช้ zul ร่วมกับ RestController เพื่อให้สร้าง api webservice ในตัว

  http://localhost:8080/ ได้ซึ่งเท่ากับเรียก http://localhost:8080/home.zul
  http://localhost:8080/home.zul   ผ่าน
  http://localhost:8080/home   ผ่าน ระบบจะมองไปที่ HomeCtl.java
  http://localhost:8080/menu.zul   ผ่าน 
  http://localhost:8080/menu   ผ่าน ระบบจะมองไปที่ MenuCtl.java
  http://localhost:8080/api/greeting  ผ่าน  เรียก api RestController
