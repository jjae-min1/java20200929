package Chap06.textbook.s061204.mycompany;

import Chap06.textbook.s061204.hankook.*;
import Chap06.textbook.s061204.hyundai.Engine;
import Chap06.textbook.s061204.kumho.*;


public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BidWidthTire tire2 = new BidWidthTire();
	
	Chap06.textbook.s061204.hankook.Tire tire3 = new Chap06.textbook.s061204.hankook.Tire();
	Chap06.textbook.s061204.kumho.Tire tire4 = new Chap06.textbook.s061204.kumho.Tire();
	//동일한 클래스명 존재시 임포트하였더라도 정확한 클래스경로를 다시 호출
}
