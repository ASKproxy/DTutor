<!--
Use pandoc to generate pdf from markdown file using template

pandoc -N --template=pdf-template.tex --variable mainfont="Times Roman" --variable sansfont=Arial --variable fontsize=11pt --variable version=1.10 --latex-engine=xelatex --variable title="DTutor Design Document" --variable author="Travis Peters, Haider Syed, Arvind Kumaran" --toc dtutor-design.md -o dtutor-design-v1.pdf
-->

#Overview

##Application Description

DTutor is a specialty smartphone app designed **by** students **for** students. Our primary goal in creating this application is to help students of all disciplines get the help they need, set/monitor goals, connect with peers, and explore the vast educational resources that Dartmouth College has to offer. 

##Project Scope

Due to the limited time left in the course, we intend to specfically address the following application components/features:

* DTutor profile
	* Fill out Dartmouth's Tutor/Tutee application.
	* Define contact info for meeting with tutors/tutees or other students for a study group.
* Connect with students to form study groups
* Tutor browser
	* Request to be tutored by a tutor you know
	* Get matched with a tutor by us
* Reserve a space for your study group
* Set and monitor goals
	* Additionally, share goals with family, friends, coaches, professors, advisors, etc.
* Learn about Dartmouth educational resources
	* Connect with Tutor Clearninghouse staff
	* Schedule academic advising
	* ...
* ...

#User Interface

##Main Activity

###Home Fragment

###Connect Fragment

###Profile Fragment

#Database Implementation

##Relevant Data Structures

##Database Schema

#Service Implementation

##Service 1

##Servce 2
