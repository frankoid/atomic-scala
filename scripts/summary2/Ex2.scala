import com.atomicscala.AtomicTest._

val charVector = Vector('d', 'a', 'b', 'c')
val intVector = Vector(1, 2, 3, -2)
val stringVector = Vector("Muddy", "out", "there")

val allVectors = Vector(charVector, intVector, stringVector)

def spaceSeparate2Levels(outerVector: Vector[Vector[Any]]) = {
  var result = ""
  for (innerVector <- outerVector) {
    for (e <- innerVector) {
      result = result + e + " "
    }
  }
  result
}

spaceSeparate2Levels(allVectors) is "d a b c 1 2 3 -2 Muddy out there "
