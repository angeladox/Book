package childrensbookassignment

class BookController {
	def scaffold = true
	def bookService
	
	def index = {redirect(action:random)}
	def home = { 
		render "<h1>Welcome to Angela's children's book web application. \n"+
			"Please copy: 'http://localhost:8080/ChildrensBookAssignment/book/list' into your browser to continue.</h1>"
	}
	
	def ajaxRandom = {
		def randomBook = bookService.getRandomBook()
		render (view:"bookBody", model: [aBook:randomBook])
	}
	
	def random = {
		def thisRandomBook = bookService.getRandomBook()
		[aBook : thisRandomBook]
	}
}
