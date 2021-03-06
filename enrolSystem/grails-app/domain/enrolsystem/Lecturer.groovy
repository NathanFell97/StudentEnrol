package enrolsystem

class Lecturer {

	String fullName
	String post
	String subject
	String lecturerEmail
	String office
	String bio

    static constraints = {

	fullName nullable: false, blank: false
	post nullable: false, blank: false
	subject nullable: false, blank: false
	lecturerEmail nullable: false, blank: false
	office nullable: false, blank: false
	bio nullable: false, blank: false, maxSize: 5000
    }
}
