# bsc23_season

BScDevOps Assign - Team 

# Table of Contents
Preamble
Product Owner
Rockstars
Project Deadline
Project Specification
Useful Links
More Information
Risk Register
Tenants of Design
Social Contract
Meetings
Communication
Other
Branching Strategy
Estimating Story Points
Definition of Ready
Definition of Done
Preamble
This is the online repository for the DevOps Assignment.

<>.
Our product will be delivered using an Agile methodology that embraces the DevOps culture. Please note that our culture embraces change and these documents are treated as living, breathing artefacts that will be continuously updated.

# Scrum Master
- Week 4 Scrum Master - Jack Mac Intyre L00158710
- Week 5 Scrum Master - Andrae Tuliao L00159024 
- Week 6 Scrum Master - Daniel Gallagher L00158616
- Week 7 Scrum Master - Shane Mc Shane L00159116
- Week 8 Scrum Master - Damian Kos L00166003
- Week 9 Scrum Master - Jakub Piascik L00166413
- Week 10 Scrum Master - Ivan Bibat L00167791
- Week 11 Scrum Master - Malachy Mc Innes L00169436


# Product Owner
Malachy Mc Innes L00169436 (Permanent)

# Project Deadline
Refer to BB for deadlines

# Project Specification
Clean and simple design
User access levels (client, administrator)
Includes at least one self developed api and one webservice
To be run over <specify platform>

# Frameworks
We will be using SQL for our database
Database persistence technology
Define the business Requirements
Named queries and database triggers for security
Regex for cleansing and validation of data before sending to the database.


# Useful Links
 - Project Slack: https://app.slack.com/client/T0419S2HV9B/C060GTFG3UM
 - GitHub: https://github.dev/ruthlennonatu/bsc23_season

# Questions
Questions for the customer: Club, County, Team, Sport, Country, Reward Suggestions
Customer Details: Name, Address, Gender (optional), D.O.B, Phone number, Email
Types of membership: Season pass, Lifetime, Auto Renewal, Payment Options, Discount Code, Children Option, Family Pass
Clarification of most of the project specification


# Section	Description
Process	Describes the companies process
Project Log	Log of project activities
Costings	Overview of the project cost
Architecture	Outlines the architecture
Environments	Overview of the environment set-up
DR Plan	Disaster Recovery Plan and procedures
Requirements	Overview of the requirements for the project
SLAs	Service level agreements
Risk Management	How we manage risk
Security	Overview of security
Project Log	Team log for the project

# Risk Register
These are the current Risks on the project, re-aligned on a weekly basis


# Tenants of Design
The code framework to be used will be Java, we will be programming using the app IntelliJ

# Security:
- SpotBugs: uses static analysis to find bugs in java code. 
 
- PMD: Static code anaylsis checking tool. The tool scans Java source files to look for potential vulnerabilities such as coding errors and security flaws. It offers a cheap alternative to the tedious process of continually going over a huge code base. PMD is also capable of detecting other issues, such as dead code and performance issues along with poor code practices and styling. PMD has been installed through GitHub actions to scan code as it is commited.

# Testing:
    Unit testing
    integration testing
    UA
    API Testing
# Environments:
    staging and production
    tight configuration management for consistency and reproducibility
    automated creation and deployments
    integrated and automated pipeline (commit -> test -> deploy)
# Github version control:
    branches used
    version/release management

# Agile project management methods/principles (jira)

# Social Contract
    Mobile phones be left on silent during sprint sessions and class time.
    Be on time for team meetings and class, if you are running late let the group know by sending a message into the Slack channel.
    Everyone has an equal voice and valuable contribution.
    When you are assigned a job, take ownership of it and keep it up to date, do not be afraid to ask others for help, always be honest about your work.
    Do not speak over someone when they are expressing a point, everyone has an equal voice.
    No blame culture.
    Do not be afraid to ask for help, we are all learning.
    No invisble work.
    Ask questions to make sure you understand the task given to you.
    Try have some fun, team work makes the dream work.
    Use Agile methodoligies in the project at all times.

# Meetings
Stand-ups will occur on Every Friday at 1:30 online and at Wednesday between 11:30 - 1:30
The order that people give their updates will be based starting with the scrum master and going clockwise around the group of those present at the meeting.
Updates will be in the form: What I've done, Impediments, What I plan to do.
Sprint planning will occur at the start of class every week at the end of our sprint.
Please add and update items within <<issue management tool>> a prior to the sprint planning session.
Sprint retro will at the end of our sprint on <<Date/Time>> (timebox retro for 15 minutes, to be organised by the scrum master).
The order that people present their sprint retro updates will be based on The Team 1 list in the Assign_BSc_DevOps_2022.pdf file on blackboard of those present at the meeting.
Points raised in the sprint retro will be noted and posted on the slack channel by the Scrum Master. The Scrum Master is rotated per team member every week.
Backlog refinement will happen on <<date/time>> during our sprint.
Task estimation will be done using poker planner. 
Come prepared to meetings.
Be on time for Stand Ups and meetings.
Mobile phones on silent.
Everyone has equal voice and valuable contribution.
Keep your language and tone professional at all times.
Be honest.

# Communication
Slack is the preferred method of communication.
Communication in this order: Slack, WhatsApp, Microsoft Teams, E-Mail
If a demonstration is required use Zoom, record the session and upload to the Slack channel.
No Slack communications between 9PM and 9AM.
Raise a problem as soon as you see it.
Respect each other and understand differences in knowledge.
All team documents are to be created using Markdown language and shared on GitHub.
There are no silly questions, if you don’t understand, ask.
Share success stories.
Focus on the positives.
Don’t make assumptions.
Don’t interrupt and cut another person off while they are talking.
Listen when someone is talking, don’t interject.
Zero tolerance for bullying.

# Agile way of working.
If are assigned a job, take ownership of it and keep it up to date.
Stick to your agreed working patterns. Let the team know when you are late or going early.
Keep JIRA board updated at all times.
Update the Scrum Board as you progress the story i.e. don’t update at standup.
Don't be afraid to ask for help.
Don't be afraid to give constructive criticism, as long as it is constructive.
Solve roadblocks within the team. If the impediment can’t be solved within the team then give it to the Scrum Master.
Other
Sprints will start after the stand up that happens at the start of class each week.
The Scrum Master role rotates each week, the schedule is available on the on the process section
Poker Planner will be used for task management and planning.
Each member of the team will work approximitely 3 hours per week, unless they are on vacation.
Our branching stategy will start with gh then the issue number followed by wip

# Estimating Story Points
The teams team's velocity is calculated by the number of story points we achieve on average in the previous sprints.

The teams current story point velocity is "16".

# Definition of Ready
Story is pointed
Enough information to start
Acceptance criteria is defined
Definition of Done
Code
Min of 1 reviewer
Merged into main
Deployed successfully
Deployment Tested
Documentation
Reviewed, followed and executed by Reviewer
Working solution over documentation
