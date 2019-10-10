package hello

class WelcomeController {

    def index() {
        String n = params.name ?: 'World'
        render "<h2>Hello, ${n}</h2>"
    }


}
