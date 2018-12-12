package question;
import java.util.Random;
import java.util.Scanner;
//4択を6問答えがrandomで出題順番もrandom
public class Main {

	public static void main(String[] args) {
		final int Amount = 6;
		int just = 0;
		int ans;
		int[] rad = new int[4]  ;
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		Tie tie = new Tie();
		Finish finish = new Finish();
		int i = 0;
		Quiz[] arr = new Quiz[Amount];


		arr[0] = new Quiz("次のうち陣の色が火水光の3色のモンスターはどれ？","人造人間18号","ヴェルド","フルフルネコ","ドット不知火舞", "ドット不知火舞") ;
		arr[1] = new Quiz("ガチャ限とスキル上げ素材の組み合わせで間違っているものはどれ？","アルキオネ/タウラス","アルレシャ/ピスケス","カストル/ジェミニ=ヨウ","アクベンス/キャンサー", "カストル/ジェミニ=ヨウ") ;
		arr[2] = new Quiz("他の3体とタイプが違うモンスターはどれ？","転生ミネルヴァ","転生ヴリトラ","転生イザナギ","転生オオクニヌシ", "転生イザナギ") ;
		arr[3] = new Quiz("富山の色彩・氷見うどんが持つ覚醒スキルは？","暗闇耐性","お邪魔耐性","毒耐性","バインド耐性", "毒耐性") ;
		arr[4] = new Quiz("レアガチャドラが持つランダムスキルで発動しないスキルは？","ギガグラビティ","チェンジ・ザ・ワールド","英龍の守り","威圧", "チェンジ・ザ・ワールド") ;
		arr[5] = new Quiz("次の降臨ダンジョンのうち最高難易度が違うものはどれ？", "ヘライース降臨", "ヨルズ降臨","ミオン降臨", "ハヌマーン降臨", "ミオン降臨");


		while(true) {

			System.out.println("第" + ++i + "問");
			just = rand.nextInt(Amount);

			System.out.println(arr[just].question);
			tie.tie(rad);

			System.out.println("1:" + arr[just].ques[rad[0]] + "\n2:" +  arr[just].ques[rad[1]] + "\n3:" + arr[just].ques[rad[2]] + "\n4:" + arr[just].ques[rad[3]] );
			System.out.print(">");

			ans = scanner.nextInt();

			if( arr[just].ques[rad[ans - 1]] == arr[just].answer ) {
				System.out.println("正解です。");
			}else {
				System.out.println("不正解です。");
			}
			if( finish.finish() == 1 ) {
				break;
			}

		}
	}
}