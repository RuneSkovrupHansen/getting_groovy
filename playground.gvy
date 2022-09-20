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


