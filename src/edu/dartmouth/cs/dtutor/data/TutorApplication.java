package edu.dartmouth.cs.dtutor.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.util.Log;

/**
 * The following data class is based on the Tutor application as designed by the Dartmouth Tutor Clearinghouse:
 * 
 * http://www.dartmouth.edu/~acskills/tutors/fortutors/index.html
 */
public class TutorApplication {

    public static final String TAG = ".TutorApplication";

    /**
     * The following are application question codes and an identifying string.
     */
    private static final Map<Integer, String> questions;
    static
    {
        questions = new HashMap<Integer, String>();
        questions.put(0, "First Name");
        questions.put(1, "Last Name");
        questions.put(2, "Dartmouth ID");
        questions.put(3, "Class Year");
        questions.put(4, "Courses");
        questions.put(5, "Maximum Students");
        questions.put(6, "Tutor Type");
        questions.put(7, "Athlete");
        questions.put(8, "Gender");
        questions.put(9, "Ethnicity");
        questions.put(10, "Greek Affiliation");
        questions.put(11, "Visa Status");
        questions.put(12, "Visa: OPT Start Date");
        questions.put(13, "Visa: I-20 End Date");
        questions.put(14, "Employment Form Submitted");
        questions.put(15, "How You Heard About Us");
        questions.put(16, "Special Comments");
    }
    
    // Basic information
    private String mFirstName;
    private String mLastName;
    private String mDartmouthId;
    private int mClassYear;

    // Courses the student wants to tutor
    private List<Course> mCourses;

    // Max # of students that can be tutored
    private int mMaxStudents;

    // Special attributes about applicant
    private String mAttrTutorType;    // "Pay it Forward" as a volunteer? Or paid tutor?
    private String mAttrAthlete;      // Name of sport (if applicant is an athlete)

    // Applicant demographics
    private String mGender;           // Male, Female, other...
    private String mEthnicity;        // Caucasian, Hispanic/Latino(a), African/African American, etc.
    private String mGreekAffiliation; // Greek house (if any)

    // International students are subject to specific employment rules
    private String mVisaStatus;
    private Calendar mVisaStartDate;
    private Calendar mVisaEndDate;

    // All students who are employed by the College MUST have these forms submitted
    // and verified by the Payroll Office within the first 3 days of employment.
    private Boolean mEmploymentFormsSubmitted;

    // Feedback/other
    private String mHeardAboutUs;     // How did the applicant learn about TC?
    private String mSpecialComments;  // Any other comments regarding application

