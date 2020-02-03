package enrolsystem

class Modules {

	String module_title
	String module_code
	int credits
	String lecturer
	String course
	String description

    static constraints = {

	module_title nullable: false, blank: false
	module_code nullable: false, blank: false
	credits nullable: false, blank: false, maxSize: 120, minSize: 20
	lecturer nullable: false, blank: false
	description nullable: false, blank: false, maxSize: 5000
    }
}
