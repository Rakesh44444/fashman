package Testing_Pack;

import org.testng.annotations.Test;

import My_Flipkart_project.Pre_postconditions;

public class Test_case extends Pre_postconditions {
  @Test
  public void u() throws InterruptedException {
	  Scripting r= new Scripting();
	 
	  r.searching();
	  r.scrolling();
	  r.select();
	  r.changing_window();
  }
}
