package com.opensource.internanamika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Internships extends AppCompatActivity {
    private TextView details;
    private TextView topic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("OpenSource");
        setContentView(R.layout.activity_internships);
        details = findViewById(R.id.detailsss);
        topic = findViewById(R.id.opennn);


        topic.setText("About Open Source");
        details.setText("I have listed the most useful information as possible but it is always a good idea to check the project website. Do note that this is not a ranking of internships. It’s just a list with no specific order. Number 1 is not ‘better’ than number 11.\n" +
                "\n" +
                "1. Snowplow\n" +
                "Snowplow – Data Analytics company using a variety of languages and foss products/projects.\n" +
                "\n" +
                "\n" +
                "The internships run twice a year.\n" +
                "\n" +
                "Snowplow\tDetails\n" +
                "Eligibility Criteria\tNone\n" +
                "Internship period\t(May through August), for a 6-8 week paid internship\n" +
                "Application deadline\t\n" +
                "Stipend\tCase by Case basis.\n" +
                "Location\tRemote\n" +
                "2. FSF\n" +
                "FSF – The oldest, mother of all organizations which started the free software movement. The Internship program runs thrice a year.\n" +
                "\n" +
                "FSF\tDetails\n" +
                "Eligibility Criteria\tNone\n" +
                "Internship period\t3 months ( September 11th to December 8th, 2017)\n" +
                "Application deadline\tJuly 31, 2017\n" +
                "Stipend\tUnpaid\n" +
                "Location\tBoston, U.S. or Remote\n" +
                "3. X.org\n" +
                "X.org – Project which develops, maintains, supports the free software stack for accelerated graphics for all graphics hardware.\n" +
                "\n" +
                "X.org\tDetails\n" +
                "Eligibility Criteria\tNone\n" +
                "Internship period\t4 months nearly full-time work\n" +
                "Application deadline\tThroughout the year\n" +
                "Stipend\t$5000 in stages\n" +
                "Location\tRemote\n" +
                "4. RGSOC\n" +
                "RGSOC – Project to entice/enhance women participation in Rust, Clojure, JavaScript, PHP, Python, Ruby on Rails, Rails web framework etc.\n" +
                "\n" +
                "RGSOC\tDetails\n" +
                "Eligibility Criteria\tFor Girls only.\n" +
                "Internship period\t3 months (from 1st July to 30th September)\n" +
                "Application deadline\tUsually February\n" +
                "Stipend\tCase by Case basis\n" +
                "Location\tRemote\n" +
                "5. SOCIS\n" +
                "SOCIS ESA – A pan-European organization working on exploration of space, human spaceflight etc.\n" +
                "\n" +
                "SOCIS\tDetails\n" +
                "Eligibility Criteria\tStudents from the European Union\n" +
                "Internship period\t3 months (from 1st July to 30th September)\n" +
                "Application deadline\tUsually May\n" +
                "Stipend\tdepends on each mentoring organization, see below for more details\n" +
                "Location\tRemote\n" +
                "Suggested read  Apple's Mac OS X Is Open Source Now\n" +
                "6. DataONE\n" +
                "DataONE – A project to collect, understand earth observational data using a variety of sensors, testing and making cohesive sense out of the data collected.\n" +
                "\n" +
                "DataONE\tDetails\n" +
                "Eligibility Criteria\tNone.\n" +
                "Internship period\t3 months (from 1st July to 30th September)\n" +
                "Application Period\tUsally February\n" +
                "Stipend\t$5000\n" +
                "Location\tUnited States\n" +
                "7. OpenDaylight\n" +
                "\n" +
                "OpenDaylight – FOSS Project which works to use and promote software-defined networking and network functions visualization.\n" +
                "\n" +
                "Opendaylight\tDetails\n" +
                "Eligibility Criteria\tNone.\n" +
                "Internship period\t3 months (from May 30th to August 29th)\n" +
                "Application Period Deadline\tUsually January\n" +
                "Stipend\t$5000\n" +
                "Location\tRemote\n" +
                "8. OWASP\n" +
                "OWASP – An organization dealing with various facets of web application security.\n" +
                "\n" +
                "Openwasp\tDetails\n" +
                "Eligibility Criteria\tNone.\n" +
                "Internship period\t3 months (from July 3, 2017 – September 6, 2017)\n" +
                "Application Period Deadline\tUsually June\n" +
                "Stipend\t$1500\n" +
                "Location\tN/A\n" +
                "9. ICFOSS\n" +
                "ICFOSS – An autonomous organization set up by Government of Kerala for development and promotion of FOSS in India.\n" +
                "\n" +
                "ICFOSS\tDetails\n" +
                "Eligibility Criteria\tNone.\n" +
                "Internship period\t1.5 months\n" +
                "Application Period Deadline\tUsually August\n" +
                "Stipend\tUnpaid\n" +
                "Location\tRemote\n" +
                "10. ICFOSS Fellowship\n" +
                "ICFOSS – An autonomous organization set up by Government of Kerala for development and promotion of FOSS in India.\n" +
                "\n" +
                "FOSS Innovation Fellowship Programme\tDetails\n" +
                "Eligibility Criteria\tAge should not exceed 30.\n" +
                "Internship period\t3 months (from 1st April to July 30th)\n" +
                "Application Period Deadline\tUsually April\n" +
                "Stipend\tINR Rs. 20k per month\n" +
                "Location\tKerala, India\n" +
                "11. FOSSEE Internships\n" +
                "FOSSEE – An organization targeted towards development, maintenance and promotion of various FOSS projects based in the famous IIT-Mumbai.\n" +
                "\n" +
                "Fossee Internships\tDetails\n" +
                "Eligibility Criteria\tDepends on project\n" +
                "Internship period\t2 months\n" +
                "Application Period Deadline\tUsually February\n" +
                "Stipend\tUnpaid.\n" +
                "Location\tMumbai, India\n" +
                "12. The Center for Internet and Society\n" +
                "CIS – A Bangalore-based organization based organization looking at multidisciplinary research and advocacy at various levels.\n" +
                "\n" +
                "The Center for Internet and Society\tDetails\n" +
                "Eligibility Criteria\tDiverse Educational backgrounds but need to know LibreOffice\n" +
                "Internship period\t–\n" +
                "Application Period Deadline\tThroughout the year\n" +
                "Stipend\tUnpaid\n" +
                "Location\tDepends, some remote, some Bengaluru, India and New Delhi, India\n" +
                "Suggested read  10 Best LaTeX Editors For Linux\n" +
                "13. OPNFV\n" +
                "\n" +
                "OPNFV – An organization dedicated to network functions virtualization\n" +
                "\n" +
                "OPNFV\tDetails\n" +
                "Eligibility Criteria\tNone.\n" +
                "Internship period\t3 months full-time or 6 months part-time\n" +
                "Application Period Deadline\tAround the year\n" +
                "Stipend\t$5500 in stages\n" +
                "Location\tRemote\n" +
                "14. Outreachy\n" +
                "Outreachy -Outreachy started in 2006, wrapped up and started up again in 2010. I did share an interview with Maria Glukova which shared her experience. Twice a year it runs and has in excess of 30+ interns per year from 20+ projects including Debian, Redhat, OpenStack and many others.\n" +
                "\n" +
                "Outreachy\tDetails\n" +
                "Eligibility Criteria\tWomen, trans and cisgendered women\n" +
                "Internship period\t3 months\n" +
                "Application Period Deadline\tUsually in October\n" +
                "Stipend\t$5500\n" +
                "Location\tRemote\n" +
                "15. Deeproot\n" +
                "Deeproot started in 2000. Their main product is deepOfix Mail Server and is based on Debian.\n" +
                "\n" +
                "Deeproot\tDetails\n" +
                "Eligibility Criteria\tA desire to work hard on solving a practical problem using Free Software\n" +
                "Internship period\t3 months – 10 months\n" +
                "Application Period Deadline\tAll round the year\n" +
                "Stipend\tUnpaid\n" +
                "Location\tBangalore/Remote\n" +
                "16. Google Summer of Code\n" +
                "GSoC -Google Summer of Code, the one which started it all.This time it got the highest number of students from India, in excess of 228+ students from India according to GSoC’s own stats.\n" +
                "\n" +
                "The idea of giving those other GSoC programs is that almost all of the above projects were at one time or the other part of the GSoC program. GSoC is limited in the sense the program can run only from May to September while some want a whole-year around GSoC program and any limitations that Google has.\n" +
                "\n" +
                "GSoC\tDetails\n" +
                "Eligibility Criteria\tNone.\n" +
                "Internship period\t3 months\n" +
                "Application Period Deadline\tUsually in April\n" +
                "Stipend\tDepends on where you live, from $2400 to $6000\n" +
                "Location\tRemote\n" +
                "I hope this article helped you in finding an Open Source internship. If you have some other open source internships to add to this list or add some details to the existing list, thanks to let me know in the comment section below.\n" +
                "\n");


    }
}
