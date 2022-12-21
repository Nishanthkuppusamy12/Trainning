package MockInterviewQuestuions;

interface Permission {

}

class Demo2 implements Permission {

	void show() {
		System.out.println("hello");
	}
}
public class Dummyinter {
		public static void main(String[] args) {
			Demo2 d = new Demo2();
			if (d instanceof Permission) {
				d.show();
			} else
				System.out.println(" Does not give permission ");
		}

	}
