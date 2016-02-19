UrlMapping contains the following:

```
/rest/user/$firstName/update"(controller: 'demo', action: 'index')
```

DemoController.groovy:

```
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
```

The following behavior does not surprise anyone:

```
curl http://localhost:8080/paramsandbody/rest/user/jeff/update 
First Name: jeff, Last Name: null
```

Some folks have asked for this to behave differently:

```
curl http://localhost:8080/paramsandbody/rest/user/jeff/update -H "Content-Type: application/json" -d '{"lastName":"brown"}'
First Name: null, Last Name: brown
```

Same with this:

```
curl http://localhost:8080/paramsandbody/rest/user/jeff/update -H "Content-Type: application/json" -d '{"firstName":"Zack","lastName":"Brown"}'
First Name: Zack, Last Name: Brown
```
