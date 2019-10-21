package QuizCard;

public class QuizCard {

	private String answer;
	private String question;

	public QuizCard(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return this.question;
	}
}