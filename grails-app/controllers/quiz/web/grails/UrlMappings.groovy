package quiz.web.grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/"(view: "/usuario/crearUsuario")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
