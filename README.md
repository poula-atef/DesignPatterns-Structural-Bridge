# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Bridge Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي class ممكن ينموا في اتجاهين بنقسمه ل اتنين classes عشان يحصل نمو او تغيير لكل واحد فيهم بشكل منفصل عن التاني .. علي سبيل المثال الموجود في ال application وهو اننا فصلنا ال shape عن ال color و ده هيخلينا قادرين نزود
لون او شكل جديد بدون ما الطرف الاخر يتأثر (قبل الفصل لو عوزنا نزود shape ده هيخلينا نعمل class منه لكل color او لو زودنا color هنعوز نزود class لكل shape).
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال package بتاعت ال painters:
    - ال Painter Interface و ده فيه ال methods اللي المفروض تبقي في اي Painter
    - ال RedPainter Class و ده بيعمل Paint لاي شكل باللون الاحمر
    - ال BluePainter Class و ده بيعمل Paint لاي شكل باللون الازرق
  - ال package بتاعت ال shapes:
    - ال Circle Class و ده بيعمل extend لل Shape Class
    - ال Square Class و ده بيعمل extend لل Shape Class
