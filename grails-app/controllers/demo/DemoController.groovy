package demo

class DemoController {

    def index(Widget w) {
        render "First Name: ${w.firstName}, Last Name: ${w.lastName}"
    }
}

class Widget {
    String firstName
    String lastName
}
