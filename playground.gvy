// Map
def server_requests = [:]

server_requests.put("server_1", 0)
server_requests.put("server_2", 0)
server_requests.put("server_3", 0)

no_requests = 100

no_requests.times {
    if (it % 5 == 0) {
        key = "server_1"
    } else if (it % 2 == 0) {
        key = "server_2"
    } else {
        key = "server_3"
    }
    server_requests[key] = server_requests[key]+1
}

// .each{} to iterate through each element of a list
server_requests.keySet().each {
    println "$it, requests: ${server_requests.get(it)}"
}

// Ranges
def range = 0..9
range.forEach {
    println "Range loop, index: $it"
}

(0..9).forEach {
    println "Range compressed loop, index: $it"
}

def awesome_function(how_aresome) {
    how_aresome.times {
        println "Awesome"
    }
}

awesome_function(5)
