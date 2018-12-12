package question;

public class Quiz {
	String question;//質問文
	String ques[] = new String[4];//答えの文章
	String answer;

//質問と答えのコンストラクタ
	public Quiz( String question, String answer1, String answer2, String answer3, String answer4 , String answer ) {
		this.question = question;
		this.ques[0] = answer1;
		this.ques[1] = answer2;
		this.ques[2] = answer3;
		this.ques[3] = answer4;
		this.answer = answer;
	}
}

