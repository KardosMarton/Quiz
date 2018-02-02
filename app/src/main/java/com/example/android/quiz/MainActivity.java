package com.example.android.quiz;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String STATE_answer1a = "radio button state holder for Answer1a";
    static final String STATE_answer1b = "radio button state holder for Answer1b";
    static final String STATE_answer1c = "radio button state holder for Answer1c";
    static final String STATE_answer1d = "radio button state holder for Answer1d";

    static final String STATE_answer2a = "radio button state holder for Answer2a";
    static final String STATE_answer2b = "radio button state holder for Answer2b";
    static final String STATE_answer2c = "radio button state holder for Answer2c";
    static final String STATE_answer2d = "radio button state holder for Answer2d";

    static final String STATE_answer3 = "edit text state holder for AnswerBox03";

    static final String STATE_answer4a = "radio button state holder for Answer4a";
    static final String STATE_answer4b = "radio button state holder for Answer4b";
    static final String STATE_answer4c = "radio button state holder for Answer4c";

    static final String STATE_answer5a = "radio button state holder for Answer5a";
    static final String STATE_answer5b = "radio button state holder for Answer5b";
    static final String STATE_answer5c = "radio button state holder for Answer5c";

    static final String STATE_answer6a = "radio button state holder for Answer6a";
    static final String STATE_answer6b = "radio button state holder for Answer6b";
    static final String STATE_answer6c = "radio button state holder for Answer6c";
    static final String STATE_answer6d = "radio button state holder for Answer6d";

    static final String STATE_answer7a = "check box state holder for Answer7a";
    static final String STATE_answer7b = "check box state holder for Answer7b";
    static final String STATE_answer7c = "check box state holder for Answer7c";
    static final String STATE_answer7d = "check box state holder for Answer7d";
    static final String STATE_answer7e = "check box state holder for Answer7e";

    static final String STATE_answer8 = "edit text state holder for AnswerBox08";

    static final String STATE_answer9a = "check box state holder for Answer9a";
    static final String STATE_answer9b = "check box state holder for Answer9b";
    static final String STATE_answer9c = "check box state holder for Answer9c";
    static final String STATE_answer9d = "check box state holder for Answer9d";
    static final String STATE_answer9e = "check box state holder for Answer9e";

    static final String STATE_answer10a = "check box state holder for Answer10a";
    static final String STATE_answer10b = "check box state holder for Answer10b";
    static final String STATE_answer10c = "check box state holder for Answer10c";
    static final String STATE_answer10d = "check box state holder for Answer10d";
    static final String STATE_answer10e = "check box state holder for Answer10e";

    boolean answerOneA = false;
    boolean answerOneB = false;
    boolean answerOneC = false;
    boolean answerOneD = false;

    boolean answerTwoA = false;
    boolean answerTwoB = false;
    boolean answerTwoC = false;
    boolean answerTwoD = false;

    String answerThree = "";

    boolean answerFourA = false;
    boolean answerFourB = false;
    boolean answerFourC = false;

    boolean answerFiveA = false;
    boolean answerFiveB = false;
    boolean answerFiveC = false;

    boolean answerSixA = false;
    boolean answerSixB = false;
    boolean answerSixC = false;
    boolean answerSixD = false;

    boolean answerSevenA = false;
    boolean answerSevenB = false;
    boolean answerSevenC = false;
    boolean answerSevenD = false;
    boolean answerSevenE = false;

    String answerEight = "";

    boolean answerNineA = false;
    boolean answerNineB = false;
    boolean answerNineC = false;
    boolean answerNineD = false;
    boolean answerNineE = false;

    boolean answerTenA = false;
    boolean answerTenB = false;
    boolean answerTenC = false;
    boolean answerTenD = false;
    boolean answerTenE = false;

    double points;
    int correctAnswers;
    int partiallyCorrectAnswers;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putBoolean(STATE_answer1a, answerOneA);
        savedInstanceState.putBoolean(STATE_answer1b, answerOneB);
        savedInstanceState.putBoolean(STATE_answer1c, answerOneC);
        savedInstanceState.putBoolean(STATE_answer1d, answerOneD);

        savedInstanceState.putBoolean(STATE_answer2a, answerTwoA);
        savedInstanceState.putBoolean(STATE_answer2b, answerTwoB);
        savedInstanceState.putBoolean(STATE_answer2c, answerTwoC);
        savedInstanceState.putBoolean(STATE_answer2d, answerTwoD);

        savedInstanceState.putString(STATE_answer3, answerThree);

        savedInstanceState.putBoolean(STATE_answer4a, answerFourA);
        savedInstanceState.putBoolean(STATE_answer4b, answerFourB);
        savedInstanceState.putBoolean(STATE_answer4c, answerFourC);

        savedInstanceState.putBoolean(STATE_answer5a, answerFiveA);
        savedInstanceState.putBoolean(STATE_answer5b, answerFiveB);
        savedInstanceState.putBoolean(STATE_answer5c, answerFiveC);

        savedInstanceState.putBoolean(STATE_answer6a, answerSixA);
        savedInstanceState.putBoolean(STATE_answer6b, answerSixB);
        savedInstanceState.putBoolean(STATE_answer6c, answerSixC);
        savedInstanceState.putBoolean(STATE_answer6d, answerSixD);

        savedInstanceState.putBoolean(STATE_answer7a, answerSevenA);
        savedInstanceState.putBoolean(STATE_answer7b, answerSevenB);
        savedInstanceState.putBoolean(STATE_answer7c, answerSevenC);
        savedInstanceState.putBoolean(STATE_answer7d, answerSevenD);
        savedInstanceState.putBoolean(STATE_answer7e, answerSevenE);

        savedInstanceState.putString(STATE_answer8, answerEight);

        savedInstanceState.putBoolean(STATE_answer9a, answerNineA);
        savedInstanceState.putBoolean(STATE_answer9b, answerNineB);
        savedInstanceState.putBoolean(STATE_answer9c, answerNineC);
        savedInstanceState.putBoolean(STATE_answer9d, answerNineD);
        savedInstanceState.putBoolean(STATE_answer9e, answerNineE);

        savedInstanceState.putBoolean(STATE_answer10a, answerTenA);
        savedInstanceState.putBoolean(STATE_answer10b, answerTenB);
        savedInstanceState.putBoolean(STATE_answer10c, answerTenC);
        savedInstanceState.putBoolean(STATE_answer10d, answerTenD);
        savedInstanceState.putBoolean(STATE_answer10e, answerTenE);

        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        answerOneA=savedInstanceState.getBoolean(STATE_answer1a);
        answerOneB=savedInstanceState.getBoolean(STATE_answer1b);
        answerOneC=savedInstanceState.getBoolean(STATE_answer1c);
        answerOneD=savedInstanceState.getBoolean(STATE_answer1d);

        answerTwoA=savedInstanceState.getBoolean(STATE_answer2a);
        answerTwoB=savedInstanceState.getBoolean(STATE_answer2b);
        answerTwoC=savedInstanceState.getBoolean(STATE_answer2c);
        answerTwoD=savedInstanceState.getBoolean(STATE_answer2d);

        answerThree=savedInstanceState.getString(STATE_answer3);

        answerFourA=savedInstanceState.getBoolean(STATE_answer4a);
        answerFourB=savedInstanceState.getBoolean(STATE_answer4b);
        answerFourC=savedInstanceState.getBoolean(STATE_answer4c);

        answerFiveA=savedInstanceState.getBoolean(STATE_answer5a);
        answerFiveB=savedInstanceState.getBoolean(STATE_answer5b);
        answerFiveC=savedInstanceState.getBoolean(STATE_answer5c);

        answerSixA=savedInstanceState.getBoolean(STATE_answer6a);
        answerSixB=savedInstanceState.getBoolean(STATE_answer6b);
        answerSixC=savedInstanceState.getBoolean(STATE_answer6c);
        answerSixD=savedInstanceState.getBoolean(STATE_answer6d);

        answerSevenA=savedInstanceState.getBoolean(STATE_answer7a);
        answerSevenB=savedInstanceState.getBoolean(STATE_answer7b);
        answerSevenC=savedInstanceState.getBoolean(STATE_answer7c);
        answerSevenD=savedInstanceState.getBoolean(STATE_answer7d);
        answerSevenE=savedInstanceState.getBoolean(STATE_answer7e);

        answerEight=savedInstanceState.getString(STATE_answer8);

        answerNineA=savedInstanceState.getBoolean(STATE_answer9a);
        answerNineB=savedInstanceState.getBoolean(STATE_answer9b);
        answerNineC=savedInstanceState.getBoolean(STATE_answer9c);
        answerNineD=savedInstanceState.getBoolean(STATE_answer9d);
        answerNineE=savedInstanceState.getBoolean(STATE_answer9e);

        answerTenA=savedInstanceState.getBoolean(STATE_answer10a);
        answerTenB=savedInstanceState.getBoolean(STATE_answer10b);
        answerTenC=savedInstanceState.getBoolean(STATE_answer10c);
        answerTenD=savedInstanceState.getBoolean(STATE_answer10d);
        answerTenE=savedInstanceState.getBoolean(STATE_answer10e);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAction(View view){
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.submitting);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        calculateResult();

        text = getString(R.string.score)+"\n"
                +points+" "+getString(R.string.points)+"\n"
                +getString(R.string.correctAnswers)+correctAnswers+"\n"
                +getString(R.string.partiallyCorrect)+partiallyCorrectAnswers;
        duration = Toast.LENGTH_LONG;
        toast = Toast.makeText(context, text, duration);
        toast.show();

        //Clearing the variables to check/correct answers again but the given answers are still shown
        resetsTheVariablesForCalculation();
    }

    public void sendResultViaEmail(View view){
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.sendingViaMail);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        calculateResult();

        String subject = getString(R.string.mailSubject);
        String resultMessage = getString(R.string.score)+"\n"
                +points+" "+getString(R.string.points)+"\n"
                +getString(R.string.correctAnswers)+correctAnswers+"\n"
                +getString(R.string.partiallyCorrect)+partiallyCorrectAnswers;

        //intent which sends the result via mail:
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, resultMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

        //reset everything
        resetTest();
    }

    public void resetAnswers(View view) {
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.clearingAnswers);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //clears everything
        resetTest();
    }

    public void calculateResult(){

        RadioButton rdbAnswer1a = (RadioButton) findViewById(R.id.Answer1a);
        if(rdbAnswer1a.isChecked()){
            points+=10;
            correctAnswers++;
        }

        RadioButton rdbAnswer2d = (RadioButton) findViewById(R.id.Answer2d);
        if(rdbAnswer2d.isChecked()){
            points+=10;
            correctAnswers++;
        }

        EditText txtAnswerBox03 = (EditText) findViewById(R.id.AnswerBox03);
        String actorName = txtAnswerBox03.getText().toString();
        if(actorName.equals("Howard") || actorName.equals("HOWARD")
                || actorName.equals("howard")){
            points+=10;
            correctAnswers++;
        }

        RadioButton rdbAnswer4b = (RadioButton) findViewById(R.id.Answer4b);
        if(rdbAnswer4b.isChecked()){
            points+=10;
            correctAnswers++;
        }

        RadioButton rdbAnswer5c = (RadioButton) findViewById(R.id.Answer5c);
        if(rdbAnswer5c.isChecked()){
            points+=10;
            correctAnswers++;
        }

        RadioButton rdbAnswer6d = (RadioButton) findViewById(R.id.Answer6d);
        if(rdbAnswer6d.isChecked()){
            points+=10;
            correctAnswers++;
        }

        CheckBox chbAnswer7a = (CheckBox) findViewById(R.id.Answer7a);
        CheckBox chbAnswer7b = (CheckBox) findViewById(R.id.Answer7b);
        CheckBox chbAnswer7c = (CheckBox) findViewById(R.id.Answer7c);
        CheckBox chbAnswer7d = (CheckBox) findViewById(R.id.Answer7d);
        CheckBox chbAnswer7e = (CheckBox) findViewById(R.id.Answer7e);
        if(chbAnswer7a.isChecked()){
            points+=5;
        }
        if(chbAnswer7c.isChecked()){
            points+=5;
        }
        if(chbAnswer7a.isChecked() && chbAnswer7c.isChecked()
                && !chbAnswer7b.isChecked()
                && !chbAnswer7d.isChecked()
                && !chbAnswer7e.isChecked()){
            correctAnswers++;
        } else if(chbAnswer7a.isChecked() || chbAnswer7c.isChecked()){
            partiallyCorrectAnswers++;
        }
        if(chbAnswer7a.isChecked() && chbAnswer7c.isChecked()
                && chbAnswer7b.isChecked()
                && chbAnswer7d.isChecked()
                && chbAnswer7e.isChecked()){
            points-=10;
        }

        EditText txtAnswerBox08 = (EditText) findViewById(R.id.AnswerBox08);
        if(txtAnswerBox08.getText().toString().equals("Monte")
                || txtAnswerBox08.getText().toString().equals("MONTE")
                || txtAnswerBox08.getText().toString().equals("M.O.N.T.E")
                || txtAnswerBox08.getText().toString().equals("M.o.n.t.e")){
            points+=10;
            correctAnswers++;
        }

        CheckBox chbAnswer9a = (CheckBox) findViewById(R.id.Answer9a);
        CheckBox chbAnswer9b = (CheckBox) findViewById(R.id.Answer9b);
        CheckBox chbAnswer9c = (CheckBox) findViewById(R.id.Answer9c);
        CheckBox chbAnswer9d = (CheckBox) findViewById(R.id.Answer9d);
        CheckBox chbAnswer9e = (CheckBox) findViewById(R.id.Answer9e);
        if(chbAnswer9a.isChecked() ){
            points+=2.5;
        }
        if( chbAnswer9b.isChecked()){
            points+=2.5;
        }
        if(chbAnswer9d.isChecked()){
            points+=2.5;
        }
        if(chbAnswer9e.isChecked()){
            points+=2.5;
        }
        if(chbAnswer9a.isChecked() && chbAnswer9b.isChecked()
                && chbAnswer9d.isChecked()
                && chbAnswer9e.isChecked()
                && !chbAnswer9c.isChecked()){
            correctAnswers++;
        } else if(chbAnswer9a.isChecked() || chbAnswer9b.isChecked()
                || chbAnswer9d.isChecked()
                || chbAnswer9e.isChecked()){
            partiallyCorrectAnswers++;
        }
        if(chbAnswer9a.isChecked() && chbAnswer9b.isChecked()
                && chbAnswer9d.isChecked()
                && chbAnswer9e.isChecked()
                && chbAnswer9c.isChecked()){
            points-=10;
        }

        CheckBox chbAnswer10a = (CheckBox) findViewById(R.id.Answer10a);
        CheckBox chbAnswer10b = (CheckBox) findViewById(R.id.Answer10b);
        CheckBox chbAnswer10c = (CheckBox) findViewById(R.id.Answer10c);
        CheckBox chbAnswer10d = (CheckBox) findViewById(R.id.Answer10d);
        CheckBox chbAnswer10e = (CheckBox) findViewById(R.id.Answer10e);
        if(chbAnswer10e.isChecked()){
            points+=5;
        }
        if(chbAnswer10b.isChecked()){
            points+=5;
        }
        if(!chbAnswer10a.isChecked()
                && chbAnswer10b.isChecked()
                && !chbAnswer10c.isChecked()
                && !chbAnswer10d.isChecked()
                && chbAnswer10e.isChecked()){
            correctAnswers++;
        } else if (chbAnswer10e.isChecked() || chbAnswer10b.isChecked()){
            partiallyCorrectAnswers++;
        }
        if(chbAnswer10a.isChecked()
                && chbAnswer10b.isChecked()
                && chbAnswer10c.isChecked()
                && chbAnswer10d.isChecked()
                && chbAnswer10e.isChecked()){
            points-=10;
        }
    }

    public void resetTest(){
        RadioGroup rdgAnswerBox01 = (RadioGroup) findViewById(R.id.AnswerBox01);
        rdgAnswerBox01.clearCheck();

        RadioGroup rdgAnswerBox02 = (RadioGroup) findViewById(R.id.AnswerBox02);
        rdgAnswerBox02.clearCheck();

        EditText txtAnswerBox03 = (EditText) findViewById(R.id.AnswerBox03);
        txtAnswerBox03.getText().clear();

        RadioGroup rdgAnswerBox04 = (RadioGroup) findViewById(R.id.AnswerBox04);
        rdgAnswerBox04.clearCheck();

        RadioGroup rdgAnswerBox05 = (RadioGroup) findViewById(R.id.AnswerBox05);
        rdgAnswerBox05.clearCheck();

        RadioGroup rdgAnswerBox06 = (RadioGroup) findViewById(R.id.AnswerBox06);
        rdgAnswerBox06.clearCheck();

        CheckBox chbAnswer7a = (CheckBox) findViewById(R.id.Answer7a);
        chbAnswer7a.setChecked(false);

        CheckBox chbAnswer7b = (CheckBox) findViewById(R.id.Answer7b);
        chbAnswer7b.setChecked(false);

        CheckBox chbAnswer7c = (CheckBox) findViewById(R.id.Answer7c);
        chbAnswer7c.setChecked(false);

        CheckBox chbAnswer7d = (CheckBox) findViewById(R.id.Answer7d);
        chbAnswer7d.setChecked(false);

        CheckBox chbAnswer7e = (CheckBox) findViewById(R.id.Answer7e);
        chbAnswer7e.setChecked(false);

        EditText txtAnswerBox08 = (EditText) findViewById(R.id.AnswerBox08);
        txtAnswerBox08.getText().clear();

        CheckBox chbAnswer9a = (CheckBox) findViewById(R.id.Answer9a);
        chbAnswer9a.setChecked(false);

        CheckBox chbAnswer9b = (CheckBox) findViewById(R.id.Answer9b);
        chbAnswer9b.setChecked(false);

        CheckBox chbAnswer9c = (CheckBox) findViewById(R.id.Answer9c);
        chbAnswer9c.setChecked(false);

        CheckBox chbAnswer9d = (CheckBox) findViewById(R.id.Answer9d);
        chbAnswer9d.setChecked(false);

        CheckBox chbAnswer9e = (CheckBox) findViewById(R.id.Answer9e);
        chbAnswer9e.setChecked(false);

        CheckBox chbAnswer10a = (CheckBox) findViewById(R.id.Answer10a);
        chbAnswer10a.setChecked(false);

        CheckBox chbAnswer10b = (CheckBox) findViewById(R.id.Answer10b);
        chbAnswer10b.setChecked(false);

        CheckBox chbAnswer10c = (CheckBox) findViewById(R.id.Answer10c);
        chbAnswer10c.setChecked(false);

        CheckBox chbAnswer10d = (CheckBox) findViewById(R.id.Answer10d);
        chbAnswer10d.setChecked(false);

        CheckBox chbAnswer10e = (CheckBox) findViewById(R.id.Answer10e);
        chbAnswer10e.setChecked(false);

        resetsTheVariablesForCalculation();
    }

    public void resetsTheVariablesForCalculation(){
        points = 0;
        correctAnswers = 0;
        partiallyCorrectAnswers = 0;
    }
}
