package childrensbookassignment

class Book {
	//DEFAULT: TO NOT ALLOW FIELDS TO BE NULL

	String title
	String author
	String description
	Integer minGradeLevel
	Integer maxGradeLevel
	String ISBN
	String language
	String category
	
	
	static main( args ){
		def allBooks = Book.list()
		println allBooks.size()
	}
	
    static constraints = { //we allow a field to be optional (nullable:true), but if it is supplied, we can force it to match a pattern
							//ex: homepage(url:true,nullable:true)
		author(blank:false)
		title(blank:false)
		minGradeLevel(minSize: 0, maxSize: 6, blank:false)
		maxGradeLevel(minSize: 0, maxSize: 6, blank:false)
		language(blank: false)
		category(inList: ["General leisure reading", "Reading skills", "Math skills", "Health", "Science"])
		description(nullable:true)
		ISBN(nullable:true, matches: '(ISBN)+( |-)+[0-9]+( |-)+[0-9]{5}+( |-)+[0-9]{3}+( |-)+[0-9]') 
    }
}
