package project2;

import java.util.Scanner;

interface mainpage{
	
		public void display(dto rf1);
	}
class checker{
	
	
	
public static mainpage getselected(int type) {
	
	if(type==1) {
		
		mainpage mp2 = new signin1();
		return mp2;
	}
	
	else if(type==2) {
	mainpage mp3 = new login1();
	return mp3;
	}
	else if(type==3) {
	mainpage mp4 =new update();
	return mp4;
}
	return null;
}


}

