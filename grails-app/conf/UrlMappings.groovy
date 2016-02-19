class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

		"/rest/user/$firstName/update"(controller: 'demo', action: 'index')

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
