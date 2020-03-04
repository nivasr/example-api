package dev.nivas.example.api.service;

import org.springframework.stereotype.Component;

import dev.nivas.example.api.data.QuestionAnswerData;

@Component
public class AnswerService {

	public QuestionAnswerData getAnswer(QuestionAnswerData questionAnswerData) {
		String question = questionAnswerData.getQuestion();
		String answer = complexLogicToGetAnswer(question);
		questionAnswerData.setAnswer(answer);
		return questionAnswerData;
	}
	
	private String complexLogicToGetAnswer(String question) {
		String answer = "Answer";
		return answer;
	}
}
