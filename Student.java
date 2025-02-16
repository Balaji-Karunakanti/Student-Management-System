class Student {
   private int roll_no;
   private String name;
   private int age;
   private String grade;

   // assigning student details
   public Student(int roll_no, String name, int age, String grade) {
      this.roll_no = roll_no;
      this.name = name;
      if (age > 0) {
         this.age = age;
      } else {
         System.out.println("Invalid! Age default set to 0");
         this.age = 0;
      }
      this.grade = grade;
   }

   // to access the private variables
   public int getRoll_no() {
      return roll_no;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   public String getGrade() {
      return grade;
   }

   // to update the previous variables
   public void setName(String name) {
      this.name = name;
   }

   public void setAge(int age) {
      if (age > 0) {
         this.age = age;
      } else {
         System.out.println("Invalid");
      }
   }

   public void setGrade(String grade) {
      this.grade = grade;
   }

   public void displayStudent() {
      System.out.println("Student details");
      System.out.println("Roll No:" + roll_no);
      System.out.println("Name Of the Student:" + name);
      System.out.println("Age:" + age);
      System.out.println("Grade:" + grade);

   }
}