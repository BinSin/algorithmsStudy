package homework;

class Actor {
	private String name;
	
	Actor(String name) {
		this.name = name;
	}
	// �׼ǹ�찡 ������ �ϴ��� ������ش�.
	public void acting() {
		System.out.println("��� " + name + "�� �����մϴ�.");
	}
	// name ������ ��ȣ�ϰ� ������ش�.
	public String getName() {
		return name;
	}	
}

class ActionActor extends Actor {
	private String action;
	
	ActionActor(String name, String action) {
		// �θ� Ŭ���� ȣ��
		super(name);
		this.action = action;
	}
	
	// super�� �θ� Ŭ������ name �ҷ��´�.
	// ��찡 ������ �����ϴ��� ������ش�.
	public void practing() {
		System.out.println("�׼ǹ�� " + super.getName() + "�� " + action + "�� �����մϴ�.");
	}
	// super�� �θ� Ŭ������ name �ҷ��´�.
	// �׼ǹ�찡 ������ �ϴ��� ������ش�.
	public void acting() {
		System.out.println("�׼ǹ�� " + super.getName() + "�� �׼� �����մϴ�.");
	}
	// action ������ ��ȣ�ϰ� ������ش�.
	public String getAction() {
		return action;
	}	
}

class Director {
	// actors : ����
	// actors_number : ����
	private Actor[] actors = new Actor[5];
	private int actors_number = 0;
	
	// ĳ���� �� ������ actors �迭�� �ְ� �� �ε��� ���� �ø���.
	public void cast(String name) {
		actors[actors_number] = new Actor(name);
		actors_number++;
	}
	// �׼ǹ���� ��� ActionActor �����ڸ� ȣ���Ͽ� �ִ´�.
	public void cast(String name, String action) {
		actors[actors_number] = new ActionActor(name, action);
		actors_number++;
	}
	// Actor ������ ������ �ٷ� �迭�� �ִ´�.
	public void cast(Actor actor) {
		actors[actors_number] = actor;
		actors_number++;
	}
	// ����� ���� acting�� ȣ���ϰ� �׼ǹ���� ��쿣
	// �ٿ�ĳ������ �Ͽ� practing�� ȣ���Ѵ�.
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
		Actor a = new Actor("���켺");
		Actor b = new ActionActor("���¹�", "��������");
		// ���켺 ĳ����
		d.cast(a);
		// ���¹� ĳ����
		d.cast(b);
		// �Ϲݹ�� ������ ĳ����
		d.cast("������");
		// ������ Ư�⸦ ���� �׼ǹ�� ��ȿ�� ĳ����
		d.cast("��ȿ��", "������");
		// �����ϴ� ��� ȣ��
		// �����ϴ� �޼ҵ�
		d.direct();
	}
}
