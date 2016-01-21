import com.atomicscala.AtomicTest._

val charVector = Vector('d', 'a', 'b', 'c')
val intVector = Vector(1, 2, 3, -2)

charVector.sorted is Vector('a', 'b', 'c', 'd')
intVector.sorted is Vector(-2, 1, 2, 3)

charVector.min is 'a'
charVector.max is 'd'

intVector.min is -2
intVector.max is 3

def spacer[E](v: Vector[E]):String = {
  var result = ""
  for(e <- v.init) {
    result = result + e + " "
  }
  result = result + v.last
  result
}

println(spacer(charVector))
println(spacer(intVector))
