package com.formats.letter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class informalemail1 extends AppCompatActivity {
    EditText from , to  , subject;
    TextView textView;

    Button  submit , copy ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_informalemail1);
        from=findViewById(R.id.etfromname);
        
        to=findViewById(R.id.ettoname);
        subject=findViewById(R.id.etsubject);
        
        textView=findViewById(R.id.content);
        copy=findViewById(R.id.copy_btn);

        submit=findViewById(R.id.submit_btn);


        String s = getIntent().getStringExtra("key");

        //action bar
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle(s );//textView.getText().toString());
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#035F5E"));
        actionBar.setBackgroundDrawable(colorDrawable);

        textView.setMovementMethod(new ScrollingMovementMethod());


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = getIntent().getStringExtra("key");

                if( s.equals("• Inviting a friend for a ceremony say for birthday Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext= to.getText().toString();
                    String subjecttext= subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+"To:- "+totext+"\n\n"+ "Subject:- "+subjecttext+"\n\n"+
                            "\n"+"Dear Sir/Madam"+"\n\n"+ "I am a student of [class and section]," +
                            "as you know that my birthday is so near on 5th july . i invite you on my birthday , i request you to attend my birthday party. i have invited all my friends in the birthday party. and tell uncle and anty also to attend it. i will feel good if you attend my birthday party . it will start from 6 :00 to 9:oo. i hope you will certainly attend the party.\n" +
                            "\n\n" +fromtext);

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(informalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals(" •  Calling a friend for a trip or holiday Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext= to.getText().toString();
                    String subjecttext= subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+""+"To:- "+totext+"\n\n"+ "Subject:- "+subjecttext+"\n\n"+
                            "\n"+"Dear Sir/Madam"+"\n\n"+ "Thank you for taking the time to review my resume. I have recently graduated from [xyz]University College, and I am currently looking for a position in [xyz].\n" +
                            "\n" +
                            "I am interested in an entry-level role with ABCD Company’s [Accounting] department, hoping to leverage my knowledge of corporate accounting and GAAP best practices to contribute to your operations. I have heard that ABCD is a wonderful company to work for, and I hope that I can be considered for the team.\n" +
                            "\n" +
                            "If you have questions regarding my credentials and qualifications, please feel free to call or email me at namelastname@gmail.com.\n" +
                            "\n" +
                            "Again, thank you for reviewing my resume. I look forward to hearing from you in the near future."+
                            "Sincerely,\n" +
                            "\n" +
                            "Signature (for hard copy letter)\n" +
                            "\n" +
                            fromtext);

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(informalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if(s.equals("•  Asking sorry or apologizing to someone for mistakes you have done Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext= to.getText().toString();
                    String subjecttext= subject.getText().toString();


                    textView.setText("From:- "+fromtext +"\n\n"+""+"To:- "+totext+"\n\n"+ "Subject:- "+subjecttext+"\n\n\n"+
                            "Please accept my sincere apology for sending wrong reports to the client. I understand this has caused a lot of inconvenience to the client and our company.\n" +
                            "\n" +
                            "I cannot defend my actions, but I want to tell you that I am handling four projects simultaneously. I got confused and mistakenly sent the wrong reports. I am truly sorry for such a lousy mistake.\n" +
                            "\n" +
                            "I want you to know that I have already apologized to the client personally and sent the correct reports. I have also arranged a meeting with the client to eliminate any chance of miscommunication about our reports.\n" +
                            "\n" +
                            "Kindly suggest if any other remedial step should be taken from our end.\n" +
                            "\n" +
                            "I understand your disappointment, and I am truly sorry. I can assure you that this mistake will never be repeated in the future.\n" +
                            "\n" +
                            "Yours Sincerely,\n" +
                            fromtext);

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(informalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if(s.equals("•  Congratulating a friend for his success or achievement Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext= to.getText().toString();
                    String subjecttext= subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+""+"To:- "+totext+"\n\n"+ "Subject:- "+subjecttext+"\n"+"\n\n"+
                            "How are you? How are your family members? How is the weather\n" +
                            "there? Hope you are doing well. I am also fine here.\n" +
                            "I heard the news of you holding 1st rank in the class. I feel really\n" +
                            "happy and proud of you. I would like to congratulate you for the\n" +
                            "same. I know you must have done a lot of hardwork for it and finally\n" +
                            "you have achieved what you wanted.\n" +
                            "I am hoping that you achieve all the success in future. Keep it up.\n" +
                            "Also, will try to meet you in person and congratulate you. If we meet\n" +
                            "ever will surely celebrate for your success.\n" +
                            "Till then take care of yourself and your family.\n" +
                            "Take care.\n" +
                            "[TO NAME]\n" +
                            "With Love,\n" +
                            fromtext);

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(informalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  Writing just to ask for the well-being of a person Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext= to.getText().toString();
                    String subjecttext= subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+""+"To:- "+totext+"\n\n"+ "Subject:- "+subjecttext+"\n"+"\n\n"+
                            "Life is not what it used to be. It seems we have come to a deadlock with man on one side and Corona on the other. Both are fighting a tooth and nail battle and the only weapon man has is a total lock down.\n" +
                            "\n" +
                            "Since self isolation is the only option of keeping the virus at bay we all are stuck up home. I am extremely worried about you and your family. Your father suffers from acute diabetes and your mother from asthma. Medication is a must for them. How are you managing? You must keep a close eye on their diet. How is your grandmother? She is over eighty and susceptible to infection.\n" +
                            "\n" +
                            "Do follow the instructions laid down by the Government and Health Department. At this hour of crisis it is very important to stay fit. You have a huge responsibility to shoulder. You take care of yourself too. If you fall ill it will become a great crisis at home along with the pandemic outside.\n" +
                            "\n" +
                            "We are fine here. We are staying strictly indoors. Convey my regards to all in your family. My best wishes to you.\n" +
                            "\n" +
                            "Take care.\n" +
                            "\n" +
                            "Your friend\n" +
                            "\n" +
                            fromtext +
                            "\n");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(informalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  Invitation for a marriage Email"))
                {
                    String fromtext  =from.getText().toString();

                    String totext= to.getText().toString();
                    String subjecttext= subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+""+"To:- "+totext+"\n\n"+ "Subject:- "+subjecttext+"\n"+"\n\n"+
                            "On the upcoming ___________ (Date of the Marriage Ceremony), my __________ (Relation with the Bride or Groom) is getting married and I would like to invite you to this special occasion. It would be really great if you will join me and my family as early as possible, as we need you to join hands with us in preparing for this big event.\n" +
                            "\n" +
                            "The ceremony is going to be held at __________ (Venue of the Ceremony) at __________ (Time of the Ceremony), which is at a small walking distance from our place.\n" +
                            "\n" +
                            "I’m expecting your presence eagerly.\n" +
                            "\n" +
                            "Thanking you.\n" +
                            "\n" +
                            "Yours Truly,\n" +
                            "\n" +
                            fromtext);

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(informalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  Asking help from someone Email"))
                {
                    String fromtext  =from.getText().toString();

                    String totext= to.getText().toString();
                    String subjecttext= subject.getText().toString();


                    textView.setText("From:- "+fromtext +"\n\n"+"To:- "+totext+"\n\n"+ "Subject:- "+subjecttext+"\n"+"\n\n"+
                            "I hope this letter finds you in the best of health and grace.\n" +
                            "\n" +
                            "It’s been a long I have written to you and at this hour I really think, this is the best time. I am writing this letter to ask for help from you. As you know that I have recently __________ (shifted to your city and I don’t have many connections here).\n" +
                            "\n" +
                            "I am literally struggling immensely in order to manage everything. I have to see ___________ (water bills / electricity bills – utility bills) as well as (phone bills/ maintenance bills/ any other). I am not asking much, just a little guidance on how to manage everything. I have been struggling for the last _____ (two / three) months with the same problems.\n" +
                            "\n" +
                            "The amount of bills is increasing and I just can’t manage. Which is making me feel depressed and somehow I am not able to grow myself nor focus on myself. This is when I thought I would write a letter to you so that I can ask you for some decent help to overcome this situation." +
                            "Waiting for your reply,\n" +
                            "\n" +
                            "Yours affectionately,\n" +
                            fromtext);

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(informalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  Informing about someone’s demise in family or friends Email"))
                {
                    String fromtext  =from.getText().toString();

                    String totext= to.getText().toString();
                    String subjecttext= subject.getText().toString();


                    textView.setText("From:- "+fromtext +"\n\n"+"To:- "+totext+"\n\n"+ "Subject:- "+subjecttext+"\n"+"\n\n"+
                            "I have to inform everyone of the sad news that our wonderful and lovely [aunt], died unexpectedly on [Monday] [night]. She/he had been admitted to hospital only a few hours earlier complaining of severe pain. It proved to be a burst appendix, and although surgery and appendectomy were undertaken it was too late.\n" +
                            "\n" +
                            "There is to be a memorial service on [Monday] for [Aunt Susan]; this is to be held at [2:00 pm] at the Funeral Chapel here in York. We would ask that [Aunt Susan]'s final wishes are observed, and there are to be no flowers, donations to the York Town Scholarship fund would be welcomed instead.\n" +
                            "\n" +
                            "\n" +
                            "Sincerely,\n" +
                            "\n" +
                            fromtext);

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(informalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  Invitation for a  party Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext= to.getText().toString();
                    String subjecttext= subject.getText().toString();


                    textView.setText("From:- "+fromtext +"\n\n"+"To:- "+totext+"\n\n"+ "Subject:- "+subjecttext+"\n"+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                            "I hope you all are doing fine. I have something very special to tell you which is that [EVENT] is on its way and I want you all to come over to  [place] on the (Date: Dd/MM/YY) at (Time) for the [XYZ] party I have arranged for all the friends and family. (Describe in your words). I do not want to listen to any refusals and I expect you all to be there on time as the mother is going to bake our favorite cake and also I want to spend quality time with you guys so that I can have good memories for my birthday. (Explain all about arrangements).\n" +
                            "\n" +
                            "I hope to see you guys soon and also expect you all to be there as you all are very special to me.\n" +
                            "\n" +
                            "\n" +
                            " \n" +
                            "Regards,\n" +
                            "\n" +
                            fromtext+"\n" +
                            "\n" +
                            "Address…\n" +
                            "\n" +
                            "Contact Information…");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(informalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }
            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.logout:

                Toasty.success(this,"Logged Out",Toasty.LENGTH_LONG).show();
                finish();
                System.exit(0);
                break;
            case R.id.about:
                Toasty.info(this, "App Developer \n ROHIT SINGH", Toast.LENGTH_LONG).show();

                break;
            case R.id.bug:
                Toasty.success(this,"Bug Reposted Successfully",Toast.LENGTH_SHORT).show();
                break;


        }
        return true;
    }
}