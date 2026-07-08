class Course{
  int cId=101;
  String cName="Java";
  int dur=6;
 public void displayFaculty(){
  int fId=11;
  String fName="Swapnil";
  System.out.println(" Faclulty Info: \n Id: "+fId+" \n Name: "+fName);
  }
 public void displayCourse(){
  Course cd=new Course();
  System.out.println("Course Info: \n Name: "+cd.cName+" \n Course Name: "+cd.cName+" \n Dur: "+cd.dur);

 }
 
 public static void main(String []args){
  Course c=new Course();
  c.displayFaculty();
  c.displayCourse();
 }

}