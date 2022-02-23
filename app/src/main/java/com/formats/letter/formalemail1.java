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

public class formalemail1 extends AppCompatActivity {
    EditText from , to , subject, reason;
    TextView textView;

    Button  submit , copy ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_formalemail1);
        from=findViewById(R.id.etfromname);
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

                if( s.equals("•  The Offer Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();
                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n"+
                            "Dear [Candidate First and Last Name],\n" +
                            " \n" +
                            "Congratulations on your offer from [Company Name]! We are delighted to offer you the position of [Job Title] with an anticipated start date of [start date].\n" +
                            " \n" +
                            "As discussed [over the phone, during your interview, etc.], please find attached your detailed offer letter. If you choose to accept this offer, please sign, scan, and email your letter to me at [email address] by [decision deadline].\n" +
                            " \n" +
                            "[If you are attaching other documents that need to be read and signed, mention those here].\n" +
                            " \n" +
                            "In the meantime, please don’t hesitate to reach out to me, either through email or by calling me directly at [your phone number] if you should have any questions or concerns.\n" +
                            " \n" +
                            "We are looking forward to hearing from you and hope you’ll join our team!\n" +
                            " \n" +
                            "Best regards,\n" +
                            " \n" +
                            "[Your Name]\n" +
                            "[Your Job Title]\n" +
                            "[Your Email]\n" +
                            "[Your Phone Number]");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  The Survey Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();

                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n"+ "Hi <Name>,\n" +
                            "\n" +
                            "We hope you are enjoying your recent purchase of <Product Name> from <Company Name>. \n" +
                            "\n" +
                            "Would you like to fill up a short survey to help us improve our services? It will take only 5 mins!\n" +
                            "\n" +
                            "<Survey_Link>\n" +
                            "\n" +
                            "Thank you in advance for your valuable insights.  Your input will be used to ensure that we continue to meet your needs. \n" +
                            "\n" +
                            "We appreciate your trust in us and look forward to serving you in the future. For any questions, please contact our <Customer Support>.\n" +
                            "\n" +
                            "Thank you,\n" +
                            "\n" +
                            "Signature");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if(s.equals("•  The Request Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();
                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n"+ "I am writing to request your help following a change in my circumstances.\n" +
                            "\n" +
                            "As you know, I am enrolled on the [Basic Spanish course at your college], which starts in September. However, due to unforeseen family events, I have had to leave the country for a while to assist my parents in[ Hong Kong].\n" +
                            "\n" +
                            "At present it is not clear when I will be able to return and unfortunately I will not be able to start the course as planned.\n" +
                            "\n" +
                            "I would like to request a refund for the course fees already paid. I apologise for the short notice and for any inconvenience caused. In the event that a refund is not possible, I would be grateful if you could postpone my enrolment until my return.\n" +
                            "\n" +
                            "Thank you in advance for your help and I hope to be able to update you on the situation soon.\n" +
                            "\n" +
                            "Yours sincerely,\n" +
                            "\n" +
                            "[xyz]");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }


                else if (s.equals("•  The We’re Hiring Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();

                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                            "We were all very excited to meet and get to know you over the past few days. We have been impressed with your background and would like to formally offer you the position of [Job_title]. This is a [full/part] time position [mention working days and hours.] You will be reporting to the head of the [Department_name] department. [If applicable: Please note that [Company_name] is an at-will employer. That means that either you or [Company_name] are free to end the employment relationship at any time, with or without notice or cause.]\n" +
                            "\n" +
                            "We will be offering you an annual gross salary of [$X] and [mention bonus programs, if applicable.] You will also have [mention benefits as per company policy, like health and insurance plan, corporate mobile or travel expenses] and [X] days of paid vacation per year.\n" +
                            "[optional: I am attaching a letter with more details about your compensation plan.]\n" +
                            "\n" +
                            "Your expected starting date is [date.] You will be asked to sign a contract of [contract_duration, if applicable] and [mention agreements, like confidentiality, nondisclosure and noncompete] at the beginning of your employment.\n" +
                            "\n" +
                            "We would like to have your response by [date.] In the meantime, please feel free to contact me or [Manager_name] via email or phone on [provide contact details], should you have any questions.\n" +
                            "\n" +
                            "We are all looking forward to having you on our team.\n" +
                            "\n" +
                            "Best regards,\n" +
                            "\n" +
                            "[your name]\n" +
                            "[Signature]");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  The New Product Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();

                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                           "It’s exciting for the company to release a new product. The employees are excited and waiting for the interaction of prospects.\n" +
                            "\n" +
                            "But first of all, do enough people know about your product launch?\n" +
                            "\n" +
                            "This is your first success factor.\n" +
                            "\n" +
                            "Your new product release email is the medium to inform and raise awareness of your contacts about the newly available product.\n" +
                            "\n" +
                            "The team behind the product is excited about it. And it’s best to build the same hype for the new product outside your company.\n" +
                            "\n");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  The Reorder Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();
                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Hi there"+"\n\n" +
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
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  The Announcement Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();

                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                           "\n" +
                            "This is a brand that sells high-quality bouquets and wreaths made from sustainably grown plants. \n" +
                            "\n" );

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  The Anniversary Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();
                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Dear Sir/Madam"+"\n\n" +
                            "[COMPANY NAME] offers free shipping on selected orders to celebrate [CAUSE OD CELEBRATION] 90th anniversary.\n" +
                            "\n");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  The Confirmation Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();
                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Hi there ,"+"\n\n" +
                            "Thank you for using the [Abstract Annual Business plan!] We've\n" +
                            "successfully processed your payment of [$650.00].\n" +
                            "You can access your subscription information from your settings page. If\n" +
                            "you have any further questions please visit our help center or contact\n" +
                            "support.");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

                        }
                    });

                }

                else if (s.equals("•  The Welcome Email"))
                {
                    String fromtext  =from.getText().toString();
                    String totext=to.getText().toString();

                    String reasontext= reason.getText().toString();
                    String subjecttext = subject.getText().toString();

                    textView.setText("From:- "+fromtext +"\n\n"+
                            "To:- "+ totext+"\n\n"+
                            "Subject:- "+subjecttext+"\n\n"+"Hi there"+"\n\n" +
                           "Thanks for signing up to keep in touch with Virgin America. From now on, you'll\n" +
                            "get regular updates on fare sales and special offers from the airline making\n" +
                            "flying good again. And since you'll be the first to know, you can always fly with\n" +
                            "the best fares we've got (in addition to the usual moodlighting, WiFi“, food on\n" +
                            "demand, TV, movies, and more).\n" +
                            "In the meantime, check out our Fares to Fly By and get a jump on your next\n" +
                            "getaway. Here's to the start of a healthy digital relationship.\n" +
                            "Cheers,");

                    copy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            String getstring = textView.getText().toString();
                            clipboard.setText(getstring);
                            Toasty.success(formalemail1.this,"Copied to your Clipboard",Toasty.LENGTH_LONG).show();

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