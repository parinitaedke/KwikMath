package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game_page extends AppCompatActivity {

    private String question;
    private double correctAnswer;
    private List<String> operators = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
    private int numCorrect = 0;
    private int numIncorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);
        setQuestion();


    }
    public void setQuestion(){
        String createdQuestion = createQuestion();
        displayQuestion(createdQuestion);
    }
    private String createQuestion() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        int randomNum = (int) (Math.random() * (operators.size() - 1));
        String operation = operators.get(randomNum);

        switch (operation){

            case "+":
                correctAnswer=a+b;
                break;
            case "-":
                correctAnswer=a-b;
                break;
            case "*":
                correctAnswer=a*b;
                break;
            case "/":
                correctAnswer=a/b;
                break;
        }

        question = a + operation + b;
        return question;

    }

    private void displayQuestion(String question) {
        TextView quantityTextView = findViewById(R.id.question_text_view);
        quantityTextView.setText(question);
    }

    private void updateCorrectAnswers() {
        TextView correctAnswerTextView = findViewById(R.id.correct);
        numCorrect += 1;
        correctAnswerTextView.setText("Correct: " + numCorrect);
    }

    private void updateIncorrectAnswers() {
        TextView quantityTextView = findViewById(R.id.incorrect);
        numIncorrect += 1;
        quantityTextView.setText("Incorrect: " +numIncorrect);
    }

    public void evaluateAnswer(View view){
        EditText editText = findViewById(R.id.answer_view);

        String answer = editText.getText().toString();
        try {
            Integer.parseInt(answer);
            boolean rightAnswer = Integer.parseInt(answer) == correctAnswer;
            System.out.println(rightAnswer);

            if (rightAnswer){
                updateCorrectAnswers();
            } else {updateIncorrectAnswers();}

            setQuestion();
        } catch (NumberFormatException e) {
            System.out.println("Wrong");
        }

    }

}