    /**
     * Construct default application data.
     * 
     * NOTE: null/negative values are required elements and must be changed before 
     * an application can be successfully submitted!
     * 
     * TODO: [Question] Should a TutorApplication extend an Application?
     * TODO: [Question] Should an application take a Member as a parameter to the
     * constructor so that it can just pull applicant info if it is already available?
     */
    public TutorApplication() {
        mFirstName = null;
        mLastName = null;
        mDartmouthId = null;
        mClassYear = -1;
        mCourses = null;
        mMaxStudents = -1;
        mAttrTutorType = null;
        mAttrAthlete = null;
        mGender = "n/a";
        mEthnicity = "n/a";
        mGreekAffiliation = "n/a";
        mVisaStatus = null;
        mVisaStartDate = null;
        mVisaEndDate = null;
        mEmploymentFormsSubmitted = null;
        mHeardAboutUs = "";
        mSpecialComments = "";
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    
    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    
    /**
     * @param DartmouthId the DartmouthId to set
     */
    public void setDartmouthId(String dartmouthId) {
        this.mDartmouthId = dartmouthId;
    }

    
    /**
     * @param ClassYear the ClassYear to set
     */
    public void setClassYear(int classYear) {
        this.mClassYear = classYear;
    }

    
    /**
     * @param Courses the Courses to set
     */
    public void setCourses(List<Course> courses) {
        this.mCourses = courses;
    }

    
    /**
     * @param MaxStudents the MaxStudents to set
     */
    public void setMaxStudents(int maxStudents) {
        this.mMaxStudents = maxStudents;
    }

    
    /**
     * @param AttrTutorType the AttrTutorType to set
     */
    public void setAttrTutorType(String attrTutorType) {
        this.mAttrTutorType = attrTutorType;
    }

    
    /**
     * @param AttrAthlete the AttrAthlete to set
     */
    public void setAttrAthlete(String attrAthlete) {
        this.mAttrAthlete = attrAthlete;
    }

    
    /**
     * @param Gender the Gender to set
     */
    public void setGender(String gender) {
        this.mGender = gender;
    }

    
    /**
     * @param Ethnicity the Ethnicity to set
     */
    public void setEthnicity(String ethnicity) {
        this.mEthnicity = ethnicity;
    }

    
    /**
     * @param GreekAffiliation the GreekAffiliation to set
     */
    public void setGreekAffiliation(String greekAffiliation) {
        this.mGreekAffiliation = greekAffiliation;
    }

    
    /**
     * @param VisaStatus the VisaStatus to set
     */
    public void setVisaStatus(String visaStatus) {
        this.mVisaStatus = visaStatus;
    }

    
    /**
     * @param VisaStartDate the VisaStartDate to set
     */
    public void setVisaStartDate(Calendar visaStartDate) {
        this.mVisaStartDate = visaStartDate;
    }

    
    /**
     * @param VisaEndDate the VisaEndDate to set
     */
    public void setVisaEndDate(Calendar visaEndDate) {
        this.mVisaEndDate = visaEndDate;
    }

    
    /**
     * @param EmploymentFormsSubmitted the EmploymentFormsSubmitted to set
     */
    public void setEmploymentFormsSubmitted(Boolean employmentFormsSubmitted) {
        this.mEmploymentFormsSubmitted = employmentFormsSubmitted;
    }

    
    /**
     * @param HeardAboutUs the HeardAboutUs to set
     */
    public void setHeardAboutUs(String heardAboutUs) {
        this.mHeardAboutUs = heardAboutUs;
    }

    
    /**
     * @param SpecialComments the SpecialComments to set
     */
    public void setSpecialComments(String specialComments) {
        this.mSpecialComments = specialComments;
    }    
    
    public void addCourse(Course course) {
        if(mCourses == null)
            mCourses = new ArrayList<TutorApplication.Course>();
        mCourses.add(course);
    }
    
    public void removeCourse(Course course) {
        mCourses.remove(course);
    }

    /**
     * Debug: dump application contents.
     * 
     * @return application data.
     */
    public String dumpSummary() throws NullPointerException {
        String summary = "";
        
        summary += questions.get(0) + ": " + mFirstName;
        summary += questions.get(1) + ": " + mLastName;
        summary += questions.get(2) + ": " + mDartmouthId;
        summary += questions.get(3) + ": " + mClassYear;
        summary += questions.get(4) + ":\n";
        for(Course course : mCourses) { summary += "  * " + course.toString() + "\n"; }
        summary += questions.get(5) + ": " + mMaxStudents;
        summary += questions.get(6) + ": " + mAttrTutorType;
        summary += questions.get(7) + ": " + mAttrAthlete;
        summary += questions.get(8) + ": " + mGender;
        summary += questions.get(9) + ": " + mEthnicity;
        summary += questions.get(10) + ": " + mGreekAffiliation;
        summary += questions.get(11) + ": " + mVisaStatus;
        summary += questions.get(12) + ": " + mVisaStartDate;
        summary += questions.get(13) + ": " + mVisaEndDate;
        summary += questions.get(14) + ": " + mEmploymentFormsSubmitted;
        summary += questions.get(15) + ": " + mHeardAboutUs;
        summary += questions.get(16) + ": " + mSpecialComments;
        
        return summary;
    }

    /* ****************************************************************** *
     *              Helper method(s): application submission
     * ****************************************************************** */

    /**
     * Attempt to submit the application. I
     * @return true if the application was submitted, false otherwise.
     */
    public boolean submit() {
        boolean passed_validation = validate();
        if(passed_validation) {
            // TODO: write to local database & send to remote server...
            Log.i(TAG, "submit application SUCCESS!");
        } else {
            Log.i(TAG, "submit application FAILED!");
        }
        return passed_validation;
    }
    
    /**
     * Validate that all required fields are filled out before allowing submission.
     * @return true if application passes validation, false otherwise.
     */
    public boolean validate() {
        ArrayList<Integer> problemCodes = new ArrayList<Integer>();
        boolean pass = true;
        
        if(isNullOrEmpty(mFirstName)) {
            problemCodes.add(0);
            pass = false;
        }
        if(isNullOrEmpty(mLastName)) {
            problemCodes.add(1);
            pass = false;
        }
        if(isNullOrEmpty(mDartmouthId)) {
            problemCodes.add(2);
            pass = false;
        }
        if(isNegative(mClassYear)) {
            problemCodes.add(3);
            pass = false;
        }
        if(isNull(mCourses)) {
            problemCodes.add(4);
            pass = false;
        }
        if(isNegative(mMaxStudents)) {
            problemCodes.add(5);
            pass = false;
        }
        if(isNullOrEmpty(mAttrTutorType)) {
            problemCodes.add(6);
            pass = false;
        }
        if(isNullOrEmpty(mAttrAthlete)) {
            problemCodes.add(7);
            pass = false;
        }
        if(isNullOrEmpty(mVisaStatus)) {
            problemCodes.add(11);
            pass = false;
        } else {
            if(isNull(mVisaStartDate)) {
                problemCodes.add(12);
                pass = false;
            }
            if(isNull(mVisaEndDate)) {
                problemCodes.add(13);
                pass = false;
            }
        }
        if(isNull(mEmploymentFormsSubmitted)) {
            problemCodes.add(14);
            pass = false;
        }

        Log.w(TAG, generateValidationFeedback(problemCodes));
        return pass;
    }
    
    private boolean isNull(Object obj) {
        return obj == null;
    }
    
    private boolean isNegative(int num) {
        return num < 0;
    }
    
    private boolean isNullOrEmpty(String str) {
        return (str == null || str.equalsIgnoreCase(""));
    }

    /**
     * Return a feedback string based on any required questions in the application
     * that were not filled out.
     * 
     * @param codes
     * @return feedback message.
     */
    private String generateValidationFeedback(ArrayList<Integer> codes) {
        String feedback = "";
        for(Integer code : codes)
            feedback += "Field '" + questions.get(code) + "' is required.\n";
        return feedback;
    }
    
    /* ****************************************************************** *
     *           Class for storing data about courses that the 
     *                  student wants to tutor for...
     * ****************************************************************** */

    public class Course {

        public String courseSubject;
        public int courseNumber;
        public String courseProfessor;

        public Course() {}

        public String toString() {
            return courseSubject + " " + courseNumber + " [" + courseProfessor + "]";
        }
        
    }

}
