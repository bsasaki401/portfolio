import java.util.*;

public class RpsGame1 {
	static int myNumber, opponentsNumber;
	static String[] hand = {"グー", "チョキ", "パー"};
	static String[] result = {"<<<あいこです>>>", "<<<あなたの負けです>>>", "<<<あなたの勝ちです>>>>"};
	
	public static void main(String[] args) {
		System.out.println("<じゃんけんゲーム>");
		System.out.println("さいしょはグー！じゃんけん...");
		System.out.print("1.グー 2.チョキ 3.パー ---> ");
		My();
		Opponents();
		Result();
	}
	//自分の手を入力するメソッド
	static void My() { 
		while(true) {
			myNumber = new Scanner(System.in).nextInt() - 1;
			//1,2,3以外の数字を入力された時のアラート表示
			if(0 <= myNumber && myNumber <= 2) {
				break;
			} else {
				System.out.println("\n※ 1~3の数字を入力してください。");
				System.out.print("1.グー 2.チョキ 3.パー ---> ");
			}
		}
		System.out.println("ポン！");
		System.out.println("あなたは「" + hand[myNumber] + "」を出しました");
	}
	//相手の手を乱数生成するメソッド
	static void Opponents() { 
		opponentsNumber = new Random().nextInt(3);
		System.out.println("相手は「" + hand[opponentsNumber] + "」を出しました");
	}
	//対戦結果を求めて表示するメソッド
	static void Result() { 
		int judge = (myNumber - opponentsNumber + 3) % 3;
		System.out.println(result[judge]);
	}
}