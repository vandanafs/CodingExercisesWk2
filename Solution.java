import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {


  public static void main ( String[] args ) {
         Solution s1=new Solution();
         //s1.soln1();
        // s1.soln2();
        // s1.soln3();
//       s1.soln4();
//      s1.soln5();
//      s1.soln6();
      //s1.soln7();
     // s1.soln8();
//      s1.soln9();
//      s1.soln11();
//      s1.soln12();
    //  s1.soln13();
    //  s1.soln14();
//      System.out.println(soln15(new Fish()));
//      System.out.println(soln15("ANimal test"));
//      s1.soln16();
//      s1.soln17();
     // s1.soln18();
     // s1.soln19();
     // s1.soln20();
      s1.soln21();
      s1.soln22();
  }
  // use this method as a prototype for your answers...
 void soln1() {
  // and put your code here.
    //loop from 100 to 5 by 5. print index var.
    for(int i=100;i>=5; i-=5){
      System.out.println(i);
    }
  }
  
  void soln2() {
  for (int i=100; i>=5; i-=5){
  }
  }
  
  void soln3() {
  // and put your code here.
    int sum=0;
    for(int i=9;i<=17;i++){
          sum+=i;
    }
    System.out.println("sum of the integers from 9 to 17 :"+sum);
  }
  
  void soln4() {
    //find smallest
         int[] a={9,5,6,3,8,2,4};
          int smallest=a[0];
         for (int i=1; i<a.length; i++){
               smallest= Math.min(smallest, a[i]);
         }
    System.out.println("smallest number is :"+smallest);
  }

    void soln4_1() {
        //find smallest
        int[] a={9,5,6,3,8,2,4};
        int smallest=a[0];
        for (int i=1; i<a.length; i++){
                 if(a[i]<smallest){
                     smallest=a[i];
                 }
        }
        System.out.println("smallest number is :"+smallest);
    }

    void soln4_2() {
        //find largest
        double max=Double.NEGATIVE_INFINITY;
        int[] a={9,5,6,3,8,2,4};
        for(int i=0; i<a.length; i++){
           if( a[i]>max){
               max=a[i];
           }

        }
  }
    void soln5() {
  // largest array
        int [] a = {9, 5, 6, 3, 8, 2, 4};
        int largest=a[0];
        for(int i=1; i< a.length;i++){
             if( a[i]>largest){
                  largest=a[i];
             }
        }
        System.out.println("largest number of array:"+largest);

  }
  
  void soln6() {
      // print index of first true element in an array of
      boolean[] a = {false, false, false, true, false};

      for (int i = 0; i < a.length; i++) {
          if (a[i] == true) {
              System.out.println("first index:" + i);
              break;
          }
      }
  }
  void soln7() {
  // print index of first true element in an array of booleans (must use a while loop)
          boolean[] a ={false, false, false, true, false};
      int i=0;
          while(i<a.length){

              if(a[i]==true){

                  System.out.println("index:"+i);
                  break;
              }
              i++;
          }

      }
  
  void soln8() {
  //add 5 to every element of an array of integers
      int[] a = {9, 5, 6, 3, 8, 2, 4};
      for( int i=0; i<a.length;i++){
         a[i]= a[i]+5 ;
      }
      System.out.println("added 5 to every element :"+ Arrays.toString(a));
  }
  
  void soln9() {
  //divide each element of an array by 1.3;
      double[] a = {0.5, 1.4, 6.7, 123.4 -34.6};
//       double d=0.0;
//      for(   double  d:a){
//           d=(d/1.3);
//          System.out.println(d);
//      }
//      System.out.println(Arrays.toString(d));
//

      for( int i=0; i<a.length;i++){
          a[i]= a[i]/1.3 ;
      }
      System.out.println("Divide:"+ Arrays.toString(a));
  }
  
  void soln10() {
  // raise each element of a double array to it's 3rd power and
      // subtract the original element's value by the value divided by 3.0
      double[] a = {1.3, 5.4, 6.1, 1.0, 9.2};
      for(int i=0;i<a.length;i++){
        //  =Math.pow(a[i],3)
      }

  }
  
  void soln11() {
  // zero out a 4 by 6 integer array
      int [][] fourBySix=new int [4][6];
      System.out.println(fourBySix.length);
      for(int i=0;i<fourBySix.length;i++){
          for(int j=0;j<fourBySix.length;j++){
                 fourBySix[i][j]=0;
              //System.out.println("test-->"+fourBySix[i][j]);
          }
      }
      System.out.println("Elements by zero:"+Arrays.deepToString(fourBySix));


  }
  
  static void soln12() {
  // multiply each element of a 5 by 5 array of integers by 7
      int[][] a=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
              for(int i=0;i<a.length;i++){
                  for(int j=0; j<a.length;j++){
                        a[i][j]=a[i][j]*7;
                  }
              }
      System.out.println("test 5*5:"+Arrays.deepToString(a));


  }
  
  void soln13() {
      // create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans.
      // each element in the result should be true if the value in the argument array is even,
      // else it's false.
      boolean[][] bol = new boolean[5][5];
      //soln12();
      int[][] a = new int[][]{
              {2, 1, 4, 1, 6},
              {1, 1, 1, 1, 1},
              {2, 1, 4, 1, 6},
              {1, 1, 1, 1, 1},
              {2, 1, 4, 1, 6}};
      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a.length; j++) {
              bol[i][j]=a[i][j]%2==0;
//              if (a[i][j] % 2 == 0) {     //these 2 lines can be axchieved ion 1 line
//                  bol[i][j] = true;
//              }
          }
      }
      System.out.println("test 5*5:"+Arrays.deepToString(bol));
  }
  
  void soln14() {
  //create a method that takes two doubles and returns the first parameter
      // raised to the second parameter's value
      double a=2.0;
      double b=3.0;
     double res=0.0;
      System.out.println(res= Math.pow(a,b));
      System.out.println(a);

  }
  
  static boolean soln15(Object j) {
  // create a method that returns a boolean if the Object passed to it is a Fish or not
      return (j.getClass().equals(Fish.class));

  }
  
  static void soln16() {
  // There is an object x which has a method (double)Balance(). Build an IF statement that prints
      // "Paid Off" if the result of the balance call is less than of equal to 1.0, else it
      // prints the balance as a Dollar figure (2 decimal places)
      X test = new X(10);
      X test2 = new X(.5);
      test.getBalance();
      test2.getBalance();
  }





  void soln17() {
  // Build a WHILE loop that turns on the heat if the thermo.getTemp()
      // is less than 72.0 else it turns on the A/C if thermo.getTemp() is greater that 76.0.
      boolean heatOn=false;
      boolean acOn=false;

  while(true){

      double temp=Math.round(Math.random()*100+1);
      System.out.println("random:"+temp);
      if(temp<72){
          heatOn=true;
          acOn=false;
          System.out.println("Heater status:"+heatOn);
          break;

      }
      else if(temp>72){
          heatOn=false;
          acOn=true;
          System.out.println("Ac status On:"+acOn);
          break;
      }
  }




  }
  
  void soln18() {
  // Find a number greater than Pi in a double array, print number and its index.
      double[] dou={2.0,3.0,4.4,5.78,8};
      double PI=3.14;
      for(int i=0;i<dou.length;i++){
          if(dou[i]>PI){
              System.out.println("Index:"+i+"value-->"+dou[i]);
          }
      }
  }
  
  void soln19() {
  //Given an array of objects (of class Xaction) w/nulls, sum all the values '
      // of the objects in the array, using Xaction::getValue(). Print the sum.
      int sum = 0;
      HashMap<Integer, Integer> nums = new HashMap<>();
      nums.put(0, null);
      nums.put(1, 4);
      nums.put(2, 5);
      nums.put(3, null);

      nums.values().removeAll(Collections.singleton(null));


      for (int s : nums.values()) {
          sum += s;
      }

      System.out.println(sum);


  }
  
  void soln20() {
  // reverse an array of objects of type Xaction
      Integer [] array={1,2,3,4,5,6};
      List<Integer> list = Arrays.asList(array);
      Collections.reverse(list);
      System.out.println(list);

  }
  
  void soln21() {
  // Print a 5's times table
      for(int i=1;i<=20;i++){
          System.out.println(5+"x"+""+i+"="+(5*i));
      }
  }
  
  void soln22() {
  // detemine the hypotenuse of a 9 by 7 right triangle, assign it to a double
double hypotenuse;
double result;
double a=9;
double b=7;

result =Math.pow(a,2)+Math.pow(b,2);
hypotenuse=Math.sqrt(result);
      System.out.println(hypotenuse);
  }

  static class Fish{
      String name;
      int fId;
  }
    public static class X {
        public double balance = 0;

        public X(double b) {
            this.balance = b;
        }

        public void getBalance() {
            if (this.balance <= 1) {
                System.out.println("Paid Off");
            } else {
                System.out.printf("%.2f \n", balance);
            }
        }
    }


}
