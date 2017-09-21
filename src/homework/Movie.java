/*
 * Author : BinSin
 */

package homework;

class Actor {
	private String name;
	
	Actor(String name) {
		this.name = name;
	}
	// 액션배우가 무엇을 하는지 출력해준다.
	public void acting() {
		System.out.println("배우 " + name + "은 연기합니다.");
	}
	// name 변수를 보호하고 출력해준다.
	public String getName() {
		return name;
	}	
}

class ActionActor extends Actor {
	private String action;
	
	ActionActor(String name, String action) {
		// 부모 클래스 호출
		super(name);
		this.action = action;
	}
	
	// super로 부모 클래스의 name 불러온다.
	// 배우가 무엇을 연습하는지 출력해준다.
	public void practing() {
		System.out.println("액션배우 " + super.getName() + "은 " + action + "을 연습합니다.");
	}
	// super로 부모 클래스의 name 불러온다.
	// 액션배우가 무엇을 하는지 출력해준다.
	public void acting() {
		System.out.println("액션배우 " + super.getName() + "은 액션 연기합니다.");
	}
	// action 변수를 보호하고 출력해준다.
	public String getAction() {
		return action;
	}	
}

class Director {
	// actors : 배우들
	// actors_number : 배우수
	private Actor[] actors = new Actor[5];
	private int actors_number = 0;
	
	// 캐스팅 된 배우들을 actors 배열에 넣고 그 인덱스 값을 늘린다.
	public void cast(String name) {
		actors[actors_number] = new Actor(name);
		actors_number++;
	}
	// 액션배우일 경우 ActionActor 생성자를 호출하여 넣는다.
	public void cast(String name, String action) {
		actors[actors_number] = new ActionActor(name, action);
		actors_number++;
	}
	// Actor 변수가 들어오면 바로 배열에 넣는다.
	public void cast(Actor actor) {
		actors[actors_number] = actor;
		actors_number++;
	}
	// 배우일 경우는 acting만 호출하고 액션배우일 경우엔
	// 다운캐스팅을 하여 practing을 호출한다.
	public void direct() {
		for(int i=0; i<actors_number; i++) {
			if(actors[i] instanceof ActionActor) {
				((ActionActor)actors[i]).practing();
			}
			actors[i].acting();
		}
	}
}


public class Movie {
	
	public static void main(String[] args) {
		Director d = new Director();
		Actor a = new Actor("정우성");
		Actor b = new ActionActor("류승범", "돌려차기");
		// 정우성 캐스팅
		d.cast(a);
		// 류승범 캐스팅
		d.cast(b);
		// 일반배우 고현정 캐스팅
		d.cast("고현정");
		// 발차기 특기를 가진 액션배우 공효진 캐스팅
		d.cast("공효진", "발차기");
		// 감독하는 기능 호출
		// 감독하는 메소드
		d.direct();
	}
}
