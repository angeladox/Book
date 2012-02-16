package childrensbookassignment

class BookService {	
   boolean transactional = false 
	def getStaticBook() { 
		return new Book(title: "Basic Book", author: "Anonymous", 
			description: "No description", minGradeLevel: "0", maxGradeLevel: "6", 
			language: "English", category: "General leisure reading")
	}
	
	def getRandomBook() {
		def allBooks = Book.list()
		def randomBook = null
		if (allBooks.size() > 0) {
			def randomIdx = new Random().nextInt(allBooks.size())
			randomBook = allBooks[randomIdx]
		} else {
			randomBook = getStaticBook()
		}
		return randomBook
	}

}
