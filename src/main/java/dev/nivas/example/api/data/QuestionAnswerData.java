package dev.nivas.example.api.data;

public class QuestionAnswerData {

	private String question;
	private String answer;

	public String getQuestion() {
		return question;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Response [question=" + question + ", answer=" + answer + "]";
	}
	
	

}