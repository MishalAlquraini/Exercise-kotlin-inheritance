package library

class NonFictionBook (title: String, author: String, ISBN: Int, var subject: String):
    Book(title, author, ISBN){
    fun nonFiction() = "I hate fiction"
    override fun displayInfo() = "${super.displayInfo()} Subject: $subject"
    }
