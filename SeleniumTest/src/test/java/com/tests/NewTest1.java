package com.tests;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority = 1)
  public void f() {
	  System.out.println("Actual");
	  
  }
  @Test(priority = 2) 
  public void abc() {
	  System.out.println("Event");
	  
	  
  }
}
