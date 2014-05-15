package edu.dartmouth.cs.dtutor.data;

public class Member {
    
	public static final String MEMBER_NAME = "name";
    public static final String MEMBER_ROLE = "role";
    public static final String MEMBER_EMAIL = "email";
    public static final String MEMBER_DARTMOUTH_ID = "dartmouth_id";
	public static final String MEMBER_ADDRESS = "addr";
	public static final String MEMBER_PHONENUM = "phone";

	// Required fields
	public String mName;
    public String mRole; // TODO: ArrayList of roles? Tutor, Tutee, Administrator, Developer, etc...
    public String mEmail;
    
    // Dartmouth specific (may not be applicable beyond Dartmouth students...)
    public String mDartmouthId;
    
    // Optional fields
	public String mAddress;
	public String mPhoneNumber;

	public Member(String name, String role, String email) {
		mName = name;
		mRole = role;
		mEmail = email;
	}

	public String toString() {
	    return debugDump();
	}
	
	public String debugDump() {
	    String str = "";

	    // TODO: finish...
	    str += MEMBER_NAME + ": " + mName + "\n";
	    
	    return str;
	}
	
}
