// Dynamic typing for variables
var = "John Doe"
println var
println "Type of var: " + var.getClass()

var = 5
println var
println "Type of var: " + var.getClass()

String explicit_var = "John Doe"

// The following statement would cause an error since the variable is explicitly typed
// explicit_var = 5

// Inclusive loop
0.upto(4) { println "Looping, index: $it"}

// Exclusive, zero-based
5.times {
    println "Looping again, index: " + it
}

my_list = []

10.times {
    my_list.add(it)
}


0.upto(my_list.size()-1) {
    if (it % 2 == 0) {
        println "Looping through list, index: $it"
    }
}

my_map = [element_1: "Coca", element_2: "Cola"]

key = "element_1"
if (my_map.containsKey(key)) {
    println my_map.get(key)
}

key = "element_2"
if (my_map.containsKey(key)) {
    println my_map.get(key)
}

def myClosure = {
    return "So I'm a piece of code wrapped as an object, like what a first-class function?"
}

3.times {
    println myClosure()
}

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
