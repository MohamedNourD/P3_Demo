# جامعة دمشق - كلية الهندسة المعلوماتية  
## قسم هندسة البرمجيات ونظم المعلومات  
## JAVA PROJECT IN UNIVERSITY
### الوظيفة الفصلية لمقرر البرمجة /3/  
(نظامي وحملة)  

## تطبيق إدارة طلبات الزبائن للوجبات  
### المقدمة  
يهدف هذا المشروع إلى تطوير نظام متكامل لإدارة الطلبات في مطعم، مما يتيح للزبائن تقديم طلباتهم للوجبات بطريقة بسيطة وسهلة من خلال واجهة رسومية تفاعلية.  

### المفاهيم المطلوبة  
على الطالب تصميم برنامج بلغة جافا، مع التركيز على تطبيق المفاهيم التالية:  
- **البرمجة الغرضية التوجه (Object-Oriented Programming):** استخدام مبادئ البرمجة الغرضية لتصميم النظام.  
- **تعدد المهام (Multithreading):** تنفيذ مهام متعددة في وقت واحد لتحسين أداء النظام.  
- **المجموعات (Collections):** استخدام هياكل البيانات المناسبة لإدارة الطلبات والمعلومات ذات الصلة.  
- **الإدخال والإخراج (I/O):** التعامل مع البيانات المدخلة والمخرجة بشكل فعال.  
- **مكتبة Swing:** تصميم واجهة المستخدم باستخدام مكتبة Swing لتوفير تجربة مستخدم سلسة.  
- **معالجة الاستثناءات:** ضمان معالجة جميع الاستثناءات المحتملة لضمان استقرار النظام وكفاءته.  

[رابط استبيان الوظيفة](https://docs.google.com/forms/d/e/1FAIpQLSdIcJFBSfNChZ3geqja3NEEYpsTuUxjauBuFYn08ktmKsSX8w/viewform?usp=sf_link)  

---

## المتطلبات الرئيسية  
### متطلبات واجهة المستخدم  
يجب أن تتضمن الواجهة الرسومية للنظام نموذجًا متكاملاً لتسجيل الطلبات من قبل الزبائن، بحيث توفر الخصائص التالية:

####  نموذج تسجيل الطلبات:  
- إمكانية اختيار وجبة أو أكثر من قائمة الطعام.  
- عرض مكونات كل وجبة بشكل واضح، مع توضيح السعر لكل منها.  

#### . اختيار نوع الطلب:  
توفير خيارات متعددة لنوع الطلب، مثل:  
- طلبات داخل المطعم.  
- طلبات توصيل.  
- طلبات خاصة أو غير ذلك.  

#### . معالجة كل نوع طلب بما يتناسب معه، مثل:  
- إرسال إشعار للزبون.  
- إضافة إكرامية (tip) على السعر الإجمالي.  

#### . حفظ الطلبات:  
- إمكانية حفظ تفاصيل الطلبات عند التسليم في ملف، لضمان توثيق المعلومات واسترجاعها لاحقًا.  

#### . عرض الطلبات الحالية:  
- يجب أن يتمكن الموظف من عرض جميع الطلبات الحالية مع توضيح حالة كل طلب (مثل: قيد التحضير، تم التسليم، ملغي).  

#### . التعامل مع الأخطاء:  
- يجب أن يتضمن النظام آليات للتعامل مع الأخطاء، مثل:  
  - إدخال بيانات غير صحيحة (مثل عدم وجود وجبة في القائمة).  
  - غياب الوجبات المطلوبة.  
  - جميع الأخطاء الممكنة.  
- توفير رسائل توضيحية للمستخدم حول الأخطاء وكيفية تصحيحها.  

#### . إرسال إشعارات بحالة الطلب:  
- يجب أن يتم إرسال إشعارات للزبائن حول حالة طلباتهم، مثل:  
  - "قيد التحضير"  
  - "تم التسليم"  
  - "تم إلغاء الطلب"  
- يمكن استخدام إشعارات فورية أو رسائل نصية.  

#### . إنشاء تقارير:  
- يجب أن يتضمن النظام إمكانية إنشاء تقارير مفصلة، مثل:  
  - عدد الطلبات اليومية.  
  - الطلب الأكثر طلبًا.  
  - العائدات اليومية.  
  - الزبون الدائم على المطعم.  
- يجب عرض هذه التقارير ضمن واجهة مناسبة وسهلة الاستخدام.  

#### . إدارة قائمة الوجبات:  
- يجب أن يتمكن الموظف من إضافة، تعديل، أو حذف الوجبات من القائمة بسهولة، مع التأكد من تحديث النظام بشكل فوري.  

---

## المتطلبات الإضافية  
- **نظام تسجيل الدخول:**  
  إضافة طبقة أمان باستخدام نظام إدارة المستخدمين وكلمات المرور والصلاحيات (مثل السماح للموظفين بإدارة الطلبات وللمدير بالتعديل على الوجبات أو غير ذلك).  
- **التعامل مع المدفوعات:**  
  توفير واجهة بسيطة لقبول المدفوعات (مثل الدفع نقدًا أو عبر بطاقات الائتمان).  
- **تحسين الجماليات:**  
  توفير تصميم جمالي للتطبيق.  
