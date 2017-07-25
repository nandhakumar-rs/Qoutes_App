package com.example.nandhu.qoutes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_action_log);
        setContentView(R.layout.activity_main2);
        TextView textView =(TextView) findViewById(R.id.text);
        int value = getIntent().getIntExtra("intent",i);
        ArrayList<secword> word= new ArrayList<secword>();
        word.add(new secword("“People are just as happy as they make up their minds to be.”","― Abraham Lincoln"));
        word.add(new secword("“When one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us.”","― Helen Keller"));
        word.add(new secword("“Simplicity is the key to brilliance.”","– Bruce Lee"));
        word.add(new secword("“You must be the change you wish to see in the world.”","– Mahatma Gandhi"));
        word.add(new secword("“There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.”","― Albert Einstein"));
        word.add(new secword("“I have not failed. I’ve just found 10,000 ways that won’t work.”","― Thomas A. Edison"));
        word.add(new secword("“Be yourself; everyone else is already taken.”","― Oscar Wilde"));
        word.add(new secword("“No one can make you feel inferior without your consent.”","– Eleanor Roosevelt"));
        word.add(new secword("“We are what we repeatedly do. Excellence, then, is not an act, but a habit.”","– Aristotle"));
        word.add(new secword("“Friendship is born at that moment when one person says to another:"+ "\n “What! You too? I thought I was the only one.”","― C.S. Lewis"));
        word.add(new secword("“I’m selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can’t handle me at my worst, then you sure as hell don’t deserve me at my best.”","― Marilyn Monroe"));
        word.add(new secword("“The only man who never makes mistakes is the man who never does anything.”","―  Theodore Roosevelt"));
        word.add(new secword("“Be thankful for what you have; you’ll end up having more. If you concentrate on what you don’t have, you will never, ever have enough.”","– Oprah Winfrey"));
        word.add(new secword("“If you haven’t found it yet, keep looking. Don’t settle. As with all matters of the heart, you’ll know when you find it. And, like any great relationship, it just gets better and better as the years roll on.”","– Steve Jobs"));
        word.add(new secword("“Not all of us can do great things. But we can do small things with great love.”","― Mother Teresa"));
        word.add(new secword("“The future belongs to those who believe in the beauty of their dreams.”","― Eleanor Roosevelt"));
        word.add(new secword("“The truth is, everyone is going to hurt you. You just got to find the ones worth suffering for.”","― Bob Marley"));
        word.add(new secword("“To live is the rarest thing in the world. Most people exist, that is all.”","― Oscar Wilde"));
        word.add(new secword("“We are all in the gutter, but some of us are looking at the stars.”","― Oscar Wilde"));
        word.add(new secword("“Look at a day when you are supremely satisfied at the end. It’s not a day when you lounge around doing nothing, it’s a day you’ve had everything to do and you’ve done it.”"," – Margaret Thatcher"));
        word.add(new secword("“Don’t cry because it’s over, smile because it happened.”","― Dr. Seuss"));
        word.add(new secword("“Be who you are and say what you feel, because those who mind don’t matter, and those who matter don’t mind.”","― Bernard M. Baruch"));
        word.add(new secword("“You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.”","― Dr. Seuss"));
        word.add(new secword("“You’ve gotta dance like there’s nobody watching,\n" +
                "Love like you’ll never be hurt,\n" +
                "Sing like there’s nobody listening,\n" +
                "And live like it’s heaven on earth1.”","– William W. Purkey"));
        word.add(new secword("“Imagination is the beginning of creation. You imagine what you desire; you will what you imagine; and at last you create what you will.”","– George Bernard Shaw"));
        word.add(new secword("“Success usually comes to those who are too busy to be looking for it.”","– Henry David Thoreau"));
        word.add(new secword("“What the mind of man can conceive and believe, the mind of man can achieve.”","– Napoleon Hill"));
        word.add(new secword("“The fear of death follows from the fear of life. A man who loves fully is prepared to die at any time.”","– Mark Twain"));
        word.add(new secword("“There are no accidents…there is only some purpose that we haven’t yet understood.”","– Deepak Chopra"));
        word.add(new secword("“Be miserable. Or motivate yourself. Whatever has to be done, it’s always your choice.”","– Wayne Dyer"));
        word.add(new secword("“Impossible is a word to be found only in the dictionary of fools.”","– Napoleon Bonaparte"));
        word.add(new secword("“The only way of finding the limits of the possible is by going beyond them into the impossible.”","– Arthur C. Clarke"));
        word.add(new secword("“Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do. So throw off the bowlines, Sail away from the safe harbor, Catch the trade winds in your sails. Explore. Dream. Discover.”","– Mark Twain"));
        word.add(new secword("“People often say that motivation doesn’t last. Well, neither does bathing – that’s why we recommend it daily.”","– Zig Ziglar"));
        word.add(new secword("“What we can or cannot do, what we consider possible or impossible, is rarely a function of our true capability. It is more likely a function of our beliefs about who we are.”","– Anthony Robbins"));
        word.add(new secword("“There is just one life for each of us: our own.”","– Euripides"));
        word.add(new secword("“Don’t walk behind me; I may not lead. Don’t walk in front of me; I may not follow. Just walk beside me and be my friend.”","― Albert Camus"));
        word.add(new secword("“In three words I can sum up everything I’ve learned about life: it goes on.”","― Robert Frost"));
        word.add(new secword("“Remember, happiness doesn’t depend upon who you are or what you have, it depends solely upon what you think.”","– Dale Carnegie"));
        word.add(new secword("“Man’s mind, once stretched by a new idea, never regains its original dimensions.”","― Oliver Wendell Holmes, Jr"));
        word.add(new secword("“My favorite things in life don’t cost any money. It’s really clear that the most precious resource we all have is time.”","– Steve Jobs"));
        word.add(new secword("“I failed in some subjects in exam, but my friend passed in all. Now he is an engineer in Microsoft and I am the owner of Microsoft.”","– Bill Gates"));
        word.add(new secword("“Don’t compare yourself with anyone in this world…if you do so, you are insulting yourself.”","– Bill Gates"));
        word.add(new secword("“Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven’t found it yet, keep looking. Don’t settle. As with all matters of the heart, you’ll know when you find it.”","– Steve Jobs"));
        word.add(new secword("“It’s fine to celebrate success but it is more important to heed the lessons of failure.”","– Bill Gates"));
        word.add(new secword("“People don't care about what you say, they care about what you build.”","– Mark Zuckerberg"));
        word.add(new secword("“Sometimes when you innovate, you make mistakes. It is best to admit them quickly, and get on with improving your other innovations.”","― Steve Jobs"));
        word.add(new secword("“I choose a lazy person to do a hard job. Because a lazy person will find an easy way to do it.”","― Bill Gates"));
        word.add(new secword("The Hacker Way is an approach to building that involves continuous improvement and iteration. Hackers believe that something can always be better, and that nothing is ever complete.","– Mark Zuckerberg"));
        word.add(new secword("“That’s been one of my mantras—focus and simplicity. Simple can be harder than complex; you have to work hard to get your thinking clean to make it simple.”","― Steve Jobs"));
        textView.setText(word.get(value-1).getPword());
        TextView textView1= (TextView)findViewById(R.id.text2);
        textView1.setText(word.get(value-1).getSword());

    }
}
