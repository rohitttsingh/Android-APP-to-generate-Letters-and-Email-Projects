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

public class formalletter1 extends AppCompatActivity {
    EditText from , to , date , subject, reason;
    TextView textView;

    Button  submit , copy ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_formalletter1);
        from=findViewById(R.id.etfromname);
        date=findViewById(R.id.etdate);
        to=findViewById(R.id.ettoname);
        subject=findViewById(R.id.etsubject);
        reason=findViewById(R.id.etreason);
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

              if( s.equals("• Letter to Your Principal/Teacher "))
                {
              String fromtext  =from.getText().toString();
              String totext=to.getText().toString();
              String datetext= date.getText().toString();
              String reasontext= reason.getText().toString();
              String subjecttext = subject.getText().toString();

                   textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                    "To:- "+ totext+"\n\n"+
                    "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n"+ "I am a student of [class and section]," +
                           " at your school. This is to inform you that, I have to "+reasontext +
                           " . Hence, I will not be able to come" +
                           " to school [FROM -TO]. Kindly give me the leave for [NUMBER] days." +
                           " I shall be really grateful to you."+"\n\n"+"Thanking you,\n" +
                           "\n" +
                           "Yours obediently,\n" +
                           "[Name of the Student],\n" +
                           "[Roll No].");

                   copy.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                           String getstring = textView.getText().toString();
                           clipboard.setText(getstring);
                           Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                       }
                   });

                }

              else if (s.equals("• Letter of Enquiry"))
                {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n"+ "Thank you for taking the time to review my resume. I have recently graduated from [xyz]University College, and I am currently looking for a position in [xyz].\n" +
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
                          "Your Name");

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                      }
                  });

              }

              else if(s.equals("• Letter of Complaint"))
              {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n"+ "On [DATE], I bought a [PRODUCT] worth Rs [PRICE] from your store.\n" +
                          "Unfortunately, your product has not performed well. The [PRODUCT]doesn’t work half the time . I am highly disappointed because such an act of neglect is not expected from such a renowned store.\n" +
                          "To resolve the problem, I would appreciate you changing the watch with a new fully functioning model. I have the receipt intact. Enclosed are the copies of the receipt along with the guarantee card.\n" +
                          "I look forward to your reply and a resolution to my problem and will wait until a week before seeking help from a consumer protection agency. Please contact me at the above address or by phone at [PHONE NUMBER].\n" +
                          "Yours Sincerely\n" +
                          fromtext +"\n"+
                          "Enclosure(s): 1. Receipt\n" +
                          "2. Guarantee card");

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                      }
                  });

              }

              else if(s.equals("• Reply to a Letter of Complaint"))
              {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                          "Thank you for your email. We take customer satisfaction seriously and are glad to hear from you.\n" +
                          "First, I would like to apologize for the frustration you've been experiencing recently. I want you to know that we appreciate your feedback. It will allow us to resolve any problems that occur and help us to improve our services.\n" +
                          "We're proud that you've selected our company as your service provider for the last five years, and we'd like the opportunity to resolve your concerns and earn your continued trust.\n" +
                          "To help us route your complaint to the appropriate department who can address your concerns, we'd be grateful if you can provide us with additional details regarding your experience by filling out the attached form.\n" +
                          "We are truly sorry for the inconvenience and hope to offer you better services in the future.\n" +
                          "For any questions or further assistance, please reply to this message or call us at [PHONE ]\n" +
                          "Best regards,\n" +
                          fromtext +"\n"+
                          " Customer Service Director");

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                      }
                  });

              }

              else if (s.equals("• Promotion Letter"))
              {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                          "I have the pleasure to inform you that you have been promoted to [RANK] in the [---] department of the company. You are required to take charge of the new assignment on [15th May 2021]. Please accept my hearty congratulations on your promotion.\n" +
                          "\n" +
                          "Your salary scale in the promoted cadre will be [Tk. 16,000] and from [15th may], your basic salary will be fixed at [Tk. 12,000] on the said scale. You will be entitled to all other allowances as applicable to the [staff-II] of the company. Other service conditions remain unchanged.\n" +
                          "\n" +
                          "\n" +
                          " \n" +
                          "Please acknowledge receipt of this letter.\n" +
                          "\n" +
                          "Yours sincerely,\n" +
                          "\n" +
                          "Name of employer\n" +
                          "Designation of employer\n" +
                          "Name of the organization");

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                      }
                  });

              }

              else if (s.equals("• Sales Letters"))
              {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                        "{Business name} is a company that is engaged in the {nature of business}. Our experts have an experience of more than {number of years} in the field of {specific field name}.\n" +
                          "\n" +
                          "We are based in {headquarters} and have outlets in {name locations} for the {distribution/provision} of our {products/services}.\n" +
                          "\n" +
                          "Our {products/service} have become very popular, and we are receiving a positive response from the market. We offer quality {products/services} at competitive prices.\n" +
                          "\n" +
                          "If you have any questions or need more details, please contact us at {email address} or {phone number}. You can also visit our website {web address}.\n" +
                          "\n" +
                          "Sincerely,\n" +
                          "\n" +
                          fromtext +"\n" +
                          "\n" +
                          "{Job Title}\n" +
                          "\n" +
                          "{Company Name}");

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                      }
                  });

              }

              else if (s.equals("• Recovery Letters"))
              {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                         "When you’re reading this you’re probably in a dark place. I’ve been there too many times. Way too many times. As I couldn’t stand being there anymore my wish only was to escape reality, feeling nothing anymore, don’t exist anymore. That also included wanting to die.\n" +
                          "\n" +
                          "I’ve been to this point a lot of times. Every time I was in such a dark place I felt hopeless. I thought I’d be stuck there for the rest of my life. That nothing and no one could get me out of there. I couldn’t believe the people around me saying it would get better.\n" +
                          "\n" +
                          "But it will. It won’t happen overnight. It will take time and go slowly.\n" +
                          "\n" +
                          "I have been fighting depression for the past four years and the last 2 1/2 years I’ve been in hospital for 50% of that time.\n" +
                          "\n" +
                          "I learned a lot about myself and why I am who I am. I learnt a lot about what I need and also I tried a lot of different medications. It was about 20 different antidepressants, mood stabilisers, neuroleptics, etc. Most of them were pretty useless to me. Some helped me to calm down. Some made me dizzy. But only recently I got medication that really helps me. It pushes my mood. It gives me more energy and makes me feel more balanced.\n" +
                          "\n" +
                          "I know how it feels when you think there is nothing that can help. But the probability is pretty high some medication will give you at least a bit of support. And if you only got to walk 90% of the way on your own that’s fair enough!   \n" +
                          "\n" +
                          "I used to isolate myself from people around me. People that are mostly willing to help me. But to get help I had to grab their reaching hand. And stick to the helping people as close as possible. Or at least reply to text messages. Though it costs a lot of effort and felt so wrong because all you wanted to do is being alone.\n" +
                          "\n" +
                          "Sometimes it is better to be alone but in most cases expressing yourself to someone else is valuable and divides the heaviness of the depression.\n" +
                          "\n" +
                          "Also search for professional help! There are a lot of good therapists and doctors that can give you appropriate therapy and medication or other support. But again it’s up to yourself to accept the help that is there. Also don’t expect any treatment or anything else to happen overnight as your mental illness grew over years. It won’t tear down in just a week. It will last weeks probably till you feel way more stable. But that’s okay. It’s worth it. It’s worth the fight every day when you kick yourself out of bed and have to force you to fight for yourself to care about you and your body. To dress up, to eat properly, to go out for a walk and breathe fresh air and make your appointments\n" +
                          "\n" +
                          "Fighting depression is about letting go of negative relationships, letting go of your job that was stressing you out, letting go of anything that keeps drowning you. Letting go all the negative stress.\n" +
                          "\n" +
                          "Try to see your depression as your opportunity to grow. Find out what kind of job you would like to do, which people you like to have around you, what you would like to do in your leisure time, what would you like to eat, where do you want to live or if you want to practice mindfulness. You’ll face these questions in your treatment and you will find answers too. You won’t find them in the beginning. That’s not the right time. In the beginning you have to get more stable, relax from the stress this illness created. But on your way when you get better and better you will be able to express what you want and what you need. And that’s exactly what will relieve you from your illness someday.\n" +
                          "\n" +
                          "From three months I continuously feel better. It’s not that every day is good. I still struggle. Some days I still have to fight with myself. That’s okay! I am not in my full health! I am severely ill.\n" +
                          "\n" +
                          "I started working out several times per week, including yoga lessons. I eat 3 times a day almost every day. I take care of myself (taking shower every day, getting dressed the way I like, etc.) I go to meetups to try new stuff and get to know new people. I started a new job.\n" +
                          "\n" +
                          "I am not completely out of the tunnel yet. But the light isn’t far away anymore. I’ll be there. And it will feel great. And so will you.\n" +
                          "\n" +
                          "Trust me, I escaped this horrible nightmare, though I had absolutely zero hope for such a long time.\n" +
                          "\n" +
                          "You can do it and you WILL.\n" +
                          "\n" +
                          "All the best\n" +
                          "\n" +
                          totext);

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                      }
                  });

              }

              else if (s.equals("• Apology letters"))
              {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                         "Please accept my deepest apologies for my mistake in regard to " +reasontext+"\n"+
                          "\n" +
                          "It was not my intention to create such an awkward and embarrassing situation for {you, institution, the team, company, etc…}.\n" +
                          "\n" +
                          "If there was any good that came out of this unfortunate experience, it is that I have grown and learned alternative approaches to these situations.\n" +
                          "\n" +
                          "Please feel free to let me know of your thoughts and concerns over this matter. You can reach me at {email, phone number}. \n" +
                          "\n" +
                          "Sincerely,\n" +
                          fromtext);

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                      }
                  });

              }

              else if (s.equals("• Making a Claim"))
              {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                          "We would like to bring to your kind attention that our\n" +
                          "consignment of [xyz] sent from [Amritsar] on\n" +
                          "[November 10, 2012] was tampered with during transit.\n" +
                          "This fact has been duly certified by the [railway clerk] at\n" +
                          "[Thane station] from whom we received the consignment.\n" +
                          "His remarks are enclosed herewith. We are writing to\n" +
                          "request compensation for our losses.\n" +
                          "The pilferage of woolen clothes has resulted in huge\n" +
                          "losses for us. We have enclosed an itemized list of the\n" +
                          "lost items along with their costs and we must insist\n" +
                          "that you register this claim of ours and reimburse us\n" +
                          "immediately.\n" +
                          "We look forward to hearing from you.\n" +
                          "Sincerely\n" +
                          "Authorized signatory");

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                      }
                  });

              }

              else if (s.equals("• Acceptance letter"))
              {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                         "I am writing to confirm my acceptance of your employment offer [on April 20 ] and to tell you how\n" +
                          "delighted I am to be joining XYZ Corporation in [Chicago]. The work is exactly what I have\n" +
                          "prepared to perform and hoped to do. I feel confident that I can make a significant contribution to\n" +
                          "the corporation, and I am grateful for the opportunity you have given me.\n" +
                          "As we discussed, I will report to work at [8:00 am on July 1] and will have completed the medical\n" +
                          "examination and drug testing by the start date. Additionally, I shall complete all employment and\n" +
                          "insurance forms for the new employee orientation.\n" +
                          "I look forward to working with you and your fine team. I appreciate your confidence in me and\n" +
                          "am very happy to be joining your staff.\n" +
                          fromtext);

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                      }
                  });

              }

              else if (s.equals("• Order Letter"))
              {
                  String fromtext  =from.getText().toString();
                  String totext=to.getText().toString();
                  String datetext= date.getText().toString();
                  String reasontext= reason.getText().toString();
                  String subjecttext = subject.getText().toString();

                  textView.setText("From:- "+fromtext +"\n\n"+"Date:- "+datetext+"\n\n"+
                          "To:- "+ totext+"\n\n"+
                          "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                         "Thank you for your quotation and the price list. We are glad to place our first order with you for the following items:\n" +
                          "\n" +
                          "SL. No:\tDescription\tQuantity\tWeight\tUnit price\tAmount (Tk.)\n" +
                          "[1\tEnamels paint \t25 Tins \t100 1bs \t1000  \t25.000\n]" +
                          "[2\tSynthetic paint \t20 Tins \t2001bs \t2000  \t40.000\n]" +
                          "[3\tWhite paint \t10 Tins \tl0 lbs\t500 \t5.000 70,000\n]" +
                          "Since the above goods are required immediately as our stock is about to exhaust very soon. We request you to send the goods through your “Motor” van as the carriage inward is supposed to be borne by you.\n" +
                          "\n" +
                          "We shall arrange payment within ten (10) days to comply with 5/10, Net 30 terms. Please send all commercial and financial documents along, with goods. We reserve the right to reject the goods if received late.\n" +
                          "\n" +
                          "Yours faithfully,\n" +
                          "\n" +
                          fromtext +
                          "Purchase Manager,\n" +
                          "Color world");

                  copy.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                          String getstring = textView.getText().toString();
                          clipboard.setText(getstring);
                          Toasty.success(formalletter1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

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