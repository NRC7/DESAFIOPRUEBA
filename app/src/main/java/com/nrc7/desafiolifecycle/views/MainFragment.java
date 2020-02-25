package com.nrc7.desafiolifecycle.views;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nrc7.desafiolifecycle.R;
import com.nrc7.desafiolifecycle.services.GetQuestions;
import com.nrc7.desafiolifecycle.models.Question;
import com.squareup.picasso.Picasso;

import java.util.List;


public class MainFragment extends Fragment {

    private List<Question> questions = new GetQuestions().getQuestionList();
    private Question question = questions.get(7);


    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.fragmentImageView);
        putImageFromUrl(imageView);

        TextView textView = view.findViewById(R.id.questionTv);
        textView.setText(getRandomQuestion(question));

        TextView rightAns = view.findViewById(R.id.rightAnswerTV);
        rightAns.setText(getRightAnswers(question));
        rightAns.setOnClickListener(v -> Toast.makeText(getActivity(), "CORRECTO!!", Toast.LENGTH_SHORT).show());

        TextView wrongAns = view.findViewById(R.id.wrongAnswerTV);
        wrongAns.setText(getWrongAnswers(question));
        wrongAns.setOnClickListener(v -> Toast.makeText(getActivity(), "INCORRECTO!!", Toast.LENGTH_SHORT).show());
    }

    private void putImageFromUrl(ImageView iv) {
        Picasso.get()
                .load("https://blog.desafiolatam.com/wp-content/uploads/2015/03/desafio-latam-logonegro.png")
                .into(iv);
    }

    private String getRandomQuestion(Question question) {
        return question.getQuestion().replace("&quot;", "'");
    }

    private String getRightAnswers(Question question) {
        return question.getCorrect_answer();
    }

    private String getWrongAnswers(Question question) {
        return question.getIncorrect_answers()[1];
    }
}
