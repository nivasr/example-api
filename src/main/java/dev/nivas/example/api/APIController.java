package dev.nivas.example.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.nivas.example.api.data.QuestionAnswerData;
import dev.nivas.example.api.service.AnswerService;

@RestController
public class APIController {
	
	@Autowired
	private AnswerService answerService;
	
	@GetMapping("/ask")
	public QuestionAnswerData ask(@RequestParam (value="question", defaultValue="help") String question) {
		
		QuestionAnswerData questionAnswerData = new QuestionAnswerData();
		questionAnswerData.setQuestion(question);
		
		questionAnswerData = answerService.getAnswer(questionAnswerData);
		
		return questionAnswerData;
	}
}
