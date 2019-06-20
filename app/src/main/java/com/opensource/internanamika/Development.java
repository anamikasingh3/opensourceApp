package com.opensource.internanamika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Development extends AppCompatActivity {
    private TextView details;
    private TextView topic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_development);
        details = findViewById(R.id.detailssssss);
        topic = findViewById(R.id.opennnnnn);


        topic.setText("How to be a Developer at OpenSource");
        details.setText("Want to contribute to an open source project, but don't know where to start? Finding the first problem to fix in an unfamiliar codebase can seem pretty difficult—and even more so if it counts millions of lines of code—but it's usually much easier than it looks. This article should give you a few tips and ideas on how to get started.\n" +
                "\n" +
                "Choose wisely\n" +
                "Developers contribute to open source projects for a variety of reasons. Some want to fix a bug or add a missing feature, while others are looking to gain experience or for a chance to work with an interesting technology. Whatever your reason is, make sure you pick a project that you care about and use yourself. You may end up spending a considerable amount of time working on it, and relating to the project will help you stay motivated.\n" +
                "\n" +
                "Set up your dev environment\n" +
                "Before you can contribute any code to a project, you'll need to be able to compile it, test, and debug on your computer. Setting up the dev environment is also a good first step to acquainting yourself with the codebase.\n" +
                "\n" +
                "Clone the project's repository and see how you can do that. Usually, there will be specific instructions in the project's ‘README’ file. Install all the tools and dependencies and configure your system. If there are automated tests, make sure you can run them.\n" +
                "\n" +
                "This can be awfully simple for smaller projects. You may not even need to do anything at all if you're dealing with an interpreted language. On the other hand, it's likely to take a while if you're compiling the Linux Kernel, GTK, or a similar-sized application for the very first time.\n" +
                "\n" +
                "Getting grips with the build system is very important. You'll be able to experiment with the code, change it, and see what happens. It will also make it much easier for you to understand what people are talking about.\n" +
                "\n" +
                "Get in the loop\n" +
                "Join the mailing list, visit the IRC channel, see the bug tracker, and read the project wiki. There are many ways in which the teams behind open source projects communicate. Be where the developers are. You don't need to participate yourself if you don't want to, just see what's going on.\n" +
                "\n" +
                "Chances are that the communication will make more sense if you're a user of the application yourself, and if you've set up the dev environment and tried compiling it.\n" +
                "\n" +
                "Joining a mailing list for a large project can bring tens or even hundreds of emails into your inbox every day. Many of them will be patches or make no sense whatsoever. Don't worry about that, and certainly don't feel obliged to read them all. Watch how the developers work and you'll slowly start figuring it all out.\n" +
                "\n" +
                "Get in touch\n" +
                "When you've been reading the mailing list, watching the bug tracker for a while, and still haven't found anything to work on, don't be afraid to ask. Try the IRC channel first—explain that you've been experimenting with the project and are looking for something to do. If the project page specifies a preferred way of communicating with them, try that instead.\n" +
                "\n" +
                "You can also email one of the maintainers or developers asking for pointers on how to get involved. Again, explain what you've tried doing, but keep it short and polite. Remember that they do it in their spare time and may be quite busy.\n" +
                "\n" +
                "Be wary of sending these beginner questions to project mailing lists or forums. Your email could be reaching thousands of subscribers who may only expect technical discussions to happen there. Make sure general questions are welcome.\n" +
                "\n" +
                "Always ask somebody before you embark on adding significant features or carrying out substantial refactoring. Your changes may go against what the authors had planned for and be rejected. Not all maintainers are keen on accepting massive change sets from new contributors. Earn their trust first.\n" +
                "\n" +
                "Submitting patches\n" +
                "The general rule here is: if you want your code to be included upstream, make it as easy as possible for the maintainer to do that. Don't ignore the patch submission guidelines and follow the preferred code formatting and naming conventions. If there are unit tests, run them and fix all the ones you break. If you're adding new code, add test coverage for it too.\n" +
                "\n" +
                "Don't be discouraged if the first code review you receive isn't exactly positive. Take the opportunity to learn from the reviewer's objections, change your code, and submit it again. It doesn't necessarily mean that you were horribly wrong, it’s just that the maintainers have different ways of doing it and are trying to keep the codebase consistent.\n" +
                "\n" +
                "If your change ends up being rejected after all, whatever the reason is, don't take it personally and try something else. Consider talking to the maintainers first so you know what they want. If your ideas are that much different, it may be easier to move on to another project. There are so many of them, and you'll most certainly find one that will work for you.\n" +
                "\n" +
                "The rewards\n" +
                "Contributing to open source can be incredibly rewarding. You'll meet lots of like-minded people and make many friends along the way. Your code could be running on millions of computers and making an impact within a couple months of submitting it. It can be lots of hard work, especially when you're just starting out, but it's well worth it. Just pick a project and start being an open source developer!");


    }
}
